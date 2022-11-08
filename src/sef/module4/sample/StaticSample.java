package sef.module4.sample;

public class StaticSample {
	
	public static int SHARED=1;
	public int notShared;
	
	private static float distance;
	private static float time;
	private static float speed;
	
	//static sample
	static
	{
		speed = distance / time;
	}
	
	public StaticSample(float distance, float time)
	{
		StaticSample.distance = distance;
		StaticSample.time = time;
	}
	
	public StaticSample() {
	}

	public static void main(String arg[]){
		//static sample
		StaticSample temp1  = new StaticSample();
		StaticSample temp2  = new StaticSample();
		
		StaticSample.SHARED = 99;
		temp1.notShared = 1;
		
		StaticSample.SHARED = 100;
		temp2.notShared = 2;
		
		System.out.println(StaticSample.SHARED);
		System.out.println(temp1.notShared);
		System.out.println(StaticSample.SHARED);
		System.out.println(temp2.notShared);
		
		//static code block sample
		StaticSample temp3  = new StaticSample(100, 4);
		System.out.println(StaticSample.distance);
		System.out.println(StaticSample.time);
		System.out.println(StaticSample.speed);
	}
}
