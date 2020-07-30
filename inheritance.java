abstract class   A1 {
	A1(){
		System.out.println("A1");
		fun1();
   	 }
	public abstract void fun1();

}

class A2 extends A1{
	public A2(){
		System.out.println("A2");
    		}
	@Override
	public void fun1(){
		System.out.println("funA2");
	}

}

class A3 extends A2{
	public A3(){
		System.out.println("A3");
   	 }
	@Override
         public void fun1(){
		System.out.println("funA3");
	}

}

class inheritance {
	public static void main(String args[]){
		A3 a3=new A3();
		System.out.println("A4");
	}

}