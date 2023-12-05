package interfaces;

public class ImplementaLambdaIF {

	public static void main(String[] args) {
		
		//declarar la exp Lambda y usar como variable
		
		Calcular lamb1;
		lamb1 = (a,b) -> a+b;
		
		int unNumA = 40, unNumB = 30;
		int resutlado1 = lamb1.calcular(unNumA, unNumB);
		System.out.println("El resutlado de la op es: "+ resutlado1);

		///método no devuelve datos ni recibe parametros
		
	/*	IntMsj lamb2 = () -> System.out.println("ESTAMOS VIENDO EXP LAMBDA COMO VARIABLE");
		lamb2.mostrarMsj();*/
		String mensaje="Argentina Programa 4.0";
		IntMsj lamb2 = (msj) -> System.out.println("Estamos viendo exp lambda - "+msj);
		lamb2.mostrarMsj(mensaje);
		
		
		////Expresion Lambda como parametro
		int resultado = calcular(20,65,(a,b)-> a+b);
		System.out.println("El resutlado de la suma es: "+ resultado);
		
		resultado = calcular(20,65,(a,b)-> a-b);
		System.out.println("El resutlado de la resta es: "+ resultado);
		
		resultado = calcular(80,65,(a,b)-> a/b);
		System.out.println("El resutlado cociente es: "+ resultado);
		
		resultado = calcular(20,65,(a,b)-> a*b);
		System.out.println("El resutlado producto es: "+ resultado);
		
	}
	public static int calcular(int numA, int numB, Calcular operacion) {
			return operacion.calcular(numA, numB);
	}

}
