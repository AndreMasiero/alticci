package com.alticci.sequential;

import com.alticci.sequential.domain.dto.AlticciOutputDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.List;

public class AlticciBuilder {

    private static HashMap<Integer, Long> sequence = new HashMap<>();

    public static HashMap<Integer, Long> createSum() {
        return buildSum();
    }

    private static HashMap<Integer, Long> buildSum() {
        sequence.put(0, 0L);
        sequence.put(1, 1L);
        sequence.put(2, 1L);
        sequence.put(3, 1L);
        sequence.put(4, 2L);
        sequence.put(5, 2L);
        sequence.put(6, 3L);
        sequence.put(7, 4L);
        sequence.put(8, 5L);
        sequence.put(9, 7L);
        sequence.put(10, 9L);

        return sequence;
    }

    public static List<AlticciOutputDto> convertJsonToObject(String json) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<AlticciOutputDto> outputDto = objectMapper.readValue(
                json,
                objectMapper.getTypeFactory().constructCollectionType(
                        List.class, AlticciOutputDto.class
                )
        );

        return outputDto;
    }
}
