public class App{
    public static void main(String args[]){
        //problem 1
            for(int i = 1; i<=5; i++){
                for(int x = 1; x<=i; x++){
                System.out.print(i);
            }
            System.out.println();
            }
        //problem 2
            for(int i = 1; i<=5; i++){
                for(int x = 4; x>=i; x--){
                    System.out.print(".");
                }
                for(int x = 1; x<=i;x++){
                    System.out.print(i);
                }
                System.out.println();
            }
        //problem 3
            for(int i = 1;i<=5;i++){
                for(int x=5; x>i;x--){
                    System.out.print("."); 
                }
                System.out.print(i);
                
                for(int x=1;x<i;x++){
                    System.out.print(".");
                }
                System.out.println();
            }

    }
}


    
