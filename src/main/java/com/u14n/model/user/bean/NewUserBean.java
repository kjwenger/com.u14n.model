package com.u14n.model.user.bean;

import java.util.Date;

import com.u14n.model.address.SimpleAddress;
import com.u14n.model.person.Person;
import com.u14n.model.user.User;

/**
 * @author Klaus Wenger
 */
public class NewUserBean extends UserBean {
    /**
     *
     */
    public NewUserBean() {
        super();
    }
    /**
     * @param name
     * @param password
     */
    public NewUserBean(final String name) {
        super(name);
    }
    /**
     * @param name
     * @param password
     */
    public NewUserBean(final String name, final String password) {
        super(name, password);
    }
    /**
     * @param user
     */
    public NewUserBean(final User user) {
        super(user);
    }
    /**
     * @return
     */
    public String getConfirmPassword() {
        return this.confirmPassword;
    }
    /**
     * @param confirmPassword
     */
    public void setConfirmPassword(final String confirmPassword) {
        this.confirmPassword = confirmPassword;
                                                                                //System.out.println("<OUT> " + getClass().getName() + ".setConfirmPassword() this.confirmPassword=" + this.confirmPassword);
        validateConfirmPassword();
    }
    /**
     *
     */
    protected void validateConfirmPassword() {
        boolean validated = false;
                                                                                //System.out.println("<OUT> " + getClass().getName() + ".validateConfirmPassword() super.getPassword()=" + super.getPassword());
                                                                                //System.out.println("<OUT> " + getClass().getName() + ".validateConfirmPassword() this.confirmPassword=" + this.confirmPassword);
        if (super.getPassword() == null) {
            if (this.confirmPassword == null) {
                validated = true;
            }
        } else if (super.getPassword().equals(this.confirmPassword)) {
            validated = true;
        }
        if (!validated) {
            final IllegalArgumentException illegalArgumentException =
                new IllegalArgumentException("Passwords do not match");
                                                                                //illegalArgumentException.printStackTrace();
            throw illegalArgumentException;
        }
    }
    /* (non-Javadoc)
     * @see com.u14n.model.user.bean.UserBean#validateNameChange()
     */
    @Override
    protected void validateNameChange() { /* Allow for name change */ }

    private String confirmPassword;

    /**
     * @author Klaus Wenger
     */
    public static class Flat extends NewUserBean
        implements Person, SimpleAddress{
        /**
         *
         */
        public Flat() {
            super();
        }
        /**
         * @param name
         * @param password
         */
        public Flat(final String name, final String password) {
            super(name, password);
        }
        /**
         * @param name
         */
        public Flat(final String name) {
            super(name);
        }
        /**
         * @param user
         */
        public Flat(final User user) {
            super(user);
        }
        /* (non-Javadoc)
         * @see com.u14n.model.person.Person#getAddress()
         */
        public SimpleAddress getAddress() {
            return getPerson().getAddress();
        }
        /* (non-Javadoc)
         * @see com.u14n.model.person.Person#getDateOfBirth()
         */
        public Date getDateOfBirth() {
            return getPerson().getDateOfBirth();
        }
        /* (non-Javadoc)
         * @see com.u14n.model.person.Person#getFirstName()
         */
        public String getFirstName() {
            return Flat.guardNull(getPerson().getFirstName());
        }
        /* (non-Javadoc)
         * @see com.u14n.model.person.Person#getLastName()
         */
        public String getLastName() {
            return Flat.guardNull(getPerson().getLastName());
        }
        /* (non-Javadoc)
         * @see com.u14n.model.person.Person#getMiddleName()
         */
        public String getMiddleName() {
            return Flat.guardNull(getPerson().getMiddleName());
        }
        /* (non-Javadoc)
         * @see com.u14n.model.person.Person#setDateOfBirth(java.util.Date)
         */
        public void setDateOfBirth(final Date birthday) {
            getPerson().setDateOfBirth(birthday);
        }
        /* (non-Javadoc)
         * @see com.u14n.model.person.Person#setFirstName(java.lang.String)
         */
        public void setFirstName(final String firstName) {
            getPerson().setFirstName(firstName);
        }
        /* (non-Javadoc)
         * @see com.u14n.model.person.Person#setLastName(java.lang.String)
         */
        public void setLastName(final String lastName) {
            getPerson().setLastName(lastName);
        }
        /* (non-Javadoc)
         * @see com.u14n.model.person.Person#setMiddleName(java.lang.String)
         */
        public void setMiddleName(final String middleName) {
            getPerson().setMiddleName(middleName);
        }
        /* (non-Javadoc)
         * @see com.u14n.model.address.SimpleAddress#getLine1()
         */
        public String getLine1() {
            return Flat.guardNull(getAddress().getLine1());
        }
        /* (non-Javadoc)
         * @see com.u14n.model.address.SimpleAddress#getLine2()
         */
        public String getLine2() {
            return Flat.guardNull(getAddress().getLine2());
        }
        /* (non-Javadoc)
         * @see com.u14n.model.address.SimpleAddress#setLine1(java.lang.String)
         */
        public void setLine1(final String line1) {
            getAddress().setLine1(line1);
        }
        /* (non-Javadoc)
         * @see com.u14n.model.address.SimpleAddress#setLine2(java.lang.String)
         */
        public void setLine2(final String line2) {
            getAddress().setLine2(line2);
        }
        /* (non-Javadoc)
         * @see com.u14n.model.address.Address#getCity()
         */
        public String getCity() {
            return Flat.guardNull(getAddress().getCity());
        }
        /* (non-Javadoc)
         * @see com.u14n.model.address.Address#getZipCode()
         */
        public String getZipCode() {
            return Flat.guardNull(getAddress().getZipCode());
        }
        /* (non-Javadoc)
         * @see com.u14n.model.address.Address#getCountry()
         */
        public String getCountry() {
            return Flat.guardNull(getAddress().getCountry());
        }
        /* (non-Javadoc)
         * @see com.u14n.model.address.Address#getDescription()
         */
        public String getDescription() {
            return Flat.guardNull(getAddress().getDescription());
        }
        /* (non-Javadoc)
         * @see com.u14n.model.address.Address#getFax()
         */
        public String getFax() {
            return Flat.guardNull(getAddress().getFax());
        }
        /* (non-Javadoc)
         * @see com.u14n.model.address.Address#getPhone()
         */
        public String getPhone() {
            return Flat.guardNull(getAddress().getPhone());
        }
        /* (non-Javadoc)
         * @see com.u14n.model.address.Address#setCountry(java.lang.String)
         */
        public void setCountry(final String country) {
            getAddress().setCountry(country);
        }
        /* (non-Javadoc)
         * @see com.u14n.model.address.Address#getState()
         */
        public String getState() {
            return Flat.guardNull(getAddress().getState());
        }
        /* (non-Javadoc)
         * @see com.u14n.model.address.Address#setCity(java.lang.String)
         */
        public void setCity(final String city) {
            getAddress().setCity(city);
        }
        /* (non-Javadoc)
         * @see com.u14n.model.address.Address#setZipCode(java.lang.String)
         */
        public void setZipCode(final String zipCode) {
            getAddress().setZipCode(zipCode);
        }
        /* (non-Javadoc)
         * @see com.u14n.model.address.Address#setDescription(java.lang.String)
         */
        public void setDescription(final String description) {
            getAddress().setDescription(description);
        }
        /* (non-Javadoc)
         * @see com.u14n.model.address.Address#setFax(java.lang.String)
         */
        public void setFax(final String fax) {
            getAddress().setFax(fax);
        }
        /* (non-Javadoc)
         * @see com.u14n.model.address.Address#setPhone(java.lang.String)
         */
        public void setPhone(final String phone) {
            getAddress().setPhone(phone);
        }
        /* (non-Javadoc)
         * @see com.u14n.model.address.Address#setState(java.lang.String)
         */
        public void setState(final String state) {
            getAddress().setState(state);
        }

        /**
         * @param string
         * @return
         */
        private static String guardNull(final String string) {
            return string != null ? string : "";
        }
   }
}