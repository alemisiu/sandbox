class Program {
  public static void main(String[] args) {
    String actual = "Hello World";

    String actual2 = actual.substring(0 , actual.length()  -1);
    System.out.println(actual2);

    String actual3 = actual.substring(actual.length() -1, actual.length());
    System.out.println(actual3);
  }
}