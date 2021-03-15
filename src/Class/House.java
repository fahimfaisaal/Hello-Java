package Class;

public class House {
    public String owner;
    private String ownerGmail;

    public House(String owner , String ownerGmail) {
        this.owner = owner;
        this.ownerGmail = ownerGmail;
    }

    public String getOwnerGmail() {
        return this.ownerGmail;
    }

    public void setOwnerGmail(String gmail) {
        this.ownerGmail = gmail;
    }

    public void door() {
        System.out.println("This is my main door");
    }

    public void window() {
        System.out.println("This is window");
    }

    public void kitchen() {
        System.out.println("This is my kitchen");
    }

    public void dining() {
        System.out.println("This is my dining");
    }
}