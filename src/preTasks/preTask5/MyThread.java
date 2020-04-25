package preTasks.preTask5;

//instantiable class
public class MyThread extends Thread {

	//declare instance variables
	private int startIndex, numOfThread, maxIndex;

	//generate the constructor with parameters
	public MyThread(int startIndex, int numOfThread, int maxIndex) {
		this.startIndex = startIndex;
		this.numOfThread = numOfThread;
		this.maxIndex = maxIndex;
	}
	
	//override the run method from the Thread class (MyThread inherits this method from superclass Thread)
	@Override
	public void run() {
		//make loop
		for(int i = this.startIndex; i < this.maxIndex; i+= this.numOfThread) {
			System.out.println("(Thread id: " + this.getName() + ") " + i);
		}
	}
	
}//end class
