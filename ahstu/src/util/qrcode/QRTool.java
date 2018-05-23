package util.qrcode;

import com.google.zxing.*;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class QRTool {
    public static boolean url2qrcode(String content, String path, String qrcode) {
        try {
            MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
            Map<EncodeHintType, String> hints = new HashMap<EncodeHintType, String>();
            hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            BitMatrix bitMatrix = multiFormatWriter.encode(content,
                    BarcodeFormat.QR_CODE, 400, 400, hints);
            File file1 = new File(path, qrcode);
            MatrixToImageWriter.writeToFile(bitMatrix, "jpg", file1);
            return true;

        } catch (Exception e1) {
            return false;
        }
    }

    public static String qrcode2Url(String filePath, Result result) {
        try {
            MultiFormatReader formatReader = new MultiFormatReader();

            File file = new File(filePath);
            BufferedImage image = ImageIO.read(file);

            LuminanceSource source = new BufferedImageLuminanceSource(image);
            Binarizer binarizer = new HybridBinarizer(source);
            BinaryBitmap binaryBitmap = new BinaryBitmap(binarizer);
            Map hints = new HashMap();
            hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            result = formatReader.decode(binaryBitmap, hints);

            return result.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}