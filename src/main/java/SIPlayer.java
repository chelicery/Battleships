import java.util.ArrayList;
import java.util.Arrays;

public class SIPlayer {
    private Ocean ocean = new Ocean();




    public void setComputerShips(){
        ArrayList<Integer> positionX = new ArrayList<>();
        ArrayList<Integer> positionY = new ArrayList<>();
        System.out.println("Computer doploying ships");

        for(int i = 0; i<4; i++) {
            delay();
            System.out.println("Ship " + (i+1) + " deployed");
            ocean.setShip((int) (Math.random() * 9),(int) (Math.random() * 9));
        }
    }

    public void delay(){
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
