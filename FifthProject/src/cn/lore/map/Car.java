package cn.lore.map;

import java.util.Date;

public class Car {

	private String brand;//品牌
	private Date createDate;//生产日期
	private int hoserpower;//马力
	private int speed; //时速
	public String getBrand() {
		return brand;
	}
	public Car() {
		super();
	}
	public Car(String brand, Date createDate, int hoserpower, int speed) {
		super();
		this.brand = brand;
		this.createDate = createDate;
		this.hoserpower = hoserpower;
		this.speed = speed;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getHoserpower() {
		return hoserpower;
	}
	public void setHoserpower(int hoserpower) {
		this.hoserpower = hoserpower;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
