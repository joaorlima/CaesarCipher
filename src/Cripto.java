import java.util.Scanner;

public class Cripto extends CaesarCipher
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
	
		System.out.print("Press 1 to Encrypt and 2 to Decrypt: ");
		int choice = in.nextInt();		
		
		System.out.println();

		switch (choice)
		{
			case 1:
				
				in.nextLine();
				System.out.print("Message to be encrypted: ");
				String strEncrypt = in.nextLine();
								
				System.out.print("Cipher: ");
				int encryptKey = in.nextInt();
				
				System.out.println("Encrypted message: " + enc(strEncrypt, encryptKey));
				
				break;
				
			case 2:
				
				in.nextLine();
				System.out.print("Message to be decrypted: ");
				String strDecrypt = in.nextLine();
				
				System.out.print("Cipher: ");
				int decryptKey = in.nextInt();
				
				System.out.println("Decrypted message: " + dec(strDecrypt, decryptKey));

				break;
		}		
	}	
}
