class abc{
	public void fun(String str){
		char a[]=str.toCharArray();
		int i=0;
		int flag1=0;
		int flag2=0;
		int n=a.length;
		while(i<n){
			if((a[i]<='9')&&(a[i]>='0')){
				int j=i+1,k=0;
				while(j<n){
					if(a[j]=='?')k++;
					if(((a[j]-48)==10-(a[i]-48))&&(k==3)) flag1=1;
					if(((a[j]-48)==10-(a[i]-48))&&(k!=3)) flag2=1;
					j++;
				
				}
			}//if
			//System.out.println(i);
			i++;

		}

		if((flag1==1) && (flag2==0)) System.out.println("true");
		else System.out.println("false");

	}
}
class ab{
	public static void main(String args[]){
		String ab="absol5???55ute";
		abc o=new abc();
		o.fun(ab);
		
	}
}


