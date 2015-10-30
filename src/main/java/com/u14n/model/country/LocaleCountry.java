/**
 * 
 */
package com.u14n.model.country;

import java.util.Locale;

/**
 * @author Klaus Wenger
 */
public class LocaleCountry implements Country {
    /**
     * @param locale
     */
    public LocaleCountry(Locale locale) {
        this.locale = locale;
    }
    /* (non-Javadoc)
     * @see com.u14n.model.country.Country#getCountry()
     */
    public String getCountry() {
        return this.locale.getCountry();
    }
    /* (non-Javadoc)
     * @see com.u14n.model.country.Country#getDisplayCountry()
     */
    public String getDisplayCountry() {
        return this.locale.getDisplayCountry();
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return getDisplayCountry();
    }

    private Locale locale;
}
