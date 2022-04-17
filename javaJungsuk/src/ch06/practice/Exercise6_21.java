package ch06.practice;

/* 실행결과 
CH:100, VOL:0
CH:99, VOL:0
CH:100, VOL:100
 */

class MyTv {
	boolean isPowerOn;				//전원 on&off
	int channel;					//채널
	int volume;						//볼륨
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	
	void turnOnOff() {
		/*
		if(isPowerOn)
			isPowerOn = false;
		else 
			isPowerOn = true;
		*/
		
		/*
		boolean chk = isPowerOn; 
		isPowerOn = (chk == true ? false : true);
		*/
		
		isPowerOn = !isPowerOn;
	}
	
	void volumeUp() {
		// (2) volume MAX_VOLUME 1 . 의 값이 보다 작을 때만 값을 증가시킨다
		if(volume < MAX_VOLUME)
			volume++;
	}
	
	void volumeDown() {
		if(MIN_VOLUME < volume)
			volume--;
	}
	
	void channelUp() {
		if(channel==MAX_CHANNEL)
			channel=MIN_CHANNEL;
		else 
			channel++;
	}
	
	void channelDown() {
		if(channel==MIN_CHANNEL)
			channel=MAX_CHANNEL;
		else 
			channel--;
	}
} // class MyTv

class Exercise6_21 {
	public static void main(String args[]) {
		MyTv t = new MyTv();
		t.channel = 100;
		t.volume = 0;
		t.isPowerOn = false;
		
		System.out.println("Now Power: "+t.isPowerOn);
		
		t.turnOnOff();
		System.out.println("After change Power: "+t.isPowerOn);
		t.turnOnOff();
		System.out.println("After change Power: "+t.isPowerOn);
		
		System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
	}
}//end class