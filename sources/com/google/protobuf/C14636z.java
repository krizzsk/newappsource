package com.google.protobuf;

import com.google.protobuf.C14606i;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import p911xg.C20498h;
import p911xg.C20512t;
import p911xg.C20514v;

/* renamed from: com.google.protobuf.z */
public final class C14636z {

    /* renamed from: a */
    public static final Class<?> f36903a;

    /* renamed from: b */
    public static final C14597c0<?, ?> f36904b = m36737z(false);

    /* renamed from: c */
    public static final C14597c0<?, ?> f36905c = m36737z(true);

    /* renamed from: d */
    public static final C20514v f36906d = new C20514v();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f36903a = cls;
    }

    /* renamed from: A */
    public static <T, FT extends C14606i.C14608b<FT>> void m36692A(C14603g<FT> gVar, T t, T t2) {
        C14606i<FT> b = gVar.mo44069b(t2);
        if (!b.mo44079h()) {
            C14606i<FT> c = gVar.mo44070c(t);
            c.getClass();
            for (int i = 0; i < b.f36853a.mo43994d(); i++) {
                c.mo44083l(b.f36853a.mo43991c(i));
            }
            for (Map.Entry<T, Object> l : b.f36853a.mo43995e()) {
                c.mo44083l(l);
            }
        }
    }

    /* renamed from: B */
    public static boolean m36693B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: C */
    public static void m36694C(int i, List list, C14602f fVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                fVar.f36850a.mo43923P(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).booleanValue();
                    Logger logger = CodedOutputStream.f36799b;
                    i3++;
                }
                fVar.f36850a.mo43925R(i3);
                while (i2 < list.size()) {
                    fVar.f36850a.mo43928y(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            fVar.getClass();
            while (i2 < list.size()) {
                fVar.f36850a.mo43929z(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    /* renamed from: D */
    public static void m36695D(int i, List list, C14602f fVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            fVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                fVar.f36850a.mo43909B(i, (ByteString) list.get(i2));
            }
        }
    }

    /* renamed from: E */
    public static void m36696E(int i, List list, C14602f fVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                fVar.f36850a.mo43923P(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).doubleValue();
                    Logger logger = CodedOutputStream.f36799b;
                    i3 += 8;
                }
                fVar.f36850a.mo43925R(i3);
                while (i2 < list.size()) {
                    CodedOutputStream codedOutputStream = fVar.f36850a;
                    double doubleValue = ((Double) list.get(i2)).doubleValue();
                    codedOutputStream.getClass();
                    codedOutputStream.mo43914G(Double.doubleToRawLongBits(doubleValue));
                    i2++;
                }
                return;
            }
            fVar.getClass();
            while (i2 < list.size()) {
                CodedOutputStream codedOutputStream2 = fVar.f36850a;
                double doubleValue2 = ((Double) list.get(i2)).doubleValue();
                codedOutputStream2.getClass();
                codedOutputStream2.mo43913F(i, Double.doubleToRawLongBits(doubleValue2));
                i2++;
            }
        }
    }

    /* renamed from: F */
    public static void m36697F(int i, List list, C14602f fVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                fVar.f36850a.mo43923P(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m36439k(((Integer) list.get(i4)).intValue());
                }
                fVar.f36850a.mo43925R(i3);
                while (i2 < list.size()) {
                    fVar.f36850a.mo43916I(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            fVar.getClass();
            while (i2 < list.size()) {
                fVar.f36850a.mo43915H(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: G */
    public static void m36698G(int i, List list, C14602f fVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                fVar.f36850a.mo43923P(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    Logger logger = CodedOutputStream.f36799b;
                    i3 += 4;
                }
                fVar.f36850a.mo43925R(i3);
                while (i2 < list.size()) {
                    fVar.f36850a.mo43912E(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            fVar.getClass();
            while (i2 < list.size()) {
                fVar.f36850a.mo43911D(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: H */
    public static void m36699H(int i, List list, C14602f fVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                fVar.f36850a.mo43923P(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    Logger logger = CodedOutputStream.f36799b;
                    i3 += 8;
                }
                fVar.f36850a.mo43925R(i3);
                while (i2 < list.size()) {
                    fVar.f36850a.mo43914G(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            fVar.getClass();
            while (i2 < list.size()) {
                fVar.f36850a.mo43913F(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: I */
    public static void m36700I(int i, List list, C14602f fVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                fVar.f36850a.mo43923P(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).floatValue();
                    Logger logger = CodedOutputStream.f36799b;
                    i3 += 4;
                }
                fVar.f36850a.mo43925R(i3);
                while (i2 < list.size()) {
                    CodedOutputStream codedOutputStream = fVar.f36850a;
                    float floatValue = ((Float) list.get(i2)).floatValue();
                    codedOutputStream.getClass();
                    codedOutputStream.mo43912E(Float.floatToRawIntBits(floatValue));
                    i2++;
                }
                return;
            }
            fVar.getClass();
            while (i2 < list.size()) {
                CodedOutputStream codedOutputStream2 = fVar.f36850a;
                float floatValue2 = ((Float) list.get(i2)).floatValue();
                codedOutputStream2.getClass();
                codedOutputStream2.mo43911D(i, Float.floatToRawIntBits(floatValue2));
                i2++;
            }
        }
    }

    /* renamed from: J */
    public static void m36701J(int i, List list, C14602f fVar, C20512t tVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            fVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                fVar.mo44057h(i, tVar, list.get(i2));
            }
        }
    }

    /* renamed from: K */
    public static void m36702K(int i, List list, C14602f fVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                fVar.f36850a.mo43923P(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m36439k(((Integer) list.get(i4)).intValue());
                }
                fVar.f36850a.mo43925R(i3);
                while (i2 < list.size()) {
                    fVar.f36850a.mo43916I(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            fVar.getClass();
            while (i2 < list.size()) {
                fVar.f36850a.mo43915H(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: L */
    public static void m36703L(int i, List list, C14602f fVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                fVar.f36850a.mo43923P(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m36452x(((Long) list.get(i4)).longValue());
                }
                fVar.f36850a.mo43925R(i3);
                while (i2 < list.size()) {
                    fVar.f36850a.mo43927T(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            fVar.getClass();
            while (i2 < list.size()) {
                fVar.f36850a.mo43926S(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: M */
    public static void m36704M(int i, List list, C14602f fVar, C20512t tVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            fVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                fVar.mo44060k(i, tVar, list.get(i2));
            }
        }
    }

    /* renamed from: N */
    public static void m36705N(int i, List list, C14602f fVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                fVar.f36850a.mo43923P(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    Logger logger = CodedOutputStream.f36799b;
                    i3 += 4;
                }
                fVar.f36850a.mo43925R(i3);
                while (i2 < list.size()) {
                    fVar.f36850a.mo43912E(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            fVar.getClass();
            while (i2 < list.size()) {
                fVar.f36850a.mo43911D(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: O */
    public static void m36706O(int i, List list, C14602f fVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                fVar.f36850a.mo43923P(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    Logger logger = CodedOutputStream.f36799b;
                    i3 += 8;
                }
                fVar.f36850a.mo43925R(i3);
                while (i2 < list.size()) {
                    fVar.f36850a.mo43914G(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            fVar.getClass();
            while (i2 < list.size()) {
                fVar.f36850a.mo43913F(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: P */
    public static void m36707P(int i, List list, C14602f fVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                fVar.f36850a.mo43923P(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = ((Integer) list.get(i4)).intValue();
                    i3 += CodedOutputStream.m36450v((intValue >> 31) ^ (intValue << 1));
                }
                fVar.f36850a.mo43925R(i3);
                while (i2 < list.size()) {
                    CodedOutputStream codedOutputStream = fVar.f36850a;
                    int intValue2 = ((Integer) list.get(i2)).intValue();
                    codedOutputStream.mo43925R((intValue2 >> 31) ^ (intValue2 << 1));
                    i2++;
                }
                return;
            }
            fVar.getClass();
            while (i2 < list.size()) {
                CodedOutputStream codedOutputStream2 = fVar.f36850a;
                int intValue3 = ((Integer) list.get(i2)).intValue();
                codedOutputStream2.mo43924Q(i, (intValue3 >> 31) ^ (intValue3 << 1));
                i2++;
            }
        }
    }

    /* renamed from: Q */
    public static void m36708Q(int i, List list, C14602f fVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                fVar.f36850a.mo43923P(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    i3 += CodedOutputStream.m36452x((longValue >> 63) ^ (longValue << 1));
                }
                fVar.f36850a.mo43925R(i3);
                while (i2 < list.size()) {
                    CodedOutputStream codedOutputStream = fVar.f36850a;
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    codedOutputStream.mo43927T((longValue2 >> 63) ^ (longValue2 << 1));
                    i2++;
                }
                return;
            }
            fVar.getClass();
            while (i2 < list.size()) {
                CodedOutputStream codedOutputStream2 = fVar.f36850a;
                long longValue3 = ((Long) list.get(i2)).longValue();
                codedOutputStream2.mo43926S(i, (longValue3 >> 63) ^ (longValue3 << 1));
                i2++;
            }
        }
    }

    /* renamed from: R */
    public static void m36709R(int i, List list, C14602f fVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            fVar.getClass();
            int i2 = 0;
            if (list instanceof C20498h) {
                C20498h hVar = (C20498h) list;
                while (i2 < list.size()) {
                    Object raw = hVar.getRaw(i2);
                    if (raw instanceof String) {
                        fVar.f36850a.mo43921N(i, (String) raw);
                    } else {
                        fVar.f36850a.mo43909B(i, (ByteString) raw);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                fVar.f36850a.mo43921N(i, (String) list.get(i2));
                i2++;
            }
        }
    }

    /* renamed from: S */
    public static void m36710S(int i, List list, C14602f fVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                fVar.f36850a.mo43923P(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m36450v(((Integer) list.get(i4)).intValue());
                }
                fVar.f36850a.mo43925R(i3);
                while (i2 < list.size()) {
                    fVar.f36850a.mo43925R(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            fVar.getClass();
            while (i2 < list.size()) {
                fVar.f36850a.mo43924Q(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: T */
    public static void m36711T(int i, List list, C14602f fVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                fVar.f36850a.mo43923P(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += CodedOutputStream.m36452x(((Long) list.get(i4)).longValue());
                }
                fVar.f36850a.mo43925R(i3);
                while (i2 < list.size()) {
                    fVar.f36850a.mo43927T(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            fVar.getClass();
            while (i2 < list.size()) {
                fVar.f36850a.mo43926S(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static int m36712a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.m36430b(i) * size;
    }

    /* renamed from: b */
    public static int m36713b(List<?> list) {
        return list.size();
    }

    /* renamed from: c */
    public static int m36714c(int i, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = CodedOutputStream.m36448t(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int size2 = list.get(i2).size();
            t += CodedOutputStream.m36450v(size2) + size2;
        }
        return t;
    }

    /* renamed from: d */
    public static int m36715d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m36448t(i) * size) + m36716e(list);
    }

    /* renamed from: e */
    public static int m36716e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14609j) {
            C14609j jVar = (C14609j) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m36439k(jVar.mo44092n(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m36439k(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    public static int m36717f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.m36434f(i) * size;
    }

    /* renamed from: g */
    public static int m36718g(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    public static int m36719h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.m36435g(i) * size;
    }

    /* renamed from: i */
    public static int m36720i(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    public static int m36721j(int i, List<C14629t> list, C20512t tVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += CodedOutputStream.m36437i(i, list.get(i3), tVar);
        }
        return i2;
    }

    /* renamed from: k */
    public static int m36722k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m36448t(i) * size) + m36723l(list);
    }

    /* renamed from: l */
    public static int m36723l(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14609j) {
            C14609j jVar = (C14609j) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m36439k(jVar.mo44092n(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m36439k(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: m */
    public static int m36724m(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (CodedOutputStream.m36448t(i) * list.size()) + m36725n(list);
    }

    /* renamed from: n */
    public static int m36725n(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14624p) {
            C14624p pVar = (C14624p) list;
            i = 0;
            while (i2 < size) {
                pVar.mo44120m(i2);
                i += CodedOutputStream.m36452x(pVar.f36871c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m36452x(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: o */
    public static int m36726o(int i, C20512t tVar, Object obj) {
        if (obj instanceof C14619m) {
            return CodedOutputStream.m36441m((C14619m) obj) + CodedOutputStream.m36448t(i);
        }
        int t = CodedOutputStream.m36448t(i);
        C14583a aVar = (C14583a) ((C14629t) obj);
        int c = aVar.mo43943c();
        if (c == -1) {
            c = tVar.mo44132d(aVar);
            aVar.mo43944e(c);
        }
        return CodedOutputStream.m36450v(c) + c + t;
    }

    /* renamed from: p */
    public static int m36727p(int i, List<?> list, C20512t tVar) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = CodedOutputStream.m36448t(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C14619m) {
                i2 = CodedOutputStream.m36441m((C14619m) obj);
            } else {
                C14583a aVar = (C14583a) ((C14629t) obj);
                int c = aVar.mo43943c();
                if (c == -1) {
                    c = tVar.mo44132d(aVar);
                    aVar.mo43944e(c);
                }
                i2 = CodedOutputStream.m36450v(c) + c;
            }
            t += i2;
        }
        return t;
    }

    /* renamed from: q */
    public static int m36728q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m36448t(i) * size) + m36729r(list);
    }

    /* renamed from: r */
    public static int m36729r(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14609j) {
            C14609j jVar = (C14609j) list;
            i = 0;
            while (i2 < size) {
                int n = jVar.mo44092n(i2);
                i += CodedOutputStream.m36450v((n >> 31) ^ (n << 1));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i3 = i + CodedOutputStream.m36450v((intValue >> 31) ^ (intValue << 1));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: s */
    public static int m36730s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m36448t(i) * size) + m36731t(list);
    }

    /* renamed from: t */
    public static int m36731t(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14624p) {
            C14624p pVar = (C14624p) list;
            i = 0;
            while (i2 < size) {
                pVar.mo44120m(i2);
                long j = pVar.f36871c[i2];
                i += CodedOutputStream.m36452x((j >> 63) ^ (j << 1));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i3 = i + CodedOutputStream.m36452x((longValue >> 63) ^ (longValue << 1));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: u */
    public static int m36732u(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int t = CodedOutputStream.m36448t(i) * size;
        if (list instanceof C20498h) {
            C20498h hVar = (C20498h) list;
            while (i4 < size) {
                Object raw = hVar.getRaw(i4);
                if (raw instanceof ByteString) {
                    int size2 = ((ByteString) raw).size();
                    i3 = CodedOutputStream.m36450v(size2) + size2;
                } else {
                    i3 = CodedOutputStream.m36447s((String) raw);
                }
                t += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof ByteString) {
                    int size3 = ((ByteString) obj).size();
                    i2 = CodedOutputStream.m36450v(size3) + size3;
                } else {
                    i2 = CodedOutputStream.m36447s((String) obj);
                }
                t += i2;
                i4++;
            }
        }
        return t;
    }

    /* renamed from: v */
    public static int m36733v(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m36448t(i) * size) + m36734w(list);
    }

    /* renamed from: w */
    public static int m36734w(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14609j) {
            C14609j jVar = (C14609j) list;
            i = 0;
            while (i2 < size) {
                i += CodedOutputStream.m36450v(jVar.mo44092n(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m36450v(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: x */
    public static int m36735x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.m36448t(i) * size) + m36736y(list);
    }

    /* renamed from: y */
    public static int m36736y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C14624p) {
            C14624p pVar = (C14624p) list;
            i = 0;
            while (i2 < size) {
                pVar.mo44120m(i2);
                i += CodedOutputStream.m36452x(pVar.f36871c[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + CodedOutputStream.m36452x(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: z */
    public static C14597c0<?, ?> m36737z(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (C14597c0) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }
}
