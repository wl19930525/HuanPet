

/**   
 * @描述:	
 * @作�??:	Android - CXP
 * @创建日期:	2016�?4�?12�? 上午9:08:09  
 */

package com.huanpet.huanpet.untils;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;


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



