import java.util.Random;

public class Main {
    public static void main(String[] args){
        System.out.println("ииииииуууууууууу");

        Random random = new Random();
        int randomDay = random.nextInt(20);

        int data = 16;

        if(data + randomDay <= 31) {
            System.out.println("July");
        } else {
            System.out.println("August");
        }

        System.out.println(randomDay);
        //второе задание

    }
}

















































































































































