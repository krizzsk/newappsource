package p043ch.qos.logback.core.util;

/* renamed from: ch.qos.logback.core.util.IncompatibleClassException */
public class IncompatibleClassException extends Exception {
    private static final long serialVersionUID = -5823372159561159549L;
    public Class<?> obtainedClass;
    public Class<?> requestedClass;

    public IncompatibleClassException(Class<?> cls, Class<?> cls2) {
        this.requestedClass = cls;
        this.obtainedClass = cls2;
    }
}
