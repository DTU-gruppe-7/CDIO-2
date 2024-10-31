class Board {
    

public static int getField(int faceValues) {
    switch (faceValues) {
        case 2:
            return 250;
        case 3:
            return -100;
        case 4:
            return 100;
        case 5:
            return -20;
        case 6:
            return 180;
        case 7:
            return 0;
        case 8:
            return -70;
        case 9:
            return 60;
        case 10:
            return -80;
        case 11:
            return -50;
        case 12:
            return 650;
        default:
            throw new IllegalArgumentException("Ugyldigt terningekast: " + faceValues);
    }
  
}

public static String toString(int faceValues) {
    switch (faceValues) {
        case 2:
            return "You reached the top of the tower and gained 250";
        case 3:
            return "You fell into a crater and lost 100";
        case 4:
            return "You reached the palace gates and gained 100";
        case 5:
            return "Your car broke and are now stranded in a cold Desert, you lose 20";
        case 6: 
            return "You arrived to Walled city and gained 180";
        case 7:
            return "You are in a monastery and nothing happens";
        case 8:
            return "You get lost in a dark cave and must pay 70 to get out";
        case 9:
            return "You arrived to the Huts in the mountain and gained 60";
        case 10:
            return "You reached the Werewall and a werewolf steals 80, but you get another try";
        case 11:
            return "You fell into a pit and payed 50 for someone to get you out";
        case 12:
            return "You found the famous Goldmine and sells the gold for 650";
        default:
            throw new IllegalArgumentException("Ugyldigt terningekast: " + faceValues);
    }
}

}

