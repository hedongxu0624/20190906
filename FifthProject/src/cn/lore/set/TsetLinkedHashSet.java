package cn.lore.set;

import java.util.Scanner;

public class TsetLinkedHashSet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入三个省份信息");

		ProvinceManager pm = new ProvinceManager();
		for (int i = 1; i <= 3; i++) {
			System.out.println("请输入第" + i + "个省份的信息");
			String name = sc.next();
			long area = sc.nextLong();
			int tag = sc.nextInt();

			Province pro = new Province();
			pro.setName(name);
			pro.setArea(area);
			if (tag == 0)
				pro.setGeneral(false);
			else
				pro.setGeneral(true);
			pm.addProvice(pro);
		}
		System.out.println("所有省份信息如下：");
		pm.dispalyAll();

		System.out.println("请输入要查找的省份名称：");
		String proName = sc.next();

		Province target = pm.findProvinceByName(proName);
		if (target == null)
			System.out.println("未找到此省份信息");
		else {
			System.out.println("省份信息：");
			System.out.println(target.getName()+"\t"+target.getArea()+"\t"+target.isGeneral());
		}
	}

}
