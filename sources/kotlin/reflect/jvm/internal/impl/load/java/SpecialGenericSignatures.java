package kotlin.reflect.jvm.internal.impl.load.java;

import cf0.C21136j;
import cf0.C21151y;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C23825c;
import kotlin.collections.C23826d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import mf0.C24362h;
import p001a0.C0017h;
import p389bl.C13637c;
import p583jk.C17884p;
import ug0.C25069e;

public class SpecialGenericSignatures {

    /* renamed from: a */
    public static final C23920a f60562a = new C23920a();

    /* renamed from: b */
    public static final ArrayList f60563b;

    /* renamed from: c */
    public static final ArrayList f60564c;

    /* renamed from: d */
    public static final Map<C23920a.C23921a, TypeSafeBarrierDescription> f60565d;

    /* renamed from: e */
    public static final LinkedHashMap f60566e;

    /* renamed from: f */
    public static final Set<C25069e> f60567f;

    /* renamed from: g */
    public static final Set<String> f60568g;

    /* renamed from: h */
    public static final C23920a.C23921a f60569h;

    /* renamed from: i */
    public static final Map<C23920a.C23921a, C25069e> f60570i;

    /* renamed from: j */
    public static final LinkedHashMap f60571j;

    /* renamed from: k */
    public static final ArrayList f60572k;

    /* renamed from: l */
    public static final LinkedHashMap f60573l;

    public enum SpecialSignatureInfo {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC((String) null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);
        
        private final boolean isObjectReplacedWithTypeParameter;
        private final String valueParametersSignature;

        private SpecialSignatureInfo(String str, boolean z) {
            this.valueParametersSignature = str;
            this.isObjectReplacedWithTypeParameter = z;
        }
    }

    public enum TypeSafeBarrierDescription {
        NULL((String) null),
        INDEX(-1),
        FALSE(Boolean.FALSE);
        
        private final Object defaultValue;

        public static final class MAP_GET_OR_DEFAULT extends TypeSafeBarrierDescription {
            public MAP_GET_OR_DEFAULT() {
                super("MAP_GET_OR_DEFAULT", 3, (Object) null, (DefaultConstructorMarker) null);
            }
        }

        private TypeSafeBarrierDescription(Object obj) {
            this.defaultValue = obj;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a */
    public static final class C23920a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a$a */
        public static final class C23921a {

            /* renamed from: a */
            public final C25069e f60574a;

            /* renamed from: b */
            public final String f60575b;

            public C23921a(C25069e eVar, String str) {
                C24362h.m61211f(str, InAppPurchaseMetaData.KEY_SIGNATURE);
                this.f60574a = eVar;
                this.f60575b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C23921a)) {
                    return false;
                }
                C23921a aVar = (C23921a) obj;
                return C24362h.m61206a(this.f60574a, aVar.f60574a) && C24362h.m61206a(this.f60575b, aVar.f60575b);
            }

            public final int hashCode() {
                return this.f60575b.hashCode() + (this.f60574a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder k = C13555b.m33972k("NameAndSignature(name=");
                k.append(this.f60574a);
                k.append(", signature=");
                return C0017h.m57N(k, this.f60575b, ')');
            }
        }

        /* renamed from: a */
        public static final C23921a m58984a(C23920a aVar, String str, String str2, String str3, String str4) {
            aVar.getClass();
            C25069e i = C25069e.m62820i(str2);
            String str5 = str2 + '(' + str3 + ')' + str4;
            C24362h.m61211f(str, "internalName");
            C24362h.m61211f(str5, "jvmDescriptor");
            return new C23921a(i, str + '.' + str5);
        }
    }

    static {
        Set<String> T = C17884p.m44349T("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(C21136j.m49436X(T, 10));
        for (String a : T) {
            C23920a aVar = f60562a;
            String desc = JvmPrimitiveType.BOOLEAN.getDesc();
            C24362h.m61210e(desc, "BOOLEAN.desc");
            arrayList.add(C23920a.m58984a(aVar, "java/util/Collection", a, "Ljava/util/Collection;", desc));
        }
        f60563b = arrayList;
        ArrayList arrayList2 = new ArrayList(C21136j.m49436X(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C23920a.C23921a) it.next()).f60575b);
        }
        f60564c = arrayList2;
        ArrayList arrayList3 = f60563b;
        ArrayList arrayList4 = new ArrayList(C21136j.m49436X(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((C23920a.C23921a) it2.next()).f60574a.mo61604f());
        }
        C23920a aVar2 = f60562a;
        String k = C24362h.m61216k("Collection", "java/util/");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        String desc2 = jvmPrimitiveType.getDesc();
        C24362h.m61210e(desc2, "BOOLEAN.desc");
        C23920a.C23921a a2 = C23920a.m58984a(aVar2, k, "contains", "Ljava/lang/Object;", desc2);
        TypeSafeBarrierDescription typeSafeBarrierDescription = TypeSafeBarrierDescription.FALSE;
        String k2 = C24362h.m61216k("Collection", "java/util/");
        String desc3 = jvmPrimitiveType.getDesc();
        C24362h.m61210e(desc3, "BOOLEAN.desc");
        String k3 = C24362h.m61216k("Map", "java/util/");
        String desc4 = jvmPrimitiveType.getDesc();
        C24362h.m61210e(desc4, "BOOLEAN.desc");
        String k4 = C24362h.m61216k("Map", "java/util/");
        String desc5 = jvmPrimitiveType.getDesc();
        C24362h.m61210e(desc5, "BOOLEAN.desc");
        String k5 = C24362h.m61216k("Map", "java/util/");
        String desc6 = jvmPrimitiveType.getDesc();
        C24362h.m61210e(desc6, "BOOLEAN.desc");
        C23920a.C23921a a3 = C23920a.m58984a(aVar2, C24362h.m61216k("Map", "java/util/"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        TypeSafeBarrierDescription typeSafeBarrierDescription2 = TypeSafeBarrierDescription.NULL;
        String k6 = C24362h.m61216k("List", "java/util/");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        String desc7 = jvmPrimitiveType2.getDesc();
        C24362h.m61210e(desc7, "INT.desc");
        C23920a.C23921a a4 = C23920a.m58984a(aVar2, k6, "indexOf", "Ljava/lang/Object;", desc7);
        TypeSafeBarrierDescription typeSafeBarrierDescription3 = TypeSafeBarrierDescription.INDEX;
        String k7 = C24362h.m61216k("List", "java/util/");
        String desc8 = jvmPrimitiveType2.getDesc();
        C24362h.m61210e(desc8, "INT.desc");
        Map<C23920a.C23921a, TypeSafeBarrierDescription> X = C23826d.m58533X(new Pair(a2, typeSafeBarrierDescription), new Pair(C23920a.m58984a(aVar2, k2, ProductAction.ACTION_REMOVE, "Ljava/lang/Object;", desc3), typeSafeBarrierDescription), new Pair(C23920a.m58984a(aVar2, k3, "containsKey", "Ljava/lang/Object;", desc4), typeSafeBarrierDescription), new Pair(C23920a.m58984a(aVar2, k4, "containsValue", "Ljava/lang/Object;", desc5), typeSafeBarrierDescription), new Pair(C23920a.m58984a(aVar2, k5, ProductAction.ACTION_REMOVE, "Ljava/lang/Object;Ljava/lang/Object;", desc6), typeSafeBarrierDescription), new Pair(C23920a.m58984a(aVar2, C24362h.m61216k("Map", "java/util/"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT), new Pair(a3, typeSafeBarrierDescription2), new Pair(C23920a.m58984a(aVar2, C24362h.m61216k("Map", "java/util/"), ProductAction.ACTION_REMOVE, "Ljava/lang/Object;", "Ljava/lang/Object;"), typeSafeBarrierDescription2), new Pair(a4, typeSafeBarrierDescription3), new Pair(C23920a.m58984a(aVar2, k7, "lastIndexOf", "Ljava/lang/Object;", desc8), typeSafeBarrierDescription3));
        f60565d = X;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C13637c.m34083z(X.size()));
        for (Map.Entry entry : X.entrySet()) {
            linkedHashMap.put(((C23920a.C23921a) entry.getKey()).f60575b, entry.getValue());
        }
        f60566e = linkedHashMap;
        LinkedHashSet<C23920a.C23921a> h0 = C21151y.m49445h0(f60565d.keySet(), f60563b);
        ArrayList arrayList5 = new ArrayList(C21136j.m49436X(h0, 10));
        for (C23920a.C23921a aVar3 : h0) {
            arrayList5.add(aVar3.f60574a);
        }
        f60567f = C23825c.m58503O0(arrayList5);
        ArrayList arrayList6 = new ArrayList(C21136j.m49436X(h0, 10));
        for (C23920a.C23921a aVar4 : h0) {
            arrayList6.add(aVar4.f60575b);
        }
        f60568g = C23825c.m58503O0(arrayList6);
        C23920a aVar5 = f60562a;
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        String desc9 = jvmPrimitiveType3.getDesc();
        C24362h.m61210e(desc9, "INT.desc");
        C23920a.C23921a a5 = C23920a.m58984a(aVar5, "java/util/List", "removeAt", desc9, "Ljava/lang/Object;");
        f60569h = a5;
        String k8 = C24362h.m61216k("Number", "java/lang/");
        String desc10 = JvmPrimitiveType.BYTE.getDesc();
        C24362h.m61210e(desc10, "BYTE.desc");
        String k9 = C24362h.m61216k("Number", "java/lang/");
        String desc11 = JvmPrimitiveType.SHORT.getDesc();
        C24362h.m61210e(desc11, "SHORT.desc");
        String k11 = C24362h.m61216k("Number", "java/lang/");
        String desc12 = jvmPrimitiveType3.getDesc();
        C24362h.m61210e(desc12, "INT.desc");
        String k12 = C24362h.m61216k("Number", "java/lang/");
        String desc13 = JvmPrimitiveType.LONG.getDesc();
        C24362h.m61210e(desc13, "LONG.desc");
        String k13 = C24362h.m61216k("Number", "java/lang/");
        String desc14 = JvmPrimitiveType.FLOAT.getDesc();
        C24362h.m61210e(desc14, "FLOAT.desc");
        String k14 = C24362h.m61216k("Number", "java/lang/");
        String desc15 = JvmPrimitiveType.DOUBLE.getDesc();
        C24362h.m61210e(desc15, "DOUBLE.desc");
        String k15 = C24362h.m61216k("CharSequence", "java/lang/");
        String desc16 = jvmPrimitiveType3.getDesc();
        C24362h.m61210e(desc16, "INT.desc");
        String desc17 = JvmPrimitiveType.CHAR.getDesc();
        C24362h.m61210e(desc17, "CHAR.desc");
        Map<C23920a.C23921a, C25069e> X2 = C23826d.m58533X(new Pair(C23920a.m58984a(aVar5, k8, "toByte", "", desc10), C25069e.m62820i("byteValue")), new Pair(C23920a.m58984a(aVar5, k9, "toShort", "", desc11), C25069e.m62820i("shortValue")), new Pair(C23920a.m58984a(aVar5, k11, "toInt", "", desc12), C25069e.m62820i("intValue")), new Pair(C23920a.m58984a(aVar5, k12, "toLong", "", desc13), C25069e.m62820i("longValue")), new Pair(C23920a.m58984a(aVar5, k13, "toFloat", "", desc14), C25069e.m62820i("floatValue")), new Pair(C23920a.m58984a(aVar5, k14, "toDouble", "", desc15), C25069e.m62820i("doubleValue")), new Pair(a5, C25069e.m62820i(ProductAction.ACTION_REMOVE)), new Pair(C23920a.m58984a(aVar5, k15, "get", desc16, desc17), C25069e.m62820i("charAt")));
        f60570i = X2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C13637c.m34083z(X2.size()));
        for (Map.Entry entry2 : X2.entrySet()) {
            linkedHashMap2.put(((C23920a.C23921a) entry2.getKey()).f60575b, entry2.getValue());
        }
        f60571j = linkedHashMap2;
        Set<C23920a.C23921a> keySet = f60570i.keySet();
        ArrayList arrayList7 = new ArrayList(C21136j.m49436X(keySet, 10));
        for (C23920a.C23921a aVar6 : keySet) {
            arrayList7.add(aVar6.f60574a);
        }
        f60572k = arrayList7;
        Set<Map.Entry<C23920a.C23921a, C25069e>> entrySet = f60570i.entrySet();
        ArrayList arrayList8 = new ArrayList(C21136j.m49436X(entrySet, 10));
        for (Map.Entry entry3 : entrySet) {
            arrayList8.add(new Pair(((C23920a.C23921a) entry3.getKey()).f60574a, entry3.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it3 = arrayList8.iterator();
        while (it3.hasNext()) {
            Pair pair = (Pair) it3.next();
            C25069e eVar = (C25069e) pair.mo59069d();
            Object obj = linkedHashMap3.get(eVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap3.put(eVar, obj);
            }
            ((List) obj).add((C25069e) pair.mo59068c());
        }
        f60573l = linkedHashMap3;
    }
}
