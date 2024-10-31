public class TestRoll {
    public static void main(String[]args){
        System.out.println("Testing begins...");
        System.out.println("Checks the probability of the dice roll method");
        Dice dice1=new Dice();
        Dice dice2=new Dice();
        int sum;

        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;
        int count10 = 0;
        int count11 = 0;
        int count12 = 0;

        for(int i=0;i<=1000;i++){
            dice1.roll();
            dice2.roll();
            sum = dice1.getFaceValue() + dice2.getFaceValue();

                switch (sum){
                    case 2:
                    count2++;
                    break;
                    
                    case 3:
                    count3++;
                    break;

                    case 4:
                    count4++;
                    break;
                    
                    case 5:
                    count5++;
                    break;

                    case 6:
                    count6++;
                    break;

                    case 7:
                    count7++;
                    break;

                    case 8:
                    count8++;
                    break;

                    case 9:
                    count9++;
                    break;

                    case 10:
                    count10++;
                    break;

                    case 11:
                    count11++;
                    break;

                    case 12:
                    count12++;
                    break;
            }
        }
        System.out.println("Dice Roll Test Results (" + 1000 + " rolls):");
        System.out.println("Sum 2: " + count2 + " times (" + (count2 * 100.0 / 1000) + "%)");
        System.out.println("Sum 3: " + count3 + " times (" + (count3 * 100.0 / 1000) + "%)");
        System.out.println("Sum 4: " + count4 + " times (" + (count4 * 100.0 / 1000) + "%)");
        System.out.println("Sum 5: " + count5 + " times (" + (count5 * 100.0 / 1000) + "%)");
        System.out.println("Sum 6: " + count6 + " times (" + (count6 * 100.0 / 1000) + "%)");
        System.out.println("Sum 7: " + count7 + " times (" + (count7 * 100.0 / 1000) + "%)");
        System.out.println("Sum 8: " + count8 + " times (" + (count8 * 100.0 / 1000) + "%)");
        System.out.println("Sum 9: " + count9 + " times (" + (count9 * 100.0 / 1000) + "%)");
        System.out.println("Sum 10: " + count10 + " times (" + (count10 * 100.0 / 1000) + "%)");
        System.out.println("Sum 11: " + count11 + " times (" + (count11 * 100.0 / 1000) + "%)");
        System.out.println("Sum 12: " + count12 + " times (" + (count12 * 100.0 / 1000) + "%)");

        System.out.println("\nTheoretical Probabilities:");
        System.out.println("Sum 2: Theoretical Probability = 2.78%");
        System.out.println("Sum 3: Theoretical Probability = 5.56%");
        System.out.println("Sum 4: Theoretical Probability = 8.33%");
        System.out.println("Sum 5: Theoretical Probability = 11.11%");
        System.out.println("Sum 6: Theoretical Probability = 13.89%");
        System.out.println("Sum 7: Theoretical Probability = 16.67%");
        System.out.println("Sum 8: Theoretical Probability = 13.89%");
        System.out.println("Sum 9: Theoretical Probability = 11.11%");
        System.out.println("Sum 10: Theoretical Probability = 8.33%");
        System.out.println("Sum 11: Theoretical Probability = 5.56%");
        System.out.println("Sum 12: Theoretical Probability = 2.78%");
    }
}
