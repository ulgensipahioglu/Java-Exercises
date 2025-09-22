import java.time.LocalTime;

public class FrökenUr {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        
        int currentMinute = currentTime.getMinute();
        int currentHour = currentTime.getHour();

        System.out.println("Current Time: " +currentHour+ "." +currentMinute);

        int hour = Integer.parseInt(args[0]);
        int minute = Integer.parseInt(args[1]);

      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter ");*/

        int finalMinute = (currentMinute + minute) % 60;
        if (finalMinute > 60) 
        {
            
        }
        int finalHour = (currentHour + hour ) % 24;

        System.out.println("Final Hour:" + finalHour+finalMinute);

    }
}
