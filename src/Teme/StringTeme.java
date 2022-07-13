package Teme;

import java.util.Scanner;

public class StringTeme {
    public static void main(String[] args) {
        checkPassword();
        System.out.println("isPasswordValid()");
        getCharCount();
    }

// Ex.2 Scrie un program care sa numere literele, spatiile, numerele,
// si celelalte caractere dintr-un String. (folositi metodele String-ului)

    static void getCharCount() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a sentences:");
        String sentence = console.nextLine();
        int letters = 0;
        int numbers = 0;
        int spaces = 0;
        int characters = 0;

        for (int i = 0; i <= sentence.length() - 1; i++) {
            if (Character.isLetter(sentence.charAt(i))) {
                letters++;
            } else if (Character.isDigit(sentence.charAt(i))) {
                numbers++;
            } else if (Character.isWhitespace(sentence.charAt(i))) {
                spaces++;
            }
              else{
                  characters++;
            }
        }
        System.out.println(letters + " letters," + numbers + " numbers," + spaces + " spaces," + characters + " characters");
    }

    //   Ex 4
//Dezvolti partea de creare a unui nou cont intr-un magazin online si trebuie sa validezi ca parola aleasa de utilizator este corect scrisa.
// Scrie un program care sa verifice daca o parola este corecta.Regulile pentru ca o parola sa fie corecta sunt:
//parola trebuie sa aiba minim 10 caractere
//parola trebuie sa aiba doar litere sau cifre
//parola trebuie sa contina cel putin doua cifre
//	Daca parola introdusa nu este valida afiseaza un mesaj sugestiv si permite utilizatorul sa introduca o alta parola, pana cand introduce o parola valida (respecta regulile)
    public static boolean isPasswordValid() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter password");
        String password = console.nextLine();
        int countDigit = 0;
        if (password.length() < 10) {
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            if ((!Character.isLetter(password.charAt(i))) || (!Character.isDigit(password.charAt(i)))) {
                return false;
            }
            if (Character.isDigit(password.charAt(i))) {
                countDigit++;
            }
            if (countDigit < 2) {
                return false;
            }
        }
        return false;
    }


    //Ex 5
    public static void checkPassword() {
        String existingPassword = "ABC";
        boolean isCorectPassword = false;
        int i = 1;
        while ((i <= 3) && (!isCorectPassword)) {
            Scanner console = new Scanner(System.in);
            System.out.println("Insert password");
            String provadedPassword = console.nextLine();
            if (existingPassword.equals(provadedPassword)) {
                System.out.println("Parola introdusa este corecta");
                isCorectPassword = true;
            }
            i++;
        }
        if (isCorectPassword == false) {
            System.out.println("Parola introdusa nu este corecta");
        }
    }
}