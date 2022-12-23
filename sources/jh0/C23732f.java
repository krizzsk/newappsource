package jh0;

import bg0.C21053b;
import cf0.C21140n;
import com.appboy.models.outgoing.FacebookUser;
import eh0.C23306d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.C23825c;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import lf0.C24236l;
import mf0.C24362h;
import p583jk.C17884p;
import ug0.C25065b;
import ug0.C25066c;
import ug0.C25069e;
import zf0.C25437e;
import zf0.C25486u;

/* renamed from: jh0.f */
public final class C23732f extends DeserializedMemberScope {

    /* renamed from: g */
    public final C25486u f59938g;

    /* renamed from: h */
    public final String f59939h;

    /* renamed from: i */
    public final C25066c f59940i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23732f(zf0.C25486u r17, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r18, sg0.C24876c r19, sg0.C24871a r20, jh0.C23730d r21, hh0.C23494g r22, java.lang.String r23, lf0.C24225a<? extends java.util.Collection<ug0.C25069e>> r24) {
        /*
            r16 = this;
            r6 = r16
            r14 = r17
            r15 = r23
            java.lang.String r0 = "packageDescriptor"
            mf0.C24362h.m61211f(r14, r0)
            java.lang.String r0 = "nameResolver"
            r1 = r19
            mf0.C24362h.m61211f(r1, r0)
            java.lang.String r0 = "metadataVersion"
            r2 = r20
            mf0.C24362h.m61211f(r2, r0)
            java.lang.String r0 = "debugName"
            mf0.C24362h.m61211f(r15, r0)
            java.lang.String r0 = "classNames"
            r5 = r24
            mf0.C24362h.m61211f(r5, r0)
            sg0.e r10 = new sg0.e
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r0 = r18.mo59751C()
            java.lang.String r3 = "proto.typeTable"
            mf0.C24362h.m61210e(r0, r3)
            r10.<init>(r0)
            sg0.f r0 = sg0.C24880f.f62915b
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r0 = r18.mo59752D()
            java.lang.String r3 = "proto.versionRequirementTable"
            mf0.C24362h.m61210e(r0, r3)
            sg0.f r11 = sg0.C24880f.C24881a.m62411a(r0)
            r7 = r22
            r8 = r17
            r9 = r19
            r12 = r20
            r13 = r21
            hh0.i r1 = r7.mo58607a(r8, r9, r10, r11, r12, r13)
            java.util.List r2 = r18.mo59755z()
            java.lang.String r0 = "proto.functionList"
            mf0.C24362h.m61210e(r2, r0)
            java.util.List r3 = r18.mo59749A()
            java.lang.String r0 = "proto.propertyList"
            mf0.C24362h.m61210e(r3, r0)
            java.util.List r4 = r18.mo59750B()
            java.lang.String r0 = "proto.typeAliasList"
            mf0.C24362h.m61210e(r4, r0)
            r0 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f59938g = r14
            r6.f59939h = r15
            ug0.c r0 = r17.mo53401f()
            r6.f59940i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jh0.C23732f.<init>(zf0.u, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package, sg0.c, sg0.a, jh0.d, hh0.g, java.lang.String, lf0.a):void");
    }

    /* renamed from: e */
    public final Collection mo53492e(C23306d dVar, C24236l lVar) {
        C24362h.m61211f(dVar, "kindFilter");
        C24362h.m61211f(lVar, "nameFilter");
        List i = mo60210i(dVar, lVar, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<C21053b> iterable = this.f61291b.f59331a.f59321k;
        ArrayList arrayList = new ArrayList();
        for (C21053b b : iterable) {
            C21140n.m49439a0(b.mo53181b(this.f59940i), arrayList);
        }
        return C23825c.m58527x0(arrayList, i);
    }

    /* renamed from: g */
    public final C25437e mo58433g(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        C17884p.m44347R(this.f61291b.f59331a.f59319i, noLookupLocation, this.f59938g, eVar);
        return super.mo58433g(eVar, noLookupLocation);
    }

    /* renamed from: h */
    public final void mo58963h(ArrayList arrayList, C24236l lVar) {
        C24362h.m61211f(lVar, "nameFilter");
    }

    /* renamed from: l */
    public final C25065b mo58964l(C25069e eVar) {
        C24362h.m61211f(eVar, "name");
        return new C25065b(this.f59940i, eVar);
    }

    /* renamed from: n */
    public final Set<C25069e> mo58965n() {
        return EmptySet.f60175b;
    }

    /* renamed from: o */
    public final Set<C25069e> mo58966o() {
        return EmptySet.f60175b;
    }

    /* renamed from: p */
    public final Set<C25069e> mo58967p() {
        return EmptySet.f60175b;
    }

    /* renamed from: q */
    public final boolean mo58968q(C25069e eVar) {
        boolean z;
        C24362h.m61211f(eVar, "name");
        if (super.mo58968q(eVar)) {
            return true;
        }
        Iterable<C21053b> iterable = this.f61291b.f59331a.f59321k;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator<C21053b> it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().mo53180a(this.f59940i, eVar)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        if (z) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f59939h;
    }
}
