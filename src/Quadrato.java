public class Quadrato implements getPerimetro{

    public double lato;
    
    @Override
    public double calcolaPerimetro() {
        double perimetro=this.lato*4;
        return perimetro;
    }

    
    
}
