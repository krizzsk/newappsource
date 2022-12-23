package com.google.android.gms.internal.p986firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzade */
final class zzade implements zzadz {
    private static final zzadk zza = new zzadc();
    private final zzadk zzb;

    public zzade() {
        zzadk zzadk;
        zzadk[] zzadkArr = new zzadk[2];
        zzadkArr[0] = zzacc.zza();
        try {
            zzadk = (zzadk) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            zzadk = zza;
        }
        zzadkArr[1] = zzadk;
        zzadd zzadd = new zzadd(zzadkArr);
        zzacn.zzf(zzadd, "messageInfoFactory");
        this.zzb = zzadd;
    }

    private static boolean zzb(zzadj zzadj) {
        return zzadj.zzc() == 1;
    }

    public final zzady zza(Class cls) {
        Class<zzach> cls2 = zzach.class;
        zzaea.zzG(cls);
        zzadj zzb2 = this.zzb.zzb(cls);
        if (zzb2.zzb()) {
            if (cls2.isAssignableFrom(cls)) {
                return zzadq.zzc(zzaea.zzB(), zzabx.zzb(), zzb2.zza());
            }
            return zzadq.zzc(zzaea.zzz(), zzabx.zza(), zzb2.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            if (zzb(zzb2)) {
                return zzadp.zzl(cls, zzb2, zzads.zzb(), zzada.zze(), zzaea.zzB(), zzabx.zzb(), zzadi.zzb());
            }
            return zzadp.zzl(cls, zzb2, zzads.zzb(), zzada.zze(), zzaea.zzB(), (zzabv) null, zzadi.zzb());
        } else if (zzb(zzb2)) {
            return zzadp.zzl(cls, zzb2, zzads.zza(), zzada.zzd(), zzaea.zzz(), zzabx.zza(), zzadi.zza());
        } else {
            return zzadp.zzl(cls, zzb2, zzads.zza(), zzada.zzd(), zzaea.zzA(), (zzabv) null, zzadi.zza());
        }
    }
}
