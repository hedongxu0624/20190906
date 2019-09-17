package cn.lore;

public class CirculDemo {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<10;i++){
			for(j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+i*j+'\t');
			}
			System.out.println();
		}
	}

}
//注意"\t"为空格符;'\t'字符串形式会当9计算；
