package p472er;

import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.moovit.MoovitActivity;
import com.moovit.commons.utils.UiUtils;
import com.moovit.itinerary.model.leg.CarpoolLeg;
import com.tranzmate.R;
import ga0.C12695a;
import ga0.C12709i;
import java.util.Set;
import p584jl.C17885a;

/* renamed from: er.b */
public class C16858b extends C12695a {

    /* renamed from: er.b$a */
    public static class C16859a<B extends C16859a<B>> extends C12695a.C12696a<B> {
        public C16859a(Resources resources) {
            super(resources);
        }
    }

    /* renamed from: er.b$b */
    public static class C16860b extends C16859a<C16860b> {
        public C16860b(Resources resources) {
            super(resources);
        }
    }

    /* renamed from: S1 */
    public final C12709i mo39490S1(MoovitActivity moovitActivity, int i, int i2) {
        return new C12709i(moovitActivity, i, R.layout.carpool_alert_dialog);
    }

    /* renamed from: V1 */
    public final View mo39473V1(FrameLayout frameLayout) {
        Uri uri = (Uri) getArguments().getParcelable("profile_uri");
        if (uri == null) {
            return super.mo39473V1(frameLayout);
        }
        ImageView imageView = new ImageView(getContext());
        int h = UiUtils.m40249h(getResources(), 66.0f);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(h, h));
        Set<CarpoolLeg.CarpoolProvider> set = C16865g.f43870a;
        C17885a.m44469w0(imageView, uri, R.drawable.img_profile_seat_belt_90_gray52);
        return imageView;
    }
}
