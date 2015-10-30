/**
 *
 */
package com.u14n.model.address.bean;

import com.u14n.model.address.SimpleAddress;

/**
 * @author Klaus Wenger
 */
public class SimpleAddressBean extends AddressBean
    implements SimpleAddress, Cloneable {
    /**
     *
     */
    public SimpleAddressBean() {
        super();
    }
    /**
     * @param description
     * @param country
     * @param state
     * @param city
     * @param zipCode
     * @param line1
     * @param line2
     * @param phone
     * @param fax
     */
    public SimpleAddressBean(final String description,
            final String country, final String state,
            final String city, final String zipCode,
            final String line1, final String line2,
            final String phone, final String fax) {
        super(description, country, state, city, zipCode, phone, fax);
        this.line1 = line1;
        this.line2 = line2;
    }
    /**
     * @param address
     */
    public SimpleAddressBean(final SimpleAddress address) {
        super(address);
        this.line1 = address.getLine1();
        this.line2 = address.getLine2();
    }
    /* (non-Javadoc)
     * @see java.lang.Object#clone()
     */
    @Override
    public Object clone() {
        final SimpleAddressBean clone = new SimpleAddressBean(getDescription(),
                getCountry(), getState(), getCity(), getZipCode(),
                this.line1, this.line2, getPhone(), getFax());
        return clone;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.SimpleAddress#getLine1()
     */
    public String getLine1() {
        return this.line1;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.SimpleAddress#setLine1(java.lang.String)
     */
    public void setLine1(final String line1) {
        this.line1 = line1;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.SimpleAddress#getLine2()
     */
    public String getLine2() {
        return this.line2;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.address.SimpleAddress#setLine2(java.lang.String)
     */
    public void setLine2(final String line2) {
        this.line2 = line2;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result
                + ((this.line1 == null) ? 0 : this.line1.hashCode());
        result = prime * result
                + ((this.line2 == null) ? 0 : this.line2.hashCode());
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
        if (!super.equals(that)) {
            return false;
        }
        if (!(that instanceof SimpleAddressBean)) {
            return false;
        }
        final SimpleAddressBean thatSimpleAddressBean =
            (SimpleAddressBean) that;
        if (this.line1 == null) {
            if (thatSimpleAddressBean.line1 != null) {
                return false;
            }
        } else if (!this.line1.equals(thatSimpleAddressBean.line1)) {
            return false;
        }
        if (this.line2 == null) {
            if (thatSimpleAddressBean.line2 != null) {
                return false;
            }
        } else if (!this.line2.equals(thatSimpleAddressBean.line2)) {
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
        builder.append("SimpleAddressBean [");
        if (this.line1 != null) {
            builder.append("line1=").append(this.line1).append(", ");
        }
        if (this.line2 != null) {
            builder.append("line2=").append(this.line2);
        }
        return super.toString(builder);
    }

    private String line1;
    private String line2;
}
