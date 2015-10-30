/**
 *
 */
package com.u14n.model.user.bean;

import java.util.ArrayList;
import java.util.Collection;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.u14n.model.user.User;

/**
 * @author Klaus Wenger
 */
public class GroupBeanTest extends TestCase {
    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        this.ddroujkov = new UserBean(GroupBeanTest.DDROUJKOV);
        this.kjwenger =
            new UserBean(GroupBeanTest.KJWENGER, GroupBeanTest.LUSDFHGLWEK);
        this.administrators = new GroupBean(GroupBeanTest.ADMINISTRATORS);
    }
    /* (non-Javadoc)
     * @see junit.framework.TestCase#tearDown()
     */
    @Override
    protected void tearDown() throws Exception {
        this.administrators = null;
        this.kjwenger = null;
        this.ddroujkov = null;
        super.tearDown();
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.GroupBean#GroupBean(java.lang.String)}.
     */
    public final void testGroupBean() {
        GroupBean groupBean = new GroupBean(GroupBeanTest.ADMINISTRATORS);
        Assert.assertNotNull(groupBean.getName());
        Assert.assertEquals(GroupBeanTest.ADMINISTRATORS, groupBean.getName());

        try {
            groupBean = new GroupBean(null);
        } catch (final Exception e) {
            return;
        }
        Assert.fail("Did not catch: Cannot instantiate with group name as null"); //$NON-NLS-1$
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.GroupBean#clone()}.
     */
    public final void testClone() {
        Assert.assertTrue("GroupBean should be Cloneable", //$NON-NLS-1$
                this.administrators instanceof Cloneable);
        final Object clone = this.administrators.clone();
        Assert.assertEquals(this.administrators, clone);
        Assert.assertTrue("Clone should be Cloneable", //$NON-NLS-1$
                clone instanceof Cloneable);
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.GroupBean#getName()}.
     */
    public final void testGetName() {
        Assert.assertEquals(GroupBeanTest.ADMINISTRATORS,
                this.administrators.getName());
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.GroupBean#setName(java.lang.String)}.
     */
    public final void testSetName() {
        try {
            this.kjwenger.setName(GroupBeanTest.GUEST);
        } catch (final UnsupportedOperationException e) {
            return;
        }
        Assert.fail("Did not catch: Cannot modify group name once set"); //$NON-NLS-1$
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.GroupBean#getUsers()}.
     */
    public final void testGetUsers() {
        final Collection<? extends User> users = this.administrators.getUsers();
        Assert.assertNotNull(users);
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.GroupBean#getUserBeans()}.
     */
    public final void testGetUserBeans() {
        final Collection<UserBean> userBeans =
            this.administrators.getUserBeans();
        Assert.assertNotNull(userBeans);
        final Collection<? extends User> users = this.administrators.getUsers();
        Assert.assertNotNull(users);
        Assert.assertEquals(users, userBeans);
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.GroupBean#setUserBeans(java.util.Collection)}.
     */
    public final void testSetUserBeans() {
        final Collection<UserBean> newUserBeans = new ArrayList<UserBean>();
        newUserBeans.add(this.kjwenger);
        newUserBeans.add(this.ddroujkov);
        this.administrators.setUserBeans(newUserBeans);
        final Collection<UserBean> userBeans =
            this.administrators.getUserBeans();
        Assert.assertNotNull(userBeans);
        Assert.assertEquals(newUserBeans, userBeans);
        final Collection<? extends User> users = this.administrators.getUsers();
        Assert.assertNotNull(users);
        Assert.assertEquals(newUserBeans, users);
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.GroupBean#validateNameChange()}.
     */
    public void testValidateNameChange() {
        try {
            this.kjwenger.validateNameChange();
        } catch (final UnsupportedOperationException e) {
            return;
        }
        Assert.fail("Did not catch: Cannot modify group name once set"); //$NON-NLS-1$
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.GroupBean#validateNullName(String)}.
     */
    public void testValidateNullName() {
        try {
            this.kjwenger.setName(null);
        } catch (final Exception e) {
            return;
        }
        Assert.fail("Did not catch: Cannot set group name to null"); //$NON-NLS-1$
    }
    /**
     * Test method for {@link com.u14n.model.user.bean.GroupBean#validateBlankName(String)}.
     */
    public void testValidateBlankName() {
        try {
            this.kjwenger.setName(GroupBeanTest.EMPTY);
        } catch (final Exception e) {
            return;
        }
        Assert.fail("Did not catch: Cannot set blank group name"); //$NON-NLS-1$
    }

    private UserBean kjwenger;
    private UserBean ddroujkov;
    private GroupBean administrators;
    private static final String ADMINISTRATORS = "administrators"; //$NON-NLS-1$
    private static final String GUEST = "Guest"; //$NON-NLS-1$
    private static final String KJWENGER = "kjwenger"; //$NON-NLS-1$
    private static final String DDROUJKOV = "ddroujkov"; //$NON-NLS-1$
    private static final String LUSDFHGLWEK = "lusdfhglwek"; //$NON-NLS-1$
    private static final String EMPTY = ""; //$NON-NLS-1$
}
