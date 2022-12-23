package p911xg;

import com.appboy.support.ValidationUtils;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: xg.x */
public final class C20518x {

    /* renamed from: a */
    public static final Unsafe f51907a;

    /* renamed from: b */
    public static final Class<?> f51908b = C20491a.f51881a;

    /* renamed from: c */
    public static final C20523e f51909c;

    /* renamed from: d */
    public static final boolean f51910d;

    /* renamed from: e */
    public static final boolean f51911e;

    /* renamed from: f */
    public static final long f51912f = ((long) m48160c(byte[].class));

    /* renamed from: g */
    public static final boolean f51913g;

    /* renamed from: xg.x$a */
    public static class C20519a implements PrivilegedExceptionAction<Unsafe> {
        /* renamed from: a */
        public static Unsafe m48180a() throws Exception {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }

        public final /* bridge */ /* synthetic */ Object run() throws Exception {
            return m48180a();
        }
    }

    /* renamed from: xg.x$b */
    public static final class C20520b extends C20523e {
        public C20520b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public final boolean mo52706c(long j, Object obj) {
            if (C20518x.f51913g) {
                if (C20518x.m48166i(j, obj) != 0) {
                    return true;
                }
                return false;
            } else if (C20518x.m48167j(j, obj) != 0) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: d */
        public final byte mo52707d(long j, Object obj) {
            if (C20518x.f51913g) {
                return C20518x.m48166i(j, obj);
            }
            return C20518x.m48167j(j, obj);
        }

        /* renamed from: e */
        public final double mo52708e(long j, Object obj) {
            return Double.longBitsToDouble(mo52719h(j, obj));
        }

        /* renamed from: f */
        public final float mo52709f(long j, Object obj) {
            return Float.intBitsToFloat(mo52718g(j, obj));
        }

        /* renamed from: k */
        public final void mo52710k(Object obj, long j, boolean z) {
            if (C20518x.f51913g) {
                C20518x.m48175r(obj, j, z ? (byte) 1 : 0);
            } else {
                C20518x.m48176s(obj, j, z ? (byte) 1 : 0);
            }
        }

        /* renamed from: l */
        public final void mo52711l(Object obj, long j, byte b) {
            if (C20518x.f51913g) {
                C20518x.m48175r(obj, j, b);
            } else {
                C20518x.m48176s(obj, j, b);
            }
        }

        /* renamed from: m */
        public final void mo52712m(Object obj, long j, double d) {
            mo52723p(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: n */
        public final void mo52713n(Object obj, long j, float f) {
            mo52722o(obj, Float.floatToIntBits(f), j);
        }

        /* renamed from: s */
        public final boolean mo52714s() {
            return false;
        }
    }

    /* renamed from: xg.x$c */
    public static final class C20521c extends C20523e {
        public C20521c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public final boolean mo52706c(long j, Object obj) {
            if (C20518x.f51913g) {
                if (C20518x.m48166i(j, obj) != 0) {
                    return true;
                }
                return false;
            } else if (C20518x.m48167j(j, obj) != 0) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: d */
        public final byte mo52707d(long j, Object obj) {
            if (C20518x.f51913g) {
                return C20518x.m48166i(j, obj);
            }
            return C20518x.m48167j(j, obj);
        }

        /* renamed from: e */
        public final double mo52708e(long j, Object obj) {
            return Double.longBitsToDouble(mo52719h(j, obj));
        }

        /* renamed from: f */
        public final float mo52709f(long j, Object obj) {
            return Float.intBitsToFloat(mo52718g(j, obj));
        }

        /* renamed from: k */
        public final void mo52710k(Object obj, long j, boolean z) {
            if (C20518x.f51913g) {
                C20518x.m48175r(obj, j, z ? (byte) 1 : 0);
            } else {
                C20518x.m48176s(obj, j, z ? (byte) 1 : 0);
            }
        }

        /* renamed from: l */
        public final void mo52711l(Object obj, long j, byte b) {
            if (C20518x.f51913g) {
                C20518x.m48175r(obj, j, b);
            } else {
                C20518x.m48176s(obj, j, b);
            }
        }

        /* renamed from: m */
        public final void mo52712m(Object obj, long j, double d) {
            mo52723p(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: n */
        public final void mo52713n(Object obj, long j, float f) {
            mo52722o(obj, Float.floatToIntBits(f), j);
        }

        /* renamed from: s */
        public final boolean mo52714s() {
            return false;
        }
    }

    /* renamed from: xg.x$d */
    public static final class C20522d extends C20523e {
        public C20522d(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public final boolean mo52706c(long j, Object obj) {
            return this.f51914a.getBoolean(obj, j);
        }

        /* renamed from: d */
        public final byte mo52707d(long j, Object obj) {
            return this.f51914a.getByte(obj, j);
        }

        /* renamed from: e */
        public final double mo52708e(long j, Object obj) {
            return this.f51914a.getDouble(obj, j);
        }

        /* renamed from: f */
        public final float mo52709f(long j, Object obj) {
            return this.f51914a.getFloat(obj, j);
        }

        /* renamed from: k */
        public final void mo52710k(Object obj, long j, boolean z) {
            this.f51914a.putBoolean(obj, j, z);
        }

        /* renamed from: l */
        public final void mo52711l(Object obj, long j, byte b) {
            this.f51914a.putByte(obj, j, b);
        }

        /* renamed from: m */
        public final void mo52712m(Object obj, long j, double d) {
            this.f51914a.putDouble(obj, j, d);
        }

        /* renamed from: n */
        public final void mo52713n(Object obj, long j, float f) {
            this.f51914a.putFloat(obj, j, f);
        }

        /* renamed from: r */
        public final boolean mo52715r() {
            Class<Object> cls = Object.class;
            if (!super.mo52715r()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f51914a.getClass();
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
                C20518x.m48158a(th);
                return false;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0039 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x003a A[SYNTHETIC, Splitter:B:11:0x003a] */
        /* renamed from: s */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo52714s() {
            /*
                r11 = this;
                java.lang.String r0 = "copyMemory"
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                sun.misc.Unsafe r2 = r11.f51914a
                java.lang.String r3 = "getLong"
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 != 0) goto L_0x000f
            L_0x000d:
                r2 = 0
                goto L_0x0037
            L_0x000f:
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
                java.lang.reflect.Field r2 = p911xg.C20518x.m48162e()     // Catch:{ all -> 0x0032 }
                if (r2 != 0) goto L_0x0030
                goto L_0x000d
            L_0x0030:
                r2 = 1
                goto L_0x0037
            L_0x0032:
                r2 = move-exception
                p911xg.C20518x.m48158a(r2)
                goto L_0x000d
            L_0x0037:
                if (r2 != 0) goto L_0x003a
                return r6
            L_0x003a:
                sun.misc.Unsafe r2 = r11.f51914a     // Catch:{ all -> 0x009e }
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
                p911xg.C20518x.m48158a(r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p911xg.C20518x.C20522d.mo52714s():boolean");
        }
    }

    /* renamed from: xg.x$e */
    public static abstract class C20523e {

        /* renamed from: a */
        public Unsafe f51914a;

        public C20523e(Unsafe unsafe) {
            this.f51914a = unsafe;
        }

        /* renamed from: a */
        public final int mo52716a(Class<?> cls) {
            return this.f51914a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int mo52717b(Class<?> cls) {
            return this.f51914a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract boolean mo52706c(long j, Object obj);

        /* renamed from: d */
        public abstract byte mo52707d(long j, Object obj);

        /* renamed from: e */
        public abstract double mo52708e(long j, Object obj);

        /* renamed from: f */
        public abstract float mo52709f(long j, Object obj);

        /* renamed from: g */
        public final int mo52718g(long j, Object obj) {
            return this.f51914a.getInt(obj, j);
        }

        /* renamed from: h */
        public final long mo52719h(long j, Object obj) {
            return this.f51914a.getLong(obj, j);
        }

        /* renamed from: i */
        public final Object mo52720i(long j, Object obj) {
            return this.f51914a.getObject(obj, j);
        }

        /* renamed from: j */
        public final long mo52721j(Field field) {
            return this.f51914a.objectFieldOffset(field);
        }

        /* renamed from: k */
        public abstract void mo52710k(Object obj, long j, boolean z);

        /* renamed from: l */
        public abstract void mo52711l(Object obj, long j, byte b);

        /* renamed from: m */
        public abstract void mo52712m(Object obj, long j, double d);

        /* renamed from: n */
        public abstract void mo52713n(Object obj, long j, float f);

        /* renamed from: o */
        public final void mo52722o(Object obj, int i, long j) {
            this.f51914a.putInt(obj, j, i);
        }

        /* renamed from: p */
        public final void mo52723p(Object obj, long j, long j2) {
            this.f51914a.putLong(obj, j, j2);
        }

        /* renamed from: q */
        public final void mo52724q(Object obj, long j, Object obj2) {
            this.f51914a.putObject(obj, j, obj2);
        }

        /* renamed from: r */
        public boolean mo52715r() {
            Class<Object> cls = Object.class;
            Unsafe unsafe = this.f51914a;
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
                C20518x.m48158a(th);
                return false;
            }
        }

        /* renamed from: s */
        public abstract boolean mo52714s();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009a  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            sun.misc.Unsafe r6 = m48173p()
            f51907a = r6
            java.lang.Class<?> r7 = p911xg.C20491a.f51881a
            f51908b = r7
            java.lang.Class r7 = java.lang.Long.TYPE
            boolean r7 = m48163f(r7)
            java.lang.Class r8 = java.lang.Integer.TYPE
            boolean r8 = m48163f(r8)
            if (r6 != 0) goto L_0x0025
            goto L_0x003b
        L_0x0025:
            boolean r9 = p911xg.C20491a.m48115a()
            if (r9 == 0) goto L_0x003d
            if (r7 == 0) goto L_0x0033
            xg.x$c r7 = new xg.x$c
            r7.<init>(r6)
            goto L_0x0042
        L_0x0033:
            if (r8 == 0) goto L_0x003b
            xg.x$b r7 = new xg.x$b
            r7.<init>(r6)
            goto L_0x0042
        L_0x003b:
            r7 = 0
            goto L_0x0042
        L_0x003d:
            xg.x$d r7 = new xg.x$d
            r7.<init>(r6)
        L_0x0042:
            f51909c = r7
            r6 = 0
            if (r7 != 0) goto L_0x0049
            r8 = 0
            goto L_0x004d
        L_0x0049:
            boolean r8 = r7.mo52714s()
        L_0x004d:
            f51910d = r8
            if (r7 != 0) goto L_0x0053
            r8 = 0
            goto L_0x0057
        L_0x0053:
            boolean r8 = r7.mo52715r()
        L_0x0057:
            f51911e = r8
            java.lang.Class<byte[]> r8 = byte[].class
            int r8 = m48160c(r8)
            long r8 = (long) r8
            f51912f = r8
            m48160c(r5)
            m48161d(r5)
            m48160c(r4)
            m48161d(r4)
            m48160c(r3)
            m48161d(r3)
            m48160c(r2)
            m48161d(r2)
            m48160c(r1)
            m48161d(r1)
            m48160c(r0)
            m48161d(r0)
            java.lang.reflect.Field r0 = m48162e()
            if (r0 == 0) goto L_0x0092
            if (r7 != 0) goto L_0x008f
            goto L_0x0092
        L_0x008f:
            r7.mo52721j(r0)
        L_0x0092:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x009b
            r6 = 1
        L_0x009b:
            f51913g = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p911xg.C20518x.<clinit>():void");
    }

    /* renamed from: a */
    public static void m48158a(Throwable th) {
        Logger logger = Logger.getLogger(C20518x.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* renamed from: b */
    public static <T> T m48159b(Class<T> cls) {
        try {
            return f51907a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    public static int m48160c(Class<?> cls) {
        if (f51911e) {
            return f51909c.mo52716a(cls);
        }
        return -1;
    }

    /* renamed from: d */
    public static void m48161d(Class cls) {
        if (f51911e) {
            f51909c.mo52717b(cls);
        }
    }

    /* renamed from: e */
    public static Field m48162e() {
        Field field;
        Field field2;
        if (C20491a.m48115a()) {
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

    /* renamed from: f */
    public static boolean m48163f(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C20491a.m48115a()) {
            return false;
        }
        try {
            Class<?> cls3 = f51908b;
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

    /* renamed from: g */
    public static boolean m48164g(long j, Object obj) {
        return f51909c.mo52706c(j, obj);
    }

    /* renamed from: h */
    public static byte m48165h(long j, byte[] bArr) {
        return f51909c.mo52707d(f51912f + j, bArr);
    }

    /* renamed from: i */
    public static byte m48166i(long j, Object obj) {
        return (byte) ((m48170m(-4 & j, obj) >>> ((int) (((~j) & 3) << 3))) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
    }

    /* renamed from: j */
    public static byte m48167j(long j, Object obj) {
        return (byte) ((m48170m(-4 & j, obj) >>> ((int) ((j & 3) << 3))) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
    }

    /* renamed from: k */
    public static double m48168k(long j, Object obj) {
        return f51909c.mo52708e(j, obj);
    }

    /* renamed from: l */
    public static float m48169l(long j, Object obj) {
        return f51909c.mo52709f(j, obj);
    }

    /* renamed from: m */
    public static int m48170m(long j, Object obj) {
        return f51909c.mo52718g(j, obj);
    }

    /* renamed from: n */
    public static long m48171n(long j, Object obj) {
        return f51909c.mo52719h(j, obj);
    }

    /* renamed from: o */
    public static Object m48172o(long j, Object obj) {
        return f51909c.mo52720i(j, obj);
    }

    /* renamed from: p */
    public static Unsafe m48173p() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C20519a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: q */
    public static void m48174q(byte[] bArr, long j, byte b) {
        f51909c.mo52711l(bArr, f51912f + j, b);
    }

    /* renamed from: r */
    public static void m48175r(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int m = m48170m(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m48177t(obj, ((255 & b) << i) | (m & (~(ValidationUtils.APPBOY_STRING_MAX_LENGTH << i))), j2);
    }

    /* renamed from: s */
    public static void m48176s(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m48177t(obj, ((255 & b) << i) | (m48170m(j2, obj) & (~(ValidationUtils.APPBOY_STRING_MAX_LENGTH << i))), j2);
    }

    /* renamed from: t */
    public static void m48177t(Object obj, int i, long j) {
        f51909c.mo52722o(obj, i, j);
    }

    /* renamed from: u */
    public static void m48178u(Object obj, long j, long j2) {
        f51909c.mo52723p(obj, j, j2);
    }

    /* renamed from: v */
    public static void m48179v(Object obj, long j, Object obj2) {
        f51909c.mo52724q(obj, j, obj2);
    }
}
