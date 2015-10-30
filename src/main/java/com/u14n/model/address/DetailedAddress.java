/**
 * 
 */
package com.u14n.model.address;

/**
 * @author Klaus Wenger
 */
public interface DetailedAddress extends Address {
    /**
     * @return A Street name
     */
    String getStreet();
    /**
     * @return A street Number
     */
    String getNumber();
    /**
     * @return An Apartment/Suite/Unit/Building/Floor
     */
    String getUnit();
    /**
     * @return Additional data required to help f.i. postal service
     */
    String getAdditional();
    /**
     * @return A P.O. Box
     */
    String getPOBox();
    /**
     * @return The Home Phone #
     */
    String getHomePhone();
    /**
     * @return The Work Phone #
     */
    String getWorkPhone();
    /**
     * @param street A Street name
     */
    void setStreet(String street);
    /**
     * @param number A street Number
     */
    void setNumber(String number);
    /**
     * @param unit An Apartment/Suite/Unit/Building/Floor
     */
    void setUnit(String unit);
    /**
     * @param additional Additional data required to help f.i. postal service
     */
    void setAdditional(String additional);
    /**
     * @param poBox A P.O. Box
     */
    void setPOBox(String poBox);
    /**
     * @param homePhone The Home Phone #
     */
    void setHomePhone(String homePhone);
    /**
     * @param workPhone The Work Phone #
     */
    void setWorkPhone(String workPhone);
}
