public class Police extends Person {
    public enum Role {Patrol, Sargent, Captain, Chief};
    private Role role;

    // Blank Police constructor
    public Police() {
        name = "";
        age = 0;
        phoneNumber = 0;
    }

    // Police constructor that sets their name, age, and phone number
    public Police(String name, int age, long phoneNumber) {
        super(name, age, phoneNumber);
    }

    // Sets the role of the police
    public void setRole(Role _role) {
        role = _role;
    }

    // Returns the role of the police
    public Role getRole() {
        return role;
    }

    // Used to return the name of the police
    public String toString() {
        return name;
    }
}
