package com.example.vmi.config;

import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.logging.Logger;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class ContextListener implements ServletContextListener{

   private Logger logger = Logger.getLogger("ContextListener");
   
   @Override
   public void contextInitialized(ServletContextEvent sce) {
      logger.info("contextInitialized()");
      //For enabling Dependency Injection (autowiring)
      WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext())
              .getAutowireCapableBeanFactory()
              .autowireBean(this);
   }

   @Override
   public void contextDestroyed(ServletContextEvent sce) {
      logger.info("contextDestroyed()");
      try{
         AbandonedConnectionCleanupThread.shutdown();
         logger.info("AbandonedConnectionCleanupThread stopped.");
      }catch(InterruptedException e){
         logger.severe("Failed to stop AbandonedConnectionCleanupThread.");
      }
      
      Enumeration<Driver> drivers = DriverManager.getDrivers();
      Driver driver = null;
      while(drivers.hasMoreElements()){
         driver = drivers.nextElement();
         try{
            DriverManager.deregisterDriver(driver);
            logger.info(driver + " deregistered.");
         }catch(SQLException e){
            logger.severe("Failed to deregidter Driver");
         }
      }
   }

}

