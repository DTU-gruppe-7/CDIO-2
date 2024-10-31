public class Player {
    private String name;
    public Account account;
    
    public Player(String name) {
        this.name = name;
        this.account = new Account();
    }

    public String getName(){
        return this.name;
    }   
}
