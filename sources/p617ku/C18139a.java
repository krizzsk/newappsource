package p617ku;

import aa0.C7524a;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Location;
import com.moovit.MoovitActivity;
import com.moovit.app.metro.ChangeMetroFragment;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.location.C16202a;
import com.moovit.metro.selection.MetroArea;
import com.moovit.network.model.ServerId;
import f00.C16919g;
import g30.C4768a;
import g30.C4769b;
import g30.C4776h;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p824tp.C19728f;
import p858uz.C20059f;
import p874vr.C20199a;
import p977zz.C20944i0;
import p977zz.C20975x0;
import q00.C19047a;

/* renamed from: ku.a */
public final class C18139a implements C7524a<C20944i0<C19728f, MetroArea>> {

    /* renamed from: a */
    public static final ServerId.C4257e f46362a = new ServerId.C4257e();

    /* renamed from: b */
    public static final C16919g.C16925f f46363b = new C16919g.C16925f("last_known_metro_timestamp", 0);

    /* renamed from: a */
    public final Object mo23790a(MoovitActivity moovitActivity) throws Exception {
        Set<String> categories;
        MetroArea metroArea;
        C19728f a = C19728f.m47195a(moovitActivity.getApplicationContext());
        C19047a a2 = C19047a.m46164a(moovitActivity.getApplicationContext());
        if (!(a == null || a2 == null || !((Boolean) a2.mo51505b(C20199a.f51266b0)).booleanValue())) {
            Intent intent = moovitActivity.getIntent();
            if ("android.intent.action.MAIN".equals(intent.getAction()) && (categories = intent.getCategories()) != null && categories.contains("android.intent.category.LAUNCHER")) {
                C20059f.C20060a aVar = new C20059f.C20060a();
                C16202a.get(moovitActivity).getPermissionAwareLowAccuracyRareUpdates().mo50015m(aVar);
                LatLonE6 j = LatLonE6.m40177j((Location) aVar.mo53033a(3000).f52693b);
                if (!(j == null || a.f50165a.f16132g.mo46935h(j) || (metroArea = ((C4769b) new C4768a(moovitActivity.mo44548x1(), j).mo52626J()).f16114m) == null)) {
                    boolean z = false;
                    SharedPreferences sharedPreferences = moovitActivity.getSharedPreferences("metro_switch_display_task", 0);
                    boolean z2 = !C20975x0.m49118e(metroArea.f14802b, f46362a.mo19759a(sharedPreferences));
                    if (System.currentTimeMillis() - f46363b.mo19759a(sharedPreferences).longValue() >= TimeUnit.DAYS.toMillis(1)) {
                        z = true;
                    }
                    if (z2 || z) {
                        return new C20944i0(a, metroArea);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo23791b(MoovitActivity moovitActivity, Object obj) {
        C20944i0 i0Var = (C20944i0) obj;
        MetroArea metroArea = (MetroArea) i0Var.f52693b;
        SharedPreferences sharedPreferences = moovitActivity.getSharedPreferences("metro_switch_display_task", 0);
        f46362a.mo49545d(sharedPreferences, metroArea.f14802b);
        f46363b.mo49545d(sharedPreferences, Long.valueOf(System.currentTimeMillis()));
        C4776h hVar = ((C19728f) i0Var.f52692a).f50165a;
        ChangeMetroFragment.m38571U1(new MetroArea(hVar.f16126a, hVar.f16129d, Collections.emptyList()), metroArea, true).show(moovitActivity.getSupportFragmentManager(), "change_metro_fragment");
    }
}
