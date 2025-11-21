public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]), j = 2,  p = 2, count = 0 ;
        System.out.println("Prime numbers up to " + n);
        boolean [] arr = new boolean [n+1];
        arr [0] = false;
        arr [1] = false;
        
        for (int i = 2; i < arr.length; i++) {
            arr [i] = true;
        }
    
        while(p <= Math.sqrt(n))
        {
            j = p;
           while(j < arr.length)
           {
            if(j%p == 0 && j != p)
            {
                arr[j] = false;
            }
            j++;
           } 
           p++;
        }
        for (int i = 2; i < arr.length; i++)
         {
            if(arr[i] == true)
            {
            System.out.println(i);
            count++;
            }
        }
              System.out.print("There are " + count + " primes between " + "2 and " + n + " (");
              double  r = (double) count / n ;
              System.out.print((int)(r * 100 )+ "% are primes)");

        
    }
}