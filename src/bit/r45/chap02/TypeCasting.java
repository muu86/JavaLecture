package bit.r45.chap02;

public class TypeCasting {

	public static void main(String[] args) {
		
		byte byteValue = 10;
		int intValue = byteValue; //int <--- byte
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드=" + intValue);
		
		
		checkValueBeforeCasting();
	}
	
	public static void checkValueBeforeCasting() {
		
		int i = 128;
		
		if ( (i < Byte.MAX_VALUE) || (i > Byte.MAX_VALUE) ) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해주세요.");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
		
	}
	
}
