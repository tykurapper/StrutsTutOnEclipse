package com.tutorialspoint.struts2;

import java.util.*;

import org.hibernate.tutorial.EventManager;
import org.hibernate.tutorial.domain.Event;

import com.opensymphony.xwork2.util.ValueStack;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport{
    private String name;
    private EventManager eventManager;
    private List events;
    
    public String eventtest() throws Exception {
    	eventManager = new EventManager();
    	List<Event> events = eventManager.listEvents();
    	ValueStack stack = ActionContext.getContext().getValueStack();
        Map<String, Object> context = new HashMap<String, Object>();
        context.put("List",	events);
        System.out.println("check");
    	return SUCCESS;
    }
    public String execute() throws Exception {
//        ValueStack stack = ActionContext.getContext().getValueStack();
//        Map<String, Object> context = new HashMap<String, Object>();
//
//        context.put("key1", new String("This is key1"));
//        context.put("key2", new String("This is key2"));
//        stack.push(context);
//
//        System.out.println("Size of the valueStack: " + stack.size());
//        return "success";
    	eventManager = new EventManager();
    	events = eventManager.listEvents();
    	return SUCCESS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}