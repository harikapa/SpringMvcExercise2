package com.stackroute.springmvc;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class SpringWebInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {

        System.out.println("entered startup");
        AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();
        context.register(UserConfig.class);
        context.setServletContext(servletContext);
        ServletRegistration.Dynamic servlet=servletContext.addServlet("dispatcher",new DispatcherServlet(context));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(3);
    }
}
