package p767rg;

import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkj;
import com.google.android.gms.internal.mlkit_vision_barcode.zznm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzno;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.List;
import p627lg.C18207f;
import p627lg.C18208g;
import p674ng.C18549b;
import p791sg.C19459a;
import p815tg.C19671a;
import p815tg.C19674d;

/* renamed from: rg.g */
public final class C19267g extends C18207f {

    /* renamed from: j */
    public static final C19674d f48967j = C19674d.f49953a;

    /* renamed from: k */
    public static boolean f48968k = true;

    /* renamed from: d */
    public final C18549b f48969d;

    /* renamed from: e */
    public final C19268h f48970e;

    /* renamed from: f */
    public final zznm f48971f;

    /* renamed from: g */
    public final zzno f48972g;

    /* renamed from: h */
    public final C19671a f48973h = new C19671a();

    /* renamed from: i */
    public boolean f48974i;

    public C19267g(C18208g gVar, C18549b bVar, C19268h hVar, zznm zznm) {
        Preconditions.checkNotNull(gVar, "MlKitContext can not be null");
        Preconditions.checkNotNull(bVar, "BarcodeScannerOptions can not be null");
        this.f48969d = bVar;
        this.f48970e = hVar;
        this.f48971f = zznm;
        this.f48972g = zzno.zza(gVar.mo50623b());
    }

    /* renamed from: b */
    public final synchronized void mo50628b() throws MlKitException {
        this.f48974i = this.f48970e.zzc();
    }

    /* renamed from: c */
    public final synchronized void mo50629c() {
        this.f48970e.zzb();
        f48968k = true;
    }

    /* renamed from: d */
    public final List mo50621d(C19459a aVar) throws MlKitException {
        zzkj zzkj;
        ArrayList a;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f48973h.mo52039a(aVar);
            try {
                a = this.f48970e.mo51684a(aVar);
                mo51683e(zzkj.NO_ERROR, elapsedRealtime, aVar, a);
                f48968k = false;
            } catch (MlKitException e) {
                MlKitException mlKitException = e;
                if (mlKitException.mo43875a() == 14) {
                    zzkj = zzkj.MODEL_NOT_DOWNLOADED;
                } else {
                    zzkj = zzkj.UNKNOWN_ERROR;
                }
                mo51683e(zzkj, elapsedRealtime, aVar, (List) null);
                throw mlKitException;
            }
        }
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (r2 == 0) goto L_0x002e;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51683e(com.google.android.gms.internal.mlkit_vision_barcode.zzkj r29, long r30, p791sg.C19459a r32, java.util.List r33) {
        /*
            r28 = this;
            r8 = r28
            com.google.android.gms.internal.mlkit_vision_barcode.zzbz r9 = new com.google.android.gms.internal.mlkit_vision_barcode.zzbz
            r9.<init>()
            com.google.android.gms.internal.mlkit_vision_barcode.zzbz r10 = new com.google.android.gms.internal.mlkit_vision_barcode.zzbz
            r10.<init>()
            if (r33 == 0) goto L_0x0053
            java.util.Iterator r0 = r33.iterator()
        L_0x0012:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0053
            java.lang.Object r1 = r0.next()
            pg.a r1 = (p722pg.C18922a) r1
            qg.a r2 = r1.f48163a
            int r2 = r2.getFormat()
            r3 = 4096(0x1000, float:5.74E-42)
            r4 = -1
            if (r2 > r3) goto L_0x002c
            if (r2 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002c:
            r2 = -1
        L_0x002d:
            r4 = r2
        L_0x002e:
            android.util.SparseArray r2 = p767rg.C19261a.f48952a
            java.lang.Object r2 = r2.get(r4)
            com.google.android.gms.internal.mlkit_vision_barcode.zzkv r2 = (com.google.android.gms.internal.mlkit_vision_barcode.zzkv) r2
            if (r2 != 0) goto L_0x003a
            com.google.android.gms.internal.mlkit_vision_barcode.zzkv r2 = com.google.android.gms.internal.mlkit_vision_barcode.zzkv.FORMAT_UNKNOWN
        L_0x003a:
            r9.zzd(r2)
            qg.a r1 = r1.f48163a
            int r1 = r1.mo51555c()
            android.util.SparseArray r2 = p767rg.C19261a.f48953b
            java.lang.Object r1 = r2.get(r1)
            com.google.android.gms.internal.mlkit_vision_barcode.zzkw r1 = (com.google.android.gms.internal.mlkit_vision_barcode.zzkw) r1
            if (r1 != 0) goto L_0x004f
            com.google.android.gms.internal.mlkit_vision_barcode.zzkw r1 = com.google.android.gms.internal.mlkit_vision_barcode.zzkw.TYPE_UNKNOWN
        L_0x004f:
            r10.zzd(r1)
            goto L_0x0012
        L_0x0053:
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r19 = r0 - r30
            rg.f r11 = new rg.f
            r0 = r11
            r1 = r28
            r2 = r19
            r4 = r29
            r5 = r9
            r6 = r10
            r7 = r32
            r0.<init>(r1, r2, r4, r5, r6, r7)
            com.google.android.gms.internal.mlkit_vision_barcode.zznm r0 = r8.f48971f
            com.google.android.gms.internal.mlkit_vision_barcode.zzkk r1 = com.google.android.gms.internal.mlkit_vision_barcode.zzkk.ON_DEVICE_BARCODE_DETECT
            r0.zzb(r11, r1)
            com.google.android.gms.internal.mlkit_vision_barcode.zzdw r0 = new com.google.android.gms.internal.mlkit_vision_barcode.zzdw
            r0.<init>()
            r1 = r29
            r0.zze(r1)
            boolean r2 = f48968k
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.zzf(r2)
            ng.b r2 = r8.f48969d
            com.google.android.gms.internal.mlkit_vision_barcode.zzmy r2 = p767rg.C19261a.m46515a(r2)
            r0.zzg(r2)
            com.google.android.gms.internal.mlkit_vision_barcode.zzcc r2 = r9.zzf()
            r0.zzc(r2)
            com.google.android.gms.internal.mlkit_vision_barcode.zzcc r2 = r10.zzf()
            r0.zzd(r2)
            com.google.android.gms.internal.mlkit_vision_barcode.zzdy r14 = r0.zzh()
            rg.e r0 = new rg.e
            r0.<init>(r8)
            com.google.android.gms.internal.mlkit_vision_barcode.zznm r12 = r8.f48971f
            com.google.android.gms.internal.mlkit_vision_barcode.zzkk r13 = com.google.android.gms.internal.mlkit_vision_barcode.zzkk.AGGREGATED_ON_DEVICE_BARCODE_DETECTION
            java.util.concurrent.Executor r2 = com.google.mlkit.common.sdkinternal.C14564a.m36405c()
            com.google.android.gms.internal.mlkit_vision_barcode.zzng r3 = new com.google.android.gms.internal.mlkit_vision_barcode.zzng
            r18 = 0
            r11 = r3
            r15 = r19
            r17 = r0
            r11.<init>(r12, r13, r14, r15, r17, r18)
            r2.execute(r3)
            long r26 = java.lang.System.currentTimeMillis()
            boolean r0 = r8.f48974i
            long r24 = r26 - r19
            com.google.android.gms.internal.mlkit_vision_barcode.zzno r2 = r8.f48972g
            r3 = 1
            if (r3 == r0) goto L_0x00cc
            r0 = 24301(0x5eed, float:3.4053E-41)
            r22 = 24301(0x5eed, float:3.4053E-41)
            goto L_0x00d0
        L_0x00cc:
            r0 = 24302(0x5eee, float:3.4054E-41)
            r22 = 24302(0x5eee, float:3.4054E-41)
        L_0x00d0:
            int r23 = r29.zza()
            r21 = r2
            r21.zzc(r22, r23, r24, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p767rg.C19267g.mo51683e(com.google.android.gms.internal.mlkit_vision_barcode.zzkj, long, sg.a, java.util.List):void");
    }
}
