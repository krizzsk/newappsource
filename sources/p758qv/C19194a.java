package p758qv;

import android.view.KeyEvent;
import android.widget.TextView;
import com.moovit.app.ridesharing.registration.RideSharingProfileUpdateActivity;

/* renamed from: qv.a */
public final /* synthetic */ class C19194a implements TextView.OnEditorActionListener {

    /* renamed from: b */
    public final /* synthetic */ RideSharingProfileUpdateActivity f48799b;

    public /* synthetic */ C19194a(RideSharingProfileUpdateActivity rideSharingProfileUpdateActivity) {
        this.f48799b = rideSharingProfileUpdateActivity;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        RideSharingProfileUpdateActivity rideSharingProfileUpdateActivity = this.f48799b;
        int i2 = RideSharingProfileUpdateActivity.f39364r0;
        if (i == 4) {
            rideSharingProfileUpdateActivity.mo45775y2();
            return false;
        }
        rideSharingProfileUpdateActivity.getClass();
        return false;
    }
}
