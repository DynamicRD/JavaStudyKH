package kr.co.khedu.drive;

public class AutoCar implements InterfaceCar {
	private int speed;
	private int degree;
	@Override
	public void start() {
		System.out.println("자동차가 출발합니다.");
	}

	public AutoCar(int speed, int degree) {
		super();
		this.speed = speed;
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "AutoCar [speed=" + speed + ", degree=" + degree + "]";
	}

	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}

	public int getSpeed() {
		return speed;
	}

	@Override
	public void stop() {
		System.out.println("자동차가 정지합니다.");
		
	}

	@Override
	public int setSpeed(int speed) {
		this.speed = speed;
		System.out.println("자동차가 속도를 "+speed+"km/h로 바꿉니다");
		return speed;
	}

	@Override
	public int turn(int degree) {
		System.out.println("자동차가 방향을 "+degree+"km/h로 바꿉니다");
		return 0;
	}

}
