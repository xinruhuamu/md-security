package org.xrhm.mdsecurity.util.lang;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xinruhuamu
 * @description
 * @date 2020/7/16 23:46
 */
public class IntegerUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(IntegerUtil.class);


    /**
     * 将整型数字转换为字符串，并在字符串之前添加"0"
     *
     * @param i     eg.需要转换的整型数字 1000
     * @param digit eg.需要转换成的位数 5
     * @return "01000"
     */
    public static String castToString(int i, int digit) {
        String str = String.valueOf(i);
        StringBuilder value = new StringBuilder(str);

        if (str.length() > digit || digit > 7) {
            LOGGER.error("想要转换的类型长度小于原数据的长度或者转换长度过长，无法转换！");
        } else {
            for (int n = digit - str.length(); n > 0; n--) {
                value.insert(0, "0");
            }
        }
        return value.toString();
    }
}
