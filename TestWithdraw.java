public class TestWithdraw {
    public static void main (String[]args){
        System.out.println("Testing begins...");
        System.out.println("Checks if the balance can reach less than 0 using the method withdraw.");
        
        System.out.println("Creating test player...");
        Player test = new Player("testPlayer");

        System.out.println("The balance of test player is " + test.account.getBalance());
        
        System.out.println("Now 1001 point are withdrawn from the account of the test player");
        if (test.account.withdraw(0 - 1001)) {
            System.out.println("Withdraw process completed");
        } else {
            System.out.println("Withdraw process failed");
        }
    }
}