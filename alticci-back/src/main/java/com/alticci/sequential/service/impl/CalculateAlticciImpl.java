package com.alticci.sequential.service.impl;

import com.alticci.sequential.service.CalculateAlticci;
import org.springframework.stereotype.Component;

@Component
public class CalculateAlticciImpl implements CalculateAlticci {

    @Override
    public long calculateAlticciRecursion(int num) {
        switch (num) {
            case 0:
                return 0L;
            case 1:
            case 2:
                return 1L;
            default:
                return calculateAlticciRecursion(num - 2) + calculateAlticciRecursion(num - 3);
        }
    }

}
