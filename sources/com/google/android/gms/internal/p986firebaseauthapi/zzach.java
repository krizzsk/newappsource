package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.internal.p986firebaseauthapi.zzacd;
import com.google.android.gms.internal.p986firebaseauthapi.zzach;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzach */
public abstract class zzach<MessageType extends zzach<MessageType, BuilderType>, BuilderType extends zzacd<MessageType, BuilderType>> extends zzaao<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    public zzaeq zzc = zzaeq.zzc();
    public int zzd = -1;

    public static Object zzC(Method method, Object obj, Object... objArr) {
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

    public static Object zzD(zzadm zzadm, String str, Object[] objArr) {
        return new zzadw(zzadm, str, objArr);
    }

    public static void zzE(Class cls, zzach zzach) {
        zzb.put(cls, zzach);
    }

    private static zzach zza(zzach zzach) throws zzacp {
        if (zzach == null || zzach.zzG()) {
            return zzach;
        }
        zzacp zza = new zzaeo(zzach).zza();
        zza.zzh(zzach);
        throw zza;
    }

    private static zzach zzb(zzach zzach, byte[] bArr, int i, int i2, zzabu zzabu) throws zzacp {
        zzach zzach2 = (zzach) zzach.zzj(4, (Object) null, (Object) null);
        try {
            zzady zzb2 = zzadu.zza().zzb(zzach2.getClass());
            zzb2.zzi(zzach2, bArr, 0, i2, new zzaar(zzabu));
            zzb2.zzf(zzach2);
            if (zzach2.zza == 0) {
                return zzach2;
            }
            throw new RuntimeException();
        } catch (zzacp e) {
            e.zzh(zzach2);
            throw e;
        } catch (zzaeo e2) {
            zzacp zza = e2.zza();
            zza.zzh(zzach2);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzacp) {
                throw ((zzacp) e3.getCause());
            }
            zzacp zzacp = new zzacp(e3);
            zzacp.zzh(zzach2);
            throw zzacp;
        } catch (IndexOutOfBoundsException unused) {
            zzacp zzi = zzacp.zzi();
            zzi.zzh(zzach2);
            throw zzi;
        }
    }

    public static zzach zzv(Class cls) {
        Map map = zzb;
        zzach zzach = (zzach) map.get(cls);
        if (zzach == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzach = (zzach) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzach == null) {
            zzach = (zzach) ((zzach) zzaez.zze(cls)).zzj(6, (Object) null, (Object) null);
            if (zzach != null) {
                map.put(cls, zzach);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzach;
    }

    public static zzach zzw(zzach zzach, zzabe zzabe, zzabu zzabu) throws zzacp {
        zzabi zzh = zzabe.zzh();
        zzach zzach2 = (zzach) zzach.zzj(4, (Object) null, (Object) null);
        try {
            zzady zzb2 = zzadu.zza().zzb(zzach2.getClass());
            zzb2.zzh(zzach2, zzabj.zzq(zzh), zzabu);
            zzb2.zzf(zzach2);
            try {
                zzh.zzm(0);
                zza(zzach2);
                return zzach2;
            } catch (zzacp e) {
                e.zzh(zzach2);
                throw e;
            }
        } catch (zzacp e2) {
            e2.zzh(zzach2);
            throw e2;
        } catch (zzaeo e3) {
            zzacp zza = e3.zza();
            zza.zzh(zzach2);
            throw zza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzacp) {
                throw ((zzacp) e4.getCause());
            }
            zzacp zzacp = new zzacp(e4);
            zzacp.zzh(zzach2);
            throw zzacp;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzacp) {
                throw ((zzacp) e5.getCause());
            }
            throw e5;
        }
    }

    public static zzach zzx(zzach zzach, byte[] bArr, zzabu zzabu) throws zzacp {
        zzach zzb2 = zzb(zzach, bArr, 0, bArr.length, zzabu);
        zza(zzb2);
        return zzb2;
    }

    public static zzacm zzy() {
        return zzadv.zze();
    }

    public static zzacm zzz(zzacm zzacm) {
        int i;
        int size = zzacm.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return zzacm.zzd(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzadu.zza().zzb(getClass()).zzj(this, (zzach) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzb2 = zzadu.zza().zzb(getClass()).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    public final String toString() {
        return zzado.zza(this, super.toString());
    }

    public final /* synthetic */ zzadl zzA() {
        return (zzacd) zzj(5, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzadl zzB() {
        zzacd zzacd = (zzacd) zzj(5, (Object) null, (Object) null);
        zzacd.zzj(this);
        return zzacd;
    }

    public final void zzF(zzabp zzabp) throws IOException {
        zzadu.zza().zzb(getClass()).zzn(this, zzabq.zza(zzabp));
    }

    public final boolean zzG() {
        zzach zzach;
        byte byteValue = ((Byte) zzj(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzadu.zza().zzb(getClass()).zzk(this);
        if (true != zzk) {
            zzach = null;
        } else {
            zzach = this;
        }
        zzj(2, zzach, (Object) null);
        return zzk;
    }

    public final /* synthetic */ zzadm zzH() {
        return (zzach) zzj(6, (Object) null, (Object) null);
    }

    public abstract Object zzj(int i, Object obj, Object obj2);

    public final int zzn() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final void zzp(int i) {
        this.zzd = i;
    }

    public final int zzs() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int zza = zzadu.zza().zzb(getClass()).zza(this);
        this.zzd = zza;
        return zza;
    }

    public final zzacd zzt() {
        return (zzacd) zzj(5, (Object) null, (Object) null);
    }

    public final zzacd zzu() {
        zzacd zzacd = (zzacd) zzj(5, (Object) null, (Object) null);
        zzacd.zzj(this);
        return zzacd;
    }
}
