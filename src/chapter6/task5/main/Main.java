package chapter6.task5.main;
import chapter6.task5.entities.*;
/**
 *
 * @author Sukhocheva Maryana
 */
public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        model.connectToSiemensOnline();
        model.startCall("71252");
        System.out.println(model.searchForCall());
        model.breakCall();
        
    }
}
