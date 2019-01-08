package Aufgabe_4;

public class Freunde
{
    private String name;



    public Freunde(String name)
    {
        this.name = name;
    }

    //Da der Attribut String auf private ist brauche ich einen Konstruktor


    @Override
    public String toString()
    {
        return "\n" + this.name + "\n____________________\n";
    }

    //toString überschreiben für eine schöne Formatierung mit Trennabschnitten
}
