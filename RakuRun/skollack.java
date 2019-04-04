import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class skollack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class skollack extends Boss
{

    GreenfootImage image1;
    GreenfootImage image2;
    GreenfootImage image3;
    GreenfootImage image4;
    Paluno paluno;
    int timeElapsed;
    int driftSpeed;

    public skollack() {
        image1 = new GreenfootImage("skollack1.png");
        image2 = new GreenfootImage("skollack2.png");
        image3 = new GreenfootImage("skollack1.png");
        image4 = new GreenfootImage("skollack3.png");
        driftSpeed = Greenfoot.getRandomNumber(10) - 5;
        paluno = (Paluno) getWorld();
        timeElapsed = 0;
        setImage(image1);
        
        
        

    }
    public void act() 
    {

        if (timeElapsed == 1) {
            getWorld().removeObjects(getObjectsInRange(300, Particle.class));
            getWorld().removeObjects(getObjectsInRange(300, AtmosphereClouds.class));
            if (((Paluno)getWorld()).skollackHealth <= 2) {
            blow();
        }
        }
        
        animate();
        changeDrift();
        drift();
        correctPosition();
        turnTowards(((Paluno)getWorld()).raku1.getX(), ((Paluno)getWorld()).raku1.getY());
        timeElapsed += 1;

        if (Greenfoot.getRandomNumber(500) <= 3) {
            attack();
        }
        
        if (Greenfoot.getRandomNumber(350) <= 1 && ((Paluno)getWorld()).skollackHealth <= 2) {
            blow();
        }

        if (intersects(((Paluno)getWorld()).raku1) && ((Paluno)getWorld()).raku1.getImage() == ((Paluno)getWorld()).raku1.swinger
        && ((Paluno)getWorld()).skollackHealth != 1) {
            teleportAway();
        }
    }    

    void animate() {
        if (timeElapsed % 7 == 0) {

            if (getImage() == image1)
            {
                setImage(image2);
            }

            else if (getImage() == image2)
            {
                setImage(image3);
            }

            else if (getImage() == image3)
            {
                setImage(image4);
            }

            else if (getImage() == image4)
            {
                setImage(image1);
            }
        }
    }

    void changeDrift() {
        if (timeElapsed % 50 == 0) {
            driftSpeed = Greenfoot.getRandomNumber(10) - 5;
        }
    }

    void drift() {
        setLocation(getX() + driftSpeed, getY());
    }

    void correctPosition() {
        if (getX() <= 90) {
            driftSpeed = 5;
        }

        if (getX() >= 610) {
            driftSpeed = -5;
        }

    }

    void teleportAway() {
        
        puff();
        getWorld().removeObject(((Paluno)getWorld()).tentacles1);
        getWorld().removeObject(((Paluno)getWorld()).smoke1);
        getWorld().removeObject(((Paluno)getWorld()).barrier1);
        ((Paluno)getWorld()).skollackHealth -= 1;
        ((Paluno)getWorld()).bossCanBeSummoned = true;
        
        

        getWorld().removeObjects(getObjectsInRange(300, Magic.class));

        getWorld().removeObject(this);

    }

    void attack() {
        getWorld().addObject(new Magic(1), getX(), getY() - 30);
        getWorld().addObject(new Magic(2), getX() + 40, getY());
        getWorld().addObject(new Magic(3), getX() - 40, getY());
    }

    void puff() {
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
        getWorld().addObject(new teleportParticle(2), getX(), getY());
    }
    
    void blow() {
        getWorld().addObject(new windBlast(), ((Paluno)getWorld()).skollack1.getX(), 430);
    }
}
