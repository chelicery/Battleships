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
            System.out.println("Trafiony");
            ocean[x][y] = '#'; // scored change to #
        } else {
            System.out.println("Pudlo!");
            ocean[x][y] = 'x'; //missed change to x
        }

    }

    public boolean checkBoard(){

        for(char[] row : ocean){
            for(char c : row){
                if(c == '@'){
                    return false;
                }
            }
        }

        return true;
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
