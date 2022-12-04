package advanced.streamy;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {
    public static void main(String[] args) {
        List<String> warnings = new ArrayList<>();
        warnings.add("jest problem");
        warnings.add("coś się sypie");
        warnings.add("łolaboga");
        warnings.add("weź pan to napraw");

//        warnings.forEach(transform);


        for (String warning : warnings) {
            System.out.println(warning.toUpperCase().concat("!"));
            //System.out.println(transformText(warning));
        }

        TransformFunction warningTransform = new TransformFunction(){
            @Override
            public String transform(String text) {
                return text.toUpperCase().concat("!");
            }
        };

        for (String warning : warnings) {
            System.out.println(warningTransform.transform(warning));
        }
        System.out.println("-----");
        myForEach(warningTransform,warnings);

        myForEach(new TransformFunction() {
            @Override
            public String transform(String text) {
                return text.concat("      ").repeat(3);
            }
        }, warnings);


    TransformFunction transformFunction  =
            (String text) ->{
                return text.concat("      ").repeat(3);
            };

        TransformFunction transformFunction2 = text -> text.concat("      ").repeat(3);
        System.out.println("---");
        myForEach(warn-> warn.toUpperCase().concat("!"),warnings );

        //Runnable
        //Throwable
        //Comparable
        //Iterable

        //Comparator - T,T -> int
        //Consumer T -> void
        //Supplier () -> T
        //Function T -> E
        //Predicate T -> boolean
        //Operator T -> T

        //na consumerze
        warnings.forEach(text -> System.out.println(text.toUpperCase()+"!"));

        List<String> warnings2 = warnings.stream()
                .filter(warning -> warning.length() > 10)
                .sorted((warn1, warn2) -> warn1.length() - warn2.length())
                .map(warning -> warning.toUpperCase().concat("!!!"))
                .toList();
        System.out.println(warnings2);


    }

    public static void myForEach (TransformFunction transform, List<String> list){
        for (String text : list) {
            System.out.println(transform.transform(text));
        }
    }

    public static String transformText(String text){
        return text.toUpperCase().concat("!");
    }
}

//          5     10
//          5 - 10 = -5
