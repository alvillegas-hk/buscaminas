public class Matriz {
    private Cuadrado cuadricula[][];
    public Matriz(){
        this.cuadricula = new Cuadrado[9][9];
    }
    public void setCuadricula(Cuadrado cuadrado, int i, int j){
        cuadricula[i][j] = cuadrado;
    }
    public Cuadrado obtenerCuadrado(int i, int j){
        return this.cuadricula[i][j];
    }

    public boolean asignarBomba(int i, int j){
        return cuadricula[i][j].cambiarValor(Valor.BOMBA);
    }

    public void algoritmo(){

        for (int i = 0; i < 9; i++){

            for (int j = 0; j < 9; j++){

                if (cuadricula[i][j].getValor() == Valor.BOMBA){

                } else {
                    for (int x = 0; x < (i+1); x++){
                        for (int y = 0; y < 3; y++){
                            System.out.println("");
                        }
                    }
                }
            }
        }
    }


}
