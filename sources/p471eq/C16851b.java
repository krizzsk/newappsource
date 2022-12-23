package p471eq;

import ce0.C21100e;
import com.google.android.material.snackbar.Snackbar;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import p431cy.C16525b;
import p543hq.C17474b;

/* renamed from: eq.b */
public abstract class C16851b {

    /* renamed from: a */
    public final C16852a f43847a = new C16852a();

    /* renamed from: b */
    public final MoovitActivity f43848b;

    /* renamed from: c */
    public C16853b f43849c;

    /* renamed from: d */
    public boolean f43850d;

    /* renamed from: eq.b$a */
    public class C16852a extends Snackbar.C14123a {
        public C16852a() {
        }

        /* renamed from: a */
        public final void mo39496a(int i, Object obj) {
            C16851b.this.mo49518m((Snackbar) obj, i);
        }

        /* renamed from: c */
        public final void mo42237b(Snackbar snackbar) {
            C16851b.this.mo49519n(snackbar);
        }
    }

    /* renamed from: eq.b$b */
    public interface C16853b {
        /* renamed from: a */
        void mo49523a(C16851b bVar);

        /* renamed from: b */
        void mo49524b(C16851b bVar);
    }

    public C16851b(MoovitActivity moovitActivity) {
        C21100e.m49373x(moovitActivity, "activity");
        this.f43848b = moovitActivity;
    }

    /* renamed from: c */
    public final C16525b mo49508c() {
        return new C16525b(this.f43848b, this);
    }

    /* renamed from: d */
    public abstract void mo49509d(Snackbar snackbar, C16850a aVar);

    /* renamed from: e */
    public C17474b.C17475a mo49510e() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.ALERT_MESSAGE_BAR_ACTION_TAPPED);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, mo49512g());
        return aVar;
    }

    /* renamed from: f */
    public C17474b.C17475a mo49511f() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.ALERT_MESSAGE_BAR_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, mo49512g());
        return aVar;
    }

    /* renamed from: g */
    public abstract String mo49512g();

    /* renamed from: h */
    public abstract String mo49513h();

    /* renamed from: i */
    public abstract boolean mo49514i();

    /* renamed from: j */
    public void mo49515j() {
        this.f43848b.mo44545v2(mo49510e().mo49933a());
    }

    /* renamed from: k */
    public void mo49516k() {
        this.f43850d = mo49514i();
        mo49520o();
    }

    /* renamed from: l */
    public void mo49517l() {
        mo49521p();
    }

    /* renamed from: m */
    public void mo49518m(Snackbar snackbar, int i) {
    }

    /* renamed from: n */
    public void mo49519n(Snackbar snackbar) {
        this.f43848b.mo44545v2(mo49511f().mo49933a());
    }

    /* renamed from: o */
    public void mo49520o() {
    }

    /* renamed from: p */
    public void mo49521p() {
    }

    /* renamed from: q */
    public final void mo49522q(boolean z) {
        if (this.f43850d != z) {
            this.f43850d = z;
            if (z) {
                this.f43849c.mo49523a(this);
            } else {
                this.f43849c.mo49524b(this);
            }
        }
    }
}
