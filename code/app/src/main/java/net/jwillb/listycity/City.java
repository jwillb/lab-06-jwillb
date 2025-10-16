package net.jwillb.listycity;

/**
 * This class represents cities by storing their name and province.
 */
public class City implements Comparable<City> {

    private String city;
    private String province;

    /**
     * Constructor for the city class
     * @param city the name for the city
     * @param province the province that the city is in
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the city name
     * @return city name
     */
    public String getCity() {
        return city;
    }

    /**
     * Returns the province
     * @return province name
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the name of the city
     * @param city the new city name to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Sets the name of the province
     * @param province the new province name to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * This method compares city objects based on their city name field.
     * @param o the object to be compared.
     * @return 0, <1 or >1 if two values are equal, a<b, or a>b.
     */
    @Override
    public int compareTo(net.jwillb.listycity.City o) {
        return this.city.compareTo(o.getCity());
    }

    /**
     * This method overrides the standard equals operator, to compare cities based
     * on their name and province rather than just their instance/class.
     * @param o the object being compared
     * @return true if they're equal, false if not.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        return (city.equals(((City)o).getCity()) && province.equals(((City)o).getProvince()));
    }
}
