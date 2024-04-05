 class Fibonacci {
   static int min(int x, int y){
        return (x <= y ) ? x : y ;
    }
   static int FibonacciSearch (int arr[] , int x , int n ) {
        int fibm2 = 0;
        int fibm1 = 1;
        int fibm = fibm2 + fibm1;

        while (fibm < n) {
            fibm2 = fibm1;
            fibm1 = fibm;
            fibm = fibm2 + fibm1;
        }
            int offSet = -1;

            while (fibm > 1) {
                int i = min(offSet + fibm2 ,n -1);
                if (arr[i] > x) {
                    fibm = fibm1;
                    fibm1 = fibm2;
                    fibm2 = fibm - fibm1;
                    offSet = i;
                } else if (arr[i] > x) {
                    fibm =fibm2;
                    fibm1 = fibm1 - fibm2;
                    fibm2 = fibm - fibm1;

                }else
                    return  i;

            }
            if(fibm1 == 1 && arr[n - 1 ]== x)
                return n -1;

            return -1;

        }



     public static void main(String[] args) {
         int arr[] = {10,22,35,40,45,50,80,82,85,90,100,255};
         int n = 12;
         int x  = 235;
         int idx = FibonacciSearch(arr,x,n);
         if(idx >=0){
             System.out.println("Ïndex found at :" + idx);
         }else{
             System.out.println(x + "is not in the array " );
         }
     }
}
