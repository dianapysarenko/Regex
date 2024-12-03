public class Main {
    public static void main(String[] args) {
        ClasseIpV4 classeIpV4 = new ClasseIpV4();
        String myIP;

        System.out.print("Saisissez votre adresse IP: ");
        myIP = In.readString();

        assert myIP != null;

        if (classeIpV4.classA(myIP)) {
            System.out.println("Classe A");
            if (classeIpV4.adressePriveeClasse(myIP)) {
                System.out.print("Private adresse");
            } else if (classeIpV4.adresseApipaClasse(myIP)) {
                System.out.print("Adressage IP publique");
            } else if (classeIpV4.routeParDefaut(myIP)) {
                System.out.print("Route par defaut");
            }
        } else if (classeIpV4.classB(myIP)) {
            System.out.println("Classe B");
            if (classeIpV4.adressePriveeClasse(myIP)) {
                System.out.print("Private adresse");
            } else if (classeIpV4.adresseApipaClasse(myIP)) {
                System.out.print("Adressage IP publique");
            }
        } else if (classeIpV4.classC(myIP)) {
            System.out.println("Classe C");
            if (classeIpV4.adressePriveeClasse(myIP)) {
                System.out.println("Private adresse");
            } else if (classeIpV4.adresseApipaClasse(myIP)) {
                System.out.print("Adressage IP publique");
            }
        } else if (classeIpV4.loopback(myIP)) {
            System.out.println("Classe A");
            System.out.print("Loopback");
        } else {
            System.out.print("Votre IP n'a pas ete reconnue");
        }
    }
}