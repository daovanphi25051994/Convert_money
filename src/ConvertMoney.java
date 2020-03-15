import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rateUsd = 23000;
        System.out.printf("enter usd you want to convert to vnd: ");
        int usd = scanner.nextInt();
        int vnd = usd * rateUsd;
        System.out.printf("%d usd = %d vnd", usd, vnd);
    }
}
