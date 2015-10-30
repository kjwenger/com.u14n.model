/**
 *
 */
package com.u14n.model.user.bean;

import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.u14n.model.person.Person;
import com.u14n.model.person.bean.PersonBean;
import com.u14n.model.user.Group;
import com.u14n.model.user.User;

/**
 * @author Klaus Wenger
 */
public class UserBean implements User, Cloneable {
    /**
     *
     */
    public UserBean() {
        super();
    }
    /**
     * @param name
     * @param password
     */
    public UserBean(final String name) {
        this(name, null);
    }
    /**
     * @param name
     * @param password
     */
    public UserBean(final String name, final String password) {
        super();
        validateName(name);
        this.name = name;
        this.password = password;
    }
    /**
     * @param user
     */
    public UserBean(final User user) {
        this(user.getName(), user.getPassword());
        this.personBean = new PersonBean(user.getPerson());
    }
    /* (non-Javadoc)
     * @see java.lang.Object#clone()
     */
    @Override
    public Object clone() {
        final UserBean clone = new UserBean(this.name, this.password);
        clone.email = this.email;
        clone.personBean = this.personBean != null
                ? (PersonBean) this.personBean.clone()
                : null;
        return clone;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.user.User#getName()
     */
    public String getName() {
        return this.name;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.user.User#setName(java.lang.String)
     */
    public void setName(final String name) {
        validateName(name);
        this.name = name;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.user.User#checkPassword(java.lang.String)
     */
    public boolean checkPassword(final String givenPassword) {
        return this.password == null
            ? givenPassword == null
            : this.password.equals(givenPassword);
    }
    /* (non-Javadoc)
     *
     * @todo Remove and re-think how to map ORMs.
     * @see com.u14n.model.user.User#getPassword()
     */
    public String getPassword() {
        return this.password;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.user.User#setPassword(java.lang.String)
     */
    public void setPassword(final String newPassword) throws PropertyVetoException {
                                                                                //System.out.println("<OUT> " + getClass().getName() + ".setPassword() this.password=" + this.password);
        this.password = newPassword;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.user.User#getEmail()
     */
    public String getEmail() {
        return this.email;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.user.User#setEmail(java.lang.String)
     */
    public void setEmail(final String email) {
        this.email = email;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.user.User#getPerson()
     */
    public Person getPerson() {
        return getPersonBean();
    }
    /**
     * @param name
     */
    protected void validateName(final String name) {
        validateNameChange();
        validateNullName(name);
        validateBlankName(name);
    }
    /**
     * @param name
     */
    protected void validateBlankName(final String name) {
        if (name == null) {
            // Not this method's job to check null
            return;
        }
        if (name.length() == 0) {
            throw new IllegalArgumentException(
                    "Cannot set blank user name");
        }
    }
    /**
     * @param name
     */
    protected void validateNullName(final String name) {
        if (name == null) {
            throw new IllegalArgumentException(
                    "Cannot set user name to null");
        }
    }
    /**
     *
     */
    protected void validateNameChange() {
        if (this.name != null) {
            throw new UnsupportedOperationException(
                    "Cannot modify user name once set");
        }
    }
    /**
     * @return
     */
    protected PersonBean getPersonBean() {
        if (this.personBean == null) {
            this.personBean = new PersonBean();
        }
        return this.personBean;
    }
    /**
     * @param personBean
     */
    protected void setPersonBean(final PersonBean personBean) {
        this.personBean = personBean;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.user.User#getGroups()
     */
    public Collection<? extends Group> getGroups() {
        return getGroupBeans();
    }
    /**
     * @return
     */
    protected Collection<GroupBean> getGroupBeans() {
        if (this.groupBeans == null) {
            this.groupBeans = new ArrayList<GroupBean>();
        }
        return this.groupBeans;
    }
    /**
     * @param groupBeans
     */
    protected void setGroupBeans(final Collection<GroupBean> groupBeans) {
        this.groupBeans = groupBeans;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((this.email == null) ? 0 : this.email.hashCode());
        result = prime * result
                + ((this.groupBeans == null) ? 0 : this.groupBeans.hashCode());
        result = prime * result
                + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result
                + ((this.password == null) ? 0 : this.password.hashCode());
        result = prime * result
                + ((this.personBean == null) ? 0 : this.personBean.hashCode());
        return result;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof UserBean)) {
            return false;
        }
        final UserBean other = (UserBean) obj;
        if (this.email == null) {
            if (other.email != null) {
                return false;
            }
        } else if (!this.email.equals(other.email)) {
            return false;
        }
        if (this.groupBeans == null) {
            if (other.groupBeans != null) {
                return false;
            }
        } else if (!this.groupBeans.equals(other.groupBeans)) {
            return false;
        }
        if (this.name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!this.name.equals(other.name)) {
            return false;
        }
        if (this.password == null) {
            if (other.password != null) {
                return false;
            }
        } else if (!this.password.equals(other.password)) {
            return false;
        }
        if (this.personBean == null) {
            if (other.personBean != null) {
                return false;
            }
        } else if (!this.personBean.equals(other.personBean)) {
            return false;
        }
        return true;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final int maxLen = 3;
        final StringBuilder builder = new StringBuilder();
        builder.append("UserBean [");
        if (this.email != null) {
            builder.append("email=").append(this.email).append(", ");
        }
        if (this.groupBeans != null) {
            builder.append("groupBeans=").append(
                    this.toString(this.groupBeans, maxLen)).append(", ");
        }
        if (this.name != null) {
            builder.append("name=").append(this.name).append(", ");
        }
        if (this.password != null) {
            builder.append("password=").append(this.password).append(", ");
        }
        if (this.personBean != null) {
            builder.append("personBean=").append(this.personBean);
        }
        builder.append("]");
        return builder.toString();
    }
    private String toString(final Collection<?> collection, final int maxLen) {
        final StringBuilder builder = new StringBuilder();
        builder.append("[");
        int i = 0;
        for (final Iterator<?> iterator = collection.iterator(); iterator.hasNext()
                && (i < maxLen); i++) {
            if (i > 0) {
                builder.append(", ");
            }
            builder.append(iterator.next());
        }
        builder.append("]");
        return builder.toString();
    }

    private String name;
    private String password;
    private String email;
    private PersonBean personBean;
    private Collection<GroupBean> groupBeans;
}
