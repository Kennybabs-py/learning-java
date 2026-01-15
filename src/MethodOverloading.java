public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("New score is " + calculateScore("Kehinde", 500));
        System.out.println("New score is "  + calculateScore(500));
    }

    public static int calculateScore(String playerName, int score){
        System.out.println(playerName + " scored " + score + " points");
        return score * 100;
    }

    public static int calculateScore(int score){
        calculateScore("Anonymous", 75);
        return score * 100;
    }

    public static int calculateScore(){
        System.out.println("Unnamed player scored no points");
        return 0;
    }

}
