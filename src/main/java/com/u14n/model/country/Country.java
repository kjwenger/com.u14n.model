/**
 * 
 */
package com.u14n.model.country;

/**
 * @author Klaus Wenger
 */
public interface Country {
    /**
     * Gets the country/region code for this country, which will be the
     * upper-case ISO 3166 2-letter code.
     *
     * @see #getDisplayCountry
     * @return
     */
    String getCountry();
    /**
     * @return
     */
    String getDisplayCountry();
}
