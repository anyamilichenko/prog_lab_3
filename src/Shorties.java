public class Shorties extends Person{

    public Shorties(String name, String[] description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void seen() {
        System.out.print("видели ");
    }

    @Override
    public void decided() {

    }

    @Override
    public void hid(Places place) {
        System.out.print("скрывали ");
    }

    @Override
    public void lying(Thing thing) {

    }

    @Override
    public void seem() {

    }

    @Override
    public void peek(Places place) {
        System.out.print("заглыдявали ");
    }

    @Override
    public void gettingBigger() {
        System.out.print("Становились больше ");
    }

    @Override
    public void raise(Thing thing, Places place) {

    }

    @Override
    public void beSurprised() {
        System.out.print("удивились ");
    }

    @Override
    public void hear() {
        System.out.print("услышали ");
    }

    @Override
    public void questioned() {

    }

    @Override
    public void notScared() {

    }

    @Override
    public void vilezli() {

    }

    @Override
    public void move() {

    }

    @Override
    public void runOut() {
        System.out.print("выбежали ");
    }

    @Override
    public void riseUp() {

    }

    @Override
    public void stay(Places place) {

    }

    @Override
    public void rushed(String description) {
        System.out.println("рашили ");
    }
}
