import entity.BrainFuckCode;
import entity.BrainFuckData;
import services.Interpreter;

/**
 *
 */
public class Test {
    public static void main(String[] args){

        String stringCode = "++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++\n" +
                " .>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.\n" +
                " ------.--------.>+.>." ;

        //String stringCodeWithInnerLoops = ">+>+>+>+>++<[>[<+++>->>>>>>+>+>+>+>++<[>[<+++>->>>>>>+>+>+>+>++<[>[<+++>->>>>>>+>+>+>+>++<[>[<+++>->>>>>+++[->+++++<]>[-]<<<<<<]<<]>[-]<<<<<]<<]>[-]<<<<<]<<]>[-]<<<<<]<<]>.";


        BrainFuckData data = new BrainFuckData();
        BrainFuckCode code = new BrainFuckCode(stringCode);
        Interpreter interpreter = new Interpreter();
        interpreter.interpret(data, code);
    }
}
