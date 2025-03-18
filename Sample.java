public class Sample
{

  public void m1()
  {
    System.out.println("Github tutorial");
  }

  public void m2(){
  System.out.println("Hello I'm m2()");
}

  public void m3(){
    System.out.println("Hello I'm m3()");
  }

  public void m4(){
    system.out.println("m4 method");
      }


  public static void main(String[] args)
  {
    Sample s = new Sample();

    s.m1();

    s.m2();

    s.m4();

    s.add(10,45);

    s.div(100,30);

  }


  public void add(int a , int b)
  {

    int c = a+ b;
    System.out.println(c);
  }

  public void div(int a, float b)
  {
    float c = a / b;
    System.out.println(c);
}
