package com.exxample.java;

//Write a function/method to convert any Java object into JSON. Use of library such as Jackson for conversion is not allowed.

import java.io.*;
import java.util.*;

//Consider Employee and Company classes as examples of classes that could be converted into JSON.
class Employee {
  int id;
  String name;
  String title;
  Employee manager;
  Set<Employee> reportees;
  Set<Employee> coworkers;

  Company employer;
}


class Company {
  int id;
  String name;
  //Address address;
}

interface Field {
     String name;
     Type type; // String, int, Integer, float, Float, double, Object, Array, Map etc.
     Object value;
     boolean isCollectionType(); // returns true for any collection type that can be iterated upon.
     boolean isPrimitiveType(); //returns true for int, float, double, boolean etc.
     boolean isNumericType(); //returns true for int, Integer, float, Float, double, Double, long, Long etc.
     boolean isBooleanType(); // returns true for boolean, Boolean
}


class JSONConverterService {
//Implement this
public String convertToJson(Object o) {
  
  // HashMap<String, Object> map = new HashMap<>();
  StringBuilder finalJson = new StringBuilder();
  finalJson.append("{");
  //String className = o.getClass().toString();
  
  
   List<Field> fields = o.getFields();
    
    for(Field f: fields){
      
      finalJson.append("\"")
          .append(f.name)
          .append("\"");
      
      if(f.isPrimitiveType() || f.isNumericType() || f.isBooleanType()){
        // map.put(f.name, f.value);
        finalJson
          .append(" :")
          .append("\"")
          .append(f.value)
          .append("\"");
      }
      else if(f.isCollectionType()){
        Collection c = (Collection)f.value;
        
        String jsonStr = "";
        
        for(Object entry : c){
          
          jsonStr +=  convertToJson(entry);
        } 
        
       finalJson
          .append(" :")
          .append("\"")
          .append(jsonStr)
          .append("\"");
        
      }
      
      finalJson.append(",");

  }
  return finalJson.toString();
  
}

}

/*
{
         "employee": {
            "id": 123,
            "name": "Vishakha",
            "title":"",
            "manager": {
               "id":123,
            "name": "Vishakha",
            "title":""
            },
           "reportees": [{
              "id":123,
            "name": "Vishakha",
            "title":""
           }],
           "coworkers": [{
              "id":123,
            "name": "Vishakha",
            "title":""
           },
            {
              "id":123,
            "name": "Vishakha",
            "title":""
           }],
           "employer":{
             "id":"",
             "name":""
           }
       }

*/


public class AppleInterview {

    public static void main(String[] args) {
        Employee em = new Employee ();
        JSONConverterService s = new JSONConverterService();
        System.out.println (s.convertToJson(em));
      
        
       
      }

    }

}