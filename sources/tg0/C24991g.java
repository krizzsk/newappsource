package tg0;

import ce0.C21100e;
import cf0.C21136j;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C23825c;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.C24077b;
import kotlin.reflect.jvm.internal.impl.protobuf.C24078c;
import kotlin.reflect.jvm.internal.impl.protobuf.C24079d;
import kotlin.reflect.jvm.internal.impl.protobuf.C24090h;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import lf0.C24236l;
import mf0.C24362h;
import p583jk.C17875h;
import p584jl.C17885a;
import sg0.C24872b;
import sg0.C24876c;
import sg0.C24879e;
import tg0.C24985d;

/* renamed from: tg0.g */
public final class C24991g {

    /* renamed from: a */
    public static final C24079d f63134a;

    static {
        C24079d dVar = new C24079d();
        dVar.mo60038a(JvmProtoBuf.f60999a);
        dVar.mo60038a(JvmProtoBuf.f61000b);
        dVar.mo60038a(JvmProtoBuf.f61001c);
        dVar.mo60038a(JvmProtoBuf.f61002d);
        dVar.mo60038a(JvmProtoBuf.f61003e);
        dVar.mo60038a(JvmProtoBuf.f61004f);
        dVar.mo60038a(JvmProtoBuf.f61005g);
        dVar.mo60038a(JvmProtoBuf.f61006h);
        dVar.mo60038a(JvmProtoBuf.f61007i);
        dVar.mo60038a(JvmProtoBuf.f61008j);
        dVar.mo60038a(JvmProtoBuf.f61009k);
        dVar.mo60038a(JvmProtoBuf.f61010l);
        dVar.mo60038a(JvmProtoBuf.f61011m);
        dVar.mo60038a(JvmProtoBuf.f61012n);
        f63134a = dVar;
    }

    /* renamed from: a */
    public static C24985d.C24987b m62698a(ProtoBuf$Constructor protoBuf$Constructor, C24876c cVar, C24879e eVar) {
        String str;
        String str2;
        C24362h.m61211f(protoBuf$Constructor, "proto");
        C24362h.m61211f(cVar, "nameResolver");
        C24362h.m61211f(eVar, "typeTable");
        GeneratedMessageLite.C24069e<ProtoBuf$Constructor, JvmProtoBuf.JvmMethodSignature> eVar2 = JvmProtoBuf.f60999a;
        C24362h.m61210e(eVar2, "constructorSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) C17885a.m44423T(protoBuf$Constructor, eVar2);
        if (jvmMethodSignature == null || !jvmMethodSignature.mo59936k()) {
            str = "<init>";
        } else {
            str = cVar.getString(jvmMethodSignature.mo59934i());
        }
        if (jvmMethodSignature == null || !jvmMethodSignature.mo59935j()) {
            List<ProtoBuf$ValueParameter> x = protoBuf$Constructor.mo59691x();
            C24362h.m61210e(x, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(C21136j.m49436X(x, 10));
            for (ProtoBuf$ValueParameter protoBuf$ValueParameter : x) {
                C24362h.m61210e(protoBuf$ValueParameter, "it");
                String e = m62702e(C21100e.m49307F0(protoBuf$ValueParameter, eVar), cVar);
                if (e == null) {
                    return null;
                }
                arrayList.add(e);
            }
            str2 = C23825c.m58520q0(arrayList, "", "(", ")V", (C24236l) null, 56);
        } else {
            str2 = cVar.getString(jvmMethodSignature.mo59933h());
        }
        return new C24985d.C24987b(str, str2);
    }

    /* renamed from: b */
    public static C24985d.C24986a m62699b(ProtoBuf$Property protoBuf$Property, C24876c cVar, C24879e eVar, boolean z) {
        JvmProtoBuf.JvmFieldSignature jvmFieldSignature;
        int i;
        String str;
        C24362h.m61211f(protoBuf$Property, "proto");
        C24362h.m61211f(cVar, "nameResolver");
        C24362h.m61211f(eVar, "typeTable");
        GeneratedMessageLite.C24069e<ProtoBuf$Property, JvmProtoBuf.JvmPropertySignature> eVar2 = JvmProtoBuf.f61002d;
        C24362h.m61210e(eVar2, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) C17885a.m44423T(protoBuf$Property, eVar2);
        if (jvmPropertySignature == null) {
            return null;
        }
        if (jvmPropertySignature.mo59946r()) {
            jvmFieldSignature = jvmPropertySignature.mo59941l();
        } else {
            jvmFieldSignature = null;
        }
        if (jvmFieldSignature == null && z) {
            return null;
        }
        if (jvmFieldSignature == null || !jvmFieldSignature.mo59929k()) {
            i = protoBuf$Property.mo59771H();
        } else {
            i = jvmFieldSignature.mo59927i();
        }
        if (jvmFieldSignature == null || !jvmFieldSignature.mo59928j()) {
            str = m62702e(C21100e.m49374x0(protoBuf$Property, eVar), cVar);
            if (str == null) {
                return null;
            }
        } else {
            str = cVar.getString(jvmFieldSignature.mo59926h());
        }
        return new C24985d.C24986a(cVar.getString(i), str);
    }

    /* renamed from: c */
    public static C24985d.C24987b m62700c(ProtoBuf$Function protoBuf$Function, C24876c cVar, C24879e eVar) {
        int i;
        String str;
        C24362h.m61211f(protoBuf$Function, "proto");
        C24362h.m61211f(cVar, "nameResolver");
        C24362h.m61211f(eVar, "typeTable");
        GeneratedMessageLite.C24069e<ProtoBuf$Function, JvmProtoBuf.JvmMethodSignature> eVar2 = JvmProtoBuf.f61000b;
        C24362h.m61210e(eVar2, "methodSignature");
        JvmProtoBuf.JvmMethodSignature jvmMethodSignature = (JvmProtoBuf.JvmMethodSignature) C17885a.m44423T(protoBuf$Function, eVar2);
        if (jvmMethodSignature == null || !jvmMethodSignature.mo59936k()) {
            i = protoBuf$Function.mo59727I();
        } else {
            i = jvmMethodSignature.mo59934i();
        }
        if (jvmMethodSignature == null || !jvmMethodSignature.mo59935j()) {
            List F = C17875h.m44282F(C21100e.m49368u0(protoBuf$Function, eVar));
            List<ProtoBuf$ValueParameter> Q = protoBuf$Function.mo59735Q();
            C24362h.m61210e(Q, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(C21136j.m49436X(Q, 10));
            for (ProtoBuf$ValueParameter protoBuf$ValueParameter : Q) {
                C24362h.m61210e(protoBuf$ValueParameter, "it");
                arrayList.add(C21100e.m49307F0(protoBuf$ValueParameter, eVar));
            }
            ArrayList x0 = C23825c.m58527x0(arrayList, F);
            ArrayList arrayList2 = new ArrayList(C21136j.m49436X(x0, 10));
            Iterator it = x0.iterator();
            while (it.hasNext()) {
                String e = m62702e((ProtoBuf$Type) it.next(), cVar);
                if (e == null) {
                    return null;
                }
                arrayList2.add(e);
            }
            String e2 = m62702e(C21100e.m49372w0(protoBuf$Function, eVar), cVar);
            if (e2 == null) {
                return null;
            }
            str = C24362h.m61216k(e2, C23825c.m58520q0(arrayList2, "", "(", ")", (C24236l) null, 56));
        } else {
            str = cVar.getString(jvmMethodSignature.mo59933h());
        }
        return new C24985d.C24987b(cVar.getString(i), str);
    }

    /* renamed from: d */
    public static final boolean m62701d(ProtoBuf$Property protoBuf$Property) {
        C24362h.m61211f(protoBuf$Property, "proto");
        C24872b.C24873a aVar = C24984c.f63122a;
        C24872b.C24873a aVar2 = C24984c.f63122a;
        Object g = protoBuf$Property.mo59990g(JvmProtoBuf.f61003e);
        C24362h.m61210e(g, "proto.getExtension(JvmProtoBuf.flags)");
        Boolean c = aVar2.mo61346c(((Number) g).intValue());
        C24362h.m61210e(c, "JvmFlags.IS_MOVED_FROM_I…nsion(JvmProtoBuf.flags))");
        return c.booleanValue();
    }

    /* renamed from: e */
    public static String m62702e(ProtoBuf$Type protoBuf$Type, C24876c cVar) {
        if (protoBuf$Type.mo59828X()) {
            return C24983b.m62685b(cVar.mo61350b(protoBuf$Type.mo59815K()));
        }
        return null;
    }

    /* renamed from: f */
    public static final Pair<C24989f, ProtoBuf$Class> m62703f(String[] strArr, String[] strArr2) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C24982a.m62683b(strArr));
        C24989f g = m62704g(byteArrayInputStream, strArr2);
        C24079d dVar = f63134a;
        ProtoBuf$Class.C23998a aVar = ProtoBuf$Class.f60815c;
        aVar.getClass();
        C24078c cVar = new C24078c(byteArrayInputStream);
        C24090h hVar = (C24090h) aVar.mo59643a(cVar, dVar);
        try {
            cVar.mo60019a(0);
            C24077b.m60077b(hVar);
            return new Pair<>(g, (ProtoBuf$Class) hVar);
        } catch (InvalidProtocolBufferException e) {
            e.mo60010b(hVar);
            throw e;
        }
    }

    /* renamed from: g */
    public static C24989f m62704g(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        JvmProtoBuf.StringTableTypes stringTableTypes = (JvmProtoBuf.StringTableTypes) JvmProtoBuf.StringTableTypes.f61032c.mo60018c(byteArrayInputStream, f63134a);
        C24362h.m61210e(stringTableTypes, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        return new C24989f(stringTableTypes, strArr);
    }

    /* renamed from: h */
    public static final Pair<C24989f, ProtoBuf$Package> m62705h(String[] strArr, String[] strArr2) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(C24982a.m62683b(strArr));
        C24989f g = m62704g(byteArrayInputStream, strArr2);
        C24079d dVar = f63134a;
        ProtoBuf$Package.C24017a aVar = ProtoBuf$Package.f60883c;
        aVar.getClass();
        C24078c cVar = new C24078c(byteArrayInputStream);
        C24090h hVar = (C24090h) aVar.mo59643a(cVar, dVar);
        try {
            cVar.mo60019a(0);
            C24077b.m60077b(hVar);
            return new Pair<>(g, (ProtoBuf$Package) hVar);
        } catch (InvalidProtocolBufferException e) {
            e.mo60010b(hVar);
            throw e;
        }
    }
}
