package com.lechenggu.action;

import com.opensymphony.xwork2.Action;

/**
 * 创建Action类：相当于中级创建一个servlet类
 */
public class HelloAction implements Action {

    @Override
    public String execute() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("实现Action接口的Action类");
        return "success";
    }

    public String abc(){
        
        return "";
    }
  
}
