public class Guy extends Person{


    @Override
    public void seen(){
        System.out.print("увидели ");
    }

    @Override
    public void decided() {
        System.out.print("решили ");
    }

    @Override
    public void hid(Places place){
        System.out.print("спрятались " + place);
    }

    @Override
    public void seem() {
        System.out.print("показалось ");
    }

    @Override
    public void peek(Places place) {
        System.out.print("выглядывали " + place);
    }

    @Override
    public void gettingBigger() {
        System.out.print("становилось больше ");
    }

    @Override
    public void raise(Thing thing, Places place) {
        System.out.print("поднял " + place + " ");
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
        System.out.print("расспрашивали ");
    }

    @Override
    public void notScared() {
        System.out.print("не испугался ");
    }

    @Override
    public void vilezli() {
        System.out.print("вылезли");
    }

    @Override
    public void move() {
        System.out.print("двинулись");
    }

    @Override
    public void runOut() {
        System.out.print("выбежали");
    }

    @Override
    public void riseUp() {
        System.out.print("поднялись");
    }

    @Override
    public void stay(Places place) {
        System.out.print("остался");
    }

    @Override
    public void rushed(String description) {
        System.out.print("быстро приближалось");
    }

    @Override
    public void lying(Thing thing) {
        System.out.print("лежал ");
    }


    public Guy(String name, String[] description) {
        this.name = name;
        this.description = description;
    }


}
