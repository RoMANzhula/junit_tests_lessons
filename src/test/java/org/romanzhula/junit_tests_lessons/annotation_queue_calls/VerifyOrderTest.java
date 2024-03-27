package org.romanzhula.junit_tests_lessons.annotation_queue_calls;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.util.ArrayList;

public class VerifyOrderTest { //verify works only with mock-objects
    ArrayList<String> list = Mockito.mock(ArrayList.class);

    @Test
    void test() {
        list.size();
        list.add("value");
        list.clear();

        InOrder inOrder = Mockito.inOrder(list);
        inOrder.verify(list).size();
        inOrder.verify(list).add("value");
        inOrder.verify(list).clear();
    }
}
