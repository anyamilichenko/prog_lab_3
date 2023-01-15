public abstract class Person implements Actions {

    public String name;
    public String[] description;

    @Override
    public void hug(Person[] persons) {
        System.out.print("стали обнимать ");
        for (int i = 0; i < persons.length; i++) {
            if (i == 0) {
                System.out.print(persons[i].name + " ");
            } else {
                System.out.print("и " + persons[i].name + " ");
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < description.length; i++) {
            if (i == 0) {
                result.append(description[i]);
            } else {
                result.append("и ").append(description[i]).append(" ");
            }
        }
        result.append(name + " ");
        return result.toString();
    }
}
