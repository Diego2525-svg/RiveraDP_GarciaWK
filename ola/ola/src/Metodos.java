import java.util.Arrays;
public class Metodos {
    public void BurbujaMejorado(int[] arregloOriginal){
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        int cont=arreglo.length;
        long startTime = System.currentTimeMillis();
        for (int i=cont-1;i>0;i--){
            for (int j=0;j<i;j++){
                if(arreglo[j]>arreglo[j+1]){
                        int aux=arreglo[j];
                        arreglo[j]=arreglo[j+1];
                        arreglo[j+1]=aux;
                    }
                }
            }
            long endTime = System.currentTimeMillis() - startTime; 
            System.out.println("Tarda "+endTime+"ms");
    }

    public void Seleccion(int[] arregloOriginal){
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                        indiceMinimo = j;
                    }
                }
                int smallerNumber = arreglo[indiceMinimo];
                arreglo[indiceMinimo] = arreglo[i];
                arreglo[i] = smallerNumber;
            }
            long endTime = System.currentTimeMillis() - startTime;
            System.out.println("Tarda "+endTime+"ms");
        }

     public void  Inserccion(int[] arregloOriginal){
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);   
        long startTime = System.currentTimeMillis();
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j-1 ;
            while (i >= 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                    i--;
                }
                arreglo[i + 1] = key;
            }
            long endTime = System.currentTimeMillis() - startTime;
            System.out.println("Tarda "+endTime+"ms");
        }
        
}
