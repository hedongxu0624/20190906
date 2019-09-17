package cn.lore.exception;

public class TestException {

	public static void main(String[] args) {

		try{
			System.out.println("Hellow"+args[0]+args[1]);
		}catch(ArrayIndexOutOfBoundsException e){
			String msg=e.getMessage();//显示错误消息
			e.printStackTrace();//打印堆栈结构
			System.out.println(msg);
			System.out.println("产生了数组索引越界异常");
		}finally{
			System.out.println("必须执行");
		}
		System.out.println("好嗨哦");
		
	}

}
