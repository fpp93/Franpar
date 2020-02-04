 package tema8_arrays;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero[];
		numero=new int[20];
		int cuadrado[];
		cuadrado=new int[20];
		int cubo[];
		cubo=new int[20];
		
		for(int i=0;i<numero.length;i++) {
			numero[i]=(int)(Math.random()*100);
			cuadrado[i]=(int)Math.pow(numero[i],2);
			cubo[i]=(int)Math.pow(numero[i],3);
			
			System.out.println("numero: " + numero[i]);
			System.out.println("Su cuadrado es: " + cuadrado[i]);
			System.out.println("Su cubo es: " + cubo[i]);
			System.out.println("-----------------------------");
			
		}
		
		

	}

}
