public class Ejercicio1 {
    public static void main(String[] args) {

        //Punto 1
        System.out.println("PUNTO 1");
        int inicio = 1;
        int fin = 10;

        //1a
        System.out.println("\nA)");
        while (inicio <= fin){
            System.out.println(inicio);
            inicio += 1;
        }

        //1b
        System.out.println("\nB)");
        inicio = 1;
        while (inicio <= fin){
            if (inicio % 2 == 0){
                System.out.println(inicio);
            }
            inicio += 1;
        }

        //1c VER SI ESTÁ BIEN
        System.out.println("\nC)");
        int opcion = 1;
        inicio = 1;
        switch (opcion){
            case 1:
                while (inicio <= fin){
                    if (inicio % 2 == 0){
                        System.out.println(inicio);
                    }
                    inicio += 1;
                }
                break;
            case 2:
                while (inicio <= fin){
                    if (inicio % 2 != 0){
                        System.out.println(inicio);
                    }
                    inicio += 1;
                }
                break;
            default:
                System.out.println("La opción es incorrecta.");
        }

        //1d
        System.out.println("\nD)");
        inicio = 1;
        for (fin = 10; fin >= inicio; fin -= 1){
            if (fin % 2 == 0){
                System.out.println(fin);
            }}

        // Punto 2d
        System.out.println("\nPUNTO 2");
        System.out.println("\nD)");

        int ingresos = 735000;
        int vehiculos = 3;
        int inmuebles = 4;
        //Falta una entrada

        if ((ingresos >= 489083) && (vehiculos >= 3) && (inmuebles >= 3)){
            System.out.println("Pertenece al segmento de ingresos altos.");
        } else{
            System.out.println("No pertenece al segmento de ingresos altos.");
        }
    }
}