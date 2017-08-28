
package connect4game;


public class Refree implements Runnable
{
    
    // This class is created to provide Referee Functionality and implements 
    // Runnable interface for multithreading
    
    private final Board playBoard;
    
    public Refree(Board b)
    {
        playBoard = b;
    }
    
    @Override
    public void run()
    {
        playBoard.monitor_board(); // call monitor board method of Board class.
    }      
}
