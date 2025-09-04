public class festlokalen {
    public static void main(String[] args) {
    boolean isFull = false;
    boolean Id = true;
    int age = 20;
    int dayOfWeek = 6;

    if (!isFull && Id){
        if ( dayOfWeek <= 4 && age>=21){
            System.out.println("Welcome!");
        } else if ((dayOfWeek == 5 || dayOfWeek == 6) && age >= 18) {
            System.out.println("Welcome!");
        } else {
            System.out.println("You can not enter!");
        }
    }
}
}