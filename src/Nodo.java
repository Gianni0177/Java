public class Nodo {
    
    private int info;
    private Nodo successivo;
//
    public Nodo(int info) {
        this.info = info;
        this.successivo = null;
    }
//
    public int getInfo() {
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }
    public Nodo getSuccessivo() {
        return successivo;
    }
    public void setSuccessivo(Nodo successivo) {
        this.successivo = successivo;
    }


    

}