package gj0;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.simpleframework.xml.DefaultType;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: gj0.b */
public @interface C23423b {
    boolean required() default true;

    DefaultType value() default DefaultType.FIELD;
}
