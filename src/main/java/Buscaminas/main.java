import java.util.Random;

public class main {
    public static void main(String[] args) {
        Matriz buscaminas = new Matriz();

        //llenamos la matriz de objetos tipo cuadrado
        for (int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                buscaminas.setCuadricula(new Cuadrado(), i,j);
            }
        }

        //asignando bomas aleatorias
        Random rand = new Random();
        int bombas = 0;
        boolean resultado;

        while (bombas < 10){
            int aleatorioI = rand.nextInt(9);
            int aleatorioJ = rand.nextInt(9);
            resultado = buscaminas.asignarBomba(aleatorioI, aleatorioJ);
            if (resultado){
                bombas++;
            }

        }

        //mostramos los nuevos valores con las bombas asignadas
        for (int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.println("("+ i +":" + j + ") -" + buscaminas.obtenerCuadrado(i,j).mostrarValor());
            }
        }


        buscaminas.algoritmo();














    }

}
