package com.moovit.app.general.settings.map;

import a00.C13382a;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import java.util.IdentityHashMap;
import p001a0.C0017h;
import p543hq.C17474b;
import p593ju.C17929e;
import p710os.C18825a;
import p710os.C18826b;
import p710os.C18827c;
import p874vr.C20199a;
import q00.C19047a;
import q00.C19053d;

public final class MapSettingsActivity extends MoovitActivity {

    /* renamed from: U */
    public static final /* synthetic */ int f38056U = 0;

    /* renamed from: e1 */
    public final C17474b.C17475a mo44521e1() {
        C19047a a = C19047a.m46164a(getApplicationContext());
        if (a == null) {
            return super.mo44521e1();
        }
        int intValue = ((Integer) a.mo51505b(C19053d.f48472k)).intValue();
        boolean booleanValue = ((Boolean) a.mo51505b(C19053d.f48486y)).booleanValue();
        SharedPreferences sharedPreferences = getSharedPreferences("map_settings", 0);
        Integer num = -1;
        new IdentityHashMap(1);
        boolean booleanValue2 = C18827c.f47938c.mo19759a(C18827c.m45824a(this).f47939a).booleanValue();
        C17474b.C17475a e1 = super.mo44521e1();
        e1.mo49942j(AnalyticsAttributeKey.AVAILABLE_MAP_SETTINGS, C0017h.m46C(intValue, booleanValue));
        e1.mo49942j(AnalyticsAttributeKey.SET_MAP_SETTINGS, C0017h.m46C(Integer.valueOf(sharedPreferences.getInt("user_map_layers", num.intValue())).intValue(), booleanValue2));
        return e1;
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.map_settings_activity);
        C17929e eVar = new C17929e(getApplicationContext());
        C19047a.C19048a aVar = C19047a.f48441d;
        int intValue = ((Integer) ((C19047a) getSystemService("user_configuration")).mo51505b(C20199a.f51304v0)).intValue();
        mo45004z2((ListItemView) findViewById(R.id.stations_settings), 4, intValue, eVar);
        mo45004z2((ListItemView) findViewById(R.id.bicycle_settings), 16, intValue, eVar);
        mo45004z2((ListItemView) findViewById(R.id.bicycle_repair_settings), 2048, intValue, eVar);
        mo45004z2((ListItemView) findViewById(R.id.dockless_bicycles_settings), 32, intValue, eVar);
        mo45004z2((ListItemView) findViewById(R.id.kick_scooters_settings), 64, intValue, eVar);
        mo45004z2((ListItemView) findViewById(R.id.electric_scooters_settings), RecyclerView.C1119a0.FLAG_IGNORE, intValue, eVar);
        mo45004z2((ListItemView) findViewById(R.id.electric_moped_settings), 256, intValue, eVar);
        mo45004z2((ListItemView) findViewById(R.id.car_settings), 1536, intValue, eVar);
        mo45004z2((ListItemView) findViewById(R.id.parking_lots_settings), 4096, intValue, eVar);
        mo45004z2((ListItemView) findViewById(R.id.commercial_settings), 8, intValue, eVar);
        mo45004z2((ListItemView) findViewById(R.id.subway_settings), 1, intValue, eVar);
        mo45004z2((ListItemView) findViewById(R.id.pathway_settings), 2, intValue, eVar);
        if (((Boolean) ((C19047a) getSystemService("user_configuration")).mo51505b(C19053d.f48486y)).booleanValue()) {
            ListItemView listItemView = (ListItemView) findViewById(R.id.taxi_floating_button_settings);
            listItemView.setVisibility(0);
            listItemView.setChecked(C18827c.f47938c.mo19759a(C18827c.m45824a(this).f47939a).booleanValue());
            listItemView.setOnCheckedChangeListener(new C18825a(this));
        }
    }

    /* renamed from: y2 */
    public final void mo45003y2(ListItemView listItemView) {
        int i;
        CharSequence[] charSequenceArr = new CharSequence[3];
        charSequenceArr[0] = listItemView.getTitle();
        charSequenceArr[1] = listItemView.getSubtitle();
        if (listItemView.isChecked()) {
            i = R.string.voice_over_checked;
        } else {
            i = R.string.voice_over_unchecked;
        }
        charSequenceArr[2] = getString(i);
        C13382a.m33674j(listItemView, charSequenceArr);
    }

    /* renamed from: z2 */
    public final void mo45004z2(ListItemView listItemView, int i, int i2, C17929e eVar) {
        boolean z;
        boolean z2 = true;
        if ((i2 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            listItemView.setVisibility(0);
            if ((eVar.mo50470a() & i) == 0) {
                z2 = false;
            }
            listItemView.setChecked(z2);
            listItemView.setOnCheckedChangeListener(new C18826b(this, eVar, i, listItemView));
            mo45003y2(listItemView);
        }
    }
}
