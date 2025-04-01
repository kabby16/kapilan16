// s1= 150
// s2= 120
// s3= 170 

// class Tallestof3 {
//     public static void main(String[] args) {
//         int  s1= 150 , s2= 220 , s3= 170 ;
         
//          if (s1>s2 ) {
//             if (s1>s3) {
//                 System.out.println("S1 is greater");
//             }else{
//                 System.out.println("S3 is greater");
//             }
//          }else{
//                 if (s2>s3) {
//                 System.out.println("S2 is greater");   
                    
//                 }else{
//                 System.out.println("S2 is greater");  
//                 }  
//          }
//     }
// }



class Tallestof3 {
    public static void main(String[] args) {
        int  s1= 450 , s2= 220 , s3= 170 ;
        String Tallest = s1>s2? s1>s3? "S1 is greater" : "S3 is greater" : s2>s3? "S2 is greater" : "S3 is greater" ;
    System.out.println(Tallest);
    }
}



