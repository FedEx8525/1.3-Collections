package s1_t3_l1_ex1;

import java.util.Objects;

public class Month {
    private String name = "";

    public Month (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Month month = (Month) o;
        return Objects.equals(this.name, month.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public String toString() {
        return "The month of " + this.getName() + " was created.";
    }
}
