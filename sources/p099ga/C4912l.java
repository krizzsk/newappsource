package p099ga;

import android.content.Context;

/* renamed from: ga.l */
public final class C4912l implements C4857a1 {

    /* renamed from: a */
    public final Context f16607a;

    public C4912l(Context context) {
        this.f16607a = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p099ga.C4949x0[] mo20552a(android.os.Handler r9, p099ga.C4865c1.C4867b r10, p099ga.C4865c1.C4867b r11, p099ga.C4865c1.C4867b r12, p099ga.C4865c1.C4867b r13) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.Context r1 = r8.f16607a
            vb.d r2 = new vb.d
            r2.<init>(r1, r9, r10)
            r10 = 0
            r2.f13782M0 = r10
            r2.f13784N0 = r10
            r2.f13786O0 = r10
            r0.add(r2)
            android.content.Context r1 = r8.f16607a
            com.google.android.exoplayer2.audio.e r2 = new com.google.android.exoplayer2.audio.e
            ia.e r3 = p125ia.C5317e.f17517c
            android.content.IntentFilter r3 = new android.content.IntentFilter
            java.lang.String r4 = "android.media.action.HDMI_AUDIO_PLUG"
            r3.<init>(r4)
            r4 = 0
            android.content.Intent r3 = r1.registerReceiver(r4, r3)
            int r4 = p277ub.C6774a0.f20959a
            r5 = 1
            r6 = 17
            if (r4 < r6) goto L_0x0043
            java.lang.String r6 = p277ub.C6774a0.f20961c
            java.lang.String r7 = "Amazon"
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L_0x0041
            java.lang.String r7 = "Xiaomi"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0043
        L_0x0041:
            r6 = 1
            goto L_0x0044
        L_0x0043:
            r6 = 0
        L_0x0044:
            if (r6 == 0) goto L_0x0055
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r6 = "external_surround_sound_enabled"
            int r1 = android.provider.Settings.Global.getInt(r1, r6, r10)
            if (r1 != r5) goto L_0x0055
            ia.e r1 = p125ia.C5317e.f17518d
            goto L_0x0084
        L_0x0055:
            r1 = 29
            r5 = 8
            if (r4 < r1) goto L_0x0065
            ia.e r1 = new ia.e
            int[] r3 = p125ia.C5317e.C5318a.m13357a()
            r1.<init>(r3, r5)
            goto L_0x0084
        L_0x0065:
            if (r3 == 0) goto L_0x0082
            java.lang.String r1 = "android.media.extra.AUDIO_PLUG_STATE"
            int r1 = r3.getIntExtra(r1, r10)
            if (r1 != 0) goto L_0x0070
            goto L_0x0082
        L_0x0070:
            ia.e r1 = new ia.e
            java.lang.String r4 = "android.media.extra.ENCODINGS"
            int[] r4 = r3.getIntArrayExtra(r4)
            java.lang.String r6 = "android.media.extra.MAX_CHANNEL_COUNT"
            int r3 = r3.getIntExtra(r6, r5)
            r1.<init>(r4, r3)
            goto L_0x0084
        L_0x0082:
            ia.e r1 = p125ia.C5317e.f17517c
        L_0x0084:
            com.google.android.exoplayer2.audio.e$d r3 = new com.google.android.exoplayer2.audio.e$d
            com.google.android.exoplayer2.audio.AudioProcessor[] r4 = new com.google.android.exoplayer2.audio.AudioProcessor[r10]
            r3.<init>(r4)
            r2.<init>(r1, r3)
            android.content.Context r1 = r8.f16607a
            com.google.android.exoplayer2.audio.g r3 = new com.google.android.exoplayer2.audio.g
            r3.<init>(r1, r9, r11, r2)
            r3.f13782M0 = r10
            r3.f13784N0 = r10
            r3.f13786O0 = r10
            r0.add(r3)
            android.os.Looper r11 = r9.getLooper()
            ib.j r1 = new ib.j
            r1.<init>(r12, r11)
            r0.add(r1)
            android.os.Looper r9 = r9.getLooper()
            com.google.android.exoplayer2.metadata.a r11 = new com.google.android.exoplayer2.metadata.a
            r11.<init>(r13, r9)
            r0.add(r11)
            wb.b r9 = new wb.b
            r9.<init>()
            r0.add(r9)
            ga.x0[] r9 = new p099ga.C4949x0[r10]
            java.lang.Object[] r9 = r0.toArray(r9)
            ga.x0[] r9 = (p099ga.C4949x0[]) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p099ga.C4912l.mo20552a(android.os.Handler, ga.c1$b, ga.c1$b, ga.c1$b, ga.c1$b):ga.x0[]");
    }
}
