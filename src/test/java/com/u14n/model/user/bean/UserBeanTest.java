/**
 *
 */
package com.u14n.model.user.bean;

import java.beans.PropertyVetoException;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.u14n.model.person.Person;
import com.u14n.model.person.bean.PersonBean;
import com.u14n.model.user.Group;

/**
 * @author Klaus Wenger
 */
public class UserBeanTest extends TestCase {
    /**
     * Test method for {@link com.u14n.model.user.bean.UserBean#UserBean()}.
     */
    public void testUserBean() {
        final UserBean userBean = new UserBean();
        Assert.assertNull(userBean.getName());
        Assert.assertNull(userBean.getPassword());
        Assert.assertTrue(userBean.checkPassword(null));
        Assert.assertFalse(userBean.checkPassword(UserBeanTest.EMPTY));
        Assert.assertFalse(userBean.checkPassword(UserBeanTest.LUSDFHGLWEK));
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.UserBean#UserBean(java.lang.String)}.
     */
    public void testUserBeanString() {
        final UserBean userBean = new UserBean(UserBeanTest.KJWENGER);
        Assert.assertEquals(UserBeanTest.KJWENGER, userBean.getName());
        Assert.assertNull(userBean.getPassword());
        Assert.assertTrue(userBean.checkPassword(null));
        Assert.assertFalse(userBean.checkPassword(UserBeanTest.EMPTY));
        Assert.assertFalse(userBean.checkPassword(UserBeanTest.LUSDFHGLWEK));
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.UserBean#UserBean(java.lang.String, java.lang.String)}.
     */
    public void testUserBeanStringString() {
        UserBean userBean =
            new UserBean(UserBeanTest.KJWENGER, UserBeanTest.LUSDFHGLWEK);
        Assert.assertEquals(UserBeanTest.KJWENGER, userBean.getName());
        Assert.assertEquals(UserBeanTest.LUSDFHGLWEK, userBean.getPassword());
        Assert.assertFalse(userBean.checkPassword(null));
        Assert.assertFalse(userBean.checkPassword(UserBeanTest.EMPTY));
        Assert.assertTrue(userBean.checkPassword(UserBeanTest.LUSDFHGLWEK));

        userBean =
            new UserBean(UserBeanTest.DDROUJKOV, null);
        Assert.assertEquals(UserBeanTest.DDROUJKOV, userBean.getName());
        Assert.assertNull(userBean.getPassword());
        Assert.assertTrue(userBean.checkPassword(null));
        Assert.assertFalse(userBean.checkPassword(UserBeanTest.EMPTY));
        Assert.assertFalse(userBean.checkPassword(UserBeanTest.LUSDFHGLWEK));
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.UserBean#clone()}.
     */
    public void testClone() {
        Assert.assertTrue("UserBean should be Cloneable", //$NON-NLS-1$
                this.kjwenger instanceof Cloneable);
        final Object clone = this.kjwenger.clone();
        Assert.assertEquals(this.kjwenger, clone);
        Assert.assertTrue("Clone should be Cloneable", //$NON-NLS-1$
                clone instanceof Cloneable);
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.UserBean#getName()}.
     */
    public void testGetName() {
        Assert.assertEquals(UserBeanTest.DDROUJKOV, this.ddroujkov.getName());
        Assert.assertEquals(UserBeanTest.KJWENGER, this.kjwenger.getName());
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.UserBean#setName(java.lang.String)}.
     */
    public void testSetName() {
        UserBean userBean = new UserBean();
        userBean.setName(UserBeanTest.DDROUJKOV);
        Exception exception = null;
        try {
            userBean.setName(UserBeanTest.KJWENGER);
        } catch (final Exception e) {
            exception = e;
        }
        Assert.assertNotNull(
                "Re-setting the user name should fail", //$NON-NLS-1$
                exception);
        userBean = new UserBean(UserBeanTest.DDROUJKOV);
        exception = null;
        try {
            userBean.setName(UserBeanTest.KJWENGER);
        } catch (final Exception e) {
            exception = e;
        }
        Assert.assertNotNull(
                "Re-setting the user name should fail", //$NON-NLS-1$
                exception);
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.UserBean#checkPassword(java.lang.String)}.
     */
    public void testCheckPassword() {
        Assert.assertTrue(
                "ddroujkov should check against null password", //$NON-NLS-1$
                this.ddroujkov.checkPassword(null));
        Assert.assertFalse(
                "ddroujkov should not check against blank password", //$NON-NLS-1$
                this.ddroujkov.checkPassword(UserBeanTest.EMPTY));
        Assert.assertFalse(
                "ddroujkov should not check against password: " //$NON-NLS-1$
            + UserBeanTest.LUSDFHGLWEK,
                this.ddroujkov.checkPassword(UserBeanTest.LUSDFHGLWEK));

        Assert.assertFalse(
                "kjwenger should not check against null password", //$NON-NLS-1$
                this.kjwenger.checkPassword(null));
        Assert.assertFalse(
                "kjwenger should not check against blank password", //$NON-NLS-1$
                this.kjwenger.checkPassword(UserBeanTest.EMPTY));
        Assert.assertTrue(
                "kjwenger should check against password: " //$NON-NLS-1$
                + UserBeanTest.LUSDFHGLWEK,
                this.kjwenger.checkPassword(UserBeanTest.LUSDFHGLWEK));
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.UserBean#setPassword(java.lang.String)}.
     * @throws PropertyVetoException
     */
    public void testSetPassword() throws PropertyVetoException {
        this.ddroujkov.setPassword(UserBeanTest.LUSDFHGLWEK);
        Assert.assertFalse(
                "ddroujkov should not check against null password", //$NON-NLS-1$
                this.ddroujkov.checkPassword(null));
        Assert.assertFalse(
                "ddroujkov should not check against blank password", //$NON-NLS-1$
                this.ddroujkov.checkPassword(UserBeanTest.EMPTY));
        Assert.assertTrue(
                "ddroujkov should check against password: " //$NON-NLS-1$
                + UserBeanTest.LUSDFHGLWEK,
                this.ddroujkov.checkPassword(UserBeanTest.LUSDFHGLWEK));
        // TODO Add tests for setting password with old versions
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.UserBean#getEmail()}.
     */
    public void testGetEmail() {
        Assert.assertNull(this.ddroujkov.getEmail());
        Assert.assertEquals(UserBeanTest.KJWENGER_YAHOO_COM,
                this.kjwenger.getEmail());
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.UserBean#setEmail(java.lang.String)}.
     */
    public void testSetEmail() {
        final UserBean userBean = new UserBean(UserBeanTest.KJWENGER);
        userBean.setEmail(UserBeanTest.KJWENGER_YAHOO_COM);
        final String email = userBean.getEmail();
        Assert.assertNotNull(
                "The user email should not be null", //$NON-NLS-1$
                email);
        Assert.assertEquals(UserBeanTest.KJWENGER_YAHOO_COM, email);
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.UserBean#validateNameChange()}.
     */
    public void testValidateNameChange() {
        try {
            this.kjwenger.validateNameChange();
        } catch (final Exception e) {
            return;
        }
        Assert.fail("Did not catch: Cannot modify user name once set"); //$NON-NLS-1$
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.UserBean#validateNullName(String)}.
     */
    public void testValidateNullName() {
        this.kjwenger.validateNullName(UserBeanTest.EMPTY);
        this.kjwenger.validateBlankName(UserBeanTest.DDROUJKOV);
        try {
            this.kjwenger.validateNullName(null);
        } catch (final Exception e) {
            return;
        }
        Assert.fail("Did not catch: Cannot set user name to null"); //$NON-NLS-1$
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.UserBean#validateBlankName(String)}.
     */
    public void testValidateBlankName() {
        this.kjwenger.validateBlankName(null);
        this.kjwenger.validateBlankName(UserBeanTest.DDROUJKOV);
        try {
            this.kjwenger.validateBlankName(UserBeanTest.EMPTY);
        } catch (final Exception e) {
            return;
        }
        Assert.fail("Did not catch: Cannot set blank user name"); //$NON-NLS-1$
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.UserBean#getPersonBean()}.
     */
    public void testGetPersonBean() {
        final PersonBean personBean = this.kjwenger.getPersonBean();
        Assert.assertNotNull(
                "kjwenger should have a personBean property value", //$NON-NLS-1$
                personBean);
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.UserBean#setPersonBean(PersonBean)}.
     */
    public void testSetPersonBean() {
        this.kjwenger.setPersonBean(this.klausWenger);
        final PersonBean personBean = this.kjwenger.getPersonBean();
        Assert.assertNotNull(
                "kjwenger should have a personBean property value", //$NON-NLS-1$
                personBean);
        Assert.assertEquals(
                "kjwenger should get a personBean identical with klausWenger", //$NON-NLS-1$
                this.klausWenger, personBean);
        final Person person = this.kjwenger.getPerson();
        Assert.assertNotNull(
                "kjwenger should have a person property value", //$NON-NLS-1$
                person);
        Assert.assertEquals(
                "kjwenger should get a personBean identical with its person", //$NON-NLS-1$
                person, personBean);
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.UserBean#getGroupBeans()}.
     */
    public void testGetGroupBeans() {
        final Collection<GroupBean> groupBeans = this.kjwenger.getGroupBeans();
        Assert.assertNotNull(
                "kjwenger should have a groupBeans property value", //$NON-NLS-1$
                groupBeans);
        Assert.assertTrue(
                "kjwenger should have a empty groupBeans", //$NON-NLS-1$
                groupBeans.isEmpty());
        final Collection<? extends Group> groups = this.kjwenger.getGroups();
        Assert.assertNotNull(
                "kjwenger should have a groups property value", //$NON-NLS-1$
                groups);
        Assert.assertEquals(
                "kjwenger should get a groupBeans identical with its groups", //$NON-NLS-1$
                groups, groupBeans);
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.UserBean#setGroupBeans(Collection)}.
     */
    public void testSetGroupBeans() {
        final Collection<GroupBean> newGroupBeans =
            Collections.singleton(this.administrators);
        this.kjwenger.setGroupBeans(newGroupBeans);
        final Collection<GroupBean> groupBeans = this.kjwenger.getGroupBeans();
        Assert.assertNotNull(
                "kjwenger should have a groupBeans property value", //$NON-NLS-1$
                groupBeans);
        Assert.assertEquals(
                "kjwenger should get the set groupBeans", //$NON-NLS-1$
                newGroupBeans, groupBeans);
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.UserBean#hashCode()}.
     */
    public void testHashCode() {
        Assert.assertNotSame(Integer.valueOf(0),
                Integer.valueOf(this.kjwenger.hashCode()));
        Assert.assertNotSame(Integer.valueOf(0),
                Integer.valueOf(this.ddroujkov.hashCode()));
        Assert.assertNotSame(Integer.valueOf(0),
                Integer.valueOf(new UserBean().hashCode()));
        Assert.assertNotSame(Integer.valueOf(0),
                Integer.valueOf(new UserBean(UserBeanTest.KJWENGER).hashCode()));
        Assert.assertNotSame(Integer.valueOf(0),
                Integer.valueOf(new UserBean(UserBeanTest.KJWENGER,
                        UserBeanTest.LUSDFHGLWEK).hashCode()));
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.UserBean#equals()}.
     */
    public void testEquals() {
        Assert.assertNotSame(this.kjwenger, this.ddroujkov);
        Assert.assertEquals(this.kjwenger, this.kjwenger);
        UserBean newUserBean1 = new UserBean();
        UserBean newUserBean2 = new UserBean();
        Assert.assertEquals(newUserBean1, newUserBean2);
        newUserBean1 = new UserBean(UserBeanTest.KJWENGER);
        newUserBean2 = new UserBean(UserBeanTest.KJWENGER);
        Assert.assertEquals(newUserBean1, newUserBean2);
        newUserBean1 =
            new UserBean(UserBeanTest.KJWENGER, UserBeanTest.LUSDFHGLWEK);
        newUserBean2 =
            new UserBean(UserBeanTest.KJWENGER, UserBeanTest.LUSDFHGLWEK);
        Assert.assertEquals(newUserBean1, newUserBean2);
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.UserBean#toString()}.
     */
    public void testToString() {
        this.kjwenger.toString();
        this.ddroujkov.toString();
        new UserBean().toString();
        new UserBean(UserBeanTest.KJWENGER).toString();
        new UserBean(UserBeanTest.KJWENGER, UserBeanTest.LUSDFHGLWEK).toString();
    }
    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        this.ddroujkov = new UserBean(UserBeanTest.DDROUJKOV);
        this.kjwenger =
            new UserBean(UserBeanTest.KJWENGER, UserBeanTest.LUSDFHGLWEK);
        this.kjwenger.setEmail(UserBeanTest.KJWENGER_YAHOO_COM);
        this.administrators = new GroupBean(UserBeanTest.ADMINISTRATORS);
        this.klausWenger = new PersonBean();
        this.klausWenger.setFirstName(UserBeanTest.KLAUS);
        this.klausWenger.setMiddleName(UserBeanTest.JOSEF);
        this.klausWenger.setLastName(UserBeanTest.WENGER);
        this.klausWenger.setDateOfBirth(UserBeanTest.KLAUS_WENGER_BIRTHDAY);
    }
    /* (non-Javadoc)
     * @see junit.framework.TestCase#tearDown()
     */
    @Override
    protected void tearDown() throws Exception {
        this.klausWenger = null;
        this.administrators = null;
        this.kjwenger = null;
        this.ddroujkov = null;
        super.tearDown();
    }

    protected UserBean kjwenger;
    private UserBean ddroujkov;
    private GroupBean administrators;
    private PersonBean klausWenger;

    private static final String ADMINISTRATORS = "administrators"; //$NON-NLS-1$
    protected static final String KJWENGER = "kjwenger"; //$NON-NLS-1$
    private static final String KJWENGER_YAHOO_COM =
        "kjwenger@yahoo.com"; //$NON-NLS-1$
    protected static final String DDROUJKOV = "ddroujkov"; //$NON-NLS-1$
    protected static final String LUSDFHGLWEK = "lusdfhglwek"; //$NON-NLS-1$
    private static final String WENGER = "Wenger"; //$NON-NLS-1$
    private static final String JOSEF = "Josef"; //$NON-NLS-1$
    private static final String KLAUS = "Klaus"; //$NON-NLS-1$
    protected static final String EMPTY = ""; //$NON-NLS-1$
    private static final Date KLAUS_WENGER_BIRTHDAY = new Date(1965, 3 - 1, 2);
}
