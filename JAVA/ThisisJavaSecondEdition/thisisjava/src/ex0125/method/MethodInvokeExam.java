package ex0125.method;

class Methodinvoke01{
	//다음과 같이 메소드를 작성하세요.
	
	/*method 이름 : method01
	어디서나 누구나 접근가능
	정수 리턴
	인수로 정수2개 받음
	인수로 들어온 정수 2개를 곱해서 출력하고 리턴*/
	
	
	public int method01(int a, int b) {
		int result = a*b;
		System.out.println(result);
		return result;
	}
	
}

class Methodinvoke02{
	
	//method 이름 : method02
	//어디서나 누구나 접근가능,객체를 생성하지 않고도 접근가능
	//정수 리턴
	//인수로 정수2개 받음
	
	//인수로 들어온 정수 2개를 더해서 출력하고 더한수 리턴
		
	public static int method02(int a, int b) {
		int result = a+b;
		System.out.println(result);
		return result;
	}
	

	
}

class MethodInvokeExam{
	public static void main(String []args){
		
		//MethodInvoke01의 method01 호출
		Methodinvoke01 m1 = new Methodinvoke01();
		m1.method01(0, 0);
		
		//MethodInvoke02의 method02 호출
		
		Methodinvoke02.method02(0,3);
		

	}
}

