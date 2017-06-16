import java.util.Scanner;

public class MostrarInversos {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int[] numeros=new int[10];
		
		for(int i=0;i<numeros.length;++i){
		 System.out.println("Ingrese numero "+(i+1));
		 numeros[i]=Integer.parseInt(s.nextLine());}
		
		s.close();
		System.out.println("\nNumeros Mostrados en el orden Inverso\n");
		
		for(int i=numeros.length;i>0;--i){
			System.out.println(numeros[i-1]);//holis
		}
	}

}
