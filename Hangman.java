// Marie Margrethe Riskær Povlsen 66708
// Mikkel Iuel 66443
// Nanna Holst Larsen 66438

//Baseret på vores tidligere udførte mini-assignments

import java.util.ArrayList;
public class Hangman {
    String word;
    int life = 6;
    boolean rightAnswer;

    Hangman(String word){
        this.word = word;
    }

    public void game (){
        guess (word,life);
    }

    public void guess (String word, int life) {
        char[] blank = new char[word.length()];
        ArrayList<Character> list = new ArrayList<>();
        int i = 0;

        while (i < word.length()) {
            blank[i] = '.';
            if (word.charAt(i) == ' ') {
                blank[i] = ' ';
            }
            i++;
        }

        System.out.println("The dolls continue to speak in unison: " +
                "'Let's play hangman. We will give you a hint. The word, is the name of our favorite sister, " +
                "she's quite famous. You have six guesses, if you lose, you'll get to become a part of our family.... forever!'");
        System.out.println(blank);
        System.out.println(" ____________\n" +
                " |          |\n" +
                " |          \n" +
                " |         \n" +
                " |          \n" +
                " |        \n" +
                " |\n");


        while (life > 0) {
            char guessedLetter = Main.scanner.next().charAt(0);


            if (list.contains(guessedLetter)) {
                System.out.println("You have already tried that letter.");
                System.out.println("The letters you have tried are the following: " + list);
                continue;
            }

            list.add(guessedLetter);

            if (word.contains(guessedLetter + "")) {
                for (int n = 0; n < word.length(); n++) {
                    if (word.charAt(n) == guessedLetter) {
                        blank[n] = guessedLetter;

                        System.out.println("That letter is correct!");
                    }
                }
            } else {
                life--;
                System.out.println("That letter is not in the name.");
            }
            if (word.equals(String.valueOf(blank))) {
                this.rightAnswer = word.equals(blank);
                System.out.println(blank);
                System.out.println("You guessed it. You can now enter the next room, if you dare.");
                break;
            } else {
                System.out.println(blank);
                System.out.println("Your remaining guesses is: " + life);
                System.out.println();
            }

            if (life == 0) {
                System.out.println("You didn't guess it. Now you'll stay here forever.");
                System.out.println(" ____________\n" +
                        " |          |\n" +
                        " |          0\n" +
                        " |         /|\\ \n" +
                        " |          |\n" +
                        " |         / \\ \n" +
                        " |\n");
                break;
            }

            if (life == 5) {
                System.out.println(" ____________\n" +
                        " |          |\n" +
                        " |          0\n" +
                        " |         \n" +
                        " |          \n" +
                        " |        \n" +
                        " |\n");

            } else if (life == 4) {
                System.out.println(" ____________\n" +
                        " |          |\n" +
                        " |          0\n" +
                        " |          |\n" +
                        " |          |\n" +
                        " |        \n" +
                        " |\n");

            } else if (life == 3) {
                System.out.println(" ____________\n" +
                        " |          |\n" +
                        " |          0\n" +
                        " |          |\\ \n" +
                        " |          |\n" +
                        " |        \n" +
                        " |\n");

            } else if (life == 2) {
                System.out.println(" ____________\n" +
                        " |          |\n" +
                        " |          0\n" +
                        " |         /|\\ \n" +
                        " |          |\n" +
                        " |        \n" +
                        " |\n");

            } else if (life == 1) {
                System.out.println(" ____________\n" +
                        " |          |\n" +
                        " |          0\n" +
                        " |         /|\\ \n" +
                        " |          |\n" +
                        " |           \\ \n" +
                        " |\n");

            }
        }
    }
}
