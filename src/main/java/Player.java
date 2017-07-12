import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Player {
    private Ocean playerOcean = new Ocean();
    private String name;

    public Player(){
        setName();
        deployBattleships();
    }


    Scanner scn = new Scanner(System.in);


    public void setName(){
        System.out.println("Enter your name: ");
        String name = scn.nextLine();
        this.name = name;
    };
    public void deployBattleships(){
        playerOcean.printBoard();
        System.out.println( name + " this is your board");

        for(int i = 0; i < 5; i++) {
            System.out.println(" enter " + (i+1) + " ship coordinates:");
                System.out.println("enter X coordinate ");
                    int x = scn.nextInt();
                    while(x > 9 || x < 0){
                        System.out.println("You cannot place ship beyond the board, enter coordinate <9 & >=0");
                        System.out.println("enter X coordinate ");
                        x = scn.nextInt();
                    }
                System.out.println("enter Y coordinate");
                int y = scn.nextInt();
                    while(y > 9 || y < 0){
                        System.out.println("You cannot place ship beyond the board, enter coordinate <9 & >=0");
                        System.out.println("enter Y coordinate ");
                        y = scn.nextInt();
                    }
            if(playerOcean.emptyCoordinates(x, y)){
                playerOcean.setShip(x, y);
                System.out.println("Ship " + (i+1) + " deplyed" );
            } else {
                System.out.println("Wrong coordinates, ship is already deployed on this position");
                i--;
            }

        }
        System.out.println("This is yours board: ");
        playerOcean.printBoard();

    }


}
