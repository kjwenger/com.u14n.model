/**
 * 
 */
package com.u14n.model.address;

/**
 * @author Klaus Wenger
 */
public interface Address {
    /**
     * @return A description for this address like "Home", "Work", "Lisa's" ...
     */
    String getDescription();
    /**
     * @return A Country code according to IEEE
     */
    String getCountry();
    /**
     * @return A State/Province/Region 
     */
    String getState();
    /**
     * @return A City/Town/Village
     */
    String getCity();
    /**
     * @return A ZIP Code
     */
    String getZipCode();
    /**
     * @return The Home Phone #
     */
    String getPhone();
    /**
     * @return The FAX #
     */
    String getFax();
    /**
     * @param description A description for this address like "Home", "Work", "Lisa's" ...
     */
    void setDescription(String description);
    /**
     * @param country A Country code according to IEEE
     */
    void setCountry(String country);
    /**
     * @param state A State/Province/Region 
     */
    void setState(String state);
    /**
     * @param city A City/Town/Village
     */
    void setCity(String city);
    /**
     * @param zipCode A ZIP Code
     */
    void setZipCode(String zipCode);
    /**
     * @param phone The Home Phone #
     */
    void setPhone(String phone);
    /**
     * @param fax The FAX #
     */
    void setFax(String fax);
}
