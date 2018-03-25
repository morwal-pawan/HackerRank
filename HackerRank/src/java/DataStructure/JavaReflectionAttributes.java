package java.DataStructure;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class JavaReflectionAttributes {
    public static void main(String[] args) throws ClassNotFoundException{
        Class student =Class.forName("Student");
        Method[] methods = student.getDeclaredMethods();
        student.getDeclaredClasses();
        
        ArrayList<String> methodList = new ArrayList<>();
        for(Method method: methods ){
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }
}

