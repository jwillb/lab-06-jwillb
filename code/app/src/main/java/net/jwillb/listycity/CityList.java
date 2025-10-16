package net.jwillb.listycity;

/**
 * This class holds the City type objects in a list
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CityList {
    private List<City> cities = new ArrayList<City>();

    /**
     * This method adds a city object to the cities list.
     * @param city
     *   This is a city objet that we want to add to the list.
     * @throws IllegalArgumentException if the city already exists in the list.
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }

        cities.add(city);
    }

    /**
     * This method sorts the list of cities
     * @return a sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This class returns whether or not the given city is in the cities list.
     * @param city the city to check
     * @return true if the city is there, false if it isn't
     */
    public Boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Delete a city from the list
     * @param city the city to remove
     * @throws IllegalArgumentException when the city is not present
     */
    public void removeCity(City city) {
        if (this.hasCity(city)) {
            cities.remove(city);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Returns the number of cities in the list.
     * @return integer for number of cities.
     */
    public int countCities() {
        return cities.size();
    }
}
