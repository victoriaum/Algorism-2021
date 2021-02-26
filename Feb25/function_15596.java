package Feb25;

//함수
/*
- 정수n개의 합 15596
Java: long sum(int[] a); (클래스 이름: Test)
a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
리턴값: a에 포함되어 있는 정수 n개의 합
public class Test {
    long sum(int[] a) {
        long ans = 0;
        return ans;
    }
}
*/

public class function_15596 {
	
    int[] a = new int[1000001];

	public static long sum(int[] a) {
    	long ans = 0, n=0;
    	if(1<=n&&n<=3000000) {
			for (int i=1; i<=n; i++) {
				a[i-0]=i;
			}
		}
    	for (int i=0; i<a.length; i++) {
			ans += a[i];
		}
	return ans;	
	}
}
