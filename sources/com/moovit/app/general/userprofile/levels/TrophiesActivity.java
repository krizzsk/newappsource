package com.moovit.app.general.userprofile.levels;

import android.os.Bundle;
import com.moovit.app.MoovitAppActivity;
import com.moovit.commons.view.list.FixedListView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.image.model.ResourceImage;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Iterator;
import p851us.C19987a;

public class TrophiesActivity extends MoovitAppActivity {
    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.trophies_activity);
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(new C19987a(new ResourceImage(R.drawable.img_avatar_baby, new String[0]), getString(R.string.medal_name_baby), getString(R.string.medal_description_baby)));
        arrayList.add(new C19987a(new ResourceImage(R.drawable.img_avatar_traveler, new String[0]), getString(R.string.medal_name_traveler), getString(R.string.medal_description_traveler)));
        arrayList.add(new C19987a(new ResourceImage(R.drawable.img_avatar_rider, new String[0]), getString(R.string.medal_name_rider), getString(R.string.medal_description_rider)));
        arrayList.add(new C19987a(new ResourceImage(R.drawable.img_avatar_sailor, new String[0]), getString(R.string.medal_name_sailor), getString(R.string.medal_description_sailor)));
        arrayList.add(new C19987a(new ResourceImage(R.drawable.img_avatar_aviator, new String[0]), getString(R.string.medal_name_aviator), getString(R.string.medal_description_aviator)));
        FixedListView fixedListView = (FixedListView) findViewById(R.id.list_view);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C19987a aVar = (C19987a) it.next();
            ListItemView listItemView = new ListItemView(this);
            listItemView.setIcon(aVar.f50822a);
            listItemView.setTitle((CharSequence) aVar.f50823b);
            listItemView.setSubtitle((CharSequence) aVar.f50824c);
            fixedListView.addView(listItemView);
        }
    }
}
