package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzcx;
import com.google.android.gms.internal.icing.zzda;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p988j$.util.concurrent.ConcurrentHashMap;

public abstract class zzda<MessageType extends zzda<MessageType, BuilderType>, BuilderType extends zzcx<MessageType, BuilderType>> extends zzbs<MessageType, BuilderType> {
    private static final Map<Object, zzda<?, ?>> zzb = new ConcurrentHashMap();
    public zzfe zzc = zzfe.zza();
    public int zzd = -1;

    public static <T extends zzda> T zzp(Class<T> cls) {
        Map<Object, zzda<?, ?>> map = zzb;
        T t = (zzda) map.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (zzda) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (zzda) ((zzda) zzfn.zzc(cls)).zzf(6, (Object) null, (Object) null);
            if (t != null) {
                map.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    public static <T extends zzda> void zzq(Class<T> cls, T t) {
        zzb.put(cls, t);
    }

    public static Object zzr(zzee zzee, String str, Object[] objArr) {
        return new zzeo(zzee, str, objArr);
    }

    public static Object zzs(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static zzdf zzt() {
        return zzdt.zzd();
    }

    public static zzdd zzu() {
        return zzco.zzd();
    }

    public static zzdc zzv() {
        return zzbv.zzd();
    }

    public static <E> zzdg<E> zzw() {
        return zzen.zzd();
    }

    public static <E> zzdg<E> zzx(zzdg<E> zzdg) {
        int i;
        int size = zzdg.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return zzdg.zze(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzem.zza().zzb(getClass()).zza(this, (zzda) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzb2 = zzem.zza().zzb(getClass()).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    public final String toString() {
        return zzeg.zza(this, super.toString());
    }

    public abstract Object zzf(int i, Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    public final int zzi() {
        return this.zzd;
    }

    public final void zzj(int i) {
        this.zzd = i;
    }

    public final <MessageType extends zzda<MessageType, BuilderType>, BuilderType extends zzcx<MessageType, BuilderType>> BuilderType zzl() {
        return (zzcx) zzf(5, (Object) null, (Object) null);
    }

    public final /* bridge */ /* synthetic */ zzee zzm() {
        return (zzda) zzf(6, (Object) null, (Object) null);
    }

    public final void zzn(zzcm zzcm) throws IOException {
        zzem.zza().zzb(getClass()).zzi(this, zzcn.zza(zzcm));
    }

    public final int zzo() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int zzd2 = zzem.zza().zzb(getClass()).zzd(this);
        this.zzd = zzd2;
        return zzd2;
    }

    public final /* bridge */ /* synthetic */ zzed zzy() {
        zzcx zzcx = (zzcx) zzf(5, (Object) null, (Object) null);
        zzcx.zzk(this);
        return zzcx;
    }
}
