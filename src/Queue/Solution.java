package Queue;

public class Solution {
    static class Node{
        String val;
        Node prev = null;
        Node next = null;
        public Node(String val){
            this.val = val;
        }

    }


    static class Queue {

    }

    public static void main(String[] args) {
        try {
            doTestsPass();
            System.out.println("All tests passed");
        } catch (Exception ex) {
            System.out.println("Test failed");
            ex.printStackTrace();
        }
    }

    private static void doTestsPass() throws Exception {

        final Queue queue = new Queue();
        // enqueue
    };

    private static void assertTrue(boolean condition, String message) throws Exception {
        if (!condition) throw new Exception(message);
    }
}