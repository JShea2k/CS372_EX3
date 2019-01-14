abstract public class Person {
    protected String name;
    protected int age;
    protected long phoneNumber;

    // Blank constructor for person
    public Person() {
        name = " ";
        age = 0;
        phoneNumber = 0;
    }

    // Person constructor that sets name, age, and phone number
    public Person(String _name, int _age, long _phoneNumber) {
        name = _name;
        age = _age;
        phoneNumber = _phoneNumber;
    }

    // Sets the persons name
    public void setName(String _name) {
        name = _name;
    }

    // Sets the persons age
    public void setAge(int _age) {
        age = _age;
    }

    // Sets the persons phone number
    public void setPhoneNumber(long _phoneNumber) {
        phoneNumber = _phoneNumber;
    }

    // Returns the persons name
    public String getName() {
        return name;
    }

    // Returns the persons age
    public int getAge() {
        return age;
    }

    // Returns the persons phone number
    public long getPhoneNumber() {
        return phoneNumber;
    }
}
