package Mar22;

// 기본수학
/*
-- ACM 호텔 10250
방 번호는 YXX 나 YYXX 형태인데 여기서 Y 나 YY 는 층 수를 나타내고 XX 는 엘리베이터에서부터 세었을 때의 번호를 나타낸다. 
즉, 그림 1 에서 빗금으로 표시한 방은 305 호가 된다.

손님은 엘리베이터를 타고 이동하는 거리는 신경 쓰지 않는다. 
다만 걷는 거리가 같을 때에는 아래층의 방을 더 선호한다. 예를 들면 102 호 방보다는 301 호 방을 더 선호하는데, 
102 호는 거리 2 만큼 걸어야 하지만 301 호는 거리 1 만큼만 걸으면 되기 때문이다. 
같은 이유로 102 호보다 2101 호를 더 선호한다.

여러분이 작성할 프로그램은 초기에 모든 방이 비어있다고 가정하에 이 정책에 따라 N 번째로 도착한 손님에게 배정될 방 번호를 계산하는 프로그램이다. 
첫 번째 손님은 101 호, 두 번째 손님은 201 호 등과 같이 배정한다. 그림 1 의 경우를 예로 들면, H = 6이므로 10 번째 손님은 402 호에 배정해야 한다.
*/

import java.util.*;

public class Math_10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();

		
		int floor = 0, roomno = 0;
		String sfloor = "", sroomno = "";
		
		for(int i=0; i<cnt; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();

			
			floor = (n%h==0)? h : n%h;
			roomno = (n%h==0)? n/h : n/h+1;
			
			sfloor = String.valueOf(floor);
			sroomno = (roomno<10)? "0"+String.valueOf(roomno):String.valueOf(roomno);
			System.out.println(sfloor+sroomno);
		}
		
		sc.nextLine();
		sc.close();
	}		
}