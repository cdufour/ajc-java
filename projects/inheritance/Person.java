package project;

public class Person
{
    protected int id;
    protected String firstname;
    protected String lastname;
    protected String mail;
    protected String phone;
    protected double salary;

    private static int count;

    public Person(String firstname, String lastname, String mail, 
            String phone, double salary) {
        this.id = ++count;
        this.firstname = firstname;
        this.lastname = lastname;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
    }

    public double computeSalary() {
        return this.salary;
    }

    public void show() {
        System.out.println("Je suis " + this.firstname);
    }
}