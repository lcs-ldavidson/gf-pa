import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Threats
{

    GreenfootImage monster1;
    GreenfootImage monster2;
    GreenfootImage monster3;
    GreenfootImage monster4;
    int size;
    Paluno paluno;
    int difficulty;

    int timeElapsed;
    int speed;

    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Snake()
    {
        timeElapsed = 0;

        monster1 = new GreenfootImage("snake1.png");
        monster2 = new GreenfootImage("snake2.png");
        monster3 = new GreenfootImage("snake3.png");
        monster4 = new GreenfootImage("snake2.png");
        setImage(monster1);
        size = Greenfoot.getRandomNumber(10) + 170;

        speed = 6;
    }

    public void act() 
    {

        paluno = (Paluno) getWorld();
        timeElapsed += 1;
        movement();
        animate();

        getImage().scale(size, 69);

        setRotation(90);

        if (Greenfoot.getRandomNumber(100) <= 30) {
            move(((Paluno)getWorld()).difficulty);   
        }

        if (this != null) {
            hitBySword();
        }

        if(getWorld() == null) return;

        if (getY() >= 799)
        {
            getWorld().removeObject(this);
        }
    }

    void movement()
    {
        setLocation(getX(), getY() + speed);
    }

    void animate()
    {
        if (timeElapsed % 10 == 0)
        {

            if (getImage() == monster1)
            {
                setImage(monster2);   
            } else if (getImage() == monster2)
            {
                setImage(monster3);
            } else if (getImage() == monster3)
            {
                setImage(monster4);
            } else 
            {
                setImage(monster1);
            }
        }
    }

    void hitBySword() {

        if (intersects(((Paluno)getWorld()).raku1) && ((Paluno)getWorld()).raku1.getImage() == ((Paluno)getWorld()).raku1.swinger) {
            ((Paluno)getWorld()).raku1.kills += 1;
            if (((Paluno)getWorld()).raku1.leleTimer < 255) {
                ((Paluno)getWorld()).raku1.leleTimer += 5;
            }
            puff();
            getWorld().removeObject(this);
        }

    }
    
    void puff() {
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
        getWorld().addObject(new MonsterDust(getX(), getY()), getX() + Greenfoot.getRandomNumber(10) - 5, getY() + Greenfoot.getRandomNumber(10) - 5);
    }

}
