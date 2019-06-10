package com.gs.interview.pac;

public class OverSample {

	public static void main(String[] args) throws InterruptedException {
//		 ThreadJoinTest t1 = new ThreadJoinTest("小明");
//	        ThreadJoinTest t2 = new ThreadJoinTest("小东");
//	        t1.start();
//	        /**join的意思是使得放弃当前线程的执行，并返回对应的线程，例如下面代码的意思就是：
//	         程序在main线程中调用t1线程的join方法，则main线程放弃cpu控制权，并返回t1线程继续执行直到线程t1执行完毕
//	         所以结果是t1线程执行完后，才到主线程执行，相当于在main线程中同步t1线程，t1执行完了，main线程才有执行的机会
//	         */
////	        t1.join();
////	        t2.start();
		new Test2().test();
	}

}


class A{
	static int x = 99;
	public int test(int a) {
		return 0;
	}
	
	public static int get() {
		System.out.println("get");
		return 77;
	}
}

class B extends A{
	public float test(float a) {
		return 1f;
	}

	public int test(int a) {
		return 2;
	}
}

class ThreadJoinTest extends Thread{
    public ThreadJoinTest(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(this.getName() + ":" + i);
        }
    }
}

class Test2
{
    public void add(Byte b)
    {
        b = b++;
    }
    public void test()
    {
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.print(a + " ");
        add(b);
        System.out.print(b + "");
    }
}

