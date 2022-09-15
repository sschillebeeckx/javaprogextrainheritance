package be.abis.acca.model;

public class Person {

    private static int personCounter;
    private int personNumber;
    private String firstName;
    private String lastName;
    private int age;
    private Company company;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        personNumber=++personCounter;
    }

    public Person(String firstName, String lastName, int age, Company company) {
        this(firstName, lastName, age);
        this.company = company;
    }

    public int getPersonNumber() {
        return personNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int calculateAge(){
        return age;
    }

    public String toString(){
        return firstName + " " + lastName;
    }

    public void printInfo(){
        Company c = this.company;
        System.out.println("Person " + personNumber + ": " + firstName + " " + lastName + " (" + age + " years old)" + ((c!=null)?" works for " + c.getName() + " in " + c.getAddress().getTown() +".":" is not employed for the moment."));
    }
}
