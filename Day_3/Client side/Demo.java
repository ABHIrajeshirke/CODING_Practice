package Client;
import Developer.First;
import Developer.Second;

public class Demo 
{
        public static void main(String[] args) 
        {
                First f = new First(12);
                System.out.println(f.getNum());
                f.setNum(7);
                System.out.println(f.getNum());
                Second s = new Second();
                s.setName("Abhishek");
                System.out.println(s.getName());
        }
}
