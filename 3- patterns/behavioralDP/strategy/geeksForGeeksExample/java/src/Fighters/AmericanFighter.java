package Fighters;

import JumpingStrategies.JumpingBehaviors;
import KickingStrategies.KickingBehaviors;

public class AmericanFighter extends Fighter{
    public AmericanFighter(KickingBehaviors kickingBehavior , JumpingBehaviors jumpingBehavior){
        super(kickingBehavior,jumpingBehavior);
    }

    @Override
    public void display() {
        System.out.println("AMERICAN FIGHTER");
    }
}
