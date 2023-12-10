import java.util.*;

public class CreateFans{
    public static void main(String[] args){
        Fan fan1 = new Fan();

        fan1.SetSpeed(Fan._FAST);
        fan1.SetRadius(10);
        fan1.SetColor("yellow");
        fan1.SetON(true);

        System.out.println("Fan 1 is " + fan1.toString());

        Fan fan2 = new Fan();
           fan2.SetSpeed(Fan._MEDIUM);
        fan2.SetRadius(5);
        fan2.SetColor("blue");
        fan2.SetON(false);

        System.out.println("Fan 2 is " + fan2.toString());
    }
}