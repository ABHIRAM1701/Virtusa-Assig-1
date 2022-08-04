/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abhiram;

/**
 *
 * @author LEGION
 */
public class Thread {
    int counter = 1;

    static int N;


    public void printOddNumber()
    {
        synchronized (this)
        {
            while (counter < N) {
                  while (counter % 2 == 0) {
                      try {
                        wait();
                    }
                    catch (
                        InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                  System.out.print(counter + " ");
                  counter++;
                  notify();
            }
        }
    }

    public void printEvenNumber()
    {
        synchronized (this)
        {
            while (counter < N) {
                  while (counter % 2 == 1) {
                      try {
                        wait();
                    }
                    catch (
                        InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                  System.out.print(counter + " ");
                  counter++;
                  notify();
            }
        }
    }

    public static void main(String[] args)
    {
        N = 10;
          Threads9th mt = new Threads9th();
          Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                mt.printEvenNumber();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run()
            {
                mt.printOddNumber();
            }
        });
        t1.start();
        t2.start();
    }
}
