package tf0;

import ag0.C20984a;
import ag0.C20986c;
import ag0.C20989e;
import cf0.C21132f;
import cf0.C21136j;
import cf0.C21140n;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import eg0.C23291b;
import eg0.C23293d;
import eg0.C23297g;
import eg0.C23298h;
import fg0.C23358d;
import fg0.C23368m;
import hh0.C23494g;
import hh0.C23497i;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jh0.C23730d;
import kotlin.Pair;
import kotlin.collections.C23826d;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C23912a;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import lf0.C24240p;
import mf0.C24361g;
import mf0.C24362h;
import mf0.C24367l;
import p583jk.C17875h;
import qg0.C24762m;
import sf0.C24854a;
import sg0.C24871a;
import sg0.C24876c;
import sg0.C24879e;
import sg0.C24880f;
import ug0.C25065b;
import ug0.C25066c;
import ug0.C25067d;
import ug0.C25069e;
import uh0.C25081h;
import yf0.C25295c;
import zf0.C25432c;
import zf0.C25435d0;
import zf0.C25485t;
import zg0.C25498g;

/* renamed from: tf0.k */
public final class C24979k {

    /* renamed from: a */
    public static final C25066c f63116a = new C25066c("kotlin.jvm.JvmStatic");

    /* renamed from: tf0.k$a */
    public /* synthetic */ class C24980a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63117a;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            iArr[PrimitiveType.CHAR.ordinal()] = 2;
            iArr[PrimitiveType.BYTE.ordinal()] = 3;
            iArr[PrimitiveType.SHORT.ordinal()] = 4;
            iArr[PrimitiveType.INT.ordinal()] = 5;
            iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            iArr[PrimitiveType.LONG.ordinal()] = 7;
            iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            f63117a = iArr;
        }
    }

    /* renamed from: a */
    public static final KFunctionImpl m62674a(Object obj) {
        KFunctionImpl kFunctionImpl = obj instanceof KFunctionImpl ? (KFunctionImpl) obj : null;
        if (kFunctionImpl != null) {
            return kFunctionImpl;
        }
        FunctionReference functionReference = obj instanceof FunctionReference ? (FunctionReference) obj : null;
        C24854a compute = functionReference == null ? null : functionReference.compute();
        if (compute instanceof KFunctionImpl) {
            return (KFunctionImpl) compute;
        }
        return null;
    }

    /* renamed from: b */
    public static final ArrayList m62675b(C20984a aVar) {
        boolean z;
        List list;
        C23358d dVar;
        C24362h.m61211f(aVar, "<this>");
        C20989e<C20986c> annotations = aVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (C20986c cVar : annotations) {
            C25435d0 e = cVar.mo53065e();
            Annotation annotation = null;
            if (e instanceof C23291b) {
                annotation = ((C23291b) e).f59072b;
            } else if (e instanceof C23298h.C23299a) {
                C23368m mVar = ((C23298h.C23299a) e).f59082b;
                if (mVar instanceof C23358d) {
                    dVar = (C23358d) mVar;
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    annotation = dVar.f59139a;
                }
            } else {
                annotation = m62679f(cVar);
            }
            if (annotation != null) {
                arrayList.add(annotation);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C24362h.m61206a(C24361g.m61144N(C24361g.m61140J((Annotation) it.next())).getSimpleName(), "Container")) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Annotation annotation2 = (Annotation) it2.next();
            Class N = C24361g.m61144N(C24361g.m61140J(annotation2));
            if (!C24362h.m61206a(N.getSimpleName(), "Container") || N.getAnnotation(C24367l.class) == null) {
                list = C17875h.m44280D(annotation2);
            } else {
                Object invoke = N.getDeclaredMethod("value", new Class[0]).invoke(annotation2, new Object[0]);
                if (invoke != null) {
                    list = C21132f.m49428K0((Annotation[]) invoke);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                }
            }
            C21140n.m49439a0(list, arrayList2);
        }
        return arrayList2;
    }

    /* renamed from: c */
    public static final Object m62676c(Class cls) {
        if (!cls.isPrimitive()) {
            return null;
        }
        if (C24362h.m61206a(cls, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (C24362h.m61206a(cls, Character.TYPE)) {
            return 0;
        }
        if (C24362h.m61206a(cls, Byte.TYPE)) {
            return (byte) 0;
        }
        if (C24362h.m61206a(cls, Short.TYPE)) {
            return (short) 0;
        }
        if (C24362h.m61206a(cls, Integer.TYPE)) {
            return 0;
        }
        if (C24362h.m61206a(cls, Float.TYPE)) {
            return Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        }
        if (C24362h.m61206a(cls, Long.TYPE)) {
            return 0L;
        }
        if (C24362h.m61206a(cls, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (C24362h.m61206a(cls, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException(C24362h.m61216k(cls, "Unknown primitive: "));
    }

    /* renamed from: d */
    public static final C23894a m62677d(Class cls, GeneratedMessageLite.ExtendableMessage extendableMessage, C24876c cVar, C24879e eVar, C24871a aVar, C24240p pVar) {
        List<ProtoBuf$TypeParameter> P;
        GeneratedMessageLite.ExtendableMessage extendableMessage2 = extendableMessage;
        C24240p pVar2 = pVar;
        Class cls2 = cls;
        C24362h.m61211f(cls, "moduleAnchor");
        C24362h.m61211f(extendableMessage, "proto");
        C24362h.m61211f(cVar, "nameResolver");
        C24362h.m61211f(eVar, "typeTable");
        C24362h.m61211f(aVar, "metadataVersion");
        C24362h.m61211f(pVar2, "createDescriptor");
        C23297g a = C24972h.m62667a(cls);
        if (extendableMessage2 instanceof ProtoBuf$Function) {
            P = ((ProtoBuf$Function) extendableMessage2).mo59733O();
        } else if (extendableMessage2 instanceof ProtoBuf$Property) {
            P = ((ProtoBuf$Property) extendableMessage2).mo59779P();
        } else {
            throw new IllegalStateException(C24362h.m61216k(extendableMessage, "Unsupported message: ").toString());
        }
        List<ProtoBuf$TypeParameter> list = P;
        C23494g gVar = a.f59079a;
        C25485t tVar = gVar.f59312b;
        C24880f fVar = C24880f.f62915b;
        C24362h.m61210e(list, "typeParameters");
        return (C23894a) pVar2.invoke(new MemberDeserializer(new C23497i(gVar, cVar, tVar, eVar, fVar, aVar, (C23730d) null, (TypeDeserializer) null, list)), extendableMessage);
    }

    /* renamed from: e */
    public static final Class<?> m62678e(ClassLoader classLoader, C25065b bVar, int i) {
        boolean z;
        String str;
        String str2 = C25295c.f63582a;
        C25067d i2 = bVar.mo61569b().mo61589i();
        C24362h.m61210e(i2, "kotlinClassId.asSingleFqName().toUnsafe()");
        C25065b g = C25295c.m63526g(i2);
        if (g != null) {
            bVar = g;
        }
        String b = bVar.mo61574h().mo61580b();
        C24362h.m61210e(b, "javaClassId.packageFqName.asString()");
        String b2 = bVar.mo61576i().mo61580b();
        C24362h.m61210e(b2, "javaClassId.relativeClassName.asString()");
        if (C24362h.m61206a(b, "kotlin")) {
            switch (b2.hashCode()) {
                case -901856463:
                    if (b2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (b2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (b2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (b2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (b2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (b2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (b2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (b2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (b2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        String str3 = b + '.' + C25081h.m62834E(b2, '.', '$');
        if (i > 0) {
            StringBuilder sb = new StringBuilder();
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i == 0) {
                    str = "";
                } else if (i != 1) {
                    char charAt = "[".charAt(0);
                    char[] cArr = new char[i];
                    for (int i3 = 0; i3 < i; i3++) {
                        cArr[i3] = charAt;
                    }
                    str = new String(cArr);
                } else {
                    str = "[".toString();
                }
                sb.append(str);
                sb.append('L');
                sb.append(str3);
                sb.append(';');
                str3 = sb.toString();
            } else {
                throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
            }
        }
        return C24361g.m61188t0(classLoader, str3);
    }

    /* renamed from: f */
    public static final Annotation m62679f(C20986c cVar) {
        Class<?> cls;
        Pair pair;
        C25432c d = DescriptorUtilsKt.m60283d(cVar);
        if (d == null) {
            cls = null;
        } else {
            cls = m62680g(d);
        }
        if (!(cls instanceof Class)) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        Set<Map.Entry<C25069e, C25498g<?>>> entrySet = cVar.mo53067g().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : entrySet) {
            C25069e eVar = (C25069e) entry.getKey();
            ClassLoader classLoader = cls.getClassLoader();
            C24362h.m61210e(classLoader, "annotationClass.classLoader");
            Object h = m62681h((C25498g) entry.getValue(), classLoader);
            if (h == null) {
                pair = null;
            } else {
                pair = new Pair(eVar.mo61604f(), h);
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Map a0 = C23826d.m58536a0(arrayList);
        Set<String> keySet = a0.keySet();
        ArrayList arrayList2 = new ArrayList(C21136j.m49436X(keySet, 10));
        for (String declaredMethod : keySet) {
            arrayList2.add(cls.getDeclaredMethod(declaredMethod, new Class[0]));
        }
        return (Annotation) AnnotationConstructorCallerKt.m58657a(cls, a0, arrayList2);
    }

    /* renamed from: g */
    public static final Class<?> m62680g(C25432c cVar) {
        C24362h.m61211f(cVar, "<this>");
        C25435d0 e = cVar.mo53400e();
        C24362h.m61210e(e, "source");
        if (e instanceof C24762m) {
            return ((C23293d) ((C24762m) e).f62662b).f59074a;
        }
        if (e instanceof C23298h.C23299a) {
            return ((C23912a) ((C23298h.C23299a) e).f59082b).f60543a;
        }
        C25065b f = DescriptorUtilsKt.m60285f(cVar);
        if (f == null) {
            return null;
        }
        return m62678e(ReflectClassUtilKt.m58952d(cVar.getClass()), f, 0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [boolean[], char[], byte[], short[]], vars: [r7v17 ?, r7v21 ?, r7v19 ?, r7v22 ?, r7v24 ?, r7v26 ?, r7v28 ?, r7v30 ?, r7v32 ?, r7v34 ?, r7v36 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: h */
    public static final java.lang.Object m62681h(zg0.C25498g<?> r6, java.lang.ClassLoader r7) {
        /*
            boolean r0 = r6 instanceof zg0.C25492a
            r1 = 0
            if (r0 == 0) goto L_0x0011
            zg0.a r6 = (zg0.C25492a) r6
            T r6 = r6.f63774a
            ag0.c r6 = (ag0.C20986c) r6
            java.lang.annotation.Annotation r1 = m62679f(r6)
            goto L_0x02f2
        L_0x0011:
            boolean r0 = r6 instanceof zg0.C25493b
            r2 = 0
            if (r0 == 0) goto L_0x027c
            zg0.b r6 = (zg0.C25493b) r6
            boolean r0 = r6 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.C24126b
            if (r0 == 0) goto L_0x0020
            r0 = r6
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.b r0 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.C24126b) r0
            goto L_0x0021
        L_0x0020:
            r0 = r1
        L_0x0021:
            if (r0 != 0) goto L_0x0025
            goto L_0x02f2
        L_0x0025:
            lh0.v r0 = r0.f61258c
            T r3 = r6.f63774a
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = cf0.C21136j.m49436X(r3, r5)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x003a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x004e
            java.lang.Object r5 = r3.next()
            zg0.g r5 = (zg0.C25498g) r5
            java.lang.Object r5 = m62681h(r5, r7)
            r4.add(r5)
            goto L_0x003a
        L_0x004e:
            if (r0 == 0) goto L_0x0276
            ug0.e r3 = kotlin.reflect.jvm.internal.impl.builtins.C23867c.f60309e
            lh0.i0 r3 = r0.mo60411O0()
            zf0.e r3 = r3.mo53460o()
            if (r3 != 0) goto L_0x005e
            r3 = r1
            goto L_0x0062
        L_0x005e:
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r3 = kotlin.reflect.jvm.internal.impl.builtins.C23867c.m58684s(r3)
        L_0x0062:
            if (r3 != 0) goto L_0x0066
            r3 = -1
            goto L_0x006e
        L_0x0066:
            int[] r5 = tf0.C24979k.C24980a.f63117a
            int r3 = r3.ordinal()
            r3 = r5[r3]
        L_0x006e:
            switch(r3) {
                case -1: goto L_0x01a2;
                case 0: goto L_0x0071;
                case 1: goto L_0x017a;
                case 2: goto L_0x0155;
                case 3: goto L_0x0130;
                case 4: goto L_0x010b;
                case 5: goto L_0x00e6;
                case 6: goto L_0x00c1;
                case 7: goto L_0x009c;
                case 8: goto L_0x0077;
                default: goto L_0x0071;
            }
        L_0x0071:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L_0x0077:
            T r6 = r6.f63774a
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            double[] r7 = new double[r6]
        L_0x0081:
            if (r2 >= r6) goto L_0x019f
            java.lang.Object r0 = r4.get(r2)
            if (r0 == 0) goto L_0x0094
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            r7[r2] = r0
            int r2 = r2 + 1
            goto L_0x0081
        L_0x0094:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Double"
            r6.<init>(r7)
            throw r6
        L_0x009c:
            T r6 = r6.f63774a
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            long[] r7 = new long[r6]
        L_0x00a6:
            if (r2 >= r6) goto L_0x019f
            java.lang.Object r0 = r4.get(r2)
            if (r0 == 0) goto L_0x00b9
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r7[r2] = r0
            int r2 = r2 + 1
            goto L_0x00a6
        L_0x00b9:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Long"
            r6.<init>(r7)
            throw r6
        L_0x00c1:
            T r6 = r6.f63774a
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            float[] r7 = new float[r6]
        L_0x00cb:
            if (r2 >= r6) goto L_0x019f
            java.lang.Object r0 = r4.get(r2)
            if (r0 == 0) goto L_0x00de
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r7[r2] = r0
            int r2 = r2 + 1
            goto L_0x00cb
        L_0x00de:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Float"
            r6.<init>(r7)
            throw r6
        L_0x00e6:
            T r6 = r6.f63774a
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            int[] r7 = new int[r6]
        L_0x00f0:
            if (r2 >= r6) goto L_0x019f
            java.lang.Object r0 = r4.get(r2)
            if (r0 == 0) goto L_0x0103
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r7[r2] = r0
            int r2 = r2 + 1
            goto L_0x00f0
        L_0x0103:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Int"
            r6.<init>(r7)
            throw r6
        L_0x010b:
            T r6 = r6.f63774a
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            short[] r7 = new short[r6]
        L_0x0115:
            if (r2 >= r6) goto L_0x019f
            java.lang.Object r0 = r4.get(r2)
            if (r0 == 0) goto L_0x0128
            java.lang.Short r0 = (java.lang.Short) r0
            short r0 = r0.shortValue()
            r7[r2] = r0
            int r2 = r2 + 1
            goto L_0x0115
        L_0x0128:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Short"
            r6.<init>(r7)
            throw r6
        L_0x0130:
            T r6 = r6.f63774a
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            byte[] r7 = new byte[r6]
        L_0x013a:
            if (r2 >= r6) goto L_0x019f
            java.lang.Object r0 = r4.get(r2)
            if (r0 == 0) goto L_0x014d
            java.lang.Byte r0 = (java.lang.Byte) r0
            byte r0 = r0.byteValue()
            r7[r2] = r0
            int r2 = r2 + 1
            goto L_0x013a
        L_0x014d:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Byte"
            r6.<init>(r7)
            throw r6
        L_0x0155:
            T r6 = r6.f63774a
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            char[] r7 = new char[r6]
        L_0x015f:
            if (r2 >= r6) goto L_0x019f
            java.lang.Object r0 = r4.get(r2)
            if (r0 == 0) goto L_0x0172
            java.lang.Character r0 = (java.lang.Character) r0
            char r0 = r0.charValue()
            r7[r2] = r0
            int r2 = r2 + 1
            goto L_0x015f
        L_0x0172:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Char"
            r6.<init>(r7)
            throw r6
        L_0x017a:
            T r6 = r6.f63774a
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            boolean[] r7 = new boolean[r6]
        L_0x0184:
            if (r2 >= r6) goto L_0x019f
            java.lang.Object r0 = r4.get(r2)
            if (r0 == 0) goto L_0x0197
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r7[r2] = r0
            int r2 = r2 + 1
            goto L_0x0184
        L_0x0197:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Boolean"
            r6.<init>(r7)
            throw r6
        L_0x019f:
            r1 = r7
            goto L_0x02f2
        L_0x01a2:
            boolean r3 = kotlin.reflect.jvm.internal.impl.builtins.C23867c.m58687z(r0)
            if (r3 == 0) goto L_0x0266
            java.util.List r0 = r0.mo60410N0()
            java.lang.Object r0 = kotlin.collections.C23825c.m58491C0(r0)
            lh0.l0 r0 = (lh0.C24281l0) r0
            lh0.v r0 = r0.getType()
            java.lang.String r3 = "type.arguments.single().type"
            mf0.C24362h.m61210e(r0, r3)
            lh0.i0 r3 = r0.mo60411O0()
            zf0.e r3 = r3.mo53460o()
            boolean r5 = r3 instanceof zf0.C25432c
            if (r5 == 0) goto L_0x01ca
            zf0.c r3 = (zf0.C25432c) r3
            goto L_0x01cb
        L_0x01ca:
            r3 = r1
        L_0x01cb:
            if (r3 == 0) goto L_0x0256
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.C23867c.m58678I(r0)
            if (r0 == 0) goto L_0x01f4
            T r6 = r6.f63774a
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            java.lang.String[] r7 = new java.lang.String[r6]
        L_0x01dd:
            if (r2 >= r6) goto L_0x019f
            java.lang.Object r0 = r4.get(r2)
            if (r0 == 0) goto L_0x01ec
            java.lang.String r0 = (java.lang.String) r0
            r7[r2] = r0
            int r2 = r2 + 1
            goto L_0x01dd
        L_0x01ec:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.String"
            r6.<init>(r7)
            throw r6
        L_0x01f4:
            ug0.d r0 = kotlin.reflect.jvm.internal.impl.builtins.C23872e.C23873a.f60349O
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.C23867c.m58683c(r3, r0)
            if (r0 == 0) goto L_0x021d
            T r6 = r6.f63774a
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            java.lang.Class[] r7 = new java.lang.Class[r6]
        L_0x0206:
            if (r2 >= r6) goto L_0x019f
            java.lang.Object r0 = r4.get(r2)
            if (r0 == 0) goto L_0x0215
            java.lang.Class r0 = (java.lang.Class) r0
            r7[r2] = r0
            int r2 = r2 + 1
            goto L_0x0206
        L_0x0215:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type java.lang.Class<*>"
            r6.<init>(r7)
            throw r6
        L_0x021d:
            ug0.b r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m60285f(r3)
            if (r0 != 0) goto L_0x0225
            r7 = r1
            goto L_0x0229
        L_0x0225:
            java.lang.Class r7 = m62678e(r7, r0, r2)
        L_0x0229:
            if (r7 != 0) goto L_0x022d
            goto L_0x02f2
        L_0x022d:
            T r6 = r6.f63774a
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r7, r6)
            if (r6 == 0) goto L_0x024e
            r1 = r6
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r6 = r4.size()
        L_0x0242:
            if (r2 >= r6) goto L_0x02f2
            int r7 = r2 + 1
            java.lang.Object r0 = r4.get(r2)
            r1[r2] = r0
            r2 = r7
            goto L_0x0242
        L_0x024e:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>"
            r6.<init>(r7)
            throw r6
        L_0x0256:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Not a class type: "
            java.lang.String r7 = mf0.C24362h.m61216k(r0, r7)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x0266:
            java.lang.String r6 = "Not an array type: "
            java.lang.String r6 = mf0.C24362h.m61216k(r0, r6)
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L_0x0276:
            r6 = 92
            kotlin.reflect.jvm.internal.impl.builtins.C23867c.m58681a(r6)
            throw r1
        L_0x027c:
            boolean r0 = r6 instanceof zg0.C25500i
            if (r0 == 0) goto L_0x02a2
            zg0.i r6 = (zg0.C25500i) r6
            T r6 = r6.f63774a
            kotlin.Pair r6 = (kotlin.Pair) r6
            java.lang.Object r0 = r6.mo59066a()
            ug0.b r0 = (ug0.C25065b) r0
            java.lang.Object r6 = r6.mo59067b()
            ug0.e r6 = (ug0.C25069e) r6
            java.lang.Class r7 = m62678e(r7, r0, r2)
            if (r7 != 0) goto L_0x0299
            goto L_0x02f2
        L_0x0299:
            java.lang.String r6 = r6.mo61604f()
            java.lang.Enum r1 = java.lang.Enum.valueOf(r7, r6)
            goto L_0x02f2
        L_0x02a2:
            boolean r0 = r6 instanceof zg0.C25507o
            if (r0 == 0) goto L_0x02e3
            zg0.o r6 = (zg0.C25507o) r6
            T r6 = r6.f63774a
            zg0.o$a r6 = (zg0.C25507o.C25508a) r6
            boolean r0 = r6 instanceof zg0.C25507o.C25508a.C25510b
            if (r0 == 0) goto L_0x02bd
            zg0.o$a$b r6 = (zg0.C25507o.C25508a.C25510b) r6
            zg0.f r6 = r6.f63779a
            ug0.b r0 = r6.f63772a
            int r6 = r6.f63773b
            java.lang.Class r1 = m62678e(r7, r0, r6)
            goto L_0x02f2
        L_0x02bd:
            boolean r7 = r6 instanceof zg0.C25507o.C25508a.C25509a
            if (r7 == 0) goto L_0x02dd
            zg0.o$a$a r6 = (zg0.C25507o.C25508a.C25509a) r6
            lh0.v r6 = r6.f63778a
            lh0.i0 r6 = r6.mo60411O0()
            zf0.e r6 = r6.mo53460o()
            boolean r7 = r6 instanceof zf0.C25432c
            if (r7 == 0) goto L_0x02d4
            zf0.c r6 = (zf0.C25432c) r6
            goto L_0x02d5
        L_0x02d4:
            r6 = r1
        L_0x02d5:
            if (r6 != 0) goto L_0x02d8
            goto L_0x02f2
        L_0x02d8:
            java.lang.Class r1 = m62680g(r6)
            goto L_0x02f2
        L_0x02dd:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L_0x02e3:
            boolean r7 = r6 instanceof zg0.C25501j
            if (r7 == 0) goto L_0x02e9
            r7 = 1
            goto L_0x02eb
        L_0x02e9:
            boolean r7 = r6 instanceof zg0.C25512q
        L_0x02eb:
            if (r7 == 0) goto L_0x02ee
            goto L_0x02f2
        L_0x02ee:
            java.lang.Object r1 = r6.mo62750b()
        L_0x02f2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tf0.C24979k.m62681h(zg0.g, java.lang.ClassLoader):java.lang.Object");
    }
}
