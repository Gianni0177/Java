public class TestInterfacce {

	public static void main(String[] args) {
		ClasseA objA = new ClasseA();
		ClasseB objB = new ClasseB();
		
		objA.metodoA();
		System.out.println("Valore restituito dal metodo B della classe B " + objB.metodoB());
		
		InterfacciaX objX;
		//objX = objA;		
		objX = objB;
		
		objX.metodoA();
		
		InterfacciaX array[];
		
		array = new InterfacciaX[10];

		array[3] = objA;
		array[6] = objB;
		
	}
}
