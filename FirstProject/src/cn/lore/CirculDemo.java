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
//ע��"\t"Ϊ�ո��;'\t'�ַ�����ʽ�ᵱ9���㣻