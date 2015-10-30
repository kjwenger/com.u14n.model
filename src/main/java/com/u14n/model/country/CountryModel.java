/**
 * 
 */
package com.u14n.model.country;

import java.util.Collection;
import java.util.Locale;
import java.util.TreeSet;

/**
 * @author Klaus Wenger
 */
public class CountryModel {
    /**
     * 
     */
    public CountryModel() {
        super();
    }
    /**
     * @param countryOnTop The country code to place on top of the list
     * @return All available {@link Country} entries.
     */
    public Country[] getAllCountries(String countryOnTop) {
        if (this.countryCollection == null) {
            Locale[] availableLocales = Locale.getAvailableLocales();
            this.countryCollection = new TreeSet<Country>(
                    new CountryComparator(countryOnTop));
            for (Locale locale : availableLocales) {
                if ((locale.getCountry() != null)
                        && (locale.getCountry().length() > 0)) {
                    LocaleCountry localeCountry = new LocaleCountry(locale);
                    if (!countryCollection.contains(localeCountry)) {
                        this.countryCollection.add(localeCountry);
                    }
                }
            }
        }
        return this.countryCollection.toArray(
                new Country[this.countryCollection.size()]);
    }
    /**
     * @return All available {@link Country} entries.
     */
    public Country[] getAllCountries() {
        return getAllCountries(null);
    }

    private Collection<Country> countryCollection;

    /**
     * @return A single instance of this model.
     */
    public static synchronized CountryModel getInstance() {
        if (CountryModel.instance == null) {
            CountryModel.instance = new CountryModel();
        }
        return CountryModel.instance;
    }

    private static CountryModel instance;
}
