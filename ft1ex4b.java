public class HelloWorld{

     public static void main(String []args){
        char produto = 'b';
         
        switch(produto){
            case 'a':
                System.out.println("Tenis Nike");
                break;
            case 'b':
                System.out.println("Camisa Ralph Lauren");
                break;
            case 'c':
                System.out.println("Calcas Lois");
                break;
            case 'd':
                System.out.println("Oculos RayBan");
                break;
            default:
                System.out.println("Erro");
        }
     }
}
