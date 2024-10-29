import java.util.Scanner;
class DiceGame {
    private static Player player1;
    private static Player player2;
    private static Scanner s;
    public static void main (String[]args){
        s = new Scanner(System.in);

    }
    private void startGame(){
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
}