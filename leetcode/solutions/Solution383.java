package leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomNoteMap = new HashMap<>();
        Map<Character, Integer> magazineMap = new HashMap<>();
        Integer count;
        boolean result = true;

        for(char c : ransomNote.toCharArray()) {
            count = ransomNoteMap.get(c);
            if(count == null) {
                count = 0;
            }
            ransomNoteMap.put(c, count + 1);
        }

        for(char c : magazine.toCharArray()) {
            count = magazineMap.get(c);
            if(count == null) {
                count = 0;
            }
            magazineMap.put(c, count + 1);
        }

        for (Map.Entry<Character, Integer> entry : ransomNoteMap.entrySet()) {
            if(magazineMap.get(entry.getKey()) == null) {
                result = false;
            } else {
                if(magazineMap.get(entry.getKey()) < entry.getValue()) {
                    result = false;
                }
            }
        }

        return result;
    }
}
