package cn.lore.set;

import java.util.LinkedHashSet;

public class ProvinceManager {

	private LinkedHashSet provinceSet;

	public LinkedHashSet getProvinceSet() {
		return provinceSet;
	}

	//添加省份
	public void addProvice(Province pro){
		provinceSet.add(pro);
	}
	
	//显示省份信息
	public Province findProvinceByName(String name){
		for(Object o:provinceSet){
			if(((Province)o).getName().equals(name)){
				return (Province)o;
			}
		}
		return null;
	}
	
	//显示所有信息
	public void dispalyAll(){
		for(Object o:provinceSet){
			System.out.println(((Province)o).getName()+"\t"+((Province)o).getArea()+"\t"+((Province)o).isGeneral()+"\n");
		}
	}
	
	public ProvinceManager() {
		super();
		if(provinceSet==null)
			provinceSet=new LinkedHashSet();
		this.provinceSet = provinceSet;
	}

	
}
