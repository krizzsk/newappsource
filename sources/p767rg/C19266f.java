package p767rg;

import com.google.android.gms.internal.mlkit_vision_barcode.zzbz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzjv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzjw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzka;
import com.google.android.gms.internal.mlkit_vision_barcode.zzki;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkx;
import com.google.android.gms.internal.mlkit_vision_barcode.zznk;
import com.google.android.gms.internal.mlkit_vision_barcode.zznp;
import p791sg.C19459a;
import p815tg.C19674d;

/* renamed from: rg.f */
public final /* synthetic */ class C19266f implements zznk {

    /* renamed from: a */
    public final /* synthetic */ C19267g f48961a;

    /* renamed from: b */
    public final /* synthetic */ long f48962b;

    /* renamed from: c */
    public final /* synthetic */ zzkj f48963c;

    /* renamed from: d */
    public final /* synthetic */ zzbz f48964d;

    /* renamed from: e */
    public final /* synthetic */ zzbz f48965e;

    /* renamed from: f */
    public final /* synthetic */ C19459a f48966f;

    public /* synthetic */ C19266f(C19267g gVar, long j, zzkj zzkj, zzbz zzbz, zzbz zzbz2, C19459a aVar) {
        this.f48961a = gVar;
        this.f48962b = j;
        this.f48963c = zzkj;
        this.f48964d = zzbz;
        this.f48965e = zzbz2;
        this.f48966f = aVar;
    }

    public final zznp zza() {
        zzjw zzjw;
        zzki zzki;
        C19267g gVar = this.f48961a;
        long j = this.f48962b;
        zzkj zzkj = this.f48963c;
        zzbz zzbz = this.f48964d;
        zzbz zzbz2 = this.f48965e;
        C19459a aVar = this.f48966f;
        gVar.getClass();
        zzkx zzkx = new zzkx();
        zzka zzka = new zzka();
        zzka.zzc(Long.valueOf(j));
        zzka.zzd(zzkj);
        zzka.zze(Boolean.valueOf(C19267g.f48968k));
        Boolean bool = Boolean.TRUE;
        zzka.zza(bool);
        zzka.zzb(bool);
        zzkx.zzh(zzka.zzf());
        zzkx.zzi(C19261a.m46515a(gVar.f48969d));
        zzkx.zze(zzbz.zzf());
        zzkx.zzf(zzbz2.zzf());
        int i = aVar.f49484f;
        C19267g.f48967j.getClass();
        int b = C19674d.m47162b(aVar);
        zzjv zzjv = new zzjv();
        if (i == -1) {
            zzjw = zzjw.BITMAP;
        } else if (i == 35) {
            zzjw = zzjw.YUV_420_888;
        } else if (i == 842094169) {
            zzjw = zzjw.YV12;
        } else if (i == 16) {
            zzjw = zzjw.NV16;
        } else if (i != 17) {
            zzjw = zzjw.UNKNOWN_FORMAT;
        } else {
            zzjw = zzjw.NV21;
        }
        zzjv.zza(zzjw);
        zzjv.zzb(Integer.valueOf(b));
        zzkx.zzg(zzjv.zzd());
        zzkl zzkl = new zzkl();
        if (gVar.f48974i) {
            zzki = zzki.TYPE_THICK;
        } else {
            zzki = zzki.TYPE_THIN;
        }
        zzkl.zze(zzki);
        zzkl.zzg(zzkx.zzj());
        return zznp.zzd(zzkl);
    }
}
