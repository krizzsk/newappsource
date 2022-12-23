package kotlin.reflect.jvm.internal.impl.builtins;

import bf0.C21049c;
import kotlin.C23812a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23909c;
import mf0.C24365j;
import sf0.C24866j;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.d */
public final class C23869d {

    /* renamed from: d */
    public static final C23871b f60317d = new C23871b();

    /* renamed from: e */
    public static final /* synthetic */ C24866j<Object>[] f60318e;

    /* renamed from: a */
    public final NotFoundClasses f60319a;

    /* renamed from: b */
    public final C21049c f60320b;

    /* renamed from: c */
    public final C23870a f60321c = new C23870a();

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.d$a */
    public static final class C23870a {
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.d$b */
    public static final class C23871b {
    }

    static {
        Class<C23869d> cls = C23869d.class;
        f60318e = new C24866j[]{C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};
    }

    public C23869d(C23909c cVar, NotFoundClasses notFoundClasses) {
        this.f60319a = notFoundClasses;
        this.f60320b = C23812a.m58431a(LazyThreadSafetyMode.PUBLICATION, new ReflectionTypes$kotlinReflectScope$2(cVar));
    }
}
