package tg0;

import bf0.C21050d;
import cf0.C21136j;
import cf0.C21144r;
import cf0.C21145s;
import cf0.C21146t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.C23825c;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import lf0.C24236l;
import mf0.C24362h;
import p389bl.C13637c;
import p583jk.C17875h;
import sg0.C24876c;
import uh0.C25081h;

/* renamed from: tg0.f */
public final class C24989f implements C24876c {

    /* renamed from: d */
    public static final List<String> f63129d;

    /* renamed from: a */
    public final String[] f63130a;

    /* renamed from: b */
    public final Set<Integer> f63131b;

    /* renamed from: c */
    public final ArrayList f63132c;

    /* renamed from: tg0.f$a */
    public /* synthetic */ class C24990a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63133a;

        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            iArr[JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            iArr[JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            iArr[JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            f63133a = iArr;
        }
    }

    static {
        String q0 = C23825c.m58520q0(C17875h.m44281E('k', 'o', 't', 'l', 'i', 'n'), "", (String) null, (String) null, (C24236l) null, 62);
        int i = 16;
        List<String> E = C17875h.m44281E(C24362h.m61216k("/Any", q0), C24362h.m61216k("/Nothing", q0), C24362h.m61216k("/Unit", q0), C24362h.m61216k("/Throwable", q0), C24362h.m61216k("/Number", q0), C24362h.m61216k("/Byte", q0), C24362h.m61216k("/Double", q0), C24362h.m61216k("/Float", q0), C24362h.m61216k("/Int", q0), C24362h.m61216k("/Long", q0), C24362h.m61216k("/Short", q0), C24362h.m61216k("/Boolean", q0), C24362h.m61216k("/Char", q0), C24362h.m61216k("/CharSequence", q0), C24362h.m61216k("/String", q0), C24362h.m61216k("/Comparable", q0), C24362h.m61216k("/Enum", q0), C24362h.m61216k("/Array", q0), C24362h.m61216k("/ByteArray", q0), C24362h.m61216k("/DoubleArray", q0), C24362h.m61216k("/FloatArray", q0), C24362h.m61216k("/IntArray", q0), C24362h.m61216k("/LongArray", q0), C24362h.m61216k("/ShortArray", q0), C24362h.m61216k("/BooleanArray", q0), C24362h.m61216k("/CharArray", q0), C24362h.m61216k("/Cloneable", q0), C24362h.m61216k("/Annotation", q0), C24362h.m61216k("/collections/Iterable", q0), C24362h.m61216k("/collections/MutableIterable", q0), C24362h.m61216k("/collections/Collection", q0), C24362h.m61216k("/collections/MutableCollection", q0), C24362h.m61216k("/collections/List", q0), C24362h.m61216k("/collections/MutableList", q0), C24362h.m61216k("/collections/Set", q0), C24362h.m61216k("/collections/MutableSet", q0), C24362h.m61216k("/collections/Map", q0), C24362h.m61216k("/collections/MutableMap", q0), C24362h.m61216k("/collections/Map.Entry", q0), C24362h.m61216k("/collections/MutableMap.MutableEntry", q0), C24362h.m61216k("/collections/Iterator", q0), C24362h.m61216k("/collections/MutableIterator", q0), C24362h.m61216k("/collections/ListIterator", q0), C24362h.m61216k("/collections/MutableListIterator", q0));
        f63129d = E;
        C21145s P0 = C23825c.m58504P0(E);
        int z = C13637c.m34083z(C21136j.m49436X(P0, 10));
        if (z >= 16) {
            i = z;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        Iterator it = P0.iterator();
        while (true) {
            C21146t tVar = (C21146t) it;
            if (tVar.hasNext()) {
                C21144r rVar = (C21144r) tVar.next();
                linkedHashMap.put((String) rVar.f53002b, Integer.valueOf(rVar.f53001a));
            } else {
                return;
            }
        }
    }

    public C24989f(JvmProtoBuf.StringTableTypes stringTableTypes, String[] strArr) {
        Set<Integer> set;
        this.f63130a = strArr;
        List<Integer> i = stringTableTypes.mo59953i();
        if (i.isEmpty()) {
            set = EmptySet.f60175b;
        } else {
            set = C23825c.m58503O0(i);
        }
        this.f63131b = set;
        ArrayList arrayList = new ArrayList();
        List<JvmProtoBuf.StringTableTypes.Record> j = stringTableTypes.mo59954j();
        arrayList.ensureCapacity(j.size());
        for (JvmProtoBuf.StringTableTypes.Record next : j) {
            int r = next.mo59958r();
            int i2 = 0;
            while (i2 < r) {
                i2++;
                arrayList.add(next);
            }
        }
        arrayList.trimToSize();
        C21050d dVar = C21050d.f52856a;
        this.f63132c = arrayList;
    }

    /* renamed from: a */
    public final boolean mo61349a(int i) {
        return this.f63131b.contains(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final String mo61350b(int i) {
        return getString(i);
    }

    public final String getString(int i) {
        String str;
        boolean z;
        JvmProtoBuf.StringTableTypes.Record record = (JvmProtoBuf.StringTableTypes.Record) this.f63132c.get(i);
        if (record.mo59955A()) {
            str = record.mo59961u();
        } else {
            if (record.mo59965y()) {
                List<String> list = f63129d;
                int size = list.size();
                int q = record.mo59957q();
                if (q < 0 || q >= size) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    str = list.get(record.mo59957q());
                }
            }
            str = this.f63130a[i];
        }
        if (record.mo59962v() >= 2) {
            List<Integer> w = record.mo59963w();
            C24362h.m61210e(w, "substringIndexList");
            Integer num = w.get(0);
            Integer num2 = w.get(1);
            C24362h.m61210e(num, "begin");
            if (num.intValue() >= 0) {
                int intValue = num.intValue();
                C24362h.m61210e(num2, "end");
                if (intValue <= num2.intValue() && num2.intValue() <= str.length()) {
                    str = str.substring(num.intValue(), num2.intValue());
                    C24362h.m61210e(str, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
        }
        if (record.mo59959s() >= 2) {
            List<Integer> t = record.mo59960t();
            C24362h.m61210e(t, "replaceCharList");
            C24362h.m61210e(str, "string");
            str = C25081h.m62834E(str, (char) t.get(0).intValue(), (char) t.get(1).intValue());
        }
        JvmProtoBuf.StringTableTypes.Record.Operation p = record.mo59956p();
        if (p == null) {
            p = JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
        }
        int i2 = C24990a.f63133a[p.ordinal()];
        if (i2 == 2) {
            C24362h.m61210e(str, "string");
            str = C25081h.m62834E(str, '$', '.');
        } else if (i2 == 3) {
            if (str.length() >= 2) {
                str = str.substring(1, str.length() - 1);
                C24362h.m61210e(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            str = C25081h.m62834E(str, '$', '.');
        }
        C24362h.m61210e(str, "string");
        return str;
    }
}
