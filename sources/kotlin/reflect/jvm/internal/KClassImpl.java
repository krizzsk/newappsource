package kotlin.reflect.jvm.internal;

import hh0.C23497i;
import java.util.Collection;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.C23899b;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import mf0.C24361g;
import mf0.C24362h;
import mf0.C24365j;
import sf0.C24855b;
import sf0.C24866j;
import tf0.C24971g;
import tf0.C24973i;
import tf0.C24978j;
import tf0.C24979k;
import ug0.C25065b;
import ug0.C25066c;
import ug0.C25069e;
import uh0.C25081h;
import yf0.C25295c;
import zf0.C25430b;
import zf0.C25432c;
import zf0.C25491z;

public final class KClassImpl<T> extends KDeclarationContainerImpl implements C24855b<T>, C24971g {

    /* renamed from: e */
    public static final /* synthetic */ int f60208e = 0;

    /* renamed from: c */
    public final Class<T> f60209c;

    /* renamed from: d */
    public final C24973i.C24975b<KClassImpl<T>.Data> f60210d = C24973i.m62669b(new KClassImpl$data$1(this));

    public final class Data extends KDeclarationContainerImpl.Data {

        /* renamed from: l */
        public static final /* synthetic */ C24866j<Object>[] f60211l;

        /* renamed from: c */
        public final C24973i.C24974a f60212c;

        /* renamed from: d */
        public final C24973i.C24974a f60213d;

        /* renamed from: e */
        public final C24973i.C24974a f60214e;

        /* renamed from: f */
        public final C24973i.C24974a f60215f;

        /* renamed from: g */
        public final C24973i.C24974a f60216g;

        /* renamed from: h */
        public final C24973i.C24974a f60217h;

        /* renamed from: i */
        public final C24973i.C24974a f60218i;

        /* renamed from: j */
        public final C24973i.C24974a f60219j = C24973i.m62670c(new KClassImpl$Data$allNonStaticMembers$2(this));

        /* renamed from: k */
        public final C24973i.C24974a f60220k = C24973i.m62670c(new KClassImpl$Data$allStaticMembers$2(this));

        static {
            Class<Data> cls = Data.class;
            f60211l = new C24866j[]{C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "annotations", "getAnnotations()Ljava/util/List;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "simpleName", "getSimpleName()Ljava/lang/String;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "constructors", "getConstructors()Ljava/util/Collection;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "typeParameters", "getTypeParameters()Ljava/util/List;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "supertypes", "getSupertypes()Ljava/util/List;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "allMembers", "getAllMembers()Ljava/util/Collection;"))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Data(KClassImpl kClassImpl) {
            super(kClassImpl);
            C24362h.m61211f(kClassImpl, "this$0");
            this.f60212c = C24973i.m62670c(new KClassImpl$Data$descriptor$2(kClassImpl));
            C24973i.m62670c(new KClassImpl$Data$annotations$2(this));
            this.f60213d = C24973i.m62670c(new KClassImpl$Data$simpleName$2(this, kClassImpl));
            this.f60214e = C24973i.m62670c(new KClassImpl$Data$qualifiedName$2(kClassImpl));
            C24973i.m62670c(new KClassImpl$Data$constructors$2(kClassImpl));
            C24973i.m62670c(new KClassImpl$Data$nestedClasses$2(this));
            new KClassImpl$Data$objectInstance$2(this, kClassImpl);
            C24973i.m62670c(new KClassImpl$Data$typeParameters$2(this, kClassImpl));
            C24973i.m62670c(new KClassImpl$Data$supertypes$2(this, kClassImpl));
            C24973i.m62670c(new KClassImpl$Data$sealedSubclasses$2(this));
            this.f60215f = C24973i.m62670c(new KClassImpl$Data$declaredNonStaticMembers$2(kClassImpl));
            this.f60216g = C24973i.m62670c(new KClassImpl$Data$declaredStaticMembers$2(kClassImpl));
            this.f60217h = C24973i.m62670c(new KClassImpl$Data$inheritedNonStaticMembers$2(kClassImpl));
            this.f60218i = C24973i.m62670c(new KClassImpl$Data$inheritedStaticMembers$2(kClassImpl));
            C24973i.m62670c(new KClassImpl$Data$declaredMembers$2(this));
            C24973i.m62670c(new KClassImpl$Data$allMembers$2(this));
        }

        /* renamed from: a */
        public final C25432c mo59315a() {
            C24973i.C24974a aVar = this.f60212c;
            C24866j<Object> jVar = f60211l[0];
            Object invoke = aVar.invoke();
            C24362h.m61210e(invoke, "<get-descriptor>(...)");
            return (C25432c) invoke;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.KClassImpl$a */
    public /* synthetic */ class C23843a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60221a;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 1;
            iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS.ordinal()] = 2;
            iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 3;
            iArr[KotlinClassHeader.Kind.SYNTHETIC_CLASS.ordinal()] = 4;
            iArr[KotlinClassHeader.Kind.UNKNOWN.ordinal()] = 5;
            iArr[KotlinClassHeader.Kind.CLASS.ordinal()] = 6;
            f60221a = iArr;
        }
    }

    public KClassImpl(Class<T> cls) {
        C24362h.m61211f(cls, "jClass");
        this.f60209c = cls;
    }

    /* renamed from: a */
    public final Class<T> mo59301a() {
        return this.f60209c;
    }

    /* renamed from: b */
    public final String mo59302b() {
        C24973i.C24974a aVar = this.f60210d.invoke().f60214e;
        C24866j<Object> jVar = Data.f60211l[3];
        return (String) aVar.invoke();
    }

    /* renamed from: c */
    public final String mo59303c() {
        C24973i.C24974a aVar = this.f60210d.invoke().f60213d;
        C24866j<Object> jVar = Data.f60211l[2];
        return (String) aVar.invoke();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof KClassImpl) && C24362h.m61206a(C24361g.m61145O(this), C24361g.m61145O((C24855b) obj));
    }

    /* renamed from: f */
    public final Collection<C23899b> mo59305f() {
        C25432c s = mo59311s();
        if (s.mo53513p() == ClassKind.INTERFACE || s.mo53513p() == ClassKind.OBJECT) {
            return EmptyList.f60173b;
        }
        Collection<C25430b> k = s.mo53511k();
        C24362h.m61210e(k, "descriptor.constructors");
        return k;
    }

    /* renamed from: g */
    public final Collection<C23900c> mo59306g(C25069e eVar) {
        MemberScope t = mo59312t();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return C23825c.m58527x0(mo59314u().mo53531b(eVar, noLookupLocation), t.mo53531b(eVar, noLookupLocation));
    }

    /* renamed from: h */
    public final C25491z mo59307h(int i) {
        DeserializedClassDescriptor deserializedClassDescriptor;
        Object obj;
        Class<?> declaringClass;
        if (C24362h.m61206a(this.f60209c.getSimpleName(), "DefaultImpls") && (declaringClass = this.f60209c.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((KClassImpl) C24365j.m61219a(declaringClass)).mo59307h(i);
        }
        C25432c s = mo59311s();
        if (s instanceof DeserializedClassDescriptor) {
            deserializedClassDescriptor = (DeserializedClassDescriptor) s;
        } else {
            deserializedClassDescriptor = null;
        }
        if (deserializedClassDescriptor == null) {
            return null;
        }
        ProtoBuf$Class protoBuf$Class = deserializedClassDescriptor.f61260f;
        GeneratedMessageLite.C24069e eVar = JvmProtoBuf.f61008j;
        C24362h.m61210e(eVar, "classLocalVariable");
        C24362h.m61211f(protoBuf$Class, "<this>");
        if (i < protoBuf$Class.mo59992i(eVar)) {
            obj = protoBuf$Class.mo59991h(eVar, i);
        } else {
            obj = null;
        }
        ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) obj;
        if (protoBuf$Property == null) {
            return null;
        }
        Class<T> cls = this.f60209c;
        C23497i iVar = deserializedClassDescriptor.f61267m;
        return (C25491z) C24979k.m62677d(cls, protoBuf$Property, iVar.f59332b, iVar.f59334d, deserializedClassDescriptor.f61261g, KClassImpl$getLocalProperty$2$1$1.f60223b);
    }

    public final int hashCode() {
        return C24361g.m61145O(this).hashCode();
    }

    /* renamed from: k */
    public final Collection<C25491z> mo59309k(C25069e eVar) {
        MemberScope t = mo59312t();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return C23825c.m58527x0(mo59314u().mo53532c(eVar, noLookupLocation), t.mo53532c(eVar, noLookupLocation));
    }

    /* renamed from: r */
    public final C25065b mo59310r() {
        C25065b bVar = C24978j.f63115a;
        Class<T> cls = this.f60209c;
        C24362h.m61211f(cls, "klass");
        PrimitiveType primitiveType = null;
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            C24362h.m61210e(componentType, "klass.componentType");
            if (componentType.isPrimitive()) {
                primitiveType = JvmPrimitiveType.get(componentType.getSimpleName()).getPrimitiveType();
            }
            if (primitiveType == null) {
                return C25065b.m62790l(C23872e.C23873a.f60369g.mo61600i());
            }
            return new C25065b(C23872e.f60330i, primitiveType.getArrayTypeName());
        } else if (C24362h.m61206a(cls, Void.TYPE)) {
            return C24978j.f63115a;
        } else {
            if (cls.isPrimitive()) {
                primitiveType = JvmPrimitiveType.get(cls.getSimpleName()).getPrimitiveType();
            }
            if (primitiveType != null) {
                return new C25065b(C23872e.f60330i, primitiveType.getTypeName());
            }
            C25065b a = ReflectClassUtilKt.m58949a(cls);
            if (a.f63252c) {
                return a;
            }
            String str = C25295c.f63582a;
            C25066c b = a.mo61569b();
            C24362h.m61210e(b, "classId.asSingleFqName()");
            C25065b f = C25295c.m63525f(b);
            if (f == null) {
                return a;
            }
            return f;
        }
    }

    /* renamed from: s */
    public final C25432c mo59311s() {
        return this.f60210d.invoke().mo59315a();
    }

    /* renamed from: t */
    public final MemberScope mo59312t() {
        return mo59311s().mo53412q().mo59564o();
    }

    public final String toString() {
        String str;
        C25065b r = mo59310r();
        C25066c h = r.mo61574h();
        C24362h.m61210e(h, "classId.packageFqName");
        if (h.mo61582d()) {
            str = "";
        } else {
            str = C24362h.m61216k(".", h.mo61580b());
        }
        String b = r.mo61576i().mo61580b();
        C24362h.m61210e(b, "classId.relativeClassName.asString()");
        return C24362h.m61216k(C24362h.m61216k(C25081h.m62834E(b, '.', '$'), str), "class ");
    }

    /* renamed from: u */
    public final MemberScope mo59314u() {
        MemberScope r0 = mo59311s().mo53515r0();
        C24362h.m61210e(r0, "descriptor.staticScope");
        return r0;
    }
}
