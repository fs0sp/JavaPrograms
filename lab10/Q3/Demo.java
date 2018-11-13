class Demo {

    Runnable r = new Runnable1();
    Thread t = new Thread1(r);


}

class Runnable1 implements Runnable {

    public void run() {
        
    }

}

class Thread1 implements Thread {

    public void run() {

    }

}