package homework_program_6;

public class MenuChoiceException extends Exception {
	//오류가 나왔을때 저장할 데이터가 있으면 선언하면됨.
	private int wrongMenuNumber;

	//메생
	public MenuChoiceException(int wrongMenuNumber) {
		super();
		this.wrongMenuNumber = wrongMenuNumber;
	}

	//겟셋
	public int getWrongMenuNumber() {
		return wrongMenuNumber;
	}

	public void setWrongMenuNumber(int wrongMenuNumber) {
		this.wrongMenuNumber = wrongMenuNumber;
	}
	
	//오버라이딩함수 할게없음, 연산함수
	public void showWrongMenuNumber() {
		System.out.println(this.wrongMenuNumber+"번호에 해당되는번호가 없습니다.");
	}
}
