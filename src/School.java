public class School extends Building {

    private int numTeachers;
    private int numStudents;

    // blank School constructor
    public School() {
        super(" ", " ");
    }

    // School constructor that sets its name and address
    public School(String name, String address) {
        super(name, address);
    }

    public int findNumTeachers() {
        return numTeachers;
        }

    public int findNumStudents() {
        return numStudents;
    }
}

