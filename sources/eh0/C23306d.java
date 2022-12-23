package eh0;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import lf0.C24236l;
import mf0.C24362h;

/* renamed from: eh0.d */
public final class C23306d {

    /* renamed from: c */
    public static final C23307a f59088c = new C23307a();

    /* renamed from: d */
    public static int f59089d = 1;

    /* renamed from: e */
    public static final int f59090e;

    /* renamed from: f */
    public static final int f59091f;

    /* renamed from: g */
    public static final int f59092g;

    /* renamed from: h */
    public static final int f59093h;

    /* renamed from: i */
    public static final int f59094i;

    /* renamed from: j */
    public static final int f59095j;

    /* renamed from: k */
    public static final int f59096k;

    /* renamed from: l */
    public static final int f59097l;

    /* renamed from: m */
    public static final C23306d f59098m;

    /* renamed from: n */
    public static final C23306d f59099n;

    /* renamed from: o */
    public static final C23306d f59100o;

    /* renamed from: p */
    public static final C23306d f59101p;

    /* renamed from: q */
    public static final C23306d f59102q;

    /* renamed from: r */
    public static final ArrayList f59103r;

    /* renamed from: s */
    public static final ArrayList f59104s;

    /* renamed from: a */
    public final List<C23303c> f59105a;

    /* renamed from: b */
    public final int f59106b;

    /* renamed from: eh0.d$a */
    public static final class C23307a {

        /* renamed from: eh0.d$a$a */
        public static final class C23308a {

            /* renamed from: a */
            public final int f59107a;

            /* renamed from: b */
            public final String f59108b;

            public C23308a(int i, String str) {
                this.f59107a = i;
                this.f59108b = str;
            }
        }
    }

    static {
        boolean z;
        C23307a.C23308a aVar;
        C23306d dVar;
        Class<C23306d> cls = C23306d.class;
        int i = f59089d;
        int i2 = i << 1;
        f59090e = i;
        int i3 = i2 << 1;
        f59091f = i2;
        int i4 = i3 << 1;
        f59092g = i3;
        int i5 = i4 << 1;
        f59093h = i4;
        int i6 = i5 << 1;
        f59094i = i5;
        int i7 = i6 << 1;
        f59095j = i6;
        f59089d = i7 << 1;
        int i8 = i7 - 1;
        f59096k = i8;
        int i9 = i | i2 | i3;
        f59097l = i9;
        f59098m = new C23306d(i8);
        f59099n = new C23306d(i5 | i6);
        new C23306d(i);
        new C23306d(i2);
        new C23306d(i3);
        f59100o = new C23306d(i9);
        new C23306d(i4);
        f59101p = new C23306d(i5);
        f59102q = new C23306d(i6);
        new C23306d(i2 | i5 | i6);
        Field[] fields = cls.getFields();
        C24362h.m61210e(fields, "T::class.java.fields");
        ArrayList arrayList = new ArrayList();
        int length = fields.length;
        int i11 = 0;
        while (i11 < length) {
            Field field = fields[i11];
            i11++;
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            C23307a.C23308a aVar2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get((Object) null);
            if (obj instanceof C23306d) {
                dVar = (C23306d) obj;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                int i12 = dVar.f59106b;
                String name = field2.getName();
                C24362h.m61210e(name, "field.name");
                aVar2 = new C23307a.C23308a(i12, name);
            }
            if (aVar2 != null) {
                arrayList2.add(aVar2);
            }
        }
        f59103r = arrayList2;
        Field[] fields2 = cls.getFields();
        C24362h.m61210e(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        int length2 = fields2.length;
        int i13 = 0;
        while (i13 < length2) {
            Field field3 = fields2[i13];
            i13++;
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (C24362h.m61206a(((Field) next).getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Field field4 = (Field) it3.next();
            Object obj2 = field4.get((Object) null);
            if (obj2 != null) {
                int intValue = ((Integer) obj2).intValue();
                if (intValue == ((-intValue) & intValue)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    String name2 = field4.getName();
                    C24362h.m61210e(name2, "field.name");
                    aVar = new C23307a.C23308a(intValue, name2);
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    arrayList5.add(aVar);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
        }
        f59104s = arrayList5;
    }

    public C23306d(int i) {
        this(i, EmptyList.f60173b);
    }

    /* renamed from: a */
    public final boolean mo58439a(int i) {
        return (i & this.f59106b) != 0;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<C23306d> cls2 = C23306d.class;
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        if (!C24362h.m61206a(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            C23306d dVar = (C23306d) obj;
            if (C24362h.m61206a(this.f59105a, dVar.f59105a) && this.f59106b == dVar.f59106b) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
    }

    public final int hashCode() {
        return (this.f59105a.hashCode() * 31) + this.f59106b;
    }

    public final String toString() {
        Object obj;
        String str;
        String str2;
        boolean z;
        Iterator it = f59103r.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C23307a.C23308a) obj).f59107a == this.f59106b) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C23307a.C23308a aVar = (C23307a.C23308a) obj;
        if (aVar == null) {
            str = null;
        } else {
            str = aVar.f59108b;
        }
        if (str == null) {
            ArrayList arrayList = f59104s;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C23307a.C23308a aVar2 = (C23307a.C23308a) it2.next();
                if (mo58439a(aVar2.f59107a)) {
                    str2 = aVar2.f59108b;
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            str = C23825c.m58520q0(arrayList2, " | ", (String) null, (String) null, (C24236l) null, 62);
        }
        return C13555b.m33970i(C13555b.m33973l("DescriptorKindFilter(", str, ", "), this.f59105a, ')');
    }

    public C23306d(int i, List<? extends C23303c> list) {
        C24362h.m61211f(list, "excludes");
        this.f59105a = list;
        for (C23303c a : list) {
            i &= ~a.mo58437a();
        }
        this.f59106b = i;
    }
}
