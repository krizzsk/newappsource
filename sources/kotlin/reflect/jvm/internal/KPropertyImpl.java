package kotlin.reflect.jvm.internal;

import bf0.C21050d;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.PropertyReference;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.C23902d;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import mf0.C24362h;
import mf0.C24365j;
import p001a0.C0017h;
import sf0.C24854a;
import sf0.C24858e;
import sf0.C24866j;
import tf0.C24962b;
import tf0.C24973i;
import tf0.C24978j;
import tf0.C24979k;
import uf0.C25032b;
import ug0.C25065b;
import ug0.C25066c;
import zf0.C25429a0;
import zf0.C25431b0;
import zf0.C25491z;

public abstract class KPropertyImpl<V> extends KCallableImpl<V> implements C24866j<V> {

    /* renamed from: i */
    public static final Object f60256i = new Object();

    /* renamed from: c */
    public final KDeclarationContainerImpl f60257c;

    /* renamed from: d */
    public final String f60258d;

    /* renamed from: e */
    public final String f60259e;

    /* renamed from: f */
    public final Object f60260f;

    /* renamed from: g */
    public final C24973i.C24975b<Field> f60261g;

    /* renamed from: h */
    public final C24973i.C24974a<C25491z> f60262h;

    public static abstract class Getter<V> extends C23849a<V, V> {

        /* renamed from: e */
        public static final /* synthetic */ C24866j<Object>[] f60263e;

        /* renamed from: c */
        public final C24973i.C24974a f60264c = C24973i.m62670c(new KPropertyImpl$Getter$descriptor$2(this));

        /* renamed from: d */
        public final C24973i.C24975b f60265d = C24973i.m62669b(new KPropertyImpl$Getter$caller$2(this));

        static {
            Class<Getter> cls = Getter.class;
            f60263e = new C24866j[]{C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
        }

        /* renamed from: b */
        public final C25032b<?> mo59296b() {
            C24973i.C24975b bVar = this.f60265d;
            C24866j<Object> jVar = f60263e[1];
            Object invoke = bVar.invoke();
            C24362h.m61210e(invoke, "<get-caller>(...)");
            return (C25032b) invoke;
        }

        /* renamed from: d */
        public final CallableMemberDescriptor mo59298d() {
            C24973i.C24974a aVar = this.f60264c;
            C24866j<Object> jVar = f60263e[0];
            Object invoke = aVar.invoke();
            C24362h.m61210e(invoke, "<get-descriptor>(...)");
            return (C25429a0) invoke;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Getter) && C24362h.m61206a(mo59327h(), ((Getter) obj).mo59327h());
        }

        /* renamed from: g */
        public final C23902d mo59341g() {
            C24973i.C24974a aVar = this.f60264c;
            C24866j<Object> jVar = f60263e[0];
            Object invoke = aVar.invoke();
            C24362h.m61210e(invoke, "<get-descriptor>(...)");
            return (C25429a0) invoke;
        }

        public final String getName() {
            return C0017h.m57N(C13555b.m33972k("<get-"), mo59327h().f60258d, '>');
        }

        public final int hashCode() {
            return mo59327h().hashCode();
        }

        public final String toString() {
            return C24362h.m61216k(mo59327h(), "getter of ");
        }
    }

    public static abstract class Setter<V> extends C23849a<V, C21050d> {

        /* renamed from: e */
        public static final /* synthetic */ C24866j<Object>[] f60266e;

        /* renamed from: c */
        public final C24973i.C24974a f60267c = C24973i.m62670c(new KPropertyImpl$Setter$descriptor$2(this));

        /* renamed from: d */
        public final C24973i.C24975b f60268d = C24973i.m62669b(new KPropertyImpl$Setter$caller$2(this));

        static {
            Class<Setter> cls = Setter.class;
            f60266e = new C24866j[]{C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
        }

        /* renamed from: b */
        public final C25032b<?> mo59296b() {
            C24973i.C24975b bVar = this.f60268d;
            C24866j<Object> jVar = f60266e[1];
            Object invoke = bVar.invoke();
            C24362h.m61210e(invoke, "<get-caller>(...)");
            return (C25032b) invoke;
        }

        /* renamed from: d */
        public final CallableMemberDescriptor mo59298d() {
            C24973i.C24974a aVar = this.f60267c;
            C24866j<Object> jVar = f60266e[0];
            Object invoke = aVar.invoke();
            C24362h.m61210e(invoke, "<get-descriptor>(...)");
            return (C25431b0) invoke;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Setter) && C24362h.m61206a(mo59327h(), ((Setter) obj).mo59327h());
        }

        /* renamed from: g */
        public final C23902d mo59341g() {
            C24973i.C24974a aVar = this.f60267c;
            C24866j<Object> jVar = f60266e[0];
            Object invoke = aVar.invoke();
            C24362h.m61210e(invoke, "<get-descriptor>(...)");
            return (C25431b0) invoke;
        }

        public final String getName() {
            return C0017h.m57N(C13555b.m33972k("<set-"), mo59327h().f60258d, '>');
        }

        public final int hashCode() {
            return mo59327h().hashCode();
        }

        public final String toString() {
            return C24362h.m61216k(mo59327h(), "setter of ");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.KPropertyImpl$a */
    public static abstract class C23849a<PropertyType, ReturnType> extends KCallableImpl<ReturnType> implements C24858e<ReturnType> {
        /* renamed from: c */
        public final KDeclarationContainerImpl mo59297c() {
            return mo59327h().f60257c;
        }

        /* renamed from: f */
        public final boolean mo59300f() {
            return mo59327h().mo59300f();
        }

        /* renamed from: g */
        public abstract C23902d mo59341g();

        /* renamed from: h */
        public abstract KPropertyImpl<PropertyType> mo59327h();
    }

    public KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, C25491z zVar, Object obj) {
        this.f60257c = kDeclarationContainerImpl;
        this.f60258d = str;
        this.f60259e = str2;
        this.f60260f = obj;
        this.f60261g = new C24973i.C24975b<>(new KPropertyImpl$_javaField$1(this));
        this.f60262h = new C24973i.C24974a<>(zVar, new KPropertyImpl$_descriptor$1(this));
    }

    /* renamed from: b */
    public final C25032b<?> mo59296b() {
        return mo59334i().mo59296b();
    }

    /* renamed from: c */
    public final KDeclarationContainerImpl mo59297c() {
        return this.f60257c;
    }

    public final boolean equals(Object obj) {
        KPropertyImpl kPropertyImpl;
        PropertyReference propertyReference;
        C24854a aVar;
        C25066c cVar = C24979k.f63116a;
        KPropertyImpl kPropertyImpl2 = null;
        if (obj instanceof KPropertyImpl) {
            kPropertyImpl = (KPropertyImpl) obj;
        } else {
            kPropertyImpl = null;
        }
        if (kPropertyImpl == null) {
            if (obj instanceof PropertyReference) {
                propertyReference = (PropertyReference) obj;
            } else {
                propertyReference = null;
            }
            if (propertyReference == null) {
                aVar = null;
            } else {
                aVar = propertyReference.compute();
            }
            if (aVar instanceof KPropertyImpl) {
                kPropertyImpl2 = (KPropertyImpl) aVar;
            }
        } else {
            kPropertyImpl2 = kPropertyImpl;
        }
        if (kPropertyImpl2 != null && C24362h.m61206a(this.f60257c, kPropertyImpl2.f60257c) && C24362h.m61206a(this.f60258d, kPropertyImpl2.f60258d) && C24362h.m61206a(this.f60259e, kPropertyImpl2.f60259e) && C24362h.m61206a(this.f60260f, kPropertyImpl2.f60260f)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo59300f() {
        return !C24362h.m61206a(this.f60260f, CallableReference.NO_RECEIVER);
    }

    /* renamed from: g */
    public final Member mo59336g() {
        if (!mo59298d().mo53446F()) {
            return null;
        }
        C25065b bVar = C24978j.f63115a;
        C24962b b = C24978j.m62672b(mo59298d());
        if (b instanceof C24962b.C24965c) {
            C24962b.C24965c cVar = (C24962b.C24965c) b;
            if (cVar.f63101c.mo59945q()) {
                JvmProtoBuf.JvmMethodSignature k = cVar.f63101c.mo59940k();
                if (!k.mo59936k() || !k.mo59935j()) {
                    return null;
                }
                return this.f60257c.mo59317e(cVar.f63102d.getString(k.mo59934i()), cVar.f63102d.getString(k.mo59933h()));
            }
        }
        return this.f60261g.invoke();
    }

    public final String getName() {
        return this.f60258d;
    }

    /* renamed from: h */
    public final C25491z mo59298d() {
        C25491z invoke = this.f60262h.invoke();
        C24362h.m61210e(invoke, "_descriptor()");
        return invoke;
    }

    public final int hashCode() {
        return this.f60259e.hashCode() + C13715c.m34238d(this.f60258d, this.f60257c.hashCode() * 31, 31);
    }

    /* renamed from: i */
    public abstract Getter<V> mo59334i();

    public final String toString() {
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f60280a;
        return ReflectionObjectRenderer.m58643c(mo59298d());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        this(kDeclarationContainerImpl, str, str2, (C25491z) null, obj);
        C24362h.m61211f(kDeclarationContainerImpl, "container");
        C24362h.m61211f(str, "name");
        C24362h.m61211f(str2, InAppPurchaseMetaData.KEY_SIGNATURE);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KPropertyImpl(kotlin.reflect.jvm.internal.KDeclarationContainerImpl r8, zf0.C25491z r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            mf0.C24362h.m61211f(r8, r0)
            java.lang.String r0 = "descriptor"
            mf0.C24362h.m61211f(r9, r0)
            ug0.e r0 = r9.getName()
            java.lang.String r3 = r0.mo61604f()
            java.lang.String r0 = "descriptor.name.asString()"
            mf0.C24362h.m61210e(r3, r0)
            tf0.b r0 = tf0.C24978j.m62672b(r9)
            java.lang.String r4 = r0.mo61523a()
            java.lang.Object r6 = kotlin.jvm.internal.CallableReference.NO_RECEIVER
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KPropertyImpl.<init>(kotlin.reflect.jvm.internal.KDeclarationContainerImpl, zf0.z):void");
    }
}
