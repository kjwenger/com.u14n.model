/**
 *
 */
package com.u14n.model.address.bean;

import com.u14n.model.address.DetailedAddress;

/**
 * @author Klaus Wenger
 */
public class DetailedAddressBean extends AddressBean implements DetailedAddress {
    /**
     *
     */
    public DetailedAddressBean() {
        super();
    }
    /**
     * @param description
     * @param country
     * @param state
     * @param city
     * @param street
     * @param number
     * @param unit
     * @param additional
     * @param poBox
     * @param homePhone
     * @param workPhone
     * @param fax
     */
    public DetailedAddressBean(final String description,
            final String country, final String state,
            final String city, final String zipCode,
            final String street, final String number, final String unit,
            final String additional, final String poBox,
            final String homePhone, final String workPhone, final String fax) {
        super(description, country, state, city, zipCode, homePhone, fax);
        this.street = street;
        this.number = number;
        this.unit = unit;
        this.additional = additional;
        this.poBox = poBox;
        this.workPhone = workPhone;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.DetailedAddress#getStreet()
     */
    public String getStreet() {
        return this.street;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.DetailedAddress#setStreet(java.lang.String)
     */
    public void setStreet(final String street) {
        this.street = street;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.DetailedAddress#getNumber()
     */
    public String getNumber() {
        return this.number;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.DetailedAddress#setNumber(java.lang.String)
     */
    public void setNumber(final String number) {
        this.number = number;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.DetailedAddress#getUnit()
     */
    public String getUnit() {
        return this.unit;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.DetailedAddress#setUnit(java.lang.String)
     */
    public void setUnit(final String unit) {
        this.unit = unit;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.DetailedAddress#getAdditional()
     */
    public String getAdditional() {
        return this.additional;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.DetailedAddress#setAdditional(java.lang.String)
     */
    public void setAdditional(final String additional) {
        this.additional = additional;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.DetailedAddress#getPOBox()
     */
    public String getPOBox() {
        return this.poBox;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.DetailedAddress#setPOBox(java.lang.String)
     */
    public void setPOBox(final String poBox) {
        this.poBox = poBox;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.DetailedAddress#getHomePhone()
     */
    public String getHomePhone() {
        return getPhone();
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.DetailedAddress#setHomePhone(java.lang.String)
     */
    public void setHomePhone(final String homePhone) {
        setPhone(homePhone);
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.DetailedAddress#getWorkPhone()
     */
    public String getWorkPhone() {
        return this.workPhone;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.DetailedAddress#setWorkPhone(java.lang.String)
     */
    public void setWorkPhone(final String workPhone) {
        this.workPhone = workPhone;
    }

    private String street;
    private String number;
    private String unit;
    private String additional;
    private String poBox;
    private String workPhone;
}
