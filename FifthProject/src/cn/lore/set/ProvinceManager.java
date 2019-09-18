package cn.lore.set;

import java.util.LinkedHashSet;

public class ProvinceManager {

	private LinkedHashSet provinceSet;

	public LinkedHashSet getProvinceSet() {
		return provinceSet;
	}

	//���ʡ��
	public void addProvice(Province pro){
		provinceSet.add(pro);
	}
	
	//��ʾʡ����Ϣ
	public Province findProvinceByName(String name){
		for(Object o:provinceSet){
			if(((Province)o).getName().equals(name)){
				return (Province)o;
			}
		}
		return null;
	}
	
	//��ʾ������Ϣ
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
