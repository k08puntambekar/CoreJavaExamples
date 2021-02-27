package controlstatements;

public class ifElseExample {

    public static void main(String[] args) {
        String playerName = "Sachin";
        int playerRuns;

        if(playerName.equals("Sachin")) {
            playerRuns = 200;
        }else {
            playerRuns = 0;
        }

        System.out.println("Player Name is : " + playerName + " with runs : " + playerRuns);
    }

}
