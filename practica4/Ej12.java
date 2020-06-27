public class Ej12 {

    public static void main(String[] args)
    {
        int np=1;
        String numerosp="";
        int n=1;
        int suma=0;
        while(np<7)
        {
            n++;
            for(int x=1;x<n;x++)
            {
                if(n%x==0)
                {
                   suma=suma+x;
                }
            }
            if(suma==n)
            {
                np=np+1;
                numerosp=numerosp+suma+",";
                suma=0;
            }
            else
            {
                
                suma=0;
            }
        }
        System.out.println("No. Perfecto: "+numerosp);
    
    }
}