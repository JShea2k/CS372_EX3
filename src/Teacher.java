public class Teacher extends Person {
    private int gradeLevel;
    private String certification;

    // Blank Teacher constructor
    public Teacher() {
        super(" ", 0, 0);
    }

    // Teacher constructor to take in a name, age, and phone number
    public Teacher(String name, int age, long phoneNumber) {
        super(name, age, phoneNumber);
    }

    // Sets the grade level that the teacher is teaching
    public void setGradeLevel(int _gradeLevel) {
        gradeLevel = _gradeLevel;
    }

    // Sets the certification the teacher has
    public void setCertification(String _certification) {
        certification = _certification;
    }

    // Returns the grade level the teacher teaches
    public int getGradeLevel() {
        return gradeLevel;
    }

    // Returns the certification the teacher has
    public String getCertification() {
        return certification;
    }

    // Used to return the teachers name
    public String toString() {
        return name;
    }
}
