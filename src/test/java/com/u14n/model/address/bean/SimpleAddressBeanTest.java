/**
 *
 */
package com.u14n.model.address.bean;

import java.util.Locale;

import junit.framework.Assert;

/**
 * @author Klaus Wenger
 */
public class SimpleAddressBeanTest extends AddressBeanTest {
    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    @Override
    protected void setUp() throws Exception {
        super.addressBean = this.kjwengerHome = new SimpleAddressBean();
        super.setUp();
        this.kjwengerHome.setLine1(SimpleAddressBeanTest._2508_TADLEY_CT);
    }
    /* (non-Javadoc)
     * @see junit.framework.TestCase#tearDown()
     */
    @Override
    protected void tearDown() throws Exception {
        this.kjwengerHome = null;
        super.tearDown();
    }
    /**
     * Test method for {@link com.u14n.model.address.bean.SimpleAddressBean#SimpleAddressBean()}.
     */
    public final void testSimpleAddressBean() {
        final SimpleAddressBean simpleAddressBean = new SimpleAddressBean();
        Assert.assertNull(simpleAddressBean.getCity());
        Assert.assertNull(simpleAddressBean.getCountry());
        Assert.assertNull(simpleAddressBean.getDescription());
        Assert.assertNull(simpleAddressBean.getFax());
        Assert.assertNull(simpleAddressBean.getLine1());
        Assert.assertNull(simpleAddressBean.getLine2());
        Assert.assertNull(simpleAddressBean.getPhone());
        Assert.assertNull(simpleAddressBean.getState());
        Assert.assertNull(simpleAddressBean.getZipCode());
    }
    /**
     * Test method for {@link com.u14n.model.address.bean.SimpleAddressBean#SimpleAddressBean(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)}.
     */
    public final void testSimpleAddressBeanStringStringStringStringStringStringStringString() {
        final SimpleAddressBean simpleAddressBean = new SimpleAddressBean(
                AddressBeanTest.HOME,
                Locale.US.getCountry(), AddressBeanTest.NC,
                AddressBeanTest.RALEIGH, AddressBeanTest._27603,
                SimpleAddressBeanTest._2508_TADLEY_CT, null,
                AddressBeanTest._919_809_6919, null);
        Assert.assertEquals(AddressBeanTest.HOME,
                simpleAddressBean.getDescription());
        Assert.assertEquals(Locale.US.getCountry(),
                simpleAddressBean.getCountry());
        Assert.assertEquals(AddressBeanTest.NC,
                simpleAddressBean.getState());
        Assert.assertEquals(AddressBeanTest.RALEIGH,
                simpleAddressBean.getCity());
        Assert.assertEquals(SimpleAddressBeanTest._2508_TADLEY_CT,
                simpleAddressBean.getLine1());
        Assert.assertNull(simpleAddressBean.getLine2());
        Assert.assertEquals(AddressBeanTest._919_809_6919,
                simpleAddressBean.getPhone());
        Assert.assertNull(simpleAddressBean.getFax());
    }
    /**
     * Test method for {@link com.u14n.model.address.bean.SimpleAddressBean#SimpleAddressBean(com.u14n.model.address.SimpleAddress)}.
     */
    public final void testSimpleAddressBeanSimpleAddress() {
        final SimpleAddressBean simpleAddressBean =
            new SimpleAddressBean(this.kjwengerHome);
        Assert.assertEquals(this.kjwengerHome, simpleAddressBean);
        Assert.assertNull(simpleAddressBean.getDescription());
        Assert.assertEquals(Locale.US.getCountry(),
                simpleAddressBean.getCountry());
        Assert.assertEquals(AddressBeanTest.NC,
                simpleAddressBean.getState());
        Assert.assertEquals(AddressBeanTest.RALEIGH,
                simpleAddressBean.getCity());
        Assert.assertEquals(SimpleAddressBeanTest._2508_TADLEY_CT,
                simpleAddressBean.getLine1());
        Assert.assertNull(simpleAddressBean.getLine2());
        Assert.assertEquals(AddressBeanTest._919_809_6919,
                simpleAddressBean.getPhone());
        Assert.assertNull(simpleAddressBean.getFax());
    }
    /**
     * Test method for {@link com.u14n.model.address.bean.SimpleAddressBean#clone()}.
     */
    public final void testClone() {
        Assert.assertTrue("SimpleAddressBean should be Cloneable", //$NON-NLS-1$
                this.kjwengerHome instanceof Cloneable);
        final Object clone = this.kjwengerHome.clone();
        Assert.assertEquals(this.kjwengerHome, clone);
        Assert.assertTrue("Clone should be Cloneable", //$NON-NLS-1$
                clone instanceof Cloneable);
    }
    /**
     * Test method for {@link com.u14n.model.address.bean.SimpleAddressBean#getLine1()}.
     */
    public final void testGetLine1() {
        Assert.assertEquals(SimpleAddressBeanTest._2508_TADLEY_CT,
                this.kjwengerHome.getLine1());
    }
    /**
     * Test method for {@link com.u14n.model.address.bean.SimpleAddressBean#setLine1(java.lang.String)}.
     */
    public final void testSetLine1() {
        this.kjwengerHome.setLine1(SimpleAddressBeanTest._1234_W_HOLLAND_DR);
        Assert.assertEquals(SimpleAddressBeanTest._1234_W_HOLLAND_DR,
                this.kjwengerHome.getLine1());
    }
    /**
     * Test method for {@link com.u14n.model.address.bean.SimpleAddressBean#getLine2()}.
     */
    public final void testGetLine2() {
        Assert.assertNull(this.kjwengerHome.getLine2());
    }
    /**
     * Test method for {@link com.u14n.model.address.bean.SimpleAddressBean#setLine2(java.lang.String)}.
     */
    public final void testSetLine2() {
        this.kjwengerHome.setLine2(SimpleAddressBeanTest.SUITE_3425);
        Assert.assertEquals(SimpleAddressBeanTest.SUITE_3425,
                this.kjwengerHome.getLine2());
    }

    private SimpleAddressBean kjwengerHome;
    private static final String _2508_TADLEY_CT = "2508 Tadley Ct"; //$NON-NLS-1$
    private static final String _1234_W_HOLLAND_DR = "1234 W Holland Dr"; //$NON-NLS-1$
    private static final String SUITE_3425 = "Suite 3425"; //$NON-NLS-1$
}
