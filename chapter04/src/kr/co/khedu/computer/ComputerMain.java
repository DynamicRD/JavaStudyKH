package kr.co.khedu.computer;

public class ComputerMain {

	public static void main(String[] args) {
		Computer computer = new Computer();
		System.out.println(computer.toString());
		
		computer.setPassword(100000);
		
		computer.setPassword(4444);
		System.out.println(computer.toString());
		computer.passwordSafetyTest();
	
		computer.setPassword(4843);
		System.out.println(computer.toString());
		computer.passwordSafetyTest();
		
		
		Computer computer2 = new Computer(5678,"김동욱",true);
		System.out.println(computer2.toString());
		
		
		
	}

}
