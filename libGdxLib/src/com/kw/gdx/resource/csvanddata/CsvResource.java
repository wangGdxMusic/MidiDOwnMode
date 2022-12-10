package com.kw.gdx.resource.csvanddata;

import com.kw.gdx.resource.annotation.AnnotationInfo;
import com.kw.gdx.resource.annotation.ExecuteMathod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 加载csv资源
 */
public class CsvResource {
    public CsvResource(Class clazz){
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredField : declaredMethods) {
            ExecuteMathod annotation = AnnotationInfo.checkMethodAnnotation(declaredField, ExecuteMathod.class);
            if (annotation!=null){
                try {
                    declaredField.invoke(this);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
