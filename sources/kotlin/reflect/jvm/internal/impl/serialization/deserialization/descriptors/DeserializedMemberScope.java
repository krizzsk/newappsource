package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import bf0.C21050d;
import cf0.C21136j;
import cf0.C21139m;
import com.appboy.models.outgoing.FacebookUser;
import com.appsflyer.share.Constants;
import eh0.C23306d;
import eh0.C23311g;
import hh0.C23497i;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jh0.C23734h;
import kh0.C23787c;
import kh0.C23788d;
import kh0.C23789e;
import kh0.C23790f;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias;
import kotlin.reflect.jvm.internal.impl.protobuf.C24074a;
import kotlin.reflect.jvm.internal.impl.protobuf.C24090h;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import lf0.C24225a;
import lf0.C24236l;
import mf0.C24361g;
import mf0.C24362h;
import mf0.C24365j;
import p389bl.C13637c;
import p584jl.C17885a;
import p845um.C19958a;
import sf0.C24866j;
import ug0.C25065b;
import ug0.C25069e;
import xg0.C25262e;
import zf0.C25437e;
import zf0.C25446h0;
import zf0.C25491z;

public abstract class DeserializedMemberScope extends C23311g {

    /* renamed from: f */
    public static final /* synthetic */ C24866j<Object>[] f61290f;

    /* renamed from: b */
    public final C23497i f61291b;

    /* renamed from: c */
    public final C24133a f61292c;

    /* renamed from: d */
    public final C23789e f61293d;

    /* renamed from: e */
    public final C23790f f61294e;

    public final class OptimizedImplementation implements C24133a {

        /* renamed from: j */
        public static final /* synthetic */ C24866j<Object>[] f61295j;

        /* renamed from: a */
        public final LinkedHashMap f61296a;

        /* renamed from: b */
        public final LinkedHashMap f61297b;

        /* renamed from: c */
        public final Map<C25069e, byte[]> f61298c;

        /* renamed from: d */
        public final C23787c<C25069e, Collection<C23903e>> f61299d;

        /* renamed from: e */
        public final C23787c<C25069e, Collection<C25491z>> f61300e;

        /* renamed from: f */
        public final C23788d<C25069e, C25446h0> f61301f;

        /* renamed from: g */
        public final C23789e f61302g;

        /* renamed from: h */
        public final C23789e f61303h;

        /* renamed from: i */
        public final /* synthetic */ DeserializedMemberScope f61304i;

        static {
            Class<OptimizedImplementation> cls = OptimizedImplementation.class;
            f61295j = new C24866j[]{C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "functionNames", "getFunctionNames()Ljava/util/Set;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "variableNames", "getVariableNames()Ljava/util/Set;"))};
        }

        public OptimizedImplementation(DeserializedMemberScope deserializedMemberScope, List<ProtoBuf$Function> list, List<ProtoBuf$Property> list2, List<ProtoBuf$TypeAlias> list3) {
            C24362h.m61211f(deserializedMemberScope, "this$0");
            this.f61304i = deserializedMemberScope;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T next : list) {
                C25069e X = C17885a.m44427X(deserializedMemberScope.f61291b.f59332b, ((ProtoBuf$Function) ((C24090h) next)).mo59727I());
                Object obj = linkedHashMap.get(X);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(X, obj);
                }
                ((List) obj).add(next);
            }
            this.f61296a = m60406h(linkedHashMap);
            DeserializedMemberScope deserializedMemberScope2 = this.f61304i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (T next2 : list2) {
                C25069e X2 = C17885a.m44427X(deserializedMemberScope2.f61291b.f59332b, ((ProtoBuf$Property) ((C24090h) next2)).mo59771H());
                Object obj2 = linkedHashMap2.get(X2);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap2.put(X2, obj2);
                }
                ((List) obj2).add(next2);
            }
            this.f61297b = m60406h(linkedHashMap2);
            this.f61304i.f61291b.f59331a.f59313c.mo58611c();
            DeserializedMemberScope deserializedMemberScope3 = this.f61304i;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (T next3 : list3) {
                C25069e X3 = C17885a.m44427X(deserializedMemberScope3.f61291b.f59332b, ((ProtoBuf$TypeAlias) ((C24090h) next3)).mo59857H());
                Object obj3 = linkedHashMap3.get(X3);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    linkedHashMap3.put(X3, obj3);
                }
                ((List) obj3).add(next3);
            }
            this.f61298c = m60406h(linkedHashMap3);
            this.f61299d = this.f61304i.f61291b.f59331a.f59311a.mo59020e(new DeserializedMemberScope$OptimizedImplementation$functions$1(this));
            this.f61300e = this.f61304i.f61291b.f59331a.f59311a.mo59020e(new DeserializedMemberScope$OptimizedImplementation$properties$1(this));
            this.f61301f = this.f61304i.f61291b.f59331a.f59311a.mo59016a(new C24135x48b4056b(this));
            DeserializedMemberScope deserializedMemberScope4 = this.f61304i;
            this.f61302g = deserializedMemberScope4.f61291b.f59331a.f59311a.mo59019d(new DeserializedMemberScope$OptimizedImplementation$functionNames$2(this, deserializedMemberScope4));
            DeserializedMemberScope deserializedMemberScope5 = this.f61304i;
            this.f61303h = deserializedMemberScope5.f61291b.f59331a.f59311a.mo59019d(new DeserializedMemberScope$OptimizedImplementation$variableNames$2(this, deserializedMemberScope5));
        }

        /* renamed from: h */
        public static LinkedHashMap m60406h(LinkedHashMap linkedHashMap) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C13637c.m34083z(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable<C24074a> iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(C21136j.m49436X(iterable, 10));
                for (C24074a aVar : iterable) {
                    int serializedSize = aVar.getSerializedSize();
                    int f = CodedOutputStream.m60030f(serializedSize) + serializedSize;
                    if (f > 4096) {
                        f = 4096;
                    }
                    CodedOutputStream j = CodedOutputStream.m60033j(byteArrayOutputStream, f);
                    j.mo59985v(serializedSize);
                    aVar.mo59605a(j);
                    j.mo59973i();
                    arrayList.add(C21050d.f52856a);
                }
                linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap2;
        }

        /* renamed from: a */
        public final Set<C25069e> mo60212a() {
            return (Set) C19958a.m47435j(this.f61302g, f61295j[0]);
        }

        /* renamed from: b */
        public final Collection mo60213b(C25069e eVar, NoLookupLocation noLookupLocation) {
            C24362h.m61211f(eVar, "name");
            C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
            if (!mo60212a().contains(eVar)) {
                return EmptyList.f60173b;
            }
            return (Collection) ((LockBasedStorageManager.C24148k) this.f61299d).invoke(eVar);
        }

        /* renamed from: c */
        public final Collection mo60214c(C25069e eVar, NoLookupLocation noLookupLocation) {
            C24362h.m61211f(eVar, "name");
            C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
            if (!mo60215d().contains(eVar)) {
                return EmptyList.f60173b;
            }
            return (Collection) ((LockBasedStorageManager.C24148k) this.f61300e).invoke(eVar);
        }

        /* renamed from: d */
        public final Set<C25069e> mo60215d() {
            return (Set) C19958a.m47435j(this.f61303h, f61295j[1]);
        }

        /* renamed from: e */
        public final C25446h0 mo60216e(C25069e eVar) {
            C24362h.m61211f(eVar, "name");
            return this.f61301f.invoke(eVar);
        }

        /* renamed from: f */
        public final void mo60217f(ArrayList arrayList, C23306d dVar, C24236l lVar, NoLookupLocation noLookupLocation) {
            C24362h.m61211f(dVar, "kindFilter");
            C24362h.m61211f(lVar, "nameFilter");
            C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
            if (dVar.mo58439a(C23306d.f59095j)) {
                Set<C25069e> d = mo60215d();
                ArrayList arrayList2 = new ArrayList();
                for (C25069e next : d) {
                    if (((Boolean) lVar.invoke(next)).booleanValue()) {
                        arrayList2.addAll(mo60214c(next, noLookupLocation));
                    }
                }
                C21139m.m49437Y(arrayList2, C25262e.f63538b);
                arrayList.addAll(arrayList2);
            }
            if (dVar.mo58439a(C23306d.f59094i)) {
                Set<C25069e> a = mo60212a();
                ArrayList arrayList3 = new ArrayList();
                for (C25069e next2 : a) {
                    if (((Boolean) lVar.invoke(next2)).booleanValue()) {
                        arrayList3.addAll(mo60213b(next2, noLookupLocation));
                    }
                }
                C21139m.m49437Y(arrayList3, C25262e.f63538b);
                arrayList.addAll(arrayList3);
            }
        }

        /* renamed from: g */
        public final Set<C25069e> mo60218g() {
            return this.f61298c.keySet();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$a */
    public interface C24133a {
        /* renamed from: a */
        Set<C25069e> mo60212a();

        /* renamed from: b */
        Collection mo60213b(C25069e eVar, NoLookupLocation noLookupLocation);

        /* renamed from: c */
        Collection mo60214c(C25069e eVar, NoLookupLocation noLookupLocation);

        /* renamed from: d */
        Set<C25069e> mo60215d();

        /* renamed from: e */
        C25446h0 mo60216e(C25069e eVar);

        /* renamed from: f */
        void mo60217f(ArrayList arrayList, C23306d dVar, C24236l lVar, NoLookupLocation noLookupLocation);

        /* renamed from: g */
        Set<C25069e> mo60218g();
    }

    static {
        Class<DeserializedMemberScope> cls = DeserializedMemberScope.class;
        f61290f = new C24866j[]{C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};
    }

    public DeserializedMemberScope(C23497i iVar, List<ProtoBuf$Function> list, List<ProtoBuf$Property> list2, List<ProtoBuf$TypeAlias> list3, C24225a<? extends Collection<C25069e>> aVar) {
        C24362h.m61211f(iVar, Constants.URL_CAMPAIGN);
        C24362h.m61211f(aVar, "classNames");
        this.f61291b = iVar;
        iVar.f59331a.f59313c.mo58609a();
        this.f61292c = new OptimizedImplementation(this, list, list2, list3);
        this.f61293d = iVar.f59331a.f59311a.mo59019d(new DeserializedMemberScope$classNames$2(aVar));
        this.f61294e = iVar.f59331a.f59311a.mo59022g(new DeserializedMemberScope$classifierNamesLazy$2(this));
    }

    /* renamed from: a */
    public final Set<C25069e> mo53530a() {
        return this.f61292c.mo60212a();
    }

    /* renamed from: b */
    public Collection mo53531b(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        return this.f61292c.mo60213b(eVar, noLookupLocation);
    }

    /* renamed from: c */
    public Collection mo53532c(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        return this.f61292c.mo60214c(eVar, noLookupLocation);
    }

    /* renamed from: d */
    public final Set<C25069e> mo53533d() {
        return this.f61292c.mo60215d();
    }

    /* renamed from: f */
    public final Set<C25069e> mo53493f() {
        C23790f fVar = this.f61294e;
        C24866j<Object> jVar = f61290f[1];
        C24362h.m61211f(fVar, "<this>");
        C24362h.m61211f(jVar, com.appboy.Constants.APPBOY_PUSH_PRIORITY_KEY);
        return (Set) fVar.invoke();
    }

    /* renamed from: g */
    public C25437e mo58433g(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        if (mo58968q(eVar)) {
            return this.f61291b.f59331a.mo58608b(mo58964l(eVar));
        }
        if (this.f61292c.mo60218g().contains(eVar)) {
            return this.f61292c.mo60216e(eVar);
        }
        return null;
    }

    /* renamed from: h */
    public abstract void mo58963h(ArrayList arrayList, C24236l lVar);

    /* renamed from: i */
    public final List mo60210i(C23306d dVar, C24236l lVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(dVar, "kindFilter");
        C24362h.m61211f(lVar, "nameFilter");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        ArrayList arrayList = new ArrayList(0);
        if (dVar.mo58439a(C23306d.f59091f)) {
            mo58963h(arrayList, lVar);
        }
        this.f61292c.mo60217f(arrayList, dVar, lVar, noLookupLocation);
        if (dVar.mo58439a(C23306d.f59097l)) {
            for (C25069e next : mo60211m()) {
                if (((Boolean) lVar.invoke(next)).booleanValue()) {
                    C24361g.m61168j(this.f61291b.f59331a.mo58608b(mo58964l(next)), arrayList);
                }
            }
        }
        if (dVar.mo58439a(C23306d.f59092g)) {
            for (C25069e next2 : this.f61292c.mo60218g()) {
                if (((Boolean) lVar.invoke(next2)).booleanValue()) {
                    C24361g.m61168j(this.f61292c.mo60216e(next2), arrayList);
                }
            }
        }
        return C24361g.m61195x(arrayList);
    }

    /* renamed from: j */
    public void mo60205j(C25069e eVar, ArrayList arrayList) {
        C24362h.m61211f(eVar, "name");
    }

    /* renamed from: k */
    public void mo60206k(C25069e eVar, ArrayList arrayList) {
        C24362h.m61211f(eVar, "name");
    }

    /* renamed from: l */
    public abstract C25065b mo58964l(C25069e eVar);

    /* renamed from: m */
    public final Set<C25069e> mo60211m() {
        return (Set) C19958a.m47435j(this.f61293d, f61290f[0]);
    }

    /* renamed from: n */
    public abstract Set<C25069e> mo58965n();

    /* renamed from: o */
    public abstract Set<C25069e> mo58966o();

    /* renamed from: p */
    public abstract Set<C25069e> mo58967p();

    /* renamed from: q */
    public boolean mo58968q(C25069e eVar) {
        C24362h.m61211f(eVar, "name");
        return mo60211m().contains(eVar);
    }

    /* renamed from: r */
    public boolean mo60207r(C23734h hVar) {
        return true;
    }
}
