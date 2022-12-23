package com.google.android.gms.internal.ads;

final class zzglq implements zzgms {
    private static final zzglw zza = new zzglo();
    private final zzglw zzb;

    public zzglq() {
        zzglw zzglw;
        zzglw[] zzglwArr = new zzglw[2];
        zzglwArr[0] = zzgkj.zza();
        try {
            zzglw = (zzglw) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            zzglw = zza;
        }
        zzglwArr[1] = zzglw;
        zzglp zzglp = new zzglp(zzglwArr);
        zzgky.zzf(zzglp, "messageInfoFactory");
        this.zzb = zzglp;
    }

    private static boolean zzb(zzglv zzglv) {
        return zzglv.zzc() == 1;
    }

    public final zzgmr zza(Class cls) {
        Class<zzgko> cls2 = zzgko.class;
        zzgmt.zzG(cls);
        zzglv zzb2 = this.zzb.zzb(cls);
        if (zzb2.zzb()) {
            if (cls2.isAssignableFrom(cls)) {
                return zzgmc.zzc(zzgmt.zzB(), zzgkd.zzb(), zzb2.zza());
            }
            return zzgmc.zzc(zzgmt.zzz(), zzgkd.zza(), zzb2.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            if (zzb(zzb2)) {
                return zzgmb.zzl(cls, zzb2, zzgme.zzb(), zzglm.zze(), zzgmt.zzB(), zzgkd.zzb(), zzglu.zzb());
            }
            return zzgmb.zzl(cls, zzb2, zzgme.zzb(), zzglm.zze(), zzgmt.zzB(), (zzgkb) null, zzglu.zzb());
        } else if (zzb(zzb2)) {
            return zzgmb.zzl(cls, zzb2, zzgme.zza(), zzglm.zzd(), zzgmt.zzz(), zzgkd.zza(), zzglu.zza());
        } else {
            return zzgmb.zzl(cls, zzb2, zzgme.zza(), zzglm.zzd(), zzgmt.zzA(), (zzgkb) null, zzglu.zza());
        }
    }
}
