package model;
import model.SalaCine;
import model.MatrizNumerica;


public class Controller {

    private SalaCine cinemark;
    private MatrizNumerica matriz1; 
    private MatrizNumerica matriz2;
     // Declarando sala de cine

    /**
     * Constructor de la clase Controller para inicializar 
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Controller 
     */

    public MatrizNumerica sumarMatrices(){
    int filas = matriz1.getMatriz().length;
    int columnas = matriz1.getMatriz()[0].length;

    MatrizNumerica resultado = new MatrizNumerica(filas, columnas);
     
     for(int i = 0; i < filas; i++) {
            for(int j = 0; j <columnas; j++){
                int suma = matriz1.getMatriz()[i][j] + matriz2.getMatriz()[i][j];
                resultado.insertarValor(i,j, suma);
            }
    }
            return resultado;
    }




    public Controller() {

        
    }

    public void inicializarMatrices(int nfilas, int ncolumnas){
        matriz1 = new MatrizNumerica(nfilas, ncolumnas);
        matriz2 = new MatrizNumerica(ncolumnas, ncolumnas);
         }


    public void inicialiceSala() {
        cinemark = new SalaCine(7,7);
    }

    public String mostrarSala() {
        return cinemark.toString();
    }

    public void comprarSilla(int fila, int asientoEnFila) {
        cinemark.reservarAsiento(fila, asientoEnFila);
    }

    public int cantidadFilas() {
        return cinemark.retornarCantFilas();
    }

    public int cantidadColumnas() {
        return cinemark.retornarCantColumnas();
    }

    public MatrizNumerica getMatriz1 () {
        return matriz1;
    }
    public MatrizNumerica getMatriz2 () {
        return matriz2;
    }


}
