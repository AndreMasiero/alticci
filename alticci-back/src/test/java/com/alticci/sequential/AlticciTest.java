package com.alticci.sequential;

import com.alticci.sequential.domain.dto.AlticciOutputDto;
import com.alticci.sequential.service.CalculateAlticci;
import com.alticci.sequential.service.AlticciService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashMap;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.testng.Assert.assertEquals;

public class AlticciTest {

    @Mock
    private CalculateAlticci calculateAlticci;

    @InjectMocks
    private AlticciService alticciService;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void calculateSequentialOk() throws JsonProcessingException {

        HashMap<Integer, Long> sequence = AlticciBuilder.createSum();

        for (int i = 0; i <= 10; i++) {
            doReturn(sequence.get(i)).when(calculateAlticci).calculateAlticciRecursion(i);
        }

        String response = alticciService.execute(11);

        List<AlticciOutputDto> outputDto = AlticciBuilder.convertJsonToObject(response);

        verify(calculateAlticci, times(1)).calculateAlticciRecursion(10);
        assertEquals(outputDto.size(), 11);
        assertEquals(outputDto.get(6).getSum(), 3);
    }

}
