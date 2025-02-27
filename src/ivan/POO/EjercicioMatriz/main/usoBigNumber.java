package ivan.POO.EjercicioMatriz.main;
import ivan.POO.EjercicioMatriz.EnteroGordo.BigNumber;
public class usoBigNumber {

        public static void main(String[] args) {
            //BigNumber bg = factorial(100);
            BigNumber a=new BigNumber(9);
            System.out.println(BigNumber.multiplica(a,3));


        }

        /*private static BigNumber factorial(int n) {
            if (n==0) return new BigNumber(1);
            return factorial(n-1).multiplica(new BigNumber(),n);


        }*/
}
