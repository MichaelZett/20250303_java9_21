package de.zettsystems.java9_10.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsNewMethods {
    public static void main(String[] args) {
        flatMapping();
        filtering();
    }

    public static void filtering() {
        List<Integer> list = Stream.of(1, 2, 3, 4, 5, 6)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(list);

        list = Stream.of(1, 2, 3, 4, 5, 6)
                .collect(Collectors.filtering(
                        n -> n % 2 == 0,
                        Collectors.toList()
                ));

        System.out.println(list);
    }

    public static void flatMapping() {
        Set<Integer> mergedSet = Stream.of(Set.of(1, 2), Set.of(2, 3), Set.of(4))
                .flatMap(Set::stream)
                .collect(Collectors.toSet());

        System.out.println(mergedSet);

        mergedSet = Stream.of(Set.of(1, 2), Set.of(2, 3), Set.of(4))
                .collect(Collectors.flatMapping(
                        Set::stream,
                        Collectors.toSet()
                ));

        System.out.println(mergedSet);
    }


}
