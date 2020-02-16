package cs2;
//imports needed to run the tester
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

    public class GOLTester {

    	@Test
        public void testOneStep1(){
            int[][] Before = {{0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 1, 1, 1, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0}};

            int[][] After = {{0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 0, 0, 0}};

            TorusGameOfLife GameOfLife = new TorusGameOfLife(Before);
            GameOfLife.oneStep();
            assertArrayEquals(After, GameOfLife.getBoard());
        }

        @Test
        public void testOneStep2(){
            int[][] Before = {{0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 1, 1, 1, 0},
                        {0, 1, 1, 1, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0}};

            int[][] After = {{0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 1, 0, 0},
                        {0, 1, 0, 0, 1, 0},
                        {0, 1, 0, 0, 1, 0},
                        {0, 0, 1, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0}};

            TorusGameOfLife GameOfLife = new TorusGameOfLife(Before);
            GameOfLife.oneStep();
            assertArrayEquals(After, GameOfLife.getBoard());
        }

        @Test
        public void testOneStep3(){
            int[][] Before = {{0, 0, 0, 0, 0, 0},
                    {0, 1, 1, 0, 0, 0},
                    {0, 1, 1, 0, 0, 0},
                    {0, 0, 0, 1, 1, 0},
                    {0, 0, 0, 1, 1, 0},
                    {0, 0, 0, 0, 0, 0}};

            int[][] After = {{0, 0, 0, 0, 0, 0},
                        {0, 1, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0, 0},
                        {0, 0, 0, 0, 1, 0},
                        {0, 0, 0, 1, 1, 0},
                        {0, 0, 0, 0, 0, 0}};

            TorusGameOfLife GameOfLife = new TorusGameOfLife(Before);
            GameOfLife.oneStep();
            assertArrayEquals(After, GameOfLife.getBoard());
        }

        @Test
        public void testOneStep4(){
            int[][] Before = {{1, 0, 0, 0, 0, 1},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0, 1}};

            int[][] After = {{1, 0, 0, 0, 0, 1},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0, 1}};

            TorusGameOfLife GameOfLife = new TorusGameOfLife(Before);
            GameOfLife.oneStep();
            assertArrayEquals(After, GameOfLife.getBoard());
        }

        @Test
        public void testOneStep5(){
            int[][] Before = {{0, 0, 0, 0, 0, 0},
	                    {0, 1, 0, 0, 1, 0},
	                    {0, 0, 1, 1, 0, 0},
	                    {0, 0, 1, 1, 0, 0},
	                    {0, 1, 0, 0, 1, 0},
	                    {0, 0, 0, 0, 0, 0}};

            int[][] After = {{0, 0, 0, 0, 0, 0},
	                    {0, 0, 1, 1, 0, 0},
	                    {0, 1, 0, 0, 1, 0},
	                    {0, 1, 0, 0, 1, 0},
	                    {0, 0, 1, 1, 0, 0},
	                    {0, 0, 0, 0, 0, 0}};

            TorusGameOfLife GameOfLife = new TorusGameOfLife(Before);
            GameOfLife.oneStep();
            assertArrayEquals(After, GameOfLife.getBoard());
        }

        @Test
        public void testNeighbors1(){
            int[][] A = {{0, 0, 0},
                    {0, 0, 0},
                    {0, 1, 1}};

            TorusGameOfLife GameOfLife = new TorusGameOfLife(A);
            assertEquals(1, GameOfLife.neighbors( 2, 1));
        }

        @Test
        public void testNeighbors2(){
            int[][] A = {{1, 0, 0, 0, 1},
                    {0, 0, 0, 0, 1},
                    {0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0},
                    {1, 1, 0, 0, 1}};

            TorusGameOfLife GameOfLife = new TorusGameOfLife(A);
            assertEquals(5, GameOfLife.neighbors( 0, 0));
        }

        @Test
        public void testNeighbors3(){
            int[][] A = {{1, 0, 0, 1, 1},
                    {1, 0, 0, 0, 1},
                    {1, 0, 0, 0, 1},
                    {1, 0, 0, 0, 1},
                    {1, 1, 0, 0, 1}};

            TorusGameOfLife GameOfLife = new TorusGameOfLife(A);
            assertEquals(3, GameOfLife.neighbors( 4, 1));
        }

        @Test
        public void testNeighbors4(){
            int[][] A = {{0, 1, 1, 1, 0},
                    {0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0},
                    {0, 1, 0, 1, 0}};

            TorusGameOfLife GameOfLife = new TorusGameOfLife(A);
            assertEquals(5, GameOfLife.neighbors( 4, 2));
        }

        @Test
        public void testNeighbors5(){
            int[][] A = {{1, 1, 1, 1, 1},
                    {1, 1, 1, 1, 1},
                    {1, 1, 1, 1, 1},
                    {1, 1, 1, 1, 1},
                    {1, 1, 1, 1, 1}};

            TorusGameOfLife GameOfLife = new TorusGameOfLife(A);
            assertEquals(8, GameOfLife.neighbors( 2, 2));
        }

        @Test
        public void testEvolution1(){
            int[][] Before = {{0, 0, 0, 0, 0, 0, 0},
		                    {0, 0, 0, 1, 0, 0, 0},
		                    {0, 0, 0, 1, 0, 0, 0},
		                    {0, 0, 0, 1, 0, 0, 0},
		                    {0, 0, 0, 1, 0, 0, 0},
		                    {0, 0, 0, 1, 0, 0, 0},
		                    {0, 0, 0, 0, 0, 0, 0}};
            int[][] After = {{0, 0, 0, 0, 0, 0, 0},
		                    {0, 0, 0, 1, 0, 0, 0},
		                    {0, 0, 1, 0, 1, 0, 0},
		                    {0, 1, 0, 0, 0, 1, 0},
		                    {0, 0, 1, 0, 1, 0, 0},
		                    {0, 0, 0, 1, 0, 0, 0},
		                    {0, 0, 0, 0, 0, 0, 0}};

            TorusGameOfLife GameOfLife = new TorusGameOfLife(Before);
            GameOfLife.evolution(2);
            assertArrayEquals(After, GameOfLife.getBoard());
        }

        @Test
        public void testEvolution2(){
            int[][] Before = {{0, 0, 0, 0, 0, 0, 0},
		                    {0, 0, 0, 0, 0, 0, 0},
		                    {0, 0, 0, 1, 0, 0, 0},
		                    {0, 0, 1, 1, 1, 0, 0},
		                    {0, 0, 0, 1, 0, 0, 0},
		                    {0, 0, 0, 0, 0, 0, 0},
		                    {0, 0, 0, 0, 0, 0, 0}};
            int[][] After = {{0, 0, 0, 0, 0, 0, 0},
		                    {0, 0, 0, 1, 0, 0, 0},
		                    {0, 0, 1, 1, 1, 0, 0},
		                    {0, 1, 1, 0, 1, 1, 0},
		                    {0, 0, 1, 1, 1, 0, 0},
		                    {0, 0, 0, 1, 0, 0, 0},
		                    {0, 0, 0, 0, 0, 0, 0}};

            TorusGameOfLife GameOfLife = new TorusGameOfLife(Before);
            GameOfLife.evolution(3);
            assertArrayEquals(After, GameOfLife.getBoard());
        }

        @Test
        public void testEvolution3(){
            int[][] Before = {{0, 0, 0, 0, 0, 0, 0},
		                    {0, 0, 0, 0, 0, 0, 0},
		                    {0, 0, 0, 0, 0, 1, 0},
		                    {0, 0, 0, 0, 1, 1, 0},
		                    {0, 0, 0, 1, 0, 1, 0},
		                    {0, 0, 1, 1, 1, 1, 0},
		                    {0, 0, 0, 0, 0, 0, 0}};
            int[][] After = {{0, 0, 0, 0, 0, 0, 0},
		                    {0, 0, 0, 0, 0, 0, 0},
		                    {0, 0, 0, 0, 1, 1, 0},
		                    {0, 0, 0, 0, 0, 1, 1},
		                    {0, 0, 1, 0, 0, 0, 1},
		                    {0, 0, 1, 1, 0, 1, 0},
		                    {0, 0, 0, 1, 1, 0, 0}};

            TorusGameOfLife GameOfLife = new TorusGameOfLife(Before);
            GameOfLife.evolution(1);
            assertArrayEquals(After, GameOfLife.getBoard());
        }

        @Test
        public void testEvolution4(){
            int[][] Before ={{1, 1, 0, 0, 0},
                    {1, 1, 0, 0, 0},
                    {0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0}};
            int[][] After = {{1, 1, 0, 0, 0},
                    {1, 1, 0, 0, 0},
                    {0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0}};

            TorusGameOfLife GameOfLife = new TorusGameOfLife(Before);
            GameOfLife.evolution(5);
            assertArrayEquals(After, GameOfLife.getBoard());
        }

        @Test
        public void testEvolution5(){
            int[][] Before ={{1, 0, 0, 0, 0},
		                    {0, 0, 0, 0, 0},
		                    {0, 0, 1, 0, 0},
		                    {0, 0, 0, 0, 0},
		                    {0, 0, 0, 0, 0}};
            int[][] After = {{0, 0, 0, 0, 0},
		                    {0, 0, 0, 0, 0},
		                    {0, 0, 0, 0, 0},
		                    {0, 0, 0, 0, 0},
		                    {0, 0, 0, 0, 0}};

            TorusGameOfLife GameOfLife = new TorusGameOfLife(Before);
            GameOfLife.evolution(7);
            assertArrayEquals(After, GameOfLife.getBoard());
        }
   }