/**
 *
 */
package com.u14n.model.person.bean;

import java.util.Date;
import java.util.Locale;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.u14n.model.address.SimpleAddress;
import com.u14n.model.address.bean.SimpleAddressBean;

/**
 * @author Klaus Wenger
 */
public class PersonBeanTest extends TestCase {
    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        this.klausWenger = new PersonBean();
        this.klausWenger.setFirstName(PersonBeanTest.KLAUS);
        this.klausWenger.setMiddleName(PersonBeanTest.JOSEF);
        this.klausWenger.setLastName(PersonBeanTest.WENGER);
        this.klausWenger.setDateOfBirth(PersonBeanTest.KLAUS_WENGER_BIRTHDAY);

        this.kjwengerHome = new SimpleAddressBean();
        this.kjwengerHome.setCity(PersonBeanTest.RALEIGH);
        this.kjwengerHome.setCountry(Locale.US.getCountry());
        this.kjwengerHome.setLine1(PersonBeanTest._2508_TADLEY_CT);
        this.kjwengerHome.setPhone(PersonBeanTest._919_809_6919);
        this.kjwengerHome.setState(PersonBeanTest.NC);
        this.kjwengerHome.setZipCode(PersonBeanTest._27603);
    }
    /* (non-Javadoc)
     * @see junit.framework.TestCase#tearDown()
     */
    @Override
    protected void tearDown() throws Exception {
        this.klausWenger = null;
        super.tearDown();
    }
    /**
     * Test method for {@link com.u14n.model.person.bean.PersonBean#PersonBean()}.
     */
    public final void testPersonBean() {
        final PersonBean personBean = new PersonBean();
        Assert.assertNull(personBean.getFirstName());
        Assert.assertNull(personBean.getMiddleName());
        Assert.assertNull(personBean.getLastName());
        Assert.assertNull(personBean.getDateOfBirth());
    }
    /**
     * Test method for {@link com.u14n.model.person.bean.PersonBean#PersonBean(com.u14n.model.person.Person)}.
     */
    public final void testPersonBeanPerson() {
        PersonBean personBean = new PersonBean(null);
        Assert.assertNull(personBean.getFirstName());
        Assert.assertNull(personBean.getMiddleName());
        Assert.assertNull(personBean.getLastName());
        Assert.assertNull(personBean.getDateOfBirth());

        personBean = new PersonBean(this.klausWenger);
        Assert.assertNotNull(personBean.getFirstName());
        Assert.assertNotNull(personBean.getMiddleName());
        Assert.assertNotNull(personBean.getLastName());
        Assert.assertNotNull(personBean.getDateOfBirth());
        Assert.assertEquals(this.klausWenger, personBean);
    }
    /**
     * Test method for {@link com.u14n.model.person.bean.PersonBean#clone()}.
     */
    public final void testClone() {
        Assert.assertTrue("PersonBean should be Cloneable", //$NON-NLS-1$
                this.klausWenger instanceof Cloneable);
        final PersonBean clone = (PersonBean) this.klausWenger.clone();
        Assert.assertNotNull(clone.getFirstName());
        Assert.assertNotNull(clone.getMiddleName());
        Assert.assertNotNull(clone.getLastName());
        Assert.assertNotNull(clone.getDateOfBirth());
        Assert.assertEquals(this.klausWenger, clone);
        Assert.assertTrue("Clone should be Cloneable", //$NON-NLS-1$
                clone instanceof Cloneable);
    }
    /**
     * Test method for {@link com.u14n.model.person.bean.PersonBean#getFirstName()}.
     */
    public final void testGetFirstName() {
        Assert.assertEquals(PersonBeanTest.KLAUS,
                this.klausWenger.getFirstName());
    }
    /**
     * Test method for {@link com.u14n.model.person.bean.PersonBean#setFirstName(java.lang.String)}.
     */
    public final void testSetFirstName() {
        this.klausWenger.setFirstName(PersonBeanTest.CLAUS);
        Assert.assertEquals(PersonBeanTest.CLAUS,
                this.klausWenger.getFirstName());
    }
    /**
     * Test method for {@link com.u14n.model.person.bean.PersonBean#getLastName()}.
     */
    public final void testGetLastName() {
        Assert.assertEquals(PersonBeanTest.WENGER,
                this.klausWenger.getLastName());
    }
    /**
     * Test method for {@link com.u14n.model.person.bean.PersonBean#setLastName(java.lang.String)}.
     */
    public final void testSetLastName() {
        this.klausWenger.setLastName(PersonBeanTest.WANKER);
        Assert.assertEquals(PersonBeanTest.WANKER,
                this.klausWenger.getLastName());
    }
    /**
     * Test method for {@link com.u14n.model.person.bean.PersonBean#getMiddleName()}.
     */
    public final void testGetMiddleName() {
        Assert.assertEquals(PersonBeanTest.JOSEF,
                this.klausWenger.getMiddleName());
    }
    /**
     * Test method for {@link com.u14n.model.person.bean.PersonBean#setMiddleName(java.lang.String)}.
     */
    public final void testSetMiddleName() {
        this.klausWenger.setMiddleName(PersonBeanTest.J);
        Assert.assertEquals(PersonBeanTest.J,
                this.klausWenger.getMiddleName());
    }
    /**
     * Test method for {@link com.u14n.model.person.bean.PersonBean#getDateOfBirth()}.
     */
    public final void testGetDateOfBirth() {
        Assert.assertEquals(PersonBeanTest.KLAUS_WENGER_BIRTHDAY,
                this.klausWenger.getDateOfBirth());
    }
    /**
     * Test method for {@link com.u14n.model.person.bean.PersonBean#setDateOfBirth(java.util.Date)}.
     */
    public final void testSetDateOfBirth() {
        final Date newDateOfBirth = new Date(1970, 4, 12);
        this.klausWenger.setDateOfBirth(newDateOfBirth);
        final Date dateOfBirth = this.klausWenger.getDateOfBirth();
        Assert.assertEquals(newDateOfBirth, dateOfBirth);
    }
    /**
     * Test method for {@link com.u14n.model.person.bean.PersonBean#getAddress()}.
     */
    public final void testGetAddress() {
        final SimpleAddress address = this.klausWenger.getAddress();
        Assert.assertNotNull(address);
    }
    /**
     * Test method for {@link com.u14n.model.person.bean.PersonBean#getAddressBean()}.
     */
    public final void testGetAddressBean() {
        final SimpleAddressBean addressBean = this.klausWenger.getAddressBean();
        Assert.assertNotNull(addressBean);
        final SimpleAddress address = this.klausWenger.getAddress();
        Assert.assertNotNull(address);
        Assert.assertEquals(address, addressBean);
    }
    /**
     * Test method for {@link com.u14n.model.person.bean.PersonBean#setAddressBean(com.u14n.model.address.bean.SimpleAddressBean)}.
     */
    public final void testSetAddressBean() {
        this.klausWenger.setAddressBean(this.kjwengerHome);
        final SimpleAddressBean addressBean = this.klausWenger.getAddressBean();
        Assert.assertNotNull(addressBean);
        Assert.assertEquals(this.kjwengerHome, addressBean);
        final SimpleAddress address = this.klausWenger.getAddress();
        Assert.assertNotNull(address);
        Assert.assertEquals(this.kjwengerHome, address);
    }

    private PersonBean klausWenger;
    private SimpleAddressBean kjwengerHome;

    private static final String WENGER = "Wenger"; //$NON-NLS-1$
    private static final String WANKER = "Wanker"; //$NON-NLS-1$
    private static final String JOSEF = "Josef"; //$NON-NLS-1$
    private static final String J = "J"; //$NON-NLS-1$
    private static final String KLAUS = "Klaus"; //$NON-NLS-1$
    private static final String CLAUS = "Claus"; //$NON-NLS-1$
    private static final Date KLAUS_WENGER_BIRTHDAY = new Date(1965, 3 - 1, 2);
    private static final String _27603 = "27603"; //$NON-NLS-1$
    private static final String NC = "NC"; //$NON-NLS-1$
    private static final String _919_809_6919 = "(919) 809-6919"; //$NON-NLS-1$
    private static final String _2508_TADLEY_CT = "2508 Tadley Ct"; //$NON-NLS-1$
    private static final String RALEIGH = "Raleigh"; //$NON-NLS-1$
}
