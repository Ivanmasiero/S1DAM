package ivan.POO.main;
import com.sun.jdi.connect.Connector;
import ivan.POO.EnteroGordo.BigNumber;
public class usoBigNumber {

        public static void main(String[] args) {
            //BigNumber bg = factorial(100);
            BigNumber a=new BigNumber(10);
            BigNumber b=new BigNumber(10);
            a.multiplica(3);
            System.out.println(a.getValue());
            a.suma(b,b);
            System.out.println(b.getValue());
        }

        /*private static BigNumber factorial(int n) {
            if (n==0) return new BigNumber(1);
            return factorial(n-1).multiplica(new BigNumber(),n);


        }*/
}
