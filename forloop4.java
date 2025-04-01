class forloop4{
    public static void main(String[] args) {
        int n =10 , count =0;

        for (int num = 2; count<n; num++){
            int i;
            for (i=2; i*1 <= num; i++){
                if (num % i==0) break;

             }
            if (i*i > num) {
                System.out.println(num + " ");
                count++;
            }
 
        }
   
    }
}



// prime number