package ji0;

import java.io.IOException;
import si0.C24898f;
import si0.C24904k;
import si0.C24915u;

/* renamed from: ji0.g */
public class C23748g extends C24904k {

    /* renamed from: c */
    public boolean f60009c;

    public C23748g(C24915u uVar) {
        super(uVar);
    }

    /* renamed from: P */
    public final void mo58998P(C24898f fVar, long j) throws IOException {
        if (this.f60009c) {
            fVar.skip(j);
            return;
        }
        try {
            super.mo58998P(fVar, j);
        } catch (IOException unused) {
            this.f60009c = true;
            mo58995e();
        }
    }

    public final void close() throws IOException {
        if (!this.f60009c) {
            try {
                super.close();
            } catch (IOException unused) {
                this.f60009c = true;
                mo58995e();
            }
        }
    }

    /* renamed from: e */
    public void mo58995e() {
        throw null;
    }

    public final void flush() throws IOException {
        if (!this.f60009c) {
            try {
                super.flush();
            } catch (IOException unused) {
                this.f60009c = true;
                mo58995e();
            }
        }
    }
}
