package com.moovit.app.tod.shuttle;

import android.content.Context;
import c00.C13720d;
import c00.C13722f;
import cf0.C21136j;
import com.moovit.app.tod.model.TodSubscription;
import com.moovit.app.tod.model.TodWeeklyShuttleSubscription;
import com.moovit.app.tod.shuttle.model.TodSubscriptionEnroll;
import com.moovit.app.tod.shuttle.model.TodWeeklySubscriptionEnroll;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodDaysOfWeek;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.C23825c;
import mf0.C24362h;
import p054d0.C4303q;
import p977zz.C20930c;
import p988j$.time.DayOfWeek;

/* renamed from: com.moovit.app.tod.shuttle.a */
public final class C15536a {
    /* renamed from: a */
    public static final List<Integer> m39718a(TodSubscriptionEnroll todSubscriptionEnroll) {
        if (!(todSubscriptionEnroll instanceof TodWeeklySubscriptionEnroll)) {
            return null;
        }
        HashSet<O> g = C13720d.m34277g(((TodWeeklySubscriptionEnroll) todSubscriptionEnroll).f40443d.f40238b, (C13722f) null, new C4303q(8));
        new MVTodDaysOfWeek().includedDays = g;
        ArrayList arrayList = new ArrayList(C21136j.m49436X(g, 10));
        for (O value : g) {
            arrayList.add(Integer.valueOf(value.getValue()));
        }
        return C23825c.m58495G0(arrayList);
    }

    /* renamed from: b */
    public static final String m39719b(Context context, TodSubscription todSubscription) {
        if (todSubscription instanceof TodWeeklyShuttleSubscription) {
            Set<DayOfWeek> set = ((TodWeeklyShuttleSubscription) todSubscription).f40329d.f40238b;
            if (!set.isEmpty()) {
                Locale b = C20930c.m49020b(context);
                C24362h.m61210e(b, "getLocale(context)");
                return C23825c.m58520q0(set, (String) null, (String) null, (String) null, new TodShuttleUiUtils$getSubscriptionDescription$1(b), 31);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static final String m39720c(Context context, TodSubscriptionEnroll todSubscriptionEnroll) {
        String str;
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        if (todSubscriptionEnroll instanceof TodWeeklySubscriptionEnroll) {
            Set<DayOfWeek> set = ((TodWeeklySubscriptionEnroll) todSubscriptionEnroll).f40443d.f40238b;
            if (set.isEmpty()) {
                str = context.getString(R.string.tod_shuttle_confirmation_not_recurring);
            } else {
                Locale b = C20930c.m49020b(context);
                C24362h.m61210e(b, "getLocale(context)");
                str = C23825c.m58520q0(set, (String) null, (String) null, (String) null, new TodShuttleUiUtils$getSubscriptionEnrollDescription$1(b), 31);
            }
            C24362h.m61210e(str, "{\n\t\t\tval selectedDays = …SHORT, locale) }\n\t\t\t}\n\t\t}");
            return str;
        }
        String string = context.getString(R.string.tod_shuttle_confirmation_not_recurring);
        C24362h.m61210e(string, "context.getString(R.stri…nfirmation_not_recurring)");
        return string;
    }
}
