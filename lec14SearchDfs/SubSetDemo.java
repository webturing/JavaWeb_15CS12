package lec14SearchDfs;

public class SubSetDemo {
	//7 
public static void main(String[] args) {
	int[]A={1,2,3,4,5,6,7};
	for(int a=0;a<=1;a++)
	for(int b=0;b<=1;b++)
	for(int c=0;c<=1;c++)
	for(int d=0;d<=1;d++)
	for(int e=0;e<=1;e++)
	for(int f=0;f<=1;f++)
	for(int g=0;g<=1;g++){
		if(a*A[0]+b*A[1]+c*A[2]+d*A[3]+e*A[4]+f*A[5]+g*A[6]==7)
		System.out.println(String.format("%d %d %d %d %d %d %d",a,b,c,d,e,f,g));
	}
}
}
