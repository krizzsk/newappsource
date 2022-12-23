package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import ag0.C20989e;
import bg0.C21051a;
import bg0.C21054c;
import bg0.C21057d;
import ce0.C21100e;
import cf0.C21136j;
import cg0.C21177j;
import cg0.C21181l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import jh0.C23734h;
import kh0.C23785a;
import kh0.C23789e;
import kh0.C23792h;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23909c;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.C24162a;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import lf0.C24225a;
import lh0.C24312z;
import mf0.C24362h;
import mf0.C24365j;
import p583jk.C17875h;
import p583jk.C17884p;
import p584jl.C17885a;
import p845um.C19958a;
import sf0.C24866j;
import ug0.C25065b;
import ug0.C25066c;
import ug0.C25067d;
import ug0.C25069e;
import yf0.C25294b;
import yf0.C25295c;
import yf0.C25297d;
import yf0.C25300g;
import zf0.C25430b;
import zf0.C25432c;
import zf0.C25437e;
import zf0.C25452k0;
import zf0.C25485t;

public final class JvmBuiltInsCustomizer implements C21051a, C21054c {

    /* renamed from: h */
    public static final /* synthetic */ C24866j<Object>[] f60398h;

    /* renamed from: a */
    public final C25485t f60399a;

    /* renamed from: b */
    public final C17875h f60400b = C17875h.f45862f;

    /* renamed from: c */
    public final C23789e f60401c;

    /* renamed from: d */
    public final C24312z f60402d;

    /* renamed from: e */
    public final C23789e f60403e;

    /* renamed from: f */
    public final C23785a<C25066c, C25432c> f60404f;

    /* renamed from: g */
    public final C23789e f60405g;

    public enum JDKMemberStatus {
        HIDDEN,
        VISIBLE,
        NOT_CONSIDERED,
        DROP
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$a */
    public /* synthetic */ class C23879a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60406a;

        static {
            int[] iArr = new int[JDKMemberStatus.values().length];
            iArr[JDKMemberStatus.HIDDEN.ordinal()] = 1;
            iArr[JDKMemberStatus.NOT_CONSIDERED.ordinal()] = 2;
            iArr[JDKMemberStatus.DROP.ordinal()] = 3;
            iArr[JDKMemberStatus.VISIBLE.ordinal()] = 4;
            f60406a = iArr;
        }
    }

    static {
        Class<JvmBuiltInsCustomizer> cls = JvmBuiltInsCustomizer.class;
        f60398h = new C24866j[]{C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(cls), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    }

    public JvmBuiltInsCustomizer(C23909c cVar, C23792h hVar, C24225a aVar) {
        C24362h.m61211f(hVar, "storageManager");
        this.f60399a = cVar;
        this.f60401c = hVar.mo59019d(aVar);
        C21181l lVar = new C21181l(new C25297d(cVar, new C25066c("java.io")), C25069e.m62820i("Serializable"), Modality.ABSTRACT, ClassKind.INTERFACE, C17875h.m44280D(new C24162a(hVar, new C23880xd3162e24(this))), hVar);
        lVar.mo53508N0(MemberScope.C24119a.f61217b, EmptySet.f60175b, (C21177j) null);
        C24312z q = lVar.mo53412q();
        C24362h.m61210e(q, "mockSerializableClass.defaultType");
        this.f60402d = q;
        this.f60403e = hVar.mo59019d(new JvmBuiltInsCustomizer$cloneableType$2(this, hVar));
        this.f60404f = hVar.mo59017b();
        this.f60405g = hVar.mo59019d(new JvmBuiltInsCustomizer$notConsideredDeprecation$2(this));
    }

    /* renamed from: a */
    public final boolean mo53183a(DeserializedClassDescriptor deserializedClassDescriptor, C23734h hVar) {
        C24362h.m61211f(deserializedClassDescriptor, "classDescriptor");
        LazyJavaClassDescriptor f = mo59408f(deserializedClassDescriptor);
        if (f == null || !hVar.getAnnotations().mo53070b1(C21057d.f52860a)) {
            return true;
        }
        if (!mo59409g().f60396b) {
            return false;
        }
        String z = C17885a.m44474z(hVar, 3);
        LazyJavaClassMemberScope N0 = f.mo53406Z();
        C25069e name = hVar.getName();
        C24362h.m61210e(name, "functionDescriptor.name");
        Collection<C23903e> b = N0.mo53531b(name, NoLookupLocation.FROM_BUILTINS);
        if (!(b instanceof Collection) || !b.isEmpty()) {
            for (C23903e z2 : b) {
                if (C24362h.m61206a(C17885a.m44474z(z2, 3), z)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final Collection mo53176b(DeserializedClassDescriptor deserializedClassDescriptor) {
        C24362h.m61211f(deserializedClassDescriptor, "classDescriptor");
        if (!mo59409g().f60396b) {
            return EmptySet.f60175b;
        }
        LazyJavaClassDescriptor f = mo59408f(deserializedClassDescriptor);
        if (f == null) {
            return EmptySet.f60175b;
        }
        return f.mo53406Z().mo53530a();
    }

    /* renamed from: c */
    public final Collection mo53177c(DeserializedClassDescriptor deserializedClassDescriptor) {
        C24362h.m61211f(deserializedClassDescriptor, "classDescriptor");
        C25067d h = DescriptorUtilsKt.m60287h(deserializedClassDescriptor);
        LinkedHashSet linkedHashSet = C25300g.f63598a;
        boolean z = false;
        if (C25300g.m63529a(h)) {
            C24312z zVar = (C24312z) C19958a.m47435j(this.f60403e, f60398h[1]);
            C24362h.m61210e(zVar, "cloneableType");
            return C17875h.m44281E(zVar, this.f60402d);
        }
        if (C25300g.m63529a(h)) {
            z = true;
        } else {
            String str = C25295c.f63582a;
            C25065b g = C25295c.m63526g(h);
            if (g != null) {
                try {
                    z = Serializable.class.isAssignableFrom(Class.forName(g.mo61569b().mo61580b()));
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        if (z) {
            return C17875h.m44280D(this.f60402d);
        }
        return EmptyList.f60173b;
    }

    /* renamed from: d */
    public final Collection mo53178d(DeserializedClassDescriptor deserializedClassDescriptor) {
        boolean z;
        boolean z2;
        boolean z3;
        if (deserializedClassDescriptor.f61266l != ClassKind.CLASS || !mo59409g().f60396b) {
            return EmptyList.f60173b;
        }
        LazyJavaClassDescriptor f = mo59408f(deserializedClassDescriptor);
        if (f == null) {
            return EmptyList.f60173b;
        }
        C25432c G = C17875h.m44283G(this.f60400b, DescriptorUtilsKt.m60286g(f), C25294b.f63581f);
        if (G == null) {
            return EmptyList.f60173b;
        }
        TypeSubstitutor e = TypeSubstitutor.m60494e(C17884p.m44378r(G, f));
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) f.f60646s.f60657q.invoke()).iterator();
        while (true) {
            C25067d dVar = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C25430b bVar = (C25430b) next;
            boolean z4 = false;
            if (bVar.mo53429g().mo62739a().f63767b) {
                Collection<C25430b> k = G.mo53511k();
                C24362h.m61210e(k, "defaultKotlinVersion.constructors");
                if (!k.isEmpty()) {
                    Iterator<T> it2 = k.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C25430b bVar2 = (C25430b) it2.next();
                        C24362h.m61210e(bVar2, "it");
                        if (OverridingUtil.m60246j(bVar2, bVar.mo53408c(e)) == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                            z3 = true;
                            continue;
                        } else {
                            z3 = false;
                            continue;
                        }
                        if (z3) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    if (bVar.mo53442h().size() == 1) {
                        List<C25452k0> h = bVar.mo53442h();
                        C24362h.m61210e(h, "valueParameters");
                        C25437e o = ((C25452k0) C23825c.m58491C0(h)).getType().mo60411O0().mo53460o();
                        if (o != null) {
                            dVar = DescriptorUtilsKt.m60287h(o);
                        }
                        if (C24362h.m61206a(dVar, DescriptorUtilsKt.m60287h(deserializedClassDescriptor))) {
                            z2 = true;
                            if (!z2 && !C23867c.m58673D(bVar) && !C25300g.f63602e.contains(C17875h.m44291R(f, C17885a.m44474z(bVar, 3)))) {
                                z4 = true;
                            }
                        }
                    }
                    z2 = false;
                    z4 = true;
                }
            }
            if (z4) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C21136j.m49436X(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C25430b bVar3 = (C25430b) it3.next();
            C23900c.C23901a<? extends C23900c> u = bVar3.mo53474u();
            u.mo59431j(deserializedClassDescriptor);
            u.mo59429h(deserializedClassDescriptor.mo53412q());
            u.mo59434m();
            u.mo59432k(e.mo60248g());
            if (!C25300g.f63603f.contains(C17875h.m44291R(f, C17885a.m44474z(bVar3, 3)))) {
                u.mo59430i((C20989e) C19958a.m47435j(this.f60405g, f60398h[2]));
            }
            Object build = u.build();
            if (build != null) {
                arrayList2.add((C25430b) build);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            }
        }
        return arrayList2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02ba, code lost:
        if (r6 != 3) goto L_0x02e7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01a6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0253 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0244  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection mo53179e(ug0.C25069e r14, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r15) {
        /*
            r13 = this;
            java.lang.String r0 = "name"
            mf0.C24362h.m61211f(r14, r0)
            java.lang.String r0 = "classDescriptor"
            mf0.C24362h.m61211f(r15, r0)
            ug0.e r0 = yf0.C25293a.f63580e
            boolean r0 = mf0.C24362h.m61206a(r14, r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00aa
            ug0.e r0 = kotlin.reflect.jvm.internal.impl.builtins.C23867c.f60309e
            ug0.d r0 = kotlin.reflect.jvm.internal.impl.builtins.C23872e.C23873a.f60369g
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.C23867c.m58683c(r15, r0)
            if (r0 != 0) goto L_0x0027
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0 = kotlin.reflect.jvm.internal.impl.builtins.C23867c.m58684s(r15)
            if (r0 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r0 = 0
            goto L_0x0028
        L_0x0027:
            r0 = 1
        L_0x0028:
            if (r0 == 0) goto L_0x00aa
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r15.f61260f
            java.util.List r0 = r0.mo59664a0()
            java.lang.String r3 = "classDescriptor.classProto.functionList"
            mf0.C24362h.m61210e(r0, r3)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x003c
            goto L_0x0061
        L_0x003c:
            java.util.Iterator r0 = r0.iterator()
        L_0x0040:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0061
            java.lang.Object r3 = r0.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function) r3
            hh0.i r4 = r15.f61267m
            sg0.c r4 = r4.f59332b
            int r3 = r3.mo59727I()
            ug0.e r3 = p584jl.C17885a.m44427X(r4, r3)
            ug0.e r4 = yf0.C25293a.f63580e
            boolean r3 = mf0.C24362h.m61206a(r3, r4)
            if (r3 == 0) goto L_0x0040
            r1 = 1
        L_0x0061:
            if (r1 == 0) goto L_0x0066
            kotlin.collections.EmptyList r14 = kotlin.collections.EmptyList.f60173b
            return r14
        L_0x0066:
            kh0.e r0 = r13.f60403e
            sf0.j<java.lang.Object>[] r1 = f60398h
            r1 = r1[r2]
            java.lang.Object r0 = p845um.C19958a.m47435j(r0, r1)
            lh0.z r0 = (lh0.C24312z) r0
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r0 = r0.mo59564o()
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r1 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_BUILTINS
            java.util.Collection r14 = r0.mo53531b(r14, r1)
            java.lang.Object r14 = kotlin.collections.C23825c.m58490B0(r14)
            kotlin.reflect.jvm.internal.impl.descriptors.e r14 = (kotlin.reflect.jvm.internal.impl.descriptors.C23903e) r14
            kotlin.reflect.jvm.internal.impl.descriptors.c$a r14 = r14.mo53474u()
            r14.mo59431j(r15)
            zf0.m$h r0 = zf0.C25455m.f63744e
            r14.mo59436o(r0)
            lh0.z r0 = r15.mo53412q()
            r14.mo59429h(r0)
            zf0.c0 r15 = r15.mo53404M0()
            r14.mo59425d(r15)
            kotlin.reflect.jvm.internal.impl.descriptors.c r14 = r14.build()
            mf0.C24362h.m61208c(r14)
            kotlin.reflect.jvm.internal.impl.descriptors.e r14 = (kotlin.reflect.jvm.internal.impl.descriptors.C23903e) r14
            java.util.List r14 = p583jk.C17875h.m44280D(r14)
            return r14
        L_0x00aa:
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns$a r0 = r13.mo59409g()
            boolean r0 = r0.f60396b
            if (r0 != 0) goto L_0x00b5
            kotlin.collections.EmptyList r14 = kotlin.collections.EmptyList.f60173b
            return r14
        L_0x00b5:
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getFunctions$2 r0 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getFunctions$2
            r0.<init>(r14)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r14 = r13.mo59408f(r15)
            r3 = 3
            r4 = 0
            r5 = 2
            if (r14 != 0) goto L_0x00c7
            kotlin.collections.EmptyList r14 = kotlin.collections.EmptyList.f60173b
            goto L_0x024a
        L_0x00c7:
            jk.h r6 = r13.f60400b
            ug0.c r7 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m60286g(r14)
            yf0.b r8 = yf0.C25294b.f63581f
            r6.getClass()
            java.lang.String r9 = "builtIns"
            mf0.C24362h.m61211f(r8, r9)
            zf0.c r6 = p583jk.C17875h.m44283G(r6, r7, r8)
            if (r6 != 0) goto L_0x00e0
            kotlin.collections.EmptySet r6 = kotlin.collections.EmptySet.f60175b
            goto L_0x0103
        L_0x00e0:
            java.lang.String r7 = yf0.C25295c.f63582a
            ug0.d r7 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m60287h(r6)
            java.util.HashMap<ug0.d, ug0.c> r9 = yf0.C25295c.f63592k
            java.lang.Object r7 = r9.get(r7)
            ug0.c r7 = (ug0.C25066c) r7
            if (r7 != 0) goto L_0x00f5
            java.util.Set r6 = p583jk.C17884p.m44348S(r6)
            goto L_0x0103
        L_0x00f5:
            zf0.c[] r9 = new zf0.C25432c[r5]
            r9[r1] = r6
            zf0.c r6 = r8.mo59387j(r7)
            r9[r2] = r6
            java.util.List r6 = p583jk.C17875h.m44281E(r9)
        L_0x0103:
            java.lang.String r7 = "<this>"
            mf0.C24362h.m61211f(r6, r7)
            boolean r7 = r6 instanceof java.util.List
            if (r7 == 0) goto L_0x0121
            r7 = r6
            java.util.List r7 = (java.util.List) r7
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x0116
            goto L_0x012b
        L_0x0116:
            int r8 = r7.size()
            int r8 = r8 + -1
            java.lang.Object r7 = r7.get(r8)
            goto L_0x013d
        L_0x0121:
            java.util.Iterator r7 = r6.iterator()
            boolean r8 = r7.hasNext()
            if (r8 != 0) goto L_0x012d
        L_0x012b:
            r7 = r4
            goto L_0x013d
        L_0x012d:
            java.lang.Object r8 = r7.next()
        L_0x0131:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x013c
            java.lang.Object r8 = r7.next()
            goto L_0x0131
        L_0x013c:
            r7 = r8
        L_0x013d:
            zf0.c r7 = (zf0.C25432c) r7
            if (r7 != 0) goto L_0x0145
            kotlin.collections.EmptyList r14 = kotlin.collections.EmptyList.f60173b
            goto L_0x024a
        L_0x0145:
            int r8 = rh0.C24823d.f62765d
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = cf0.C21136j.m49436X(r6, r9)
            r8.<init>(r9)
            java.util.Iterator r6 = r6.iterator()
        L_0x0156:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x016a
            java.lang.Object r9 = r6.next()
            zf0.c r9 = (zf0.C25432c) r9
            ug0.c r9 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m60286g(r9)
            r8.add(r9)
            goto L_0x0156
        L_0x016a:
            rh0.d r6 = new rh0.d
            r6.<init>()
            r6.addAll(r8)
            jk.h r8 = r13.f60400b
            r8.getClass()
            boolean r8 = p583jk.C17875h.m44277A(r15)
            kh0.a<ug0.c, zf0.c> r9 = r13.f60404f
            ug0.c r10 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m60286g(r14)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getAdditionalFunctions$fakeJavaClassDescriptor$1 r11 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getAdditionalFunctions$fakeJavaClassDescriptor$1
            r11.<init>(r14, r7)
            kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$b r9 = (kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.C24138b) r9
            java.lang.Object r14 = r9.mo60222d(r10, r11)
            zf0.c r14 = (zf0.C25432c) r14
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r14 = r14.mo53406Z()
            java.lang.String r7 = "fakeJavaClassDescriptor.unsubstitutedMemberScope"
            mf0.C24362h.m61210e(r14, r7)
            java.lang.Object r14 = r0.invoke(r14)
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x01a6:
            boolean r7 = r14.hasNext()
            if (r7 == 0) goto L_0x0249
            java.lang.Object r7 = r14.next()
            r9 = r7
            kotlin.reflect.jvm.internal.impl.descriptors.e r9 = (kotlin.reflect.jvm.internal.impl.descriptors.C23903e) r9
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r10 = r9.mo53433p()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r11 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION
            if (r10 == r11) goto L_0x01bd
            goto L_0x0241
        L_0x01bd:
            zf0.n r10 = r9.mo53429g()
            zf0.n0 r10 = r10.mo62739a()
            boolean r10 = r10.f63767b
            if (r10 != 0) goto L_0x01cb
            goto L_0x0241
        L_0x01cb:
            boolean r10 = kotlin.reflect.jvm.internal.impl.builtins.C23867c.m58673D(r9)
            if (r10 == 0) goto L_0x01d3
            goto L_0x0241
        L_0x01d3:
            java.util.Collection r10 = r9.mo53440d()
            java.lang.String r11 = "analogueMember.overriddenDescriptors"
            mf0.C24362h.m61210e(r10, r11)
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x01e3
            goto L_0x0208
        L_0x01e3:
            java.util.Iterator r10 = r10.iterator()
        L_0x01e7:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0208
            java.lang.Object r11 = r10.next()
            kotlin.reflect.jvm.internal.impl.descriptors.c r11 = (kotlin.reflect.jvm.internal.impl.descriptors.C23900c) r11
            zf0.g r11 = r11.mo53399b()
            java.lang.String r12 = "it.containingDeclaration"
            mf0.C24362h.m61210e(r11, r12)
            ug0.c r11 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m60286g(r11)
            boolean r11 = r6.contains(r11)
            if (r11 == 0) goto L_0x01e7
            r10 = 1
            goto L_0x0209
        L_0x0208:
            r10 = 0
        L_0x0209:
            if (r10 == 0) goto L_0x020c
            goto L_0x0241
        L_0x020c:
            zf0.g r10 = r9.mo53399b()
            zf0.c r10 = (zf0.C25432c) r10
            java.lang.String r11 = p584jl.C17885a.m44474z(r9, r3)
            java.util.LinkedHashSet r12 = yf0.C25300g.f63601d
            java.lang.String r10 = p583jk.C17875h.m44291R(r10, r11)
            boolean r10 = r12.contains(r10)
            r10 = r10 ^ r8
            if (r10 == 0) goto L_0x0225
            r9 = 1
            goto L_0x023d
        L_0x0225:
            java.util.List r9 = p583jk.C17875h.m44280D(r9)
            lf.b r10 = p626lf.C18201b.f46459h
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$isMutabilityViolation$2 r11 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$isMutabilityViolation$2
            r11.<init>(r13)
            java.lang.Boolean r9 = rh0.C24814b.m62346d(r9, r10, r11)
            java.lang.String r10 = "private fun SimpleFuncti…scriptor)\n        }\n    }"
            mf0.C24362h.m61210e(r9, r10)
            boolean r9 = r9.booleanValue()
        L_0x023d:
            if (r9 != 0) goto L_0x0241
            r9 = 1
            goto L_0x0242
        L_0x0241:
            r9 = 0
        L_0x0242:
            if (r9 == 0) goto L_0x01a6
            r0.add(r7)
            goto L_0x01a6
        L_0x0249:
            r14 = r0
        L_0x024a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x0253:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto L_0x0301
            java.lang.Object r6 = r14.next()
            kotlin.reflect.jvm.internal.impl.descriptors.e r6 = (kotlin.reflect.jvm.internal.impl.descriptors.C23903e) r6
            zf0.g r7 = r6.mo53399b()
            zf0.c r7 = (zf0.C25432c) r7
            lh0.j0 r7 = p583jk.C17884p.m44378r(r7, r15)
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r7 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.m60494e(r7)
            kotlin.reflect.jvm.internal.impl.descriptors.c r7 = r6.mo53408c(r7)
            if (r7 == 0) goto L_0x02f9
            kotlin.reflect.jvm.internal.impl.descriptors.e r7 = (kotlin.reflect.jvm.internal.impl.descriptors.C23903e) r7
            kotlin.reflect.jvm.internal.impl.descriptors.c$a r7 = r7.mo53474u()
            r7.mo59431j(r15)
            zf0.c0 r8 = r15.mo53404M0()
            r7.mo59425d(r8)
            r7.mo59434m()
            zf0.g r8 = r6.mo53399b()
            zf0.c r8 = (zf0.C25432c) r8
            java.lang.String r6 = p584jl.C17885a.m44474z(r6, r3)
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            java.util.List r8 = p583jk.C17875h.m44280D(r8)
            yf0.e r10 = new yf0.e
            r10.<init>(r13)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.b r11 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.b
            r11.<init>(r6, r9)
            java.lang.Object r6 = rh0.C24814b.m62344b(r8, r10, r11)
            java.lang.String r8 = "private fun FunctionDesc…ERED\n            })\n    }"
            mf0.C24362h.m61210e(r6, r8)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus r6 = (kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.JDKMemberStatus) r6
            int[] r8 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.C23879a.f60406a
            int r6 = r6.ordinal()
            r6 = r8[r6]
            if (r6 == r2) goto L_0x02cd
            if (r6 == r5) goto L_0x02bd
            if (r6 == r3) goto L_0x02e2
            goto L_0x02e7
        L_0x02bd:
            kh0.e r6 = r13.f60405g
            sf0.j<java.lang.Object>[] r8 = f60398h
            r8 = r8[r5]
            java.lang.Object r6 = p845um.C19958a.m47435j(r6, r8)
            ag0.e r6 = (ag0.C20989e) r6
            r7.mo59430i(r6)
            goto L_0x02e7
        L_0x02cd:
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r6 = r15.mo53436s()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r8 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
            if (r6 != r8) goto L_0x02df
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r6 = r15.mo53513p()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r8 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS
            if (r6 == r8) goto L_0x02df
            r6 = 1
            goto L_0x02e0
        L_0x02df:
            r6 = 0
        L_0x02e0:
            if (r6 == 0) goto L_0x02e4
        L_0x02e2:
            r6 = r4
            goto L_0x02f0
        L_0x02e4:
            r7.mo59426e()
        L_0x02e7:
            kotlin.reflect.jvm.internal.impl.descriptors.c r6 = r7.build()
            mf0.C24362h.m61208c(r6)
            kotlin.reflect.jvm.internal.impl.descriptors.e r6 = (kotlin.reflect.jvm.internal.impl.descriptors.C23903e) r6
        L_0x02f0:
            if (r6 != 0) goto L_0x02f4
            goto L_0x0253
        L_0x02f4:
            r0.add(r6)
            goto L_0x0253
        L_0x02f9:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            java.lang.String r15 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor"
            r14.<init>(r15)
            throw r14
        L_0x0301:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer.mo53179e(ug0.e, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor):java.util.Collection");
    }

    /* renamed from: f */
    public final LazyJavaClassDescriptor mo59408f(C25432c cVar) {
        if (cVar != null) {
            C25069e eVar = C23867c.f60309e;
            if (C23867c.m58683c(cVar, C23872e.C23873a.f60361a) || !C23867c.m58680K(cVar)) {
                return null;
            }
            C25067d h = DescriptorUtilsKt.m60287h(cVar);
            if (!h.mo61596f()) {
                return null;
            }
            String str = C25295c.f63582a;
            C25065b g = C25295c.m63526g(h);
            if (g == null) {
                return null;
            }
            C25066c b = g.mo61569b();
            C24362h.m61210e(b, "JavaToKotlinClassMap.map…leFqName() ?: return null");
            C25432c v0 = C21100e.m49370v0(mo59409g().f60395a, b, NoLookupLocation.FROM_BUILTINS);
            if (v0 instanceof LazyJavaClassDescriptor) {
                return (LazyJavaClassDescriptor) v0;
            }
            return null;
        }
        C23867c.m58681a(108);
        throw null;
    }

    /* renamed from: g */
    public final JvmBuiltIns.C23876a mo59409g() {
        return (JvmBuiltIns.C23876a) C19958a.m47435j(this.f60401c, f60398h[0]);
    }
}
