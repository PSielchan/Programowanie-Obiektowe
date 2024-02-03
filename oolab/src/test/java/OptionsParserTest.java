import agh.ics.oop.OptionsParser;
import agh.ics.oop.model.MoveDirection;
import org.junit.jupiter.api.Test;

public class OptionsParserTest {
    @Test
    public void OptionsParser(){
        String[] Tab = {"f","f","r","l"};
        MoveDirection[] Tab2 = OptionsParser.main(Tab);
        for (MoveDirection moveDirection : Tab2) {
            System.out.println(moveDirection);
        }
    }
}
