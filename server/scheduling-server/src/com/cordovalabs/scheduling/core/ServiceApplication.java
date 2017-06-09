package com.cordovalabs.scheduling.core;

import javax.ws.rs.core.Application;

import com.cordovalabs.scheduling.service.UserService;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/rest")
public class ServiceApplication extends Application {

   public ServiceApplication() {}

   public Set<Class<?>> getClasses() {
      HashSet<Class<?>> set = new HashSet<Class<?>>();
      set.add(UserService.class);
//      set.add(OrderResource.class);
//      set.add(ProduceResource.class);
      return set;
   }

//   public Set<Object> getSingletons() {
//
////       JsonWriter json = new JsonWriter();
////       CreditCardResource service = new CreditCardResource();
//
////       HashSet<Object> set = new HashSet();
////       set.add(json);
////       set.add(service);
//       return set;
//   }
}
