/**
 * 
 */
package com.u14n.model.person;

import java.util.Date;

import com.u14n.model.address.SimpleAddress;

/**
 * @author Klaus Wenger
 */
public interface Person {
    /**
     * @return The First Name
     */
    String getFirstName();
    /**
     * @return The Last Name
     */
    String getLastName();
    /**
     * @return The Middle Name
     */
    String getMiddleName();
    /**
     * @return The Birthday
     */
    Date getDateOfBirth();
    /**
     * @return The main Address
     */
    SimpleAddress getAddress();
    /**
     * @param firstName The First Name
     */
    void setFirstName(String firstName);
    /**
     * @param lastName The Last Name
     */
    void setLastName(String lastName);
    /**
     * @param middleName The Middle Name
     */
    void setMiddleName(String middleName);
    /**
     * @param birthday The Birthday
     */
    void setDateOfBirth(Date birthday);
}
