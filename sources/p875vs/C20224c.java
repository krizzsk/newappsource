package p875vs;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import ce0.C21100e;
import com.moovit.C15682c;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.web.WebViewActivity;
import java.util.HashSet;
import p543hq.C17474b;
import p567iq.C17635b;
import p824tp.C19728f;
import p898wr.C20400b;
import p977zz.C20927a0;
import p977zz.C20969u0;

/* renamed from: vs.c */
public final class C20224c implements View.OnClickListener {

    /* renamed from: b */
    public final C15682c<?> f51329b;

    public C20224c(C15682c<?> cVar) {
        C21100e.m49373x(cVar, "host");
        this.f51329b = cVar;
    }

    public final void onClick(View view) {
        boolean z;
        Intent intent;
        C20222a aVar = (C20222a) view.getTag();
        if (aVar != null) {
            C15682c<?> cVar = this.f51329b;
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "web_page");
            aVar2.mo49939g(AnalyticsAttributeKey.ID, aVar.f51317a);
            cVar.mo46797j2(aVar2.mo49933a());
            Context context = view.getContext();
            long j = aVar.f51325i;
            long j2 = aVar.f51324h;
            boolean z2 = true;
            if (j >= j2) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                aVar.f51325i = j2;
                HashSet hashSet = C19728f.f50164e;
                MoovitExecutors.SINGLE.execute(new C20223b((C20400b) C17635b.m43779f(context).mo52086d((C19728f) context.getSystemService("metro_context")), context, aVar));
            }
            Uri parse = Uri.parse(aVar.f51320d);
            if (aVar.f51323g) {
                if (!C20969u0.m49111b(parse, "http") && !C20969u0.m49111b(parse, "https")) {
                    z2 = false;
                }
                if (z2) {
                    intent = WebViewActivity.m18168y2(context, aVar.f51320d, aVar.f51319c);
                    this.f51329b.startActivity(intent);
                }
            }
            if (aVar.f51323g) {
                Intent i = C20927a0.m49014i(parse);
                i.setPackage(context.getPackageName());
                if (i.resolveActivity(context.getPackageManager()) != null) {
                    intent = i;
                    this.f51329b.startActivity(intent);
                }
            }
            Intent i2 = C20927a0.m49014i(parse);
            i2.addFlags(1074266112);
            intent = Intent.createChooser(i2, aVar.f51319c);
            this.f51329b.startActivity(intent);
        }
    }
}
