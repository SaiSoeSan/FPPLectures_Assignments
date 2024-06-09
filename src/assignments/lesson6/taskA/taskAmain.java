package assignments.lesson6.taskA;

import java.util.Arrays;

public class taskAmain {
    public static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();
        Arrays.sort(data,new NameComparator());
        System.out.println(Arrays.toString(data));
    }
}
