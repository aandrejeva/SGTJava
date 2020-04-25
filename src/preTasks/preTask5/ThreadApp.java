package preTasks.preTask5;

//class to run MyThread.java

public class ThreadApp {

	public static void main(String[] args) throws InterruptedException {

		//to run MyThread.java
		//create an objects of type MyThread and provide the parameters in the constructor
		MyThread t1 = new MyThread(0, 3, 100);
		MyThread t2 = new MyThread(1, 3, 100);
		MyThread t3 = new MyThread(2, 3, 100);
		
		//from the Thread class we can access method start()
		t1.start();
		t2.start();
		t3.start();
		
		//make some pause between each thread to make them sleep
		//declare an array of type String an assign each element
		String info[] = {
			" String info for Thread ...1",
			" String info for Thread ...2",
			" String info for Thread ...3",
			" String info for Thread ...4",
		};
		
		//print it out
		//traverse the array
		for(int i = 0; i < info.length; i++) {
		Thread.sleep(2000);	//milliseconds:2000 = 2 seconds, make the each thread sleep for the 2 seconds
		System.out.println("info: " + info[i]);//print out
		}
		
	}//end main

}//end class
