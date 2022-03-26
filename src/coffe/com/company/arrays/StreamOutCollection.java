package coffe.com.company.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamOutCollection {

    public List<String> dayName() {
        List<String> dayList = new ArrayList<>();
        dayList.add("Січень");
        dayList.add("Лютий");
        dayList.add("Березень");
        dayList.add("Квітень");
        dayList.add("Травень");
        dayList.add("Червень");
        dayList.add("Липень");
        dayList.add("Серпень");
        dayList.add("Вересень");
        dayList.add("Жовтень");
        dayList.add("Листопад");
        dayList.add("Грудень");
        return dayList;
    }

    public void forOutputMouse(List<String> list, String mounts){
        for (String str : list){
            if (str.equalsIgnoreCase(mounts)){
                System.out.println(str);
            }
        }
    }

    public void streamOutputMouse(List<String> list, String mounts) {
        list.stream().filter(x -> x.equalsIgnoreCase(mounts))
                .collect(Collectors.toSet())
                .forEach(System.out::println);

    }
}
