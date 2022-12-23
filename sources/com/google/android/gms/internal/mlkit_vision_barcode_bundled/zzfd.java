package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

final class zzfd implements zzgc {
    private static final zzfj zza = new zzfb();
    private final zzfj zzb;

    public zzfd() {
        zzfj zzfj;
        zzfj[] zzfjArr = new zzfj[2];
        zzfjArr[0] = zzdv.zza();
        try {
            zzfj = (zzfj) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            zzfj = zza;
        }
        zzfjArr[1] = zzfj;
        zzfc zzfc = new zzfc(zzfjArr);
        zzel.zzf(zzfc, "messageInfoFactory");
        this.zzb = zzfc;
    }

    private static boolean zzb(zzfi zzfi) {
        return zzfi.zzc() == 1;
    }

    public final zzgb zza(Class cls) {
        Class<zzec> cls2 = zzec.class;
        zzgd.zzG(cls);
        zzfi zzb2 = this.zzb.zzb(cls);
        if (zzb2.zzb()) {
            if (cls2.isAssignableFrom(cls)) {
                return zzfp.zzc(zzgd.zzB(), zzdq.zzb(), zzb2.zza());
            }
            return zzfp.zzc(zzgd.zzz(), zzdq.zza(), zzb2.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            if (zzb(zzb2)) {
                return zzfo.zzk(cls, zzb2, zzfs.zzb(), zzez.zzd(), zzgd.zzB(), zzdq.zzb(), zzfh.zzb());
            }
            return zzfo.zzk(cls, zzb2, zzfs.zzb(), zzez.zzd(), zzgd.zzB(), (zzdo) null, zzfh.zzb());
        } else if (zzb(zzb2)) {
            return zzfo.zzk(cls, zzb2, zzfs.zza(), zzez.zzc(), zzgd.zzz(), zzdq.zza(), zzfh.zza());
        } else {
            return zzfo.zzk(cls, zzb2, zzfs.zza(), zzez.zzc(), zzgd.zzA(), (zzdo) null, zzfh.zza());
        }
    }
}
