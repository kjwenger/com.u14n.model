/**
 *
 */
package com.u14n.model.address.bean;

import com.u14n.model.address.Address;

/**
 * @author Klaus Wenger
 */
public abstract class AddressBean implements Address {
    /**
     *
     */
    protected AddressBean() {
        super();
    }
    /**
     * @param description
     * @param country
     * @param state
     * @param city
     * @param zipCode
     * @param phone
     * @param fax
     */
    protected AddressBean(final String description,
            final String country, final String state,
            final String city, final String zipCode,
            final String phone, final String fax) {
        super();
        this.description = description;
        this.country = country;
        this.state = state;
        this.city = city;
        this.zipCode = zipCode;
        this.phone = phone;
        this.fax = fax;
    }
    /**
     * @param address
     */
    protected AddressBean(final Address address) {
        super();
        if (address != null) {
            this.description = address.getDescription();
            this.country = address.getCountry();
            this.state = address.getState();
            this.city = address.getCity();
            this.zipCode = address.getZipCode();
            this.phone = address.getPhone();
            this.fax = address.getFax();
        }
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.Address#getDescription()
     */
    public String getDescription() {
        return this.description;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.Address#setDescription(java.lang.String)
     */
    public void setDescription(final String description) {
        this.description = description;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.Address#getCountry()
     */
    public String getCountry() {
        return this.country;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.Address#setCountry(java.lang.String)
     */
    public void setCountry(final String country) {
        this.country = country;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.Address#getState()
     */
    public String getState() {
        return this.state;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.Address#setState(java.lang.String)
     */
    public void setState(final String state) {
        this.state = state;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.Address#getCity()
     */
    public String getCity() {
        return this.city;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.Address#setCity(java.lang.String)
     */
    public void setCity(final String city) {
        this.city = city;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.Address#getZipCode()
     */
    public String getZipCode() {
        return this.zipCode;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.Address#setZipCode(java.lang.String)
     */
    public void setZipCode(final String zipCode) {
        this.zipCode = zipCode;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.Address#getPhone()
     */
    public String getPhone() {
        return this.phone;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.Address#setPhone(java.lang.String)
     */
    public void setPhone(final String homePhone) {
        this.phone = homePhone;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.Address#getFax()
     */
    public String getFax() {
        return this.fax;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.Address#setFax(java.lang.String)
     */
    public void setFax(final String fax) {
        this.fax = fax;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((this.city == null) ? 0 : this.city.hashCode());
        result = prime * result
                + ((this.country == null) ? 0 : this.country.hashCode());
        result = prime
                * result
                + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result
                + ((this.fax == null) ? 0 : this.fax.hashCode());
        result = prime * result
                + ((this.phone == null) ? 0 : this.phone.hashCode());
        result = prime * result
                + ((this.state == null) ? 0 : this.state.hashCode());
        result = prime * result
                + ((this.zipCode == null) ? 0 : this.zipCode.hashCode());
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
        if (!(that instanceof AddressBean)) {
            return false;
        }
        final AddressBean thatAddressBean = (AddressBean) that;
        if (this.city == null) {
            if (thatAddressBean.city != null) {
                return false;
            }
        } else if (!this.city.equals(thatAddressBean.city)) {
            return false;
        }
        if (this.country == null) {
            if (thatAddressBean.country != null) {
                return false;
            }
        } else if (!this.country.equals(thatAddressBean.country)) {
            return false;
        }
        if (this.description == null) {
            if (thatAddressBean.description != null) {
                return false;
            }
        } else if (!this.description.equals(thatAddressBean.description)) {
            return false;
        }
        if (this.fax == null) {
            if (thatAddressBean.fax != null) {
                return false;
            }
        } else if (!this.fax.equals(thatAddressBean.fax)) {
            return false;
        }
        if (this.phone == null) {
            if (thatAddressBean.phone != null) {
                return false;
            }
        } else if (!this.phone.equals(thatAddressBean.phone)) {
            return false;
        }
        if (this.state == null) {
            if (thatAddressBean.state != null) {
                return false;
            }
        } else if (!this.state.equals(thatAddressBean.state)) {
            return false;
        }
        if (this.zipCode == null) {
            if (thatAddressBean.zipCode != null) {
                return false;
            }
        } else if (!this.zipCode.equals(thatAddressBean.zipCode)) {
            return false;
        }
        return true;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString(final StringBuilder builder) {
        if (this.city != null) {
            builder.append("city=").append(this.city).append(", ");
        }
        if (this.country != null) {
            builder.append("country=").append(this.country).append(", ");
        }
        if (this.description != null) {
            builder.append("description=").append(this.description)
                    .append(", ");
        }
        if (this.fax != null) {
            builder.append("fax=").append(this.fax).append(", ");
        }
        if (this.phone != null) {
            builder.append("phone=").append(this.phone).append(", ");
        }
        if (this.state != null) {
            builder.append("state=").append(this.state).append(", ");
        }
        if (this.zipCode != null) {
            builder.append("zipCode=").append(this.zipCode);
        }
        builder.append("]");
        return builder.toString();
    }

    private String description;
    private String country;
    private String state;
    private String city;
    private String zipCode;
    private String phone;
    private String fax;
}
