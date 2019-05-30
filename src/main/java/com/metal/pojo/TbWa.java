package com.metal.pojo;

public class TbWa {
    private Integer id;

    private String waname;

    private String maxcount;

    private String no;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWaname() {
        return waname;
    }

    public void setWaname(String waname) {
        this.waname = waname == null ? null : waname.trim();
    }

    public String getMaxcount() {
        return maxcount;
    }

    public void setMaxcount(String maxcount) {
        this.maxcount = maxcount == null ? null : maxcount.trim();
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }
}