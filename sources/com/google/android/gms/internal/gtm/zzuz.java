package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzut;
import com.google.android.gms.internal.gtm.zzuz;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p988j$.util.concurrent.ConcurrentHashMap;

public abstract class zzuz<MessageType extends zzuz<MessageType, BuilderType>, BuilderType extends zzut<MessageType, BuilderType>> extends zzsh<MessageType, BuilderType> {
    private static final Map<Object, zzuz<?, ?>> zza = new ConcurrentHashMap();
    public zzxp zzc = zzxp.zzc();
    public int zzd = -1;

    public static <ContainingType extends zzwk, Type> zzux<ContainingType, Type> zzaa(ContainingType containingtype, Type type, zzwk zzwk, zzvc zzvc, int i, zzye zzye, Class cls) {
        return new zzux(containingtype, type, zzwk, new zzuw(zzvc, i, zzye, false, false), cls);
    }

    public static <T extends zzuz> T zzab(Class<T> cls) {
        Map<Object, zzuz<?, ?>> map = zza;
        T t = (zzuz) map.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (zzuz) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (zzuz) ((zzuz) zzxy.zze(cls)).zzb(6, (Object) null, (Object) null);
            if (t != null) {
                map.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    public static <T extends zzuz<T, ?>> T zzac(T t, InputStream inputStream, zzuj zzuj) throws zzvk {
        zzth zzth = new zzth(inputStream, 4096, (zztg) null);
        T t2 = (zzuz) t.zzb(4, (Object) null, (Object) null);
        try {
            zzwx<?> zzb = zzwt.zza().zzb(t2.getClass());
            zzb.zzh(t2, zztk.zzp(zzth), zzuj);
            zzb.zzf(t2);
            zzc(t2);
            return t2;
        } catch (zzvk e) {
            e = e;
            if (e.zzl()) {
                e = new zzvk((IOException) e);
            }
            e.zzh(t2);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzvk) {
                throw ((zzvk) e2.getCause());
            }
            zzvk zzvk = new zzvk(e2);
            zzvk.zzh(t2);
            throw zzvk;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof zzvk) {
                throw ((zzvk) e3.getCause());
            }
            throw e3;
        }
    }

    public static <T extends zzuz<T, ?>> T zzad(T t, byte[] bArr, zzuj zzuj) throws zzvk {
        T zzae = zzae(t, bArr, 0, bArr.length, zzuj);
        zzc(zzae);
        return zzae;
    }

    public static <T extends zzuz<T, ?>> T zzae(T t, byte[] bArr, int i, int i2, zzuj zzuj) throws zzvk {
        T t2 = (zzuz) t.zzb(4, (Object) null, (Object) null);
        try {
            zzwx<?> zzb = zzwt.zza().zzb(t2.getClass());
            zzb.zzi(t2, bArr, 0, i2, new zzsl(zzuj));
            zzb.zzf(t2);
            if (t2.zzb == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (zzvk e) {
            e = e;
            if (e.zzl()) {
                e = new zzvk((IOException) e);
            }
            e.zzh(t2);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzvk) {
                throw ((zzvk) e2.getCause());
            }
            zzvk zzvk = new zzvk(e2);
            zzvk.zzh(t2);
            throw zzvk;
        } catch (IndexOutOfBoundsException unused) {
            zzvk zzj = zzvk.zzj();
            zzj.zzh(t2);
            throw zzj;
        }
    }

    public static zzve zzaf() {
        return zzva.zzf();
    }

    public static <E> zzvh<E> zzag() {
        return zzwu.zze();
    }

    public static <E> zzvh<E> zzah(zzvh<E> zzvh) {
        int i;
        int size = zzvh.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return zzvh.zzd(i);
    }

    public static Object zzai(Method method, Object obj, Object... objArr) {
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

    public static Object zzaj(zzwk zzwk, String str, Object[] objArr) {
        return new zzwv(zzwk, str, objArr);
    }

    public static <T extends zzuz> void zzak(Class<T> cls, T t) {
        zza.put(cls, t);
    }

    private static <T extends zzuz<T, ?>> T zzc(T t) throws zzvk {
        if (t == null || t.zzas()) {
            return t;
        }
        zzvk zzvk = new zzvk(new zzxn(t).getMessage());
        zzvk.zzh(t);
        throw zzvk;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzwt.zza().zzb(getClass()).zzj(this, (zzuz) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int zzb = zzwt.zza().zzb(getClass()).zzb(this);
        this.zzb = zzb;
        return zzb;
    }

    public final String toString() {
        return zzwm.zza(this, super.toString());
    }

    public final int zzQ() {
        return this.zzd;
    }

    public final void zzT(int i) {
        this.zzd = i;
    }

    public final int zzX() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int zza2 = zzwt.zza().zzb(getClass()).zza(this);
        this.zzd = zza2;
        return zza2;
    }

    public final <MessageType extends zzuz<MessageType, BuilderType>, BuilderType extends zzut<MessageType, BuilderType>> BuilderType zzY() {
        return (zzut) zzb(5, (Object) null, (Object) null);
    }

    public final BuilderType zzZ() {
        BuilderType buildertype = (zzut) zzb(5, (Object) null, (Object) null);
        buildertype.zzz(this);
        return buildertype;
    }

    public final /* bridge */ /* synthetic */ zzwj zzao() {
        return (zzut) zzb(5, (Object) null, (Object) null);
    }

    public final /* bridge */ /* synthetic */ zzwj zzap() {
        zzut zzut = (zzut) zzb(5, (Object) null, (Object) null);
        zzut.zzz(this);
        return zzut;
    }

    public final void zzaq(zzto zzto) throws IOException {
        zzwt.zza().zzb(getClass()).zzn(this, zztp.zza(zzto));
    }

    public final /* bridge */ /* synthetic */ zzwk zzar() {
        return (zzuz) zzb(6, (Object) null, (Object) null);
    }

    public final boolean zzas() {
        zzuz zzuz;
        byte byteValue = ((Byte) zzb(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzwt.zza().zzb(getClass()).zzk(this);
        if (true != zzk) {
            zzuz = null;
        } else {
            zzuz = this;
        }
        zzb(2, zzuz, (Object) null);
        return zzk;
    }

    public abstract Object zzb(int i, Object obj, Object obj2);
}
