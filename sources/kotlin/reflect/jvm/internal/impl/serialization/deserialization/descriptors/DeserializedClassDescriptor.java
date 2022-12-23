package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import ag0.C20989e;
import cf0.C21136j;
import cf0.C21140n;
import cg0.C21154b;
import com.appboy.models.outgoing.FacebookUser;
import eh0.C23306d;
import eh0.C23311g;
import gg0.C23417b;
import hh0.C23494g;
import hh0.C23497i;
import hh0.C23500l;
import hh0.C23509r;
import hh0.C23512s;
import hh0.C23514t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jh0.C23734h;
import jh0.C23736j;
import kh0.C23788d;
import kh0.C23789e;
import kh0.C23790f;
import kh0.C23792h;
import kotlin.collections.C23825c;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;
import lf0.C24236l;
import lh0.C24255b;
import lh0.C24274i0;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import mh0.C24378d;
import p389bl.C13637c;
import p583jk.C17884p;
import p584jl.C17885a;
import sg0.C24871a;
import sg0.C24872b;
import sg0.C24876c;
import sg0.C24879e;
import sg0.C24880f;
import ug0.C25065b;
import ug0.C25069e;
import zf0.C25430b;
import zf0.C25432c;
import zf0.C25435d0;
import zf0.C25437e;
import zf0.C25442g;
import zf0.C25443g0;
import zf0.C25448i0;
import zf0.C25453l;
import zf0.C25478n;
import zf0.C25481p;

public final class DeserializedClassDescriptor extends C21154b implements C25442g {

    /* renamed from: f */
    public final ProtoBuf$Class f61260f;

    /* renamed from: g */
    public final C24871a f61261g;

    /* renamed from: h */
    public final C25435d0 f61262h;

    /* renamed from: i */
    public final C25065b f61263i;

    /* renamed from: j */
    public final Modality f61264j;

    /* renamed from: k */
    public final C25453l f61265k;

    /* renamed from: l */
    public final ClassKind f61266l;

    /* renamed from: m */
    public final C23497i f61267m;

    /* renamed from: n */
    public final C23311g f61268n;

    /* renamed from: o */
    public final DeserializedClassTypeConstructor f61269o;

    /* renamed from: p */
    public final ScopesHolderForClass<DeserializedClassMemberScope> f61270p;

    /* renamed from: q */
    public final EnumEntryClassDescriptors f61271q;

    /* renamed from: r */
    public final C25442g f61272r;

    /* renamed from: s */
    public final C23790f<C25430b> f61273s;

    /* renamed from: t */
    public final C23789e<Collection<C25430b>> f61274t;

    /* renamed from: u */
    public final C23790f<C25432c> f61275u;

    /* renamed from: v */
    public final C23789e<Collection<C25432c>> f61276v;

    /* renamed from: w */
    public final C23790f<C25481p<C24312z>> f61277w;

    /* renamed from: x */
    public final C23509r.C23510a f61278x;

    /* renamed from: y */
    public final C20989e f61279y;

    public final class DeserializedClassMemberScope extends DeserializedMemberScope {

        /* renamed from: g */
        public final C24378d f61280g;

        /* renamed from: h */
        public final C23789e<Collection<C25442g>> f61281h;

        /* renamed from: i */
        public final C23789e<Collection<C24307v>> f61282i;

        /* renamed from: j */
        public final /* synthetic */ DeserializedClassDescriptor f61283j;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public DeserializedClassMemberScope(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r8, mh0.C24378d r9) {
            /*
                r7 = this;
                java.lang.String r0 = "this$0"
                mf0.C24362h.m61211f(r8, r0)
                java.lang.String r0 = "kotlinTypeRefiner"
                mf0.C24362h.m61211f(r9, r0)
                r7.f61283j = r8
                hh0.i r2 = r8.f61267m
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.f61260f
                java.util.List r3 = r0.mo59664a0()
                java.lang.String r0 = "classProto.functionList"
                mf0.C24362h.m61210e(r3, r0)
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.f61260f
                java.util.List r4 = r0.mo59669f0()
                java.lang.String r0 = "classProto.propertyList"
                mf0.C24362h.m61210e(r4, r0)
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.f61260f
                java.util.List r5 = r0.mo59674j0()
                java.lang.String r0 = "classProto.typeAliasList"
                mf0.C24362h.m61210e(r5, r0)
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.f61260f
                java.util.List r0 = r0.mo59668e0()
                java.lang.String r1 = "classProto.nestedClassNameList"
                mf0.C24362h.m61210e(r0, r1)
                hh0.i r8 = r8.f61267m
                sg0.c r8 = r8.f59332b
                java.util.ArrayList r1 = new java.util.ArrayList
                r6 = 10
                int r6 = cf0.C21136j.m49436X(r0, r6)
                r1.<init>(r6)
                java.util.Iterator r0 = r0.iterator()
            L_0x004d:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L_0x0065
                java.lang.Object r6 = r0.next()
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                ug0.e r6 = p584jl.C17885a.m44427X(r8, r6)
                r1.add(r6)
                goto L_0x004d
            L_0x0065:
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$2$1 r6 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$2$1
                r6.<init>(r1)
                r1 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f61280g = r9
                hh0.i r8 = r7.f61291b
                hh0.g r8 = r8.f59331a
                kh0.h r8 = r8.f59311a
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$allDescriptors$1 r9 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$allDescriptors$1
                r9.<init>(r7)
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$h r8 = r8.mo59019d(r9)
                r7.f61281h = r8
                hh0.i r8 = r7.f61291b
                hh0.g r8 = r8.f59331a
                kh0.h r8 = r8.f59311a
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$refinedSupertypes$1 r9 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$refinedSupertypes$1
                r9.<init>(r7)
                kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$h r8 = r8.mo59019d(r9)
                r7.f61282i = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.DeserializedClassMemberScope.<init>(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor, mh0.d):void");
        }

        /* renamed from: b */
        public final Collection mo53531b(C25069e eVar, NoLookupLocation noLookupLocation) {
            C24362h.m61211f(eVar, "name");
            C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
            mo60208s(eVar, noLookupLocation);
            return super.mo53531b(eVar, noLookupLocation);
        }

        /* renamed from: c */
        public final Collection mo53532c(C25069e eVar, NoLookupLocation noLookupLocation) {
            C24362h.m61211f(eVar, "name");
            C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
            mo60208s(eVar, noLookupLocation);
            return super.mo53532c(eVar, noLookupLocation);
        }

        /* renamed from: e */
        public final Collection<C25442g> mo53492e(C23306d dVar, C24236l<? super C25069e, Boolean> lVar) {
            C24362h.m61211f(dVar, "kindFilter");
            C24362h.m61211f(lVar, "nameFilter");
            return (Collection) this.f61281h.invoke();
        }

        /* renamed from: g */
        public final C25437e mo58433g(C25069e eVar, NoLookupLocation noLookupLocation) {
            C25432c invoke;
            C24362h.m61211f(eVar, "name");
            C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
            mo60208s(eVar, noLookupLocation);
            EnumEntryClassDescriptors enumEntryClassDescriptors = this.f61283j.f61271q;
            if (enumEntryClassDescriptors == null || (invoke = enumEntryClassDescriptors.f61287b.invoke(eVar)) == null) {
                return super.mo58433g(eVar, noLookupLocation);
            }
            return invoke;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: kotlin.collections.EmptyList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: kotlin.collections.EmptyList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: kotlin.collections.EmptyList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: kotlin.collections.EmptyList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: kotlin.collections.EmptyList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo58963h(java.util.ArrayList r5, lf0.C24236l r6) {
            /*
                r4 = this;
                java.lang.String r0 = "nameFilter"
                mf0.C24362h.m61211f(r6, r0)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r6 = r4.f61283j
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$EnumEntryClassDescriptors r6 = r6.f61271q
                if (r6 != 0) goto L_0x000d
                r6 = 0
                goto L_0x003d
            L_0x000d:
                java.util.LinkedHashMap r0 = r6.f61286a
                java.util.Set r0 = r0.keySet()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x001c:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x003c
                java.lang.Object r2 = r0.next()
                ug0.e r2 = (ug0.C25069e) r2
                java.lang.String r3 = "name"
                mf0.C24362h.m61211f(r2, r3)
                kh0.d<ug0.e, zf0.c> r3 = r6.f61287b
                java.lang.Object r2 = r3.invoke(r2)
                zf0.c r2 = (zf0.C25432c) r2
                if (r2 != 0) goto L_0x0038
                goto L_0x001c
            L_0x0038:
                r1.add(r2)
                goto L_0x001c
            L_0x003c:
                r6 = r1
            L_0x003d:
                if (r6 != 0) goto L_0x0041
                kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.f60173b
            L_0x0041:
                r5.addAll(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor.DeserializedClassMemberScope.mo58963h(java.util.ArrayList, lf0.l):void");
        }

        /* renamed from: j */
        public final void mo60205j(C25069e eVar, ArrayList arrayList) {
            C24362h.m61211f(eVar, "name");
            ArrayList arrayList2 = new ArrayList();
            for (C24307v o : (Collection) this.f61282i.invoke()) {
                arrayList2.addAll(o.mo59564o().mo53531b(eVar, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            arrayList.addAll(this.f61291b.f59331a.f59324n.mo53179e(eVar, this.f61283j));
            C25069e eVar2 = eVar;
            this.f61291b.f59331a.f59327q.mo60528a().mo60170h(eVar2, arrayList2, new ArrayList(arrayList), this.f61283j, new C24136a(arrayList));
        }

        /* renamed from: k */
        public final void mo60206k(C25069e eVar, ArrayList arrayList) {
            C24362h.m61211f(eVar, "name");
            ArrayList arrayList2 = new ArrayList();
            for (C24307v o : (Collection) this.f61282i.invoke()) {
                arrayList2.addAll(o.mo59564o().mo53532c(eVar, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            C25069e eVar2 = eVar;
            this.f61291b.f59331a.f59327q.mo60528a().mo60170h(eVar2, arrayList2, new ArrayList(arrayList), this.f61283j, new C24136a(arrayList));
        }

        /* renamed from: l */
        public final C25065b mo58964l(C25069e eVar) {
            C24362h.m61211f(eVar, "name");
            return this.f61283j.f61263i.mo61571d(eVar);
        }

        /* renamed from: n */
        public final Set<C25069e> mo58965n() {
            List<C24307v> g = this.f61283j.f61269o.mo53459n();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (C24307v o : g) {
                Set<C25069e> f = o.mo59564o().mo53493f();
                if (f == null) {
                    return null;
                }
                C21140n.m49439a0(f, linkedHashSet);
            }
            return linkedHashSet;
        }

        /* renamed from: o */
        public final Set<C25069e> mo58966o() {
            List<C24307v> g = this.f61283j.f61269o.mo53459n();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (C24307v o : g) {
                C21140n.m49439a0(o.mo59564o().mo53530a(), linkedHashSet);
            }
            linkedHashSet.addAll(this.f61291b.f59331a.f59324n.mo53176b(this.f61283j));
            return linkedHashSet;
        }

        /* renamed from: p */
        public final Set<C25069e> mo58967p() {
            List<C24307v> g = this.f61283j.f61269o.mo53459n();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (C24307v o : g) {
                C21140n.m49439a0(o.mo59564o().mo53533d(), linkedHashSet);
            }
            return linkedHashSet;
        }

        /* renamed from: r */
        public final boolean mo60207r(C23734h hVar) {
            return this.f61291b.f59331a.f59325o.mo53183a(this.f61283j, hVar);
        }

        /* renamed from: s */
        public final void mo60208s(C25069e eVar, C23417b bVar) {
            C24362h.m61211f(eVar, "name");
            C24362h.m61211f(bVar, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
            C17884p.m44346Q(this.f61291b.f59331a.f59319i, (NoLookupLocation) bVar, this.f61283j, eVar);
        }
    }

    public final class DeserializedClassTypeConstructor extends C24255b {

        /* renamed from: c */
        public final C23789e<List<C25448i0>> f61284c;

        /* renamed from: d */
        public final /* synthetic */ DeserializedClassDescriptor f61285d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DeserializedClassTypeConstructor(DeserializedClassDescriptor deserializedClassDescriptor) {
            super(deserializedClassDescriptor.f61267m.f59331a.f59311a);
            C24362h.m61211f(deserializedClassDescriptor, "this$0");
            this.f61285d = deserializedClassDescriptor;
            this.f61284c = deserializedClassDescriptor.f61267m.f59331a.f59311a.mo59019d(new C24129x32944d2c(deserializedClassDescriptor));
        }

        /* renamed from: c */
        public final Collection<C24307v> mo53486c() {
            String str;
            NotFoundClasses.C23889b bVar;
            DeserializedClassDescriptor deserializedClassDescriptor = this.f61285d;
            ProtoBuf$Class protoBuf$Class = deserializedClassDescriptor.f61260f;
            C24879e eVar = deserializedClassDescriptor.f61267m.f59334d;
            C24362h.m61211f(protoBuf$Class, "<this>");
            C24362h.m61211f(eVar, "typeTable");
            List<ProtoBuf$Type> i0 = protoBuf$Class.mo59673i0();
            boolean z = !i0.isEmpty();
            ArrayList arrayList = i0;
            if (!z) {
                arrayList = null;
            }
            ArrayList<ProtoBuf$Type> arrayList2 = arrayList;
            if (arrayList == null) {
                List<Integer> h0 = protoBuf$Class.mo59672h0();
                C24362h.m61210e(h0, "supertypeIdList");
                ArrayList arrayList3 = new ArrayList(C21136j.m49436X(h0, 10));
                for (Integer num : h0) {
                    C24362h.m61210e(num, "it");
                    arrayList3.add(eVar.mo61353a(num.intValue()));
                }
                arrayList2 = arrayList3;
            }
            DeserializedClassDescriptor deserializedClassDescriptor2 = this.f61285d;
            ArrayList arrayList4 = new ArrayList(C21136j.m49436X(arrayList2, 10));
            for (ProtoBuf$Type f : arrayList2) {
                arrayList4.add(deserializedClassDescriptor2.f61267m.f59338h.mo60201f(f));
            }
            DeserializedClassDescriptor deserializedClassDescriptor3 = this.f61285d;
            ArrayList x0 = C23825c.m58527x0(deserializedClassDescriptor3.f61267m.f59331a.f59324n.mo53177c(deserializedClassDescriptor3), arrayList4);
            ArrayList arrayList5 = new ArrayList();
            Iterator it = x0.iterator();
            while (it.hasNext()) {
                C25437e o = ((C24307v) it.next()).mo60411O0().mo53460o();
                if (o instanceof NotFoundClasses.C23889b) {
                    bVar = (NotFoundClasses.C23889b) o;
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    arrayList5.add(bVar);
                }
            }
            if (!arrayList5.isEmpty()) {
                DeserializedClassDescriptor deserializedClassDescriptor4 = this.f61285d;
                C23500l lVar = deserializedClassDescriptor4.f61267m.f59331a.f59318h;
                ArrayList arrayList6 = new ArrayList(C21136j.m49436X(arrayList5, 10));
                Iterator it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    NotFoundClasses.C23889b bVar2 = (NotFoundClasses.C23889b) it2.next();
                    C25065b f2 = DescriptorUtilsKt.m60285f(bVar2);
                    if (f2 == null) {
                        str = bVar2.getName().mo61604f();
                    } else {
                        str = f2.mo61569b().mo61580b();
                    }
                    arrayList6.add(str);
                }
                lVar.mo58618f(deserializedClassDescriptor4, arrayList6);
            }
            return C23825c.m58499K0(x0);
        }

        /* renamed from: f */
        public final C25443g0 mo53488f() {
            return C25443g0.C25444a.f63738a;
        }

        public final List<C25448i0> getParameters() {
            return (List) this.f61284c.invoke();
        }

        /* renamed from: k */
        public final C25432c mo59523k() {
            return this.f61285d;
        }

        /* renamed from: o */
        public final C25437e mo53460o() {
            return this.f61285d;
        }

        /* renamed from: p */
        public final boolean mo53461p() {
            return true;
        }

        public final String toString() {
            String str = this.f61285d.getName().f63263b;
            C24362h.m61210e(str, "name.toString()");
            return str;
        }
    }

    public final class EnumEntryClassDescriptors {

        /* renamed from: a */
        public final LinkedHashMap f61286a;

        /* renamed from: b */
        public final C23788d<C25069e, C25432c> f61287b;

        /* renamed from: c */
        public final C23789e<Set<C25069e>> f61288c;

        /* renamed from: d */
        public final /* synthetic */ DeserializedClassDescriptor f61289d;

        public EnumEntryClassDescriptors(DeserializedClassDescriptor deserializedClassDescriptor) {
            C24362h.m61211f(deserializedClassDescriptor, "this$0");
            this.f61289d = deserializedClassDescriptor;
            List<ProtoBuf$EnumEntry> X = deserializedClassDescriptor.f61260f.mo59661X();
            C24362h.m61210e(X, "classProto.enumEntryList");
            int z = C13637c.m34083z(C21136j.m49436X(X, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(z < 16 ? 16 : z);
            for (T next : X) {
                linkedHashMap.put(C17885a.m44427X(deserializedClassDescriptor.f61267m.f59332b, ((ProtoBuf$EnumEntry) next).mo59708s()), next);
            }
            this.f61286a = linkedHashMap;
            DeserializedClassDescriptor deserializedClassDescriptor2 = this.f61289d;
            this.f61287b = deserializedClassDescriptor2.f61267m.f59331a.f59311a.mo59016a(new C24130xaf8327b7(this, deserializedClassDescriptor2));
            this.f61288c = this.f61289d.f61267m.f59331a.f59311a.mo59019d(new C24132xaaca1f71(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor(C23497i iVar, ProtoBuf$Class protoBuf$Class, C24876c cVar, C24871a aVar, C25435d0 d0Var) {
        super(iVar.f59331a.f59311a, C17885a.m44421R(cVar, protoBuf$Class.mo59663Z()).mo61577j());
        int i;
        ClassKind classKind;
        C23311g gVar;
        EnumEntryClassDescriptors enumEntryClassDescriptors;
        DeserializedClassDescriptor deserializedClassDescriptor;
        C20989e eVar;
        C24362h.m61211f(iVar, "outerContext");
        C24362h.m61211f(protoBuf$Class, "classProto");
        C24362h.m61211f(cVar, "nameResolver");
        C24362h.m61211f(aVar, "metadataVersion");
        C24362h.m61211f(d0Var, "sourceElement");
        this.f61260f = protoBuf$Class;
        this.f61261g = aVar;
        this.f61262h = d0Var;
        this.f61263i = C17885a.m44421R(cVar, protoBuf$Class.mo59663Z());
        this.f61264j = C23512s.m57639a((ProtoBuf$Modality) C24872b.f62886e.mo61348c(protoBuf$Class.mo59662Y()));
        this.f61265k = C23514t.m57640a((ProtoBuf$Visibility) C24872b.f62885d.mo61348c(protoBuf$Class.mo59662Y()));
        ProtoBuf$Class.Kind kind = (ProtoBuf$Class.Kind) C24872b.f62887f.mo61348c(protoBuf$Class.mo59662Y());
        if (kind == null) {
            i = -1;
        } else {
            i = C23512s.C23513a.f59362b[kind.ordinal()];
        }
        switch (i) {
            case 1:
                classKind = ClassKind.CLASS;
                break;
            case 2:
                classKind = ClassKind.INTERFACE;
                break;
            case 3:
                classKind = ClassKind.ENUM_CLASS;
                break;
            case 4:
                classKind = ClassKind.ENUM_ENTRY;
                break;
            case 5:
                classKind = ClassKind.ANNOTATION_CLASS;
                break;
            case 6:
            case 7:
                classKind = ClassKind.OBJECT;
                break;
            default:
                classKind = ClassKind.CLASS;
                break;
        }
        this.f61266l = classKind;
        List<ProtoBuf$TypeParameter> k0 = protoBuf$Class.mo59675k0();
        C24362h.m61210e(k0, "classProto.typeParameterList");
        ProtoBuf$TypeTable l0 = protoBuf$Class.mo59676l0();
        C24362h.m61210e(l0, "classProto.typeTable");
        C24879e eVar2 = new C24879e(l0);
        C24880f fVar = C24880f.f62915b;
        ProtoBuf$VersionRequirementTable m0 = protoBuf$Class.mo59677m0();
        C24362h.m61210e(m0, "classProto.versionRequirementTable");
        C23497i a = iVar.mo58615a(this, k0, cVar, eVar2, C24880f.C24881a.m62411a(m0), aVar);
        this.f61267m = a;
        ClassKind classKind2 = ClassKind.ENUM_CLASS;
        if (classKind == classKind2) {
            gVar = new StaticScopeForKotlinEnum(a.f59331a.f59311a, this);
        } else {
            gVar = MemberScope.C24119a.f61217b;
        }
        this.f61268n = gVar;
        this.f61269o = new DeserializedClassTypeConstructor(this);
        ScopesHolderForClass.C23890a aVar2 = ScopesHolderForClass.f60430e;
        C23494g gVar2 = a.f59331a;
        C23792h hVar = gVar2.f59311a;
        C24378d b = gVar2.f59327q.mo60529b();
        DeserializedClassDescriptor$memberScopeHolder$1 deserializedClassDescriptor$memberScopeHolder$1 = new DeserializedClassDescriptor$memberScopeHolder$1(this);
        aVar2.getClass();
        this.f61270p = ScopesHolderForClass.C23890a.m58766a(deserializedClassDescriptor$memberScopeHolder$1, this, hVar, b);
        C23509r.C23510a aVar3 = null;
        if (classKind == classKind2) {
            enumEntryClassDescriptors = new EnumEntryClassDescriptors(this);
        } else {
            enumEntryClassDescriptors = null;
        }
        this.f61271q = enumEntryClassDescriptors;
        C25442g gVar3 = iVar.f59333c;
        this.f61272r = gVar3;
        this.f61273s = a.f59331a.f59311a.mo59022g(new DeserializedClassDescriptor$primaryConstructor$1(this));
        this.f61274t = a.f59331a.f59311a.mo59019d(new DeserializedClassDescriptor$constructors$1(this));
        this.f61275u = a.f59331a.f59311a.mo59022g(new DeserializedClassDescriptor$companionObjectDescriptor$1(this));
        this.f61276v = a.f59331a.f59311a.mo59019d(new DeserializedClassDescriptor$sealedSubclasses$1(this));
        this.f61277w = a.f59331a.f59311a.mo59022g(new DeserializedClassDescriptor$inlineClassRepresentation$1(this));
        C24876c cVar2 = a.f59332b;
        C24879e eVar3 = a.f59334d;
        if (gVar3 instanceof DeserializedClassDescriptor) {
            deserializedClassDescriptor = (DeserializedClassDescriptor) gVar3;
        } else {
            deserializedClassDescriptor = null;
        }
        this.f61278x = new C23509r.C23510a(protoBuf$Class, cVar2, eVar3, d0Var, deserializedClassDescriptor != null ? deserializedClassDescriptor.f61278x : aVar3);
        if (!C24872b.f62884c.mo61346c(protoBuf$Class.mo59662Y()).booleanValue()) {
            eVar = C20989e.C20990a.f52739a;
        } else {
            eVar = new C23736j(a.f59331a.f59311a, new DeserializedClassDescriptor$annotations$1(this));
        }
        this.f61279y = eVar;
    }

    /* renamed from: B */
    public final Collection<C25432c> mo53504B() {
        return (Collection) this.f61276v.invoke();
    }

    /* renamed from: C */
    public final MemberScope mo53505C(C24378d dVar) {
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        return this.f61270p.mo59417a(dVar);
    }

    /* renamed from: E */
    public final boolean mo53506E() {
        Boolean c = C24872b.f62888g.mo61346c(this.f61260f.mo59662Y());
        C24362h.m61210e(c, "IS_INNER.get(classProto.flags)");
        return c.booleanValue();
    }

    /* renamed from: H */
    public final C25430b mo53507H() {
        return (C25430b) this.f61273s.invoke();
    }

    /* renamed from: N0 */
    public final DeserializedClassMemberScope mo60203N0() {
        return this.f61270p.mo59417a(this.f61267m.f59331a.f59327q.mo60529b());
    }

    /* renamed from: a0 */
    public final boolean mo53427a0() {
        return false;
    }

    /* renamed from: b */
    public final C25442g mo53399b() {
        return this.f61272r;
    }

    /* renamed from: c0 */
    public final boolean mo53428c0() {
        Boolean c = C24872b.f62890i.mo61346c(this.f61260f.mo59662Y());
        C24362h.m61210e(c, "IS_EXTERNAL_CLASS.get(classProto.flags)");
        return c.booleanValue();
    }

    /* renamed from: d0 */
    public final boolean mo53509d0() {
        return C24872b.f62887f.mo61348c(this.f61260f.mo59662Y()) == ProtoBuf$Class.Kind.COMPANION_OBJECT;
    }

    /* renamed from: e */
    public final C25435d0 mo53400e() {
        return this.f61262h;
    }

    /* renamed from: g */
    public final C25478n mo53429g() {
        return this.f61265k;
    }

    public final C20989e getAnnotations() {
        return this.f61279y;
    }

    /* renamed from: h0 */
    public final boolean mo53510h0() {
        Boolean c = C24872b.f62893l.mo61346c(this.f61260f.mo59662Y());
        C24362h.m61210e(c, "IS_FUN_INTERFACE.get(classProto.flags)");
        return c.booleanValue();
    }

    /* renamed from: j */
    public final C24274i0 mo53481j() {
        return this.f61269o;
    }

    /* renamed from: k */
    public final Collection<C25430b> mo53511k() {
        return (Collection) this.f61274t.invoke();
    }

    /* renamed from: o0 */
    public final boolean mo53512o0() {
        Boolean c = C24872b.f62892k.mo61346c(this.f61260f.mo59662Y());
        C24362h.m61210e(c, "IS_INLINE_CLASS.get(classProto.flags)");
        return c.booleanValue() && this.f61261g.mo61341a(1, 4, 2);
    }

    /* renamed from: p */
    public final ClassKind mo53513p() {
        return this.f61266l;
    }

    /* renamed from: p0 */
    public final boolean mo53434p0() {
        Boolean c = C24872b.f62891j.mo61346c(this.f61260f.mo59662Y());
        C24362h.m61210e(c, "IS_EXPECT_CLASS.get(classProto.flags)");
        return c.booleanValue();
    }

    /* renamed from: r */
    public final List<C25448i0> mo53514r() {
        return this.f61267m.f59338h.mo60198b();
    }

    /* renamed from: r0 */
    public final MemberScope mo53515r0() {
        return this.f61268n;
    }

    /* renamed from: s */
    public final Modality mo53436s() {
        return this.f61264j;
    }

    /* renamed from: s0 */
    public final C25432c mo53516s0() {
        return (C25432c) this.f61275u.invoke();
    }

    public final String toString() {
        String str;
        StringBuilder k = C13555b.m33972k("deserialized ");
        if (mo53434p0()) {
            str = "expect ";
        } else {
            str = "";
        }
        k.append(str);
        k.append("class ");
        k.append(getName());
        return k.toString();
    }

    /* renamed from: v */
    public final C25481p<C24312z> mo53518v() {
        return (C25481p) this.f61277w.invoke();
    }

    /* renamed from: w */
    public final boolean mo53519w() {
        boolean z;
        int i;
        Boolean c = C24872b.f62892k.mo61346c(this.f61260f.mo59662Y());
        C24362h.m61210e(c, "IS_INLINE_CLASS.get(classProto.flags)");
        if (!c.booleanValue()) {
            return false;
        }
        C24871a aVar = this.f61261g;
        int i2 = aVar.f62865b;
        if (i2 >= 1 && (i2 > 1 || ((i = aVar.f62866c) >= 4 && (i > 4 || aVar.f62867d > 1)))) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public final boolean mo53520z() {
        Boolean c = C24872b.f62889h.mo61346c(this.f61260f.mo59662Y());
        C24362h.m61210e(c, "IS_DATA.get(classProto.flags)");
        return c.booleanValue();
    }
}
