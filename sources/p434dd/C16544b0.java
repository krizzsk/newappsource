package p434dd;

import com.google.android.play.core.assetpacks.C14255d0;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: dd.b0 */
public final class C16544b0 extends C16542a0 {

    /* renamed from: b */
    public final C16542a0 f43177b;

    /* renamed from: c */
    public final long f43178c;

    /* renamed from: d */
    public final long f43179d;

    public C16544b0(C14255d0 d0Var, long j, long j2) {
        this.f43177b = d0Var;
        long g = mo49323g(j);
        this.f43178c = g;
        this.f43179d = mo49323g(g + j2);
    }

    public final void close() throws IOException {
    }

    /* renamed from: e */
    public final long mo42808e() {
        return this.f43179d - this.f43178c;
    }

    /* renamed from: f */
    public final InputStream mo42809f(long j, long j2) throws IOException {
        long g = mo49323g(this.f43178c);
        return this.f43177b.mo42809f(g, mo49323g(j2 + g) - g);
    }

    /* renamed from: g */
    public final long mo49323g(long j) {
        if (j < 0) {
            return 0;
        }
        if (j > this.f43177b.mo42808e()) {
            return this.f43177b.mo42808e();
        }
        return j;
    }
}
