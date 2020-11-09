import java.util.Random;

public class Race extends Game {
    private int[] players;    
    private int trackLength;
    private Random rand;
    
    public Race (int players) {
        this.players = new int[players];          
        this.trackLength = 0;        
        this.rand = new Random();
    }

    @Override
    void initializeGame() {
        trackLength = rand.nextInt(1000);
        System.out.println(players+" racers.\nTrack length is "+trackLength);
    }

    @Override
    void makePlay(int player) {
        int travel = rand.nextInt(100);
        players[player] += travel;
        int left = trackLength-players[player];        
        System.out.println("Player " + player + " travelled " + travel + " meters.\n" + left + " to go!");
    }

    @Override
    boolean endOfGame() {
        for (int i = 0; i < players.length; i++) {
            if (players[i] >= trackLength) {
                return true;
            }
        }
        return false;
    }

    @Override
    void printWinner() {
        for (int i = 0; i < players.length; i++) {
            if (players[i] >= trackLength) {
                System.out.println("\nPlayer " + i + " is the winner!");
            }
        }

    }
    
}
