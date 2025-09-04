public class Ovn2 {
    public static void main(String[] args) {
        double yourTime = Double.parseDouble(args[0]);
        double[] worldRecords = {10.8, 10.6, 10.5, 10.3, 10.1, 10.0, 9.8, 9.7, 9.6};
        int fasterCount = 0;
        
        for (int i = 0; i < worldRecords.length; i++) {
            if ( yourTime < worldRecords[i]){
                fasterCount++;
            }
        }
        System.out.println("You are faster than " + fasterCount + " people!");
    }
}