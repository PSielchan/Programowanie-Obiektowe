import agh.ics.oop.OptionsParser;
import agh.ics.oop.model.MoveDirection;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class OptionsParserTest {
    @Test
    public void OptionsParser(){
        String[] Tab = {"f","f","r","l"};
        ArrayList<MoveDirection> Tab2 = OptionsParser.main(Tab);
        for (MoveDirection moveDirection : Tab2) {
            System.out.println(moveDirection);
        }
    }
}
