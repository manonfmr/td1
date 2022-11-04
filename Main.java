import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Bonjour");
    System.out.println("Famery");


    Scanner scanner = new Scanner(System.in);
    System.out.println("Taper un nombre");
    int nombreEntree = scanner.nextInt();
    for (int i=1; i<11;i++){
      System.out.println(nombreEntree*i);
    }
    scanner.close();
    
  }
}