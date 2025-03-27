public class Person {
    private String name;
    private String nationalNumber;
    private int age;
    private String address;

    public Person(String name, String nationalNumber, int age, String address) {
        this.name = name;
        this.nationalNumber = nationalNumber;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalNumber() {
        return nationalNumber;
    }

    public void setNationalNumber(String nationalNumber) {
        this.nationalNumber = nationalNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", nationalNumber='" + nationalNumber + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
