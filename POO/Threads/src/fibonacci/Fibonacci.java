/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author felipe
 */
public class Fibonacci implements Runnable {

    private long n = 0;
    private long r = 0;

    Fibonacci(long l) {
        n = l;
    }

    public long fib(long n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        } else {
            return (fib(n - 1) + fib(n - 2));
        }
    }

    @Override
    public String toString(){
        return Long.toString(n);
    }
    
    @Override
    public void run() {
        r = fib(n);
    }

    long getR() {
        return r;
    }

}
