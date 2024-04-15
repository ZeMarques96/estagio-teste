import java.util.Arrays;

public class Ex05 {
    public static void main(String[] args) {
        String palavra = "pipoca";
        String[] array = new String[palavra.length()];
        String[] arrayInvertido = new String[palavra.length()];

        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(palavra.charAt(i));
        }

        for (int i = array.length -1; i >= 0; i--) { 
            arrayInvertido[i] = array[i];
        }

        System.out.println(Arrays.toString(arrayInvertido));
        
    }
}
