package p434dd;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import p037c5.C1790k;
import p506gd.C17170a;
import p506gd.C17174e;
import p530hd.C17381f;

/* renamed from: dd.m */
public final class C16565m implements C17381f {

    /* renamed from: a */
    public final Context f43222a;

    /* renamed from: b */
    public final C17174e f43223b;

    /* renamed from: c */
    public final C16569o f43224c;

    /* renamed from: d */
    public final Executor f43225d;

    public C16565m(Context context, ThreadPoolExecutor threadPoolExecutor, C16569o oVar, C17174e eVar) {
        this.f43222a = context;
        this.f43223b = eVar;
        this.f43224c = oVar;
        this.f43225d = threadPoolExecutor;
    }

    /* renamed from: a */
    public final void mo49343a(List list, C1790k kVar) {
        boolean z;
        if (C17170a.f44404e.get() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f43225d.execute(new C16563l(this, list, kVar));
            return;
        }
        throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
    }
}
