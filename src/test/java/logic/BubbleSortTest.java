package logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @DisplayName("버블소트 - 리스트를 넣으면 정렬된 결과를 리턴")
    @Test
    void test(){
        //Given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        //When
        List<Integer> actual = bubbleSort.sort(List.of(6,2,4,1,3));

        //Then
        assertEquals(List.of(1,2,3,4,6), actual);

    }

}