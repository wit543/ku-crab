import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block_dynamic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block_dynamic extends Block
{
    /**
     * Act - do whatever the Block_dynamic wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int direction =0;
    public Block_dynamic(int width,int heigth,int X,int Y,int distance,int speed,int di){
       
        super(width,heigth,X,Y,distance,speed);
        direction=di;
        init();
        
    }
    public void act() 
    {
        // Add your action code here.
        if(direction== 0)
            moveY();
        else if(direction== 1)
            moveX();
    }    
}
