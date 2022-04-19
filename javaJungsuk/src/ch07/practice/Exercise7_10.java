package ch07.practice;

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(channel >= MAX_CHANNEL) 
			this.channel=MAX_CHANNEL;
		else if(channel <= MIN_CHANNEL) 
			this.channel=MIN_CHANNEL;
		else 
			this.channel = channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		if(volume >= MAX_VOLUME) 
			this.volume = MAX_VOLUME;
		else if(volume <= MIN_VOLUME) 
			this.volume = MIN_VOLUME;
		else 
			this.volume = volume;
	}
	
}// end MyTv2

public class Exercise7_10 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		t.setChannel(200);
		System.out.println("CH:"+t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:"+t.getVolume());
	}
}
