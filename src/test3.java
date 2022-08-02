import java.util.Scanner;
public class test3 {
    public static  void main (String[] args) {
        Scanner inp = new Scanner(System.in);
        int yil,kalan;

        System.out.print("Yil Giriniz : ");
        yil = inp.nextInt();

        if (yil % 4 == 0){
            if (yil % 100 == 0){
                if (yil % 400 == 0){
                    System.out.print(yil+" bir artik yildir.");
                }else {
                    System.out.print(yil+" bir artik degildir.");
                }
            }else {
                System.out.print(yil+" bir artik yildir.");
            }
        } else {
            System.out.print(yil+" bir artik degildir.");
        }

    }

}





