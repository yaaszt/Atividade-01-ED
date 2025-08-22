public class Idades {
    public static void main(String[] args) {
    
        int[] idades = {15, 20, 17, 25, 30, 18, 19, 22, 16, 45};

        System.out.println("Idades maiores que 18 anos:");
        
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > 18) {
                System.out.println(idades[i]);
            }
        }
    }
}