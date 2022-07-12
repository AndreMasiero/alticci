package com.alticci.sequential.service;

import com.alticci.sequential.domain.dto.AlticciOutputDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlticciService {

    @Autowired
    private CalculateAlticci calculateAlticci;

    @Cacheable(cacheNames = "alticci-sequential-cache")
    public String execute(int n) throws JsonProcessingException {

        List<AlticciOutputDto> result = executeSequentialNumber(n);

        ObjectMapper mapper = new ObjectMapper();

        return mapper.writeValueAsString(result);
    }

    private List<AlticciOutputDto> executeSequentialNumber(int n) {

        List<AlticciOutputDto> alticciOutputDtoList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            long sum = calculateAlticci.calculateAlticciRecursion(i);

            AlticciOutputDto alticciOutputDto = new AlticciOutputDto();
            alticciOutputDto.setIndex(i + 1);
            alticciOutputDto.setSum(sum);

            alticciOutputDtoList.add(alticciOutputDto);
        }

        return alticciOutputDtoList;
    }

}
