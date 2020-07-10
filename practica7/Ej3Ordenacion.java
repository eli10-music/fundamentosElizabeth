import sun.nio.cs.ArrayDecoder;

public class Ej3Ordenacion {

    
    public static void main(String[] args) {
        
        int[] arr, arrOrd;
        int n = 5;   //tamaño del arreglo
        int r = 5; //rango de aleatorios

        arr = generaArreglo(n,r);

        imprimirArreglo(n,arr);

        arrOrd = ordenaArreglo(n,arr);

        imprimirArreglo(n,arrOrd);
        
    }

    public static int[] generaArreglo( int n, int r  ){
        

        int[] arr = new int[n];

        //codigo para generar arreglo
        for(int i=0 ; i<=n ; i++){

            arr[i]=(int) (Math.random()*r);
            System.out.println(""+arr[i]);
            i++;
        }

        return arr;
    }

    public static void imprimirArreglo( int n, int[] arr ){

     

        System.out.println(""+arrOrd[k]);


        //codigo para imprimir arr
    }

    public static  int[] ordenaArreglo(int n, int[] arr){
        int[] arrOrd = new int[n];

        int mayor=200,ind;
        
        //código para ordenar arreglo

        for(int k=0 ; n ; k++){
            mayor=0;
            

            for (int i=1 ; n ; n++){
                if(arr[i]> mayor){
                    mayor=arr[i];
                    ind=i;
                   

                }
            }
            arr[ind]=0;
            arrOrd[k]=mayor;

        }



        

        return arrOrd;
    }


 
}