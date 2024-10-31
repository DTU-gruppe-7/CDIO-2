public class Account {
    private int balance = 1000;

    public int getBalance(){
        return this.balance;
    }
    
    public boolean withdraw(int amount){
        int newAmount = this.balance += amount;
        if(newAmount < 0){
            return false;
        } else{
            this.balance = newAmount;
            return true;
        }
    }

    public boolean deposit(int amount){
        int newAmount = this.balance += amount;
        if(newAmount < 0){
            return false;
        } else{
            this.balance = newAmount;
            return true;
        }
    }

}
