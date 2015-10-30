/**
 * 
 */
package com.u14n.model;

import java.io.Serializable;

/**
 * @author Klaus Wenger
 */
public aspect Serializables {
    declare parents : com.u14n.model..*Bean implements Serializable;
    /**
     * {@value}
     */
    private static long com.u14n.model.user.bean.UserBean.serialVersionUID =
        -6410377511710793440L;
    /**
     * {@value}
     */
    private static long com.u14n.model.user.bean.GroupBean.serialVersionUID =
        873248957790732443L;
    /**
     * {@value}
     */
    private static long com.u14n.model.person.bean.PersonBean.serialVersionUID =
        62376458883274568L;
    /**
     * {@value}
     */
    private static long com.u14n.model.address.bean.SimpleAddressBean.serialVersionUID =
        3230642537779240510L;
    /**
     * {@value}
     */
    private static long com.u14n.model.address.bean.DetailedAddressBean.serialVersionUID =
        -1673294586873245L;
}
