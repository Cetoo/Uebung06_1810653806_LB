import javax.swing.*;
import java.util.Random;

public class Aufgabe_3
{

        public static void main(String[] args)
        {
            int[] array = new int[100];

            //Integer Array der Größe 100


            Random zufallszahl = new Random();

            //Generiert eine Zufallszahl



            //rnd.nextInt(max - min + 1) + min
            for (int i = 0; i < array.length; i++)
            {
                array[i] = zufallszahl.nextInt(300);

            }

            //Hier wird mein Array mit Zufallswerten befüllt diese liegt durch dem bound zwischen 0-299
            //Die Zufallszahl wird nur in den Arrayfeldern 0-99 gespeichrt da wir ein Array von 100 haben


        /*
            for (int i = 0; i < array.length; i++)
            {
                System.out.println(array[i]);
            }

        //Hier kann ich den Array auf der Konsole ausgeben lassen

        */


            while(true)
            {

                int position = Integer.parseInt(JOptionPane.showInputDialog("Bitte gib die Stelle an, an der du die Zahl ändern möchtest: "));
                JOptionPane.showMessageDialog(null, "Der Wert an der " + position + ". Stelle ist: " + array[position]);

                int newValue = Integer.parseInt(JOptionPane.showInputDialog("Bitte neuen Wert eingeben: "));
                array[position] = newValue;

                JOptionPane.showMessageDialog(null, "Der neue Wert an der " + position + ". Stelle ist: " + array[position]);
            }

            //Meine While Schleife läuft solange sie zutrifft das heißt in diesem Fall solange die Eingabe eine Zahl ist
            //wird der Nutzer immer wieder aufgefordert eine Stelle im Array zu wählen und zu ändern
            //Sobald der Nutzer keine Eingabe oder einen Buchstaben eingibt stürzt das Programm ab

        }
    }

