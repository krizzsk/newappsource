package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C3609z;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* renamed from: com.fyber.inneractive.sdk.protobuf.h1 */
public final class C3507h1 {

    /* renamed from: a */
    public static final Class<?> f12439a;

    /* renamed from: b */
    public static final C3550m1<?, ?> f12440b = m8927a(false);

    /* renamed from: c */
    public static final C3550m1<?, ?> f12441c = m8927a(true);

    /* renamed from: d */
    public static final C3550m1<?, ?> f12442d = new C3556o1();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f12439a = cls;
    }

    /* renamed from: a */
    public static void m8933a(int i, List<Boolean> list, C3599u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C3548m mVar = (C3548m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f12518a.mo15075i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).booleanValue();
                    Logger logger = C3540l.f12507b;
                    i3++;
                }
                mVar.f12518a.mo15071g(i3);
                while (i2 < list.size()) {
                    mVar.f12518a.mo15058a(list.get(i2).booleanValue() ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f12518a.mo15064b(i, list.get(i2).booleanValue());
                i2++;
            }
        }
    }

    /* renamed from: b */
    public static void m8941b(int i, List<Double> list, C3599u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C3548m mVar = (C3548m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f12518a.mo15075i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).doubleValue();
                    Logger logger = C3540l.f12507b;
                    i3 += 8;
                }
                mVar.f12518a.mo15071g(i3);
                while (i2 < list.size()) {
                    C3540l lVar = mVar.f12518a;
                    double doubleValue = list.get(i2).doubleValue();
                    lVar.getClass();
                    lVar.mo15066c(Double.doubleToRawLongBits(doubleValue));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C3540l lVar2 = mVar.f12518a;
                double doubleValue2 = list.get(i2).doubleValue();
                lVar2.getClass();
                lVar2.mo15070f(i, Double.doubleToRawLongBits(doubleValue2));
                i2++;
            }
        }
    }

    /* renamed from: c */
    public static void m8944c(int i, List<Integer> list, C3599u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C3548m mVar = (C3548m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f12518a.mo15075i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C3540l.m9223a(list.get(i4).intValue());
                }
                mVar.f12518a.mo15071g(i3);
                while (i2 < list.size()) {
                    mVar.f12518a.mo15069f(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f12518a.mo15074h(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: d */
    public static void m8947d(int i, List<Integer> list, C3599u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C3548m mVar = (C3548m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f12518a.mo15075i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).intValue();
                    Logger logger = C3540l.f12507b;
                    i3 += 4;
                }
                mVar.f12518a.mo15071g(i3);
                while (i2 < list.size()) {
                    mVar.f12518a.mo15068e(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f12518a.mo15072g(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: e */
    public static void m8950e(int i, List<Long> list, C3599u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C3548m mVar = (C3548m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f12518a.mo15075i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).longValue();
                    Logger logger = C3540l.f12507b;
                    i3 += 8;
                }
                mVar.f12518a.mo15071g(i3);
                while (i2 < list.size()) {
                    mVar.f12518a.mo15066c(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f12518a.mo15070f(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: f */
    public static void m8953f(int i, List<Float> list, C3599u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C3548m mVar = (C3548m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f12518a.mo15075i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).floatValue();
                    Logger logger = C3540l.f12507b;
                    i3 += 4;
                }
                mVar.f12518a.mo15071g(i3);
                while (i2 < list.size()) {
                    C3540l lVar = mVar.f12518a;
                    float floatValue = list.get(i2).floatValue();
                    lVar.getClass();
                    lVar.mo15068e(Float.floatToRawIntBits(floatValue));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C3540l lVar2 = mVar.f12518a;
                float floatValue2 = list.get(i2).floatValue();
                lVar2.getClass();
                lVar2.mo15072g(i, Float.floatToRawIntBits(floatValue2));
                i2++;
            }
        }
    }

    /* renamed from: g */
    public static void m8956g(int i, List<Integer> list, C3599u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C3548m mVar = (C3548m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f12518a.mo15075i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C3540l.m9223a(list.get(i4).intValue());
                }
                mVar.f12518a.mo15071g(i3);
                while (i2 < list.size()) {
                    mVar.f12518a.mo15069f(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f12518a.mo15074h(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: h */
    public static void m8959h(int i, List<Long> list, C3599u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C3548m mVar = (C3548m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f12518a.mo15075i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C3540l.m9232a(list.get(i4).longValue());
                }
                mVar.f12518a.mo15071g(i3);
                while (i2 < list.size()) {
                    mVar.f12518a.mo15067d(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f12518a.mo15073g(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: i */
    public static void m8962i(int i, List<Integer> list, C3599u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C3548m mVar = (C3548m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f12518a.mo15075i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).intValue();
                    Logger logger = C3540l.f12507b;
                    i3 += 4;
                }
                mVar.f12518a.mo15071g(i3);
                while (i2 < list.size()) {
                    mVar.f12518a.mo15068e(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f12518a.mo15072g(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: j */
    public static void m8964j(int i, List<Long> list, C3599u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C3548m mVar = (C3548m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f12518a.mo15075i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).longValue();
                    Logger logger = C3540l.f12507b;
                    i3 += 8;
                }
                mVar.f12518a.mo15071g(i3);
                while (i2 < list.size()) {
                    mVar.f12518a.mo15066c(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f12518a.mo15070f(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: k */
    public static void m8965k(int i, List<Integer> list, C3599u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C3548m mVar = (C3548m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f12518a.mo15075i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C3540l.m9241c(C3540l.m9244d(list.get(i4).intValue()));
                }
                mVar.f12518a.mo15071g(i3);
                while (i2 < list.size()) {
                    mVar.f12518a.mo15071g(C3540l.m9244d(list.get(i2).intValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f12518a.mo15076j(i, C3540l.m9244d(list.get(i2).intValue()));
                i2++;
            }
        }
    }

    /* renamed from: l */
    public static void m8966l(int i, List<Long> list, C3599u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C3548m mVar = (C3548m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f12518a.mo15075i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C3540l.m9232a(C3540l.m9240b(list.get(i4).longValue()));
                }
                mVar.f12518a.mo15071g(i3);
                while (i2 < list.size()) {
                    mVar.f12518a.mo15067d(C3540l.m9240b(list.get(i2).longValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f12518a.mo15073g(i, C3540l.m9240b(list.get(i2).longValue()));
                i2++;
            }
        }
    }

    /* renamed from: m */
    public static void m8967m(int i, List<Integer> list, C3599u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C3548m mVar = (C3548m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f12518a.mo15075i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C3540l.m9241c(list.get(i4).intValue());
                }
                mVar.f12518a.mo15071g(i3);
                while (i2 < list.size()) {
                    mVar.f12518a.mo15071g(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f12518a.mo15076j(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: n */
    public static void m8968n(int i, List<Long> list, C3599u1 u1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            C3548m mVar = (C3548m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (z) {
                mVar.f12518a.mo15075i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C3540l.m9232a(list.get(i4).longValue());
                }
                mVar.f12518a.mo15071g(i3);
                while (i2 < list.size()) {
                    mVar.f12518a.mo15067d(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f12518a.mo15073g(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: d */
    public static int m8946d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3607y) {
            C3607y yVar = (C3607y) list;
            i = 0;
            while (i2 < size) {
                i += C3540l.m9223a(yVar.mo15245e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3540l.m9223a(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e */
    public static int m8949e(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3506h0) {
            C3506h0 h0Var = (C3506h0) list;
            i = 0;
            while (i2 < size) {
                i += C3540l.m9232a(h0Var.mo14919d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3540l.m9232a(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: g */
    public static int m8955g(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3506h0) {
            C3506h0 h0Var = (C3506h0) list;
            i = 0;
            while (i2 < size) {
                i += C3540l.m9232a(C3540l.m9240b(h0Var.mo14919d(i2)));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3540l.m9232a(C3540l.m9240b(list.get(i2).longValue()));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static void m8931a(int i, List<C3508i> list, C3599u1 u1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            C3548m mVar = (C3548m) u1Var;
            mVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                mVar.f12518a.mo15061b(i, list.get(i2));
            }
        }
    }

    /* renamed from: b */
    public static void m8939b(int i, List<String> list, C3599u1 u1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            C3548m mVar = (C3548m) u1Var;
            mVar.getClass();
            int i2 = 0;
            if (list instanceof C3497f0) {
                C3497f0 f0Var = (C3497f0) list;
                while (i2 < list.size()) {
                    Object a = f0Var.mo14820a(i2);
                    if (a instanceof String) {
                        mVar.f12518a.mo15063b(i, (String) a);
                    } else {
                        mVar.f12518a.mo15061b(i, (C3508i) a);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                mVar.f12518a.mo15063b(i, list.get(i2));
                i2++;
            }
        }
    }

    /* renamed from: f */
    public static int m8951f(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int e = m8949e(list);
        if (z) {
            return C3540l.m9241c(e) + e + C3540l.m9237b(i);
        }
        return (C3540l.m9237b(i) * list.size()) + e;
    }

    /* renamed from: i */
    public static int m8961i(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3506h0) {
            C3506h0 h0Var = (C3506h0) list;
            i = 0;
            while (i2 < size) {
                i += C3540l.m9232a(h0Var.mo14919d(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3540l.m9232a(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: j */
    public static int m8963j(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = m8961i(list);
        if (!z) {
            return (C3540l.m9237b(i) * size) + i2;
        }
        return C3540l.m9241c(i2) + i2 + C3540l.m9237b(i);
    }

    /* renamed from: c */
    public static int m8942c(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z) {
            return C3540l.m9238b(i, 0) * size;
        }
        int i2 = size * 4;
        return C3540l.m9241c(i2) + i2 + C3540l.m9237b(i);
    }

    /* renamed from: h */
    public static int m8957h(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int g = m8955g(list);
        if (!z) {
            return (C3540l.m9237b(i) * size) + g;
        }
        return C3540l.m9241c(g) + g + C3540l.m9237b(i);
    }

    /* renamed from: a */
    public static void m8932a(int i, List<?> list, C3599u1 u1Var, C3498f1 f1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            C3548m mVar = (C3548m) u1Var;
            mVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                mVar.mo15103a(i, list.get(i2), f1Var);
            }
        }
    }

    /* renamed from: d */
    public static int m8945d(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z) {
            return C3540l.m9227a(i, 0) * size;
        }
        int i2 = size * 8;
        return C3540l.m9241c(i2) + i2 + C3540l.m9237b(i);
    }

    /* renamed from: c */
    public static int m8943c(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: e */
    public static int m8948e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int d = m8946d(list);
        if (!z) {
            return (C3540l.m9237b(i) * size) + d;
        }
        return C3540l.m9241c(d) + d + C3540l.m9237b(i);
    }

    /* renamed from: f */
    public static int m8952f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3607y) {
            C3607y yVar = (C3607y) list;
            i = 0;
            while (i2 < size) {
                i += C3540l.m9241c(C3540l.m9244d(yVar.mo15245e(i2)));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3540l.m9241c(C3540l.m9244d(list.get(i2).intValue()));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: g */
    public static int m8954g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int f = m8952f(list);
        if (!z) {
            return (C3540l.m9237b(i) * size) + f;
        }
        return C3540l.m9241c(f) + f + C3540l.m9237b(i);
    }

    /* renamed from: i */
    public static int m8960i(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h = m8958h(list);
        if (!z) {
            return (C3540l.m9237b(i) * size) + h;
        }
        return C3540l.m9241c(h) + h + C3540l.m9237b(i);
    }

    /* renamed from: h */
    public static int m8958h(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3607y) {
            C3607y yVar = (C3607y) list;
            i = 0;
            while (i2 < size) {
                i += C3540l.m9241c(yVar.mo15245e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3540l.m9241c(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static int m8926a(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3607y) {
            C3607y yVar = (C3607y) list;
            i = 0;
            while (i2 < size) {
                i += C3540l.m9223a(yVar.mo15245e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3540l.m9223a(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static void m8940b(int i, List<?> list, C3599u1 u1Var, C3498f1 f1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            C3548m mVar = (C3548m) u1Var;
            mVar.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                mVar.f12518a.mo15062b(i, (C3564q0) list.get(i2), f1Var);
            }
        }
    }

    /* renamed from: a */
    public static int m8925a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z) {
            return C3540l.m9231a(i, true) * size;
        }
        return C3540l.m9241c(size) + size + C3540l.m9237b(i);
    }

    /* renamed from: b */
    public static int m8937b(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int a = m8926a(list);
        if (!z) {
            return (C3540l.m9237b(i) * size) + a;
        }
        return C3540l.m9241c(a) + a + C3540l.m9237b(i);
    }

    /* renamed from: a */
    public static int m8922a(int i, Object obj, C3498f1 f1Var) {
        if (obj instanceof C3488d0) {
            return C3540l.m9233a((C3488d0) obj) + C3540l.m9237b(i);
        }
        int b = C3540l.m9237b(i);
        int serializedSize = ((C3473a) ((C3564q0) obj)).getSerializedSize(f1Var);
        return C3540l.m9241c(serializedSize) + serializedSize + b;
    }

    /* renamed from: b */
    public static int m8938b(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: b */
    public static int m8935b(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int b = C3540l.m9237b(i) * size;
        if (list instanceof C3497f0) {
            C3497f0 f0Var = (C3497f0) list;
            while (i4 < size) {
                Object a = f0Var.mo14820a(i4);
                if (a instanceof C3508i) {
                    i3 = C3540l.m9234a((C3508i) a);
                } else {
                    i3 = C3540l.m9235a((String) a);
                }
                b = i3 + b;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof C3508i) {
                    i2 = C3540l.m9234a((C3508i) obj);
                } else {
                    i2 = C3540l.m9235a((String) obj);
                }
                b = i2 + b;
                i4++;
            }
        }
        return b;
    }

    /* renamed from: a */
    public static int m8923a(int i, List<C3508i> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int b = C3540l.m9237b(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            b += C3540l.m9234a(list.get(i2));
        }
        return b;
    }

    /* renamed from: a */
    public static int m8924a(int i, List<C3564q0> list, C3498f1 f1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C3540l.m9229a(i, list.get(i3), f1Var);
        }
        return i2;
    }

    /* renamed from: a */
    public static C3550m1<?, ?> m8927a(boolean z) {
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
            return (C3550m1) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m8934a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static <UT, UB> UB m8929a(int i, List<Integer> list, C3609z.C3613d<?> dVar, UB ub, C3550m1<UT, UB> m1Var) {
        if (dVar == null) {
            return ub;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int intValue = list.get(i3).intValue();
            if (dVar.mo15253a(intValue) != null) {
                if (i3 != i2) {
                    list.set(i2, Integer.valueOf(intValue));
                }
                i2++;
            } else {
                if (ub == null) {
                    ub = m1Var.mo15105a();
                }
                m1Var.mo15116b(ub, i, (long) intValue);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    /* renamed from: b */
    public static int m8936b(int i, List<?> list, C3498f1 f1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int b = C3540l.m9237b(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C3488d0) {
                b = C3540l.m9233a((C3488d0) obj) + b;
            } else {
                int serializedSize = ((C3473a) ((C3564q0) obj)).getSerializedSize(f1Var);
                b = C3540l.m9241c(serializedSize) + serializedSize + b;
            }
        }
        return b;
    }

    /* renamed from: a */
    public static <UT, UB> UB m8930a(int i, List<Integer> list, C3609z.C3614e eVar, UB ub, C3550m1<UT, UB> m1Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (eVar.mo15254a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    if (ub == null) {
                        ub = m1Var.mo15105a();
                    }
                    m1Var.mo15116b(ub, i, (long) intValue);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.mo15254a(intValue2)) {
                    if (ub == null) {
                        ub = m1Var.mo15105a();
                    }
                    m1Var.mo15116b(ub, i, (long) intValue2);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: a */
    public static <UT, UB> UB m8928a(int i, int i2, UB ub, C3550m1<UT, UB> m1Var) {
        if (ub == null) {
            ub = m1Var.mo15105a();
        }
        m1Var.mo15116b(ub, i, (long) i2);
        return ub;
    }
}
