package com.vungle.warren;

import com.vungle.warren.error.VungleException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.vungle.warren.a0 */
public class C23090a0 implements C23258z {

    /* renamed from: a */
    public final C23258z f58595a;

    /* renamed from: b */
    public final ExecutorService f58596b;

    /* renamed from: com.vungle.warren.a0$a */
    public class C23091a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f58597b;

        public C23091a(String str) {
            this.f58597b = str;
        }

        public final void run() {
            C23090a0.this.f58595a.onAdLoad(this.f58597b);
        }
    }

    /* renamed from: com.vungle.warren.a0$b */
    public class C23092b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f58599b;

        /* renamed from: c */
        public final /* synthetic */ VungleException f58600c;

        public C23092b(String str, VungleException vungleException) {
            this.f58599b = str;
            this.f58600c = vungleException;
        }

        public final void run() {
            C23090a0.this.f58595a.onError(this.f58599b, this.f58600c);
        }
    }

    public C23090a0(ExecutorService executorService, C23258z zVar) {
        this.f58595a = zVar;
        this.f58596b = executorService;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C23090a0 a0Var = (C23090a0) obj;
        C23258z zVar = this.f58595a;
        if (zVar == null ? a0Var.f58595a != null : !zVar.equals(a0Var.f58595a)) {
            return false;
        }
        ExecutorService executorService = this.f58596b;
        ExecutorService executorService2 = a0Var.f58596b;
        if (executorService != null) {
            return executorService.equals(executorService2);
        }
        if (executorService2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        C23258z zVar = this.f58595a;
        int i2 = 0;
        if (zVar != null) {
            i = zVar.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        ExecutorService executorService = this.f58596b;
        if (executorService != null) {
            i2 = executorService.hashCode();
        }
        return i3 + i2;
    }

    public final void onAdLoad(String str) {
        if (this.f58595a != null) {
            this.f58596b.execute(new C23091a(str));
        }
    }

    public final void onError(String str, VungleException vungleException) {
        if (this.f58595a != null) {
            this.f58596b.execute(new C23092b(str, vungleException));
        }
    }
}
