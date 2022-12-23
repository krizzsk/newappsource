package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.text.C24179b;
import lf0.C24225a;
import mf0.C24362h;
import sf0.C24866j;
import ug0.C25065b;

@Metadata(mo59059d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo59060d2 = {"<anonymous>", "", "T", "", "invoke"}, mo59061k = 3, mo59062mv = {1, 6, 0}, mo59064xi = 48)
public final class KClassImpl$Data$simpleName$2 extends Lambda implements C24225a<String> {
    public final /* synthetic */ KClassImpl<T> this$0;
    public final /* synthetic */ KClassImpl<T>.Data this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$simpleName$2(KClassImpl.Data data, KClassImpl kClassImpl) {
        super(0);
        this.this$0 = kClassImpl;
        this.this$1 = data;
    }

    public final Object invoke() {
        if (this.this$0.f60209c.isAnonymousClass()) {
            return null;
        }
        C25065b r = this.this$0.mo59310r();
        if (r.f63252c) {
            KClassImpl<T>.Data data = this.this$1;
            Class<T> cls = this.this$0.f60209c;
            C24866j<Object>[] jVarArr = KClassImpl.Data.f60211l;
            data.getClass();
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                return C24179b.m60579a0(simpleName, C24362h.m61216k("$", enclosingMethod.getName()), simpleName);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                return C24179b.m60580b0(simpleName);
            }
            return C24179b.m60579a0(simpleName, C24362h.m61216k("$", enclosingConstructor.getName()), simpleName);
        }
        String f = r.mo61577j().mo61604f();
        C24362h.m61210e(f, "classId.shortClassName.asString()");
        return f;
    }
}
