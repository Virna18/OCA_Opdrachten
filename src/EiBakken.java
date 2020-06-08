import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

public class EiBakken {
    public static void main(String[] args) throws GeblokkeerdException {
        Mens virna = new Mens();
        virna.bakpan.bakken(virna);

    }
}

class Mens {
    Bakpan bakpan = new Bakpan();
    Scanner sc = new Scanner(System.in);
    boolean eibakken;

    void eiPakken() {
        Eierdoos eierdoos = new Eierdoos();

        for (int i = 0; i < 6 ; i++) {
            System.out.println("Hoeveel eieren wil je bakken? Er zijn nog "
                    + eierdoos.aantal + " eieren.");
            int invoer = sc.nextInt();
            eierdoos.aantal = eierdoos.aantal - invoer;
            invoer = 0;

            if (eierdoos.aantal < invoer) {
                eibakken = true;
                System.out.println("Er zijn te weinig eieren om te bakken.");
            } else{
                System.out.println("Er zitten nu nog " + eierdoos.aantal +
                        " eieren in de doos.");
                break;
            }
        }
    }
}

class Bakpan {

    void bakken(Mens mens) throws GeblokkeerdException {
        mens.eiPakken();
        if (mens.eibakken) {
            throw new GeblokkeerdException();
        } else {
            System.out.println("De eieren worden gebakken");
            mens.eiPakken();
        }


//    void ophogen (){
//            int temperatuur;
//
//        }
    }
}

class Eierdoos {
    ArrayList<Ei> eieren = new ArrayList<>(6);
    int aantal = 6;

    public Eierdoos() {
        for (int i = 0; i < 7; i++) {
            eieren.add(new Ei());
        }
    }

}

class Ei {
}

class GeblokkeerdException extends Exception {

}
