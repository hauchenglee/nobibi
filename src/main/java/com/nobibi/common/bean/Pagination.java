package com.nobibi.common.bean;

import lombok.Data;

/**
 *    - page: 当前第几页
 *    - size: 当前页数总共多少数据
 *    - total: 总数据量
 */
@Data
public class Pagination {
    private int page;
    private int size;
    private int total;
}
