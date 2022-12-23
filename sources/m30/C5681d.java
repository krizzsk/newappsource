package m30;

import android.widget.RatingBar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: m30.d */
public final /* synthetic */ class C5681d implements RatingBar.OnRatingBarChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C5682e f18465a;

    public /* synthetic */ C5681d(C5682e eVar) {
        this.f18465a = eVar;
    }

    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        this.f18465a.f18469j.setEnabled(f != BitmapDescriptorFactory.HUE_RED);
    }
}
