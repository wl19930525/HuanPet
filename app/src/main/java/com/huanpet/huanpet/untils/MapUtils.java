package com.huanpet.huanpet.untils;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by mMaster
 * on 2018/3/29.
 * at 北京
 */

public class MapUtils {
    public static Map<String, Object> sortMapByKey(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }

        Map<String, Object> sortMap = new TreeMap<String, Object>(new MapKeyComparator());

        sortMap.putAll(map);

        return sortMap;
    }
}
class MapKeyComparator implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}
