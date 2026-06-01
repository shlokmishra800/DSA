package MultiThreading;


class Cooking implements Runnable{
private String name;

Cooking(String name){
    this.name = name;
    
}

public void run(){
    System.out.println(  name + " new dish name is => " +Thread.currentThread().getName());
}



}
public class MultiThreading2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Cooking("Chapati1"));
         Thread t2 = new Thread(new Cooking("Chapati2"));
          Thread t3 = new Thread(new Cooking("Chapati3"));
           Thread t4 = new Thread(new Cooking("Chapati4"));
           t1.start();
           t2.start();
           t3.start();
           t4.start();


    }
}
