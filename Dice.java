class Dice {
    private int faceValue;

    public void roll() {
       this.faceValue = (int)(Math.random() * 6) + 1;
    }
    public int getFaceValue(){
            return faceValue;
        }
}
