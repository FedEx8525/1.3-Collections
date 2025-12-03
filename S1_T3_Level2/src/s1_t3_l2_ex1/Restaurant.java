package s1_t3_l2_ex1;

import java.util.Objects;

public class Restaurant {

    private String name = "";
    private int rating = 0;

    public Restaurant (String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return this.name;
    }
    public int getRating() {
        return this.rating;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant restaurant = (Restaurant) o;
        return this.rating == restaurant.rating &&
                        Objects.equals(this.name, restaurant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating);
    }

    public String toString() {
        return "The restaurant " + this.getName() + " has a rating of " +
                this.getRating() + ".";
    }
}
