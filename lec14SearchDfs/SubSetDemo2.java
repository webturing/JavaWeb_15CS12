package lec14SearchDfs;

public class SubSetDemo2 {
	//7 
public static void main(String[] args) {
	int[]A={1,2,3,4,5,6,7};
	for(int i=0;i<(1<<7);i++){
		int g=i&1;
		int f=(i>>1)&1;
		int e=(i>>2)&1;
		int d=(i>>3)&1;
		int c=(i>>4)&1;
		int b=(i>>5)&1;
		int a=(i>>6)&1;
		if(a*A[0]+b*A[1]+c*A[2]+d*A[3]+e*A[4]+f*A[5]+g*A[6]==7)
		System.out.println(String.format("%d %d %d %d %d %d %d",a,b,c,d,e,f,g));
	}
}
}
