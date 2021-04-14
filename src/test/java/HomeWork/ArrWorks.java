package HomeWork;

import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class ArrWorks {
    private ArrayHandler handler;

    @BeforeEach
    public void init() {
        handler = new ArrayHandler();
    }

//    @Test
//    public void testArr() {
////        ArrayHandler handler = new ArrayHandler();
//        int[] arr = {1, 3, 4, 6, 7, 8};
//        handler.arrWork(arr);
//    }


    @ParameterizedTest()
    @MethodSource("argForArrSplit")
    public void testArrSplit(int[] arr) {
        ArrayHandler handler = new ArrayHandler();
        handler.arrWork(arr);
    }

    public static Stream<Arguments> argForArrSplit() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[]{1,2,4,5,67,3,1}));
        out.add(Arguments.arguments(new int[]{1,4,4,4,4,3,1}));
        out.add(Arguments.arguments(new int[]{1,2,4,5,67,4,1}));
        return out.stream();
    }


}
