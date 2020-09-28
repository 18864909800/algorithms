package com.wtw;

/**
 * @ClassName Vaild
 * @Description: TODO
 * @Author 949210597
 * @Date 2020/9/28
 * @Version V1.0
 **/
public class Vaild {
    public boolean valid(String word, String abbr) {
        int num = 0;  //表示数字
        int index = 0; //表示word索引
        for (int i = 0; i < abbr.length(); i++) {
            if ('0' <= abbr.charAt(i) && abbr.charAt(i) <= '9') {
                if (num == 0 && abbr.charAt(i) == '0') {
                    return false;
                }
                num *= 10;
                num += abbr.charAt(i) - '0';
            } else {
                index += num;
                num = 0;
                if (index >= word.length() || word.charAt(index) != abbr.charAt(i)) {
                    return false;
                }
                index++;
            }
        }
        if (num == 0) {
            return true;
        }

        if (num != 0 && index + num == word.length()) {
            return true;
        }
        return false;
    }
}
