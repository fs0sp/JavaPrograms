public class HelloWorld{

    public static void main(String[] args) {
       

    	 

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();


        t2.start();
        t1.start();




    }
}

class Thread1 extends  Thread{
    public void run(){

System.out.println ("Thread " + 
                  Thread.currentThread().getId() + 
                  " is running"); 


        for(int i=1;i<=5;i++){
           
                System.out.println(" From Thread 1 : " + i);
        }
    }
}

class Thread2 extends  Thread{
    public void run(){


    System.out.println ("Thread " + 
                  Thread.currentThread().getId() + 
                  " is running"); 
                  
        for(int i=1;i<=5;i++){
           
                System.out.println("From Thread 2 : " +i);
        }
    }
}