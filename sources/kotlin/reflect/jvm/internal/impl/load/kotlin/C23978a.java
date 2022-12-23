package kotlin.reflect.jvm.internal.impl.load.kotlin;

import cg0.C21153a0;
import hh0.C23489d;
import hh0.C23494g;
import hh0.C23504n;
import java.util.Set;
import jh0.C23732f;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import mf0.C24362h;
import p583jk.C17884p;
import qg0.C24746g;
import qg0.C24757k;
import qg0.C24762m;
import tg0.C24988e;
import tg0.C24989f;
import tg0.C24991g;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.a */
public final class C23978a {

    /* renamed from: b */
    public static final Set<KotlinClassHeader.Kind> f60758b = C17884p.m44348S(KotlinClassHeader.Kind.CLASS);

    /* renamed from: c */
    public static final Set<KotlinClassHeader.Kind> f60759c = C17884p.m44349T(KotlinClassHeader.Kind.FILE_FACADE, KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);

    /* renamed from: d */
    public static final C24988e f60760d = new C24988e(new int[]{1, 1, 11}, false);

    /* renamed from: e */
    public static final C24988e f60761e = new C24988e(new int[]{1, 1, 13}, false);

    /* renamed from: a */
    public C23494g f60762a;

    static {
        new C24988e(new int[]{1, 1, 2}, false);
    }

    /* renamed from: a */
    public final C23732f mo59583a(C21153a0 a0Var, C24757k kVar) {
        String[] strArr;
        Pair<C24989f, ProtoBuf$Package> pair;
        C24362h.m61211f(a0Var, "descriptor");
        C24362h.m61211f(kVar, "kotlinClass");
        Set<KotlinClassHeader.Kind> set = f60759c;
        KotlinClassHeader c = kVar.mo58420c();
        String[] strArr2 = c.f60766c;
        if (strArr2 == null) {
            strArr2 = c.f60767d;
        }
        if (strArr2 == null || !set.contains(c.f60764a)) {
            strArr2 = null;
        }
        if (strArr2 == null || (strArr = kVar.mo58420c().f60768e) == null) {
            return null;
        }
        try {
            pair = C24991g.m62705h(strArr2, strArr);
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalStateException(C24362h.m61216k(kVar.getLocation(), "Could not read data from "), e);
        } catch (Throwable th) {
            mo59585c().f59313c.mo58613e();
            if (!kVar.mo58420c().f60765b.mo61538c()) {
                pair = null;
            } else {
                throw th;
            }
        }
        if (pair == null) {
            return null;
        }
        C24989f a = pair.mo59066a();
        ProtoBuf$Package b = pair.mo59067b();
        mo59586d(kVar);
        mo59587e(kVar);
        C24746g gVar = new C24746g(kVar, b, a, mo59584b(kVar));
        return new C23732f(a0Var, b, a, kVar.mo58420c().f60765b, gVar, mo59585c(), "scope for " + gVar + " in " + a0Var, DeserializedDescriptorResolver$createKotlinPackagePartScope$2.f60756f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        if (r5 == false) goto L_0x0045;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability mo59584b(qg0.C24757k r5) {
        /*
            r4 = this;
            hh0.g r0 = r4.mo59585c()
            hh0.h r0 = r0.f59313c
            r0.mo58612d()
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r0 = r5.mo58420c()
            int r0 = r0.f60770g
            r1 = r0 & 64
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0017
            r1 = 1
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            if (r1 == 0) goto L_0x0025
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r0 != 0) goto L_0x0025
            r0 = 1
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability.FIR_UNSTABLE
            goto L_0x004c
        L_0x002b:
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r5 = r5.mo58420c()
            int r5 = r5.f60770g
            r0 = r5 & 16
            if (r0 == 0) goto L_0x0037
            r0 = 1
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            if (r0 == 0) goto L_0x0044
            r5 = r5 & 32
            if (r5 == 0) goto L_0x0040
            r5 = 1
            goto L_0x0041
        L_0x0040:
            r5 = 0
        L_0x0041:
            if (r5 != 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r2 = 0
        L_0x0045:
            if (r2 == 0) goto L_0x004a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability.IR_UNSTABLE
            goto L_0x004c
        L_0x004a:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability.STABLE
        L_0x004c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.C23978a.mo59584b(qg0.k):kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability");
    }

    /* renamed from: c */
    public final C23494g mo59585c() {
        C23494g gVar = this.f60762a;
        if (gVar != null) {
            return gVar;
        }
        C24362h.m61217l("components");
        throw null;
    }

    /* renamed from: d */
    public final C23504n<C24988e> mo59586d(C24757k kVar) {
        mo59585c().f59313c.mo58613e();
        if (kVar.mo58420c().f60765b.mo61538c()) {
            return null;
        }
        return new C23504n<>(kVar.mo58420c().f60765b, C24988e.f63127g, kVar.getLocation(), kVar.mo58421d());
    }

    /* renamed from: e */
    public final boolean mo59587e(C24757k kVar) {
        boolean z;
        boolean z2;
        mo59585c().f59313c.mo58614f();
        mo59585c().f59313c.mo58610b();
        if ((kVar.mo58420c().f60770g & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !C24362h.m61206a(kVar.mo58420c().f60765b, f60760d)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final C23489d mo59588f(C24757k kVar) {
        String[] strArr;
        Pair<C24989f, ProtoBuf$Class> pair;
        Set<KotlinClassHeader.Kind> set = f60758b;
        KotlinClassHeader c = kVar.mo58420c();
        String[] strArr2 = c.f60766c;
        if (strArr2 == null) {
            strArr2 = c.f60767d;
        }
        if (strArr2 == null || !set.contains(c.f60764a)) {
            strArr2 = null;
        }
        if (strArr2 == null || (strArr = kVar.mo58420c().f60768e) == null) {
            return null;
        }
        try {
            pair = C24991g.m62703f(strArr2, strArr);
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalStateException(C24362h.m61216k(kVar.getLocation(), "Could not read data from "), e);
        } catch (Throwable th) {
            mo59585c().f59313c.mo58613e();
            if (!kVar.mo58420c().f60765b.mo61538c()) {
                pair = null;
            } else {
                throw th;
            }
        }
        if (pair == null) {
            return null;
        }
        mo59586d(kVar);
        mo59587e(kVar);
        return new C23489d(pair.mo59066a(), pair.mo59067b(), kVar.mo58420c().f60765b, new C24762m(kVar, mo59584b(kVar)));
    }
}
