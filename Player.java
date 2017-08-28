
package connect4game;


public class Player implements Runnable
{    
    // This class is created to provide Player Functionality and implements 
    // Runnable interface for multithreading 
    private final Board playBoard;
    private final char color;
    
    public Player(Board b, char c)
    {
        playBoard = b;
        color = c;
    }
    
    @Override
    public void run()
    {
        playBoard.take_turn(color); //Call take Turn method of board class.
    }         
    
}
