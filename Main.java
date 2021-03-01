// Marie Margrethe Riskær Povlsen 66708
// Mikkel Iuel 66443
// Nanna Holst Larsen 66438

//Teknik baseret på Carl-Emil Carlsen's kode fra forelæsning

import java.util.Scanner;
public class Main {
    static Situation[] situations;
    public static Scanner scanner;
    public static Player player;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        player = new Player(120, 35);

        ConnectedSituationsAndOptions();
        play(situations[0]);
    }

    static void play(Situation situation) {
        Situation nextSituation = situation.chooseOption();
        if (nextSituation != null) {
            play(nextSituation);
        }
    }

    static void ConnectedSituationsAndOptions() {
        situations = new Situation[]{
                //0
                new Situation("You wake up in a poorly lit room. You have no idea where you are.\n" +
                        "You see that the doorknob is missing. What do you choose?\n \n" +
                        "--> a: 'go back to sleep'\n--> b: 'look for doorknob'"),
                //1
                new Situation("Where do you look for the doorknob?\n \n" +
                        "--> a: 'look under the bed' \n--> b: 'look in bucket of pee' \n--> c: 'look in mannequins jacket'"),
                //2
                new Situation("You found the doorknob, put it back on the door and enter the next room.\n" +
                        "The room you enter smells of blood and decay.\n" +
                        "You see different tools lying around that resemble that of a taxidermist's.\n \n" +
                        "--> a: 'go left' \n--> b: 'go straight ahead'"),
                //3
                new Situation("As you go through the door a man attacks you out of nowhere.\n" +
                        "He shouts the name Knud, as if mistaking you for someone else.\n"),
                //4
                new Situation("As you enter the room you´re filled with confusion since you find yourself\n" +
                        "standing in the middle of a beauty salon. In front of the mirror sits a very life like\n" +
                        "human-sized doll. You decide to look around.\n \n" +
                        "--> a: 'check closet'\n--> b: 'look at doll'"),
                //5
                new Situation("As you look closer, you see that the closet can be pushed aside and you find\n" +
                        "yourself standing in an old storage room. In the corner you see an old ventilation shaft.\n" +
                        "What do you do now?\n \n" +
                        "--> a: 'go through vents' \n--> b: 'go back'"),

                //6
                new Situation("You enter a dining room. It looks like there's a teaparty going on.  \n" +
                        "Six human dolls sit around a dining table. They look at you and in union they \n" +
                        "say 'come play with us'.\n \n" +
                        "--> a: 'play' \n--> b: 'don't play'"),
                //7
                new Situation("As you inspect the doll you suddenly get eye contact and realize that " +
                        "it's alive. \nIt looks at you, then at the drawer of the makeup table and then back at you again.\n" +
                        "You look inside the drawer and find a piece of paper with the numbers 1010 0111.\n" +
                        "You see a numpad beside the door in the room and decide there must be a way to figure out " +
                        "the code. \n \n" +
                        "--> a: 167 \n--> b: 211 \n--> c: 143 \n--> d: 193"),
                //8
                new Situation("As the electronic lock opens and you hurry through the door you immediately\n" +
                        "hear footsteps from atop the stairs. In your panic you notice a walk-in freezer beside you.\n" +
                        "Where do you hide?\n \n" +
                        "--> a: 'hide in the freezer' \n--> b: 'hide under the stairs'"),
                //9
                new Situation("You wait in the freezer until the person is gone and try to leave. \nHowever, " +
                        "the door is locked from the outside and you freeze to death."),
                //10
                new Situation("You hurry under the stairs and try to hold your breath, but you soon find\n" +
                        "yourself standing face to face with your captor, Knud. You expect him to attack you,\n" +
                        "but he instead smiles and says 'What an interesting development. Tell you what, if you solve my\n" +
                        "riddle I'll give you a head start to run.' \n"),
                //11
                new Situation("Fight for your life!"),
                //12
                new Situation("You acquire a key, run up the stairs and unlock the door.\n" +
                        "You enter what seems to be a completely normal kitchen. It even has the same kettle\n" +
                        "that you have at home. As you look around you notice a dog exit in the locked door.\n" +
                        "There is also a door on your left from which you hear sounds resembling a dinner party\n" +
                        "with chatter and music. What's your next move? \n \n" +
                        "--> a: 'investigate sounds' \n--> b:'try to go through the dog exit'"),
                //13
                new Situation("As you try to squeeze yourself through the dog exit you get stuck halfway\n" +
                        "through. Suddenly you hear the basement door open and footsteps approach you.\n" +
                        "Someone grabs your leg and starts pulling. In front of you is only a wooden chair.\n" +
                        "What do you do? \n \n" +
                        "--> a: 'kick your attacker' \n--> b: 'grab the chair'"),
                //14
                new Situation("Unfortunately the chair is not very heavy and you get pulled back into the\n" +
                        "house, never to be seen again."),
                //15
                new Situation("You try to kick the person behind you"),

                //16
                new Situation("You hit the person with a decisive kick to the groin and hear him fall\n" +
                        "and hit something. You get yourself free from the dog exit and escape through the backyard."),
                //17
                new Situation("Your try to kick your attacker but hits only air. He pulls you back into the\n" +
                        "house and you are again in Knuds presence. Before he manages to do anything you kick again,\n" +
                        "hitting him in the chest so he falls back and hits his head. \n \n" +
                        "Press 'a' to keep going."),
                //18
                new Situation("You proceed through the door to the left and quickly lock the door behind you.\n" +
                        "As you turn around the room is filled with a deafening silence and you see 6 human dolls\n" +
                        "staring at you. In unison they say to you 'Come and play with us'. What do you do?\n \n" +
                        "--> a: 'play' \n--> b: 'don't play'"),
                //19
                new Situation("You decide to comply with the dolls' request, and sit down in the empty seat by " +
                        "the table"),
                //20
                new Situation("Still in unison they congratulate you and a new door opens behind you.\n" +
                        "You go through it and the crib in the corner indicates that it's a nursery. The wall\n" +
                        "to your right consists of shelves upon shelves filled with what looks to be normal-sized dolls\n" +
                        "and the rest of the room is filled with toys. You faintly hear crying coming from the crib.\n \n" +
                        "--> a: 'investigate crib' \n--> b: 'go through the next door'"),
                //21
                new Situation("The crib is empty but you hear shuffling behind you. As you turn around, you see\n" +
                        " that the dolls on the shelves have moved. They are now forming a word \n \n" +
                        "   o         o    o__ __o__/_   o            o__ __o         o         o      o__ __o    \n" +
                        "  <|>       <|>  <|    v       <|>          <|     v\\       <|>       <|>    /v     v\\   \n" +
                        "  < >       < >  < >           / \\          / \\     <\\      / \\       / \\   />       <\\ \n" +
                        "   |         |    |            \\o/          \\o/     o/      \\o/       \\o/  _\\o____       \n" +
                        "   o__/_ _\\__o    o__/_         |            |__  _<|/       |         |        \\_\\__o__ \n" +
                        "   |         |    |            / \\           |              < >       < >             \\  \n" +
                        "  <o>       <o>  <o>           \\o/          <o>              \\         /    \\\\         /  \n" +
                        "   |         |    |             |            |                o       o      o       o   \n" +
                        "  / \\       / \\  / \\  _\\o__/_  / \\ _\\o__/_  / \\               <\\__ __/>      <\\__ __/> \n" +
                        //ASCII art fundet på http://patorjk.com/software/taag/#p=display&f=Acrobatic&t=Type%20Something%20
                        "\nDo you leave and save yourself or stay and try to help these other victims? \n \n" +
                        "--> a: 'leave the others' \n--> b: 'stay behind and try to help'"),
                //22
                new Situation("You go through the door and see what you assume to be the main entrance.\n" +
                        "You get out of there."),
                //23
                new Situation("You stay and try to help the dolls, never to be seen again."),

                //24
                new Situation("Sadly you didn't escape Knuds Kælder. You will now be made into one of his\n" +
                        "dolls and stay in his house forever"),
                //25
                new Situation("You refuse to play with the dolls and search the room for an exit. \n" +
                        "The dolls are not happy and before you can get very far they overwhelm you and kill you.")
        };

        situations[0].options = new Option[]{
                new Option("a", situations[24]),
                new Option("b", situations[1])
        };
        situations[1].options = new Option[]{
                new Option("a", situations[1]),
                new Option("b", situations[1]),
                new Option("c", situations[2])
        };
        situations[2].options = new Option[]{
                new Option("a", situations[3]),
                new Option("b", situations[4])
        };
        situations[3].setBattle(
                new Enemy("a prisoner", 20, 50), situations[4], situations[24]);

        situations[4].options = new Option[]{
                new Option("a", situations[5]),
                new Option("b", situations[7])
        };
        situations[5].options = new Option[]{
                new Option("a", situations[6]),
                new Option("b", situations[4])
        };
        situations[6].options = new Option[]{
                new Option("a", situations[19]),
                new Option("b", situations[23])
        };
        situations[7].options = new Option[]{
                new Option("a", situations[8]),
                new Option("b", situations[7]),
                new Option("c", situations[7]),
                new Option("d", situations[7])
        };
        situations[8].options = new Option[]{
                new Option("a", situations[9]),
                new Option("b", situations[10])
        };
        situations[10].setRiddle(new Riddler("David's father has three sons. " +
                "Two of them are named Casper and Micheal. \n" +
                "What's the name of the third brother?\n ", "David") , situations[12], situations[11]);

        situations[11].setBattle(
                new Enemy("Knud", 25, 50), situations[12], situations[24]);

        situations[12].options = new Option[]{
                new Option("a", situations[6]),
                new Option("b", situations[13])
        };

       situations[13].options = new Option[]{
                        new Option("a", situations[15]),
                        new Option("b",situations[14])
       };
       situations[15].options = new Option[]{
               new Option("fail kick",situations[17]),
               new Option("success kick", situations[16])
       };
       situations[15].situationAttribute = SituationAttribute.RANDOM;

       situations[17].options = new Option[]{
                new Option("a", situations[18])
       };

       situations[18].options = new Option[]{
                new Option("a", situations[19]),
                new Option("b", situations[25])
       };

       situations[19].setGame(new Hangman("annabelle"),situations[24],situations[20]);

       situations[20].options = new Option[]{
                new Option("a",situations[21]),
                new Option("b", situations[22])
       };
       situations[21].options = new Option[]{
                new Option("a", situations[22]),
                new Option("b", situations[23])
       };

    }
}


