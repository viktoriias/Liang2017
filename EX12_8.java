public class EX12_8 {

	public static void main(String[] args) {
		try {
			System.out.println(hex2Dec("1A7i"));
		} catch (HexFormatException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static int hex2Dec(String hex) throws HexFormatException {
		if (!hex.matches("[\\dA-Fa-f]+")) throw new HexFormatException();
		
		return Integer.parseInt(hex, 16);
	}
}

class HexFormatException extends Exception {
	HexFormatException() {
		super("not a hex number");
	}
}
