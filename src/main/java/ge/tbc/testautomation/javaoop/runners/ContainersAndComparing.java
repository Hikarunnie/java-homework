package ge.tbc.testautomation.javaoop.runners;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.figures.ReverseComparator;
import java.util.*;

public class ContainersAndComparing {
    public static void main(String[] args){
        ArrayList<String> numList = new ArrayList<>();
        numList.add("555-542-231");
        numList.add("555-887-987");
        numList.add("555-161-143");
        numList.add("555-189-6667");

        Iterator<String> iter = numList.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        HashMap<String,String> numHash = new HashMap<>();
        numHash.put("Hikaru",numList.get(0));
        numHash.put("Cinc",numList.get(1));
        numHash.put("Star",numList.get(2));
        numHash.put("Ndjbsw",numList.get(3));

        for(String name: numHash.keySet()){
            String num = numHash.get(name);
            if(num.contains("8")){
                System.out.println(name);
            }
        }
////iterator version just in case, since assignment didn't specify
//        Iterator<String> hashIter = numHash.keySet().iterator();  //iterating over keys
//        while(hashIter.hasNext()){
//            String name = hashIter.next();
//            String num = numHash.get(name);
//            if(num.contains("8")){
//                System.out.println(name);
//            }
//        }

       ////compared 2 circles
       Circle c1 = new Circle(4);
       Circle c2 = new Circle(4);
       System.out.println(c1.compareTo(c2));

       ////TreeSet
       TreeSet<Circle> circles = new TreeSet<>();
        for (int i = 0; i <6 ; i++) {   //for loop for simplicity
            circles.add(new Circle(Math.random()));
        }
        circles.add(new Circle(3.14)); //radius duplicates
        circles.add(new Circle(4.4));
        circles.add(new Circle(4.4));
        circles.add(new Circle(3.14));

        for (Circle c : circles) {
            System.out.println(c);
        }

        ////HashSet
        HashSet<Circle> circleHash = new HashSet<>();
        for (int i = 0; i <6 ; i++) {
            circleHash.add(new Circle(Math.random()));
        }
        circleHash.add(new Circle(3.14)); //radius duplicates
        circleHash.add(new Circle(4.4));
        circleHash.add(new Circle(4.4));
        circleHash.add(new Circle(3.14));

        for (Circle c : circleHash) {
            System.out.println("in hashset: " + c);
        }

        //// reverse comp rectangle
        List<Rectangle> rectList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            rectList.add(new Rectangle(Math.random(), Math.random()));
        }
        System.out.println("Before:" + rectList.toString());

        Collections.sort(rectList, new ReverseComparator());
        System.out.println("After:" + rectList.toString());
    }
}
