package com.youzan.open.sdk.gen.v1_0_0.model;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.youzan.open.sdk.model.APIParams;
import com.youzan.open.sdk.model.ByteWrapper;
import com.youzan.open.sdk.model.FileParams;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class KdtShowcaseFeaturesGetParams implements APIParams, FileParams  {

    private Long pageSize;
    private Long pageNo;
    private String orderBy;
    private String keyword;
    private Long categoryId;


    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }


    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }


    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderBy() {
        return this.orderBy;
    }


    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return this.keyword;
    }


    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }


    public Map<String, Object> toParams() {
        Map<String, Object> params = Maps.newHashMap();
        if (pageSize != null) {
            params.put("page_size", pageSize);
        }
        if (pageNo != null) {
            params.put("page_no", pageNo);
        }
        if (orderBy != null) {
            params.put("order_by", orderBy);
        }
        if (keyword != null) {
            params.put("keyword", keyword);
        }
        if (categoryId != null) {
            params.put("category_id", categoryId);
        }
        return params;
    }

    public Multimap<String, ByteWrapper> toFileParams() {
        Multimap<String, ByteWrapper> params = ArrayListMultimap.create();

            return params;
    }


}