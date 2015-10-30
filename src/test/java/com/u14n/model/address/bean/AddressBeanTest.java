/**
 *
 */
package com.u14n.model.address.bean;

import java.util.Locale;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * @author Klaus Wenger
 */
public abstract class AddressBeanTest extends TestCase {
    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        this.addressBean.setCity(AddressBeanTest.RALEIGH);
        this.addressBean.setCountry(Locale.US.getCountry());
        this.addressBean.setPhone(AddressBeanTest._919_809_6919);
        this.addressBean.setState(AddressBeanTest.NC);
        this.addressBean.setZipCode(AddressBeanTest._27603);
    }
    /* (non-Javadoc)
     * @see junit.framework.TestCase#tearDown()
     */
    @Override
    protected void tearDown() throws Exception {
        this.addressBean = null;
        super.tearDown();
    }
    /**
     * Test method for {@link com.u14n.model.address.bean.AddressBean#getDescription()}.
     */
    public void testGetDescription() {
        Assert.assertNull(this.addressBean.getDescription());
    }
    /**
     * Test method for {@link com.u14n.model.address.bean.AddressBean#setDescription(java.lang.String)}.
     */
    public void testSetDescription() {
        this.addressBean.setDescription(AddressBeanTest.HOME);
        Assert.assertEquals(AddressBeanTest.HOME,
                this.addressBean.getDescription());
    }
    /**
     * Test method for {@link com.u14n.model.address.bean.AddressBean#getCountry()}.
     */
    public void testGetCountry() {
        Assert.assertEquals(Locale.US.getCountry(),
                this.addressBean.getCountry());
    }
    /**
     * Test method for {@link com.u14n.model.address.bean.AddressBean#setCountry(java.lang.String)}.
     */
    public void testSetCountry() {
        this.addressBean.setCountry(Locale.GERMANY.getCountry());
        Assert.assertEquals(Locale.GERMANY.getCountry(),
                this.addressBean.getCountry());
    }
    /**
     * Test method for {@link com.u14n.model.address.bean.AddressBean#getState()}.
     */
    public void testGetState() {
        Assert.assertEquals(AddressBeanTest.NC,
                this.addressBean.getState());
    }
    /**
     * Test method for {@link com.u14n.model.address.bean.AddressBean#setState(java.lang.String)}.
     */
    public void testSetState() {
        this.addressBean.setState(AddressBeanTest.GA);
        Assert.assertEquals(AddressBeanTest.GA,
                this.addressBean.getState());
    }
    /**
     * Test method for {@link com.u14n.model.address.bean.AddressBean#getCity()}.
     */
    public void testGetCity() {
        Assert.assertEquals(AddressBeanTest.RALEIGH,
                this.addressBean.getCity());
    }
    /**
     * Test method for {@link com.u14n.model.address.bean.AddressBean#setCity(java.lang.String)}.
     */
    public void testSetCity() {
        this.addressBean.setCity(AddressBeanTest.ATLANTA);
        Assert.assertEquals(AddressBeanTest.ATLANTA,
                this.addressBean.getCity());
    }
    /**
     * Test method for {@link com.u14n.model.address.bean.AddressBean#getZipCode()}.
     */
    public void testGetZipCode() {
        Assert.assertEquals(AddressBeanTest._27603,
                this.addressBean.getZipCode());
    }
    /**
     * Test method for {@link com.u14n.model.address.bean.AddressBean#setZipCode(java.lang.String)}.
     */
    public void testSetZipCode() {
        this.addressBean.setZipCode(AddressBeanTest._30301);
        Assert.assertEquals(AddressBeanTest._30301,
                this.addressBean.getZipCode());
    }
    /**
     * Test method for {@link com.u14n.model.address.bean.AddressBean#getPhone()}.
     */
    public void testGetPhone() {
        Assert.assertEquals(AddressBeanTest._919_809_6919,
                this.addressBean.getPhone());
    }
    /**
     * Test method for {@link com.u14n.model.address.bean.AddressBean#setPhone(java.lang.String)}.
     */
    public void testSetPhone() {
        this.addressBean.setPhone(AddressBeanTest._212_123_4567);
        Assert.assertEquals(AddressBeanTest._212_123_4567,
                this.addressBean.getPhone());
    }
    /**
     * Test method for {@link com.u14n.model.address.bean.AddressBean#getFax()}.
     */
    public void testGetFax() {
        Assert.assertNull(this.addressBean.getFax());
    }
    /**
     * Test method for {@link com.u14n.model.address.bean.AddressBean#setFax(java.lang.String)}.
     */
    public void testSetFax() {
        this.addressBean.setFax(AddressBeanTest._212_123_4567);
        Assert.assertEquals(AddressBeanTest._212_123_4567,
                this.addressBean.getFax());
    }

    protected AddressBean addressBean;
    protected static final String _27603 = "27603"; //$NON-NLS-1$
    protected static final String NC = "NC"; //$NON-NLS-1$
    protected static final String _919_809_6919 = "(919) 809-6919"; //$NON-NLS-1$
    protected static final String RALEIGH = "Raleigh"; //$NON-NLS-1$
    protected static final String HOME = "Home"; //$NON-NLS-1$
    protected static final String GA = "GA"; //$NON-NLS-1$
    protected static final String ATLANTA = "Atlanta"; //$NON-NLS-1$
    protected static final String _30301 = "30301"; //$NON-NLS-1$
    protected static final String _212_123_4567 = "212-123-4567"; //$NON-NLS-1$
}
