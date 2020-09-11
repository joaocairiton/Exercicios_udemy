package reaproveitamentodeclasse;

public class ReaproveitamentoDeClasse {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador( "bastiao","brasil", 31, 1.75f, 82.9f, 11, 2, 1);
        l[1] = new Lutador("ze", "EUA", 80, 1.75f, 82.9f, 11, 2, 1);
        l[2] = new Lutador("wilker", "IRAQUE", 31, 1.75f, 60.9f, 11, 2, 1);
        l[3] = new Lutador("chico", "paris", 31, 1.75f, 82.9f, 11, 2, 1);
        l[4] = new Lutador( "gordofredo","argentina", 31, 1.75f, 82.9f, 11, 2, 1);
        l[5] = new Lutador("magrelo", "urugai", 31, 1.75f, 82.9f, 11, 2, 1);
       

        l[4].status();
    }

}
