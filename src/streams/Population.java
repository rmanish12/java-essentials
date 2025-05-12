package streams;

import java.util.List;

record City(String name, int population){};
record Country(String name, List<City> cities){};

public class Population {
    public static void main(String[] args) {

        City newYork= new City("New York", 8_258);
        City losAngeles = new City("Los Angeles", 3_821);
        Country usa = new Country("USA", List.of(newYork, losAngeles));

        City london = new City("London", 8_866);
        City manchester = new City("Manchester", 568);
        Country uk = new Country("United Kingdom", List.of(london, manchester));

        City paris = new City("Paris", 2_103);
        City marseille = new City("Marseille", 877);
        Country france = new Country("France", List.of(paris, marseille));

        List<Country> countries = List.of(usa, uk, france);

        int population = 0;

        // without stream
        for (Country country: countries) {
            for (City city: country.cities()) {
                population+= city.population();
            }
        };
        System.out.println(population);

        // with stream
        int totalPopulation = countries
                .stream()
                .flatMap(country -> country.cities().stream())
                .mapToInt(City::population)
                .sum();
        System.out.println(totalPopulation);
    }
}
