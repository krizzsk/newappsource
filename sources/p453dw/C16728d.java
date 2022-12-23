package p453dw;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.commons.utils.UiUtils;
import p543hq.C17474b;

/* renamed from: dw.d */
public final /* synthetic */ class C16728d implements View.OnFocusChangeListener {

    /* renamed from: b */
    public final /* synthetic */ StopDetailActivity f43569b;

    public /* synthetic */ C16728d(StopDetailActivity stopDetailActivity) {
        this.f43569b = stopDetailActivity;
    }

    public final void onFocusChange(View view, boolean z) {
        StopDetailActivity stopDetailActivity = this.f43569b;
        int i = StopDetailActivity.f39653z0;
        stopDetailActivity.getClass();
        if (z) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "search_clicked");
            stopDetailActivity.mo44545v2(aVar.mo49933a());
            RecyclerView recyclerView = stopDetailActivity.f39667u0;
            if (recyclerView != null) {
                recyclerView.mo4616h0(0);
                return;
            }
            return;
        }
        UiUtils.m40252k(view);
    }
}
