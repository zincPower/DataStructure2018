package com.zinc.datastructure2018;

import com.zinc.datastructure2018.test.ZincAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/12/3
 * @description
 */
public class MyReflectionUtils {

    public static void main(String[] args) {
        Son son = new Son();
        getAllMethodViaClazz(son);
    }

    public static void getAllMethodViaClazz(Object object) {

        Class clazz = object.getClass();

        for (; ; ) {

            String clazzName = clazz.getCanonicalName();
            if (clazzName.startsWith("java.") || clazzName.startsWith("android.")) {
                break;
            }

            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                boolean isAnnotation = method.isAnnotationPresent(ZincAnnotation.class);
                if(isAnnotation){
                    System.out.println(clazzName + " ===== " + method.getName());
                }
            }

            clazz = clazz.getSuperclass();

        }

    }

}
