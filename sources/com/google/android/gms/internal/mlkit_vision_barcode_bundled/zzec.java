package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdw;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p988j$.util.concurrent.ConcurrentHashMap;

public abstract class zzec<MessageType extends zzec<MessageType, BuilderType>, BuilderType extends zzdw<MessageType, BuilderType>> extends zzck<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    public zzgq zzc = zzgq.zzc();
    public int zzd = -1;

    public static zzea zzH(zzfl zzfl, Object obj, zzfl zzfl2, zzef zzef, int i, zzhf zzhf, Class cls) {
        return new zzea(zzfl, obj, zzfl2, new zzdz((zzef) null, i, zzhf, false, false), cls);
    }

    public static zzec zzI(Class cls) {
        Map map = zza;
        zzec zzec = (zzec) map.get(cls);
        if (zzec == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzec = (zzec) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzec == null) {
            zzec = (zzec) ((zzec) zzgz.zze(cls)).zzg(6, (Object) null, (Object) null);
            if (zzec != null) {
                map.put(cls, zzec);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzec;
    }

    public static zzec zzJ(zzec zzec, byte[] bArr, zzdn zzdn) throws zzen {
        zzec zzK = zzK(zzec, bArr, 0, bArr.length, zzdn);
        if (zzK == null || zzK.zzY()) {
            return zzK;
        }
        zzen zzen = new zzen(new zzgo(zzK).getMessage());
        zzen.zzf(zzK);
        throw zzen;
    }

    public static zzec zzK(zzec zzec, byte[] bArr, int i, int i2, zzdn zzdn) throws zzen {
        zzec zzec2 = (zzec) zzec.zzg(4, (Object) null, (Object) null);
        try {
            zzgb zzb = zzfu.zza().zzb(zzec2.getClass());
            zzb.zzh(zzec2, bArr, 0, i2, new zzco(zzdn));
            zzb.zzf(zzec2);
            if (zzec2.zzb == 0) {
                return zzec2;
            }
            throw new RuntimeException();
        } catch (zzen e) {
            e.zzf(zzec2);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzen) {
                throw ((zzen) e2.getCause());
            }
            zzen zzen = new zzen(e2);
            zzen.zzf(zzec2);
            throw zzen;
        } catch (IndexOutOfBoundsException unused) {
            zzen zzg = zzen.zzg();
            zzg.zzf(zzec2);
            throw zzg;
        }
    }

    public static zzeh zzL() {
        return zzdu.zze();
    }

    public static zzeh zzM(zzeh zzeh) {
        int i;
        int size = zzeh.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return zzeh.zzf(i);
    }

    public static zzei zzN() {
        return zzed.zzf();
    }

    public static zzek zzO() {
        return zzfv.zze();
    }

    public static zzek zzP(zzek zzek) {
        int i;
        int size = zzek.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return zzek.zzd(i);
    }

    public static Object zzQ(Method method, Object obj, Object... objArr) {
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

    public static Object zzR(zzfl zzfl, String str, Object[] objArr) {
        return new zzfw(zzfl, str, objArr);
    }

    public static void zzS(Class cls, zzec zzec) {
        zza.put(cls, zzec);
    }

    public static final boolean zzT(zzec zzec, boolean z) {
        zzec zzec2;
        byte byteValue = ((Byte) zzec.zzg(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzj = zzfu.zza().zzb(zzec.getClass()).zzj(zzec);
        if (z) {
            if (true != zzj) {
                zzec2 = null;
            } else {
                zzec2 = zzec;
            }
            zzec.zzg(2, zzec2, (Object) null);
        }
        return zzj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzfu.zza().zzb(getClass()).zzi(this, (zzec) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int zzb = zzfu.zza().zzb(getClass()).zzb(this);
        this.zzb = zzb;
        return zzb;
    }

    public final String toString() {
        return zzfn.zza(this, super.toString());
    }

    /* access modifiers changed from: package-private */
    public final int zzB() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final void zzD(int i) {
        this.zzd = i;
    }

    public final int zzE() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int zza2 = zzfu.zza().zzb(getClass()).zza(this);
        this.zzd = zza2;
        return zza2;
    }

    public final zzdw zzF() {
        return (zzdw) zzg(5, (Object) null, (Object) null);
    }

    public final zzdw zzG() {
        zzdw zzdw = (zzdw) zzg(5, (Object) null, (Object) null);
        zzdw.zzi(this);
        return zzdw;
    }

    public final /* synthetic */ zzfk zzU() {
        return (zzdw) zzg(5, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzfk zzV() {
        zzdw zzdw = (zzdw) zzg(5, (Object) null, (Object) null);
        zzdw.zzi(this);
        return zzdw;
    }

    public final void zzW(zzdi zzdi) throws IOException {
        zzfu.zza().zzb(getClass()).zzm(this, zzdj.zza(zzdi));
    }

    public final /* synthetic */ zzfl zzX() {
        return (zzec) zzg(6, (Object) null, (Object) null);
    }

    public final boolean zzY() {
        return zzT(this, true);
    }

    public abstract Object zzg(int i, Object obj, Object obj2);
}
