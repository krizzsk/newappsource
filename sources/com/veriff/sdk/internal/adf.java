package com.veriff.sdk.internal;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface adf {
    /* renamed from: a */
    String mo54125a();

    /* renamed from: b */
    boolean mo54126b() default false;
}
