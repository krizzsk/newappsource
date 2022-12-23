package w60;

import android.content.Context;
import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.web.WebViewActivity;
import p543hq.C17474b;
import p977zz.C20935e;

/* renamed from: w60.a */
public final /* synthetic */ class C20286a implements C20935e {

    /* renamed from: b */
    public final /* synthetic */ C20287b f51448b;

    /* renamed from: c */
    public final /* synthetic */ View f51449c;

    public /* synthetic */ C20286a(C20287b bVar, View view) {
        this.f51448b = bVar;
        this.f51449c = view;
    }

    public final void invoke(Object obj) {
        C20287b bVar = this.f51448b;
        View view = this.f51449c;
        String str = (String) obj;
        int i = C20287b.f51450t;
        bVar.getClass();
        Context context = view.getContext();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "step_terms_of_use_link");
        aVar.mo49939g(AnalyticsAttributeKey.URI, str);
        bVar.mo46797j2(aVar.mo49933a());
        bVar.startActivity(WebViewActivity.m18168y2(context, str, (CharSequence) null));
    }
}
