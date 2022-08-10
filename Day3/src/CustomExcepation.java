import java.util.Scanner;
public class CustomExcepation {
    public class CustomException extends Exception {

        // no-arg constructor
        public CustomException(){
            super();
        }

        // String-arg constructor
        public CustomException (String msg) {
            super(msg);
        }

    }
    public class Register {

        public void checkAge(int age)
                throws CustomException {

            if(age<=25)
                throw new CustomExcepation (
                        "Age<=25, not eligible for voting");
        }
    }
}

public class CustomException {

    public static void main(String[] args) {

        // declare variables
        int age = 0;
        // create Scanner class object
        Scanner scan = new Scanner(System.in);
        // read age
        System.out.print("Enter age: ");
        age = scan.nextInt();
        // check age
        try {
            Register.checkAge(age);
            System.out.println("Registering in the voting list.");
            System.out.println("Registration completed.");
        } catch(CustomExcepation e) {
            System.out.println(e.getMessage());
        }

    }
}
