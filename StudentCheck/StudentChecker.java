
public class StudentChecker {
    public static void main(String[] args ){

        Student franek = new Student();
        franek.imie = "Franciszek";
        franek.nazwisko = "Brzeczyszczykiewicz";
        franek.nick = "FraBrze";
        franek.email = "franekbrzecz@gmail.com";
        franek.numerIndeksu = 1999555;


        Student michal = new Student();
        michal.imie = "Michał";
        michal.nazwisko = "Smith";
        michal.nick = "SzalonyJohny";
        michal.email= "michalS@wp.pl";
        michal.numerIndeksu = 1995123;


        Student filip = new Student();
        filip.imie = "Filip";
        filip.nazwisko = "Dowgiało";
        filip.nick = "FilipD";
        filip.email = "filipdwg@gmail.com";
        filip.numerIndeksu = 123456789;


        Student[] students = new Student[3];
        students[0] = franek;
        students[1] = michal;
        students[2] = filip;

        for (int i = 0; i < students.length; i++) {
            students[i].przedstawSie();
            students[i].podajEmail();
            students[i].podajNrIndeksu();
            students[i].zalogujSie();
        }
    }
}
