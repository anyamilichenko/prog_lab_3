public class Place extends Environment {

    public Place(String time, Places places) {
        this.time = time;
        this.place = places.toString();
    }

    @Override
    public String toString() {
        return time + place;
    }
}
