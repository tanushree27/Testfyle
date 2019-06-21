package com.test.details.pageinterface;


import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.io.Serializable;

public class OffsetLimitRequest implements Pageable, Serializable {

    private int limit;
    private int offset;


    public OffsetLimitRequest(int offset, int limit){
        this.limit = limit;
        this.offset = offset;
    }

    @Override
    public int getPageNumber() {
        return 0;
    }
    @Override
    public int getPageSize() {
        return limit;
    }
    @Override
    public int getOffset() {
        return offset;
    }

    @Override
    public Sort getSort() {
        return null;
    }

    @Override
    public Pageable next() {
        return null;
    }

    @Override
    public Pageable previousOrFirst() {
        return null;
    }

    @Override
    public Pageable first() {
        return null;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }
}
