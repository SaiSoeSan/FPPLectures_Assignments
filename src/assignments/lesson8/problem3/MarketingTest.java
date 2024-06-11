package assignments.lesson8.problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MarketingTest {
    public static void main(String[] args) {

        List<Marketing> marketingList = new ArrayList<>();

        Marketing m1 = new Marketing("Apple","IPhone15",300.23);
        Marketing m2 = new Marketing("Microsoft","Cloud",346.45);
        Marketing m3 = new Marketing("Google","Gemini",2010.23);
        Marketing m4 = new Marketing("ERA","Sales+",100.20);
        Marketing m5 = new Marketing("Momenta","Leadership+",300.23);

        marketingList.add(m1);
        marketingList.add(m2);
        marketingList.add(m3);
        marketingList.add(m4);
        marketingList.add(m5);

        // delete an object
        removeMarketingObject(marketingList, m5);

        System.out.println("Size of the list: " + marketingList.size());

        // get object by position
        Marketing marketingAtPosition = marketingList.get(2);
        System.out.println("Marketing object at position 2: " + marketingAtPosition);

        // update object by position
        marketingList.set(1, new Marketing("Host Myanmar", "POS", 1200));
        System.out.println("Updated Marketing object at position 1: " + marketingList.get(1));

        // sort the list in natural order for the field salesAmount
        Collections.sort(marketingList, new MarketingComparator());
        System.out.println("Sorted list by sales amount: " + marketingList);

        // sort the list by employee name which aare more that 100
        List<Marketing> filteredList = listMoreThan1000(marketingList);
        Collections.sort(filteredList, (m11, m21) -> m11.getEmployeename().compareTo(m21.getEmployeename()));
        System.out.println("Sorted list of employees with sales more than $1000 by employee name: " + filteredList);
    }

    public static void removeMarketingObject(List<Marketing> list, Marketing obj){
        if(list.contains(obj)){
            list.remove(obj);
            System.out.println("Object removed: " + obj);
        }else{
            System.out.println("Object is not in the list: " + obj);
        }
    }

    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        List<Marketing> result = new ArrayList<>();
        for (Marketing m : list) {
            if(m != null){
                if (m.getSalesamount() > 1000) {
                    result.add(m);
                }
            }
        }
        return result;
    }
}
