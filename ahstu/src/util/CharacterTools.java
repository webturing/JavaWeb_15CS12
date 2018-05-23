package util;

import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2017/3/29.
 */
public class CharacterTools {
    public static String ISO88591ToUnicode(String iso) {
        try {
            return new String(iso.getBytes("ISO-8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return new String(iso);
    }
}
