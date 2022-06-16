package com.eyc;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class ContainerInitializerFromGoogleNamedLib implements ServletContainerInitializer {


    @Override
    public void onStartup(Set<Class<?>> aC, ServletContext servletContext) throws ServletException {
        System.out.println("################### Google Named Jar Initializer");

    }

}