package com.google.android.gms.internal.mlkit_common;

import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

final class zzm {
    private static final Method zza;
    private static final Method zzb;
    private static final Method zzc;
    private static final Field zzd;
    private static final Field zze;
    private static final Field zzf;
    private static final Object zzg;
    private static final Throwable zzh;

    static {
        Field field;
        Field field2;
        Method method;
        Method method2;
        Method method3;
        Field field3;
        Object obj;
        Throwable th;
        try {
            Class<?> cls = Class.forName("libcore.io.Libcore");
            Class<?> cls2 = Class.forName("libcore.io.StructStat");
            Class<?> cls3 = Class.forName("libcore.io.OsConstants");
            Class<?> cls4 = Class.forName("libcore.io.ForwardingOs");
            method3 = cls3.getDeclaredMethod("S_ISLNK", new Class[]{Integer.TYPE});
            try {
                method3.setAccessible(true);
                method = cls4.getDeclaredMethod("lstat", new Class[]{String.class});
            } catch (Throwable th2) {
                th = th2;
                field3 = null;
                method2 = null;
                method = method2;
                field2 = method;
                field = field2;
                th = th;
                obj = field;
                zza = method3;
                zzb = method;
                zzc = method2;
                zzd = field2;
                zze = field;
                zzf = field3;
                zzg = obj;
                zzh = th;
            }
            try {
                method2 = cls4.getDeclaredMethod("fstat", new Class[]{FileDescriptor.class});
            } catch (Throwable th3) {
                th = th3;
                field3 = null;
                method2 = null;
                field2 = null;
                field = field2;
                th = th;
                obj = field;
                zza = method3;
                zzb = method;
                zzc = method2;
                zzd = field2;
                zze = field;
                zzf = field3;
                zzg = obj;
                zzh = th;
            }
            try {
                Field declaredField = cls.getDeclaredField("os");
                declaredField.setAccessible(true);
                obj = declaredField.get(cls);
            } catch (Throwable th4) {
                th = th4;
                field3 = null;
                field2 = null;
                field = field2;
                th = th;
                obj = field;
                zza = method3;
                zzb = method;
                zzc = method2;
                zzd = field2;
                zze = field;
                zzf = field3;
                zzg = obj;
                zzh = th;
            }
            try {
                field2 = cls2.getField("st_dev");
                try {
                    field = cls2.getField("st_ino");
                    try {
                        field3 = cls2.getField("st_mode");
                    } catch (Throwable th5) {
                        Throwable th6 = th5;
                        field3 = null;
                        th = th6;
                        zza = method3;
                        zzb = method;
                        zzc = method2;
                        zzd = field2;
                        zze = field;
                        zzf = field3;
                        zzg = obj;
                        zzh = th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    field = null;
                    th = th;
                    field3 = field;
                    zza = method3;
                    zzb = method;
                    zzc = method2;
                    zzd = field2;
                    zze = field;
                    zzf = field3;
                    zzg = obj;
                    zzh = th;
                }
                try {
                    field2.setAccessible(true);
                    field.setAccessible(true);
                    field3.setAccessible(true);
                    zza = method3;
                    zzb = method;
                    zzc = method2;
                    zzd = field2;
                    zze = field;
                    zzf = field3;
                    zzg = obj;
                    zzh = null;
                } catch (Throwable th8) {
                    th = th8;
                    zza = method3;
                    zzb = method;
                    zzc = method2;
                    zzd = field2;
                    zze = field;
                    zzf = field3;
                    zzg = obj;
                    zzh = th;
                }
            } catch (Throwable th9) {
                th = th9;
                field2 = null;
                field = null;
                th = th;
                field3 = field;
                zza = method3;
                zzb = method;
                zzc = method2;
                zzd = field2;
                zze = field;
                zzf = field3;
                zzg = obj;
                zzh = th;
            }
        } catch (Throwable th10) {
            th = th10;
            field3 = null;
            method3 = null;
            method2 = null;
            method = method2;
            field2 = method;
            field = field2;
            th = th;
            obj = field;
            zza = method3;
            zzb = method;
            zzc = method2;
            zzd = field2;
            zze = field;
            zzf = field3;
            zzg = obj;
            zzh = th;
        }
    }

    public static zzo zza(FileDescriptor fileDescriptor) throws IOException {
        return (zzo) zzf(new zzk(fileDescriptor));
    }

    public static zzo zzd(String str) throws IOException {
        return (zzo) zzf(new zzl(str));
    }

    /* access modifiers changed from: private */
    public static zzo zze(Object obj) throws Exception {
        long longValue = ((Long) zzd.get(obj)).longValue();
        long longValue2 = ((Long) zze.get(obj)).longValue();
        int intValue = ((Integer) zzf.get(obj)).intValue();
        return new zzo(longValue, longValue2, ((Boolean) zza.invoke((Object) null, new Object[]{Integer.valueOf(intValue)})).booleanValue());
    }

    private static Object zzf(Callable callable) throws IOException {
        try {
            th = zzh;
            if (th == null) {
                return callable.call();
            }
            throw new IOException(th);
        } finally {
            IOException iOException = new IOException(th);
        }
    }
}
