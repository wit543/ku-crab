import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach. 
 * They like to eat sand worms, but must beware of lobsters. 
 */
public class Crab extends Animal
{   
    /**
     * constructor initializes state (data) for a new crab object
     */
    private GreenfootImage image1 = new GreenfootImage("actor.png");
    private GreenfootImage image2 = new GreenfootImage("actor.png");

    public Crab( ) 
    {
        // nothing to do yet.
        setImage(image1);
    }

    /**
     * act method provides the main behavior for a crab.
     */
    public void act()
    {
        // add crab behavior here, such as move( )
        moveWithKeyboard();
        Edge();

    }
    private void moveWithKeyboard(){
        String key = Greenfoot.getKey();
        if(isTouching(Environment.class)){
            setLocation(50,50);
        }
        else{
            if (key ==null) return;

            if (Greenfoot.isKeyDown("w")){
                // move forward
                turn(-90);
                //setRotation(90);
                move(10);
                turn(90);

            }
            else if(Greenfoot.isKeyDown("s")){

                //setRotation(270);
                turn(-90);
                move(-10);
                turn(90);

            }
            else if(Greenfoot.isKeyDown("a")){
                turn(-15);

            }
            else if(Greenfoot.isKeyDown("d")){
                turn(15);

            } 
            animation();
        }

    }

    private void Edge(){

        if(atWorldEdge()){
            turn(Greenfoot.getRandomNumber( 360 ));
        }

    }

    private void animation(){
        if(getImage()==image1){
            setImage(image2);
        }
        else{
            setImage(image1);
        }
    }
}

