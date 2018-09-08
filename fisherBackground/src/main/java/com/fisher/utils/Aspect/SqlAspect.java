package com.fisher.utils.Aspect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fisher.mapper.UserMapper;
import com.fisher.pojo.User;

@Aspect
@Component
public class SqlAspect {
    
    
    /**
     * 使用空方法定义切点表达式
     */
    @Pointcut("execution(com.fisher.mapper.*")
    public void declareJointPointExpression() {
        
    }
    @Before("@annotation(updateCharset)")
    public void doBefore(JoinPoint joinPoint,UpdateCharset updateCharset)
    {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        //获取当前切点方法对象
        Method method = methodSignature.getMethod();
        if(method.getDeclaringClass().isInterface()){
            try {
                //获取实际类型的方法对象
                method = joinPoint.getTarget().getClass()
                        .getDeclaredMethod(joinPoint.getSignature().getName(), method.getParameterTypes());
                joinPoint.getTarget().getClass().getMethod("setCharsetToUtf8mb4").invoke(joinPoint.getTarget().getClass());
                method.invoke(joinPoint.getTarget().getClass());
            } catch (NoSuchMethodException e) {
                System.out.println("方法不存在！");
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
