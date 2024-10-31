import java.util.Scanner;
class DiceGame {
    private static Player player1;
    private static Player player2;
    private static Scanner s;
    public static void main (String[]args){
        s = new Scanner(System.in);
        startGame();
        while (true) {
            player1.account.resetBalance();
            player2.account.resetBalance();
            while (true) {
                playRound(player1);
                if (player1.account.getBalance() > 3000){
                    congratulateWinner(player1);
                    break;
                }
                playRound(player2);
                if (player2.account.getBalance() > 3000){
                    congratulateWinner(player2);
                    break;
                }
            }
            System.out.println("The game is over");
            System.out.println("Do you want a rematch? (Y/N)");
            var respons = s.nextLine();
            if (!respons.equalsIgnoreCase("Y")){
                break; //Ends program if the condition isnt met.
            }
        }
        System.out.println("Thank you for playing - Goodbye!");
        s.close();
    }

    private static void startGame(){
        //get player names from user
        System.out.println("The game has begun. Buckle up!");
        System.out.println("Please input the username of player 1");
        player1=new Player(s.nextLine());
        System.out.println("Please input the username of player 2");
        player2=new Player(s.nextLine());
    }

    private static void congratulateWinner(Player player){
        System.out.println("Congratulations " + player.getName() + " you won and are now rich :D");
    }

    private static void playRound(Player player){
        Dice dice1=new Dice();
        Dice dice2=new Dice();

        do {
            System.out.println(player.getName() + " press enter to roll");
            s.nextLine();

            dice1.roll();
            dice2.roll();

            System.out.println("You rolled " + dice1.getFaceValue() + " with your first dice");
            System.out.println("You rolled " + dice2.getFaceValue() + " with your second dice");

            int diceSum = dice1.getFaceValue() + dice2.getFaceValue();
            int fieldValue = Board.getField(diceSum);

            System.out.println(Board.toString(diceSum));

            if (diceSum == 10) {
                if (!player.account.withdraw(fieldValue)){
                    System.out.println("Your balance is too low so the withdraw failed");
                }
                System.out.println(player.getName() + " your temp balance is now: " + player.account.getBalance() + System.lineSeparator()); 
            } else if (fieldValue < 0){
                if(!player.account.withdraw(fieldValue)) {
                    System.out.println("Your balance is too low so the withdraw failed");
                    break;
                }
                break;
            } else if (fieldValue >= 0) {
                player.account.deposit(fieldValue);
                break;
            } 
            
        } while (true);
        System.out.println(player.getName() + " your balance is now: " + player.account.getBalance() + System.lineSeparator());
    }
}