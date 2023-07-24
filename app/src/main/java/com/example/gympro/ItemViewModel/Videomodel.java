package com.example.gympro.ItemViewModel;

public class Videomodel
{
  String desc,title,url;

    public Videomodel(String desc, String title, String url) {
        this.desc = desc;
        this.title = title;
        this.url = url;
    }
    Videomodel()
    {

    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
