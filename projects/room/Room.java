package project.room;


public class Room {
    private int id;
    private String code;
    private String label;

    private static int count;

    // constructeurs polymorphes
    public Room(String code, String label) {
        this.id = ++count;
        this.code = code;
        this.label = label;
    }

    public Room(int id, String code, String label) {
        this.id = id;
        this.code = code;
        this.label = label;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return  this.code + " " + this.label + " (id: " + this.id + ")";
    }


}