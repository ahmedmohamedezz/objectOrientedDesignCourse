import Fighters.Fighter;
import Fighters.S3edyFighter;
import JumpingStrategies.JumpingBehaviors;
import JumpingStrategies.LongJump;
import JumpingStrategies.ShortJump;
import KickingStrategies.KickingBehaviors;
import KickingStrategies.LightningKick;
import KickingStrategies.TornadoKick;

public class Main {
    public static void main(String[] args) {
        // jumping behaviors
        JumpingBehaviors longJump = new LongJump() ;
        JumpingBehaviors shortJump = new ShortJump() ;

        // kicking behaviors
        KickingBehaviors lightningKick = new LightningKick() ;
        KickingBehaviors tornadoKick = new TornadoKick() ;


        Fighter s3adyFighter = new S3edyFighter(lightningKick , shortJump) ;

        s3adyFighter.display();
        s3adyFighter.punch();
        s3adyFighter.jump();
        System.out.println("----- Changing jump behavior -----");
        s3adyFighter.setJumpingBehavior(new LongJump());
        s3adyFighter.jump();
    }
}