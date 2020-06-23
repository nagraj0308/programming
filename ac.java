class ac{
	public static void main(String args[]){
		int a[]={2,25,6,31,9,10,4,8,30,7};
		int b[]=new int[14];
		int min;

		for(int i=0;i<10;i++){
			min=a[i];
			for(int j=i+1;j<10;j++){
				if(a[j]>min)
					min=a[j];
			}
			if(min==a[i]){ b[i]=-1;}
			else{
				for(int j=i+1;j<10;j++){
					if(a[j]>a[i]&&a[j]<min)
						min=a[j];
				}
				b[i]=min;
			
			}
			
			
			System.out.print(b[i]+" ");
		}


	}
}


