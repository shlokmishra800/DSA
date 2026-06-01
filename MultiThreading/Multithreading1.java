package MultiThreading;

class Cooking extends Thread {
    private String dishName;

    Cooking(String dishName) {
        this.dishName = dishName;
        this.setName(dishName);
    }

    public void run() {
        System.out.println("New Dish is being prepared: " + Thread.currentThread().getName());
    }
}

public class Multithreading1 {
    public static void main(String[] args) {
        Cooking t1 = new Cooking("Rice");
        Cooking t2 = new Cooking("Pasta");
        Cooking t3 = new Cooking("Chapati");
        Cooking t4 = new Cooking("Popcorn");
        Cooking t5 = new Cooking("Milk");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

// Output =>

// New Dish is being prepared: Rice
// New Dish is being prepared: Milk
// New Dish is being prepared: Pasta
// New Dish is being prepared: Chapati
// New Dish is being prepared: Popcorn