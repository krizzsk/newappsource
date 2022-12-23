package com.moovit.app.metro.selection;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import c30.C1775e;
import com.moovit.MoovitApplication;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.design.view.list.ListItemView;
import com.moovit.matrolanguage.MetroLanguage;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p543hq.C17474b;
import p646lz.C18299a;
import p824tp.C19728f;
import p824tp.C19731i;
import p977zz.C20975x0;

public class ChangeMetroLanguageActivity extends MoovitAppActivity implements View.OnClickListener {
    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.metro_language_change_activity);
        LayoutInflater layoutInflater = getLayoutInflater();
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.languages);
        String str = ((C19728f) mo44537r1("METRO_CONTEXT")).f50165a.f16128c;
        for (MetroLanguage metroLanguage : (List) mo44537r1("SUPPORTED_METRO_LANGUAGES")) {
            ListItemView listItemView = (ListItemView) layoutInflater.inflate(R.layout.metro_language_change_list_item, viewGroup, false);
            listItemView.setTag(metroLanguage);
            listItemView.setOnClickListener(this);
            listItemView.setText((CharSequence) metroLanguage.f14788b);
            listItemView.setChecked(C20975x0.m49118e(metroLanguage.f14789c, str));
            viewGroup.addView(listItemView);
        }
    }

    public void onClick(View view) {
        MetroLanguage metroLanguage = (MetroLanguage) view.getTag();
        if (metroLanguage != null) {
            C19728f fVar = (C19728f) mo44537r1("METRO_CONTEXT");
            String str = fVar.f50165a.f16128c;
            String str2 = metroLanguage.f14789c;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "change_language");
            aVar.mo49939g(AnalyticsAttributeKey.FROM, str);
            aVar.mo49939g(AnalyticsAttributeKey.TO, metroLanguage.f14789c);
            mo44545v2(aVar.mo49933a());
            if (C20975x0.m49118e(str, str2)) {
                finish();
                return;
            }
            ServerId serverId = fVar.f50165a.f16126a;
            String str3 = metroLanguage.f14789c;
            ((C1775e) C19731i.m47197a(this).f50175e.mo51794a(C1775e.class)).getClass();
            if (str3 == null) {
                C1775e.m5081d(this, serverId).mo49543b();
            } else {
                C1775e.m5081d(this, serverId).mo49544c(str3);
            }
            MoovitApplication.f37317k.mo44571s(mo44550y1(), this, (C18299a) null);
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("SUPPORTED_METRO_LANGUAGES");
        return s1;
    }
}
