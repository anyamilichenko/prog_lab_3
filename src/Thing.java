import java.util.Arrays;
import java.util.Objects;

public abstract class Thing implements Movements {
    public String name;
    public String[] description;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Thing thing = (Thing) o;
        return Objects.equals(name, thing.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = result + Arrays.hashCode(description) + 69;
        return result;
    }

    @Override
    public void vilezli(){
        System.out.print("вылезли ");
    }

    @Override
    public void eq(){
        System.out.print("поравнялись ");
    }


    @Override
    public void move() {
        System.out.print("бежали ");
    }

    @Override
    public void closer() {
        System.out.print("приближались ");
    }

    @Override
    public void stop() {
        System.out.print("остановились ");
    }

    @Override
    public void runOut() {
        System.out.print("выбежали ");
    }

    @Override
    public void riseUp() {
        System.out.print("поднялись ");
    }

    @Override
    public void stay(Places place) {
        System.out.print("остался " + place);
    }

    @Override
    public void rushed(String description) {
        System.out.print("бросились ");
    }

    @Override
    public void decided(){
        System.out.print("решили ");
    }
}
