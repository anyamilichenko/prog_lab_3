public enum Places {
    ROAD("на дороге "),
    HOUSES("по домам "),
    STREET("по среди улицы "),
    WINDOW("в окна "),
    CITY("к городу ");


    private String name;
    Places(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " ";

    }
}
