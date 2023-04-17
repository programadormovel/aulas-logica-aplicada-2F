public class Main {
    public static void main(String[] args) {
        // Laço enquanto
        int contador = 0;
        while(contador < 10){
            System.out.println("Contador = " + contador);
            // incremento
            contador = contador + 1;
        }
        // Laço faça enquanto
        int cont = 1;
        do {
            System.out.println(cont);
            cont++; // incremento
        }while(cont <= 10);

        // Laço para faça
        for(int x=0; x<10; x++){
            System.out.println(x);
        }
        // Vetor de 1 (uma) dimensão ou unidimensinal
        double[] nota = new double[500];
        nota[0] = 5.0;
        nota[1] = 10.0;
        nota[2] = 4.0;
        nota[3] = 5.0;
        nota[4] = 6.0;

        for(int x = 0; x < nota.length; x++){
            System.out.println(nota[x]);
        }
    }
}