public class Demo{

    public static void main(String[] args) {
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
        
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);

        t.start();
        t2.start();
    }
}

class Runnable2 implements Runnable{
    public void run(){
        char ch;
 
      for (ch = 'a'; ch <= 'z'; ch++) {
         System.out.println("By thread 2 : " +ch);
        }
    }
}

class Runnable1 implements Runnable{
    public void run(){
        char ch;
 
      for (ch = 'a'; ch <= 'z'; ch++) {
         System.out.println("By thread 1 : " +ch);
        }
    }
}