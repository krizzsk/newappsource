package wf0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C23825c;
import kotlin.collections.C23826d;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedType;
import lh0.C24299r0;
import lh0.C24307v;
import mf0.C24362h;
import ug0.C25065b;
import ug0.C25069e;
import zf0.C25437e;
import zf0.C25442g;
import zf0.C25486u;

/* renamed from: wf0.h */
public final class C25144h {

    /* renamed from: a */
    public static final Set<C25069e> f63419a;

    /* renamed from: b */
    public static final HashMap<C25065b, C25065b> f63420b = new HashMap<>();

    /* renamed from: c */
    public static final HashMap<C25065b, C25065b> f63421c = new HashMap<>();

    /* renamed from: d */
    public static final LinkedHashSet f63422d;

    static {
        UnsignedType[] values = UnsignedType.values();
        ArrayList arrayList = new ArrayList(values.length);
        int length = values.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            UnsignedType unsignedType = values[i2];
            i2++;
            arrayList.add(unsignedType.getTypeName());
        }
        f63419a = C23825c.m58503O0(arrayList);
        UnsignedArrayType[] values2 = UnsignedArrayType.values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        int length2 = values2.length;
        int i3 = 0;
        while (i3 < length2) {
            UnsignedArrayType unsignedArrayType = values2[i3];
            i3++;
            arrayList2.add(unsignedArrayType.getTypeName());
        }
        C23825c.m58503O0(arrayList2);
        C23826d.m58532W(new Pair(UnsignedArrayType.UBYTEARRAY, C25069e.m62820i("ubyteArrayOf")), new Pair(UnsignedArrayType.USHORTARRAY, C25069e.m62820i("ushortArrayOf")), new Pair(UnsignedArrayType.UINTARRAY, C25069e.m62820i("uintArrayOf")), new Pair(UnsignedArrayType.ULONGARRAY, C25069e.m62820i("ulongArrayOf")));
        UnsignedType[] values3 = UnsignedType.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length3 = values3.length;
        int i4 = 0;
        while (i4 < length3) {
            UnsignedType unsignedType2 = values3[i4];
            i4++;
            linkedHashSet.add(unsignedType2.getArrayClassId().mo61577j());
        }
        f63422d = linkedHashSet;
        UnsignedType[] values4 = UnsignedType.values();
        int length4 = values4.length;
        while (i < length4) {
            UnsignedType unsignedType3 = values4[i];
            i++;
            f63420b.put(unsignedType3.getArrayClassId(), unsignedType3.getClassId());
            f63421c.put(unsignedType3.getClassId(), unsignedType3.getArrayClassId());
        }
    }

    /* renamed from: a */
    public static final boolean m63106a(C24307v vVar) {
        C25437e o;
        if (C24299r0.m60984p(vVar) || (o = vVar.mo60411O0().mo53460o()) == null) {
            return false;
        }
        C25442g b = o.mo53399b();
        if (!(b instanceof C25486u) || !C24362h.m61206a(((C25486u) b).mo53401f(), C23872e.f60330i) || !f63419a.contains(o.getName())) {
            return false;
        }
        return true;
    }
}
