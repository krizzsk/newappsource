package com.fyber.inneractive.sdk.protobuf;

import com.appboy.support.ValidationUtils;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.fyber.inneractive.sdk.protobuf.r1 */
public final class C3569r1 {

    /* renamed from: a */
    public static final Unsafe f12539a;

    /* renamed from: b */
    public static final Class<?> f12540b = C3487d.f12411a;

    /* renamed from: c */
    public static final boolean f12541c;

    /* renamed from: d */
    public static final boolean f12542d;

    /* renamed from: e */
    public static final C3573d f12543e;

    /* renamed from: f */
    public static final boolean f12544f;

    /* renamed from: g */
    public static final boolean f12545g;

    /* renamed from: h */
    public static final long f12546h = ((long) m9418a((Class<?>) byte[].class));

    /* renamed from: i */
    public static final long f12547i;

    /* renamed from: j */
    public static final boolean f12548j;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.r1$d */
    public static abstract class C3573d {

        /* renamed from: a */
        public Unsafe f12549a;

        public C3573d(Unsafe unsafe) {
            this.f12549a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo15167a(long j);

        /* renamed from: a */
        public abstract void mo15168a(long j, byte[] bArr, long j2, long j3);

        /* renamed from: a */
        public abstract void mo15169a(Object obj, long j, byte b);

        /* renamed from: a */
        public abstract void mo15170a(Object obj, long j, double d);

        /* renamed from: a */
        public abstract void mo15171a(Object obj, long j, float f);

        /* renamed from: a */
        public abstract void mo15172a(Object obj, long j, boolean z);

        /* renamed from: a */
        public boolean mo15178a() {
            Class<Object> cls = Object.class;
            Unsafe unsafe = this.f12549a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls2 = unsafe.getClass();
                cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
                cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
                Class cls3 = Long.TYPE;
                cls2.getMethod("getInt", new Class[]{cls, cls3});
                cls2.getMethod("putInt", new Class[]{cls, cls3, Integer.TYPE});
                cls2.getMethod("getLong", new Class[]{cls, cls3});
                cls2.getMethod("putLong", new Class[]{cls, cls3, cls3});
                cls2.getMethod("getObject", new Class[]{cls, cls3});
                cls2.getMethod("putObject", new Class[]{cls, cls3, cls});
                return true;
            } catch (Throwable th) {
                C3569r1.m9428a(th);
                return false;
            }
        }

        /* renamed from: a */
        public abstract boolean mo15173a(Object obj, long j);

        /* renamed from: b */
        public abstract byte mo15174b(Object obj, long j);

        /* renamed from: b */
        public abstract boolean mo15175b();

        /* renamed from: c */
        public abstract double mo15176c(Object obj, long j);

        /* renamed from: d */
        public abstract float mo15177d(Object obj, long j);
    }

    static {
        Unsafe unsafe;
        boolean z;
        boolean z2;
        long j;
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        C3573d dVar = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C3566q1());
        } catch (Throwable unused) {
            unsafe = null;
        }
        f12539a = unsafe;
        boolean c = m9435c(Long.TYPE);
        f12541c = c;
        boolean c2 = m9435c(Integer.TYPE);
        f12542d = c2;
        if (unsafe != null) {
            if (!C3487d.m8743a()) {
                dVar = new C3572c(unsafe);
            } else if (c) {
                dVar = new C3571b(unsafe);
            } else if (c2) {
                dVar = new C3570a(unsafe);
            }
        }
        f12543e = dVar;
        boolean z3 = false;
        if (dVar == null) {
            z = false;
        } else {
            z = dVar.mo15175b();
        }
        f12544f = z;
        if (dVar == null) {
            z2 = false;
        } else {
            z2 = dVar.mo15178a();
        }
        f12545g = z2;
        m9418a((Class<?>) cls6);
        m9431b(cls6);
        m9418a((Class<?>) cls5);
        m9431b(cls5);
        m9418a((Class<?>) cls4);
        m9431b(cls4);
        m9418a((Class<?>) cls3);
        m9431b(cls3);
        m9418a((Class<?>) cls2);
        m9431b(cls2);
        m9418a((Class<?>) cls);
        m9431b(cls);
        Field a = m9420a();
        if (a == null || dVar == null) {
            j = -1;
        } else {
            j = dVar.f12549a.objectFieldOffset(a);
        }
        f12547i = j;
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z3 = true;
        }
        f12548j = z3;
    }

    /* renamed from: a */
    public static int m9418a(Class<?> cls) {
        if (f12545g) {
            return f12543e.f12549a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: b */
    public static int m9431b(Class<?> cls) {
        if (f12545g) {
            return f12543e.f12549a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: c */
    public static boolean m9435c(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C3487d.m8743a()) {
            return false;
        }
        try {
            Class<?> cls3 = f12540b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static byte m9436d(Object obj, long j) {
        return (byte) ((m9437e(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
    }

    /* renamed from: e */
    public static int m9437e(Object obj, long j) {
        return f12543e.f12549a.getInt(obj, j);
    }

    /* renamed from: f */
    public static long m9438f(Object obj, long j) {
        return f12543e.f12549a.getLong(obj, j);
    }

    /* renamed from: g */
    public static Object m9439g(Object obj, long j) {
        return f12543e.f12549a.getObject(obj, j);
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.r1$a */
    public static final class C3570a extends C3573d {
        public C3570a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public void mo15169a(Object obj, long j, byte b) {
            if (C3569r1.f12548j) {
                C3569r1.m9421a(obj, j, b);
            } else {
                C3569r1.m9432b(obj, j, b);
            }
        }

        /* renamed from: b */
        public byte mo15174b(Object obj, long j) {
            if (C3569r1.f12548j) {
                return C3569r1.m9434c(obj, j);
            }
            return C3569r1.m9436d(obj, j);
        }

        /* renamed from: b */
        public boolean mo15175b() {
            return false;
        }

        /* renamed from: c */
        public double mo15176c(Object obj, long j) {
            return Double.longBitsToDouble(this.f12549a.getLong(obj, j));
        }

        /* renamed from: d */
        public float mo15177d(Object obj, long j) {
            return Float.intBitsToFloat(this.f12549a.getInt(obj, j));
        }

        /* renamed from: a */
        public boolean mo15173a(Object obj, long j) {
            if (C3569r1.f12548j) {
                return C3569r1.m9430a(obj, j);
            }
            return C3569r1.m9433b(obj, j);
        }

        /* renamed from: a */
        public void mo15172a(Object obj, long j, boolean z) {
            if (C3569r1.f12548j) {
                C3569r1.m9421a(obj, j, z ? (byte) 1 : 0);
            } else {
                C3569r1.m9432b(obj, j, z ? (byte) 1 : 0);
            }
        }

        /* renamed from: a */
        public void mo15171a(Object obj, long j, float f) {
            this.f12549a.putInt(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public void mo15170a(Object obj, long j, double d) {
            this.f12549a.putLong(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public byte mo15167a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo15168a(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.r1$b */
    public static final class C3571b extends C3573d {
        public C3571b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public void mo15169a(Object obj, long j, byte b) {
            if (C3569r1.f12548j) {
                C3569r1.m9421a(obj, j, b);
            } else {
                C3569r1.m9432b(obj, j, b);
            }
        }

        /* renamed from: b */
        public byte mo15174b(Object obj, long j) {
            if (C3569r1.f12548j) {
                return C3569r1.m9434c(obj, j);
            }
            return C3569r1.m9436d(obj, j);
        }

        /* renamed from: b */
        public boolean mo15175b() {
            return false;
        }

        /* renamed from: c */
        public double mo15176c(Object obj, long j) {
            return Double.longBitsToDouble(this.f12549a.getLong(obj, j));
        }

        /* renamed from: d */
        public float mo15177d(Object obj, long j) {
            return Float.intBitsToFloat(this.f12549a.getInt(obj, j));
        }

        /* renamed from: a */
        public boolean mo15173a(Object obj, long j) {
            if (C3569r1.f12548j) {
                return C3569r1.m9430a(obj, j);
            }
            return C3569r1.m9433b(obj, j);
        }

        /* renamed from: a */
        public void mo15172a(Object obj, long j, boolean z) {
            if (C3569r1.f12548j) {
                C3569r1.m9421a(obj, j, z ? (byte) 1 : 0);
            } else {
                C3569r1.m9432b(obj, j, z ? (byte) 1 : 0);
            }
        }

        /* renamed from: a */
        public void mo15171a(Object obj, long j, float f) {
            this.f12549a.putInt(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public void mo15170a(Object obj, long j, double d) {
            this.f12549a.putLong(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public byte mo15167a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo15168a(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public static void m9424a(Object obj, long j, int i) {
        f12543e.f12549a.putInt(obj, j, i);
    }

    /* renamed from: b */
    public static void m9432b(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m9424a(obj, j2, ((255 & b) << i) | (m9437e(obj, j2) & (~(ValidationUtils.APPBOY_STRING_MAX_LENGTH << i))));
    }

    /* renamed from: a */
    public static void m9425a(Object obj, long j, long j2) {
        f12543e.f12549a.putLong(obj, j, j2);
    }

    /* renamed from: b */
    public static boolean m9433b(Object obj, long j) {
        return m9436d(obj, j) != 0;
    }

    /* renamed from: a */
    public static void m9427a(Object obj, long j, boolean z) {
        f12543e.mo15172a(obj, j, z);
    }

    /* renamed from: a */
    public static void m9423a(Object obj, long j, float f) {
        f12543e.mo15171a(obj, j, f);
    }

    /* renamed from: a */
    public static void m9422a(Object obj, long j, double d) {
        f12543e.mo15170a(obj, j, d);
    }

    /* renamed from: a */
    public static void m9426a(Object obj, long j, Object obj2) {
        f12543e.f12549a.putObject(obj, j, obj2);
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.r1$c */
    public static final class C3572c extends C3573d {
        public C3572c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public boolean mo15178a() {
            Class<Object> cls = Object.class;
            if (!super.mo15178a()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f12549a.getClass();
                Class cls3 = Long.TYPE;
                cls2.getMethod("getByte", new Class[]{cls, cls3});
                cls2.getMethod("putByte", new Class[]{cls, cls3, Byte.TYPE});
                cls2.getMethod("getBoolean", new Class[]{cls, cls3});
                cls2.getMethod("putBoolean", new Class[]{cls, cls3, Boolean.TYPE});
                cls2.getMethod("getFloat", new Class[]{cls, cls3});
                cls2.getMethod("putFloat", new Class[]{cls, cls3, Float.TYPE});
                cls2.getMethod("getDouble", new Class[]{cls, cls3});
                cls2.getMethod("putDouble", new Class[]{cls, cls3, Double.TYPE});
                return true;
            } catch (Throwable th) {
                C3569r1.m9428a(th);
                return false;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0039 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x003a A[SYNTHETIC, Splitter:B:11:0x003a] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo15175b() {
            /*
                r11 = this;
                java.lang.String r0 = "copyMemory"
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                sun.misc.Unsafe r2 = r11.f12549a
                java.lang.String r3 = "getLong"
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 != 0) goto L_0x000e
                goto L_0x002e
            L_0x000e:
                java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x0032 }
                java.lang.String r7 = "objectFieldOffset"
                java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ all -> 0x0032 }
                java.lang.Class<java.lang.reflect.Field> r9 = java.lang.reflect.Field.class
                r8[r6] = r9     // Catch:{ all -> 0x0032 }
                r2.getMethod(r7, r8)     // Catch:{ all -> 0x0032 }
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ all -> 0x0032 }
                r7[r6] = r1     // Catch:{ all -> 0x0032 }
                java.lang.Class r8 = java.lang.Long.TYPE     // Catch:{ all -> 0x0032 }
                r7[r5] = r8     // Catch:{ all -> 0x0032 }
                r2.getMethod(r3, r7)     // Catch:{ all -> 0x0032 }
                java.lang.reflect.Field r2 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9420a()     // Catch:{ all -> 0x0032 }
                if (r2 != 0) goto L_0x0030
            L_0x002e:
                r2 = 0
                goto L_0x0037
            L_0x0030:
                r2 = 1
                goto L_0x0037
            L_0x0032:
                r2 = move-exception
                com.fyber.inneractive.sdk.protobuf.C3569r1.m9428a((java.lang.Throwable) r2)
                goto L_0x002e
            L_0x0037:
                if (r2 != 0) goto L_0x003a
                return r6
            L_0x003a:
                sun.misc.Unsafe r2 = r11.f12549a     // Catch:{ all -> 0x009e }
                java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x009e }
                java.lang.String r7 = "getByte"
                java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ all -> 0x009e }
                java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ all -> 0x009e }
                r8[r6] = r9     // Catch:{ all -> 0x009e }
                r2.getMethod(r7, r8)     // Catch:{ all -> 0x009e }
                java.lang.String r7 = "putByte"
                java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ all -> 0x009e }
                r8[r6] = r9     // Catch:{ all -> 0x009e }
                java.lang.Class r10 = java.lang.Byte.TYPE     // Catch:{ all -> 0x009e }
                r8[r5] = r10     // Catch:{ all -> 0x009e }
                r2.getMethod(r7, r8)     // Catch:{ all -> 0x009e }
                java.lang.String r7 = "getInt"
                java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ all -> 0x009e }
                r8[r6] = r9     // Catch:{ all -> 0x009e }
                r2.getMethod(r7, r8)     // Catch:{ all -> 0x009e }
                java.lang.String r7 = "putInt"
                java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ all -> 0x009e }
                r8[r6] = r9     // Catch:{ all -> 0x009e }
                java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x009e }
                r8[r5] = r10     // Catch:{ all -> 0x009e }
                r2.getMethod(r7, r8)     // Catch:{ all -> 0x009e }
                java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x009e }
                r7[r6] = r9     // Catch:{ all -> 0x009e }
                r2.getMethod(r3, r7)     // Catch:{ all -> 0x009e }
                java.lang.String r3 = "putLong"
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ all -> 0x009e }
                r7[r6] = r9     // Catch:{ all -> 0x009e }
                r7[r5] = r9     // Catch:{ all -> 0x009e }
                r2.getMethod(r3, r7)     // Catch:{ all -> 0x009e }
                r3 = 3
                java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ all -> 0x009e }
                r7[r6] = r9     // Catch:{ all -> 0x009e }
                r7[r5] = r9     // Catch:{ all -> 0x009e }
                r7[r4] = r9     // Catch:{ all -> 0x009e }
                r2.getMethod(r0, r7)     // Catch:{ all -> 0x009e }
                r7 = 5
                java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ all -> 0x009e }
                r7[r6] = r1     // Catch:{ all -> 0x009e }
                r7[r5] = r9     // Catch:{ all -> 0x009e }
                r7[r4] = r1     // Catch:{ all -> 0x009e }
                r7[r3] = r9     // Catch:{ all -> 0x009e }
                r1 = 4
                r7[r1] = r9     // Catch:{ all -> 0x009e }
                r2.getMethod(r0, r7)     // Catch:{ all -> 0x009e }
                return r5
            L_0x009e:
                r0 = move-exception
                com.fyber.inneractive.sdk.protobuf.C3569r1.m9428a((java.lang.Throwable) r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3569r1.C3572c.mo15175b():boolean");
        }

        /* renamed from: c */
        public double mo15176c(Object obj, long j) {
            return this.f12549a.getDouble(obj, j);
        }

        /* renamed from: d */
        public float mo15177d(Object obj, long j) {
            return this.f12549a.getFloat(obj, j);
        }

        /* renamed from: a */
        public void mo15169a(Object obj, long j, byte b) {
            this.f12549a.putByte(obj, j, b);
        }

        /* renamed from: a */
        public boolean mo15173a(Object obj, long j) {
            return this.f12549a.getBoolean(obj, j);
        }

        /* renamed from: a */
        public void mo15172a(Object obj, long j, boolean z) {
            this.f12549a.putBoolean(obj, j, z);
        }

        /* renamed from: a */
        public void mo15171a(Object obj, long j, float f) {
            this.f12549a.putFloat(obj, j, f);
        }

        /* renamed from: a */
        public void mo15170a(Object obj, long j, double d) {
            this.f12549a.putDouble(obj, j, d);
        }

        /* renamed from: a */
        public byte mo15167a(long j) {
            return this.f12549a.getByte(j);
        }

        /* renamed from: b */
        public byte mo15174b(Object obj, long j) {
            return this.f12549a.getByte(obj, j);
        }

        /* renamed from: a */
        public void mo15168a(long j, byte[] bArr, long j2, long j3) {
            this.f12549a.copyMemory((Object) null, j, bArr, C3569r1.f12546h + j2, j3);
        }
    }

    /* renamed from: c */
    public static byte m9434c(Object obj, long j) {
        return (byte) ((m9437e(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
    }

    /* renamed from: a */
    public static byte m9417a(byte[] bArr, long j) {
        return f12543e.mo15174b(bArr, f12546h + j);
    }

    /* renamed from: a */
    public static void m9429a(byte[] bArr, long j, byte b) {
        f12543e.mo15169a((Object) bArr, f12546h + j, b);
    }

    /* renamed from: a */
    public static long m9419a(ByteBuffer byteBuffer) {
        C3573d dVar = f12543e;
        return dVar.f12549a.getLong(byteBuffer, f12547i);
    }

    /* renamed from: a */
    public static Field m9420a() {
        Field field;
        Field field2;
        if (C3487d.m8743a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    /* renamed from: a */
    public static void m9421a(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int e = m9437e(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m9424a(obj, j2, ((255 & b) << i) | (e & (~(ValidationUtils.APPBOY_STRING_MAX_LENGTH << i))));
    }

    /* renamed from: a */
    public static boolean m9430a(Object obj, long j) {
        return m9434c(obj, j) != 0;
    }

    /* renamed from: a */
    public static void m9428a(Throwable th) {
        Logger logger = Logger.getLogger(C3569r1.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }
}
