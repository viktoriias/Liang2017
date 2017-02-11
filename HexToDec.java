
public class HexToDec {

	public static void main(String[] args) {
		System.out.println(hex2Dec("A1bbbf3"));

	}

	public static int hex2Dec(String hexString) {
		if (hexString.length() == 1) return hexCharToDigit(hexString.charAt(0));
		return (int)(Math.pow(16, hexString.length() - 1)) * hexCharToDigit(hexString.charAt(0)) + hex2Dec(hexString.substring(1));
	}
	
	static int hexCharToDigit(char ch) {
		if (ch >= '0' && ch <= '9') return ch -'0';
		else return Character.toUpperCase(ch) - 'A' + 10;
	}
}
