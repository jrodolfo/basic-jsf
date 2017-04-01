package com.jrodolfo.jsf;

/**
 * Created by Rod Oliveira (jrodolfo.com) on 2017-03-26.
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean @SessionScoped
public class HelloWorldBean {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
