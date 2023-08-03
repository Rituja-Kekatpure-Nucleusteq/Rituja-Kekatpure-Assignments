package PropertyClass;
import java.util.*;  
import java.io.*;  

public class PropertyClass{  
public static void main(String[] args)throws Exception{  
  
Properties p=new Properties(); 

p.setProperty("name","Rituja");  
p.setProperty("password","12345");  

p.store(new FileWriter("info.properties"),"Properties class Example");  
  
}  
}