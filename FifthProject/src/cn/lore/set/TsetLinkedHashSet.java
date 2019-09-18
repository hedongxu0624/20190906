package cn.lore.set;

import java.util.Scanner;

public class TsetLinkedHashSet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("����������ʡ����Ϣ");

		ProvinceManager pm = new ProvinceManager();
		for (int i = 1; i <= 3; i++) {
			System.out.println("�������" + i + "��ʡ�ݵ���Ϣ");
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
		System.out.println("����ʡ����Ϣ���£�");
		pm.dispalyAll();

		System.out.println("������Ҫ���ҵ�ʡ�����ƣ�");
		String proName = sc.next();

		Province target = pm.findProvinceByName(proName);
		if (target == null)
			System.out.println("δ�ҵ���ʡ����Ϣ");
		else {
			System.out.println("ʡ����Ϣ��");
			System.out.println(target.getName()+"\t"+target.getArea()+"\t"+target.isGeneral());
		}
	}

}
