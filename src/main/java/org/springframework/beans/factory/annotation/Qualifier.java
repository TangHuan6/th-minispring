package org.springframework.beans.factory.annotation;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Inherited  //注解会自动被子类继承
@Documented
public @interface Qualifier {
    String value() default "";
}
