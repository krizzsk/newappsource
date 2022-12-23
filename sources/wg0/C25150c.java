package wg0;

import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl;
import mf0.C24362h;
import of0.C24584a;
import sf0.C24866j;

/* renamed from: wg0.c */
public final class C25150c extends C24584a<Object> {

    /* renamed from: b */
    public final /* synthetic */ Object f63426b;

    /* renamed from: c */
    public final /* synthetic */ DescriptorRendererOptionsImpl f63427c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25150c(Object obj, DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        super(obj);
        this.f63426b = obj;
        this.f63427c = descriptorRendererOptionsImpl;
    }

    /* renamed from: a */
    public final void mo60853a(C24866j jVar) {
        C24362h.m61211f(jVar, "property");
        if (this.f63427c.f61153a) {
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
    }
}
