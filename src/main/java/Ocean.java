public class Ocean {

        private char[][] ocean;

        public Ocean(){
            ocean = new char[10][10];
        }

    public void printBoard(){
        System.out.println(" 0123456789 ");
            for (int i = 0; i < 10; i++) {
                System.out.print(i);
                for (int j = 0; j < 10; j++) {
                    System.out.print(ocean[i][j]);
                }
                System.out.println(i);
            }

        System.out.println(" 0123456789 ");


    }

    public void setShip(int x, int y){
        ocean[x][y] = '@';
    }

    public void blastShip(int x, int y){
        if(ocean[x][y] == '@'){
            System.out.println("Buum, you sunk the ship");
            ocean[x][y] = 'X'; // scored change to O
        } else {
            System.out.println("Oooh, you missed ");
            ocean[x][y] = 'O'; //missed change to x
        }

    }

    public int checkBoard(){
        int ships = 0;
        for(char[] row : ocean){
            for(char c : row){
                if(c == '@'){
                    ships++;
                }
            }

        }

        return ships;
    }
    //function returns false if ship is already deployed on this coordinates
    public boolean emptyCoordinates(int x, int y){
        if(ocean[x][y] == '@'){
            return false;
        } else {
            return true;
        }
    }


}
