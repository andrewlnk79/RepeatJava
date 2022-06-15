import java.util.Scanner;

public class WeightOnTheMoon {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double x;
        double weight;
        System.out.println("enter you weight");

        x = scanner.nextInt();
        if (x >0){
            weight= x *17/100;
            System.out.println("you weight on the moon is:"+weight);

        }




    }
}
