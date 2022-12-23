package p030bo;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import hi0.C23529c0;
import hi0.C23534e;
import hi0.C23536e0;
import hi0.C23538f;
import hi0.C23556q;
import java.io.IOException;
import java.util.HashMap;
import javax.net.ssl.SSLPeerUnverifiedException;
import p363ak.C13477c;
import p411cm.C13845c;
import p583jk.C17873f;
import p819tk.C19690g;

/* renamed from: bo.c */
public final class C13649c implements C23538f {

    /* renamed from: b */
    public final C13845c f33683b;

    /* renamed from: c */
    public final C17873f f33684c;

    /* renamed from: bo.c$a */
    public static class C13650a {

        /* renamed from: a */
        public C17873f f33685a;

        public C13650a(C17873f fVar) {
            this.f33685a = fVar;
        }
    }

    public C13649c(C13845c cVar, C17873f fVar) {
        this.f33683b = cVar;
        this.f33684c = fVar;
    }

    /* renamed from: c */
    public final void mo5762c(C23534e eVar, IOException iOException) {
        C13477c cVar;
        C13845c cVar2 = this.f33683b;
        if (iOException instanceof SSLPeerUnverifiedException) {
            this.f33684c.getClass();
            cVar = new C13477c(C13477c.f33352f.intValue(), "HTTPS certificate validation failure", C17873f.m44275b(iOException));
        } else {
            this.f33684c.getClass();
            cVar = new C13477c(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS, "Unexpected error", C17873f.m44275b(iOException));
        }
        cVar2.mo4327b(cVar);
    }

    /* renamed from: d */
    public final void mo5763d(C23534e eVar, C23529c0 c0Var) {
        byte[] bArr;
        try {
            C23556q qVar = c0Var.f59415g;
            HashMap hashMap = new HashMap();
            for (int i = 0; i < qVar.f59531a.length / 2; i++) {
                hashMap.put(qVar.mo58683d(i), qVar.mo58686g(i));
            }
            C23536e0 e0Var = c0Var.f59416h;
            if (e0Var != null) {
                bArr = e0Var.mo58648e();
            } else {
                bArr = new byte[0];
            }
            this.f33683b.mo4326a(new C19690g(c0Var.f59412d, hashMap, bArr));
        } catch (IOException e) {
            int intValue = C13477c.f33351e.intValue();
            this.f33684c.getClass();
            this.f33683b.mo4327b(new C13477c(intValue, "Failed loading the response body into memory", C17873f.m44275b(e)));
        }
    }
}
