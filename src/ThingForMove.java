public class ThingForMove extends Thing{
    public String[] cars;
    public ThingForMove(String name, String[] description) {
        this.name = name;
        this.description = description;
    }

    public ThingForMove(String name, String[] description, String[] carsM) {
        this.name = name;
        this.description = description;
        this.cars = carsM;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < description.length; i++) {
            if(i == 0){
                result.append(description[i]);
            }else{
                result.append("и ").append(description[i]).append(" ");
            }
        }
        result.append(name + " ");
        return result.toString();
    }

    @Override
    public void seem() {
        System.out.print("увидели ");
    }

    @Override
    public void gettingBigger() {
        System.out.print("становилось больше");
    }

    @Override
    public void raise(Thing thing, Places place) {
        System.out.print("подняли ");
    }

    @Override
    public void lying(Thing thing) {
        System.out.print("лежали ");
    }
}
