import java.util.ArrayList;
import java.util.Arrays;

public class SIPlayer {
    private Ocean ocean = new Ocean();
    private static int I = 0;
    private static int J = 0;


    public SIPlayer(){
        setComputerShips();
    }

    public Ocean getOcean() {
        return ocean;
    }

    public void setComputerShips(){
        ArrayList<Integer> positionX = new ArrayList<>();
        ArrayList<Integer> positionY = new ArrayList<>();
        System.out.println("Computer doploying ships");

        for(int i = 0; i<5; i++) {
            delay();
            System.out.println("Ship " + (i+1) + " deployed");
            ocean.setShip((int) (Math.random() * 9),(int) (Math.random() * 9));
        }
    }

    public void computerShoot(Ocean ocean){
            while(I < 10) {
                while (J<10){
                ocean.blastShip(I, J);
                J++;
                    System.out.println("J: " + J );
                break;
                }
                System.out.println("I: " + I);
                I++;
                break;
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
