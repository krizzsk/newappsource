package com.google.android.gms.internal.contextmanager;

import com.google.android.gms.internal.contextmanager.zzlz;
import com.google.android.gms.internal.contextmanager.zzmf;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p988j$.util.concurrent.ConcurrentHashMap;

public abstract class zzmf<MessageType extends zzmf<MessageType, BuilderType>, BuilderType extends zzlz<MessageType, BuilderType>> extends zzkm<MessageType, BuilderType> {
    private static final Map<Object, zzmf<?, ?>> zza = new ConcurrentHashMap();
    public zzoo zzc = zzoo.zzc();
    public int zzd = -1;

    public static <T extends zzmf<T, ?>> T zzA(T t, byte[] bArr, zzlp zzlp) throws zzmp {
        T zzB = zzB(t, bArr, 0, bArr.length, zzlp);
        if (zzB == null || zzB.zzw()) {
            return zzB;
        }
        zzmp zzmp = new zzmp(new zzom(zzB).getMessage());
        zzmp.zzf(zzB);
        throw zzmp;
    }

    public static <T extends zzmf<T, ?>> T zzB(T t, byte[] bArr, int i, int i2, zzlp zzlp) throws zzmp {
        T t2 = (zzmf) t.zzf(4, (Object) null, (Object) null);
        try {
            zznz<?> zzb = zznw.zza().zzb(t2.getClass());
            zzb.zzh(t2, bArr, 0, i2, new zzkq(zzlp));
            zzb.zzf(t2);
            if (t2.zzb == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (zzmp e) {
            e.zzf(t2);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzmp) {
                throw ((zzmp) e2.getCause());
            }
            zzmp zzmp = new zzmp(e2);
            zzmp.zzf(t2);
            throw zzmp;
        } catch (IndexOutOfBoundsException unused) {
            zzmp zzg = zzmp.zzg();
            zzg.zzf(t2);
            throw zzg;
        }
    }

    public static zzmk zzC() {
        return zzmg.zzf();
    }

    public static <E> zzmm<E> zzD() {
        return zznx.zze();
    }

    public static <E> zzmm<E> zzE(zzmm<E> zzmm) {
        int i;
        int size = zzmm.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return zzmm.zzd(i);
    }

    public static Object zzF(Method method, Object obj, Object... objArr) {
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

    public static Object zzG(zznn zznn, String str, Object[] objArr) {
        return new zzny(zznn, str, objArr);
    }

    public static <T extends zzmf> void zzH(Class<T> cls, T t) {
        zza.put(cls, t);
    }

    public static <ContainingType extends zznn, Type> zzmd<ContainingType, Type> zzy(ContainingType containingtype, Type type, zznn zznn, zzmi zzmi, int i, zzpd zzpd, Class cls) {
        return new zzmd(containingtype, type, zznn, new zzmc((zzmi<?>) null, 106879161, zzpd, false, false), cls);
    }

    public static <T extends zzmf> T zzz(Class<T> cls) {
        Map<Object, zzmf<?, ?>> map = zza;
        T t = (zzmf) map.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (zzmf) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (zzmf) ((zzmf) zzox.zze(cls)).zzf(6, (Object) null, (Object) null);
            if (t != null) {
                map.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zznw.zza().zzb(getClass()).zzi(this, (zzmf) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int zzb = zznw.zza().zzb(getClass()).zzb(this);
        this.zzb = zzb;
        return zzb;
    }

    public final String toString() {
        return zznp.zza(this, super.toString());
    }

    public final /* bridge */ /* synthetic */ zznm zzJ() {
        return (zzlz) zzf(5, (Object) null, (Object) null);
    }

    public final /* bridge */ /* synthetic */ zznm zzK() {
        zzlz zzlz = (zzlz) zzf(5, (Object) null, (Object) null);
        zzlz.zzp(this);
        return zzlz;
    }

    public final void zzL(zzlk zzlk) throws IOException {
        zznw.zza().zzb(getClass()).zzm(this, zzll.zza(zzlk));
    }

    public abstract Object zzf(int i, Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    public final int zzp() {
        return this.zzd;
    }

    public final void zzs(int i) {
        this.zzd = i;
    }

    public final /* bridge */ /* synthetic */ zznn zzu() {
        return (zzmf) zzf(6, (Object) null, (Object) null);
    }

    public final int zzv() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int zza2 = zznw.zza().zzb(getClass()).zza(this);
        this.zzd = zza2;
        return zza2;
    }

    public final boolean zzw() {
        zzmf zzmf;
        byte byteValue = ((Byte) zzf(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzj = zznw.zza().zzb(getClass()).zzj(this);
        if (true != zzj) {
            zzmf = null;
        } else {
            zzmf = this;
        }
        zzf(2, zzmf, (Object) null);
        return zzj;
    }

    public final <MessageType extends zzmf<MessageType, BuilderType>, BuilderType extends zzlz<MessageType, BuilderType>> BuilderType zzx() {
        return (zzlz) zzf(5, (Object) null, (Object) null);
    }
}
