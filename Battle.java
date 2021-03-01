// Marie Margrethe Riskær Povlsen 66708
// Mikkel Iuel 66443
// Nanna Holst Larsen 66438

//Teknik baseret på Carl-Emil Carlsen's kode fra forelæsning

public class Battle {
    public static void untilKO(Player player, Enemy enemy){
        while(player.isAlive() && enemy.isAlive()){
            int playerDealDamage = player.dealDamage();
            int enemyDealDamage = enemy.dealDamage();

            player.takeDamage(enemyDealDamage);
            enemy.takeDamage(playerDealDamage);

            System.out.println("You hit " + enemy.getName() + " with: " + player.dealDamage() + " damage, "
                    + enemy.getName() + " now has " + enemy.getHealth() + " healthpoints left.");
            System.out.println("You were hit by " + enemy.getName() + " with: " + enemy.dealDamage() + " damage, "
                    + " you now have " + player.getHealth() + " healthpoints left.");

        }
        if (!player.isAlive()) System.out.println("You were knocked out and dragged back to your cell. You never escaped " +
                "Knuds Kælder");
        if(!enemy.isAlive()) System.out.println("You managed to defend yourself and knocked out " + enemy.getName() + ".");
    }

}

