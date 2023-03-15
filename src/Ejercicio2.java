public class Ejercicio2 {
    public static void main(String[] args){

        // PUNTO 1
        System.out.println("PUNTO 1");

        // A
        String str1 = "La pelota de mi perro";
        char letra = 'e';
        int largo = str1.length();
        int contador = 0;

        for (int num = 0; num < largo; num ++){
            if (str1.charAt(num) == letra){
            contador += 1;
        }}
        System.out.println("A) Cantidad de apariciones de la letra \"" + letra + "\" en el String \"" + str1 + "\": "
                + contador);

        // B
        String orden = "ascendente";
        int num1 = 34;
        int num2 = 56;
        int num3 = 15;
        int[] numeros_ordenados = new int[3];


        if (orden.equals("ascendente")){
            if (num1 < num2){
                numeros_ordenados[0] = num1;
                numeros_ordenados[2] = num2;
            } else{
                numeros_ordenados[0] = num2;
                numeros_ordenados[2] = num1;
            }
            if (num3 < numeros_ordenados[0]){
                numeros_ordenados[1] = numeros_ordenados[0];
                numeros_ordenados[0] = num3;
            } else if(num3 > numeros_ordenados[2]){
                numeros_ordenados[1] = numeros_ordenados[2];
                numeros_ordenados[2] = num3;
            } else{
                numeros_ordenados[1] = num3;
            }
        } else if (orden.equals("descendente")){
            if (num1 > num2){
                numeros_ordenados[0] = num1;
                numeros_ordenados[2] = num2;
            } else{
                numeros_ordenados[0] = num2;
                numeros_ordenados[2] = num1;
            }
            if (num3 > numeros_ordenados[0]){
                numeros_ordenados[1] = numeros_ordenados[0];
                numeros_ordenados[0] = num3;
            } else if(num3 < numeros_ordenados[2]){
                numeros_ordenados[1] = numeros_ordenados[2];
                numeros_ordenados[2] = num3;
            } else{
                numeros_ordenados[1] = num3;
            }
        }
        System.out.print("B) Orden " + orden + " --> ");
        for (int i : numeros_ordenados){
            System.out.print(i + " ");
        }

        // C
        int[] numeros = new int[]{93, 45, 67, 24, 9, 41, 77, 2};
        int num = 50;
        int acumulador = 0;

        for (int i : numeros){
            if (i > num){
                acumulador += i;
            }
        }
        System.out.println("\nC) Suma de los números mayores a " + num + ": " + acumulador);

        // PUNTO 2
        System.out.println("\nPUNTO 2");
        String str2 = "Primer dia de clases";
        String codigo_cesar = "";

        for (int i = 0; i < str2.length(); i++){
            int num_ascii = str2.charAt(i);
            char caracter_ascii = (char) (num_ascii + 2);
            codigo_cesar += caracter_ascii;
        }
        System.out.println("Palabra cifrada: " + codigo_cesar);
    }
}