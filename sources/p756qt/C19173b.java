package p756qt;

import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.TextView;
import com.moovit.app.intro.FirstTimeUseActivityImpl;
import com.moovit.app.servicealerts.ServiceAlertDetailsActivity;

/* renamed from: qt.b */
public final /* synthetic */ class C19173b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ int f48756b;

    /* renamed from: c */
    public final /* synthetic */ View f48757c;

    /* renamed from: d */
    public final /* synthetic */ Object f48758d;

    public /* synthetic */ C19173b(View view, int i, Object obj) {
        this.f48756b = i;
        this.f48757c = view;
        this.f48758d = obj;
    }

    public final void onGlobalLayout() {
        switch (this.f48756b) {
            case 0:
                View view = this.f48757c;
                int i = FirstTimeUseActivityImpl.f38447q0;
                if (view.getHeight() < ((Drawable) this.f48758d).getIntrinsicHeight() / 2) {
                    view.setVisibility(8);
                    return;
                }
                return;
            default:
                Button button = (Button) this.f48758d;
                int i2 = ServiceAlertDetailsActivity.f39553Y;
                Layout layout = ((TextView) this.f48757c).getLayout();
                if (layout != null && layout.getLineCount() > 1) {
                    button.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
