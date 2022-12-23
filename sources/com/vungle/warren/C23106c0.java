package com.vungle.warren;

import java.util.concurrent.ExecutorService;
import od0.C24545c;

/* renamed from: com.vungle.warren.c0 */
public final class C23106c0 extends C23090a0 implements C23095b0 {

    /* renamed from: c */
    public final C23095b0 f58655c;

    /* renamed from: d */
    public final ExecutorService f58656d;

    /* renamed from: com.vungle.warren.c0$a */
    public class C23107a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C24545c f58657b;

        public C23107a(C24545c cVar) {
            this.f58657b = cVar;
        }

        public final void run() {
            C23106c0.this.f58655c.mo58096a(this.f58657b);
        }
    }

    public C23106c0(ExecutorService executorService, C23095b0 b0Var) {
        super(executorService, b0Var);
        this.f58655c = b0Var;
        this.f58656d = executorService;
    }

    /* renamed from: a */
    public final void mo58096a(C24545c cVar) {
        if (this.f58655c != null) {
            this.f58656d.execute(new C23107a(cVar));
        }
    }
}
