package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgkk;
import com.google.android.gms.internal.ads.zzgko;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p988j$.util.concurrent.ConcurrentHashMap;

public abstract class zzgko<MessageType extends zzgko<MessageType, BuilderType>, BuilderType extends zzgkk<MessageType, BuilderType>> extends zzgip<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    public zzgnj zzc = zzgnj.zzc();
    public int zzd = -1;

    private static zzgko zza(zzgko zzgko) throws zzgla {
        if (zzgko == null || zzgko.zzaP()) {
            return zzgko;
        }
        zzgla zza = new zzgnh(zzgko).zza();
        zza.zzh(zzgko);
        throw zza;
    }

    public static zzgko zzaA(zzgko zzgko, byte[] bArr) throws zzgla {
        zzgko zzc2 = zzc(zzgko, bArr, 0, bArr.length, zzgka.zza());
        zza(zzc2);
        return zzc2;
    }

    public static zzgko zzaB(zzgko zzgko, zzgjg zzgjg, zzgka zzgka) throws zzgla {
        zzgjo zzl = zzgjg.zzl();
        zzgko zzgko2 = (zzgko) zzgko.zzb(4, (Object) null, (Object) null);
        try {
            zzgmr zzb2 = zzgmg.zza().zzb(zzgko2.getClass());
            zzb2.zzh(zzgko2, zzgjp.zzq(zzl), zzgka);
            zzb2.zzf(zzgko2);
            try {
                zzl.zzz(0);
                zza(zzgko2);
                return zzgko2;
            } catch (zzgla e) {
                e.zzh(zzgko2);
                throw e;
            }
        } catch (zzgla e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzgla((IOException) e);
            }
            e.zzh(zzgko2);
            throw e;
        } catch (zzgnh e3) {
            zzgla zza = e3.zza();
            zza.zzh(zzgko2);
            throw zza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgla) {
                throw ((zzgla) e4.getCause());
            }
            zzgla zzgla = new zzgla(e4);
            zzgla.zzh(zzgko2);
            throw zzgla;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzgla) {
                throw ((zzgla) e5.getCause());
            }
            throw e5;
        }
    }

    public static zzgko zzaC(zzgko zzgko, InputStream inputStream, zzgka zzgka) throws zzgla {
        zzgjo zzH = zzgjo.zzH(inputStream, 4096);
        zzgko zzgko2 = (zzgko) zzgko.zzb(4, (Object) null, (Object) null);
        try {
            zzgmr zzb2 = zzgmg.zza().zzb(zzgko2.getClass());
            zzb2.zzh(zzgko2, zzgjp.zzq(zzH), zzgka);
            zzb2.zzf(zzgko2);
            zza(zzgko2);
            return zzgko2;
        } catch (zzgla e) {
            e = e;
            if (e.zzl()) {
                e = new zzgla((IOException) e);
            }
            e.zzh(zzgko2);
            throw e;
        } catch (zzgnh e2) {
            zzgla zza = e2.zza();
            zza.zzh(zzgko2);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgla) {
                throw ((zzgla) e3.getCause());
            }
            zzgla zzgla = new zzgla(e3);
            zzgla.zzh(zzgko2);
            throw zzgla;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzgla) {
                throw ((zzgla) e4.getCause());
            }
            throw e4;
        }
    }

    public static zzgko zzaD(zzgko zzgko, byte[] bArr, zzgka zzgka) throws zzgla {
        zzgko zzc2 = zzc(zzgko, bArr, 0, bArr.length, zzgka);
        zza(zzc2);
        return zzc2;
    }

    public static zzgkt zzaE() {
        return zzgkp.zzf();
    }

    public static zzgkt zzaF(zzgkt zzgkt) {
        int i;
        int size = zzgkt.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return zzgkt.zzg(i);
    }

    public static zzgkw zzaG() {
        return zzgln.zzf();
    }

    public static zzgkx zzaH() {
        return zzgmh.zze();
    }

    public static zzgkx zzaI(zzgkx zzgkx) {
        int i;
        int size = zzgkx.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return zzgkx.zzd(i);
    }

    public static Object zzaL(Method method, Object obj, Object... objArr) {
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

    public static Object zzaM(zzgly zzgly, String str, Object[] objArr) {
        return new zzgmi(zzgly, str, objArr);
    }

    public static void zzaN(Class cls, zzgko zzgko) {
        zzb.put(cls, zzgko);
    }

    public static zzgko zzay(Class cls) {
        Map map = zzb;
        zzgko zzgko = (zzgko) map.get(cls);
        if (zzgko == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgko = (zzgko) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzgko == null) {
            zzgko = (zzgko) ((zzgko) zzgns.zzg(cls)).zzb(6, (Object) null, (Object) null);
            if (zzgko != null) {
                map.put(cls, zzgko);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzgko;
    }

    public static zzgko zzaz(zzgko zzgko, zzgjg zzgjg) throws zzgla {
        zzgka zza = zzgka.zza();
        zzgjo zzl = zzgjg.zzl();
        zzgko zzgko2 = (zzgko) zzgko.zzb(4, (Object) null, (Object) null);
        try {
            zzgmr zzb2 = zzgmg.zza().zzb(zzgko2.getClass());
            zzb2.zzh(zzgko2, zzgjp.zzq(zzl), zza);
            zzb2.zzf(zzgko2);
            try {
                zzl.zzz(0);
                zza(zzgko2);
                zza(zzgko2);
                return zzgko2;
            } catch (zzgla e) {
                e.zzh(zzgko2);
                throw e;
            }
        } catch (zzgla e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzgla((IOException) e);
            }
            e.zzh(zzgko2);
            throw e;
        } catch (zzgnh e3) {
            zzgla zza2 = e3.zza();
            zza2.zzh(zzgko2);
            throw zza2;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgla) {
                throw ((zzgla) e4.getCause());
            }
            zzgla zzgla = new zzgla(e4);
            zzgla.zzh(zzgko2);
            throw zzgla;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzgla) {
                throw ((zzgla) e5.getCause());
            }
            throw e5;
        }
    }

    private static zzgko zzc(zzgko zzgko, byte[] bArr, int i, int i2, zzgka zzgka) throws zzgla {
        zzgko zzgko2 = (zzgko) zzgko.zzb(4, (Object) null, (Object) null);
        try {
            zzgmr zzb2 = zzgmg.zza().zzb(zzgko2.getClass());
            zzb2.zzi(zzgko2, bArr, 0, i2, new zzgis(zzgka));
            zzb2.zzf(zzgko2);
            if (zzgko2.zza == 0) {
                return zzgko2;
            }
            throw new RuntimeException();
        } catch (zzgla e) {
            e = e;
            if (e.zzl()) {
                e = new zzgla((IOException) e);
            }
            e.zzh(zzgko2);
            throw e;
        } catch (zzgnh e2) {
            zzgla zza = e2.zza();
            zza.zzh(zzgko2);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzgla) {
                throw ((zzgla) e3.getCause());
            }
            zzgla zzgla = new zzgla(e3);
            zzgla.zzh(zzgko2);
            throw zzgla;
        } catch (IndexOutOfBoundsException unused) {
            zzgla zzj = zzgla.zzj();
            zzj.zzh(zzgko2);
            throw zzj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzgmg.zza().zzb(getClass()).zzj(this, (zzgko) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzb2 = zzgmg.zza().zzb(getClass()).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    public final String toString() {
        return zzgma.zza(this, super.toString());
    }

    public final /* synthetic */ zzglx zzaJ() {
        return (zzgkk) zzb(5, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzglx zzaK() {
        zzgkk zzgkk = (zzgkk) zzb(5, (Object) null, (Object) null);
        zzgkk.zzah(this);
        return zzgkk;
    }

    public final void zzaO(zzgjv zzgjv) throws IOException {
        zzgmg.zza().zzb(getClass()).zzn(this, zzgjw.zza(zzgjv));
    }

    public final boolean zzaP() {
        zzgko zzgko;
        byte byteValue = ((Byte) zzb(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzgmg.zza().zzb(getClass()).zzk(this);
        if (true != zzk) {
            zzgko = null;
        } else {
            zzgko = this;
        }
        zzb(2, zzgko, (Object) null);
        return zzk;
    }

    public final int zzap() {
        return this.zzd;
    }

    public final void zzas(int i) {
        this.zzd = i;
    }

    public final int zzav() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int zza = zzgmg.zza().zzb(getClass()).zza(this);
        this.zzd = zza;
        return zza;
    }

    public final zzgkk zzaw() {
        return (zzgkk) zzb(5, (Object) null, (Object) null);
    }

    public final zzgkk zzax() {
        zzgkk zzgkk = (zzgkk) zzb(5, (Object) null, (Object) null);
        zzgkk.zzah(this);
        return zzgkk;
    }

    public abstract Object zzb(int i, Object obj, Object obj2);

    public final /* synthetic */ zzgly zzbh() {
        return (zzgko) zzb(6, (Object) null, (Object) null);
    }
}
