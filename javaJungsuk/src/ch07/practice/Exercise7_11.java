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
	
	public void gotoPrevChannel() {
		channel--;
		
		if(channel<MIN_CHANNEL) channel=MAX_CHANNEL;
	}
	
	public void gotoNextChannel() {
		channel++;
		if(channel>MAX_CHANNEL) channel=MIN_CHANNEL;
	}
	
}// end MyTv2

public class Exercise7_11 {
	public static void main(String[] args) {
		MyTv2 t1 = new MyTv2();
		t1.setChannel(1);
		System.out.println("CH:"+t1.getChannel());
		t1.gotoPrevChannel();
		System.out.println("AFTER gotoPrevChannel CH:"+t1.getChannel());
		
		MyTv2 t2 = new MyTv2();
		t2.setChannel(100);
		System.out.println("CH:"+t2.getChannel());
		
		t2.gotoNextChannel();
		System.out.println("AFTER gotoNextChannel CH:"+t2.getChannel());
	}
}
