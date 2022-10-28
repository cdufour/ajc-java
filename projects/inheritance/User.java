package project;

public class User extends Person
{
    private String login;
    private String password;
    private String service;
    private Profile profile;

    public User(String firstname, String lastname, String mail, 
            String phone, double salary, String login, String password,
            String service, Profile profile) {
        
        // invocation du constructeur parent
        super(firstname, lastname, mail, phone, salary);
        this.login = login;
        this.password = password;
        this.service = service;
        this.profile = profile;
    }

    public Profile getProfile() {
        return this.profile;
    }

    public double computeSalary() {
        if (this.profile.getCode().equalsIgnoreCase("mn")) {
            return 1.1 * this.salary;
        } else if (this.profile.getCode().equalsIgnoreCase("dg")) {
            return 1.4 * this.salary;
        } else {
            return super.computeSalary();
        }
    }

    public void show() {
        super.show();
        System.out.println("mon salaire est de " + this.computeSalary() + " EUR");
    }
}