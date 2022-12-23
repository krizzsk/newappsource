package p225qa;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import java.io.IOException;
import p173ma.C5732e;
import p173ma.C5735h;
import p173ma.C5736i;
import p173ma.C5737j;
import p173ma.C5750t;
import p173ma.C5754v;
import p264ta.C6634h;
import p277ub.C6803r;

/* renamed from: qa.a */
public final class C6218a implements C5735h {

    /* renamed from: a */
    public final C6803r f19633a = new C6803r(6);

    /* renamed from: b */
    public C5737j f19634b;

    /* renamed from: c */
    public int f19635c;

    /* renamed from: d */
    public int f19636d;

    /* renamed from: e */
    public int f19637e;

    /* renamed from: f */
    public long f19638f = -1;

    /* renamed from: g */
    public MotionPhotoMetadata f19639g;

    /* renamed from: h */
    public C5736i f19640h;

    /* renamed from: i */
    public C6221c f19641i;

    /* renamed from: j */
    public C6634h f19642j;

    /* renamed from: a */
    public final void mo21592a(long j, long j2) {
        if (j == 0) {
            this.f19635c = 0;
            this.f19642j = null;
        } else if (this.f19635c == 5) {
            C6634h hVar = this.f19642j;
            hVar.getClass();
            hVar.mo21592a(j, j2);
        }
    }

    /* renamed from: b */
    public final boolean mo21593b(C5736i iVar) throws IOException {
        C5732e eVar = (C5732e) iVar;
        if (mo22219e(eVar) != 65496) {
            return false;
        }
        int e = mo22219e(eVar);
        this.f19636d = e;
        if (e == 65504) {
            this.f19633a.mo23004w(2);
            eVar.mo21583j(0, 2, this.f19633a.f21038a, false);
            eVar.mo21584k(this.f19633a.mo23002u() - 2, false);
            this.f19636d = mo22219e(eVar);
        }
        if (this.f19636d != 65505) {
            return false;
        }
        eVar.mo21584k(2, false);
        this.f19633a.mo23004w(6);
        eVar.mo21583j(0, 6, this.f19633a.f21038a, false);
        if (this.f19633a.mo22998q() == 1165519206 && this.f19633a.mo23002u() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo22217c() {
        mo22218d(new Metadata.Entry[0]);
        C5737j jVar = this.f19634b;
        jVar.getClass();
        jVar.mo20708n();
        this.f19634b.mo20707k(new C5750t.C5752b(-9223372036854775807L));
        this.f19635c = 6;
    }

    /* renamed from: d */
    public final void mo22218d(Metadata.Entry... entryArr) {
        C5737j jVar = this.f19634b;
        jVar.getClass();
        C5754v p = jVar.mo20709p(1024, 4);
        Format.C3872b bVar = new Format.C3872b();
        bVar.f13444i = new Metadata(entryArr);
        p.mo20632c(new Format(bVar));
    }

    /* renamed from: e */
    public final int mo22219e(C5732e eVar) throws IOException {
        this.f19633a.mo23004w(2);
        eVar.mo21583j(0, 2, this.f19633a.f21038a, false);
        return this.f19633a.mo23002u();
    }

    /* renamed from: g */
    public final void mo21594g(C5737j jVar) {
        this.f19634b = jVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:99:0x017e  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo21595h(p173ma.C5736i r25, p173ma.C5749s r26) throws java.io.IOException {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            int r3 = r0.f19635c
            r4 = 1
            r5 = 0
            r6 = -1
            r8 = 4
            r9 = 2
            if (r3 == 0) goto L_0x01a7
            if (r3 == r4) goto L_0x018d
            r10 = -1
            if (r3 == r9) goto L_0x00aa
            r6 = 5
            if (r3 == r8) goto L_0x004e
            if (r3 == r6) goto L_0x0024
            r1 = 6
            if (r3 != r1) goto L_0x001e
            return r10
        L_0x001e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0024:
            qa.c r3 = r0.f19641i
            if (r3 == 0) goto L_0x002c
            ma.i r3 = r0.f19640h
            if (r1 == r3) goto L_0x0039
        L_0x002c:
            r0.f19640h = r1
            qa.c r3 = new qa.c
            long r5 = r0.f19638f
            ma.e r1 = (p173ma.C5732e) r1
            r3.<init>(r1, r5)
            r0.f19641i = r3
        L_0x0039:
            ta.h r1 = r0.f19642j
            r1.getClass()
            qa.c r3 = r0.f19641i
            int r1 = r1.mo21595h(r3, r2)
            if (r1 != r4) goto L_0x004d
            long r3 = r2.f18624a
            long r5 = r0.f19638f
            long r3 = r3 + r5
            r2.f18624a = r3
        L_0x004d:
            return r1
        L_0x004e:
            ma.e r1 = (p173ma.C5732e) r1
            long r7 = r1.f18591d
            long r9 = r0.f19638f
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x005b
            r2.f18624a = r9
            return r4
        L_0x005b:
            ub.r r2 = r0.f19633a
            byte[] r2 = r2.f21038a
            boolean r2 = r1.mo21583j(r5, r4, r2, r4)
            if (r2 != 0) goto L_0x0069
            r24.mo22217c()
            goto L_0x00a9
        L_0x0069:
            r1.f18593f = r5
            ta.h r2 = r0.f19642j
            if (r2 != 0) goto L_0x0076
            ta.h r2 = new ta.h
            r2.<init>()
            r0.f19642j = r2
        L_0x0076:
            qa.c r2 = new qa.c
            long r7 = r0.f19638f
            r2.<init>(r1, r7)
            r0.f19641i = r2
            ta.h r1 = r0.f19642j
            boolean r1 = r1.mo21593b(r2)
            if (r1 == 0) goto L_0x00a6
            ta.h r1 = r0.f19642j
            qa.d r2 = new qa.d
            long r7 = r0.f19638f
            ma.j r3 = r0.f19634b
            r3.getClass()
            r2.<init>(r7, r3)
            r1.f20581r = r2
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r1 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r4]
            com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata r2 = r0.f19639g
            r2.getClass()
            r1[r5] = r2
            r0.mo22218d(r1)
            r0.f19635c = r6
            goto L_0x00a9
        L_0x00a6:
            r24.mo22217c()
        L_0x00a9:
            return r5
        L_0x00aa:
            int r2 = r0.f19636d
            r3 = 65505(0xffe1, float:9.1792E-41)
            if (r2 != r3) goto L_0x0183
            int r2 = r0.f19637e
            byte[] r3 = new byte[r2]
            ma.e r1 = (p173ma.C5732e) r1
            r1.mo21581h(r5, r2, r3, r5)
            com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata r4 = r0.f19639g
            if (r4 != 0) goto L_0x018a
            int r4 = r2 + 0
            if (r4 != 0) goto L_0x00c5
            r4 = 0
            r11 = 0
            goto L_0x00d9
        L_0x00c5:
            r4 = 0
        L_0x00c6:
            if (r4 >= r2) goto L_0x00cf
            byte r11 = r3[r4]
            if (r11 == 0) goto L_0x00cf
            int r4 = r4 + 1
            goto L_0x00c6
        L_0x00cf:
            int r11 = r4 + 0
            java.lang.String r11 = p277ub.C6774a0.m15951k(r5, r11, r3)
            if (r4 >= r2) goto L_0x00d9
            int r4 = r4 + 1
        L_0x00d9:
            java.lang.String r12 = "http://ns.adobe.com/xap/1.0/"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x018a
            int r11 = r2 - r4
            if (r11 != 0) goto L_0x00e7
            r2 = 0
            goto L_0x00f6
        L_0x00e7:
            r11 = r4
        L_0x00e8:
            if (r11 >= r2) goto L_0x00f1
            byte r12 = r3[r11]
            if (r12 == 0) goto L_0x00f1
            int r11 = r11 + 1
            goto L_0x00e8
        L_0x00f1:
            int r11 = r11 - r4
            java.lang.String r2 = p277ub.C6774a0.m15951k(r4, r11, r3)
        L_0x00f6:
            if (r2 == 0) goto L_0x018a
            long r3 = r1.f18590c
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0100
            goto L_0x0179
        L_0x0100:
            qa.b r1 = p225qa.C6224e.m14804a(r2)     // Catch:{ ParserException | NumberFormatException | XmlPullParserException -> 0x0105 }
            goto L_0x0107
        L_0x0105:
            r1 = 0
        L_0x0107:
            if (r1 != 0) goto L_0x010b
            goto L_0x0179
        L_0x010b:
            java.util.List<qa.b$a> r2 = r1.f19644b
            int r2 = r2.size()
            if (r2 >= r9) goto L_0x0115
            goto L_0x0179
        L_0x0115:
            java.util.List<qa.b$a> r2 = r1.f19644b
            int r2 = r2.size()
            int r2 = r2 + r10
            r10 = r6
            r12 = r10
            r16 = r12
            r18 = r16
            r9 = 0
        L_0x0123:
            if (r2 < 0) goto L_0x015f
            java.util.List<qa.b$a> r14 = r1.f19644b
            java.lang.Object r14 = r14.get(r2)
            qa.b$a r14 = (p225qa.C6219b.C6220a) r14
            java.lang.String r15 = r14.f19645a
            java.lang.String r8 = "video/mp4"
            boolean r8 = r8.equals(r15)
            r8 = r8 | r9
            if (r2 != 0) goto L_0x0142
            r20 = 0
            long r14 = r14.f19647c
            long r3 = r3 - r14
            r14 = r3
            r3 = r20
            goto L_0x014b
        L_0x0142:
            long r14 = r14.f19646b
            long r14 = r3 - r14
            r22 = r3
            r3 = r14
            r14 = r22
        L_0x014b:
            if (r8 == 0) goto L_0x0157
            int r9 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x0157
            long r18 = r14 - r3
            r16 = r3
            r9 = 0
            goto L_0x0158
        L_0x0157:
            r9 = r8
        L_0x0158:
            if (r2 != 0) goto L_0x015c
            r10 = r3
            r12 = r14
        L_0x015c:
            int r2 = r2 + -1
            goto L_0x0123
        L_0x015f:
            int r2 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0179
            int r2 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0179
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0179
            int r2 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0170
            goto L_0x0179
        L_0x0170:
            com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata r8 = new com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata
            long r14 = r1.f19643a
            r9 = r8
            r9.<init>(r10, r12, r14, r16, r18)
            goto L_0x017a
        L_0x0179:
            r8 = 0
        L_0x017a:
            r0.f19639g = r8
            if (r8 == 0) goto L_0x018a
            long r1 = r8.f13949e
            r0.f19638f = r1
            goto L_0x018a
        L_0x0183:
            int r2 = r0.f19637e
            ma.e r1 = (p173ma.C5732e) r1
            r1.mo21582i(r2)
        L_0x018a:
            r0.f19635c = r5
            return r5
        L_0x018d:
            ub.r r2 = r0.f19633a
            r2.mo23004w(r9)
            ub.r r2 = r0.f19633a
            byte[] r2 = r2.f21038a
            ma.e r1 = (p173ma.C5732e) r1
            r1.mo21581h(r5, r9, r2, r5)
            ub.r r1 = r0.f19633a
            int r1 = r1.mo23002u()
            int r1 = r1 - r9
            r0.f19637e = r1
            r0.f19635c = r9
            return r5
        L_0x01a7:
            ub.r r2 = r0.f19633a
            r2.mo23004w(r9)
            ub.r r2 = r0.f19633a
            byte[] r2 = r2.f21038a
            ma.e r1 = (p173ma.C5732e) r1
            r1.mo21581h(r5, r9, r2, r5)
            ub.r r1 = r0.f19633a
            int r1 = r1.mo23002u()
            r0.f19636d = r1
            r2 = 65498(0xffda, float:9.1782E-41)
            if (r1 != r2) goto L_0x01cf
            long r1 = r0.f19638f
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x01cb
            r0.f19635c = r8
            goto L_0x01e0
        L_0x01cb:
            r24.mo22217c()
            goto L_0x01e0
        L_0x01cf:
            r2 = 65488(0xffd0, float:9.1768E-41)
            if (r1 < r2) goto L_0x01d9
            r2 = 65497(0xffd9, float:9.1781E-41)
            if (r1 <= r2) goto L_0x01e0
        L_0x01d9:
            r2 = 65281(0xff01, float:9.1478E-41)
            if (r1 == r2) goto L_0x01e0
            r0.f19635c = r4
        L_0x01e0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p225qa.C6218a.mo21595h(ma.i, ma.s):int");
    }

    public final void release() {
        C6634h hVar = this.f19642j;
        if (hVar != null) {
            hVar.getClass();
        }
    }
}
