package cs2;
public class TorusGameOfLife extends GameOfLife{

    public TorusGameOfLife(){
        super();
    }

    public TorusGameOfLife(int size){
        super(size);
    }

    public TorusGameOfLife(int[][] board){
        super(board);
    }


    @Override
    public int neighbors(int row, int column){
        int aliveCount = 0;
        int previousRow = (row + size - 1) % size;
        int previousCol = (column + size - 1) % size;
        int newRow = (row + size + 1) % size;
        int newCol = (column + size + 1) % size;

        if(previous[previousRow][previousCol] == 1){
            aliveCount++;
        }
        
        if(previous[previousRow][newCol] == 1){
            aliveCount++;
        }
        
        if(previous[previousRow][column] == 1){ 
            aliveCount++;
        }
        
        if(previous[newRow][column] == 1){ 
            aliveCount++;
        }
        
        if(previous[newRow][previousCol] == 1){
            aliveCount++;
        }
        
        if(previous[newRow][previousCol] == 1){ 
            aliveCount++;
        }
        
        if(previous[row][previousCol] == 1){
            aliveCount++;
        }
        
        if(previous[row][newCol] == 1){ 
            aliveCount++;
        }
        
        return aliveCount;
    }
}
 