package cn.lore.exception;

public class TsetThrow {

	public static void main(String[] args) {
		
		try {
			double data=100/0.0;
			System.out.println("������������"+data);
			if(String.valueOf(data).equals("Infinity")){
				throw new ArithmeticException("�����쳣");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
	}

}
