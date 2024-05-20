public class App {
    public static void main(String[] args) throws Exception {
        Metodos metodos = new Metodos();
        //Arreglo A
        //System.out.println("Arreglo A");
        int[] A= new int[10];
        for (int i = 0; i < 10; i++){
        A[i] = (int)(Math.random()*99+1);
        //System.out.print(A[i]+" ");   
        }
        //System.out.println(""); 
        //Arreglo b
        //System.out.println("Arreglo B");
        int []B =new int[20];
        for (int i = 0; i < 10; i++){
            B[i] = A[i];
            //System.out.print(B[i]+" ");
        }
        for (int i=10; i<20;i++){
            B[i] = (int)(Math.random()*99+1);  
            //System.out.print(B[i]+" ");
        }
        //System.out.println("");
        //Arreglo c
        //System.out.println("Arreglo c");
        int []C =new int[100];
        for (int i = 0; i < 20; i++){
            C[i] = B[i];
            //System.out.print(C[i]+" ");
        }
        for (int i=20; i<100;i++){
            C[i] = (int)(Math.random()*99+1);  
            //System.out.print(C[i]+" ");
        }
        //System.out.println("");
        //Arreglo D
        //System.out.println("Arreglo D");
        int []D =new int[1000];
        for (int i = 0; i < 100; i++){
            D[i] = C[i];
            //System.out.print(D[i]+" ");
        }
        for (int i=100; i<1000;i++){
            D[i] = (int)(Math.random()*99+1);  
            //System.out.print(D[i]+" ");
        }
        //System.out.println("");
        //Arreglo E
        //System.out.println("Arreglo E");
        int []E =new int[5000];
        for (int i = 0; i < 1000; i++){
            E[i] = D[i];
            //System.out.print(E[i]+" ");
        }
        for (int i=1000; i<5000;i++){
            E[i] = (int)(Math.random()*99+1);  
            //System.out.print(E[i]+" ");
        }
        //System.out.println("");
        //Arreglo F
        //System.out.println("Arreglo F");
        int []F =new int[10000];
        for (int i = 0; i < 5000; i++){
            F[i] = E[i];
            //System.out.print(F[i]+" ");
        }
        for (int i=5000; i<10000;i++){
            F[i] = (int)(Math.random()*99+1);  
            //System.out.print(F[i]+" ");
        }
        //System.out.println("");
        //Arreglo G
        //System.out.println("Arreglo G");
        int []G =new int[30000];
        for (int i = 0; i < 10000; i++){
            G[i] = F[i];
            //System.out.print(G[i]+" ");
        }
        for (int i=10000; i<30000;i++){
            G[i] = (int)(Math.random()*99+1);  
            //System.out.print(G[i]+" ");
        }
        //System.out.println("");

        //Metodos
        //Medicion Burbuja mejorado
        System.out.println("Burbuja mejorado con 10 datos");
        metodos.BurbujaMejorado(A);
        System.out.println("Burbuja mejorado con 20 datos");
        metodos.BurbujaMejorado(B);
        System.out.println("Burbuja mejorado con 100 datos");
        metodos.BurbujaMejorado(C);
        System.out.println("Burbuja mejorado con 1000 datos");
        metodos.BurbujaMejorado(D);
        System.out.println("Burbuja mejorado con 5000 datos");
        metodos.BurbujaMejorado(E);
        System.out.println("Burbuja mejorado con 10000 datos");
        metodos.BurbujaMejorado(F);
        System.out.println("Burbuja mejorado con 30000 datos");
        metodos.BurbujaMejorado(G);
        //Medicion seleccion
        System.out.println("Seleccion con 10 datos");
        metodos.Seleccion(A);
        System.out.println("Seleccion con 20 datos");
        metodos.Seleccion(B);
        System.out.println("Seleccion con 100 datos");
        metodos.Seleccion(C);
        System.out.println("Seleccion con 1000 datos");
        metodos.Seleccion(D);
        System.out.println("Seleccion con 5000 datos");
        metodos.Seleccion(E);
        System.out.println("Seleccion con 10000 datos");
        metodos.Seleccion(F);
        System.out.println("Seleccion con 30000 datos");
        metodos.Seleccion(G);
        //Medicion Inserccion
        System.out.println("Inserccion con 10 datos");
        metodos.Inserccion(A);
        System.out.println("Inserccion con 20 datos");
        metodos.Inserccion(B);
        System.out.println("Inserccion con 100 datos");
        metodos.Inserccion(C);
        System.out.println("Inserccion con 1000 datos");
        metodos.Inserccion(D);
        System.out.println("Inserccion con 5000 datos");
        metodos.Inserccion(E);
        System.out.println("Inserccion con 10000 datos");
        metodos.Inserccion(F);
        System.out.println("Inserccion con 30000 datos");
        metodos.Inserccion(G);
        
    }
}
