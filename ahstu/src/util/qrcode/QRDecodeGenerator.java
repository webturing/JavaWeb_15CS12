package util.qrcode;

import com.google.zxing.*;
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class QRDecodeGenerator {
    public static void main(String[] args) {
        Result result = qrcode2url(".", "AHSTU.jpg");
        System.out.println("result = " + result.toString());
        System.out.println("resultFormat = " + result.getBarcodeFormat());
        System.out.println("resultText = " + result.getText());
    }

    public static Result qrcode2url(String path, String filename) {
        try {
            MultiFormatReader formatReader = new MultiFormatReader();

            File file = new File(path, filename);
            BufferedImage image = ImageIO.read(file);
            ;
            LuminanceSource source = new BufferedImageLuminanceSource(image);
            Binarizer binarizer = new HybridBinarizer(source);
            BinaryBitmap binaryBitmap = new BinaryBitmap(binarizer);
            Map hints = new HashMap();
            hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            Result result = formatReader.decode(binaryBitmap, hints);


            return result;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
