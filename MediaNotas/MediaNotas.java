public class MediaNotas {
    public static void main(String[] args) {

        double[] notas = {7.5, 8.0, 6.5, 9.0};
        
        double somaNotas = 0.0;

        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i];
        }

        double media = somaNotas / notas.length;

        System.out.println("A média aritmética das notas é: " + media);
    }
}