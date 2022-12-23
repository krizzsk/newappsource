package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzckv extends zzchi implements zzft, zzkl {
    public static final /* synthetic */ int zzc = 0;
    private final Context zzd;
    private final zzckg zze;
    private final zzvf zzf;
    private final zzchq zzg;
    private final WeakReference zzh;
    private final zztg zzi;
    private zzjz zzj;
    private ByteBuffer zzk;
    private boolean zzl;
    private zzchh zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private final String zzq;
    private final int zzr;
    private final Object zzs = new Object();
    private final ArrayList zzt;
    private volatile zzcki zzu;
    private final Set zzv = new HashSet();

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f5, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(com.google.android.gms.internal.ads.zzbhy.zzbB)).booleanValue() == false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f9, code lost:
        if (r7.zzj == false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00fb, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00fe, code lost:
        if (r7.zzo == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0100, code lost:
        r8 = new com.google.android.gms.internal.ads.zzckm(r5, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0108, code lost:
        if (r7.zzi <= 0) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010a, code lost:
        r8 = new com.google.android.gms.internal.ads.zzckn(r5, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0110, code lost:
        r8 = new com.google.android.gms.internal.ads.zzcko(r5, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0117, code lost:
        if (r7.zzj == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0119, code lost:
        r7 = new com.google.android.gms.internal.ads.zzckp(r5, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0120, code lost:
        r7 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0121, code lost:
        r6 = r5.zzk;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0123, code lost:
        if (r6 == null) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0129, code lost:
        if (r6.limit() <= 0) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012b, code lost:
        r6 = new byte[r5.zzk.limit()];
        r5.zzk.get(r6);
        r7 = new com.google.android.gms.internal.ads.zzckq(r7, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzckv(android.content.Context r6, com.google.android.gms.internal.ads.zzchq r7, com.google.android.gms.internal.ads.zzchr r8) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r5.zzs = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r5.zzv = r0
            r5.zzd = r6
            r5.zzg = r7
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r8)
            r5.zzh = r0
            com.google.android.gms.internal.ads.zzckg r0 = new com.google.android.gms.internal.ads.zzckg
            r0.<init>()
            r5.zze = r0
            com.google.android.gms.internal.ads.zzvf r1 = new com.google.android.gms.internal.ads.zzvf
            r1.<init>(r6)
            r5.zzf = r1
            boolean r2 = com.google.android.gms.ads.internal.util.zze.zzc()
            if (r2 == 0) goto L_0x003d
            java.lang.String r2 = r5.toString()
            java.lang.String r3 = "OfficialSimpleExoPlayerAdapter initialize "
            java.lang.String r2 = r3.concat(r2)
            com.google.android.gms.ads.internal.util.zze.zza(r2)
        L_0x003d:
            java.util.concurrent.atomic.AtomicInteger r2 = com.google.android.gms.internal.ads.zzchi.zza
            r2.incrementAndGet()
            com.google.android.gms.internal.ads.zzjy r2 = new com.google.android.gms.internal.ads.zzjy
            com.google.android.gms.internal.ads.zzckr r3 = new com.google.android.gms.internal.ads.zzckr
            r3.<init>(r5)
            r4 = 0
            r2.<init>(r6, r3, r4)
            r2.zzb(r1)
            r2.zza(r0)
            com.google.android.gms.internal.ads.zzjz r0 = r2.zzc()
            r5.zzj = r0
            com.google.android.gms.internal.ads.zzbhq r0 = com.google.android.gms.internal.ads.zzbhy.zzbI
            com.google.android.gms.internal.ads.zzbhw r1 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0070
            com.google.android.gms.internal.ads.zzjz r0 = r5.zzj
            com.google.android.gms.internal.ads.zziy.zza(r0)
        L_0x0070:
            com.google.android.gms.internal.ads.zzjz r0 = r5.zzj
            r0.zzx(r5)
            r0 = 0
            r5.zzn = r0
            r1 = 0
            r5.zzp = r1
            r5.zzo = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zzt = r1
            r5.zzu = r4
            if (r8 == 0) goto L_0x0094
            java.lang.String r1 = r8.zzt()
            if (r1 == 0) goto L_0x0094
            java.lang.String r1 = r8.zzt()
            goto L_0x0096
        L_0x0094:
            java.lang.String r1 = ""
        L_0x0096:
            r5.zzq = r1
            if (r8 == 0) goto L_0x009f
            int r1 = r8.zzh()
            goto L_0x00a0
        L_0x009f:
            r1 = 0
        L_0x00a0:
            r5.zzr = r1
            com.google.android.gms.internal.ads.zztg r1 = new com.google.android.gms.internal.ads.zztg
            com.google.android.gms.ads.internal.util.zzs r2 = com.google.android.gms.ads.internal.zzt.zzp()
            com.google.android.gms.internal.ads.zzcfo r8 = r8.zzp()
            java.lang.String r8 = r8.zza
            java.lang.String r6 = r2.zzc(r6, r8)
            boolean r8 = r5.zzl
            if (r8 == 0) goto L_0x00d2
            java.nio.ByteBuffer r8 = r5.zzk
            int r8 = r8.limit()
            if (r8 <= 0) goto L_0x00d2
            java.nio.ByteBuffer r6 = r5.zzk
            int r6 = r6.limit()
            byte[] r6 = new byte[r6]
            java.nio.ByteBuffer r7 = r5.zzk
            r7.get(r6)
            com.google.android.gms.internal.ads.zzckk r7 = new com.google.android.gms.internal.ads.zzckk
            r7.<init>(r6)
            goto L_0x013e
        L_0x00d2:
            com.google.android.gms.internal.ads.zzbhq r8 = com.google.android.gms.internal.ads.zzbhy.zzbK
            com.google.android.gms.internal.ads.zzbhw r2 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r8 = r2.zzb(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r2 = 1
            if (r8 == 0) goto L_0x00f7
            com.google.android.gms.internal.ads.zzbhq r8 = com.google.android.gms.internal.ads.zzbhy.zzbB
            com.google.android.gms.internal.ads.zzbhw r3 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r8 = r3.zzb(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x00fb
        L_0x00f7:
            boolean r8 = r7.zzj
            if (r8 != 0) goto L_0x00fc
        L_0x00fb:
            r0 = 1
        L_0x00fc:
            boolean r8 = r7.zzo
            if (r8 == 0) goto L_0x0106
            com.google.android.gms.internal.ads.zzckm r8 = new com.google.android.gms.internal.ads.zzckm
            r8.<init>(r5, r6, r0)
            goto L_0x0115
        L_0x0106:
            int r8 = r7.zzi
            if (r8 <= 0) goto L_0x0110
            com.google.android.gms.internal.ads.zzckn r8 = new com.google.android.gms.internal.ads.zzckn
            r8.<init>(r5, r6, r0)
            goto L_0x0115
        L_0x0110:
            com.google.android.gms.internal.ads.zzcko r8 = new com.google.android.gms.internal.ads.zzcko
            r8.<init>(r5, r6, r0)
        L_0x0115:
            boolean r6 = r7.zzj
            if (r6 == 0) goto L_0x0120
            com.google.android.gms.internal.ads.zzckp r6 = new com.google.android.gms.internal.ads.zzckp
            r6.<init>(r5, r8)
            r7 = r6
            goto L_0x0121
        L_0x0120:
            r7 = r8
        L_0x0121:
            java.nio.ByteBuffer r6 = r5.zzk
            if (r6 == 0) goto L_0x013e
            int r6 = r6.limit()
            if (r6 <= 0) goto L_0x013e
            java.nio.ByteBuffer r6 = r5.zzk
            int r6 = r6.limit()
            byte[] r6 = new byte[r6]
            java.nio.ByteBuffer r8 = r5.zzk
            r8.get(r6)
            com.google.android.gms.internal.ads.zzckq r8 = new com.google.android.gms.internal.ads.zzckq
            r8.<init>(r7, r6)
            r7 = r8
        L_0x013e:
            com.google.android.gms.internal.ads.zzbhq r6 = com.google.android.gms.internal.ads.zzbhy.zzm
            com.google.android.gms.internal.ads.zzbhw r8 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r6 = r8.zzb(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0153
            com.google.android.gms.internal.ads.zzckt r6 = com.google.android.gms.internal.ads.zzckt.zza
            goto L_0x0155
        L_0x0153:
            com.google.android.gms.internal.ads.zzcku r6 = com.google.android.gms.internal.ads.zzcku.zza
        L_0x0155:
            com.google.android.gms.internal.ads.zztf r8 = new com.google.android.gms.internal.ads.zztf
            r8.<init>(r6)
            r1.<init>(r7, r8, r4)
            r5.zzi = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzckv.<init>(android.content.Context, com.google.android.gms.internal.ads.zzchq, com.google.android.gms.internal.ads.zzchr):void");
    }

    private final boolean zzZ() {
        return this.zzu != null && this.zzu.zzq();
    }

    public final void finalize() {
        zzchi.zza.decrementAndGet();
        if (zze.zzc()) {
            zze.zza("OfficialSimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    public final long zzA() {
        if (!zzZ()) {
            return (long) this.zzn;
        }
        return 0;
    }

    public final long zzB() {
        if (zzZ()) {
            return this.zzu.zzl();
        }
        synchronized (this.zzs) {
            while (!this.zzt.isEmpty()) {
                long j = this.zzp;
                Map zze2 = ((zzfo) this.zzt.remove(0)).zze();
                long j2 = 0;
                if (zze2 != null) {
                    Iterator it = zze2.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (!(entry.getKey() == null || !zzfoa.zzc("content-length", (CharSequence) entry.getKey()) || entry.getValue() == null || ((List) entry.getValue()).get(0) == null)) {
                                    j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.zzp = j + j2;
            }
        }
        return this.zzp;
    }

    public final void zzC(Uri[] uriArr, String str) {
        zzD(uriArr, str, ByteBuffer.allocate(0), false);
    }

    public final void zzD(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzsd zzsd;
        if (this.zzj != null) {
            this.zzk = byteBuffer;
            this.zzl = z;
            int length = uriArr.length;
            if (length == 1) {
                zzsd = zzW(uriArr[0]);
            } else {
                zzsd[] zzsdArr = new zzsd[length];
                for (int i = 0; i < uriArr.length; i++) {
                    zzsdArr[i] = zzW(uriArr[i]);
                }
                zzsd = new zzst(false, false, zzsdArr);
            }
            this.zzj.zzB(zzsd);
            this.zzj.zzy();
            zzchi.zzb.incrementAndGet();
        }
    }

    public final void zzE() {
        zzjz zzjz = this.zzj;
        if (zzjz != null) {
            zzjz.zzA(this);
            this.zzj.zzz();
            this.zzj = null;
            zzchi.zzb.decrementAndGet();
        }
    }

    public final void zzF(long j) {
        zzjz zzjz = this.zzj;
        zzjz.zzp(zzjz.zzf(), j);
    }

    public final void zzG(int i) {
        this.zze.zzk(i);
    }

    public final void zzH(int i) {
        this.zze.zzl(i);
    }

    public final void zzI(zzchh zzchh) {
        this.zzm = zzchh;
    }

    public final void zzJ(int i) {
        this.zze.zzm(i);
    }

    public final void zzK(int i) {
        this.zze.zzn(i);
    }

    public final void zzL(boolean z) {
        this.zzj.zzC(z);
    }

    public final void zzM(boolean z) {
        if (this.zzj != null) {
            int i = 0;
            while (true) {
                this.zzj.zzt();
                if (i < 2) {
                    zzvf zzvf = this.zzf;
                    zzuw zzd2 = zzvf.zzc().zzd();
                    zzd2.zzo(i, !z);
                    zzvf.zzg(zzd2);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void zzN(int i) {
        for (WeakReference weakReference : this.zzv) {
            zzckf zzckf = (zzckf) weakReference.get();
            if (zzckf != null) {
                zzckf.zzm(i);
            }
        }
    }

    public final void zzO(Surface surface, boolean z) {
        zzjz zzjz = this.zzj;
        if (zzjz != null) {
            zzjz.zzE(surface);
        }
    }

    public final void zzP(float f, boolean z) {
        zzjz zzjz = this.zzj;
        if (zzjz != null) {
            zzjz.zzF(f);
        }
    }

    public final void zzQ() {
        this.zzj.zzG();
    }

    public final boolean zzR() {
        return this.zzj != null;
    }

    public final /* synthetic */ zzer zzS(String str, boolean z) {
        zzckv zzckv = true != z ? null : this;
        zzchq zzchq = this.zzg;
        return new zzcky(str, zzckv, zzchq.zzd, zzchq.zzf, zzchq.zzp, zzchq.zzq);
    }

    public final /* synthetic */ zzer zzT(String str, boolean z) {
        zzckv zzckv;
        if (true != z) {
            zzckv = null;
        } else {
            zzckv = this;
        }
        zzchq zzchq = this.zzg;
        zzckf zzckf = new zzckf(str, zzckv, zzchq.zzd, zzchq.zzf, zzchq.zzi);
        this.zzv.add(new WeakReference(zzckf));
        return zzckf;
    }

    public final /* synthetic */ zzer zzU(String str, boolean z) {
        zzckv zzckv;
        zzez zzez = new zzez();
        zzez.zzf(str);
        if (true != z) {
            zzckv = null;
        } else {
            zzckv = this;
        }
        zzez.zze(zzckv);
        zzez.zzc(this.zzg.zzd);
        zzez.zzd(this.zzg.zzf);
        zzez.zzb(true);
        return zzez.zza();
    }

    public final /* synthetic */ zzer zzV(zzeq zzeq) {
        return new zzcki(this.zzd, zzeq.zza(), this.zzq, this.zzr, this, new zzckl(this), (byte[]) null);
    }

    @VisibleForTesting
    public final zzsd zzW(Uri uri) {
        zzah zzah = new zzah();
        zzah.zzb(uri);
        zzbb zzc2 = zzah.zzc();
        zztg zztg = this.zzi;
        zztg.zza(this.zzg.zzg);
        return zztg.zzb(zzc2);
    }

    public final /* synthetic */ void zzX(boolean z, long j) {
        zzchh zzchh = this.zzm;
        if (zzchh != null) {
            zzchh.zzi(z, j);
        }
    }

    public final /* synthetic */ zzju[] zzY(Handler handler, zzxr zzxr, zznl zznl, zzub zzub, zzrb zzrb) {
        Context context = this.zzd;
        zzql zzql = zzql.zzb;
        zzmw zzmw = zzmw.zza;
        zzmz[] zzmzArr = new zzmz[0];
        zzob zzob = new zzob();
        if (zzmw == null && zzmw == null) {
            throw new NullPointerException("Both parameters are null");
        }
        zzob.zzb(zzmw);
        zzob.zzc(zzmzArr);
        zzon zzd2 = zzob.zzd();
        zzqd zzqd = zzqd.zza;
        return new zzju[]{new zzot(context, zzqd, zzql, false, handler, zznl, zzd2), new zzwx(this.zzd, zzqd, zzql, 0, false, handler, zzxr, -1, 30.0f)};
    }

    public final void zza(zzer zzer, zzew zzew, boolean z, int i) {
        this.zzn += i;
    }

    public final void zzb(zzer zzer, zzew zzew, boolean z) {
    }

    public final void zzc(zzer zzer, zzew zzew, boolean z) {
    }

    public final void zzd(zzer zzer, zzew zzew, boolean z) {
        if (zzer instanceof zzfo) {
            synchronized (this.zzs) {
                this.zzt.add((zzfo) zzer);
            }
        } else if (zzer instanceof zzcki) {
            this.zzu = (zzcki) zzer;
            zzchr zzchr = (zzchr) this.zzh.get();
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzbB)).booleanValue() && zzchr != null && this.zzu.zzn()) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzu.zzp()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzu.zzo()));
                zzs.zza.post(new zzcks(zzchr, hashMap));
            }
        }
    }

    public final void zze(zzkj zzkj, zzad zzad, zzgn zzgn) {
        zzchr zzchr = (zzchr) this.zzh.get();
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzbB)).booleanValue() && zzchr != null && zzad != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("audioMime", zzad.zzl);
            hashMap.put("audioSampleMime", zzad.zzm);
            hashMap.put("audioCodec", zzad.zzj);
            zzchr.zzd("onMetadataEvent", hashMap);
        }
    }

    public final /* synthetic */ void zzf(zzkj zzkj, int i, long j, long j2) {
    }

    public final /* synthetic */ void zzg(zzkj zzkj, zzrx zzrx) {
    }

    public final void zzh(zzkj zzkj, int i, long j) {
        this.zzo += i;
    }

    public final /* synthetic */ void zzi(zzcb zzcb, zzkk zzkk) {
    }

    public final void zzj(zzkj zzkj, zzrs zzrs, zzrx zzrx, IOException iOException, boolean z) {
        zzchh zzchh = this.zzm;
        if (zzchh == null) {
            return;
        }
        if (this.zzg.zzl) {
            zzchh.zzl("onLoadException", iOException);
        } else {
            zzchh.zzk("onLoadError", iOException);
        }
    }

    public final void zzk(zzkj zzkj, int i) {
        zzchh zzchh = this.zzm;
        if (zzchh != null) {
            zzchh.zzm(i);
        }
    }

    public final void zzl(zzkj zzkj, zzbr zzbr) {
        zzchh zzchh = this.zzm;
        if (zzchh != null) {
            zzchh.zzk("onPlayerError", zzbr);
        }
    }

    public final /* synthetic */ void zzm(zzkj zzkj, zzca zzca, zzca zzca2, int i) {
    }

    public final void zzn(zzkj zzkj, Object obj, long j) {
        zzchh zzchh = this.zzm;
        if (zzchh != null) {
            zzchh.zzv();
        }
    }

    public final /* synthetic */ void zzo(zzkj zzkj, zzgm zzgm) {
    }

    public final void zzp(zzkj zzkj, zzad zzad, zzgn zzgn) {
        zzchr zzchr = (zzchr) this.zzh.get();
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzbB)).booleanValue() && zzchr != null && zzad != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(zzad.zzt));
            hashMap.put("bitRate", String.valueOf(zzad.zzi));
            int i = zzad.zzr;
            int i2 = zzad.zzs;
            hashMap.put("resolution", i + "x" + i2);
            hashMap.put("videoMime", zzad.zzl);
            hashMap.put("videoSampleMime", zzad.zzm);
            hashMap.put("videoCodec", zzad.zzj);
            zzchr.zzd("onMetadataEvent", hashMap);
        }
    }

    public final void zzq(zzkj zzkj, zzcv zzcv) {
        zzchh zzchh = this.zzm;
        if (zzchh != null) {
            zzchh.zzC(zzcv.zzc, zzcv.zzd);
        }
    }

    public final int zzr() {
        return this.zzo;
    }

    public final int zzt() {
        return this.zzj.zzh();
    }

    public final long zzv() {
        return this.zzj.zzu();
    }

    public final long zzw() {
        return (long) this.zzn;
    }

    public final long zzx() {
        if (zzZ() && this.zzu.zzp()) {
            return Math.min((long) this.zzn, this.zzu.zzk());
        }
        return 0;
    }

    public final long zzy() {
        return this.zzj.zzl();
    }

    public final long zzz() {
        return this.zzj.zzv();
    }
}
