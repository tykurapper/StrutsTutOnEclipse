package com.tutorialspoint.struts2;

import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;

/**
 * Created by Tyku on 7/13/2017.
 */
public class EnvironmentConverter extends StrutsTypeConverter {
    @Override
    public Object convertFromString(Map context, String[] values, Class clazz)
    {
        Environment env = new Environment(values[0]);
        return env;
    }
    public String convertToString(Map context, Object value)
    {
        Environment env = (Environment) value;
        return env == null ? null : env.getName();
    }
}
