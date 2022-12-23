package ui0;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: ui0.a */
public final class C25082a {

    /* renamed from: a */
    public static final C25083a f63288a = new C25083a();

    /* renamed from: ui0.a$a */
    public static class C25083a implements Comparator {
        public final int compare(Object obj, Object obj2) {
            if (obj == null && obj2 == null) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            if (obj instanceof List) {
                return C25082a.m62844h((List) obj, (List) obj2);
            }
            if (obj instanceof Set) {
                return C25082a.m62846j((Set) obj, (Set) obj2);
            }
            if (obj instanceof Map) {
                return C25082a.m62845i((Map) obj, (Map) obj2);
            }
            if (obj instanceof byte[]) {
                return C25082a.m62849m((byte[]) obj, (byte[]) obj2);
            }
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    /* renamed from: a */
    public static int m62837a(byte b, byte b2) {
        if (b < b2) {
            return -1;
        }
        return b2 < b ? 1 : 0;
    }

    /* renamed from: b */
    public static int m62838b(double d, double d2) {
        if (d < d2) {
            return -1;
        }
        return d2 < d ? 1 : 0;
    }

    /* renamed from: c */
    public static int m62839c(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i2 < i ? 1 : 0;
    }

    /* renamed from: d */
    public static int m62840d(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j2 < j ? 1 : 0;
    }

    /* renamed from: e */
    public static int m62841e(Enum enumR, Enum enumR2) {
        return enumR.compareTo(enumR2);
    }

    /* renamed from: f */
    public static int m62842f(Object obj, Object obj2) {
        if (obj instanceof Comparable) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
        if (obj instanceof List) {
            return m62844h((List) obj, (List) obj2);
        }
        if (obj instanceof Set) {
            return m62846j((Set) obj, (Set) obj2);
        }
        if (obj instanceof Map) {
            return m62845i((Map) obj, (Map) obj2);
        }
        if (obj instanceof byte[]) {
            return m62849m((byte[]) obj, (byte[]) obj2);
        }
        StringBuilder k = C13555b.m33972k("Cannot compare objects of type ");
        k.append(obj.getClass());
        throw new IllegalArgumentException(k.toString());
    }

    /* renamed from: g */
    public static int m62843g(String str, String str2) {
        return str.compareTo(str2);
    }

    /* renamed from: h */
    public static int m62844h(List list, List list2) {
        int c = m62839c(list.size(), list2.size());
        if (c != 0) {
            return c;
        }
        for (int i = 0; i < list.size(); i++) {
            int compare = f63288a.compare(list.get(i), list2.get(i));
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    /* renamed from: i */
    public static int m62845i(Map map, Map map2) {
        int c = m62839c(map.size(), map2.size());
        if (c != 0) {
            return c;
        }
        C25083a aVar = f63288a;
        TreeMap treeMap = new TreeMap(aVar);
        treeMap.putAll(map);
        Iterator it = treeMap.entrySet().iterator();
        TreeMap treeMap2 = new TreeMap(aVar);
        treeMap2.putAll(map2);
        Iterator it2 = treeMap2.entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            C25083a aVar2 = f63288a;
            int compare = aVar2.compare(entry.getKey(), entry2.getKey());
            if (compare != 0) {
                return compare;
            }
            int compare2 = aVar2.compare(entry.getValue(), entry2.getValue());
            if (compare2 != 0) {
                return compare2;
            }
        }
        return 0;
    }

    /* renamed from: j */
    public static int m62846j(Set set, Set set2) {
        int c = m62839c(set.size(), set2.size());
        if (c != 0) {
            return c;
        }
        C25083a aVar = f63288a;
        TreeSet treeSet = new TreeSet(aVar);
        treeSet.addAll(set);
        TreeSet treeSet2 = new TreeSet(aVar);
        treeSet2.addAll(set2);
        Iterator it = treeSet.iterator();
        Iterator it2 = treeSet2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compare = f63288a.compare(it.next(), it2.next());
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    /* renamed from: k */
    public static int m62847k(short s, short s2) {
        if (s < s2) {
            return -1;
        }
        return s2 < s ? 1 : 0;
    }

    /* renamed from: l */
    public static int m62848l(boolean z, boolean z2) {
        return Boolean.valueOf(z).compareTo(Boolean.valueOf(z2));
    }

    /* renamed from: m */
    public static int m62849m(byte[] bArr, byte[] bArr2) {
        int c = m62839c(bArr.length, bArr2.length);
        if (c != 0) {
            return c;
        }
        for (int i = 0; i < bArr.length; i++) {
            int a = m62837a(bArr[i], bArr2[i]);
            if (a != 0) {
                return a;
            }
        }
        return 0;
    }

    /* renamed from: n */
    public static ByteBuffer m62850n(ByteBuffer byteBuffer) {
        byte[] bArr;
        if (byteBuffer == null) {
            return null;
        }
        if (m62852p(byteBuffer)) {
            return byteBuffer;
        }
        if (m62852p(byteBuffer)) {
            bArr = byteBuffer.array();
        } else {
            byte[] bArr2 = new byte[byteBuffer.remaining()];
            int remaining = byteBuffer.remaining();
            System.arraycopy(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), bArr2, 0, remaining);
            bArr = bArr2;
        }
        return ByteBuffer.wrap(bArr);
    }

    /* renamed from: o */
    public static void m62851o(ByteBuffer byteBuffer, StringBuilder sb) {
        int i;
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset();
        int position = byteBuffer.position() + arrayOffset;
        int limit = byteBuffer.limit() + arrayOffset;
        if (limit - position > 128) {
            i = position + RecyclerView.C1119a0.FLAG_IGNORE;
        } else {
            i = limit;
        }
        for (int i2 = position; i2 < i; i2++) {
            if (i2 > position) {
                sb.append(" ");
            }
            sb.append(Integer.toHexString((array[i2] | 256) & 511).toUpperCase().substring(1));
        }
        if (limit != i) {
            sb.append("...");
        }
    }

    /* renamed from: p */
    public static boolean m62852p(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray() && byteBuffer.position() == 0 && byteBuffer.arrayOffset() == 0 && byteBuffer.remaining() == byteBuffer.capacity()) {
            return true;
        }
        return false;
    }
}
