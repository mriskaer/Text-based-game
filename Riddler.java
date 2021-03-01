// Marie Margrethe Riskær Povlsen 66708
// Mikkel Iuel 66443
// Nanna Holst Larsen 66438

//Baseret på vores tidligere udførte mini-assignments

public class Riddler {
    String question;
    String answer;
     boolean answerBool;

     Riddler(String question, String answer){
         this.answer= answer;

         this.question = question;
     }

    public void riddle() {

        System.out.println(this.question);
        String guess = Main.scanner.nextLine();
        this.answerBool = guess.equals(this.answer);
        if (answerBool) {
            System.out.println("That's correct, here's the key to the basement-door.");

        }
        else {
            System.out.println("That's incorrect, fight me.");
        }
    }
    public String getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

}



