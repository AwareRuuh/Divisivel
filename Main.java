class Main {
  public static void main(String[] args) {
    System.out.println("Divisíveis por 3: ");
    for (int i = 1; i<=100; i++) {
      if (i % 3 == 0) {
        System.out.println(i+"");
      }
      }

    System.out.println("Dívisiveis por 5: ");
      for (int a = 1; a<=100; a++) {
        if (a % 5== 0) {
        System.out.println(a+"");
    }
    }
    System.out.println("Dívisiveis por 3 e 5: ");  
    for (int c = 1; c<=100; c++) {
        if (c % 3 == 0 && c % 5 == 0){
        System.out.println(c+"");
  }
      }
  }
}