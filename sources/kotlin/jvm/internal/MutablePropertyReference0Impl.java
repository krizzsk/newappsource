package kotlin.jvm.internal;

public class MutablePropertyReference0Impl extends MutablePropertyReference0 {
    public MutablePropertyReference0Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    public Object get() {
        return getGetter().mo59295a(new Object[0]);
    }

    public void set(Object obj) {
        getSetter().mo59295a(obj);
    }
}
