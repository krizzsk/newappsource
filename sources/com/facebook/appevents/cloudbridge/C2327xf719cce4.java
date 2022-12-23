package com.facebook.appevents.cloudbridge;

import bf0.C21050d;
import com.facebook.internal.C2397f0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24240p;
import p009a8.C0115o;
import p062d8.C4406c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, mo59060d2 = {"", "<anonymous parameter 0>", "", "responseCode", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 5, 1})
/* renamed from: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1 */
final class C2327xf719cce4 extends Lambda implements C24240p<String, Integer, C21050d> {
    public final /* synthetic */ List<Map<String, Object>> $processedEvents;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2327xf719cce4(List<? extends Map<String, ? extends Object>> list) {
        super(2);
        this.$processedEvents = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        C2397f0 f0Var = C2397f0.f8630a;
        try {
            C0115o.m212c().execute(new C4406c((Integer) obj2, this.$processedEvents));
        } catch (Exception unused) {
        }
        return C21050d.f52856a;
    }
}
