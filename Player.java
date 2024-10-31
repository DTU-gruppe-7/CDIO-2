public class Player {
    private String name;
    private Account account;
    
    public Player(String name) {
        this.name = name;
        this.account = new Account();
    }

    public String getName(){
        return this.name;
    }  

    public boolean deposit(int amount) {
        return this.account.deposit(amount);
    }

    public boolean withdraw(int amount) {
        return this.account.withdraw(amount);
    }

    public int getBalance() {
        return this.account.getBalance();
    }
    
}
