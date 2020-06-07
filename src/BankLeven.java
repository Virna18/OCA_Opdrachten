import java.util.Scanner;

public class BankLeven {
    public static void main (String [] args){
        Persoon jan = new Persoon();
        Persoon kees = new Persoon();
        Bank bank = new Bank();
        System.out.println("Jan heeft " + jan.portemonnee.euros + " euro in zijn portemonnee");
        bank.geldOpnemen(jan);
        System.out.println("Jan heeft na het opnemen van geld " + jan.portemonnee.euros + "euro in zijn portemonnee");
        System.out.println(kees.portemonnee.euros);
        bank.geldStorten(kees);
        System.out.println(kees.portemonnee.euros);
    }

}

class Bank {
    int balans = 150000;
    int opnamebedrag = 500;
    Scanner sc = new Scanner(System.in);
    void geldOpnemen(Persoon persoon){
        System.out.println("U heeft gekozen om geld op te nemen, voer uw 4 cijferige pincode in:");
        String invoer = sc.next();
        persoon.portemonnee.euros = persoon.portemonnee.euros + opnamebedrag;
        System.out.println("in geldopnemen");
        balans = balans - opnamebedrag;
        System.out.println(balans);
    }

    void geldStorten(Persoon persoon){
        int stortbedrag = 300;
        System.out.println("Voer uw 4 cijferige pincode in:");
        String invoer = sc.next();
        persoon.portemonnee.euros = persoon.portemonnee.euros - stortbedrag;
        balans = balans - stortbedrag;
        System.out.println(balans);
    }
}

class Persoon {
    Portemonnee portemonnee = new Portemonnee(500);
}

class Portemonnee{
    int euros;
    public Portemonnee(int geld){
        euros = geld;
    }
}


