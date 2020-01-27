package code401challenges.utilities;

import java.util.*;

public class MultiBracketValidation {
    public static boolean multiBracketValidation(String input) {

        HashMap<Character,Character> hash_map = new HashMap<Character, Character>();
        hash_map.put('(',')');
        hash_map.put('[',']');
        hash_map.put('{','}');

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (hash_map.containsKey(ch)) {
                stack.push(ch);
            }
            if (hash_map.containsValue(ch)) {
                if (hash_map.get(stack.peek()) == ch)
                stack.pop();
            }
        }
//        System.out.println("stack.toString() = " + stack.toString());
        return stack.isEmpty();
    }
}
