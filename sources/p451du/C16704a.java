package p451du;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.app.linedetail.p416ui.LineDetailActivity;
import com.moovit.app.realtimehelp.RealTimeHelpBannerView;
import com.moovit.app.tod.order.TodOrderActivity;
import com.veriff.sdk.camera.view.PreviewView;
import p304x.C7082o;

/* renamed from: du.a */
public final /* synthetic */ class C16704a implements View.OnLayoutChangeListener {

    /* renamed from: b */
    public final /* synthetic */ int f43499b;

    /* renamed from: c */
    public final /* synthetic */ KeyEvent.Callback f43500c;

    public /* synthetic */ C16704a(KeyEvent.Callback callback, int i) {
        this.f43499b = i;
        this.f43500c = callback;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.f43499b) {
            case 0:
                LineDetailActivity lineDetailActivity = (LineDetailActivity) this.f43500c;
                BottomSheetBehavior<View> bottomSheetBehavior = lineDetailActivity.f38744x0;
                if (bottomSheetBehavior.f34359J != 1) {
                    C15101a aVar = lineDetailActivity.f38730Y;
                    View view2 = aVar.f38834r;
                    int i9 = 0;
                    if (view2 != null) {
                        i9 = 0 + view2.getHeight();
                    }
                    RealTimeHelpBannerView realTimeHelpBannerView = aVar.f38837u;
                    if (realTimeHelpBannerView != null && realTimeHelpBannerView.getVisibility() == 0) {
                        i9 += aVar.f38837u.getHeight();
                    }
                    View view3 = aVar.f38838v;
                    if (view3 != null && view3.getVisibility() == 0) {
                        i9 += aVar.f38838v.getHeight();
                    }
                    TextView textView = aVar.f38839w;
                    if (textView != null && textView.getVisibility() == 0) {
                        i9 += aVar.f38839w.getHeight();
                    }
                    bottomSheetBehavior.setPeekHeight(i9);
                    C7082o oVar = new C7082o(lineDetailActivity, 14);
                    View view4 = view;
                    view.post(oVar);
                    return;
                }
                return;
            case 1:
                int i11 = TodOrderActivity.f40331D0;
                ((TodOrderActivity) this.f43500c).mo46400J2();
                return;
            default:
                View view5 = view;
                ((PreviewView) this.f43500c).lambda$new$0(view, i, i2, i3, i4, i5, i6, i7, i8);
                return;
        }
    }
}
