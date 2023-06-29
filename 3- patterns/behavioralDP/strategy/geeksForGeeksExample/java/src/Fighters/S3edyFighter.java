package Fighters;

import JumpingStrategies.JumpingBehaviors;
import KickingStrategies.KickingBehaviors;

public class S3edyFighter extends Fighter{
    public S3edyFighter(KickingBehaviors kickingBehavior , JumpingBehaviors jumpingBehavior){
        super(kickingBehavior , jumpingBehavior) ;
    }

    @Override
    public void display() {
        System.out.println("S3EDY FIGHTER");
    }
}
