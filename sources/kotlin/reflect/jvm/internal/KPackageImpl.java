package kotlin.reflect.jvm.internal;

import java.util.Collection;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.C23899b;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mf0.C24362h;
import mf0.C24365j;
import sf0.C24866j;
import sg0.C24879e;
import tf0.C24973i;
import tf0.C24979k;
import tg0.C24988e;
import tg0.C24989f;
import ug0.C25069e;
import zf0.C25491z;

public final class KPackageImpl extends KDeclarationContainerImpl {

    /* renamed from: c */
    public final Class<?> f60239c;

    /* renamed from: d */
    public final C24973i.C24975b<Data> f60240d = new C24973i.C24975b<>(new KPackageImpl$data$1(this));

    public final class Data extends KDeclarationContainerImpl.Data {

        /* renamed from: g */
        public static final /* synthetic */ C24866j<Object>[] f60241g;

        /* renamed from: c */
        public final C24973i.C24974a f60242c;

        /* renamed from: d */
        public final C24973i.C24974a f60243d = C24973i.m62670c(new KPackageImpl$Data$scope$2(this));

        /* renamed from: e */
        public final C24973i.C24975b f60244e;

        /* renamed from: f */
        public final C24973i.C24975b f60245f;

        static {
            Class<Data> cls = Data.class;
            f60241g = new C24866j[]{C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "metadata", "getMetadata()Lkotlin/Triple;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "members", "getMembers()Ljava/util/Collection;"))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Data(KPackageImpl kPackageImpl) {
            super(kPackageImpl);
            C24362h.m61211f(kPackageImpl, "this$0");
            this.f60242c = C24973i.m62670c(new KPackageImpl$Data$kotlinClass$2(kPackageImpl));
            this.f60244e = new C24973i.C24975b(new KPackageImpl$Data$multifileFacade$2(this, kPackageImpl));
            this.f60245f = new C24973i.C24975b(new KPackageImpl$Data$metadata$2(this));
            C24973i.m62670c(new KPackageImpl$Data$members$2(this, kPackageImpl));
        }
    }

    public KPackageImpl(Class cls) {
        C24362h.m61211f(cls, "jClass");
        this.f60239c = cls;
    }

    /* renamed from: a */
    public final Class<?> mo59301a() {
        return this.f60239c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof KPackageImpl) || !C24362h.m61206a(this.f60239c, ((KPackageImpl) obj).f60239c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final Collection<C23899b> mo59305f() {
        return EmptyList.f60173b;
    }

    /* renamed from: g */
    public final Collection<C23900c> mo59306g(C25069e eVar) {
        C24973i.C24974a aVar = this.f60240d.invoke().f60243d;
        C24866j<Object> jVar = Data.f60241g[1];
        Object invoke = aVar.invoke();
        C24362h.m61210e(invoke, "<get-scope>(...)");
        return ((MemberScope) invoke).mo53531b(eVar, NoLookupLocation.FROM_REFLECTION);
    }

    /* renamed from: h */
    public final C25491z mo59307h(int i) {
        Object obj;
        C24973i.C24975b bVar = this.f60240d.invoke().f60245f;
        C24866j<Object> jVar = Data.f60241g[3];
        Triple triple = (Triple) bVar.invoke();
        if (triple == null) {
            return null;
        }
        C24989f fVar = (C24989f) triple.mo59082a();
        ProtoBuf$Package protoBuf$Package = (ProtoBuf$Package) triple.mo59083b();
        C24988e eVar = (C24988e) triple.mo59084c();
        GeneratedMessageLite.C24069e eVar2 = JvmProtoBuf.f61012n;
        C24362h.m61210e(eVar2, "packageLocalVariable");
        C24362h.m61211f(protoBuf$Package, "<this>");
        if (i < protoBuf$Package.mo59992i(eVar2)) {
            obj = protoBuf$Package.mo59991h(eVar2, i);
        } else {
            obj = null;
        }
        ProtoBuf$Property protoBuf$Property = (ProtoBuf$Property) obj;
        if (protoBuf$Property == null) {
            return null;
        }
        Class<?> cls = this.f60239c;
        ProtoBuf$TypeTable C = protoBuf$Package.mo59751C();
        C24362h.m61210e(C, "packageProto.typeTable");
        return (C25491z) C24979k.m62677d(cls, protoBuf$Property, fVar, new C24879e(C), eVar, KPackageImpl$getLocalProperty$1$1$1.f60246b);
    }

    public final int hashCode() {
        return this.f60239c.hashCode();
    }

    /* renamed from: j */
    public final Class<?> mo59319j() {
        C24973i.C24975b bVar = this.f60240d.invoke().f60244e;
        C24866j<Object> jVar = Data.f60241g[2];
        Class<?> cls = (Class) bVar.invoke();
        if (cls == null) {
            return this.f60239c;
        }
        return cls;
    }

    /* renamed from: k */
    public final Collection<C25491z> mo59309k(C25069e eVar) {
        C24973i.C24974a aVar = this.f60240d.invoke().f60243d;
        C24866j<Object> jVar = Data.f60241g[1];
        Object invoke = aVar.invoke();
        C24362h.m61210e(invoke, "<get-scope>(...)");
        return ((MemberScope) invoke).mo53532c(eVar, NoLookupLocation.FROM_REFLECTION);
    }

    public final String toString() {
        return C24362h.m61216k(ReflectClassUtilKt.m58949a(this.f60239c).mo61569b(), "file class ");
    }
}
