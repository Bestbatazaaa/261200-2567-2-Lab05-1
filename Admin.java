import java.time.LocalDate;

public class Admin extends User{
    private String role;

    public Admin() {
        super();
        this.role = "Admin";
    }

    public Admin(String name, int year, int month, int date) {
        super(name,year,month,date);
        this.role = "Admin";
    }

    public void displayinfo(boolean full) {
        super.displayinfo();
        if(full == true) {
            System.out.println("Role: " + role);
        }
    }

}
