import java.util.Random;
public class AddRduce{
 
	char o = '+';//定义字符型变量o，用以接收加法或者减法符号
	 int[] sum = new int[100];
	  int a=0;
	  int b=0;
	  boolean yes;
	  
	public AddRduce(int a,int b,int sum[],boolean yes) {
		this.a=a;
		this.b=b;
		this.sum=sum;
		this.yes=yes;
		
	}
	
	public  void remind1() {
		System.out.println("程序输出50道100以内的加减法算式");
	}//程序功能提示方法
	
	
	public void remind2() {
		System.out.println("每个算式的参考答案");
	}//程序功能提示方法
	
	
	public  boolean generateEquations() {
		short ov = 0;
		Random random = new Random();
		ov = (short) random.nextInt(2);//ov的值为0或1
		if(ov == 1) {
			o = '+';
			yes=true;
		} else {
			o = '-';
			yes=false;
		}//ov为1是加法，ov为0是减法
		return yes;
	} 
	
	
	public void add(int a1,int b1,int j) {
		 Random random = new Random();
		 a1  = (int) random.nextInt(101);
	     b1 = (int) random.nextInt(101);
	
		while(a1+b1>100) {
			 a1  = (int) random.nextInt(101);
		     b1 = (int) random.nextInt(101);
		}
		sum[j]=a1+b1;
		System.out.println(""+(j+1)+":\t"+a1+"+"+b1+"=");
		
	}//当相加结果大于100时重新随机
	
	
	public void reduce(int a2,int b2,int k) {
		
		 Random random = new Random();
		 a2 = (int) random.nextInt(101);
	     b2 = (int) random.nextInt(101);
	     while(a2-b2<0) {
			 a2 = (int) random.nextInt(101);
		     b2= (int) random.nextInt(101);
		}
		sum[k]=a2-b2;
		System.out.println(""+(k+1)+":\t"+a2+"-"+b2+"=");
		
	}//当相减结果小于0时重新随机
	
	 
	public static void main (String[] args) {//实例调用函数
		int a3=0;
		int b3 = 0;
		 int[] sum = new int[100];
		boolean d=false;
		AddRduce sample = new AddRduce( a3, b3,sum,d);//
		sample.remind1();
	  for(int i=0;i<50;i++)
	   {
	    	 
		  sample.generateEquations();
	         if(sample.yes) 
	        	 sample.add(sample.a,sample.b,i);
	         else
	        	 sample.reduce(sample.a,sample.b,i);
	    }
	  sample.remind2();
	    for(int i =0;i<50;i++) {
	    	System.out.println(""+(i+1)+":\t"+sample.sum[i]);
	    	
	   }
	   
}
}