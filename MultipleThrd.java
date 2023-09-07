// class T1 implements Runnable {

//     public void run() {

//         for (int i = 0; i < 5; i++) {
//             System.out.println("Thread one running ");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
                
//                 e.printStackTrace();
//             }
//         }

//     }
// }

// class T2 implements Runnable {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Thread two running");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
                
//                 e.printStackTrace();
//             }
//         }
//         }
//     }


// public class MultipleThrd {
//     public static void main(String[] args) {

//         Runnable obj1 = new T1();
//         Runnable obj2 = new T2();

//         Thread t1=new Thread(obj1);
//         Thread t2=new Thread(obj2);
//         t1.start();
//         t2.start();
//     }

// }

class Counter{
    int count;
    //synchronized will make sure if t1 is working with increment then t2 has to wait (It will avoid both methods call increment at the same time)
    public synchronized void increment(){
        count++;
    }
}

class MultipleThrd{
    public static void main(String[] args) throws InterruptedException {

        Counter cc=new Counter();
        
        Runnable obj1= ()  ->{

            for (int i = 0; i < 1000; i++) {
                cc.increment();
            }
        };


        Runnable obj2= ()  ->{

            for (int i = 0; i < 1000; i++) {
                cc.increment();
            }
        };

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(cc.count);
    }
}