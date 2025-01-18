package ivan.tema5;
import java.util.Arrays;


/* Quiero un programa en el que saquemos 5 numeros aleatorios y lo guardemos en un array
 * mismo ejercicio pero no se puede repetir los 5 numeros
 * ordenarlos de mayor a menor*/

public class array {

	public static void main(String[] args) {
		int nums[]= new int [5];
		int n=49;
		int m=1;
		int numale;
		boolean flag;
		
		
		for(int i=0;i<nums.length;i++) {
			do {
				numale=(int) Math.floor(Math.random()*(n-m))+m;
				flag=true;
				
				for(int j=0;j<i;j++) {
					if (nums[j]==numale) {
						flag=false;
						break;
					}
				}
			}while(!flag);
			nums[i]=numale;
		}
		System.out.println(Arrays.toString(nums));
		
		for(int i=0;i<nums.length;i++) {
			int rey=i;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[j]>nums[rey]) {
					rey=j;
				}
				
			}
			int valor=nums[i];
			nums[i]=nums[rey];
			nums[rey]=valor;
			
			
		}
		System.out.println(Arrays.toString(nums));
		
		

	}

}
