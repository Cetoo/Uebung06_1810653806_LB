package Aufgabe_5;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe_5
{
    public static void main(String[] args)
    {
        List<Student> studenten = new ArrayList<>();

        //ArrayList für Studenten wird erstellt

        studenten.add(new Student("Dennis", 1810653806, 2018));
        studenten.add(new Student("Larissa", 1810653996, 2018));
        studenten.add(new Student("Magdalena", 1810653784, 2018));

        //Ruft den Konstruktor auf um Objekte in meinem Array zu erzeugen


        for (Student item : studenten)
        {
            System.out.println(item);
        }

        //For each-Schleife für die Ausgabe meines Arrays
    }
}
