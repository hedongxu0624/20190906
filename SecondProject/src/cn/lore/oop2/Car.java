/*�ࣺ��ȡ�Ķ������ͬ�����Ժͷ��������ܰ�����Ա�����ͳ�Ա����
 * ������Ա������wheel engine
 * ��Ա������go stop run
 * һ������³�Ա����Ϊ˽��
 */

package cn.lore.oop2;

 class Car{
	private int wheel;
	private String engine;
	private String name;
	//�޲�
	public Car(){
		System.out.println("��������");
	}
	//�в�
	public Car(int wheel,String name,String engine){
		this.engine=engine;
		this.name=name;
		this.wheel=wheel;
	}
	public void go(){
		System.out.println(name+"����");
		//�����ڲ�����
		run();
	}
	public void stop(){
		System.out.println(name+"Ϩ��");
	}
	private void run(){
		System.out.println(name+"����ʻ");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;//����=����
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
}
