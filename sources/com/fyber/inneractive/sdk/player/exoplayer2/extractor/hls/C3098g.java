package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.Handler;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.C3221h;
import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C3101j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3106a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3113e;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3283f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3286h;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3297m;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3301o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3302p;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3304r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3305s;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3321e;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3328b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g */
public final class C3098g implements C3297m, C3101j.C3103b, C3113e.C3115b {

    /* renamed from: a */
    public final C3113e f10665a;

    /* renamed from: b */
    public final C3095d f10666b;

    /* renamed from: c */
    public final int f10667c;

    /* renamed from: d */
    public final C3283f.C3284a f10668d;

    /* renamed from: e */
    public final C3328b f10669e;

    /* renamed from: f */
    public final IdentityHashMap<C3301o, Integer> f10670f = new IdentityHashMap<>();

    /* renamed from: g */
    public final C3104k f10671g = new C3104k();

    /* renamed from: h */
    public final Handler f10672h = new Handler();

    /* renamed from: i */
    public final long f10673i;

    /* renamed from: j */
    public C3297m.C3298a f10674j;

    /* renamed from: k */
    public int f10675k;

    /* renamed from: l */
    public boolean f10676l;

    /* renamed from: m */
    public C3305s f10677m;

    /* renamed from: n */
    public C3101j[] f10678n;

    /* renamed from: o */
    public C3101j[] f10679o;

    /* renamed from: p */
    public C3286h f10680p;

    public C3098g(C3113e eVar, C3095d dVar, int i, C3283f.C3284a aVar, C3328b bVar, long j) {
        this.f10665a = eVar;
        this.f10666b = dVar;
        this.f10667c = i;
        this.f10668d = aVar;
        this.f10669e = bVar;
        this.f10673i = j;
    }

    /* renamed from: a */
    public void mo14142a(C3297m.C3298a aVar) {
        this.f10665a.f10786h.add(this);
        this.f10674j = aVar;
        C3106a aVar2 = this.f10665a.f10789k;
        ArrayList arrayList = new ArrayList(aVar2.f10723b);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            C3106a.C3107a aVar3 = (C3106a.C3107a) arrayList.get(i);
            if (aVar3.f10729b.f11638k > 0 || m7766a(aVar3, "avc")) {
                arrayList2.add(aVar3);
            } else if (m7766a(aVar3, "mp4a")) {
                arrayList3.add(aVar3);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        } else if (arrayList3.size() < arrayList.size()) {
            arrayList.removeAll(arrayList3);
        }
        List<C3106a.C3107a> list = aVar2.f10724c;
        List<C3106a.C3107a> list2 = aVar2.f10725d;
        int size = list2.size() + list.size() + 1;
        this.f10678n = new C3101j[size];
        this.f10675k = size;
        C3380a.m8505a(!arrayList.isEmpty());
        C3106a.C3107a[] aVarArr = new C3106a.C3107a[arrayList.size()];
        arrayList.toArray(aVarArr);
        C3101j a = mo14140a(0, aVarArr, aVar2.f10726e, aVar2.f10727f);
        this.f10678n[0] = a;
        a.f10690c.f10626h = true;
        a.mo14169g();
        int i2 = 0;
        int i3 = 1;
        while (i2 < list.size()) {
            C3101j a2 = mo14140a(1, new C3106a.C3107a[]{list.get(i2)}, (C3226i) null, Collections.emptyList());
            this.f10678n[i3] = a2;
            a2.mo14169g();
            i2++;
            i3++;
        }
        int i4 = 0;
        while (i4 < list2.size()) {
            C3106a.C3107a aVar4 = list2.get(i4);
            C3101j a3 = mo14140a(3, new C3106a.C3107a[]{aVar4}, (C3226i) null, Collections.emptyList());
            a3.mo14163a(0).mo14098a(aVar4.f10729b);
            a3.f10701n = true;
            a3.mo14171i();
            this.f10678n[i3] = a3;
            i4++;
            i3++;
        }
    }

    /* renamed from: b */
    public C3305s mo14146b() {
        return this.f10677m;
    }

    /* renamed from: c */
    public void mo14147c() {
        mo14152g();
    }

    /* renamed from: c */
    public void mo14148c(long j) {
    }

    /* renamed from: d */
    public long mo14149d() {
        long j;
        long j2 = Long.MAX_VALUE;
        for (C3101j jVar : this.f10679o) {
            if (jVar.f10712y) {
                j = Long.MIN_VALUE;
            } else if (jVar.mo14170h()) {
                j = jVar.f10711x;
            } else {
                long j3 = jVar.f10710w;
                C3097f last = jVar.f10698k.getLast();
                if (!last.f10647F) {
                    if (jVar.f10698k.size() > 1) {
                        LinkedList<C3097f> linkedList = jVar.f10698k;
                        last = linkedList.get(linkedList.size() - 2);
                    } else {
                        last = null;
                    }
                }
                if (last != null) {
                    j3 = Math.max(j3, last.f11784g);
                }
                int size = jVar.f10697j.size();
                for (int i = 0; i < size; i++) {
                    j3 = Math.max(j3, jVar.f10697j.valueAt(i).mo14104d());
                }
                j = j3;
            }
            if (j != Long.MIN_VALUE) {
                j2 = Math.min(j2, j);
            }
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j2;
    }

    /* renamed from: e */
    public void mo14150e() throws IOException {
        C3101j[] jVarArr = this.f10678n;
        if (jVarArr != null) {
            for (C3101j j : jVarArr) {
                j.mo14172j();
            }
        }
    }

    /* renamed from: f */
    public long mo14151f() {
        return -9223372036854775807L;
    }

    /* renamed from: g */
    public final void mo14152g() {
        if (this.f10677m != null) {
            ((C3221h) this.f10674j).mo14294a((C3302p) this);
            return;
        }
        for (C3101j g : this.f10678n) {
            g.mo14169g();
        }
    }

    /* renamed from: b */
    public long mo14145b(long j) {
        this.f10671g.f10714a.clear();
        for (C3101j d : this.f10679o) {
            d.mo14168d(j);
        }
        return j;
    }

    /* renamed from: a */
    public long mo14139a(C3321e[] eVarArr, boolean[] zArr, C3301o[] oVarArr, boolean[] zArr2, long j) {
        long j2;
        int i;
        C3321e[] eVarArr2 = eVarArr;
        C3301o[] oVarArr2 = oVarArr;
        long j3 = j;
        int[] iArr = new int[eVarArr2.length];
        int[] iArr2 = new int[eVarArr2.length];
        for (int i2 = 0; i2 < eVarArr2.length; i2++) {
            C3301o oVar = oVarArr2[i2];
            if (oVar == null) {
                i = -1;
            } else {
                i = this.f10670f.get(oVar).intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            C3321e eVar = eVarArr2[i2];
            if (eVar != null) {
                C3304r b = eVar.mo14442b();
                int i3 = 0;
                while (true) {
                    C3101j[] jVarArr = this.f10678n;
                    if (i3 >= jVarArr.length) {
                        break;
                    } else if (jVarArr[i3].f10707t.mo14434a(b) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        this.f10670f.clear();
        int length = eVarArr2.length;
        C3301o[] oVarArr3 = new C3301o[length];
        C3301o[] oVarArr4 = new C3301o[eVarArr2.length];
        C3321e[] eVarArr3 = new C3321e[eVarArr2.length];
        ArrayList arrayList = new ArrayList(this.f10678n.length);
        int i4 = 0;
        boolean z = false;
        while (i4 < this.f10678n.length) {
            for (int i5 = 0; i5 < eVarArr2.length; i5++) {
                C3321e eVar2 = null;
                oVarArr4[i5] = iArr[i5] == i4 ? oVarArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    eVar2 = eVarArr2[i5];
                }
                eVarArr3[i5] = eVar2;
            }
            int i6 = i4;
            ArrayList arrayList2 = arrayList;
            C3321e[] eVarArr4 = eVarArr3;
            z |= this.f10678n[i4].mo14167a(eVarArr3, zArr, oVarArr4, zArr2, !this.f10676l);
            boolean z2 = false;
            for (int i7 = 0; i7 < eVarArr2.length; i7++) {
                if (iArr2[i7] == i6) {
                    C3380a.m8507b(oVarArr4[i7] != null);
                    oVarArr3[i7] = oVarArr4[i7];
                    this.f10670f.put(oVarArr4[i7], Integer.valueOf(i6));
                    z2 = true;
                } else if (iArr[i7] == i6) {
                    C3380a.m8507b(oVarArr4[i7] == null);
                }
            }
            if (z2) {
                arrayList2.add(this.f10678n[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            eVarArr3 = eVarArr4;
            long j4 = j;
        }
        ArrayList arrayList3 = arrayList;
        System.arraycopy(oVarArr3, 0, oVarArr2, 0, length);
        C3101j[] jVarArr2 = new C3101j[arrayList3.size()];
        this.f10679o = jVarArr2;
        arrayList3.toArray(jVarArr2);
        C3101j[] jVarArr3 = this.f10679o;
        if (jVarArr3.length > 0) {
            jVarArr3[0].f10690c.f10626h = true;
            int i8 = 1;
            while (true) {
                C3101j[] jVarArr4 = this.f10679o;
                if (i8 >= jVarArr4.length) {
                    break;
                }
                jVarArr4[i8].f10690c.f10626h = false;
                i8++;
            }
        }
        this.f10680p = new C3286h(this.f10679o);
        if (!this.f10676l || !z) {
            j2 = j;
        } else {
            j2 = j;
            mo14145b(j2);
            for (int i9 = 0; i9 < eVarArr2.length; i9++) {
                if (oVarArr2[i9] != null) {
                    zArr2[i9] = true;
                }
            }
        }
        this.f10676l = true;
        return j2;
    }

    /* renamed from: a */
    public boolean mo14144a(long j) {
        return this.f10680p.mo14144a(j);
    }

    /* renamed from: a */
    public long mo14138a() {
        return this.f10680p.mo14138a();
    }

    /* renamed from: a */
    public void mo14143a(C3302p pVar) {
        if (this.f10677m != null) {
            ((C3221h) this.f10674j).mo14294a((C3302p) this);
        }
    }

    /* renamed from: a */
    public void mo14141a(C3106a.C3107a aVar, long j) {
        int c;
        for (C3101j jVar : this.f10678n) {
            C3091c cVar = jVar.f10690c;
            int a = cVar.f10624f.mo14430a(aVar.f10729b);
            if (!(a == -1 || (c = cVar.f10634p.mo14444c(a)) == -1)) {
                cVar.f10634p.mo14440a(c, j);
            }
        }
        mo14152g();
    }

    /* renamed from: a */
    public final C3101j mo14140a(int i, C3106a.C3107a[] aVarArr, C3226i iVar, List<C3226i> list) {
        C3091c cVar = new C3091c(this.f10665a, aVarArr, this.f10666b, this.f10671g, list);
        C3328b bVar = this.f10669e;
        long j = this.f10673i;
        return new C3101j(i, this, cVar, bVar, j, iVar, this.f10667c, this.f10668d);
    }

    /* renamed from: a */
    public static boolean m7766a(C3106a.C3107a aVar, String str) {
        String str2 = aVar.f10729b.f11630c;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String startsWith : str2.split("(\\s*,\\s*)|(\\s*$)")) {
            if (startsWith.startsWith(str)) {
                return true;
            }
        }
        return false;
    }
}
