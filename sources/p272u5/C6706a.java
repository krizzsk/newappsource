package p272u5;

import android.content.Context;
import android.view.View;
import com.appboy.models.InAppMessageFull;
import com.appboy.p044ui.inappmessage.factories.AppboyFullViewFactory;
import com.appboy.p044ui.inappmessage.views.AppboyInAppMessageFullView;

/* renamed from: u5.a */
public final /* synthetic */ class C6706a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ View f20789b;

    /* renamed from: c */
    public final /* synthetic */ AppboyInAppMessageFullView f20790c;

    /* renamed from: d */
    public final /* synthetic */ InAppMessageFull f20791d;

    /* renamed from: e */
    public final /* synthetic */ Context f20792e;

    /* renamed from: f */
    public final /* synthetic */ View f20793f;

    public /* synthetic */ C6706a(View view, AppboyInAppMessageFullView appboyInAppMessageFullView, InAppMessageFull inAppMessageFull, Context context, View view2) {
        this.f20789b = view;
        this.f20790c = appboyInAppMessageFullView;
        this.f20791d = inAppMessageFull;
        this.f20792e = context;
        this.f20793f = view2;
    }

    public final void run() {
        AppboyFullViewFactory.lambda$createInAppMessageView$0(this.f20789b, this.f20790c, this.f20791d, this.f20792e, this.f20793f);
    }
}
