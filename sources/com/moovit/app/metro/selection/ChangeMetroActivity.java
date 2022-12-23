package com.moovit.app.metro.selection;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.moovit.app.metro.ChangeMetroFragment;
import com.moovit.commons.utils.UiUtils;
import com.moovit.metro.selection.Country;
import com.moovit.metro.selection.MetroArea;
import com.moovit.network.model.ServerId;
import g30.C4776h;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import p824tp.C19722a0;
import p824tp.C19728f;

public class ChangeMetroActivity extends MetroListActivity {

    /* renamed from: p0 */
    public static final /* synthetic */ int f38958p0 = 0;

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        MetroArea metroArea = (MetroArea) getIntent().getParcelableExtra("metro_area_extra");
        if (metroArea != null) {
            ((ViewGroup) findViewById(16908290)).removeAllViews();
            mo45520y2(metroArea);
            return;
        }
        ServerId serverId = ((C19722a0) getSystemService("user_context")).f50160a.f32927c;
        Iterator<Country> it = this.f38962Y.iterator();
        loop0:
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Country next = it.next();
            Iterator<MetroArea> it2 = next.f14799e.iterator();
            while (true) {
                if (it2.hasNext()) {
                    MetroArea next2 = it2.next();
                    if (next2.f14802b.equals(serverId)) {
                        this.f38961X = next;
                        this.f38960U = next2;
                        mo45522z2();
                        break loop0;
                    }
                }
            }
        }
        Country country = this.f38961X;
        if (country != null) {
            this.f38966n0.expandGroup(this.f38962Y.indexOf(country));
        }
        int checkedItemPosition = this.f38966n0.getCheckedItemPosition();
        if (checkedItemPosition != -1) {
            this.f38966n0.setSelectionFromTop(checkedItemPosition, UiUtils.m40249h(getResources(), 50.0f));
        }
    }

    /* renamed from: y2 */
    public final void mo45520y2(MetroArea metroArea) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.mo3923A("change_metro_fragment") == null) {
            HashSet hashSet = C19728f.f50164e;
            C4776h hVar = ((C19728f) getSystemService("metro_context")).f50165a;
            ChangeMetroFragment.m38571U1(new MetroArea(hVar.f16126a, hVar.f16129d, Collections.emptyList()), metroArea, false).show(supportFragmentManager, "change_metro_fragment");
        }
    }
}
