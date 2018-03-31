package letcode;


import java.util.*;

/**
 * 给定一个字符串数组，将相同字谜组合在一起。（字谜是指颠倒字母顺序而成的字）

 例如，给定 ["eat", "tea", "tan", "ate", "nat", "bat"]，返回：

 [
 ["ate", "eat","tea"],
 ["nat","tan"],
 ["bat"]
 ]

 基本思路：
 遍历整个String数组，对字符串其中的字符是否与其它字符串有相同字母
 有相同字母的加入同一个数组中，反之则继续进行遍历

 */
public class Practice49 {

//    public static List<List<String>> groupAnagrams(String[] strs) {
//        Set<String> set = new HashSet<String>();
//        for(int i = 0; i < strs.length; i++){
//            String s = strs[i];
//            char[] chars1 = s.toCharArray();
//            for(int j = i + 1; j<strs.length; j++){
//                String s2 = strs[j];
//                char[] chars2 = s2.toCharArray();
//                Arrays.sort(chars1);
//                Arrays.sort(chars2);
//                for(int k = 0; k < chars1.length; k++){
//                    if(chars1[k] == chars2[k]){
//                        set.add(s);
//                    }
//                }
//            }
//        }
//        return null;
//    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<String>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<List<String>>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(strs);
    }
}
