package com.google.android.gms.internal.places;

import com.appboy.support.ValidationUtils;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class zzdy {
    private static final Logger logger = Logger.getLogger(zzdy.class.getName());
    private static final Class<?> zzdw = zzp.zzz();
    private static final boolean zzer = zzdo();
    private static final Unsafe zzkr;
    private static final boolean zzmn;
    private static final boolean zzmo;
    private static final zzd zzmp;
    private static final boolean zzmq = zzdp();
    private static final long zzmr;
    private static final long zzms;
    private static final long zzmt;
    private static final long zzmu;
    private static final long zzmv;
    private static final long zzmw;
    private static final long zzmx;
    private static final long zzmy;
    private static final long zzmz;
    private static final long zzna;
    private static final long zznb;
    private static final long zznc;
    private static final long zznd;
    private static final long zzne;
    private static final int zznf;
    public static final boolean zzng;

    public static abstract class zzd {
        public Unsafe zznh;

        public zzd(Unsafe unsafe) {
            this.zznh = unsafe;
        }

        public abstract void zzb(Object obj, long j, double d);

        public abstract void zzb(Object obj, long j, float f);

        public final void zzb(Object obj, long j, int i) {
            this.zznh.putInt(obj, j, i);
        }

        public abstract void zzb(Object obj, long j, boolean z);

        public abstract void zzf(Object obj, long j, byte b);

        public final int zzk(Object obj, long j) {
            return this.zznh.getInt(obj, j);
        }

        public final long zzl(Object obj, long j) {
            return this.zznh.getLong(obj, j);
        }

        public abstract boolean zzm(Object obj, long j);

        public abstract float zzn(Object obj, long j);

        public abstract double zzo(Object obj, long j);

        public abstract byte zzy(Object obj, long j);

        public final void zzb(Object obj, long j, long j2) {
            this.zznh.putLong(obj, j, j2);
        }
    }

    public static final class zze extends zzd {
        public zze(Unsafe unsafe) {
            super(unsafe);
        }

        public final void zzb(Object obj, long j, boolean z) {
            this.zznh.putBoolean(obj, j, z);
        }

        public final void zzf(Object obj, long j, byte b) {
            this.zznh.putByte(obj, j, b);
        }

        public final boolean zzm(Object obj, long j) {
            return this.zznh.getBoolean(obj, j);
        }

        public final float zzn(Object obj, long j) {
            return this.zznh.getFloat(obj, j);
        }

        public final double zzo(Object obj, long j) {
            return this.zznh.getDouble(obj, j);
        }

        public final byte zzy(Object obj, long j) {
            return this.zznh.getByte(obj, j);
        }

        public final void zzb(Object obj, long j, float f) {
            this.zznh.putFloat(obj, j, f);
        }

        public final void zzb(Object obj, long j, double d) {
            this.zznh.putDouble(obj, j, d);
        }
    }

    static {
        long j;
        boolean z;
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        Unsafe zzdn = zzdn();
        zzkr = zzdn;
        boolean zzk = zzk(Long.TYPE);
        zzmn = zzk;
        boolean zzk2 = zzk(Integer.TYPE);
        zzmo = zzk2;
        zzd zzd2 = null;
        if (zzdn != null) {
            if (!zzp.zzy()) {
                zzd2 = new zze(zzdn);
            } else if (zzk) {
                zzd2 = new zzb(zzdn);
            } else if (zzk2) {
                zzd2 = new zzc(zzdn);
            }
        }
        zzmp = zzd2;
        long zzi = (long) zzi(byte[].class);
        zzmr = zzi;
        zzms = (long) zzi(cls6);
        zzmt = (long) zzj(cls6);
        zzmu = (long) zzi(cls5);
        zzmv = (long) zzj(cls5);
        zzmw = (long) zzi(cls4);
        zzmx = (long) zzj(cls4);
        zzmy = (long) zzi(cls3);
        zzmz = (long) zzj(cls3);
        zzna = (long) zzi(cls2);
        zznb = (long) zzj(cls2);
        zznc = (long) zzi(cls);
        zznd = (long) zzj(cls);
        Field zzdq = zzdq();
        if (zzdq == null || zzd2 == null) {
            j = -1;
        } else {
            j = zzd2.zznh.objectFieldOffset(zzdq);
        }
        zzne = j;
        zznf = (int) (7 & zzi);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        zzng = z;
    }

    private zzdy() {
    }

    public static void zzb(Object obj, long j, int i) {
        zzmp.zzb(obj, j, i);
    }

    private static Field zzc(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void zzd(Object obj, long j, boolean z) {
        zzc(obj, j, z ? (byte) 1 : 0);
    }

    public static boolean zzdl() {
        return zzer;
    }

    public static boolean zzdm() {
        return zzmq;
    }

    public static Unsafe zzdn() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzdx());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean zzdo() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = zzkr;
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
            if (zzp.zzy()) {
                return true;
            }
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
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzdp() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = zzkr;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            if (zzdq() == null) {
                return false;
            }
            if (zzp.zzy()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls3});
            cls2.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{cls3});
            cls2.getMethod("putInt", new Class[]{cls3, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls3});
            cls2.getMethod("putLong", new Class[]{cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls3, cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls, cls3, cls, cls3, cls3});
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static Field zzdq() {
        Field zzc2;
        if (zzp.zzy() && (zzc2 = zzc(Buffer.class, "effectiveDirectAddress")) != null) {
            return zzc2;
        }
        Field zzc3 = zzc(Buffer.class, "address");
        if (zzc3 == null || zzc3.getType() != Long.TYPE) {
            return null;
        }
        return zzc3;
    }

    public static <T> T zzh(Class<T> cls) {
        try {
            return zzkr.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int zzi(Class<?> cls) {
        if (zzer) {
            return zzmp.zznh.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzj(Class<?> cls) {
        if (zzer) {
            return zzmp.zznh.arrayIndexScale(cls);
        }
        return -1;
    }

    public static int zzk(Object obj, long j) {
        return zzmp.zzk(obj, j);
    }

    public static long zzl(Object obj, long j) {
        return zzmp.zzl(obj, j);
    }

    public static boolean zzm(Object obj, long j) {
        return zzmp.zzm(obj, j);
    }

    public static float zzn(Object obj, long j) {
        return zzmp.zzn(obj, j);
    }

    public static double zzo(Object obj, long j) {
        return zzmp.zzo(obj, j);
    }

    public static Object zzp(Object obj, long j) {
        return zzmp.zznh.getObject(obj, j);
    }

    /* access modifiers changed from: private */
    public static byte zzq(Object obj, long j) {
        return (byte) (zzk(obj, -4 & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte zzr(Object obj, long j) {
        return (byte) (zzk(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static boolean zzs(Object obj, long j) {
        return zzq(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean zzt(Object obj, long j) {
        return zzr(obj, j) != 0;
    }

    public static void zzb(Object obj, long j, long j2) {
        zzmp.zzb(obj, j, j2);
    }

    /* access modifiers changed from: private */
    public static void zzc(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        zzb(obj, j2, ((255 & b) << i) | (zzk(obj, j2) & (~(ValidationUtils.APPBOY_STRING_MAX_LENGTH << i))));
    }

    private static boolean zzk(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!zzp.zzy()) {
            return false;
        }
        try {
            Class<?> cls3 = zzdw;
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

    public static final class zzb extends zzd {
        public zzb(Unsafe unsafe) {
            super(unsafe);
        }

        public final void zzb(Object obj, long j, boolean z) {
            if (zzdy.zzng) {
                zzdy.zzc(obj, j, z);
            } else {
                zzdy.zzd(obj, j, z);
            }
        }

        public final void zzf(Object obj, long j, byte b) {
            if (zzdy.zzng) {
                zzdy.zzb(obj, j, b);
            } else {
                zzdy.zzc(obj, j, b);
            }
        }

        public final boolean zzm(Object obj, long j) {
            if (zzdy.zzng) {
                return zzdy.zzs(obj, j);
            }
            return zzdy.zzt(obj, j);
        }

        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        public final byte zzy(Object obj, long j) {
            if (zzdy.zzng) {
                return zzdy.zzq(obj, j);
            }
            return zzdy.zzr(obj, j);
        }

        public final void zzb(Object obj, long j, float f) {
            zzb(obj, j, Float.floatToIntBits(f));
        }

        public final void zzb(Object obj, long j, double d) {
            zzb(obj, j, Double.doubleToLongBits(d));
        }
    }

    public static final class zzc extends zzd {
        public zzc(Unsafe unsafe) {
            super(unsafe);
        }

        public final void zzb(Object obj, long j, boolean z) {
            if (zzdy.zzng) {
                zzdy.zzc(obj, j, z);
            } else {
                zzdy.zzd(obj, j, z);
            }
        }

        public final void zzf(Object obj, long j, byte b) {
            if (zzdy.zzng) {
                zzdy.zzb(obj, j, b);
            } else {
                zzdy.zzc(obj, j, b);
            }
        }

        public final boolean zzm(Object obj, long j) {
            if (zzdy.zzng) {
                return zzdy.zzs(obj, j);
            }
            return zzdy.zzt(obj, j);
        }

        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        public final byte zzy(Object obj, long j) {
            if (zzdy.zzng) {
                return zzdy.zzq(obj, j);
            }
            return zzdy.zzr(obj, j);
        }

        public final void zzb(Object obj, long j, float f) {
            zzb(obj, j, Float.floatToIntBits(f));
        }

        public final void zzb(Object obj, long j, double d) {
            zzb(obj, j, Double.doubleToLongBits(d));
        }
    }

    public static void zzb(Object obj, long j, boolean z) {
        zzmp.zzb(obj, j, z);
    }

    public static void zzb(Object obj, long j, float f) {
        zzmp.zzb(obj, j, f);
    }

    /* access modifiers changed from: private */
    public static void zzc(Object obj, long j, boolean z) {
        zzb(obj, j, z ? (byte) 1 : 0);
    }

    public static void zzb(Object obj, long j, double d) {
        zzmp.zzb(obj, j, d);
    }

    public static void zzb(Object obj, long j, Object obj2) {
        zzmp.zznh.putObject(obj, j, obj2);
    }

    public static byte zzb(byte[] bArr, long j) {
        return zzmp.zzy(bArr, zzmr + j);
    }

    public static void zzb(byte[] bArr, long j, byte b) {
        zzmp.zzf(bArr, zzmr + j, b);
    }

    /* access modifiers changed from: private */
    public static void zzb(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int zzk = zzk(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zzb(obj, j2, ((255 & b) << i) | (zzk & (~(ValidationUtils.APPBOY_STRING_MAX_LENGTH << i))));
    }
}
