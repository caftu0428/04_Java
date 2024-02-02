package edu.kh.oop.constructor;

public class MemberRun {

	public static void main(String[]args) {
		
		// 회원 객체 생성
		// -> 기본 생정자를 이용해서 생성
		Member member1 = new Member();
		
		// null == '참조하는 객체가 없다'를 나타내는 값
		//				 (저장도니 주소가 없다)
		member1.inform();
		
		// member1이 참조하는 Member객체의 필드값을 세팅
		member1.setMemberId("member01");
		member1.setMemberPw("pass01");
		member1.setMemberName("개시");
		member1.setMemberAge(77);
		
		// 새로운 Member객체 생성 후 필드 값 세팅
		Member member2 = new Member(); // 기본 생성자 이용
		
		member2.setMemberId("member08");
		member2.setMemberPw("pass04");
		member2.setMemberName("개라시");
		member2.setMemberAge(5);
		
		System.out.println("[member1]");
		member1.inform();
		
		System.out.println("[member2]");
		member2.inform();
		
		// -------------------------------------
		// 매개 변수 생성자를 이용해서 Member 객체 생성
		// -> 코드 길이 감소
		Member member3 = new Member("goodbe3", "pwpw3", "김시너", 85);
		System.out.println("[member3]");
		member3.inform();
		
		Member member4 = new Member("goodbe7", "pw7788", "라너", 45);
		System.out.println("[member4]");
		member4.inform();
		
		
		// ** 프로그래밍 언어에서 변수명, 함수명, 메서드명 중복 허용 x **
		
		// 변수명 중복
		int a = 10;
	  //int a = 20;
		
	}
	
	// 메드명 중복
	public void test() {}
  //public void test() {}
	
	
}
