package com.lechenggu.action;

import com.opensymphony.xwork2.Action;

/**
 * ����Action�ࣺ�൱���м�����һ��servlet��
 */
public class HelloAction implements Action {

    @Override
    public String execute() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("ʵ��Action�ӿڵ�Action��");
        return "success";
    }

    public String abc(){
        
        return "";
    }
  
}
