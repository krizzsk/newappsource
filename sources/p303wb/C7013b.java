package p303wb;

import com.google.android.exoplayer2.C3873a;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import p277ub.C6774a0;
import p277ub.C6803r;
import p431cy.C16525b;

/* renamed from: wb.b */
public final class C7013b extends C3873a {

    /* renamed from: m */
    public final DecoderInputBuffer f21819m = new DecoderInputBuffer(1);

    /* renamed from: n */
    public final C6803r f21820n = new C6803r();

    /* renamed from: o */
    public long f21821o;

    /* renamed from: p */
    public C7012a f21822p;

    /* renamed from: q */
    public long f21823q;

    public C7013b() {
        super(6);
    }

    /* renamed from: D */
    public final void mo15811D(Format[] formatArr, long j, long j2) {
        this.f21821o = j2;
    }

    /* renamed from: c */
    public final int mo16040c(Format format) {
        return "application/x-camera-motion".equals(format.f13418m) ? 4 : 0;
    }

    /* renamed from: d */
    public final boolean mo15932d() {
        return mo15817h();
    }

    public final String getName() {
        return "CameraMotionRenderer";
    }

    public final boolean isReady() {
        return true;
    }

    /* renamed from: j */
    public final void mo15819j(int i, Object obj) throws ExoPlaybackException {
        if (i == 7) {
            this.f21822p = (C7012a) obj;
        }
    }

    /* renamed from: q */
    public final void mo16049q(long j, long j2) {
        while (!mo15817h() && this.f21823q < 100000 + j) {
            this.f21819m.mo15948h();
            C16525b bVar = this.f13463c;
            float[] fArr = null;
            bVar.f43143a = null;
            bVar.f43144b = null;
            if (mo15812E(bVar, this.f21819m, 0) == -4 && !this.f21819m.mo21174d(4)) {
                DecoderInputBuffer decoderInputBuffer = this.f21819m;
                this.f21823q = decoderInputBuffer.f13649f;
                if (this.f21822p != null && !decoderInputBuffer.mo21175g()) {
                    this.f21819m.mo15951k();
                    ByteBuffer byteBuffer = this.f21819m.f13647d;
                    int i = C6774a0.f20959a;
                    if (byteBuffer.remaining() == 16) {
                        this.f21820n.mo23005x(byteBuffer.limit(), byteBuffer.array());
                        this.f21820n.mo23007z(byteBuffer.arrayOffset() + 4);
                        fArr = new float[3];
                        for (int i2 = 0; i2 < 3; i2++) {
                            fArr[i2] = Float.intBitsToFloat(this.f21820n.mo22986e());
                        }
                    }
                    if (fArr != null) {
                        this.f21822p.mo20429b(this.f21823q - this.f21821o, fArr);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: x */
    public final void mo15835x() {
        C7012a aVar = this.f21822p;
        if (aVar != null) {
            aVar.mo20430c();
        }
    }

    /* renamed from: z */
    public final void mo15837z(long j, boolean z) {
        this.f21823q = Long.MIN_VALUE;
        C7012a aVar = this.f21822p;
        if (aVar != null) {
            aVar.mo20430c();
        }
    }
}
