package p713ov;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.web.WebViewActivity;
import java.util.List;
import p543hq.C17474b;
import p60.C18883a;
import p977zz.C20944i0;

/* renamed from: ov.b */
public final /* synthetic */ class C18833b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f47946b;

    /* renamed from: c */
    public final /* synthetic */ C15682c f47947c;

    /* renamed from: d */
    public final /* synthetic */ Button f47948d;

    /* renamed from: e */
    public final /* synthetic */ Object f47949e;

    /* renamed from: f */
    public final /* synthetic */ Object f47950f;

    public /* synthetic */ C18833b(C15682c cVar, Button button, Object obj, Object obj2, int i) {
        this.f47946b = i;
        this.f47947c = cVar;
        this.f47948d = button;
        this.f47949e = obj;
        this.f47950f = obj2;
    }

    public final void onClick(View view) {
        switch (this.f47946b) {
            case 0:
                C18836e eVar = (C18836e) this.f47947c;
                TextView textView = (TextView) this.f47950f;
                int i = C18836e.f47953t;
                eVar.getClass();
                ((CheckBox) this.f47948d).setChecked(true);
                for (View selected : (List) this.f47949e) {
                    selected.setSelected(false);
                }
                textView.setSelected(true);
                eVar.mo51322t2();
                return;
            default:
                C18883a aVar = (C18883a) this.f47947c;
                Button button = this.f47948d;
                C20944i0 i0Var = (C20944i0) this.f47950f;
                int i2 = C18883a.f48058u;
                aVar.getClass();
                Context context = button.getContext();
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, (String) this.f47949e);
                aVar2.mo49939g(AnalyticsAttributeKey.ACTION, (String) i0Var.f52692a);
                aVar.mo46797j2(aVar2.mo49933a());
                aVar.startActivity(WebViewActivity.m18168y2(context, (String) i0Var.f52693b, (CharSequence) null));
                return;
        }
    }
}
