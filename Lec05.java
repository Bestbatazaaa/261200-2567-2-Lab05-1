import java.time.LocalDate;

    public class Lec05 {
        public static void main(String[] args) throws Exception {
            User john = new User("John", LocalDate.of(1954, 2, 18));
            john.displayinfo();
            Admin nicholas = new Admin("Nicholas", LocalDate.of(1964, 1, 7));
            nicholas.displayinfo(true);
            nicholas.displayinfo(false);
        }
    }