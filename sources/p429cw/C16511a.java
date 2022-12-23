package p429cw;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.moovit.app.stoparrivals.StopArrivalsActivity;
import mf0.C24362h;

/* renamed from: cw.a */
public final /* synthetic */ class C16511a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ StopArrivalsActivity f43111b;

    public /* synthetic */ C16511a(StopArrivalsActivity stopArrivalsActivity) {
        this.f43111b = stopArrivalsActivity;
    }

    public final void onGlobalLayout() {
        StopArrivalsActivity stopArrivalsActivity = this.f43111b;
        int i = StopArrivalsActivity.f39603q0;
        C24362h.m61211f(stopArrivalsActivity, "this$0");
        Rect rect = stopArrivalsActivity.f39607Z;
        TextView textView = stopArrivalsActivity.f39608l0;
        if (textView != null) {
            rect.top = textView.getHeight();
            Rect rect2 = stopArrivalsActivity.f39607Z;
            ViewPager2 viewPager2 = stopArrivalsActivity.f39609m0;
            if (viewPager2 != null) {
                rect2.bottom = viewPager2.getHeight();
            } else {
                C24362h.m61217l("viewPager");
                throw null;
            }
        } else {
            C24362h.m61217l("stopHeader");
            throw null;
        }
    }
}
