package com.maowudi.integrals.bean.revo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Page implements Serializable {

    private Integer limit = 10;

    private Integer start = 0;

    private Integer page;

    private Integer total;

    private Object list;

    public static Page returnPage(Integer limit,Integer start,Integer total){
        Page page = new Page();
        page.setLimit(limit);
        page.setStart(start);
        page.setTotal(total);
        return page;
    }

    public static Page initPage() {
        return new Page();
    }

    public Page setPageList(Integer total,Object list){
        this.setTotal(total);
        this.setList(list);
        return this;
    }
}
