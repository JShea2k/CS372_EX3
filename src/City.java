import java.util.ArrayList;
public class City {
    protected String name;
    protected String state;
    protected ArrayList<Building> buildingArray = new ArrayList<>(); // ArrayList of all the buildings
    protected ArrayList<Person> personArray = new ArrayList<>(); // ArrayList of all the people

    // Blank city constructor
    public City() {
        name = " ";
        state = " ";
    }

    // City constructor that sets its name and state
    public City(String _name, String _state) {
        name = _name;
        state = _state;
    }

    // Adds a building to the city
    public void addBuilding(Building b) {buildingArray.add(b);
    }

    // Outputs the names of all the buildings
    public void outputBuildingNames() {
        System.out.println(buildingArray);
    }

    // Outputs all the peoples names in the city
    public void outputPersonNames () {
        System.out.println(personArray);
    }
}
