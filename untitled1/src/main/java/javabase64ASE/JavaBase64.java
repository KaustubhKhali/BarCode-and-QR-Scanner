package javabase64ASE;

import java.util.Base64;

class JavaBase64 {

    public static void main(String[] args) {
        Base64.Encoder encoder = Base64.getEncoder();
        String originalString = "YOUR_SECRETE_KEY";
        String encodedString = encoder.encodeToString(originalString.getBytes());

        System.out.println("Encrypted Value :: " +encodedString);
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] bytes = decoder.decode(encodedString);

        System.out.println("Decrypted Value :: " +new String(bytes));
    }

}