package immutableClass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ImmutableObjectTest {
    ImmutableObject immutableObject = new ImmutableObject();


    @Test
    void finalImmnutable(){

        final List<String> strings = new ArrayList<>();
        Assertions.assertEquals(0,strings.size()); // return true -> BUILD SUCCESSFUL
//        strings.add("kim");
//        assertEquals(0, strings.size()); // test FAILED
    }


    @Test
    void assertImmutable(){
        //given
        String fullName = immutableObject.name; // JooHyeongKim
        String newName = immutableObject.newName; // JooHyeong

        //when


        //then
        /**
         * BUILD SUCCESSFUL
         */
        assertEquals(fullName, "JooHyeongKim");
        assertEquals(newName, "JooHyeong");
//        assertEquals(fullName, newName);
        /** test FAILED
         * expected: <JooHyeongKim> but was: <JooHyeong>
         * 필요:JooHyeongKim
         * 실제   :JooHyeong
         */

    }
}