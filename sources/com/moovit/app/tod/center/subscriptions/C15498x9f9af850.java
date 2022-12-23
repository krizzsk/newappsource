package com.moovit.app.tod.center.subscriptions;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import p977zz.C20930c;
import p988j$.time.DayOfWeek;
import p988j$.time.format.TextStyle;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"j$/time/DayOfWeek", "it", "", "invoke", "(Lj$/time/DayOfWeek;)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
/* renamed from: com.moovit.app.tod.center.subscriptions.TodSubscriptionsCenterFragment$Adapter$onBindWeeklyShuttleSubscriptionViewHolder$1 */
final class C15498x9f9af850 extends Lambda implements C24236l<DayOfWeek, CharSequence> {
    public final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15498x9f9af850(Context context) {
        super(1);
        this.$context = context;
    }

    public final Object invoke(Object obj) {
        DayOfWeek dayOfWeek = (DayOfWeek) obj;
        C24362h.m61211f(dayOfWeek, "it");
        String displayName = dayOfWeek.getDisplayName(TextStyle.SHORT, C20930c.m49020b(this.$context));
        C24362h.m61210e(displayName, "it.getDisplayName(\n\t\t\t\t\t….getLocale(context)\n\t\t\t\t)");
        return displayName;
    }
}
