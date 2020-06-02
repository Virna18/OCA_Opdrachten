public class Demo {
    public static void main (String [] args){
        Persoon jan = new Persoon();
        Persoon kees = new Persoon();
        Bank bank = new Bank();
        System.out.println(jan.portemonnee.euros);
        bank.geldopnemen(jan);
        bank.geldopnemen(jan);
        bank.geldopnemen(jan);
        bank.geldopnemen(jan);
        System.out.println(jan.portemonnee.euros);
    }

}

class Bank {
    int balans = 150000;
    int opnamebedrag = 500;
    void geldopnemen(Persoon persoon){
        persoon.portemonnee.euros = persoon.portemonnee.euros + opnamebedrag;
        System.out.println("in geldopnemen");
        balans = balans - opnamebedrag;
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


