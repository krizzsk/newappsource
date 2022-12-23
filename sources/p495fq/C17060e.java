package p495fq;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.material.snackbar.Snackbar;
import com.moovit.MoovitActivity;
import com.moovit.offline.GtfsConfiguration;
import p471eq.C16850a;
import p471eq.C16851b;
import p824tp.C19746x;
import p977zz.C20947k;

/* renamed from: fq.e */
public final class C17060e extends C16851b {

    /* renamed from: e */
    public final C17061a f44225e = new C17061a();

    /* renamed from: fq.e$a */
    public class C17061a extends BroadcastReceiver {
        public C17061a() {
        }

        public final void onReceive(Context context, Intent intent) {
            C17060e eVar = C17060e.this;
            eVar.mo49522q(eVar.mo49514i());
        }
    }

    public C17060e(MoovitActivity moovitActivity) {
        super(moovitActivity);
    }

    /* renamed from: d */
    public final void mo49509d(Snackbar snackbar, C16850a aVar) {
        snackbar.mo42258o(C19746x.network_unavailable_message);
    }

    /* renamed from: g */
    public final String mo49512g() {
        return "network_unavailable";
    }

    /* renamed from: h */
    public final String mo49513h() {
        return "network_unavailable";
    }

    /* renamed from: i */
    public final boolean mo49514i() {
        Application application = this.f43848b.getApplication();
        GtfsConfiguration gtfsConfiguration = GtfsConfiguration.f15144e;
        GtfsConfiguration gtfsConfiguration2 = (GtfsConfiguration) application.getSystemService("gtfs_configuration");
        if (gtfsConfiguration2 == null || gtfsConfiguration2.mo19763c() || C20947k.m49056a(this.f43848b)) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public final void mo49520o() {
        this.f43848b.registerReceiver(this.f44225e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* renamed from: p */
    public final void mo49521p() {
        this.f43848b.unregisterReceiver(this.f44225e);
    }
}
