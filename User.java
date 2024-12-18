import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;

  protected User(){
      this.name = "";
      this.dob = LocalDate.now();
  }

    public User (String name, int year, int month, int date){
        this.name = name;
        this.dob = LocalDate.of(year,month,date);
    }
    public void displayinfo(){
        System.out.println("name: " + name);
        System.out.println("date of birth: " + dob);
    }

}






