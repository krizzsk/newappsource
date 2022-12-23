package com.google.android.gms.internal.contextmanager;

final class zznf implements zzoa {
    private static final zznl zza = new zznd();
    private final zznl zzb;

    public zznf() {
        zznl zznl;
        zznl[] zznlArr = new zznl[2];
        zznlArr[0] = zzly.zza();
        try {
            zznl = (zznl) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            zznl = zza;
        }
        zznlArr[1] = zznl;
        zzne zzne = new zzne(zznlArr);
        zzmn.zzf(zzne, "messageInfoFactory");
        this.zzb = zzne;
    }

    private static boolean zzb(zznk zznk) {
        return zznk.zzc() == 1;
    }

    public final <T> zznz<T> zza(Class<T> cls) {
        Class<zzmf> cls2 = zzmf.class;
        zzob.zzG(cls);
        zznk zzb2 = this.zzb.zzb(cls);
        if (zzb2.zzb()) {
            if (cls2.isAssignableFrom(cls)) {
                return zznr.zzc(zzob.zzB(), zzls.zzb(), zzb2.zza());
            }
            return zznr.zzc(zzob.zzz(), zzls.zza(), zzb2.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            if (zzb(zzb2)) {
                return zznq.zzk(cls, zzb2, zznu.zzb(), zznb.zzd(), zzob.zzB(), zzls.zzb(), zznj.zzb());
            }
            return zznq.zzk(cls, zzb2, zznu.zzb(), zznb.zzd(), zzob.zzB(), (zzlq<?>) null, zznj.zzb());
        } else if (zzb(zzb2)) {
            return zznq.zzk(cls, zzb2, zznu.zza(), zznb.zzc(), zzob.zzz(), zzls.zza(), zznj.zza());
        } else {
            return zznq.zzk(cls, zzb2, zznu.zza(), zznb.zzc(), zzob.zzA(), (zzlq<?>) null, zznj.zza());
        }
    }
}
