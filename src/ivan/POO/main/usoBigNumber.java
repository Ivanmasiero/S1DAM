package ivan.POO.main;
import com.sun.jdi.connect.Connector;
import ivan.POO.EnteroGordo.BigNumber;
public class usoBigNumber {

        public static void main(String[] args) {
            //BigNumber bg = factorial(100);
            BigNumber a=new BigNumber(3564898);
            BigNumber b=new BigNumber(7546);
            a.multiplica(7546213);
            //b.suma(b,"333");
            //System.out.println(b.getValue());

            System.out.println(a.getValue());
            BigNumber.factorial(100);
        }


        /*private static BigNumber factorial(int n) {
            if (n==0) return new BigNumber(1);
            return factorial(n-1).multiplica(new BigNumber(),n);

        }*/
}
