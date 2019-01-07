import javax.swing.*;

public class Aufgabe_2
{

    public static void main(String[] args)
    {
        int[] array1 = new int[Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die Größe Ihres Arrays ein."))];

        //der Nutzer wird nach der größe des Arrays gefragt, deshalb Integer.parseInt zum umwandeln

        for (int i = 0; i < array1.length; i++)
        {
            array1[i] = (int) (Math.random() * 1000);
        }

        //Mit i=0 bestimme ich ab wo gestartet werden kann.
        //Das i<array.length ist die Aussage/Bedingung wird angegeben das i kleiner als die eingegebene Größe (vom Benutzer eingegebn)sein soll
        //Das i++ ist der Zählmechanismus der immer eine Zahl dazu gibt
        //Die Eingabe darunter im Körper meiner For-Schleife wird die Obergrenze der Random Zahl definiert und diese kann hier nicht 1000 oder mehr sein
        //Die Methode (Math.random) generiert die Zufallszahlen



        System.out.println("Vorwärts");
        //Damit ich sehe wo mein Array Vorwärts gelesen wird

        for (int i = 0; i < array1.length; i++)
        {
            System.out.println(array1[i]);
        }

        //Mit dieser For-Schleife gebe ich meine zuvor Random generierten Zahlen Vorwärts aus



        System.out.println("Rückwärts");
        //Damit ich sehe ab wo mein Array Rückwärts gelesen wird


        for (int i = array1.length - 1; i >= 0; i--)
        {
            System.out.println(array1[i]);
        }

        //Bei dieser For-Schleife lasse ich die selben Zahlen noch einmal Rückwärts auslesen (dafür sorgt mein array.length -1 und mein i--
    }
}