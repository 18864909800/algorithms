package com.wtw;

/**
 * @ClassName FindTop100
 * @Description: TODO
 * @Author 949210597
 * @Date 2020/11/18
 * @Version V1.0
 **/
import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class FindTop100 {
    public static void main(String[] args) throws IOException {
        FileInputStream fstream = new FileInputStream(new File("access.log"));
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String strLine;
        String url;
        String ip;
        Map<String, HashSet<String>> retMap = new HashMap<String, HashSet<String>>();
        while ((strLine = br.readLine()) != null) {
            String[] s = strLine.split(" ");
            url = s[0];
            ip = s[1];
            HashSet<String> set = retMap.get(url);
            if (set == null) {
                set = new HashSet<>();
                retMap.put(url,set);
            }
            set.add(ip);
        }

        String[] TOP=new String[100];
        for (int i = 0; i < 100; i++) {
            int value;
            int max=0;
            String temp ="";
            Iterator<Map.Entry<String, HashSet<String>>> it = retMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String,HashSet<String>> entry = it.next();
                value=entry.getValue().size();
                if(max<value){
                    max = value;
                    temp = entry.getKey();
                }
                TOP[i]=temp;
                it.remove();
            }
        }
    }
}

