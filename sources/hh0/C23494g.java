package hh0;

import ag0.C20986c;
import bg0.C21051a;
import bg0.C21053b;
import bg0.C21054c;
import bg0.C21058e;
import com.moovit.database.sqlite.SQLiteDatabase;
import dh0.C23273b;
import gg0.C23418c;
import hh0.C23491f;
import hh0.C23495h;
import hh0.C23506p;
import java.util.Set;
import jh0.C23730d;
import kh0.C23792h;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.protobuf.C24079d;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import mf0.C24362h;
import mh0.C24382g;
import mh0.C24384h;
import p988j$.util.Spliterator;
import sg0.C24871a;
import sg0.C24876c;
import sg0.C24879e;
import sg0.C24880f;
import ug0.C25065b;
import zf0.C25432c;
import zf0.C25485t;
import zf0.C25486u;
import zf0.C25487v;
import zg0.C25498g;

/* renamed from: hh0.g */
public final class C23494g {

    /* renamed from: a */
    public final C23792h f59311a;

    /* renamed from: b */
    public final C25485t f59312b;

    /* renamed from: c */
    public final C23495h f59313c;

    /* renamed from: d */
    public final C23490e f59314d;

    /* renamed from: e */
    public final C23484a<C20986c, C25498g<?>> f59315e;

    /* renamed from: f */
    public final C25487v f59316f;

    /* renamed from: g */
    public final C23506p f59317g;

    /* renamed from: h */
    public final C23500l f59318h;

    /* renamed from: i */
    public final C23418c f59319i;

    /* renamed from: j */
    public final C23502m f59320j;

    /* renamed from: k */
    public final Iterable<C21053b> f59321k;

    /* renamed from: l */
    public final NotFoundClasses f59322l;

    /* renamed from: m */
    public final C23491f f59323m;

    /* renamed from: n */
    public final C21051a f59324n;

    /* renamed from: o */
    public final C21054c f59325o;

    /* renamed from: p */
    public final C24079d f59326p;

    /* renamed from: q */
    public final C24382g f59327q;

    /* renamed from: r */
    public final C21058e f59328r;

    /* renamed from: s */
    public final ClassDeserializer f59329s;

    public C23494g(C23792h hVar, C25485t tVar, C23490e eVar, C23484a aVar, C25487v vVar, C23500l lVar, C23502m mVar, Iterable iterable, NotFoundClasses notFoundClasses, C21051a aVar2, C21054c cVar, C24079d dVar, C24384h hVar2, C23273b bVar, int i) {
        C24384h hVar3;
        C23792h hVar4 = hVar;
        C25485t tVar2 = tVar;
        C25487v vVar2 = vVar;
        Iterable iterable2 = iterable;
        C24079d dVar2 = dVar;
        int i2 = i;
        C23495h.C23496a aVar3 = C23495h.C23496a.f59330a;
        C23506p.C23507a aVar4 = C23506p.C23507a.f59347a;
        C23418c.C23419a aVar5 = C23418c.C23419a.f59200a;
        C23491f.C23492a.C23493a aVar6 = C23491f.C23492a.f59310a;
        C21051a aVar7 = (i2 & 8192) != 0 ? C21051a.C21052a.f52857a : aVar2;
        C21054c cVar2 = (i2 & Spliterator.SUBSIZED) != 0 ? C21054c.C21055a.f52858a : cVar;
        if ((65536 & i2) != 0) {
            C24382g.f61723b.getClass();
            hVar3 = C24382g.C24383a.f61725b;
        } else {
            hVar3 = hVar2;
        }
        C21058e.C21059a aVar8 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? C21058e.C21059a.f52861a : null;
        C24362h.m61211f(hVar4, "storageManager");
        C24362h.m61211f(tVar2, "moduleDescriptor");
        C24362h.m61211f(vVar2, "packageFragmentProvider");
        C24362h.m61211f(iterable2, "fictitiousClassDescriptorFactories");
        C24362h.m61211f(aVar7, "additionalClassPartsProvider");
        C24362h.m61211f(cVar2, "platformDependentDeclarationFilter");
        C24362h.m61211f(dVar2, "extensionRegistryLite");
        C24362h.m61211f(hVar3, "kotlinTypeChecker");
        C24362h.m61211f(aVar8, "platformDependentTypeTransformer");
        this.f59311a = hVar4;
        this.f59312b = tVar2;
        this.f59313c = aVar3;
        this.f59314d = eVar;
        this.f59315e = aVar;
        this.f59316f = vVar2;
        this.f59317g = aVar4;
        this.f59318h = lVar;
        this.f59319i = aVar5;
        this.f59320j = mVar;
        this.f59321k = iterable2;
        this.f59322l = notFoundClasses;
        this.f59323m = aVar6;
        this.f59324n = aVar7;
        this.f59325o = cVar2;
        this.f59326p = dVar2;
        this.f59327q = hVar3;
        this.f59328r = aVar8;
        this.f59329s = new ClassDeserializer(this);
    }

    /* renamed from: a */
    public final C23497i mo58607a(C25486u uVar, C24876c cVar, C24879e eVar, C24880f fVar, C24871a aVar, C23730d dVar) {
        C24362h.m61211f(uVar, "descriptor");
        C24876c cVar2 = cVar;
        C24362h.m61211f(cVar, "nameResolver");
        C24362h.m61211f(fVar, "versionRequirementTable");
        C24871a aVar2 = aVar;
        C24362h.m61211f(aVar2, "metadataVersion");
        return new C23497i(this, cVar2, uVar, eVar, fVar, aVar2, dVar, (TypeDeserializer) null, EmptyList.f60173b);
    }

    /* renamed from: b */
    public final C25432c mo58608b(C25065b bVar) {
        C24362h.m61211f(bVar, "classId");
        ClassDeserializer classDeserializer = this.f59329s;
        Set<C25065b> set = ClassDeserializer.f61230c;
        return classDeserializer.mo60186a(bVar, (C23489d) null);
    }
}
