package androidx.emoji2.text;

import androidx.emoji2.text.C0836f;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: androidx.emoji2.text.h */
public final class C0847h extends C0836f.C0844h {

    /* renamed from: a */
    public final /* synthetic */ C0836f.C0844h f3512a;

    /* renamed from: b */
    public final /* synthetic */ ThreadPoolExecutor f3513b;

    public C0847h(C0836f.C0844h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f3512a = hVar;
        this.f3513b = threadPoolExecutor;
    }

    /* renamed from: a */
    public final void mo3617a(Throwable th) {
        try {
            this.f3512a.mo3617a(th);
        } finally {
            this.f3513b.shutdown();
        }
    }

    /* renamed from: b */
    public final void mo3618b(C0857n nVar) {
        try {
            this.f3512a.mo3618b(nVar);
        } finally {
            this.f3513b.shutdown();
        }
    }
}
