package java_fundamentals.java_basics.interfaces_7;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

// Interface defining the encryption functionality
public interface EncryptionAlgorithm {
    byte[] encrypt(byte[] data);
    byte[] decrypt(byte[] encryptedData);
}

// Concrete implementation of the EncryptionAlgorithm interface using AES encryption
class AESEncryption implements EncryptionAlgorithm {
    private static final String ALGORITHM = "AES";

    private Key generateKey() throws Exception {
        byte[] keyValue = "MySecretKey12345".getBytes();
        return new SecretKeySpec(keyValue, ALGORITHM);
    }

    @Override
    public byte[] encrypt(byte[] data) {
        try {
            Key key = generateKey();
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, key);
            return cipher.doFinal(data);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public byte[] decrypt(byte[] encryptedData) {
        try {
            Key key = generateKey();
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, key);
            return cipher.doFinal(encryptedData);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public static void main(String[] args) {
        // Sample data to encrypt
        String originalData = "Hello, world!";
        System.out.println("Original Data: " + originalData);

        // Create an instance of AESEncryption
        AESEncryption aesEncryption = new AESEncryption();

        // Encrypt the data
        byte[] encryptedData = aesEncryption.encrypt(originalData.getBytes());
        System.out.println("Encrypted Data: " + Base64.getEncoder().encodeToString(encryptedData));

        // Decrypt the encrypted data
        byte[] decryptedData = aesEncryption.decrypt(encryptedData);
        System.out.println("Decrypted Data: " + new String(decryptedData));
    }
}
