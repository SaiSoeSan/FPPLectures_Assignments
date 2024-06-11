package assignments.lesson8.problem3;

import java.util.Comparator;

public class MarketingComparator implements Comparator<Marketing> {
    @Override
    public int compare(Marketing o1, Marketing o2) {
        if( Double.compare(o1.getSalesamount(), o2.getSalesamount()) != 0){
            return Double.compare(o1.getSalesamount(), o2.getSalesamount());
        }
        if(o1.getEmployeename().compareTo(o2.getEmployeename()) != 0){
            return o1.getEmployeename().compareTo(o2.getEmployeename());
        }else{
            return o1.getProductname().compareTo(o2.getProductname());
        }
    }
}
