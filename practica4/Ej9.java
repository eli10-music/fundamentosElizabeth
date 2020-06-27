import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n;
        int may=0;
        int men=100000;
        int cont=0;
        System.out.print("ingresa los numero a comparara=  ");
            n=sc.nextInt();

    
       
        do{
            

        
            if(n<men){
                men=n;
            }
            if(n>may){
                may=n;
            }

            cont=cont-1;

        }while(cont!=0);
        

        System.out.println("el numero mayor es ="+ may);
        System.out.println("el numero menor es ="+ men);




    }}

    