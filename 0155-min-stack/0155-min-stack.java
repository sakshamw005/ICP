class MinStack {
    private Stack<Map<Integer, Integer>> s;

    public MinStack() {
        s = new Stack<>();
    }

    public void push(int val) {
        int curr = s.isEmpty() ? val : Math.min(val, getMin());
        Map<Integer, Integer> map = new HashMap<>();
        map.put(val, curr);
        s.push(map);
    }

    public void pop() {
        if (!s.isEmpty()) {
            s.pop();
        }
    }

    public int top() {
        Map<Integer, Integer> top = s.peek();
        return top.keySet().iterator().next();
    }

    public int getMin() {
        Map<Integer, Integer> topMap = s.peek();
        return topMap.values().iterator().next();
    }
}

/**
 * Example usage:
 * MinStack obj = new MinStack();
 * obj.push(3);
 * obj.push(5);
 * obj.push(2);
 * System.out.println(obj.getMin()); // 2
 * obj.pop();
 * System.out.println(obj.getMin()); // 3
 */