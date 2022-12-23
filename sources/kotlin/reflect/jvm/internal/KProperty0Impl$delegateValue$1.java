package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import lf0.C24225a;
import mf0.C24362h;
import p389bl.C13637c;
import tf0.C24979k;

@Metadata(mo59059d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, mo59060d2 = {"<anonymous>", "", "V", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class KProperty0Impl$delegateValue$1 extends Lambda implements C24225a<Object> {
    public final /* synthetic */ KProperty0Impl<V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KProperty0Impl$delegateValue$1(KProperty0Impl<? extends V> kProperty0Impl) {
        super(0);
        this.this$0 = kProperty0Impl;
    }

    public final Object invoke() {
        Object obj;
        boolean z;
        KProperty0Impl<V> kProperty0Impl = this.this$0;
        Member g = kProperty0Impl.mo59336g();
        try {
            Object obj2 = KPropertyImpl.f60256i;
            if (kProperty0Impl.mo59300f()) {
                obj = C13637c.m34072l(kProperty0Impl.f60260f, kProperty0Impl.mo59298d());
            } else {
                obj = null;
            }
            if (obj != obj2) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                obj = null;
            }
            kProperty0Impl.mo59300f();
            if (g == null) {
                return null;
            }
            if (g instanceof Field) {
                return ((Field) g).get(obj);
            }
            if (g instanceof Method) {
                int length = ((Method) g).getParameterTypes().length;
                if (length == 0) {
                    return ((Method) g).invoke((Object) null, new Object[0]);
                }
                if (length == 1) {
                    Method method = (Method) g;
                    Object[] objArr = new Object[1];
                    if (obj == null) {
                        Class cls = ((Method) g).getParameterTypes()[0];
                        C24362h.m61210e(cls, "fieldOrMethod.parameterTypes[0]");
                        obj = C24979k.m62676c(cls);
                    }
                    objArr[0] = obj;
                    return method.invoke((Object) null, objArr);
                } else if (length == 2) {
                    Class cls2 = ((Method) g).getParameterTypes()[1];
                    C24362h.m61210e(cls2, "fieldOrMethod.parameterTypes[1]");
                    return ((Method) g).invoke((Object) null, new Object[]{obj, C24979k.m62676c(cls2)});
                } else {
                    throw new AssertionError("delegate method " + g + " should take 0, 1, or 2 parameters");
                }
            } else {
                throw new AssertionError("delegate field/method " + g + " neither field nor method");
            }
        } catch (IllegalAccessException e) {
            throw new IllegalPropertyDelegateAccessException(e);
        }
    }
}
