import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.Code128Writer;

import java.nio.file.Paths;

public class GeneratedBARCode
{
    public static void main(String[] args)
    {
        try
        {
            String text = "https://leetcode.com/u/KaustubhKhali/";
            String path = "/Users/kaustubh/GeneratedQRCode/LeetcodeProfileBarcode.jpg";
            Code128Writer writer = new Code128Writer();
            BitMatrix matrix = writer.encode(text, BarcodeFormat.CODE_128, 500, 300);
            MatrixToImageWriter.writeToPath(matrix, "jpg", Paths.get(path));
            System.out.println("barcode created");
        }
        catch(Exception e)
        {
            System.out.println("error");
        }


    }
}
