package com.veriff.sdk.internal;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface adk {
    /* renamed from: a */
    String mo54130a();

    /* renamed from: b */
    String mo54131b() default "";

    /* renamed from: c */
    boolean mo54132c() default false;
}
