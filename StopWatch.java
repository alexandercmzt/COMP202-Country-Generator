public class StopWatch
{

	private long startTime;
	private long stopTime;

	public void startTime()
	{
		startTime = System.nanoTime();
	}

	public void stopTime()
	{
		stopTime = System.nanoTime();
	}

	public long getTimeNano()
	{
		return (stopTime-startTime);
	}

	public long getTimeMicro()
	{
		return ((stopTime-startTime)/1000);
	}

	public double getTimeMilli()
	{
		return (double)(getTimeMicro())/1000;
	}

	public long getTimeSeconds()
	{
		return (stopTime-startTime)/1000000000;
	}

	// public static void main(String[] args) 
	// {
	// 	StopWatch watch = new StopWatch();
	// 	watch.startTime();
	// 	for (int i = 12; i<123; i++) 
	// 	{
	// 		System.out.println(i);	
	// 	}
	// 	watch.stopTime();
	// 	System.out.println(watch.getTimeMilli()); 
	// }

}