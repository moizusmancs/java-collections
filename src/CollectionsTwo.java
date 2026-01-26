import java.util.Arrays;
import java.util.Comparator;

public class CollectionsTwo {
    static void main(){

        Integer[] arr = {6,4,3,8,7};
        Arrays.sort(arr, (Integer a, Integer b) -> b-a);

        for (int val: arr){
            System.out.println(val);
        }

        Car[] cars = new Car[3];
        cars[0] = new Car("suv", "petrol");
        cars[1] = new Car("sedan", "diesel");
        cars[2] = new Car("hatchback", "cng");

//        Arrays.sort(cars, (Car obj1, Car obj2) -> obj1.carName.compareTo(obj2.carName));
//        Arrays.sort(cars, Comparator.comparing((Car obj) -> obj.carName).reversed());
//        Arrays.sort(cars, new CarNameComparator());
//        Arrays.sort(cars, new Car());


        for (Car temp : cars){
            System.out.println(temp.toString());
        }

    }


}
