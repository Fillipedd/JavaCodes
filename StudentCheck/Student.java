public class Student {


    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;

    public void przedstawSie() {
        System.out.println("Nazywam się " + imie + " " + nazwisko);
    }
    public void podajNrIndeksu() {
        System.out.println("Moj numer indeksu to : " + numerIndeksu);
    }
    public void podajEmail() {
        System.out.println("Moj email to : " + email);
    }
    public void zalogujSie() {
        System.out.println("Loguje się za pomocą :" + nick);
    }
}
