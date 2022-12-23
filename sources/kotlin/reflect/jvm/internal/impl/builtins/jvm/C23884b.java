package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import mf0.C24362h;
import p583jk.C17875h;
import rh0.C24814b;
import yf0.C25300g;
import zf0.C25432c;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.b */
public final class C23884b extends C24814b.C24815a<C25432c, JvmBuiltInsCustomizer.JDKMemberStatus> {

    /* renamed from: a */
    public final /* synthetic */ String f60415a;

    /* renamed from: b */
    public final /* synthetic */ Ref$ObjectRef<JvmBuiltInsCustomizer.JDKMemberStatus> f60416b;

    public C23884b(String str, Ref$ObjectRef<JvmBuiltInsCustomizer.JDKMemberStatus> ref$ObjectRef) {
        this.f60415a = str;
        this.f60416b = ref$ObjectRef;
    }

    /* renamed from: a */
    public final Object mo53186a() {
        JvmBuiltInsCustomizer.JDKMemberStatus jDKMemberStatus = (JvmBuiltInsCustomizer.JDKMemberStatus) this.f60416b.element;
        return jDKMemberStatus == null ? JvmBuiltInsCustomizer.JDKMemberStatus.NOT_CONSIDERED : jDKMemberStatus;
    }

    /* renamed from: c */
    public final boolean mo53188c(Object obj) {
        C25432c cVar = (C25432c) obj;
        C24362h.m61211f(cVar, "javaClassDescriptor");
        String R = C17875h.m44291R(cVar, this.f60415a);
        if (C25300g.f63599b.contains(R)) {
            this.f60416b.element = JvmBuiltInsCustomizer.JDKMemberStatus.HIDDEN;
        } else if (C25300g.f63600c.contains(R)) {
            this.f60416b.element = JvmBuiltInsCustomizer.JDKMemberStatus.VISIBLE;
        } else if (C25300g.f63598a.contains(R)) {
            this.f60416b.element = JvmBuiltInsCustomizer.JDKMemberStatus.DROP;
        }
        if (this.f60416b.element == null) {
            return true;
        }
        return false;
    }
}
