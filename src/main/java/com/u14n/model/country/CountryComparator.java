/**
 * 
 */
package com.u14n.model.country;

import java.text.Collator;
import java.util.Comparator;

/**
 * @author Klaus Wenger
 */
public class CountryComparator implements Comparator<Country> {
    /**
     *
     */
    public CountryComparator() {
        super();
        this.countryOnTop = null;
    }
    /**
     * @param countryOnTop
     */
    public CountryComparator(String countryOnTop) {
        super();
        this.countryOnTop = countryOnTop;
    }
    /**
     * @param thisCountry
     * @param thatCountry
     * @return
     */
    public int compare(Country thisCountry, Country thatCountry) {
        if ((this.countryOnTop != null) && this.countryOnTop.equals(
                thisCountry.getCountry())) {
            if (!this.countryOnTop.equals(thatCountry.getCountry())) {
                return -1;
            }
        }
        return this.collator.compare(
                thisCountry.getDisplayCountry(),
                thatCountry.getDisplayCountry()) ;
    }

    private final String countryOnTop;
    private Collator collator = Collator.getInstance();
}