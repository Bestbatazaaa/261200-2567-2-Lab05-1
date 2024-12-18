import java.time.LocalDate;

public class Admin extends User{
    private String role;

    public Admin(String name, LocalDate dob) {
        super(name,dob);
        this.role = "Admin";
    }

    public void displayinfo(boolean full) {
        super.displayinfo(); 
        if(full == true) {
            System.out.println("Role: " + role);
        }
    }
}
