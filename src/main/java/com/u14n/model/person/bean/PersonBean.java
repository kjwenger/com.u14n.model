/**
 *
 */
package com.u14n.model.person.bean;

import java.util.Date;

import com.u14n.model.address.SimpleAddress;
import com.u14n.model.address.bean.SimpleAddressBean;
import com.u14n.model.person.Person;

/**
 * @author Klaus Wenger
 */
public class PersonBean implements Person, Cloneable {
    /**
     *
     */
    public PersonBean() {
        super();
    }
    /**
     * @param person
     */
    public PersonBean(final Person person) {
        super();
        if (person != null) {
            this.addressBean = new SimpleAddressBean(person.getAddress());
            this.dateOfBirth = (Date) person.getDateOfBirth().clone();
            this.firstName = person.getFirstName();
            this.lastName = person.getLastName();
            this.middleName = person.getMiddleName();
        }
    }
    /* (non-Javadoc)
     * @see java.lang.Object#clone()
     */
    @Override
    public Object clone() {
        final PersonBean clone = new PersonBean();
        clone.addressBean = this.addressBean != null
                ? (SimpleAddressBean) this.addressBean.clone()
                : null;
        clone.dateOfBirth = this.dateOfBirth != null
                ? (Date) this.dateOfBirth.clone()
                : null;
        clone.firstName = this.firstName;
        clone.lastName = this.lastName;
        clone.middleName = this.middleName;
        return clone;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.person.Person#getFirstName()
     */
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * @param firstName
     */
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.person.Person#getLastName()
     */
    public String getLastName() {
        return this.lastName;
    }
    /**
     * @param lastName
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.person.Person#getMiddleName()
     */
    public String getMiddleName() {
        return this.middleName;
    }
    /**
     * @param middleName
     */
    public void setMiddleName(final String middleName) {
        this.middleName = middleName;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.person.Person#getDateOfBirth()
     */
    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }
    /**
     * @param birthday
     */
    public void setDateOfBirth(final Date birthday) {
        this.dateOfBirth = birthday;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.person.Person#getAddress()
     */
    public SimpleAddress getAddress() {
        return getAddressBean();
    }
    /**
     * @return
     */
    protected SimpleAddressBean getAddressBean() {
        if (this.addressBean == null) {
            this.addressBean = new SimpleAddressBean();
        }
        return this.addressBean;
    }
    /**
     * @param addressBean
     */
    protected void setAddressBean(final SimpleAddressBean addressBean) {
        this.addressBean = addressBean;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime
                * result
                + ((this.addressBean == null) ? 0 : this.addressBean.hashCode());
        result = prime
                * result
                + ((this.dateOfBirth == null) ? 0 : this.dateOfBirth.hashCode());
        result = prime * result
                + ((this.firstName == null) ? 0 : this.firstName.hashCode());
        result = prime * result
                + ((this.lastName == null) ? 0 : this.lastName.hashCode());
        result = prime * result
                + ((this.middleName == null) ? 0 : this.middleName.hashCode());
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
        if (!(that instanceof PersonBean)) {
            return false;
        }
        final PersonBean thatPersonBean = (PersonBean) that;
        if (this.addressBean == null) {
            if (thatPersonBean.addressBean != null) {
                return false;
            }
        } else if (!this.addressBean.equals(thatPersonBean.addressBean)) {
            return false;
        }
        if (this.dateOfBirth == null) {
            if (thatPersonBean.dateOfBirth != null) {
                return false;
            }
        } else if (!this.dateOfBirth.equals(thatPersonBean.dateOfBirth)) {
            return false;
        }
        if (this.firstName == null) {
            if (thatPersonBean.firstName != null) {
                return false;
            }
        } else if (!this.firstName.equals(thatPersonBean.firstName)) {
            return false;
        }
        if (this.lastName == null) {
            if (thatPersonBean.lastName != null) {
                return false;
            }
        } else if (!this.lastName.equals(thatPersonBean.lastName)) {
            return false;
        }
        if (this.middleName == null) {
            if (thatPersonBean.middleName != null) {
                return false;
            }
        } else if (!this.middleName.equals(thatPersonBean.middleName)) {
            return false;
        }
        return true;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("PersonBean [");
        if (this.addressBean != null) {
            builder.append("addressBean=").append(this.addressBean)
                    .append(", ");
        }
        if (this.dateOfBirth != null) {
            builder.append("dateOfBirth=").append(this.dateOfBirth)
                    .append(", ");
        }
        if (this.firstName != null) {
            builder.append("firstName=").append(this.firstName).append(", ");
        }
        if (this.lastName != null) {
            builder.append("lastName=").append(this.lastName).append(", ");
        }
        if (this.middleName != null) {
            builder.append("middleName=").append(this.middleName);
        }
        builder.append("]");
        return builder.toString();
    }

    private String firstName;
    private String lastName;
    private String middleName;
    private Date dateOfBirth;
    private SimpleAddressBean addressBean;
}
