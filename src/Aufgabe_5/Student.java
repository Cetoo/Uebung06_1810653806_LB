package Aufgabe_5;

public class Student
{
        private String name;
        private int matrikelnummer;
        private int jahrgang;

        //Attribute


    public Student(String name, int matrikelnummer, int jahrgang)
    {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.jahrgang = jahrgang;
    }

    //Konstruktor für student


    //Getter und Setter da unsere Attribute private sind
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getMatrikelnummer()
    {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer)
    {
        this.matrikelnummer = matrikelnummer;
    }

    public int getJahrgang()
    {
        return jahrgang;
    }

    public void setJahrgang(int jahrgang)
    {
        this.jahrgang = jahrgang;
    }



    @Override
    public String toString()
    {
        return "Mein Name ist " + getName() + " und ich habe die Matrikelnummer " + getMatrikelnummer() + ". Ich bin im Jahrgang " + getJahrgang();
    }
}
