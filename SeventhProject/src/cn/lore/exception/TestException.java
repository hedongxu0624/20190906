package cn.lore.exception;

public class TestException {

	public static void main(String[] args) {

		try{
			System.out.println("Hellow"+args[0]+args[1]);
		}catch(ArrayIndexOutOfBoundsException e){
			String msg=e.getMessage();//��ʾ������Ϣ
			e.printStackTrace();//��ӡ��ջ�ṹ
			System.out.println(msg);
			System.out.println("��������������Խ���쳣");
		}finally{
			System.out.println("����ִ��");
		}
		System.out.println("����Ŷ");
		
	}

}
