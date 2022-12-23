package p495fq;

import android.content.IntentSender;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.play.core.appupdate.C14223a;
import com.google.android.play.core.appupdate.C14224b;
import com.google.android.play.core.appupdate.C14225c;
import p102h0.C5021e;
import p471eq.C16850a;
import p471eq.C16851b;
import p554id.C17564c;
import p554id.C17570i;
import p554id.C17576o;
import p824tp.C19746x;

/* renamed from: fq.g */
public final class C17063g extends C16851b {

    /* renamed from: e */
    public final C17062f f44228e = new C17062f(this);

    /* renamed from: f */
    public final C14224b f44229f;

    /* renamed from: g */
    public C14223a f44230g = null;

    /* renamed from: h */
    public int f44231h = 0;

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17063g(com.moovit.MoovitActivity r4) {
        /*
            r3 = this;
            r3.<init>(r4)
            fq.f r0 = new fq.f
            r0.<init>(r3)
            r3.f44228e = r0
            r0 = 0
            r3.f44230g = r0
            r0 = 0
            r3.f44231h = r0
            java.lang.Class<com.google.android.play.core.appupdate.d> r0 = com.google.android.play.core.appupdate.C14226d.class
            monitor-enter(r0)
            com.google.android.play.core.appupdate.e r1 = com.google.android.play.core.appupdate.C14226d.f35747b     // Catch:{ all -> 0x0038 }
            if (r1 != 0) goto L_0x002a
            com.google.android.play.core.appupdate.h r1 = new com.google.android.play.core.appupdate.h     // Catch:{ all -> 0x0038 }
            android.content.Context r2 = r4.getApplicationContext()     // Catch:{ all -> 0x0038 }
            if (r2 == 0) goto L_0x0020
            r4 = r2
        L_0x0020:
            r1.<init>((java.lang.Object) r4)     // Catch:{ all -> 0x0038 }
            com.google.android.play.core.appupdate.e r4 = new com.google.android.play.core.appupdate.e     // Catch:{ all -> 0x0038 }
            r4.<init>(r1)     // Catch:{ all -> 0x0038 }
            com.google.android.play.core.appupdate.C14226d.f35747b = r4     // Catch:{ all -> 0x0038 }
        L_0x002a:
            com.google.android.play.core.appupdate.e r4 = com.google.android.play.core.appupdate.C14226d.f35747b     // Catch:{ all -> 0x0038 }
            monitor-exit(r0)
            dd.f0 r4 = r4.f35758a
            java.lang.Object r4 = r4.zza()
            com.google.android.play.core.appupdate.b r4 = (com.google.android.play.core.appupdate.C14224b) r4
            r3.f44229f = r4
            return
        L_0x0038:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p495fq.C17063g.<init>(com.moovit.MoovitActivity):void");
    }

    /* renamed from: d */
    public final void mo49509d(Snackbar snackbar, C16850a aVar) {
        boolean z;
        snackbar.f35312e = 10000;
        if (this.f44231h == 11) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            snackbar.mo42258o(C19746x.upgrade_install_message);
            snackbar.mo42256m(C19746x.action_install, aVar);
            return;
        }
        snackbar.mo42258o(C19746x.upgrade_available_message);
        snackbar.mo42256m(C19746x.action_upgrade, aVar);
    }

    /* renamed from: g */
    public final String mo49512g() {
        return "new_app_version_available";
    }

    /* renamed from: h */
    public final String mo49513h() {
        return "new_app_version_available";
    }

    /* renamed from: i */
    public final boolean mo49514i() {
        boolean z;
        if (this.f44230g != null) {
            if (this.f44231h == 11) {
                z = true;
            } else {
                z = false;
            }
            if (z || mo49669r()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final void mo49515j() {
        boolean z;
        boolean z2;
        super.mo49515j();
        if (this.f44230g != null) {
            if (this.f44231h == 11) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f44229f.mo42690b();
            } else if (mo49669r()) {
                try {
                    z2 = this.f44229f.mo42692d(this.f44230g, this.f43848b);
                } catch (IntentSender.SendIntentException unused) {
                    z2 = false;
                }
                if (z2) {
                    mo49522q(false);
                }
            }
        }
    }

    /* renamed from: o */
    public final void mo49520o() {
        this.f44230g = null;
        this.f44231h = 0;
        C17576o c = this.f44229f.mo42691c();
        C5021e eVar = new C5021e(this, 7);
        c.getClass();
        c.f45199b.mo50022a(new C17570i(C17564c.f45178a, eVar));
        c.mo50029b();
        this.f44229f.mo42689a(this.f44228e);
    }

    /* renamed from: p */
    public final void mo49521p() {
        this.f44229f.mo42693e(this.f44228e);
        this.f44230g = null;
        this.f44231h = 0;
    }

    /* renamed from: r */
    public final boolean mo49669r() {
        C14223a aVar = this.f44230g;
        if (aVar != null && this.f44231h == 0 && aVar.f35738a == 2 && aVar.mo42688a(C14225c.m35332c()) != null) {
            return true;
        }
        return false;
    }
}
