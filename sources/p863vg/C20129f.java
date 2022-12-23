package p863vg;

import android.os.SystemClock;
import androidx.appcompat.app.C0262r;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_face.zzdl;
import com.google.android.gms.internal.mlkit_vision_face.zzdm;
import com.google.android.gms.internal.mlkit_vision_face.zzin;
import com.google.android.gms.internal.mlkit_vision_face.zzio;
import com.google.android.gms.internal.mlkit_vision_face.zzko;
import com.google.android.gms.internal.mlkit_vision_face.zzla;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p627lg.C18207f;
import p791sg.C19459a;
import p815tg.C19671a;
import p815tg.C19674d;
import p839ug.C19907a;
import p839ug.C19910d;

/* renamed from: vg.f */
public final class C20129f extends C18207f<List<C19907a>, C19459a> {

    /* renamed from: i */
    public static final AtomicBoolean f51077i = new AtomicBoolean(true);

    /* renamed from: j */
    public static final C19674d f51078j = C19674d.f49953a;

    /* renamed from: d */
    public final C19910d f51079d;

    /* renamed from: e */
    public final zzko f51080e;

    /* renamed from: f */
    public final C20125b f51081f;

    /* renamed from: g */
    public boolean f51082g;

    /* renamed from: h */
    public final C19671a f51083h = new C19671a();

    public C20129f(zzko zzko, C19910d dVar, C20125b bVar) {
        Preconditions.checkNotNull(dVar, "FaceDetectorOptions can not be null");
        this.f51079d = dVar;
        this.f51080e = zzko;
        this.f51081f = bVar;
    }

    /* renamed from: e */
    public static void m47719e(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C19907a) it.next()).f50543b = -1;
        }
    }

    /* renamed from: b */
    public final synchronized void mo50628b() throws MlKitException {
        this.f51082g = this.f51081f.zza();
    }

    /* renamed from: c */
    public final synchronized void mo50629c() {
        this.f51081f.zzc();
        f51077i.set(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ff A[Catch:{ MlKitException -> 0x00cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0101 A[Catch:{ MlKitException -> 0x00cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0108 A[Catch:{ MlKitException -> 0x00cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010a A[Catch:{ MlKitException -> 0x00cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012e  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo50621d(p791sg.C19459a r21) throws com.google.mlkit.common.MlKitException {
        /*
            r20 = this;
            r8 = r20
            r9 = r21
            monitor-enter(r20)
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x013d }
            tg.a r0 = r8.f51083h     // Catch:{ all -> 0x013d }
            r0.mo52039a(r9)     // Catch:{ all -> 0x013d }
            vg.b r0 = r8.f51081f     // Catch:{ MlKitException -> 0x0120 }
            android.util.Pair r0 = r0.mo52370a(r9)     // Catch:{ MlKitException -> 0x0120 }
            java.lang.Object r1 = r0.first     // Catch:{ MlKitException -> 0x0120 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ MlKitException -> 0x0120 }
            java.lang.Object r0 = r0.second     // Catch:{ MlKitException -> 0x0120 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ MlKitException -> 0x0120 }
            if (r1 != 0) goto L_0x002b
            if (r0 == 0) goto L_0x0021
            goto L_0x002b
        L_0x0021:
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException     // Catch:{ MlKitException -> 0x0120 }
            java.lang.String r1 = "No detector is enabled"
            r2 = 13
            r0.<init>(r1, r2)     // Catch:{ MlKitException -> 0x0120 }
            throw r0     // Catch:{ MlKitException -> 0x0120 }
        L_0x002b:
            if (r1 != 0) goto L_0x0034
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ MlKitException -> 0x0120 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ MlKitException -> 0x0120 }
            goto L_0x003c
        L_0x0034:
            if (r0 != 0) goto L_0x0041
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch:{ MlKitException -> 0x0120 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ MlKitException -> 0x0120 }
        L_0x003c:
            r9 = r2
            r18 = r10
            goto L_0x00fb
        L_0x0041:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ MlKitException -> 0x0120 }
            r2.<init>()     // Catch:{ MlKitException -> 0x0120 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ MlKitException -> 0x0120 }
        L_0x004a:
            boolean r4 = r3.hasNext()     // Catch:{ MlKitException -> 0x0120 }
            if (r4 == 0) goto L_0x00f3
            java.lang.Object r4 = r3.next()     // Catch:{ MlKitException -> 0x0120 }
            ug.a r4 = (p839ug.C19907a) r4     // Catch:{ MlKitException -> 0x0120 }
            java.util.Iterator r5 = r1.iterator()     // Catch:{ MlKitException -> 0x0120 }
            r6 = 0
        L_0x005b:
            boolean r7 = r5.hasNext()     // Catch:{ MlKitException -> 0x0120 }
            if (r7 == 0) goto L_0x00e2
            java.lang.Object r7 = r5.next()     // Catch:{ MlKitException -> 0x0120 }
            ug.a r7 = (p839ug.C19907a) r7     // Catch:{ MlKitException -> 0x0120 }
            android.graphics.Rect r13 = r4.f50542a     // Catch:{ MlKitException -> 0x0120 }
            if (r13 == 0) goto L_0x00cf
            android.graphics.Rect r14 = r7.f50542a     // Catch:{ MlKitException -> 0x0120 }
            if (r14 == 0) goto L_0x00cf
            boolean r15 = r13.intersect(r14)     // Catch:{ MlKitException -> 0x0120 }
            if (r15 == 0) goto L_0x00cf
            int r15 = r13.right     // Catch:{ MlKitException -> 0x0120 }
            int r12 = r14.right     // Catch:{ MlKitException -> 0x0120 }
            int r12 = java.lang.Math.min(r15, r12)     // Catch:{ MlKitException -> 0x0120 }
            int r15 = r13.left     // Catch:{ MlKitException -> 0x0120 }
            r16 = r3
            int r3 = r14.left     // Catch:{ MlKitException -> 0x0120 }
            int r3 = java.lang.Math.max(r15, r3)     // Catch:{ MlKitException -> 0x0120 }
            int r12 = r12 - r3
            int r3 = r13.bottom     // Catch:{ MlKitException -> 0x0120 }
            int r15 = r14.bottom     // Catch:{ MlKitException -> 0x0120 }
            int r3 = java.lang.Math.min(r3, r15)     // Catch:{ MlKitException -> 0x0120 }
            int r15 = r13.top     // Catch:{ MlKitException -> 0x0120 }
            r17 = r5
            int r5 = r14.top     // Catch:{ MlKitException -> 0x0120 }
            int r5 = java.lang.Math.max(r15, r5)     // Catch:{ MlKitException -> 0x0120 }
            int r3 = r3 - r5
            int r3 = r3 * r12
            r18 = r10
            double r9 = (double) r3
            int r3 = r13.right     // Catch:{ MlKitException -> 0x00cd }
            int r5 = r13.left     // Catch:{ MlKitException -> 0x00cd }
            int r3 = r3 - r5
            int r5 = r13.bottom     // Catch:{ MlKitException -> 0x00cd }
            int r11 = r13.top     // Catch:{ MlKitException -> 0x00cd }
            int r5 = r5 - r11
            int r5 = r5 * r3
            double r11 = (double) r5     // Catch:{ MlKitException -> 0x00cd }
            int r3 = r14.right     // Catch:{ MlKitException -> 0x00cd }
            int r5 = r14.left     // Catch:{ MlKitException -> 0x00cd }
            int r3 = r3 - r5
            int r5 = r14.bottom     // Catch:{ MlKitException -> 0x00cd }
            int r13 = r14.top     // Catch:{ MlKitException -> 0x00cd }
            int r5 = r5 - r13
            int r5 = r5 * r3
            double r13 = (double) r5     // Catch:{ MlKitException -> 0x00cd }
            double r11 = r11 + r13
            double r11 = r11 - r9
            double r9 = r9 / r11
            r11 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x00d5
            android.util.SparseArray<ug.b> r3 = r4.f50551j     // Catch:{ MlKitException -> 0x00cd }
            r7.mo52185a(r3)     // Catch:{ MlKitException -> 0x00cd }
            r6 = 1
            goto L_0x00d5
        L_0x00cd:
            r0 = move-exception
            goto L_0x0123
        L_0x00cf:
            r16 = r3
            r17 = r5
            r18 = r10
        L_0x00d5:
            r2.add(r7)     // Catch:{ MlKitException -> 0x00cd }
            r9 = r21
            r3 = r16
            r5 = r17
            r10 = r18
            goto L_0x005b
        L_0x00e2:
            r16 = r3
            r18 = r10
            if (r6 != 0) goto L_0x00eb
            r2.add(r4)     // Catch:{ MlKitException -> 0x00cd }
        L_0x00eb:
            r9 = r21
            r3 = r16
            r10 = r18
            goto L_0x004a
        L_0x00f3:
            r18 = r10
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ MlKitException -> 0x00cd }
            r3.<init>(r2)     // Catch:{ MlKitException -> 0x00cd }
            r9 = r3
        L_0x00fb:
            com.google.android.gms.internal.mlkit_vision_face.zzin r6 = com.google.android.gms.internal.mlkit_vision_face.zzin.NO_ERROR     // Catch:{ MlKitException -> 0x00cd }
            if (r0 != 0) goto L_0x0101
            r2 = 0
            goto L_0x0106
        L_0x0101:
            int r0 = r0.size()     // Catch:{ MlKitException -> 0x00cd }
            r2 = r0
        L_0x0106:
            if (r1 != 0) goto L_0x010a
            r3 = 0
            goto L_0x010f
        L_0x010a:
            int r0 = r1.size()     // Catch:{ MlKitException -> 0x00cd }
            r3 = r0
        L_0x010f:
            r1 = r20
            r4 = r18
            r7 = r21
            r1.mo52376f(r2, r3, r4, r6, r7)     // Catch:{ MlKitException -> 0x00cd }
            java.util.concurrent.atomic.AtomicBoolean r0 = f51077i     // Catch:{ MlKitException -> 0x00cd }
            r1 = 0
            r0.set(r1)     // Catch:{ MlKitException -> 0x00cd }
            monitor-exit(r20)
            return r9
        L_0x0120:
            r0 = move-exception
            r18 = r10
        L_0x0123:
            int r1 = r0.mo43875a()     // Catch:{ all -> 0x013d }
            r2 = 14
            if (r1 != r2) goto L_0x012e
            com.google.android.gms.internal.mlkit_vision_face.zzin r1 = com.google.android.gms.internal.mlkit_vision_face.zzin.MODEL_NOT_DOWNLOADED     // Catch:{ all -> 0x013d }
            goto L_0x0130
        L_0x012e:
            com.google.android.gms.internal.mlkit_vision_face.zzin r1 = com.google.android.gms.internal.mlkit_vision_face.zzin.UNKNOWN_ERROR     // Catch:{ all -> 0x013d }
        L_0x0130:
            r6 = r1
            r2 = 0
            r3 = 0
            r1 = r20
            r4 = r18
            r7 = r21
            r1.mo52376f(r2, r3, r4, r6, r7)     // Catch:{ all -> 0x013d }
            throw r0     // Catch:{ all -> 0x013d }
        L_0x013d:
            r0 = move-exception
            monitor-exit(r20)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p863vg.C20129f.mo50621d(sg.a):java.util.List");
    }

    /* renamed from: f */
    public final synchronized void mo52376f(int i, int i2, long j, zzin zzin, C19459a aVar) {
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - j;
            this.f51080e.zza(new C20128e(this, elapsedRealtime, zzin, i, i2, aVar), zzio.ON_DEVICE_FACE_DETECT);
            zzdl zzdl = new zzdl();
            zzdl.zza(zzin);
            zzdl.zzb(Boolean.valueOf(f51077i.get()));
            f51078j.getClass();
            zzdl.zzc(zzla.zza(aVar.f49484f, C19674d.m47162b(aVar)));
            zzdl.zze(Integer.valueOf(i));
            zzdl.zzf(Integer.valueOf(i2));
            zzdl.zzd(C20130g.m47724a(this.f51079d));
            zzdm zzg = zzdl.zzg();
            C0262r rVar = new C0262r(this, 8);
            this.f51080e.zzb(zzg, elapsedRealtime, zzio.AGGREGATED_ON_DEVICE_FACE_DETECTION, rVar);
        }
    }
}
