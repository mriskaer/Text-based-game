// Marie Margrethe Riskær Povlsen 66708
// Mikkel Iuel 66443
// Nanna Holst Larsen 66438

//Teknik baseret på Carl-Emil Carlsen's kode fra forelæsning

import java.util.Random;

public class Situation {
    private String description;
    public Option[] options;
    private Enemy enemy;

    private Riddler riddle;
    public Hangman game;
    public SituationAttribute situationAttribute;

    public String getDescription() {
        return this.description;
    }
    public Enemy getEnemy(){
        return this.enemy;
    }


    public void setSituationAttribute(SituationAttribute situationAttribute) {
        this.situationAttribute = situationAttribute;
    }

    public Situation(String description) {
        this.description = description;
    }
    public void setChoices(Option[] options){
        this.options = options;
    }

    public void setBattle(Enemy enemy, Situation winSituation, Situation loseSituation ){
        this.enemy = enemy;
        options = new Option[]{new Option("Win",winSituation), new Option("lose", loseSituation)};
    }
    public void setRiddle(Riddler riddle , Situation winSituation, Situation loseSituation){
        this.riddle = riddle;
        options = new Option[]{new Option("Win",winSituation), new Option("lose", loseSituation)};
    }
    public void setGame(Hangman game, Situation winSituation, Situation loseSituation){
        this.game = game;
        options = new Option[]{new Option("win", winSituation), new Option("lose", loseSituation)};
    }

    public Situation chooseOption() {
        System.out.println();
        System.out.println(description);

        if(riddle!= null){
            this.riddle.riddle();
            if(this.riddle.answerBool){ return options[0].getConsequence();} else {return  options[1].getConsequence();}
        }

        if(game != null) {
            this.game.game();
            if(this.game.rightAnswer){ return options[0].getConsequence();} else { return options[1].getConsequence();}
            }

        if(enemy != null){
            Battle.untilKO(Main.player, enemy);
            if (Main.player.isAlive()) return options[0].getConsequence();

        }
        if (situationAttribute == SituationAttribute.RANDOM){
            Random random = new Random();
            return options[random.nextInt(options.length)].getConsequence();

        }
        if (options == null) {
            return null;
        }

        Option selectedOption = getOptionSelectedByUser();
        return selectedOption.getConsequence();

    }

    public Option getOptionSelectedByUser() {
        System.out.println("Choose:");
        for (Option option : options) {
            System.out.println(option.getKeyword());
        }
        System.out.println();

        Option chosenOption = null;
        while (chosenOption == null) {
            String choice = Main.scanner.nextLine();
            for (Option option : options) {
                if (choice.equals(option.getKeyword())) {
                    chosenOption = option;
                    break;
                }
            }

            if (chosenOption == null) {
                System.out.println("When you think about it that doesn't make sense, choose again");
            }
        }
        return chosenOption;
    }
}
