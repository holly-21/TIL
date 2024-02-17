package ch14.sec06.exam01;

public class User2Thread extends Thread {
	private Calculator calculator;
	
	public User2Thread() {
		setName("User2Thread");//이름 변경
	}
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory1(50);
	}
}
