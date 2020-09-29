import java.util.Scanner;

public class TafelLoop {

    public static void main(String[] args) {

    //keyboard variabele bevat invoer van het toetsenbord.

    var keyboard = new Scanner(System.in);

    int Aantalmaleninvoer=1;

    //Reken de tafel van ingevoerd getal uit met een loop.

    while (Aantalmaleninvoer <= 2) {
        System.out.println("Voer een getal in, dan wordt de tafel van dat getal uitgerekend!");

        //vang het ingevoerde getal af.
        int invoerGetal=keyboard.nextInt();
        Aantalmaleninvoer++;
        for (int teller = 1; teller <= 10; teller++) {
            int tafel = teller * invoerGetal;

            System.out.print(teller);
            System.out.print(" x " + invoerGetal + " = ");
            System.out.println(tafel);
        }
    }
    keyboard.close();
  }
}
