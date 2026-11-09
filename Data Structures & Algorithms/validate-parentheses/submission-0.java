class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> symbols = new HashMap<>();
        symbols.put('}', '{');
        symbols.put(']', '[');
        symbols.put(')', '(');

        Stack<Character> stack = new Stack<>();

        for( Character c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (
                    (c == '}' || c == ']' || c == ')')
                    && (!stack.isEmpty() && stack.pop() == symbols.get(c))
                ) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }

}
