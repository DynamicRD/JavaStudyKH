package kr.co.khedu.television;

public class TVMain {

	public static void main(String[] args) {
		// Tv객체를 만든다
		Television tv = new Television();
		
		String returnValue = tv.toString();
		System.out.println(returnValue);

		tv.setChannelNum(10);
		
		String channelName = tv.getChannelName();
		System.out.println(channelName);
		
		Television tv2 = new Television(10,10,true);
		System.out.println(tv2.toString());
	}

}
