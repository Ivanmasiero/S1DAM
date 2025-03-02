package ivan.POO.main;
import com.sun.jdi.connect.Connector;
import ivan.POO.EnteroGordo.BigNumber;
public class
usoBigNumber {
        public static void main(String[] args) {
            BigNumber a=new BigNumber();
            a=factorial(100);
            System.out.println(a.getValue());
        }
     private static BigNumber factorial(int n) {
        if (n == 0) return new BigNumber(1);
        return BigNumber.multiplica(factorial(n-1), n);
    }
}