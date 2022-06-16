package com.eyc;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class ContainerInitializerFromJarWebFragment implements ServletContainerInitializer {


    @Override
    public void onStartup(Set<Class<?>> aC, ServletContext servletContext) throws ServletException {
        System.out.println("################### jar-web-fragment (ordering before others) Initializer ");
    }

}