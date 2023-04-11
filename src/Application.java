import java.util.Scanner;
/*
* Кр - Король
* Ф - Ферзь
* Л - Ладья
* С - Слон
* К - Конь
* для пешки в начале буквы пожалели
 */
public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 5;
        int current = 1;
        while (current <= count) {
            if (current % 2 == 1){
                String hod = sc.nextLine();
                System.out.println("P1:" + hod);
            }
            else {
                String hod = sc.nextLine();
                System.out.println("P2: " + hod);
            }
            current++;
        }
    }
}