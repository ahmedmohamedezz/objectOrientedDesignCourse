package Fighters;

import JumpingStrategies.JumpingBehaviors;
import KickingStrategies.KickingBehaviors;

public abstract class Fighter {
    // attributes
    JumpingBehaviors jumpingBehavior ;
    KickingBehaviors kickingBehavior ;

    // constructor
    public Fighter(){

    }
    public Fighter(KickingBehaviors kickingBehavior , JumpingBehaviors jumpingBehavior){
        this.kickingBehavior = kickingBehavior ;
        this.jumpingBehavior = jumpingBehavior ;
    }
    // methods
    public void punch(){
        System.out.println("all fighters punch in the same way");
    }
    public void roll(){
        System.out.println("all fighters roll in the same way");
    }
    public void kick(){
        kickingBehavior.kick() ;
    }
    public void jump(){
        jumpingBehavior.jump();
    }
    public abstract void display() ;    // each fighter introduces himself in a different way
    // setters

    public void setJumpingBehavior(JumpingBehaviors jumpingBehavior) {
        this.jumpingBehavior = jumpingBehavior;
    }

    public void setKickingBehavior(KickingBehaviors kickingBehavior) {
        this.kickingBehavior = kickingBehavior;
    }
}
