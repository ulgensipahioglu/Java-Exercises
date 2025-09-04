/* public class Skottar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year:");
        Int Year = scanner.nextInt();
        if (( Year % 4 == 0 && Year % 100 !=0) || (Year % 400 ==0)){
            System.out.println("This is a leap year.");
        }
        else
        {
            System.out.println("This is ot a leap year.");
        }
        
    }
}
*/

public class Skottar {
    public static void main(String[] args) {
        Integer Year = Integer.parseInt(args[0]);
        if (( Year % 4 == 0 && Year % 100 !=0) || (Year % 400 ==0)){
            System.out.println("This is a leap year.");
        }
        else
        {
            System.out.println("This is not a leap year.");
        }
        
    }
}
