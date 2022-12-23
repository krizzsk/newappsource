package p944yq;

import aa0.C7530f;
import android.app.Activity;
import android.location.Location;
import android.net.Uri;
import com.appsflyer.ServerParameters;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.app.metro.ChangeMetroFragment;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.location.C16202a;
import com.moovit.metro.selection.MetroArea;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import g30.C4768a;
import g30.C4769b;
import g30.C4776h;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import p011aa.C0141e;
import p471eq.C16850a;
import p471eq.C16851b;
import p824tp.C19728f;
import p858uz.C20059f;
import p858uz.C20061g;
import p906wz.C20431c;
import p906wz.C20436g;
import p977zz.C20930c;

/* renamed from: yq.b */
public final class C20751b extends C16851b {

    /* renamed from: e */
    public final C20752a f52356e = new C20752a();

    /* renamed from: f */
    public final C20753b f52357f = new C20753b();

    /* renamed from: g */
    public final C19728f f52358g;

    /* renamed from: h */
    public final C20061g f52359h;

    /* renamed from: i */
    public Location f52360i = null;

    /* renamed from: j */
    public boolean f52361j = true;

    /* renamed from: k */
    public MetroArea f52362k = null;

    /* renamed from: l */
    public String f52363l = null;

    /* renamed from: yq.b$a */
    public class C20752a extends C0141e {
        public C20752a() {
        }

        /* renamed from: d */
        public final boolean mo316d(C20431c cVar, IOException iOException) {
            C4768a aVar = (C4768a) cVar;
            C20751b bVar = C20751b.this;
            bVar.f52360i = null;
            bVar.f52361j = true;
            bVar.f52362k = null;
            return true;
        }

        /* renamed from: i */
        public final boolean mo319i(C20431c cVar, IOException iOException) {
            C4768a aVar = (C4768a) cVar;
            C20751b bVar = C20751b.this;
            bVar.f52360i = null;
            bVar.f52361j = true;
            bVar.f52362k = null;
            return true;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C4768a aVar = (C4768a) cVar;
            C20751b bVar = C20751b.this;
            bVar.f52362k = ((C4769b) gVar).f16114m;
            bVar.mo49522q(bVar.mo49514i());
        }
    }

    /* renamed from: yq.b$b */
    public class C20753b implements C20059f {
        public C20753b() {
        }

        public final void onLocationChanged(Location location) {
            boolean z;
            C20751b bVar = C20751b.this;
            bVar.f52360i = location;
            if (location == null || bVar.f52358g.f50165a.f16132g.mo46935h(LatLonE6.m40177j(location))) {
                z = true;
            } else {
                z = false;
            }
            bVar.f52361j = z;
            C20751b bVar2 = C20751b.this;
            if (bVar2.f52361j) {
                bVar2.f52362k = null;
                bVar2.mo49522q(bVar2.mo49514i());
                return;
            }
            C4768a aVar = new C4768a(bVar2.f43848b.mo44548x1(), LatLonE6.m40177j(bVar2.f52360i));
            MoovitActivity moovitActivity = bVar2.f43848b;
            moovitActivity.mo44528l2(C4768a.class.getSimpleName() + "_" + aVar.f16113w, aVar, bVar2.f52356e);
            C20751b bVar3 = C20751b.this;
            MoovitActivity moovitActivity2 = bVar3.f43848b;
            if (moovitActivity2.f37313z && location != null) {
                Tasks.call(MoovitExecutors.f37327IO, new C7530f.C7533b(moovitActivity2, LatLonE6.m40177j(location))).addOnSuccessListener((Activity) bVar3.f43848b, new C20750a(bVar3, 0));
            }
        }
    }

    public C20751b(MoovitActivity moovitActivity) {
        super(moovitActivity);
        HashSet hashSet = C19728f.f50164e;
        this.f52358g = (C19728f) moovitActivity.getSystemService("metro_context");
        this.f52359h = C16202a.get(moovitActivity).getPermissionAwareLowAccuracyRareUpdates();
    }

    /* renamed from: d */
    public final void mo49509d(Snackbar snackbar, C16850a aVar) {
        snackbar.f35312e = 10000;
        MetroArea metroArea = this.f52362k;
        if (metroArea != null) {
            ((SnackbarContentLayout) snackbar.f35310c.getChildAt(0)).getMessageView().setText(this.f43848b.getString(R.string.location_out_of_metro_bounds_message, new Object[]{metroArea.f14803c}));
            snackbar.mo42256m(R.string.action_switch, aVar);
            return;
        }
        snackbar.mo42258o(R.string.unsupported_metro_message);
        snackbar.mo42256m(R.string.action_join, aVar);
    }

    /* renamed from: g */
    public final String mo49512g() {
        return "out_of_metro_bounds";
    }

    /* renamed from: h */
    public final String mo49513h() {
        return "out_of_metro_bounds";
    }

    /* renamed from: i */
    public final boolean mo49514i() {
        return !this.f52361j && this.f52362k == null;
    }

    /* renamed from: j */
    public final void mo49515j() {
        super.mo49515j();
        if (this.f52362k != null) {
            C4776h hVar = this.f52358g.f50165a;
            ChangeMetroFragment.m38571U1(new MetroArea(hVar.f16126a, hVar.f16129d, Collections.emptyList()), this.f52362k, false).show(this.f43848b.getSupportFragmentManager(), "change_metro_fragment");
            return;
        }
        MoovitActivity moovitActivity = this.f43848b;
        Uri.Builder appendQueryParameter = Uri.parse(moovitActivity.getString(R.string.unsupported_metro_link)).buildUpon().appendQueryParameter(ServerParameters.LANG, C20930c.m49020b(this.f43848b).getLanguage());
        Location location = this.f52360i;
        if (location != null) {
            appendQueryParameter.appendQueryParameter(ServerParameters.LAT_KEY, String.valueOf(location.getLatitude())).appendQueryParameter(ServerParameters.LON_KEY, String.valueOf(this.f52360i.getLongitude()));
        }
        String str = this.f52363l;
        if (str != null) {
            appendQueryParameter.appendQueryParameter(ServerParameters.COUNTRY, str);
        }
        moovitActivity.startActivity(WebViewActivity.m18168y2(moovitActivity, appendQueryParameter.build().toString(), this.f43848b.getString(R.string.action_join)));
    }

    /* renamed from: o */
    public final void mo49520o() {
        this.f52359h.mo50903a(this.f52357f);
    }

    /* renamed from: p */
    public final void mo49521p() {
        this.f52359h.mo50904b(this.f52357f);
    }
}
