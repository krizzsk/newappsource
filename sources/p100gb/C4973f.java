package p100gb;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.dash.DashMediaSource$Factory;
import com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory;
import p100gb.C5007y;
import p173ma.C5733f;
import p265tb.C6654g;
import p265tb.C6663n;

/* renamed from: gb.f */
public final class C4973f implements C4998v {

    /* renamed from: a */
    public final SparseArray<C4998v> f16817a;

    /* renamed from: b */
    public final int[] f16818b;

    public C4973f(Context context, C5733f fVar) {
        C6663n nVar = new C6663n(context, (String) null);
        Class<C6654g.C6655a> cls = C6654g.C6655a.class;
        Class<C4998v> cls2 = C4998v.class;
        SparseArray<C4998v> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (C4998v) DashMediaSource$Factory.class.asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{nVar}));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (C4998v) SsMediaSource$Factory.class.asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{nVar}));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (C4998v) HlsMediaSource$Factory.class.asSubclass(cls2).getConstructor(new Class[]{cls}).newInstance(new Object[]{nVar}));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (C4998v) RtspMediaSource$Factory.class.asSubclass(cls2).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new C5007y.C5009b(nVar, fVar));
        this.f16817a = sparseArray;
        this.f16818b = new int[sparseArray.size()];
        for (int i = 0; i < this.f16817a.size(); i++) {
            this.f16818b[i] = this.f16817a.keyAt(i);
        }
    }
}
