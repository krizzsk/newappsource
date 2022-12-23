package com.moovit.app.general.aboutandcontact;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.moovit.app.MoovitAppActivity;
import com.moovit.commons.view.list.FixedListView;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p639ls.C18274c;

public class AckActivity extends MoovitAppActivity {
    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.ack_activity);
        FixedListView fixedListView = (FixedListView) findViewById(R.id.acks);
        for (C18274c cVar : (List) mo44537r1("ACKNOWLEDGEMENTS")) {
            ListItemView listItemView = new ListItemView(this);
            listItemView.setIcon(cVar.f46605c);
            listItemView.setTitle((CharSequence) cVar.f46603a);
            TextView subtitleView = listItemView.getSubtitleView();
            subtitleView.setMovementMethod(LinkMovementMethod.getInstance());
            subtitleView.setText(Html.fromHtml(cVar.f46604b));
            fixedListView.addView(listItemView);
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("ACKNOWLEDGEMENTS");
        return s1;
    }
}
