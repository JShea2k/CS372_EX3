public class Kid extends Person {
    private String favCandy;
    private int gradeLevel;

    // Blank constructor for kid
    public Kid() {
        super(" ", 0, 0);
    }

    // Kid constructor that sets their name, age, and phone number
    public Kid(String name, int age, long phoneNumber) {
        super(name, age, phoneNumber);
    }

    // Sets the kids favorite candy
    public void setFavCandy(String _favCandy) {
        favCandy = _favCandy;
    }

    // Returns the kids favorite candy
    public String getFavCandy() {
        return favCandy;
    }

    public void setGradeLevel(int _gradeLevel) {
        gradeLevel = _gradeLevel;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    // Used to return the kids name
    public String toString() {
        return name;
    }
}