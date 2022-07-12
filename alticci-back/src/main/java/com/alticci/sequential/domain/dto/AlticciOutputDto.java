package com.alticci.sequential.domain.dto;

import io.swagger.annotations.ApiModelProperty;

public class AlticciOutputDto {

    @ApiModelProperty("Index")
    private int index;

    @ApiModelProperty("Sum")
    private long sum;

    public void setIndex(int index) {
        this.index = index;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public int getIndex() {
        return index;
    }

    public long getSum() {
        return sum;
    }
}
