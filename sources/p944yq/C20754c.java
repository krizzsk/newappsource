package p944yq;

import android.app.Application;
import com.google.android.material.snackbar.Snackbar;
import com.moovit.MoovitActivity;
import com.moovit.offline.GtfsConfiguration;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import p471eq.C16850a;
import p471eq.C16851b;
import p615ks.C18126a;
import p977zz.C20964s0;

/* renamed from: yq.c */
public final class C20754c extends C16851b {
    public C20754c(MoovitActivity moovitActivity) {
        super(moovitActivity);
    }

    /* renamed from: d */
    public final void mo49509d(Snackbar snackbar, C16850a aVar) {
        snackbar.f35312e = -2;
        snackbar.mo42258o(R.string.new_version_available_message_android);
        snackbar.mo42256m(R.string.action_more, aVar);
    }

    /* renamed from: g */
    public final String mo49512g() {
        return "whats_new_alert_condition";
    }

    /* renamed from: h */
    public final String mo49513h() {
        return "whats_new_alert_condition";
    }

    /* renamed from: i */
    public final boolean mo49514i() {
        Application application = this.f43848b.getApplication();
        GtfsConfiguration gtfsConfiguration = GtfsConfiguration.f15144e;
        GtfsConfiguration gtfsConfiguration2 = (GtfsConfiguration) application.getSystemService("gtfs_configuration");
        if (gtfsConfiguration2 != null && !gtfsConfiguration2.mo19763c()) {
            if (!(!C18126a.f46340a.mo19759a(this.f43848b.getSharedPreferences("com.moovit.general.ApplicationVersionPrefs", 0)).equals(C18126a.f46341b)) || C20964s0.m49090h(this.f43848b.getText(R.string.new_version_available_message_android))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void mo49515j() {
        int i;
        super.mo49515j();
        C18126a.f46340a.mo49545d(this.f43848b.getSharedPreferences("com.moovit.general.ApplicationVersionPrefs", 0), C18126a.f46341b);
        String string = this.f43848b.getString(R.string.whats_new_link_android);
        MoovitActivity moovitActivity = this.f43848b;
        if (C18126a.m44816a(moovitActivity)) {
            i = R.string.new_version_available;
        } else {
            i = R.string.new_in_this_version;
        }
        CharSequence text = moovitActivity.getText(i);
        MoovitActivity moovitActivity2 = this.f43848b;
        moovitActivity2.startActivity(WebViewActivity.m18168y2(moovitActivity2, string, text));
    }
}
