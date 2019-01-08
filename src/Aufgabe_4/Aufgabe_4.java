package Aufgabe_4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Aufgabe_4
{
    public static void main(String[] args)
    {

        List<Freunde> meineFreunde = new ArrayList<>();
        //Array list für Freunde erstellen


        for (int i = 1; i<=5;i++)
        {
            meineFreunde.add(new Freunde(JOptionPane.showInputDialog(i+ ". Freund eingeben")));
        }
        //Mit einer For-Schleife den Nutzer seine Freunde eintragen lassen


        System.out.println("Meine Freunde heißen: " + meineFreunde);
        //Hiermit wird die Liste ausgegeben
    }
}
