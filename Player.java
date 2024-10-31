public class Player {
    private String name;
    private Account account;
    
    public Player(String name, Account account) {
        this.name = name;
        this.account = new Account();

    }

    public String getName(){
        return name;
    }  

    public boolean deposit(int amount) {
        return account.deposit(amount);
    }

    public boolean withdraw(int amount) {
        return account.withdraw(amount);
    }

    public int getBalance() {
        return account.getBalance();
    }
    
}
