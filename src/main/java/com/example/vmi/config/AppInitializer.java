package com.example.vmi.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements WebApplicationInitializer{

   @Override
   public void onStartup(ServletContext servletContext) throws ServletException {
       System.out.println("Inside AppInitializer");
      AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
      ctx.register(AppConfig.class);
      ctx.setServletContext(servletContext);
      //Add Listeners: Order of adding is important
      servletContext.addListener(new ContextLoaderListener(ctx));
      servletContext.addListener(ContextListener.class);
      
      ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));

      servlet.setLoadOnStartup(1);
      servlet.addMapping("/");
   }
   
}
