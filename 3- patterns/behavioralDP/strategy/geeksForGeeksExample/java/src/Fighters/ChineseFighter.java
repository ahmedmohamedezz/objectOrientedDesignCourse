package Fighters;

import JumpingStrategies.JumpingBehaviors;
import KickingStrategies.KickingBehaviors;

public class ChineseFighter extends Fighter{

    public ChineseFighter(KickingBehaviors kickingBehavior , JumpingBehaviors jumpingBehavior){
        super(kickingBehavior,jumpingBehavior);
    }
    @Override
    public void display() {
        System.out.println("CHINESE FIGHTER");
    }
}
