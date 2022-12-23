package com.veriff.sdk.internal;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface adt {
    /* renamed from: a */
    String mo54139a() default "";

    /* renamed from: b */
    String mo54140b() default "binary";
}
