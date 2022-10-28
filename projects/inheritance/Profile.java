package project;

public class Profile
{
    private int id;
    private String code;
    private String label;

    private static int count;

    public Profile(String code, String label) {
        this.id = ++count;
        this.code = code;
        this.label = label;
    }

    public String getCode() {
        return this.code;
    }

    public String toString() {
        return this.code + " " + this.label;
    }
}