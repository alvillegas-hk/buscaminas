public class Cuadrado{

    private Valor valor;
    private boolean desencadenador;
    private boolean estadoVisible;
    private boolean banderaVisible;
    private boolean interrogacionVisible;

    public Cuadrado() {
        this.desencadenador = false;
        this.estadoVisible = false;
        this.banderaVisible = false;
        this.interrogacionVisible = false;
        this.valor = Valor.VACIO;
    }
    public String mostrarValor(){
        return("el valor del cuadrado " + this.valor );
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    public boolean cambiarValor(Valor valor){
        boolean resultado = false;
        if (this.valor != valor){
            resultado = true;
            setValor(valor);
        }

        return resultado;
    }

    public Valor getValor() {
        return valor;
    }

}
