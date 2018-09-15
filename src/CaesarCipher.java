public class CaesarCipher
{
	public static String enc(String strToEncrypt, int strToEncryptKey)
	{
		strToEncrypt = strToEncrypt.toUpperCase();
		
		char[] strToEncryptChar = strToEncrypt.toCharArray();
		
	    for(int i = 0; i < strToEncryptChar.length; i++)
	    {	    	
	    	strToEncryptChar[i] = (char) ((( (int) (strToEncryptChar[i] + strToEncryptKey) - 65) % 26) + 65);	           	
	    }
					
		return String.valueOf(strToEncryptChar);		
	}
	
	public static String dec(String strToDecrypt, int strToDecryptKey)
	{
		strToDecrypt = strToDecrypt.toUpperCase();
		
		char[] strToDecryptChar = strToDecrypt.toCharArray();
		
	    for(int i = 0; i < strToDecryptChar.length; i++)
	    {
	    	strToDecryptChar[i] = (char) ((( (int) (strToDecryptChar[i] - strToDecryptKey) + 65) % 26) + 65);	
	    }
					
		return String.valueOf(strToDecryptChar);		
	}
}
