package com.moovit.app.ridesharing.view;

import android.content.Context;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import com.moovit.design.view.list.ListItemView;
import com.moovit.ridesharing.model.Event;
import com.tranzmate.R;
import p001a0.C0016g;
import p977zz.C20941h;
import p977zz.C20943i;
import p977zz.C20964s0;

public class EventView extends ListItemView {
    public EventView() {
        throw null;
    }

    public EventView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.eventViewStyle);
    }

    /* renamed from: u */
    public final void mo45800u(Event event, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        setIcon(event.f42912c);
        setTitle((CharSequence) event.f42913d);
        if (z) {
            Context context = getContext();
            if (event.mo49163b()) {
                str3 = DateUtils.formatDateRange(context, event.f42917h, event.f42918i, 65556);
            } else {
                str3 = DateUtils.formatDateTime(context, event.f42917h, 65556);
            }
            String str5 = event.f42914e;
            if (C20964s0.m49090h(str5)) {
                str4 = event.f42915f;
            } else {
                str4 = C0016g.m31o(C0016g.m36t(str5, " ("), event.f42915f, ")");
            }
            setSubtitle((CharSequence) str3 + C20964s0.f52718a + str4);
            return;
        }
        Context context2 = getContext();
        if (event.mo49163b()) {
            str = DateUtils.formatDateRange(context2, event.f42917h, event.f42918i, 65552);
        } else {
            str = DateUtils.formatDateTime(context2, event.f42917h, 65552);
        }
        if (!C20964s0.m49090h(event.f42914e)) {
            str2 = event.f42914e;
        } else {
            str2 = event.f42915f;
        }
        setSubtitle((CharSequence) str + C20964s0.f52718a + str2);
    }

    public EventView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getBackground() == null) {
            C20943i.m49053f(this, C20941h.m49045h(16843534, context));
        }
        if (isInEditMode()) {
            setTitle((CharSequence) "Real Madrid - FC Barcelona");
            setSubtitle((CharSequence) "19-23 Sep\nSantiago Bernabeu Stadium");
        }
    }
}
