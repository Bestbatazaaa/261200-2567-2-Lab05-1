import java.time.LocalDate;
import java.util.Locale;

public class User {
    private String name;
    private LocalDate dob;

  public void User(){
      this.name = "";
      this.dob = LocalDate.now();
  }

    public User (String name, LocalDate dob){
        this.name = name;
        this.dob = dob;
    }
    public void displayinfo(){
        System.out.println("name: " + name);
        System.out.println("date of birth: " + dob);
    }

}



