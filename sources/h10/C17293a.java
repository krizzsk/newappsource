package h10;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.gcm.GcmDismissIntentService;
import com.moovit.gcm.messagebar.GcmMessageBar;
import com.moovit.gcm.payload.GcmPayload;
import f10.C16930a;
import p130j2.C5367a;
import p304x.C7078n;
import p471eq.C16850a;
import p471eq.C16851b;
import p543hq.C17474b;

/* renamed from: h10.a */
public final class C17293a extends C16851b {

    /* renamed from: e */
    public final C17294a f44670e = new C17294a();

    /* renamed from: f */
    public final String f44671f;

    /* renamed from: g */
    public GcmMessageBar f44672g = null;

    /* renamed from: h10.a$a */
    public class C17294a extends BroadcastReceiver {
        public C17294a() {
        }

        public final void onReceive(Context context, Intent intent) {
            C17293a.this.f44672g = (GcmMessageBar) intent.getParcelableExtra(C17295b.f44676c);
            C17293a aVar = C17293a.this;
            aVar.mo49522q(aVar.mo49514i());
        }
    }

    public C17293a(MoovitActivity moovitActivity, String str) {
        super(moovitActivity);
        this.f44671f = str;
    }

    /* renamed from: d */
    public final void mo49509d(Snackbar snackbar, C16850a aVar) {
        CharSequence charSequence;
        snackbar.f35312e = -2;
        ((SnackbarContentLayout) snackbar.f35310c.getChildAt(0)).getMessageView().setText(this.f44672g.f41512d);
        GcmMessageBar gcmMessageBar = this.f44672g;
        MoovitActivity moovitActivity = this.f43848b;
        gcmMessageBar.getClass();
        GcmPayload.C15923a c = C16930a.m42749a().mo49552c(moovitActivity);
        if (c != null) {
            charSequence = (CharSequence) gcmMessageBar.f41515g.mo47976b(c);
        } else {
            charSequence = null;
        }
        if (charSequence != null) {
            snackbar.mo42257n(charSequence, aVar);
        }
    }

    /* renamed from: e */
    public final C17474b.C17475a mo49510e() {
        C17474b.C17475a e = super.mo49510e();
        e.mo49939g(AnalyticsAttributeKey.PUSH_ID, this.f44672g.f41515g.f41546b);
        return e;
    }

    /* renamed from: f */
    public final C17474b.C17475a mo49511f() {
        C17474b.C17475a f = super.mo49511f();
        f.mo49939g(AnalyticsAttributeKey.PUSH_ID, this.f44672g.f41515g.f41546b);
        return f;
    }

    /* renamed from: g */
    public final String mo49512g() {
        return "gcm_message_bar_alert";
    }

    /* renamed from: h */
    public final String mo49513h() {
        return "gcm_message_bar_alert";
    }

    /* renamed from: i */
    public final boolean mo49514i() {
        return this.f44672g != null;
    }

    /* renamed from: j */
    public final void mo49515j() {
        super.mo49515j();
        GcmMessageBar gcmMessageBar = this.f44672g;
        MoovitActivity moovitActivity = this.f43848b;
        gcmMessageBar.getClass();
        GcmPayload.C15923a<Void> b = C16930a.m42749a().mo49551b(moovitActivity);
        if (b != null) {
            gcmMessageBar.f41515g.mo47976b(b);
        }
    }

    /* renamed from: o */
    public final void mo49520o() {
        MoovitActivity moovitActivity = this.f43848b;
        String str = this.f44671f;
        C17294a aVar = this.f44670e;
        Uri build = C17295b.f44677d.buildUpon().appendPath(str).build();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(C17295b.f44675b);
        intentFilter.addDataScheme(build.getScheme());
        intentFilter.addDataAuthority(build.getHost(), (String) null);
        intentFilter.addDataPath(build.getPath(), 0);
        C5367a.m13473a(moovitActivity).mo21146b(aVar, intentFilter);
        MoovitActivity moovitActivity2 = this.f43848b;
        String str2 = this.f44671f;
        String str3 = GcmDismissIntentService.f41488b;
        MoovitExecutors.SINGLE.execute(new C7078n(13, moovitActivity2, str2));
    }

    /* renamed from: p */
    public final void mo49521p() {
        MoovitActivity moovitActivity = this.f43848b;
        C17294a aVar = this.f44670e;
        C17295b bVar = C17295b.f44674a;
        C5367a.m13473a(moovitActivity).mo21148d(aVar);
    }
}
