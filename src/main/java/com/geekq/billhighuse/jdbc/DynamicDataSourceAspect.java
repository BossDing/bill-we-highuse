package com.geekq.billhighuse.jdbc;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author 邱润泽 bullock
 */
@Aspect
@Component
public class DynamicDataSourceAspect {

    /**
     * =======  1获得当前访问的class =====
     * * =======2获得访问的方法名 =====
     * * =======  3得到方法的参数的类型 =====
     * * =======  4得到访问的方法对象 =====
     * * =======  5判断是否存在GeekQSourceConnection =====
     * * =======  6取出注解中的数据源名 =====
     * * =======  7切换数据源 =====
     *
     * @param point
     */
    @Before("@annotation(com.geekq.billhighuse.jdbc.GeekQSourceConnection)")
    public void beforeSwitchDS(JoinPoint point) {
        //1
        Class<?> className = point.getTarget().getClass();
        //2
        String methodName = point.getSignature().getName();
        //3
        Class[] argClass = ((MethodSignature) point.getSignature()).getParameterTypes();
        String dataSource = DataSourceContextHolder.DEFAULT_DS;
        try {
            //4
            Method method = className.getMethod(methodName, argClass);
            //5
            if (method.isAnnotationPresent(GeekQSourceConnection.class)) {
                GeekQSourceConnection annotation = method.getAnnotation(GeekQSourceConnection.class);
                //6
                dataSource = annotation.value();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //7
        DataSourceContextHolder.setDB(dataSource);
    }

    @After("@annotation(com.geekq.billhighuse.jdbc.GeekQSourceConnection)")
    public void afterSwitchDS(JoinPoint point) {
        DataSourceContextHolder.clearDB();
    }
}
