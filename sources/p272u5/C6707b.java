package p272u5;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.appboy.p044ui.inappmessage.factories.AppboyModalViewFactory;
import com.moovit.app.tod.center.subscriptions.TodSubscriptionDetailsActivity;
import com.usebutton.sdk.internal.api.AppActionRequest;
import mf0.C24362h;

/* renamed from: u5.b */
public final /* synthetic */ class C6707b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f20794b;

    public /* synthetic */ C6707b(int i) {
        this.f20794b = i;
    }

    public final void onClick(View view) {
        switch (this.f20794b) {
            case 0:
                AppboyModalViewFactory.lambda$createInAppMessageView$0(view);
                return;
            default:
                Context context = view.getContext();
                Object tag = view.getTag();
                C24362h.m61209d(tag, "null cannot be cast to non-null type kotlin.String");
                int i = TodSubscriptionDetailsActivity.f40220X;
                C24362h.m61210e(context, AppActionRequest.KEY_CONTEXT);
                Intent intent = new Intent(context, TodSubscriptionDetailsActivity.class);
                intent.putExtra("subscriptionId", (String) tag);
                context.startActivity(intent);
                return;
        }
    }
}
