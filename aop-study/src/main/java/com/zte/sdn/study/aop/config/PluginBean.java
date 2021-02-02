package com.zte.sdn.study.aop.config;

/**
 * @Author: Livio
 * @Date: 2021/2/2 23:54
 */
public class PluginBean {
    private int id;
    private String cls;
    private String path;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Config{" +
                "id=" + id +
                ", cls='" + cls + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
