public class ClasseA implements InterfacciaX {

	double attributo1;
	
	public ClasseA() {
		this.attributo1 = 3.14;
	}
	
	public double getAttributo1() {
		return this.attributo1;
	}
	
	public void metodoA() {System.out.println("Metodo A della classe A");};
	public int metodoB() { return 100;};
	public void metodoC(String s) {System.out.println("Sono il metodo A della classe A" + s);};

}
