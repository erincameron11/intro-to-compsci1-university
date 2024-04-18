package time;

class StopWatch{
	// startTime private data fields with getter method
	private long startTime;
	public long getStartTime() {
		return this.startTime;
	}
	
	// endTime private data fields with getter method
	private long endTime;
	public long getEndTime() {
		return this.endTime;
	}

	StopWatch() {
		startTime = System.currentTimeMillis();
	}
	
	void start() {
		this.startTime = System.currentTimeMillis();
	}
	
	void stop() {
		this.endTime = System.currentTimeMillis();
	}
	
	public long getElapsedTime() {
		return this.endTime - this.startTime;
	}
	
}

public class TimeElapsed {

	public static void main(String[] args) {
		// Randomize the selection sort of 100000 numbers
		java.util.Random r = new java.util.Random();
        int[] numbers = new int[100000];
        
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(100000);
        }
        
        // A constructor is called
        StopWatch sw = new StopWatch();
        selectionSort(numbers);
        sw.stop();

        System.out.println("Selection sorting 100000 numbers in: " + sw.getElapsedTime() + " milliseconds");

	}


public static void selectionSort(int[] list) {
    for (int i = 0; i < list.length; i++) { 
        int currentMin = list[i]; 
        int currentMinIndex = i;

        for (int j = i + 1; j < list.length; j++) {
            if (currentMin > list[j]) {
                currentMin = list[j];
                currentMinIndex = j;
            }
        }   

        if (currentMinIndex != i) {
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
        }
    }
}
}

