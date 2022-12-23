package kotlin.reflect.jvm.internal.impl.load.kotlin;

import cf0.C21136j;
import ch0.C21203b;
import com.google.android.play.core.assetpacks.C14256d1;
import com.unity3d.ads.metadata.MediationMetaData;
import eg0.C23291b;
import eg0.C23295e;
import hh0.C23484a;
import hh0.C23509r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kh0.C23787c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.C24079d;
import kotlin.reflect.jvm.internal.impl.protobuf.C24090h;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.text.C24179b;
import lh0.C24307v;
import mf0.C24362h;
import p584jl.C17885a;
import qg0.C24739b;
import qg0.C24741d;
import qg0.C24744e;
import qg0.C24746g;
import qg0.C24753j;
import qg0.C24757k;
import qg0.C24762m;
import qg0.C24763n;
import sg0.C24872b;
import sg0.C24876c;
import sg0.C24879e;
import tg0.C24983b;
import tg0.C24985d;
import tg0.C24988e;
import tg0.C24991g;
import ug0.C25065b;
import ug0.C25066c;
import ug0.C25069e;
import uh0.C25081h;
import vf0.C25090b;
import wf0.C25144h;
import zf0.C25435d0;
import zg0.C25495d;
import zg0.C25498g;
import zg0.C25504l;
import zg0.C25511p;
import zg0.C25513r;
import zg0.C25515t;
import zg0.C25516u;
import zg0.C25517v;
import zg0.C25518w;

public abstract class AbstractBinaryClassAnnotationAndConstantLoader<A, C> implements C23484a<A, C> {

    /* renamed from: a */
    public final C24753j f60751a;

    /* renamed from: b */
    public final C23787c<C24757k, C23976a<A, C>> f60752b;

    public enum PropertyRelatedElement {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$a */
    public static final class C23976a<A, C> {

        /* renamed from: a */
        public final Map<C24763n, List<A>> f60753a;

        /* renamed from: b */
        public final Map<C24763n, C> f60754b;

        public C23976a(HashMap hashMap, HashMap hashMap2) {
            this.f60753a = hashMap;
            this.f60754b = hashMap2;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$b */
    public /* synthetic */ class C23977b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60755a;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 1;
            iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 2;
            iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 3;
            f60755a = iArr;
        }
    }

    public AbstractBinaryClassAnnotationAndConstantLoader(LockBasedStorageManager lockBasedStorageManager, C23295e eVar) {
        this.f60751a = eVar;
        this.f60752b = lockBasedStorageManager.mo59020e(new AbstractBinaryClassAnnotationAndConstantLoader$storage$1(this));
    }

    /* renamed from: k */
    public static final C24741d m59174k(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, C25065b bVar, C23291b bVar2, List list) {
        abstractBinaryClassAnnotationAndConstantLoader.getClass();
        if (C25090b.f63297a.contains(bVar)) {
            return null;
        }
        return abstractBinaryClassAnnotationAndConstantLoader.mo59581r(bVar, bVar2, list);
    }

    /* renamed from: m */
    public static /* synthetic */ List m59175m(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, C23509r rVar, C24763n nVar, boolean z, Boolean bool, boolean z2, int i) {
        boolean z3 = (i & 4) != 0 ? false : z;
        if ((i & 16) != 0) {
            bool = null;
        }
        return abstractBinaryClassAnnotationAndConstantLoader.mo59579l(rVar, nVar, z3, false, bool, (i & 32) != 0 ? false : z2);
    }

    /* renamed from: n */
    public static C24763n m59176n(C24090h hVar, C24876c cVar, C24879e eVar, AnnotatedCallableKind annotatedCallableKind, boolean z) {
        C24763n nVar;
        if (hVar instanceof ProtoBuf$Constructor) {
            C24079d dVar = C24991g.f63134a;
            C24985d.C24987b a = C24991g.m62698a((ProtoBuf$Constructor) hVar, cVar, eVar);
            if (a == null) {
                return null;
            }
            return C24763n.C24764a.m62299a(a);
        } else if (hVar instanceof ProtoBuf$Function) {
            C24079d dVar2 = C24991g.f63134a;
            C24985d.C24987b c = C24991g.m62700c((ProtoBuf$Function) hVar, cVar, eVar);
            if (c == null) {
                return null;
            }
            return C24763n.C24764a.m62299a(c);
        } else if (!(hVar instanceof ProtoBuf$Property)) {
            return null;
        } else {
            GeneratedMessageLite.C24069e<ProtoBuf$Property, JvmProtoBuf.JvmPropertySignature> eVar2 = JvmProtoBuf.f61002d;
            C24362h.m61210e(eVar2, "propertySignature");
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) C17885a.m44423T((GeneratedMessageLite.ExtendableMessage) hVar, eVar2);
            if (jvmPropertySignature == null) {
                return null;
            }
            int i = C23977b.f60755a[annotatedCallableKind.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return m59177o((ProtoBuf$Property) hVar, cVar, eVar, true, true, z);
                } else if (!jvmPropertySignature.mo59948t()) {
                    return null;
                } else {
                    JvmProtoBuf.JvmMethodSignature o = jvmPropertySignature.mo59943o();
                    C24362h.m61210e(o, "signature.setter");
                    C24362h.m61211f(cVar, "nameResolver");
                    String string = cVar.getString(o.mo59934i());
                    String string2 = cVar.getString(o.mo59933h());
                    C24362h.m61211f(string, "name");
                    C24362h.m61211f(string2, "desc");
                    nVar = new C24763n(C24362h.m61216k(string2, string));
                }
            } else if (!jvmPropertySignature.mo59947s()) {
                return null;
            } else {
                JvmProtoBuf.JvmMethodSignature m = jvmPropertySignature.mo59942m();
                C24362h.m61210e(m, "signature.getter");
                C24362h.m61211f(cVar, "nameResolver");
                String string3 = cVar.getString(m.mo59934i());
                String string4 = cVar.getString(m.mo59933h());
                C24362h.m61211f(string3, "name");
                C24362h.m61211f(string4, "desc");
                nVar = new C24763n(C24362h.m61216k(string4, string3));
            }
            return nVar;
        }
    }

    /* renamed from: o */
    public static C24763n m59177o(ProtoBuf$Property protoBuf$Property, C24876c cVar, C24879e eVar, boolean z, boolean z2, boolean z3) {
        GeneratedMessageLite.C24069e<ProtoBuf$Property, JvmProtoBuf.JvmPropertySignature> eVar2 = JvmProtoBuf.f61002d;
        C24362h.m61210e(eVar2, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) C17885a.m44423T(protoBuf$Property, eVar2);
        if (jvmPropertySignature == null) {
            return null;
        }
        if (z) {
            C24985d.C24986a b = C24991g.m62699b(protoBuf$Property, cVar, eVar, z3);
            if (b == null) {
                return null;
            }
            return C24763n.C24764a.m62299a(b);
        } else if (!z2 || !jvmPropertySignature.mo59949u()) {
            return null;
        } else {
            JvmProtoBuf.JvmMethodSignature p = jvmPropertySignature.mo59944p();
            C24362h.m61210e(p, "signature.syntheticMethod");
            C24362h.m61211f(cVar, "nameResolver");
            String string = cVar.getString(p.mo59934i());
            String string2 = cVar.getString(p.mo59933h());
            C24362h.m61211f(string, "name");
            C24362h.m61211f(string2, "desc");
            return new C24763n(C24362h.m61216k(string2, string));
        }
    }

    /* renamed from: p */
    public static /* synthetic */ C24763n m59178p(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, ProtoBuf$Property protoBuf$Property, C24876c cVar, C24879e eVar, boolean z, boolean z2, int i) {
        boolean z3 = (i & 8) != 0 ? false : z;
        boolean z4 = (i & 16) != 0 ? false : z2;
        boolean z5 = (i & 32) != 0;
        abstractBinaryClassAnnotationAndConstantLoader.getClass();
        return m59177o(protoBuf$Property, cVar, eVar, z3, z4, z5);
    }

    /* renamed from: t */
    public static C24757k m59179t(C23509r.C23510a aVar) {
        C24762m mVar;
        C25435d0 d0Var = aVar.f59354c;
        if (d0Var instanceof C24762m) {
            mVar = (C24762m) d0Var;
        } else {
            mVar = null;
        }
        if (mVar == null) {
            return null;
        }
        return mVar.f62662b;
    }

    /* renamed from: a */
    public final List<A> mo58589a(C23509r rVar, C24090h hVar, AnnotatedCallableKind annotatedCallableKind) {
        C24362h.m61211f(hVar, "proto");
        C24362h.m61211f(annotatedCallableKind, "kind");
        if (annotatedCallableKind == AnnotatedCallableKind.PROPERTY) {
            return mo59582s(rVar, (ProtoBuf$Property) hVar, PropertyRelatedElement.PROPERTY);
        }
        C24763n n = m59176n(hVar, rVar.f59352a, rVar.f59353b, annotatedCallableKind, false);
        if (n == null) {
            return EmptyList.f60173b;
        }
        return m59175m(this, rVar, n, false, (Boolean) null, false, 60);
    }

    /* renamed from: b */
    public final ArrayList mo58590b(ProtoBuf$Type protoBuf$Type, C24876c cVar) {
        C24362h.m61211f(protoBuf$Type, "proto");
        C24362h.m61211f(cVar, "nameResolver");
        Object g = protoBuf$Type.mo59990g(JvmProtoBuf.f61004f);
        C24362h.m61210e(g, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<ProtoBuf$Annotation> iterable = (Iterable) g;
        ArrayList arrayList = new ArrayList(C21136j.m49436X(iterable, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : iterable) {
            C24362h.m61210e(protoBuf$Annotation, "it");
            arrayList.add(((C24744e) this).f62641e.mo58599a(protoBuf$Annotation, cVar));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final ArrayList mo58591c(C23509r.C23510a aVar) {
        C24362h.m61211f(aVar, "container");
        C24757k t = m59179t(aVar);
        if (t != null) {
            ArrayList arrayList = new ArrayList(1);
            t.mo58419b(new C24739b(this, arrayList));
            return arrayList;
        }
        throw new IllegalStateException(C24362h.m61216k(aVar.mo58623a(), "Class for loading annotations is not found: ").toString());
    }

    /* renamed from: d */
    public final C mo58592d(C23509r rVar, ProtoBuf$Property protoBuf$Property, C24307v vVar) {
        C c;
        C vVar2;
        C24362h.m61211f(protoBuf$Property, "proto");
        C24757k q = mo59580q(rVar, true, true, C24872b.f62869A.mo61346c(protoBuf$Property.mo59769F()), C24991g.m62701d(protoBuf$Property));
        if (q == null) {
            if (rVar instanceof C23509r.C23510a) {
                q = m59179t((C23509r.C23510a) rVar);
            } else {
                q = null;
            }
        }
        if (q == null) {
            return null;
        }
        C24988e eVar = q.mo58420c().f60765b;
        C24988e eVar2 = C23978a.f60761e;
        eVar.getClass();
        C24362h.m61211f(eVar2, MediationMetaData.KEY_VERSION);
        C24763n n = m59176n(protoBuf$Property, rVar.f59352a, rVar.f59353b, AnnotatedCallableKind.PROPERTY, eVar.mo61341a(eVar2.f62865b, eVar2.f62866c, eVar2.f62867d));
        if (n == null || (c = ((C23976a) ((LockBasedStorageManager.C24148k) this.f60752b).invoke(q)).f60754b.get(n)) == null) {
            return null;
        }
        if (!C25144h.m63106a(vVar)) {
            return c;
        }
        C c2 = (C25498g) c;
        if (c2 instanceof C25495d) {
            vVar2 = new C25515t(((Number) ((C25495d) c2).f63774a).byteValue());
        } else if (c2 instanceof C25513r) {
            vVar2 = new C25518w(((Number) ((C25513r) c2).f63774a).shortValue());
        } else if (c2 instanceof C25504l) {
            vVar2 = new C25516u(((Number) ((C25504l) c2).f63774a).intValue());
        } else if (!(c2 instanceof C25511p)) {
            return c2;
        } else {
            vVar2 = new C25517v(((Number) ((C25511p) c2).f63774a).longValue());
        }
        return vVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r9 != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r9 != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
        if (r9.f59359h != false) goto L_0x0065;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<A> mo58593e(hh0.C23509r r8, kotlin.reflect.jvm.internal.impl.protobuf.C24090h r9, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r10, int r11, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r12) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            mf0.C24362h.m61211f(r8, r0)
            java.lang.String r0 = "callableProto"
            mf0.C24362h.m61211f(r9, r0)
            java.lang.String r0 = "kind"
            mf0.C24362h.m61211f(r10, r0)
            java.lang.String r0 = "proto"
            mf0.C24362h.m61211f(r12, r0)
            sg0.c r12 = r8.f59352a
            sg0.e r0 = r8.f59353b
            r1 = 0
            qg0.n r10 = m59176n(r9, r12, r0, r10, r1)
            if (r10 == 0) goto L_0x009e
            boolean r12 = r9 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function
            r0 = 1
            if (r12 == 0) goto L_0x0039
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r9 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function) r9
            boolean r12 = r9.mo59740V()
            if (r12 != 0) goto L_0x0035
            boolean r9 = r9.mo59741W()
            if (r9 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r9 = 0
            goto L_0x0036
        L_0x0035:
            r9 = 1
        L_0x0036:
            if (r9 == 0) goto L_0x0066
            goto L_0x0065
        L_0x0039:
            boolean r12 = r9 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property
            if (r12 == 0) goto L_0x0052
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r9 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property) r9
            boolean r12 = r9.mo59784U()
            if (r12 != 0) goto L_0x004e
            boolean r9 = r9.mo59785V()
            if (r9 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r9 = 0
            goto L_0x004f
        L_0x004e:
            r9 = 1
        L_0x004f:
            if (r9 == 0) goto L_0x0066
            goto L_0x0065
        L_0x0052:
            boolean r12 = r9 instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor
            if (r12 == 0) goto L_0x008e
            r9 = r8
            hh0.r$a r9 = (hh0.C23509r.C23510a) r9
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r12 = r9.f59358g
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind r2 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class.Kind.ENUM_CLASS
            if (r12 != r2) goto L_0x0061
            r1 = 2
            goto L_0x0066
        L_0x0061:
            boolean r9 = r9.f59359h
            if (r9 == 0) goto L_0x0066
        L_0x0065:
            r1 = 1
        L_0x0066:
            int r11 = r11 + r1
            qg0.n r2 = new qg0.n
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.f62663a
            r9.append(r10)
            r10 = 64
            r9.append(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r2.<init>(r9)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 60
            r0 = r7
            r1 = r8
            java.util.List r8 = m59175m(r0, r1, r2, r3, r4, r5, r6)
            return r8
        L_0x008e:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.Class r9 = r9.getClass()
            java.lang.String r10 = "Unsupported message: "
            java.lang.String r9 = mf0.C24362h.m61216k(r9, r10)
            r8.<init>(r9)
            throw r8
        L_0x009e:
            kotlin.collections.EmptyList r8 = kotlin.collections.EmptyList.f60173b
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.mo58593e(hh0.r, kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind, int, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter):java.util.List");
    }

    /* renamed from: f */
    public final List<A> mo58594f(C23509r rVar, ProtoBuf$Property protoBuf$Property) {
        C24362h.m61211f(protoBuf$Property, "proto");
        return mo59582s(rVar, protoBuf$Property, PropertyRelatedElement.BACKING_FIELD);
    }

    /* renamed from: g */
    public final ArrayList mo58595g(ProtoBuf$TypeParameter protoBuf$TypeParameter, C24876c cVar) {
        C24362h.m61211f(protoBuf$TypeParameter, "proto");
        C24362h.m61211f(cVar, "nameResolver");
        Object g = protoBuf$TypeParameter.mo59990g(JvmProtoBuf.f61006h);
        C24362h.m61210e(g, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<ProtoBuf$Annotation> iterable = (Iterable) g;
        ArrayList arrayList = new ArrayList(C21136j.m49436X(iterable, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : iterable) {
            C24362h.m61210e(protoBuf$Annotation, "it");
            arrayList.add(((C24744e) this).f62641e.mo58599a(protoBuf$Annotation, cVar));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final List<A> mo58596h(C23509r rVar, ProtoBuf$Property protoBuf$Property) {
        C24362h.m61211f(protoBuf$Property, "proto");
        return mo59582s(rVar, protoBuf$Property, PropertyRelatedElement.DELEGATE_FIELD);
    }

    /* renamed from: i */
    public final List<A> mo58597i(C23509r rVar, C24090h hVar, AnnotatedCallableKind annotatedCallableKind) {
        C24362h.m61211f(hVar, "proto");
        C24362h.m61211f(annotatedCallableKind, "kind");
        C24763n n = m59176n(hVar, rVar.f59352a, rVar.f59353b, annotatedCallableKind, false);
        if (n == null) {
            return EmptyList.f60173b;
        }
        return m59175m(this, rVar, new C24763n(n.f62663a + '@' + 0), false, (Boolean) null, false, 60);
    }

    /* renamed from: j */
    public final List mo58598j(C23509r.C23510a aVar, ProtoBuf$EnumEntry protoBuf$EnumEntry) {
        C24362h.m61211f(aVar, "container");
        C24362h.m61211f(protoBuf$EnumEntry, "proto");
        String string = aVar.f59352a.getString(protoBuf$EnumEntry.mo59708s());
        String c = aVar.f59357f.mo61570c();
        C24362h.m61210e(c, "container as ProtoContai…Class).classId.asString()");
        String b = C24983b.m62685b(c);
        C24362h.m61211f(string, "name");
        C24362h.m61211f(b, "desc");
        return m59175m(this, aVar, new C24763n(string + '#' + b), false, (Boolean) null, false, 60);
    }

    /* renamed from: l */
    public final List<A> mo59579l(C23509r rVar, C24763n nVar, boolean z, boolean z2, Boolean bool, boolean z3) {
        C24757k q = mo59580q(rVar, z, z2, bool, z3);
        if (q == null) {
            if (rVar instanceof C23509r.C23510a) {
                q = m59179t((C23509r.C23510a) rVar);
            } else {
                q = null;
            }
        }
        if (q == null) {
            return EmptyList.f60173b;
        }
        List<A> list = ((C23976a) ((LockBasedStorageManager.C24148k) this.f60752b).invoke(q)).f60753a.get(nVar);
        if (list == null) {
            return EmptyList.f60173b;
        }
        return list;
    }

    /* renamed from: q */
    public final C24757k mo59580q(C23509r rVar, boolean z, boolean z2, Boolean bool, boolean z3) {
        C23509r.C23510a aVar;
        ProtoBuf$Class.Kind kind;
        C24746g gVar;
        C21203b bVar;
        if (z) {
            if (bool != null) {
                if (rVar instanceof C23509r.C23510a) {
                    C23509r.C23510a aVar2 = (C23509r.C23510a) rVar;
                    if (aVar2.f59358g == ProtoBuf$Class.Kind.INTERFACE) {
                        return C14256d1.m35484b(this.f60751a, aVar2.f59357f.mo61571d(C25069e.m62820i("DefaultImpls")));
                    }
                }
                if (bool.booleanValue() && (rVar instanceof C23509r.C23511b)) {
                    C25435d0 d0Var = rVar.f59354c;
                    if (d0Var instanceof C24746g) {
                        gVar = (C24746g) d0Var;
                    } else {
                        gVar = null;
                    }
                    if (gVar == null) {
                        bVar = null;
                    } else {
                        bVar = gVar.f62645c;
                    }
                    if (bVar != null) {
                        C24753j jVar = this.f60751a;
                        String d = bVar.mo53547d();
                        C24362h.m61210e(d, "facadeClassName.internalName");
                        return C14256d1.m35484b(jVar, C25065b.m62790l(new C25066c(C25081h.m62834E(d, '/', '.'))));
                    }
                }
            } else {
                throw new IllegalStateException(("isConst should not be null for property (container=" + rVar + ')').toString());
            }
        }
        if (z2 && (rVar instanceof C23509r.C23510a)) {
            C23509r.C23510a aVar3 = (C23509r.C23510a) rVar;
            if (aVar3.f59358g == ProtoBuf$Class.Kind.COMPANION_OBJECT && (aVar = aVar3.f59356e) != null && ((kind = aVar.f59358g) == ProtoBuf$Class.Kind.CLASS || kind == ProtoBuf$Class.Kind.ENUM_CLASS || (z3 && (kind == ProtoBuf$Class.Kind.INTERFACE || kind == ProtoBuf$Class.Kind.ANNOTATION_CLASS)))) {
                return m59179t(aVar);
            }
        }
        if (rVar instanceof C23509r.C23511b) {
            C25435d0 d0Var2 = rVar.f59354c;
            if (d0Var2 instanceof C24746g) {
                if (d0Var2 != null) {
                    C24746g gVar2 = (C24746g) d0Var2;
                    C24757k kVar = gVar2.f62646d;
                    if (kVar == null) {
                        return C14256d1.m35484b(this.f60751a, gVar2.mo61226d());
                    }
                    return kVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
            }
        }
        return null;
    }

    /* renamed from: r */
    public abstract C24741d mo59581r(C25065b bVar, C25435d0 d0Var, List list);

    /* renamed from: s */
    public final List<A> mo59582s(C23509r rVar, ProtoBuf$Property protoBuf$Property, PropertyRelatedElement propertyRelatedElement) {
        C23509r rVar2 = rVar;
        PropertyRelatedElement propertyRelatedElement2 = propertyRelatedElement;
        Boolean c = C24872b.f62869A.mo61346c(protoBuf$Property.mo59769F());
        C24362h.m61210e(c, "IS_CONST.get(proto.flags)");
        boolean booleanValue = c.booleanValue();
        boolean d = C24991g.m62701d(protoBuf$Property);
        if (propertyRelatedElement2 == PropertyRelatedElement.PROPERTY) {
            C24763n p = m59178p(this, protoBuf$Property, rVar2.f59352a, rVar2.f59353b, false, true, 40);
            if (p == null) {
                return EmptyList.f60173b;
            }
            return m59175m(this, rVar, p, true, Boolean.valueOf(booleanValue), d, 8);
        }
        C24763n p2 = m59178p(this, protoBuf$Property, rVar2.f59352a, rVar2.f59353b, true, false, 48);
        if (p2 == null) {
            return EmptyList.f60173b;
        }
        boolean z = false;
        boolean G = C24179b.m60559G(p2.f62663a, "$delegate", false);
        if (propertyRelatedElement2 == PropertyRelatedElement.DELEGATE_FIELD) {
            z = true;
        }
        if (G != z) {
            return EmptyList.f60173b;
        }
        return mo59579l(rVar, p2, true, true, Boolean.valueOf(booleanValue), d);
    }
}
