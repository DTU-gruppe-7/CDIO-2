public class Account {
    private int balance = 1000;

    public boolean Withdraw(int amount){
        if(amount > this.balance){
            return false;
        } else{
            this.balance -= amount;
            return true;
        }
    }
}
