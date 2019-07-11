package com.test.recyclerviewvollypicasso;

public class MyItem {

    public String head;
    public String desc;
    public String imageurl;


    public MyItem(String head, String desc, String imageurl) {
        this.head = head;
        this.desc = desc;
        this.imageurl = imageurl;
    }

    public String getHead() {
        return head;
    }

    public String getDesc() {
        return desc;
    }

    public String getImageurl() {
        return imageurl;
    }
}
