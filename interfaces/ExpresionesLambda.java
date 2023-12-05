package interfaces;

public class ExpresionesLambda implements Suma{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lambda como variable
		Suma expLambda, lamb2;
		expLambda = (int a, int b) ->{return (a+b);};
		int numA= 10, numB=5;
		System.out.println("Ejecución Lambda detallada: \n"+"Resultado: "+expLambda.calcular(numA, numB));
		
		Suma lamb3 = (int a, int b)->(a-b);
		System.out.println("Ejecución Lambda resumida:\n"+ lamb3.calcular(numA, numB));
		
		lamb2 = (int c, int d) -> (c*d);
		System.out.println("Resultado lambda3: "+ lamb2.calcular(3, 2));
	

	    //Lambda como parametro
		int numC=100, numD=20;
	
    	int resultado = operaciones(numC,numD,( a,b)->a*b); 
	    System.out.println("Resultado Lambda por parametro * : " + resultado);

	    double resultado1 = operaciones(numC,numD,( a,b)->a/b); 
	    System.out.println("Resultado Lambda por parametro / : " + resultado1);
	}	
	
	public static int operaciones(int a, int b, Suma op) {
		return op.calcular(a, b);
	}
	
	@Override
	public int calcular(int numA, int numB) {
		// TODO Auto-generated method stub
		return 0;
	}		
	
}



