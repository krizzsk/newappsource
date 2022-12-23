package p173ma;

import com.google.android.exoplayer2.Format;
import java.io.EOFException;
import java.io.IOException;
import p173ma.C5754v;
import p265tb.C6652e;
import p277ub.C6803r;

/* renamed from: ma.g */
public final class C5734g implements C5754v {

    /* renamed from: a */
    public final byte[] f18597a = new byte[4096];

    /* renamed from: a */
    public final int mo20630a(C6652e eVar, int i, boolean z) {
        return mo21591f(eVar, i, z);
    }

    /* renamed from: b */
    public final void mo20631b(int i, C6803r rVar) {
        rVar.mo22981A(i);
    }

    /* renamed from: c */
    public final void mo20632c(Format format) {
    }

    /* renamed from: d */
    public final void mo20633d(long j, int i, int i2, int i3, C5754v.C5755a aVar) {
    }

    /* renamed from: e */
    public final void mo20634e(C6803r rVar, int i) {
        rVar.mo22981A(i);
    }

    /* renamed from: f */
    public final int mo21591f(C6652e eVar, int i, boolean z) throws IOException {
        int read = eVar.read(this.f18597a, 0, Math.min(this.f18597a.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }
}
