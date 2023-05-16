public class NestedLoopPractice {

    public static void main(String[] args) {
        NestedLoopPractice n = new NestedLoopPractice();

    }

    public NestedLoopPractice() {
        pattern8();
    }

    public void pattern4() {
        System.out.println("pattern 4");
        for (int i = 1; i <= 6; i++) {
            System.out.print(i*i +"\t");

            }
        }


    public void pattern5(){
        System.out.println("\n pattern 5");
       for(int i=0;i<4; i++) {
           for (int j = 0; j < 4; j++) {
               System.out.print(j + 1 + "\t");

           }
           System.out.println(" ");
       }
    }
    public void pattern6(){
        System.out.println("pattern 6");
      for(int j=1;j<6;j++) {
          for (int i = 1; i < j; i++) {
              System.out.print(" ");

          }
          System.out.println(j);
      }
    }
    public void pattern7(){
        System.out.println("\n pattern 7");
        for(int i=1;i<6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(i +" ");

            }
            System.out.println(i);
        }
    }

    public void pattern75(){
        System.out.println("\n pattern 7.5");
        for ( int i=1;i<6;i++){
            for(int j = 1; j<6-i; j++){
                System.out.print(i + " ");
            }
            System.out.println(i);
        }
    }
    public void pattern8(){
        System.out.println("\n pattern 8");
        for ( int i=1;i<6;i++){
            for(int j = 1; j<6-i; j++){
                System.out.print(" " + "* " );
            }
        }
        System.out.println();
    }
}

