import java.util.Scanner;
class DiceGame {
    private static Player player1;
    private static Player player2;
    private static Scanner s;
    public static void main (String[]args){
        s = new Scanner(System.in);

    }


    
    private static void startGame(){
        //get player names from user
        System.out.println("The game has begun. Buckle up!")
        System.out.println("Please input the username of player 1");
        player1=new Player(s.nextline());
        System.out.println("Please input the username of player 2");
        player2=new Player(s.nextline());
    }

    private void congratulateWinner(Player player){
        System.out.println("Congratulations " + player.getName() + "you won and are now rich :D");
    }

    private void playRound(Player player){
        Dice dice1=new Dice();
        Dice dice2=new Dice();

        do {
            System.out.println(player.getname() + " press enter to roll");
            s.nextLine();

            dice1.roll();
            dice2.roll();

            System.out.println("You rolled " + dice1.getFaceValue() + " with your first dice");
            System.out.println("You rolled " + dice2.getFaceValue() + " with your second dice");

            if ((dice1.getFaceValue() + dice2.getFaceValue()) == 10) {
                player.withdraw(getField(getFaceValue(dice1) + getField(getFaceValue(dice2))));
                System.out.println(toString(getFaceValue(dice1) + getFaceValue(dice2)));

            } else if (getField(getFaceValue(dice1) + getField(getFaceValue(dice2)))<0){
                if(player.withdraw(getField(dice1, dice2))) {
                player.withdraw(getField(dice1, dice2));
                System.out.println(toString(dice1, dice2));
                break;
            } else {
                System.out.println("Your balance is too low and the game is now aborted. \nThank you for playing!");
                break;
            }
            
            } else if (getField(getFaceValue(dice1) + getField(getFaceValue(dice2)))>0) {
                player.deposit(getField(dice1, dice2));
                System.out.println(toString(dice1, dice2));
                break;
            } 
            
        } while (true);
    }
}