/**
 * 
 */
package com.u14n.model.address;

/**
 * @author Klaus Wenger
 */
public interface SimpleAddress extends Address {
    /**
     * @return The first address line
     */
    String getLine1();
    /**
     * @return The second address line
     */
    String getLine2();
    /**
     * @param line1 The first address line
     */
    void setLine1(String line1);
    /**
     * @param line2 The second address line
     */
    void setLine2(String line2);
}
