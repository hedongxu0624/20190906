package cn.lore;

public class FiBo {

	//public static void main(String[] args) {
	//��һ�ַ���
		/*	int a=1,b=1,c=0;
		System.out.println("ǰ20��Ϊ");
		System.out.print(a+"\t"+b+"\t");
		for(int i=1;i<19;i++){
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+"\t");
			if((i+2)%5==0)
				System.out.println();
		
		}
		System.out.println("��20��Ϊ");
		System.out.println(c);
	}*/
		//�ڶ���
	/*	int arr[]=new int[20];
		arr[0]=arr[1]=1;
		System.out.println("ǰ20��Ϊ");
		for(int i=2;i<arr.length;i++){
			arr[i]=arr[i-2]+arr[i-1];
		}
		for(int i=0;i<arr.length;i++)
		{
			if(i%5==0)
				System.out.println();
			System.out.print(arr[i]+"\t");
		}*/
		//�����ֵݹ鷽��
		private static int getFiBo(int i){
			if(i==1||i==2)
				return 1;
			else
				return getFiBo(i-1)+getFiBo(i-2);
		}
		public static void main(String[] args){
			for(int i=1;i<=20;i++){
				System.out.println(getFiBo(i)+"\t");
			}
		}
	}

