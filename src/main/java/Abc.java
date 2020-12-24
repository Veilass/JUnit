public class Abc {
  public int x;

  void getMethod(String s){}
}

class Def extends Abc{
    public static void main(String[] args) {
        Abc abc = new Abc();
        String s = "null";
        abc.getMethod(s);
    }
}

class ghi{
    public static void main(String[] args) {
        Abc abc = new Abc();
        String s = "null";
        abc.getMethod(s);
    }
}
