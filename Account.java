public class Account {
    private int balance = 1000;

    public int getBalance(){
        return this.balance;
    }
    
    public boolean withdraw(int amount){
        if(amount > this.balance || amount <= 0){
            return false;
        } else{
            this.balance -= amount;
            return true;
        }
    }

    public boolean deposit(int amount){
        if (amount <= 0){
            return false;
        }
        this.balance += amount;
            return true;
    }

}
