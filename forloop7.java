// class forloop7{
//     public static void main(String[] args) {
//         int a=1,b=2;
        
//         for (int i=0;i<10;i++){

//             System.out.println(a);
//            int c=a+b+1;
//             a=b;
//             b=c;
//         }
//     }

// }

// 1,2,4,7,12,20,33

class forloop7{
    public static void main(String[] args) {
        int a=1,b=2;
        
        for (int i=0;i<10;i++){
           int c=a+b;
           System.out.println(a-1);
            a=b;
            b=c;
        }
    }

}
