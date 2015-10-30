package com.u14n.model.user.bean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.u14n.model.user.Group;
import com.u14n.model.user.User;

/**
 * @author Klaus Wenger
 * @since Mar 6, 2010 7:28:40 PM
 */
public class GroupBean implements Group, Cloneable {
    /**
     *
     */
    public GroupBean() {
        super();
        this.name = null;
    }
    /**
     * @param name
     */
    public GroupBean(final String name) {
        super();
        validateName(name);
        this.name = name;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#clone()
     */
    @Override
    public Object clone() {
        final GroupBean clone = new GroupBean(this.name);
        return clone;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.user.Group#getName()
     */
    public String getName() {
        return this.name;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.user.Group#setName(java.lang.String)
     */
    public void setName(final String name) {
        validateName(name);
        this.name = name;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.user.Group#getUsers()
     */
    public Collection<? extends User> getUsers() {
        return getUserBeans();
    }
    /**
     * @return
     */
    protected Collection<UserBean> getUserBeans() {
        if (this.userBeans == null) {
            this.userBeans = new ArrayList<UserBean>();
        }
        return this.userBeans;
    }
    /**
     * @param userBeans
     */
    protected void setUserBeans(final Collection<UserBean> userBeans) {
        this.userBeans = userBeans;
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
        if (name.length() == 0) {
            throw new IllegalArgumentException(
                    "Cannot set blank group name");
        }
    }
    /**
     * @param name
     */
    protected void validateNullName(final String name) {
        if (name == null) {
            throw new IllegalArgumentException(
                    "Cannot set group name to null");
        }
    }
    /**
     *
     */
    protected void validateNameChange() {
        if (this.name != null) {
            throw new UnsupportedOperationException(
                    "Cannot modify group name once set");
        }
    }
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result
                + ((this.userBeans == null) ? 0 : this.userBeans.hashCode());
        return result;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (!(that instanceof GroupBean)) {
            return false;
        }
        final GroupBean thatGroupBean = (GroupBean) that;
        if (this.name == null) {
            if (thatGroupBean.name != null) {
                return false;
            }
        } else if (!this.name.equals(thatGroupBean.name)) {
            return false;
        }
        if (this.userBeans == null) {
            if (thatGroupBean.userBeans != null) {
                return false;
            }
        } else if (!this.userBeans.equals(thatGroupBean.userBeans)) {
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
        builder.append("GroupBean [");
        if (this.name != null) {
            builder.append("name=").append(this.name).append(", ");
        }
        if (this.userBeans != null) {
            builder.append("userBeans=").append(
                    this.toString(this.userBeans, maxLen));
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
    private Collection<UserBean> userBeans;
}
