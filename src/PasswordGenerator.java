import java.util.Scanner;
public class PasswordGenerator {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        //Dichiarazione delle variabili
        String nome;
        String cognome;
        String colorePreferito;
        int giornoNascita;
        int meseNascita;
        int annoNascita;

        //Richiesta all'utente dei dati
        System.out.print("Inserisci il tuo nome: ");
        nome = input.nextLine();

        System.out.print("Inserisci il tuo cognome: ");
        cognome = input.nextLine();

        System.out.print("Inserisci il tuo colore preferito: ");
        colorePreferito = input.nextLine();

        System.out.print("Inserisci il tuo giorno di nascita (es.12): ");
        giornoNascita = input.nextInt();

        System.out.print("Inserisci il tuo mese di nascita (es.08): ");
        meseNascita = input.nextInt();

        System.out.print("Inserisci il tuo anno di nascita (es.1995): ");
        annoNascita = input.nextInt();

        //Calcolo della somma di giorno, mese e anno di nascita
        int sommaNascita = giornoNascita + meseNascita + annoNascita;

        //Generazione della password
        String password = nome + "-" + cognome + "-" + colorePreferito + "-" + sommaNascita;

        //Stampa della password
        System.out.println("La tua password generata è: " + password);

        input.close();


    }

}
