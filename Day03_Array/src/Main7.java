import java.util.Arrays;

public class Main7 {
	public static void main(String[] args) {
		
		int[] a = {40,50,60,70,80};
		 //i = 1  2
		int r = 76;
		//j = 2

		int[] b = new int[6];
		
		for(int i = 0,j=0;i<a.length;i++,j++){
			if(r > a[i] && i == a.length -1){
				b[i+1] = r;
			}
			if(r < a[i] && i == 0){
				b[j] = r;
				b[++j] = a[i];//i = 0 j = 1
			}else if(a[i] < r && i < a.length - 1 && a[i+1] > r){
				b[++j] = r;
				b[i] = a[i];
			}else if(j > i){
				b[j] = a[i];
			}else{
				b[i] = a[i];
			}
		}
		
		System.out.println(Arrays.toString(b));
		
		
		//a.length - 1后，i只能取值到3
//		for(int i = 0;i<b.length;i++){
//			if(i < a.length - 1){
//				if(a[i] < r && a[i+1] > r){
//					//如果满足条件，说明
//					//r要放在第i+1位
//					b[i] = r;
//					return;
//				}else{
//					//不满足条件，则不插入r
//					//从a中取出第i位置的值，给b
//					b[i] = a[i];
//				}
//			}
			
			//最后一个直接给值
//			b[i] = a[i];
//		}
//		
//		System.out.println(Arrays.toString(b));
		
		
		
		
	}
}
