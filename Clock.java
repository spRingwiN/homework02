public class Clock{
	private Display hour =new Display(24);
	private Display minute =new Display(60);
	private Display second =new Display(60);
	public Clock(int h, int m, int s) {
	hour.setValue(h); 
	minute.setValue(m);
	second.setValue(s);
	}
	public void tick()
	{
		if(second.increase())
		{
			if(minute.increase())
			{
				hour.increase();
			}
		}
	}
	public String toString()
	{
		return String.format("%02d:%02d:%02d", hour.gotValue(),minute.gotValue(),second.gotValue());
	}
}
