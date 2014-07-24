import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

import java.util.Random; // another random number generator

/**
 * A world where crabs and other animals live.
 * Some are friendly and some are not.
 * @author your name
 */
public class CrabWorld extends World
{
    
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x460 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(800, 600, 1);
        setBackground("sand.jpg");

        //addObject(new Lv1(), 400, 300 );
        addObject(new Crab(), 50,  50);
        init();
    }

    /**
     * add an actor to the world at a random location.
     * @param actor is the object to add to the world
     */
    public void addObject( Actor actor ) {
        int x = Greenfoot.getRandomNumber( getWidth() ); // a random x value between 0 and width of world
        int y = Greenfoot.getRandomNumber( getHeight() ); // a random y value between 0 and height of world
        // now add the actor to world at location x, y
        addObject( actor, x, y );
    }

    public void init(){
        
                                   /*  w   h   x   y*/
        addObject( new   Timer(), 780, 580 );                       
        addObject( new   Block_static(200,50,45), 100, 100);
        addObject( new   Block_static(50,350,0), 300, 0 );
        
        
        /*addObject( new   Block_static(200,200), 300, 400 );
        addObject( new   Block_dynamic(100,100, 300, 400,50,1,1), 300, 400 );
            */
    }
}