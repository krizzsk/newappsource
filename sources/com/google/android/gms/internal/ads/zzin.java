package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

final class zzin extends zzk implements zzhf {
    public static final /* synthetic */ int zzd = 0;
    private final zzkg zzA;
    private final zzkh zzB;
    private final long zzC;
    private int zzD;
    private int zzE;
    private boolean zzF;
    private int zzG;
    private zzjx zzH;
    private zzbx zzI;
    private zzbh zzJ;
    private zzbh zzK;
    /* access modifiers changed from: private */
    public zzad zzL;
    /* access modifiers changed from: private */
    public zzad zzM;
    private AudioTrack zzN;
    /* access modifiers changed from: private */
    public Object zzO;
    private Surface zzP;
    private int zzQ;
    private int zzR;
    private int zzS;
    /* access modifiers changed from: private */
    public zzgm zzT;
    /* access modifiers changed from: private */
    public zzgm zzU;
    private int zzV;
    private zzi zzW;
    private float zzX;
    /* access modifiers changed from: private */
    public boolean zzY;
    private List zzZ;
    private boolean zzaa;
    private boolean zzab;
    /* access modifiers changed from: private */
    public zzr zzac;
    /* access modifiers changed from: private */
    public zzcv zzad;
    private zzbh zzae;
    private zzjo zzaf;
    private int zzag;
    private long zzah;
    private final zzhq zzai;
    private zztu zzaj;
    public final zzvo zzb;
    public final zzbx zzc;
    private final zzcz zze;
    private final Context zzf;
    private final zzcb zzg;
    private final zzju[] zzh;
    private final zzvn zzi;
    private final zzdg zzj;
    private final zzix zzk;
    /* access modifiers changed from: private */
    public final zzdm zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzcf zzn;
    private final List zzo;
    private final boolean zzp;
    private final zzsa zzq;
    /* access modifiers changed from: private */
    public final zzki zzr;
    private final Looper zzs;
    private final zzvv zzt;
    private final zzcx zzu;
    private final zzij zzv;
    private final zzil zzw;
    private final zzgg zzx;
    private final zzgk zzy;
    /* access modifiers changed from: private */
    public final zzkf zzz;

    static {
        zzbc.zzb("media3.exoplayer");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzvu, com.google.android.gms.internal.ads.zzki, java.lang.Object] */
    @SuppressLint({"HandlerLeak"})
    public zzin(zzhe zzhe, zzcb zzcb) {
        zzmv zzmv;
        Object obj;
        zzhe zzhe2 = zzhe;
        zzcb zzcb2 = zzcb;
        zzcz zzcz = new zzcz(zzcx.zza);
        this.zze = zzcz;
        try {
            Integer.toHexString(System.identityHashCode(this));
            int i = zzeg.zza;
            Context applicationContext = zzhe2.zza.getApplicationContext();
            this.zzf = applicationContext;
            ? apply = zzhe2.zzh.apply(zzhe2.zzb);
            this.zzr = apply;
            this.zzW = zzhe2.zzj;
            this.zzQ = 1;
            this.zzY = false;
            this.zzC = 2000;
            zzij zzij = new zzij(this, (zzii) null);
            this.zzv = zzij;
            zzil zzil = new zzil((zzik) null);
            this.zzw = zzil;
            Handler handler = new Handler(zzhe2.zzi);
            Handler handler2 = handler;
            zzil zzil2 = zzil;
            zzju[] zza = ((zzgy) zzhe2.zzc).zza.zza(handler, zzij, zzij, zzij, zzij);
            this.zzh = zza;
            int length = zza.length;
            zzvn zzvn = (zzvn) zzhe2.zze.zza();
            this.zzi = zzvn;
            this.zzq = zzhe.zza(((zzgz) zzhe2.zzd).zza);
            zzvz zzg2 = zzvz.zzg(((zzhc) zzhe2.zzg).zza);
            this.zzt = zzg2;
            this.zzp = true;
            this.zzH = zzhe2.zzk;
            Looper looper = zzhe2.zzi;
            this.zzs = looper;
            zzcx zzcx = zzhe2.zzb;
            this.zzu = zzcx;
            this.zzg = zzcb2;
            zzdm zzdm = new zzdm(looper, zzcx, new zzhp(this));
            this.zzl = zzdm;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            this.zzaj = new zztu(0);
            int length2 = zza.length;
            zzij zzij2 = zzij;
            zzdm zzdm2 = zzdm;
            zzcz zzcz2 = zzcz;
            zzvo zzvo = new zzvo(new zzjw[2], new zzvh[2], zzct.zza, (Object) null);
            this.zzb = zzvo;
            this.zzn = new zzcf();
            zzbv zzbv = new zzbv();
            CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
            zzbv.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28);
            zzvn.zzh();
            zzbv.zzd(29, true);
            zzbx zze2 = zzbv.zze();
            this.zzc = zze2;
            zzbv zzbv2 = new zzbv();
            zzbv2.zzb(zze2);
            zzbv2.zza(4);
            zzbv2.zza(10);
            this.zzI = zzbv2.zze();
            this.zzj = zzcx.zzb(looper, (Handler.Callback) null);
            zzhq zzhq = new zzhq(this);
            this.zzai = zzhq;
            this.zzaf = zzjo.zzh(zzvo);
            apply.zzS(zzcb2, looper);
            int i2 = zzeg.zza;
            if (i2 < 31) {
                zzmv = new zzmv();
            } else {
                zzmv = zzic.zza(applicationContext, this, true);
            }
            zzjx zzjx = this.zzH;
            Looper looper2 = looper;
            zzix zzix = r7;
            zzij zzij3 = zzij2;
            zzhq zzhq2 = zzhq;
            zzdm zzdm3 = zzdm2;
            Looper looper3 = looper2;
            zzvz zzvz = zzg2;
            zzki zzki = apply;
            zzjx zzjx2 = zzjx;
            zzix zzix2 = new zzix(zza, zzvn, zzvo, (zzjb) zzhe2.zzf.zza(), zzg2, 0, false, zzki, zzjx2, zzhe2.zzm, 500, false, looper2, zzcx, zzhq2, zzmv, (byte[]) null);
            this.zzk = zzix;
            this.zzX = 1.0f;
            zzbh zzbh = zzbh.zza;
            this.zzJ = zzbh;
            this.zzK = zzbh;
            this.zzae = zzbh;
            this.zzag = -1;
            if (i2 < 21) {
                AudioTrack audioTrack = this.zzN;
                if (audioTrack == null || audioTrack.getAudioSessionId() == 0) {
                    obj = null;
                } else {
                    this.zzN.release();
                    obj = null;
                    this.zzN = null;
                }
                if (this.zzN == null) {
                    this.zzN = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.zzV = this.zzN.getAudioSessionId();
            } else {
                obj = null;
                this.zzV = zzeg.zzi(applicationContext);
            }
            this.zzZ = zzfrh.zzo();
            this.zzaa = true;
            apply.getClass();
            zzdm3.zzb(apply);
            zzvz.zze(new Handler(looper3), apply);
            zzij zzij4 = zzij3;
            copyOnWriteArraySet2.add(zzij4);
            Handler handler3 = handler2;
            this.zzx = new zzgg(zzhe2.zza, handler3, zzij4);
            this.zzy = new zzgk(zzhe2.zza, handler3, zzij4);
            zzeg.zzS(obj, obj);
            zzkf zzkf = new zzkf(zzhe2.zza, handler3, zzij4);
            this.zzz = zzkf;
            int i3 = this.zzW.zzc;
            zzkf.zzf(3);
            this.zzA = new zzkg(zzhe2.zza);
            this.zzB = new zzkh(zzhe2.zza);
            this.zzac = zzam(zzkf);
            this.zzad = zzcv.zza;
            zzaq(1, 10, Integer.valueOf(this.zzV));
            zzaq(2, 10, Integer.valueOf(this.zzV));
            zzaq(1, 3, this.zzW);
            zzaq(2, 4, Integer.valueOf(this.zzQ));
            zzaq(2, 5, 0);
            zzaq(1, 9, Boolean.valueOf(this.zzY));
            zzil zzil3 = zzil2;
            zzaq(2, 7, zzil3);
            zzaq(6, 8, zzil3);
            zzcz2.zze();
        } catch (Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    public static /* bridge */ /* synthetic */ void zzN(zzin zzin, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzin.zzas(surface);
        zzin.zzP = surface;
    }

    private final int zzag() {
        if (this.zzaf.zza.zzo()) {
            return this.zzag;
        }
        zzjo zzjo = this.zzaf;
        return zzjo.zza.zzn(zzjo.zzb.zza, this.zzn).zzd;
    }

    /* access modifiers changed from: private */
    public static int zzah(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    private final long zzai(zzjo zzjo) {
        if (zzjo.zza.zzo()) {
            return zzeg.zzv(this.zzah);
        }
        if (zzjo.zzb.zzb()) {
            return zzjo.zzs;
        }
        zzci zzci = zzjo.zza;
        zzsb zzsb = zzjo.zzb;
        long j = zzjo.zzs;
        zzak(zzci, zzsb, j);
        return j;
    }

    private static long zzaj(zzjo zzjo) {
        zzch zzch = new zzch();
        zzcf zzcf = new zzcf();
        zzjo.zza.zzn(zzjo.zzb.zza, zzcf);
        long j = zzjo.zzc;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = zzjo.zza.zze(zzcf.zzd, zzch, 0).zzm;
        return 0;
    }

    private final long zzak(zzci zzci, zzsb zzsb, long j) {
        zzci.zzn(zzsb.zza, this.zzn);
        return j;
    }

    private final Pair zzal(zzci zzci, int i, long j) {
        if (zzci.zzo()) {
            this.zzag = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzah = j;
            return null;
        }
        if (i == -1 || i >= zzci.zzc()) {
            i = zzci.zzg(false);
            long j2 = zzci.zze(i, this.zza, 0).zzm;
            j = zzeg.zzz(0);
        }
        return zzci.zzl(this.zza, this.zzn, i, zzeg.zzv(j));
    }

    /* access modifiers changed from: private */
    public static zzr zzam(zzkf zzkf) {
        return new zzr(0, zzkf.zzb(), zzkf.zza());
    }

    private final zzjo zzan(zzjo zzjo, zzci zzci, Pair pair) {
        boolean z;
        zzsb zzsb;
        zztz zztz;
        zzvo zzvo;
        zzsb zzsb2;
        List list;
        int i;
        zzjo zzjo2;
        long j;
        zzci zzci2 = zzci;
        Pair pair2 = pair;
        if (zzci.zzo() || pair2 != null) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzd(z);
        zzci zzci3 = zzjo.zza;
        zzjo zzg2 = zzjo.zzg(zzci);
        if (zzci.zzo()) {
            zzsb zzi2 = zzjo.zzi();
            long zzv2 = zzeg.zzv(this.zzah);
            zzjo zza = zzg2.zzb(zzi2, zzv2, zzv2, zzv2, 0, zztz.zza, this.zzb, zzfrh.zzo()).zza(zzi2);
            zza.zzq = zza.zzs;
            return zza;
        }
        Object obj = zzg2.zzb.zza;
        int i2 = zzeg.zza;
        boolean z2 = !obj.equals(pair2.first);
        if (z2) {
            zzsb = new zzsb(pair2.first);
        } else {
            zzsb = zzg2.zzb;
        }
        zzsb zzsb3 = zzsb;
        long longValue = ((Long) pair2.second).longValue();
        long zzv3 = zzeg.zzv(zzk());
        if (!zzci3.zzo()) {
            zzci3.zzn(obj, this.zzn);
        }
        if (z2 || longValue < zzv3) {
            zzsb zzsb4 = zzsb3;
            zzcw.zzf(!zzsb4.zzb());
            if (z2) {
                zztz = zztz.zza;
            } else {
                zztz = zzg2.zzh;
            }
            zztz zztz2 = zztz;
            if (z2) {
                zzsb2 = zzsb4;
                zzvo = this.zzb;
            } else {
                zzsb2 = zzsb4;
                zzvo = zzg2.zzi;
            }
            zzvo zzvo2 = zzvo;
            if (z2) {
                list = zzfrh.zzo();
            } else {
                list = zzg2.zzj;
            }
            zzjo zza2 = zzg2.zzb(zzsb2, longValue, longValue, longValue, 0, zztz2, zzvo2, list).zza(zzsb2);
            zza2.zzq = longValue;
            return zza2;
        }
        if (i == 0) {
            int zza3 = zzci2.zza(zzg2.zzk.zza);
            if (zza3 != -1 && zzci2.zzd(zza3, this.zzn, false).zzd == zzci2.zzn(zzsb3.zza, this.zzn).zzd) {
                return zzg2;
            }
            zzci2.zzn(zzsb3.zza, this.zzn);
            if (zzsb3.zzb()) {
                j = this.zzn.zzg(zzsb3.zzb, zzsb3.zzc);
            } else {
                j = this.zzn.zze;
            }
            zzjo2 = zzg2.zzb(zzsb3, zzg2.zzs, zzg2.zzs, zzg2.zzd, j - zzg2.zzs, zzg2.zzh, zzg2.zzi, zzg2.zzj).zza(zzsb3);
            zzjo2.zzq = j;
        } else {
            zzsb zzsb5 = zzsb3;
            zzcw.zzf(!zzsb5.zzb());
            long max = Math.max(0, zzg2.zzr - (longValue - zzv3));
            long j2 = zzg2.zzq;
            if (zzg2.zzk.equals(zzg2.zzb)) {
                j2 = longValue + max;
            }
            zzjo2 = zzg2.zzb(zzsb5, longValue, longValue, longValue, max, zzg2.zzh, zzg2.zzi, zzg2.zzj);
            zzjo2.zzq = j2;
        }
        return zzjo2;
    }

    private final zzjr zzao(zzjq zzjq) {
        int i;
        int zzag2 = zzag();
        zzix zzix = this.zzk;
        zzci zzci = this.zzaf.zza;
        if (zzag2 == -1) {
            i = 0;
        } else {
            i = zzag2;
        }
        return new zzjr(zzix, zzjq, zzci, i, this.zzu, zzix.zzb());
    }

    /* access modifiers changed from: private */
    public final void zzap(int i, int i2) {
        if (i != this.zzR || i2 != this.zzS) {
            this.zzR = i;
            this.zzS = i2;
            zzdm zzdm = this.zzl;
            zzdm.zzd(24, new zzht(i, i2));
            zzdm.zzc();
        }
    }

    private final void zzaq(int i, int i2, Object obj) {
        zzju[] zzjuArr = this.zzh;
        int length = zzjuArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzju zzju = zzjuArr[i3];
            if (zzju.zzb() == i) {
                zzjr zzao = zzao(zzju);
                zzao.zzf(i2);
                zzao.zze(obj);
                zzao.zzd();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void zzar() {
        zzaq(1, 2, Float.valueOf(this.zzX * this.zzy.zza()));
    }

    /* access modifiers changed from: private */
    public final void zzas(Object obj) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        zzju[] zzjuArr = this.zzh;
        int length = zzjuArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= 2) {
                break;
            }
            zzju zzju = zzjuArr[i];
            if (zzju.zzb() == 2) {
                zzjr zzao = zzao(zzju);
                zzao.zzf(1);
                zzao.zze(obj);
                zzao.zzd();
                arrayList.add(zzao);
            }
            i++;
        }
        Object obj2 = this.zzO;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zzjr) it.next()).zzi(this.zzC);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = this.zzO;
            Surface surface = this.zzP;
            if (obj3 == surface) {
                surface.release();
                this.zzP = null;
            }
        }
        this.zzO = obj;
        if (z) {
            zzat(false, zzgu.zzd(new zziz(3), Place.TYPE_ADMINISTRATIVE_AREA_LEVEL_3));
        }
    }

    private final void zzat(boolean z, zzgu zzgu) {
        boolean z2;
        zzjo zzjo = this.zzaf;
        zzjo zza = zzjo.zza(zzjo.zzb);
        zza.zzq = zza.zzs;
        zza.zzr = 0;
        zzjo zzf2 = zza.zzf(1);
        if (zzgu != null) {
            zzf2 = zzf2.zze(zzgu);
        }
        zzjo zzjo2 = zzf2;
        this.zzD++;
        this.zzk.zzo();
        if (!zzjo2.zza.zzo() || this.zzaf.zza.zzo()) {
            z2 = false;
        } else {
            z2 = true;
        }
        zzav(zzjo2, 0, 1, false, z2, 4, zzai(zzjo2), -1);
    }

    /* access modifiers changed from: private */
    public final void zzau(boolean z, int i, int i2) {
        boolean z2;
        int i3 = 0;
        if (!z || i == -1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 && i != 1) {
            i3 = 1;
        }
        zzjo zzjo = this.zzaf;
        if (zzjo.zzl != z2 || zzjo.zzm != i3) {
            this.zzD++;
            zzjo zzd2 = zzjo.zzd(z2, i3);
            this.zzk.zzn(z2, i3);
            zzav(zzd2, 0, i2, false, false, 5, -9223372036854775807L, -1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzav(com.google.android.gms.internal.ads.zzjo r44, int r45, int r46, boolean r47, boolean r48, int r49, long r50, int r52) {
        /*
            r43 = this;
            r0 = r43
            r1 = r44
            r2 = r49
            com.google.android.gms.internal.ads.zzjo r3 = r0.zzaf
            r0.zzaf = r1
            com.google.android.gms.internal.ads.zzci r4 = r3.zza
            com.google.android.gms.internal.ads.zzci r5 = r1.zza
            boolean r4 = r4.equals(r5)
            r5 = 1
            r4 = r4 ^ r5
            com.google.android.gms.internal.ads.zzci r6 = r3.zza
            com.google.android.gms.internal.ads.zzci r7 = r1.zza
            boolean r8 = r7.zzo()
            r10 = 3
            r11 = 0
            r12 = 0
            r14 = -1
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            if (r8 == 0) goto L_0x0036
            boolean r8 = r6.zzo()
            if (r8 == 0) goto L_0x0036
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.<init>(r6, r15)
            goto L_0x00c0
        L_0x0036:
            boolean r8 = r7.zzo()
            boolean r9 = r6.zzo()
            if (r8 == r9) goto L_0x004d
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r4.<init>(r6, r7)
            goto L_0x00c0
        L_0x004d:
            com.google.android.gms.internal.ads.zzsb r8 = r3.zzb
            java.lang.Object r8 = r8.zza
            com.google.android.gms.internal.ads.zzcf r9 = r0.zzn
            com.google.android.gms.internal.ads.zzcf r8 = r6.zzn(r8, r9)
            int r8 = r8.zzd
            com.google.android.gms.internal.ads.zzch r9 = r0.zza
            com.google.android.gms.internal.ads.zzch r6 = r6.zze(r8, r9, r12)
            java.lang.Object r6 = r6.zzc
            com.google.android.gms.internal.ads.zzsb r8 = r1.zzb
            java.lang.Object r8 = r8.zza
            com.google.android.gms.internal.ads.zzcf r9 = r0.zzn
            com.google.android.gms.internal.ads.zzcf r8 = r7.zzn(r8, r9)
            int r8 = r8.zzd
            com.google.android.gms.internal.ads.zzch r9 = r0.zza
            com.google.android.gms.internal.ads.zzch r7 = r7.zze(r8, r9, r12)
            java.lang.Object r7 = r7.zzc
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x009d
            if (r48 == 0) goto L_0x0081
            if (r2 != 0) goto L_0x0081
            r4 = 1
            goto L_0x008a
        L_0x0081:
            if (r48 == 0) goto L_0x0087
            if (r2 != r5) goto L_0x0087
            r4 = 2
            goto L_0x008a
        L_0x0087:
            if (r4 == 0) goto L_0x0097
            r4 = 3
        L_0x008a:
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.<init>(r7, r4)
            r4 = r6
            goto L_0x00c0
        L_0x0097:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x009d:
            if (r48 == 0) goto L_0x00b9
            if (r2 != 0) goto L_0x00b9
            com.google.android.gms.internal.ads.zzsb r4 = r3.zzb
            long r6 = r4.zzd
            com.google.android.gms.internal.ads.zzsb r4 = r1.zzb
            long r8 = r4.zzd
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b9
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            r4.<init>(r6, r7)
            goto L_0x00c0
        L_0x00b9:
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.<init>(r6, r15)
        L_0x00c0:
            java.lang.Object r6 = r4.first
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.google.android.gms.internal.ads.zzbh r7 = r0.zzJ
            if (r6 == 0) goto L_0x00fb
            com.google.android.gms.internal.ads.zzci r9 = r1.zza
            boolean r9 = r9.zzo()
            if (r9 != 0) goto L_0x00f5
            com.google.android.gms.internal.ads.zzci r9 = r1.zza
            com.google.android.gms.internal.ads.zzsb r15 = r1.zzb
            java.lang.Object r15 = r15.zza
            com.google.android.gms.internal.ads.zzcf r8 = r0.zzn
            com.google.android.gms.internal.ads.zzcf r8 = r9.zzn(r15, r8)
            int r8 = r8.zzd
            com.google.android.gms.internal.ads.zzci r9 = r1.zza
            com.google.android.gms.internal.ads.zzch r15 = r0.zza
            com.google.android.gms.internal.ads.zzch r8 = r9.zze(r8, r15, r12)
            com.google.android.gms.internal.ads.zzbb r8 = r8.zzd
            goto L_0x00f6
        L_0x00f5:
            r8 = 0
        L_0x00f6:
            com.google.android.gms.internal.ads.zzbh r9 = com.google.android.gms.internal.ads.zzbh.zza
            r0.zzae = r9
            goto L_0x00fc
        L_0x00fb:
            r8 = 0
        L_0x00fc:
            if (r6 != 0) goto L_0x0108
            java.util.List r9 = r3.zzj
            java.util.List r15 = r1.zzj
            boolean r9 = r9.equals(r15)
            if (r9 != 0) goto L_0x0161
        L_0x0108:
            com.google.android.gms.internal.ads.zzbh r7 = r0.zzae
            com.google.android.gms.internal.ads.zzbf r7 = r7.zza()
            java.util.List r9 = r1.zzj
            r15 = 0
        L_0x0111:
            int r10 = r9.size()
            if (r15 >= r10) goto L_0x0133
            java.lang.Object r10 = r9.get(r15)
            com.google.android.gms.internal.ads.zzbl r10 = (com.google.android.gms.internal.ads.zzbl) r10
            r14 = 0
        L_0x011e:
            int r11 = r10.zza()
            if (r14 >= r11) goto L_0x012e
            com.google.android.gms.internal.ads.zzbk r11 = r10.zzb(r14)
            r11.zza(r7)
            int r14 = r14 + 1
            goto L_0x011e
        L_0x012e:
            int r15 = r15 + 1
            r11 = 0
            r14 = -1
            goto L_0x0111
        L_0x0133:
            com.google.android.gms.internal.ads.zzbh r7 = r7.zzv()
            r0.zzae = r7
            com.google.android.gms.internal.ads.zzci r7 = r43.zzn()
            boolean r9 = r7.zzo()
            if (r9 == 0) goto L_0x0146
            com.google.android.gms.internal.ads.zzbh r7 = r0.zzae
            goto L_0x0161
        L_0x0146:
            int r9 = r43.zzf()
            com.google.android.gms.internal.ads.zzch r10 = r0.zza
            com.google.android.gms.internal.ads.zzch r7 = r7.zze(r9, r10, r12)
            com.google.android.gms.internal.ads.zzbb r7 = r7.zzd
            com.google.android.gms.internal.ads.zzbh r9 = r0.zzae
            com.google.android.gms.internal.ads.zzbf r9 = r9.zza()
            com.google.android.gms.internal.ads.zzbh r7 = r7.zzg
            r9.zzb(r7)
            com.google.android.gms.internal.ads.zzbh r7 = r9.zzv()
        L_0x0161:
            com.google.android.gms.internal.ads.zzbh r9 = r0.zzJ
            boolean r9 = r7.equals(r9)
            r9 = r9 ^ r5
            r0.zzJ = r7
            boolean r7 = r3.zzl
            boolean r10 = r1.zzl
            int r11 = r3.zze
            int r14 = r1.zze
            if (r11 != r14) goto L_0x0176
            if (r7 == r10) goto L_0x0179
        L_0x0176:
            r43.zzaw()
        L_0x0179:
            boolean r15 = r3.zzg
            boolean r5 = r1.zzg
            com.google.android.gms.internal.ads.zzci r12 = r3.zza
            com.google.android.gms.internal.ads.zzci r13 = r1.zza
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x0197
            com.google.android.gms.internal.ads.zzdm r12 = r0.zzl
            com.google.android.gms.internal.ads.zzhv r13 = new com.google.android.gms.internal.ads.zzhv
            r18 = r7
            r7 = r45
            r13.<init>(r1, r7)
            r7 = 0
            r12.zzd(r7, r13)
            goto L_0x0199
        L_0x0197:
            r18 = r7
        L_0x0199:
            if (r48 == 0) goto L_0x02cc
            com.google.android.gms.internal.ads.zzcf r7 = new com.google.android.gms.internal.ads.zzcf
            r7.<init>()
            com.google.android.gms.internal.ads.zzci r12 = r3.zza
            boolean r12 = r12.zzo()
            if (r12 != 0) goto L_0x01de
            com.google.android.gms.internal.ads.zzsb r12 = r3.zzb
            java.lang.Object r12 = r12.zza
            com.google.android.gms.internal.ads.zzci r13 = r3.zza
            r13.zzn(r12, r7)
            int r13 = r7.zzd
            r17 = r10
            com.google.android.gms.internal.ads.zzci r10 = r3.zza
            int r10 = r10.zza(r12)
            r45 = r10
            com.google.android.gms.internal.ads.zzci r10 = r3.zza
            r48 = r12
            com.google.android.gms.internal.ads.zzch r12 = r0.zza
            r19 = r14
            r20 = r15
            r14 = 0
            com.google.android.gms.internal.ads.zzch r10 = r10.zze(r13, r12, r14)
            java.lang.Object r10 = r10.zzc
            com.google.android.gms.internal.ads.zzch r12 = r0.zza
            com.google.android.gms.internal.ads.zzbb r12 = r12.zzd
            r26 = r45
            r25 = r48
            r22 = r10
            r24 = r12
            r23 = r13
            goto L_0x01ee
        L_0x01de:
            r17 = r10
            r19 = r14
            r20 = r15
            r23 = r52
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = -1
        L_0x01ee:
            if (r2 != 0) goto L_0x0218
            com.google.android.gms.internal.ads.zzsb r10 = r3.zzb
            boolean r10 = r10.zzb()
            if (r10 == 0) goto L_0x0207
            com.google.android.gms.internal.ads.zzsb r10 = r3.zzb
            int r12 = r10.zzb
            int r10 = r10.zzc
            long r12 = r7.zzg(r12, r10)
            long r14 = zzaj(r3)
            goto L_0x022a
        L_0x0207:
            com.google.android.gms.internal.ads.zzsb r10 = r3.zzb
            int r10 = r10.zze
            r12 = -1
            if (r10 == r12) goto L_0x0215
            com.google.android.gms.internal.ads.zzjo r7 = r0.zzaf
            long r12 = zzaj(r7)
            goto L_0x0229
        L_0x0215:
            long r12 = r7.zze
            goto L_0x0229
        L_0x0218:
            com.google.android.gms.internal.ads.zzsb r7 = r3.zzb
            boolean r7 = r7.zzb()
            if (r7 == 0) goto L_0x0227
            long r12 = r3.zzs
            long r14 = zzaj(r3)
            goto L_0x022a
        L_0x0227:
            long r12 = r3.zzs
        L_0x0229:
            r14 = r12
        L_0x022a:
            com.google.android.gms.internal.ads.zzca r7 = new com.google.android.gms.internal.ads.zzca
            long r27 = com.google.android.gms.internal.ads.zzeg.zzz(r12)
            com.google.android.gms.internal.ads.zzsb r10 = r3.zzb
            long r29 = com.google.android.gms.internal.ads.zzeg.zzz(r14)
            int r12 = r10.zzb
            int r10 = r10.zzc
            r21 = r7
            r31 = r12
            r32 = r10
            r21.<init>(r22, r23, r24, r25, r26, r27, r29, r31, r32)
            int r10 = r43.zzf()
            com.google.android.gms.internal.ads.zzjo r12 = r0.zzaf
            com.google.android.gms.internal.ads.zzci r12 = r12.zza
            boolean r12 = r12.zzo()
            if (r12 != 0) goto L_0x0285
            com.google.android.gms.internal.ads.zzjo r12 = r0.zzaf
            com.google.android.gms.internal.ads.zzsb r13 = r12.zzb
            java.lang.Object r13 = r13.zza
            com.google.android.gms.internal.ads.zzci r12 = r12.zza
            com.google.android.gms.internal.ads.zzcf r14 = r0.zzn
            r12.zzn(r13, r14)
            com.google.android.gms.internal.ads.zzjo r12 = r0.zzaf
            com.google.android.gms.internal.ads.zzci r12 = r12.zza
            int r12 = r12.zza(r13)
            com.google.android.gms.internal.ads.zzjo r14 = r0.zzaf
            com.google.android.gms.internal.ads.zzci r14 = r14.zza
            com.google.android.gms.internal.ads.zzch r15 = r0.zza
            r45 = r12
            r16 = r13
            r12 = 0
            com.google.android.gms.internal.ads.zzch r12 = r14.zze(r10, r15, r12)
            java.lang.Object r12 = r12.zzc
            com.google.android.gms.internal.ads.zzch r13 = r0.zza
            com.google.android.gms.internal.ads.zzbb r13 = r13.zzd
            r36 = r45
            r32 = r12
            r34 = r13
            r35 = r16
            goto L_0x028d
        L_0x0285:
            r32 = 0
            r34 = 0
            r35 = 0
            r36 = -1
        L_0x028d:
            long r37 = com.google.android.gms.internal.ads.zzeg.zzz(r50)
            com.google.android.gms.internal.ads.zzca r12 = new com.google.android.gms.internal.ads.zzca
            com.google.android.gms.internal.ads.zzjo r13 = r0.zzaf
            com.google.android.gms.internal.ads.zzsb r13 = r13.zzb
            boolean r13 = r13.zzb()
            if (r13 == 0) goto L_0x02aa
            com.google.android.gms.internal.ads.zzjo r13 = r0.zzaf
            long r13 = zzaj(r13)
            long r13 = com.google.android.gms.internal.ads.zzeg.zzz(r13)
            r39 = r13
            goto L_0x02ac
        L_0x02aa:
            r39 = r37
        L_0x02ac:
            com.google.android.gms.internal.ads.zzjo r13 = r0.zzaf
            com.google.android.gms.internal.ads.zzsb r13 = r13.zzb
            int r14 = r13.zzb
            int r13 = r13.zzc
            r31 = r12
            r33 = r10
            r41 = r14
            r42 = r13
            r31.<init>(r32, r33, r34, r35, r36, r37, r39, r41, r42)
            com.google.android.gms.internal.ads.zzdm r10 = r0.zzl
            com.google.android.gms.internal.ads.zzib r13 = new com.google.android.gms.internal.ads.zzib
            r13.<init>(r2, r7, r12)
            r2 = 11
            r10.zzd(r2, r13)
            goto L_0x02d2
        L_0x02cc:
            r17 = r10
            r19 = r14
            r20 = r15
        L_0x02d2:
            if (r6 == 0) goto L_0x02df
            com.google.android.gms.internal.ads.zzdm r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhg r6 = new com.google.android.gms.internal.ads.zzhg
            r6.<init>(r8, r4)
            r4 = 1
            r2.zzd(r4, r6)
        L_0x02df:
            com.google.android.gms.internal.ads.zzgu r2 = r3.zzf
            com.google.android.gms.internal.ads.zzgu r4 = r1.zzf
            if (r2 == r4) goto L_0x02ff
            com.google.android.gms.internal.ads.zzdm r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhh r4 = new com.google.android.gms.internal.ads.zzhh
            r4.<init>(r1)
            r6 = 10
            r2.zzd(r6, r4)
            com.google.android.gms.internal.ads.zzgu r2 = r1.zzf
            if (r2 == 0) goto L_0x02ff
            com.google.android.gms.internal.ads.zzdm r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhi r4 = new com.google.android.gms.internal.ads.zzhi
            r4.<init>(r1)
            r2.zzd(r6, r4)
        L_0x02ff:
            com.google.android.gms.internal.ads.zzvo r2 = r3.zzi
            com.google.android.gms.internal.ads.zzvo r4 = r1.zzi
            if (r2 == r4) goto L_0x0317
            com.google.android.gms.internal.ads.zzvn r2 = r0.zzi
            java.lang.Object r4 = r4.zze
            r2.zzk(r4)
            com.google.android.gms.internal.ads.zzdm r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhj r4 = new com.google.android.gms.internal.ads.zzhj
            r4.<init>(r1)
            r6 = 2
            r2.zzd(r6, r4)
        L_0x0317:
            if (r9 == 0) goto L_0x0327
            com.google.android.gms.internal.ads.zzbh r2 = r0.zzJ
            com.google.android.gms.internal.ads.zzdm r4 = r0.zzl
            com.google.android.gms.internal.ads.zzhk r6 = new com.google.android.gms.internal.ads.zzhk
            r6.<init>(r2)
            r2 = 14
            r4.zzd(r2, r6)
        L_0x0327:
            r2 = r20
            if (r2 == r5) goto L_0x0336
            com.google.android.gms.internal.ads.zzdm r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhl r4 = new com.google.android.gms.internal.ads.zzhl
            r4.<init>(r1)
            r5 = 3
            r2.zzd(r5, r4)
        L_0x0336:
            r2 = r19
            r5 = r17
            r4 = r18
            if (r11 != r2) goto L_0x0340
            if (r4 == r5) goto L_0x034b
        L_0x0340:
            com.google.android.gms.internal.ads.zzdm r6 = r0.zzl
            com.google.android.gms.internal.ads.zzhm r7 = new com.google.android.gms.internal.ads.zzhm
            r7.<init>(r1)
            r8 = -1
            r6.zzd(r8, r7)
        L_0x034b:
            if (r11 == r2) goto L_0x0358
            com.google.android.gms.internal.ads.zzdm r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhn r6 = new com.google.android.gms.internal.ads.zzhn
            r6.<init>(r1)
            r7 = 4
            r2.zzd(r7, r6)
        L_0x0358:
            if (r4 == r5) goto L_0x0367
            com.google.android.gms.internal.ads.zzdm r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhw r4 = new com.google.android.gms.internal.ads.zzhw
            r5 = r46
            r4.<init>(r1, r5)
            r5 = 5
            r2.zzd(r5, r4)
        L_0x0367:
            int r2 = r3.zzm
            int r4 = r1.zzm
            if (r2 == r4) goto L_0x0378
            com.google.android.gms.internal.ads.zzdm r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhx r4 = new com.google.android.gms.internal.ads.zzhx
            r4.<init>(r1)
            r5 = 6
            r2.zzd(r5, r4)
        L_0x0378:
            boolean r2 = zzay(r3)
            boolean r4 = zzay(r44)
            if (r2 == r4) goto L_0x038d
            com.google.android.gms.internal.ads.zzdm r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhy r4 = new com.google.android.gms.internal.ads.zzhy
            r4.<init>(r1)
            r5 = 7
            r2.zzd(r5, r4)
        L_0x038d:
            com.google.android.gms.internal.ads.zzbt r2 = r3.zzn
            com.google.android.gms.internal.ads.zzbt r4 = r1.zzn
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x03a3
            com.google.android.gms.internal.ads.zzdm r2 = r0.zzl
            com.google.android.gms.internal.ads.zzhz r4 = new com.google.android.gms.internal.ads.zzhz
            r4.<init>(r1)
            r5 = 12
            r2.zzd(r5, r4)
        L_0x03a3:
            if (r47 == 0) goto L_0x03ad
            com.google.android.gms.internal.ads.zzdm r2 = r0.zzl
            com.google.android.gms.internal.ads.zzia r4 = com.google.android.gms.internal.ads.zzia.zza
            r5 = -1
            r2.zzd(r5, r4)
        L_0x03ad:
            com.google.android.gms.internal.ads.zzbx r2 = r0.zzI
            com.google.android.gms.internal.ads.zzcb r4 = r0.zzg
            com.google.android.gms.internal.ads.zzbx r5 = r0.zzc
            com.google.android.gms.internal.ads.zzbx r4 = com.google.android.gms.internal.ads.zzeg.zzF(r4, r5)
            r0.zzI = r4
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x03cb
            com.google.android.gms.internal.ads.zzdm r2 = r0.zzl
            com.google.android.gms.internal.ads.zzho r4 = new com.google.android.gms.internal.ads.zzho
            r4.<init>(r0)
            r5 = 13
            r2.zzd(r5, r4)
        L_0x03cb:
            com.google.android.gms.internal.ads.zzdm r2 = r0.zzl
            r2.zzc()
            boolean r2 = r3.zzo
            boolean r4 = r1.zzo
            if (r2 == r4) goto L_0x03ee
            java.util.concurrent.CopyOnWriteArraySet r2 = r0.zzm
            java.util.Iterator r2 = r2.iterator()
        L_0x03dc:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x03ee
            java.lang.Object r4 = r2.next()
            com.google.android.gms.internal.ads.zzgv r4 = (com.google.android.gms.internal.ads.zzgv) r4
            boolean r5 = r1.zzo
            r4.zza(r5)
            goto L_0x03dc
        L_0x03ee:
            boolean r2 = r3.zzp
            boolean r3 = r1.zzp
            if (r2 == r3) goto L_0x040c
            java.util.concurrent.CopyOnWriteArraySet r2 = r0.zzm
            java.util.Iterator r2 = r2.iterator()
        L_0x03fa:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x040c
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.ads.zzgv r3 = (com.google.android.gms.internal.ads.zzgv) r3
            boolean r4 = r1.zzp
            r3.zzb(r4)
            goto L_0x03fa
        L_0x040c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzin.zzav(com.google.android.gms.internal.ads.zzjo, int, int, boolean, boolean, int, long, int):void");
    }

    /* access modifiers changed from: private */
    public final void zzaw() {
        int zzh2 = zzh();
        if (zzh2 == 2 || zzh2 == 3) {
            zzax();
            boolean z = this.zzaf.zzp;
            zzq();
            zzq();
        }
    }

    private final void zzax() {
        IllegalStateException illegalStateException;
        this.zze.zzb();
        if (Thread.currentThread() != this.zzs.getThread()) {
            String zzH2 = zzeg.zzH("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zzs.getThread().getName());
            if (!this.zzaa) {
                if (this.zzab) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                zzdn.zzb("ExoPlayerImpl", zzH2, illegalStateException);
                this.zzab = true;
                return;
            }
            throw new IllegalStateException(zzH2);
        }
    }

    private static boolean zzay(zzjo zzjo) {
        return zzjo.zze == 3 && zzjo.zzl && zzjo.zzm == 0;
    }

    public final zzgu zzA() {
        zzax();
        return this.zzaf.zzf;
    }

    public final void zzR(zzkl zzkl) {
        zzkl.getClass();
        this.zzr.zzw(zzkl);
    }

    public final /* synthetic */ void zzS(zziv zziv) {
        long j;
        boolean z;
        long j2;
        boolean z2;
        int i = this.zzD - zziv.zzb;
        this.zzD = i;
        boolean z3 = true;
        if (zziv.zzc) {
            this.zzE = zziv.zzd;
            this.zzF = true;
        }
        if (zziv.zze) {
            this.zzG = zziv.zzf;
        }
        if (i == 0) {
            zzci zzci = zziv.zza.zza;
            if (!this.zzaf.zza.zzo() && zzci.zzo()) {
                this.zzag = -1;
                this.zzah = 0;
            }
            if (!zzci.zzo()) {
                List zzw2 = ((zzjs) zzci).zzw();
                if (zzw2.size() == this.zzo.size()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zzcw.zzf(z2);
                for (int i2 = 0; i2 < zzw2.size(); i2++) {
                    ((zzim) this.zzo.get(i2)).zzb = (zzci) zzw2.get(i2);
                }
            }
            if (this.zzF) {
                if (zziv.zza.zzb.equals(this.zzaf.zzb) && zziv.zza.zzd == this.zzaf.zzs) {
                    z3 = false;
                }
                if (z3) {
                    if (zzci.zzo() || zziv.zza.zzb.zzb()) {
                        j2 = zziv.zza.zzd;
                    } else {
                        zzjo zzjo = zziv.zza;
                        zzsb zzsb = zzjo.zzb;
                        j2 = zzjo.zzd;
                        zzak(zzci, zzsb, j2);
                    }
                    z = z3;
                    j = j2;
                } else {
                    j = -9223372036854775807L;
                    z = z3;
                }
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.zzF = false;
            zzav(zziv.zza, 1, this.zzG, false, z, this.zzE, j, -1);
        }
    }

    public final /* synthetic */ void zzT(zziv zziv) {
        this.zzj.zzg(new zzhr(this, zziv));
    }

    public final /* synthetic */ void zzU(zzby zzby) {
        zzby.zza(this.zzI);
    }

    public final void zzW() {
        zzax();
        boolean zzq2 = zzq();
        int i = 2;
        int zzb2 = this.zzy.zzb(zzq2, 2);
        zzau(zzq2, zzb2, zzah(zzq2, zzb2));
        zzjo zzjo = this.zzaf;
        if (zzjo.zze == 1) {
            zzjo zze2 = zzjo.zze((zzgu) null);
            if (true == zze2.zza.zzo()) {
                i = 4;
            }
            zzjo zzf2 = zze2.zzf(i);
            this.zzD++;
            this.zzk.zzk();
            zzav(zzf2, 1, 1, false, false, 5, -9223372036854775807L, -1);
        }
    }

    public final void zzX() {
        AudioTrack audioTrack;
        Integer.toHexString(System.identityHashCode(this));
        int i = zzeg.zza;
        zzbc.zza();
        zzax();
        if (zzeg.zza < 21 && (audioTrack = this.zzN) != null) {
            audioTrack.release();
            this.zzN = null;
        }
        this.zzz.zze();
        this.zzy.zzd();
        if (!this.zzk.zzp()) {
            zzdm zzdm = this.zzl;
            zzdm.zzd(10, zzhs.zza);
            zzdm.zzc();
        }
        this.zzl.zze();
        this.zzj.zzd((Object) null);
        this.zzt.zzf(this.zzr);
        zzjo zzf2 = this.zzaf.zzf(1);
        this.zzaf = zzf2;
        zzjo zza = zzf2.zza(zzf2.zzb);
        this.zzaf = zza;
        zza.zzq = zza.zzs;
        this.zzaf.zzr = 0;
        this.zzr.zzQ();
        Surface surface = this.zzP;
        if (surface != null) {
            surface.release();
            this.zzP = null;
        }
        this.zzZ = zzfrh.zzo();
    }

    public final void zzY(zzkl zzkl) {
        this.zzr.zzR(zzkl);
    }

    public final void zzZ(zzsd zzsd) {
        boolean z;
        zzax();
        List singletonList = Collections.singletonList(zzsd);
        zzax();
        zzax();
        zzag();
        zzl();
        this.zzD++;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i = size - 1; i >= 0; i--) {
                this.zzo.remove(i);
            }
            this.zzaj = this.zzaj.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < singletonList.size(); i2++) {
            zzjl zzjl = new zzjl((zzsd) singletonList.get(i2), this.zzp);
            arrayList.add(zzjl);
            this.zzo.add(i2, new zzim(zzjl.zzb, zzjl.zza.zzA()));
        }
        this.zzaj = this.zzaj.zzg(0, arrayList.size());
        zzjs zzjs = new zzjs(this.zzo, this.zzaj, (byte[]) null);
        if (zzjs.zzo() || zzjs.zzc() >= 0) {
            int zzg2 = zzjs.zzg(false);
            zzjo zzan = zzan(this.zzaf, zzjs, zzal(zzjs, zzg2, -9223372036854775807L));
            int i3 = zzan.zze;
            if (!(zzg2 == -1 || i3 == 1)) {
                i3 = (zzjs.zzo() || zzg2 >= zzjs.zzc()) ? 4 : 2;
            }
            zzjo zzf2 = zzan.zzf(i3);
            this.zzk.zzq(arrayList, zzg2, zzeg.zzv(-9223372036854775807L), this.zzaj);
            if (this.zzaf.zzb.zza.equals(zzf2.zzb.zza) || this.zzaf.zza.zzo()) {
                z = false;
            } else {
                z = true;
            }
            zzav(zzf2, 0, 1, false, z, 4, zzai(zzf2), -1);
            return;
        }
        throw new zzae(zzjs, -1, -9223372036854775807L);
    }

    public final void zzaa(boolean z) {
        zzax();
        int zzb2 = this.zzy.zzb(z, zzh());
        zzau(z, zzb2, zzah(z, zzb2));
    }

    public final void zzab(boolean z) {
        this.zzaa = false;
    }

    public final void zzac(Surface surface) {
        int i;
        zzax();
        zzas(surface);
        if (surface == null) {
            i = 0;
        } else {
            i = -1;
        }
        zzap(i, i);
    }

    public final void zzad(float f) {
        zzax();
        float zza = zzeg.zza(f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        if (this.zzX != zza) {
            this.zzX = zza;
            zzar();
            zzdm zzdm = this.zzl;
            zzdm.zzd(22, new zzhu(zza));
            zzdm.zzc();
        }
    }

    public final void zzae() {
        zzax();
        zzax();
        this.zzy.zzb(zzq(), 1);
        zzat(false, (zzgu) null);
        this.zzZ = zzfrh.zzo();
    }

    public final int zzd() {
        zzax();
        if (zzs()) {
            return this.zzaf.zzb.zzb;
        }
        return -1;
    }

    public final int zze() {
        zzax();
        if (zzs()) {
            return this.zzaf.zzb.zzc;
        }
        return -1;
    }

    public final int zzf() {
        zzax();
        int zzag2 = zzag();
        if (zzag2 == -1) {
            return 0;
        }
        return zzag2;
    }

    public final int zzg() {
        zzax();
        if (this.zzaf.zza.zzo()) {
            return 0;
        }
        zzjo zzjo = this.zzaf;
        return zzjo.zza.zza(zzjo.zzb.zza);
    }

    public final int zzh() {
        zzax();
        return this.zzaf.zze;
    }

    public final int zzi() {
        zzax();
        return this.zzaf.zzm;
    }

    public final int zzj() {
        zzax();
        return 0;
    }

    public final long zzk() {
        zzax();
        if (!zzs()) {
            return zzl();
        }
        zzjo zzjo = this.zzaf;
        zzjo.zza.zzn(zzjo.zzb.zza, this.zzn);
        zzjo zzjo2 = this.zzaf;
        if (zzjo2.zzc != -9223372036854775807L) {
            return zzeg.zzz(0) + zzeg.zzz(this.zzaf.zzc);
        }
        long j = zzjo2.zza.zze(zzf(), this.zza, 0).zzm;
        return zzeg.zzz(0);
    }

    public final long zzl() {
        zzax();
        return zzeg.zzz(zzai(this.zzaf));
    }

    public final long zzm() {
        zzax();
        return zzeg.zzz(this.zzaf.zzr);
    }

    public final zzci zzn() {
        zzax();
        return this.zzaf.zza;
    }

    public final zzct zzo() {
        zzax();
        return this.zzaf.zzi.zzd;
    }

    public final void zzp(int i, long j) {
        int i2 = i;
        long j2 = j;
        zzax();
        this.zzr.zzx();
        zzci zzci = this.zzaf.zza;
        if (i2 < 0 || (!zzci.zzo() && i2 >= zzci.zzc())) {
            throw new zzae(zzci, i, j2);
        }
        int i3 = 1;
        this.zzD++;
        if (zzs()) {
            zziv zziv = new zziv(this.zzaf);
            zziv.zza(1);
            this.zzai.zza.zzT(zziv);
            return;
        }
        if (zzh() != 1) {
            i3 = 2;
        }
        int zzf2 = zzf();
        zzjo zzan = zzan(this.zzaf.zzf(i3), zzci, zzal(zzci, i, j2));
        this.zzk.zzl(zzci, i, zzeg.zzv(j));
        zzav(zzan, 0, 1, true, true, 1, zzai(zzan), zzf2);
    }

    public final boolean zzq() {
        zzax();
        return this.zzaf.zzl;
    }

    public final boolean zzr() {
        zzax();
        return false;
    }

    public final boolean zzs() {
        zzax();
        return this.zzaf.zzb.zzb();
    }

    public final int zzu() {
        zzax();
        int length = this.zzh.length;
        return 2;
    }

    public final long zzv() {
        zzax();
        if (zzs()) {
            zzjo zzjo = this.zzaf;
            if (zzjo.zzk.equals(zzjo.zzb)) {
                return zzeg.zzz(this.zzaf.zzq);
            }
            return zzw();
        }
        zzax();
        if (this.zzaf.zza.zzo()) {
            return this.zzah;
        }
        zzjo zzjo2 = this.zzaf;
        long j = 0;
        if (zzjo2.zzk.zzd != zzjo2.zzb.zzd) {
            return zzeg.zzz(zzjo2.zza.zze(zzf(), this.zza, 0).zzn);
        }
        long j2 = zzjo2.zzq;
        if (this.zzaf.zzk.zzb()) {
            zzjo zzjo3 = this.zzaf;
            zzjo3.zza.zzn(zzjo3.zzk.zza, this.zzn).zzh(this.zzaf.zzk.zzb);
        } else {
            j = j2;
        }
        zzjo zzjo4 = this.zzaf;
        zzak(zzjo4.zza, zzjo4.zzk, j);
        return zzeg.zzz(j);
    }

    public final long zzw() {
        zzax();
        if (!zzs()) {
            zzci zzn2 = zzn();
            if (zzn2.zzo()) {
                return -9223372036854775807L;
            }
            return zzeg.zzz(zzn2.zze(zzf(), this.zza, 0).zzn);
        }
        zzjo zzjo = this.zzaf;
        zzsb zzsb = zzjo.zzb;
        zzjo.zza.zzn(zzsb.zza, this.zzn);
        return zzeg.zzz(this.zzn.zzg(zzsb.zzb, zzsb.zzc));
    }
}
