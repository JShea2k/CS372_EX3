import java.util.Vector;

abstract public class Building {
    protected String name;
    protected String address;
    protected Vector<Person> buildingArray = new Vector<Person>(); // Array of people in the building

    // Blank building constructor
    public Building() {
        name = " ";
        address = " ";
    }

    // Building constructor that sets its name and address
    public Building(String _name, String _address) {
        name = _name;
        address = _address;
    }

    // Sets the name of a building
    public void setName(String _name) {
        name = _name;
    }

    // Sets the address of the building
    public void setAddress(String _address) {
        address = _address;
    }

    // Returns the name of the building
    public String getName() {
        return name;
    }

    // Returns the address of the building
    public String getAddress() {
        return address;
    }

    // Adds a person to a building
    public void addPerson(Person p) {
        buildingArray.add(p);
    }



}

