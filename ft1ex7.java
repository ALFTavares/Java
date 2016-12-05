public class HelloWorld{

     public static void main(String []args){
         int a;
         for (a = 10; a <= 25; a++){
             if (a % 2 == 0){
                 System.out.println(a);
             }
             else{
                 continue;
             }
         }
     }
}
