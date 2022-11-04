import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // System.out.println("Bonjour");
    // System.out.println("Famery");


    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Taper un nombre");
    // int nombreEntree = scanner.nextInt();
    // for (int i=1; i<11;i++){
    //   System.out.println(nombreEntree*i);
    // }
    // scanner.close();

    // for(int i = 0; i < 15; i++){
    //   if(i % 2 == 0 && i < 9){
    //     System.out.println(" * * * * * * ========================");
    //   }else if(i % 2 != 0 && i < 9){
    //     System.out.println("  * * * * *  ========================");
    //   }else{
    //     System.out.println(" ====================================");
    //   }
    // }


    Scanner scanner = new Scanner(System.in);
    System.out.println("Saisir le nombre de lignes");
    int nbLigne = scanner.nextInt();

    for(int i = 0 ; i < nbLigne ; i++){
      for(int j = 1 ; j < i+2 ; j++){
        System.out.print(j);
      }
      System.out.println();
    }

    
    scanner.close();
    
    
  }
}