
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {

    
    public static void main(String[] args) {
       //добавить список машин

       List<Auto> list = new ArrayList<Auto>();
       Auto m1 = new Auto("BMW", "X5", 2008, 2.8, Type.DIESEL);
       Auto m2 = new Auto("Honda", "z55", 2011, 2.5, Type.DIESEL);
       Auto m3 = new Auto("Volkswagen", "yol32", 2015, 3.0,Type.DIESEL);
       Auto m4 = new Auto("Ford", "PIX", 2019, 3.2, Type.PETROL);
       Auto m5 = new Auto("Hyundai", "Tycson", 2020, 2.0, Type.PETROL);
       
       list.add(m1);
       list.add(m2);
       list.add(m3);
       list.add(m4);
       list.add(m5);

        //Сортировать Список в алфавитном порядке по имени модели


       list.stream().sorted((a1, a2) -> a1.getModel().compareTo(a2.getModel()))
               .forEach(item -> System.out.println(item.getName() + " && " + item.getModel()));


       
       
       //Фильтровать
       //Все машины с мотором > 1500 cm3
       //Все машины старше 10 лет
       
       List<Auto> list2 = new ArrayList<Auto>();

        for (Auto auto : list) {
            if(auto.getMotor() > 1.5 && LocalDate.now().getYear() - auto.getYear() > 10) {
                list2.add(auto);
            }
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////// Stream
        list2 = list.stream().filter(auto -> auto.getMotor() > 1.5 && LocalDate.now().getYear() - auto.getYear() > 10)
                .collect(Collectors.toList());

        list2.stream().forEach(m -> System.out.println(m.getName() + " && " + m.getMotor() + " && " + m.getYear()));

        /////////////////////////////////////////////////////////////////////////////////////////////////// Stream
        //Сохранить в отдельную коллекцию
        //Машины, по типу топлива

      Map<Type, List<Auto>> mapStream = list.stream().collect(Collectors.groupingBy(auto -> auto.getType()));

      for (Map.Entry<Type, List<Auto>> autoMap : mapStream.entrySet()) {
        System.out.println("Key: " + autoMap.getKey());
        for (Auto autoList : autoMap.getValue()) {
          System.out.println("--Value: " + autoList);
        }
      }



///////////////////////////////////////////////////////////////////////////////////////////////////

      Map<Type, List<Auto>> map = new HashMap<>();
      for (Auto auto: list) {
        if (map.containsKey(auto.getType())) {
         map.get(auto.getType()).add(auto);
        }
        else {
          map.put(auto.getType(), new ArrayList<Auto>());
        }
      }
///////////////////////////////////////////////////////////////////////////////////////////////////
        List<Auto> diesel = new ArrayList<Auto>();
        List<Auto> petrol = new ArrayList<Auto>();

          for (Auto auto : list) {
            if(auto.getType() == Type.DIESEL){
                diesel.add(auto);
            }
            else petrol.add(auto);
        }


         
         
                   
    }
    
}
