package p495fq;

import android.app.Activity;
import android.app.Application;
import com.google.android.material.snackbar.Snackbar;
import com.moovit.MoovitActivity;
import com.moovit.location.C16202a;
import com.moovit.offline.GtfsConfiguration;
import p304x.C7071l0;
import p471eq.C16850a;
import p471eq.C16851b;
import p484ff.C16984m;
import p824tp.C19746x;

/* renamed from: fq.d */
public final class C17059d extends C16851b {

    /* renamed from: e */
    public final C17057b f44223e = new C17057b(this, 0);

    /* renamed from: f */
    public C16202a.C16203a f44224f = null;

    public C17059d(MoovitActivity moovitActivity) {
        super(moovitActivity);
    }

    /* renamed from: d */
    public final void mo49509d(Snackbar snackbar, C16850a aVar) {
        int i;
        int i2;
        if (!C16202a.get(this.f43848b).hasLocationPermissions()) {
            i2 = C19746x.location_services_not_permitted_message;
            i = C19746x.action_allow;
        } else {
            C16202a.C16203a aVar2 = this.f44224f;
            if (aVar2 == null || !aVar2.mo48508b()) {
                i2 = C19746x.location_services_unavailable_message;
                i = 0;
            } else {
                i2 = C19746x.location_services_disabled_message;
                i = C19746x.location_services_disabled_action;
            }
        }
        snackbar.mo42258o(i2);
        if (i != 0) {
            snackbar.mo42256m(i, aVar);
        }
    }

    /* renamed from: g */
    public final String mo49512g() {
        return "location_services_state";
    }

    /* renamed from: h */
    public final String mo49513h() {
        return "location_services_state";
    }

    /* renamed from: i */
    public final boolean mo49514i() {
        Application application = this.f43848b.getApplication();
        GtfsConfiguration gtfsConfiguration = GtfsConfiguration.f15144e;
        GtfsConfiguration gtfsConfiguration2 = (GtfsConfiguration) application.getSystemService("gtfs_configuration");
        if (gtfsConfiguration2 == null || gtfsConfiguration2.mo19763c()) {
            return false;
        }
        if (!C16202a.get(this.f43848b).hasLocationPermissions()) {
            return true;
        }
        C16202a.C16203a aVar = this.f44224f;
        if (aVar == null) {
            return false;
        }
        if (!aVar.mo48507a() || !this.f44224f.mo48509c()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void mo49515j() {
        super.mo49515j();
        C16202a aVar = C16202a.get(this.f43848b);
        if (!aVar.hasLocationPermissions()) {
            aVar.requestLocationPermissions(this.f43848b, (C16202a.C16205c<MoovitActivity>) new C7071l0(this, 6));
        } else if (this.f44224f.mo48508b()) {
            this.f44224f.mo48510d(this.f43848b, new C17058c(this, 0));
        }
    }

    /* renamed from: k */
    public final void mo49516k() {
        super.mo49516k();
        C16202a.get(this.f43848b).requestLocationSettings().addOnSuccessListener((Activity) this.f43848b, new C16984m(this, 2));
    }

    /* renamed from: o */
    public final void mo49520o() {
        C16202a.get(this.f43848b).addSettingsChangeListener(this.f44223e);
    }

    /* renamed from: p */
    public final void mo49521p() {
        C16202a.get(this.f43848b).removeSettingsChangeListener(this.f44223e);
    }
}
