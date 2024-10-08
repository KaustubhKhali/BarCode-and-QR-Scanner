import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Paths;

public class GenerateQRCode
{
    public static void main(String[] args) throws WriterException, IIOException, IOException
    {
        String data = "https://leetcode.com/u/KaustubhKhali/";
        String path = "/Users/kaustubh/GeneratedQRCode/LeetcodeProfile.jpg";
        BitMatrix matrix = new MultiFormatWriter().encode(data, BarcodeFormat.QR_CODE, 500, 500);
        MatrixToImageWriter.writeToPath(matrix, "jpg", Paths.get(path));
        System.out.println("QR created");

    }
}
