package cs2;

public class GameOfLife{
	//Attributes for GameOfLife
	int size;
	int[][] board;
	int[][] previous;
	
	public GameOfLife() {
		this(0);
	}
	
	public GameOfLife(int size) {
		this.size =size;
		board = new int[size][size];
		previous = new int[size][size];
	}
	
	public GameOfLife(int[][] board) {
		this.size = board.length;
		
		this.board = new int[size][size];
		previous = new int[size][size];
		
		for(int i = 0; 1 < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				this.board[i][j] = board[i][j];
				this.previous[i][j] = board[i][j];
					
			}
		}	
	}
	
	
	//Getters and setters allowing the board to be implemented and update the new board
	public void setBoard(int[][] board) {
		this.board = board;
	}
	
	public int[][] getBoard(){
	return board;
	}
	
	public void setPreviousBoard(int[][] previousBoard) {
		this.previous = previousBoard;
		
	}
	
	
	//oneStep method allows for the cells to be transformed into the next shape/board
	public void oneStep() {
		for(int i = 0; i < this.board.length; i++) {
			for(int j = 0; j < this.board[i].length; j++) {
				previous[i][j] = this.board[i][j];
				
			}
		}
	
		
		for(int i = 0; i < this.board.length; i++) {
			for(int j = 0; j < this.board[i].length; j++) {
				int neighbors = neighbors(i,j);
				int alive = previous[i][j];
				if(alive == 1) {
					if(neighbors == 1 || neighbors == 2) {
						this.board[i][j] =1;
						
					}
					else {
						this.board[i][j] = 0;
						
					}	
				}
				else {
					if(neighbors == 3) {
						this.board[i][j] = 1;
					}
				}
			}
		}
	}
	
	
	//neighbors method it goes over every cell and manipulates it according to the rules at the current board.
	public int neighbors(int row, int column){
        int aliveCount = 0;

        if(column+1 < board.length && previous[row][column+1] == 1){ //This targets the middle right neighbor
            aliveCount++;
        }

        if(row+1 < board.length && previous[row+1][column] == 1){ // This targets the lower middle neighbor
            aliveCount++;
        }

        if(column-1 >= 0 && column > 0 && previous[row][column-1] == 1){ //This targets the middle left neighbor
            aliveCount++;
        }

        if(row-1 >= 0 && previous[row-1][column] == 1){ //This targets the upper middle neighbor
            aliveCount++;
        }

        if(row-1 >= 0 && column + 1 < board.length && previous[row-1][column+1] == 1){  //This targets the upper right neighbor
            aliveCount++;
        }

        if(row+1 < board.length && column+1 < board.length && previous[row+1][column+1] == 1){ //This targets the lower right neighbor
            aliveCount++;
        }

        if(row+1 < board.length && column-1 >= 0 && previous[row+1][column-1] == 1){ //This targets the lower left neighbor
            aliveCount++;
        }

        if(row-1 >= 0 && column-1 >=0 && previous[row-1][column-1] ==1){ //This targets the upper left neighbor
            aliveCount++;
        }

        return aliveCount;
    }
	//evolution method creates a new board every time the game is casted while keeping count of the rounds it has gone through
	public void evolution(int n) {
		int i = 0;
		while(i < n) {
			oneStep();
			i++;
		}
	}
}