//Ho un utente che si chiama Pinco Pallo, nato il 12/05/1994, il cui colore preferito è il magenta. La sua password sarà Pinco-Pallo-magenta-2011
/* package org.lessons.security;

public class PasswordGenerator {

    public static void main(String[] args) {

        String nome = "Pinco";
        String cognome = "Palla";
        String colorePreferito = "Magenta";
        int dataDiNascita = 12;
        int meseDiNascita = 05;
        int annoDiNascita = 1994;

        String StringConcatenatore = nome + "-" + cognome + "-" + colorePreferito;
    
        int intConcatenatore = dataDiNascita + meseDiNascita + annoDiNascita;

        String passwordGenerator = StringConcatenatore + "-" + intConcatenatore;

        System.out.print(passwordGenerator);

    }

} */


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

//ALTERNATIVA 1 Dichiarazione e inizializzazione insieme
/* import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Invece di dichiarare le variabili vuote, le inizializzi direttamente
        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();

        System.out.print("Inserisci il tuo cognome: ");
        String cognome = scanner.nextLine();

        System.out.print("Inserisci il tuo colore preferito: ");
        String colorePreferito = scanner.nextLine();

        System.out.print("Inserisci il tuo giorno di nascita: ");
        int giornoNascita = scanner.nextInt();

        System.out.print("Inserisci il tuo mese di nascita: ");
        int meseNascita = scanner.nextInt();

        System.out.print("Inserisci il tuo anno di nascita: ");
        int annoNascita = scanner.nextInt();

        // Il resto del codice rimane uguale
        int sommaNascita = giornoNascita + meseNascita + annoNascita;
        String password = nome + "-" + cognome + "-" + colorePreferito + "-" + sommaNascita;
        System.out.println("La tua password generata è: " + password);

        scanner.close();
    }
} */


// ALTERNATIVA 2 Usando metodi per organizzare meglio il codice

/* import java.util.Scanner;

public class PasswordGenerator {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String nome = chiediStringa("Inserisci il tuo nome: ");
        String cognome = chiediStringa("Inserisci il tuo cognome: ");
        String colorePreferito = chiediStringa("Inserisci il tuo colore preferito: ");

        int giornoNascita = chiediIntero("Inserisci il tuo giorno di nascita: ");
        int meseNascita = chiediIntero("Inserisci il tuo mese di nascita: ");
        int annoNascita = chiediIntero("Inserisci il tuo anno di nascita: ");

        String password = generaPassword(nome, cognome, colorePreferito,
                giornoNascita + meseNascita + annoNascita);

        System.out.println("La tua password generata è: " + password);
        scanner.close();
    } */

    // Metodo helper per leggere stringhe
   /*  private static String chiediStringa(String messaggio) {
        System.out.print(messaggio);
        return scanner.nextLine();
    } */
    // Metodo helper per leggere stringhe con controllo di input
   /*  private static String chiediStringa(String messaggio) {
        String input; // Dichiariamo la variabile che conterrà l'input dell'utente
        
        do{ // Usiamo un ciclo do-while per ripetere finché non otteniamo un input valido
            System.out.print(messaggio); // Mostriamo il messaggio all'utente
            input = scanner.nextLine(); // Leggiamo l'input dell'utente

            // Controlliamo se l'input è vuoto o contiene solo spazi
            if (input.trim().length() == 0) {
                System.out.println("⚠️ Non hai inserito alcun dato. Riprova!");
                // Il ciclo continuerà e richiederà nuovamente l'input
            }
        } while (input.trim().length() == 0); // Continua finchè l'input e vuoto

        return input.trim(); // Restituiamo l'input pulito dagli spazi iniziali e finali
    }


    // Metodo helper per leggere interi
    private static int chiediIntero(String messaggio) {
        System.out.print(messaggio);
        return scanner.nextInt();
    }

    // Metodo per generare la password
    private static String generaPassword(String nome, String cognome,
            String colore, int somma) {
        return nome + "-" + cognome + "-" + colore + "-" + somma;
    }
} */