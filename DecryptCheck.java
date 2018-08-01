import java.util.Base64;

public class DecryptCheck {
	public static void main(String[] args) {
		String encryptString = "";
		String normalText = "krishna";
		Base64.Encoder encoder = Base64.getEncoder();
		Base64.Decoder decoder = Base64.getDecoder();
		encryptString = encoder.encodeToString(normalText.getBytes());
		System.out.println("encryptString "+encryptString);
		String decodeString = new String(decoder.decode(encryptString.getBytes()));
		System.out.println(decodeString);
		try {
		    decoder.decode(encryptString+"323");
		} catch(IllegalArgumentException iae) {
		    System.out.println(iae.getMessage());
		}
	}
	
	
}
