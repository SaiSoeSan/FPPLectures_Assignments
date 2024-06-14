package assignments.lesson9.prob2;

public class LinkedListStackMain {
    public static void main(String[] args) {
        LinkedListStack st = new LinkedListStack();
        st.push("Sai");
        st.push("Soe");
        st.push("San");
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.peek());
        st.pop();
        System.out.println("After remove ....");
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.peek());
    }
}
