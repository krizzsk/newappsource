package p927xw;

import android.view.View;
import android.widget.FrameLayout;
import com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView;
import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polyline;
import com.moovit.umo.ads.UmoAds;
import com.tranzmate.R;
import p832tx.C19791a;

/* renamed from: xw.e */
public final /* synthetic */ class C20636e implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f52171b = 1;

    /* renamed from: c */
    public final /* synthetic */ String f52172c;

    /* renamed from: d */
    public final /* synthetic */ Object f52173d;

    /* renamed from: e */
    public final /* synthetic */ Object f52174e;

    /* renamed from: f */
    public final /* synthetic */ Object f52175f;

    public /* synthetic */ C20636e(C19791a aVar, UmoAds umoAds, String str, View view) {
        this.f52173d = aVar;
        this.f52174e = umoAds;
        this.f52172c = str;
        this.f52175f = view;
    }

    public /* synthetic */ C20636e(C20637f fVar, String str, LatLonE6 latLonE6, LatLonE6 latLonE62) {
        this.f52173d = fVar;
        this.f52172c = str;
        this.f52174e = latLonE6;
        this.f52175f = latLonE62;
    }

    public final void onSuccess(Object obj) {
        switch (this.f52171b) {
            case 0:
                C20637f fVar = (C20637f) this.f52173d;
                String str = this.f52172c;
                fVar.getClass();
                C20637f.f52176u.put(str, (Polyline) obj);
                fVar.mo52819e((LatLonE6) this.f52174e, (LatLonE6) this.f52175f);
                return;
            default:
                C19791a aVar = (C19791a) this.f52173d;
                String str2 = this.f52172c;
                View view = (View) this.f52175f;
                Void voidR = (Void) obj;
                int i = C19791a.f50312p;
                aVar.getClass();
                UMOAdKitBannerView a = ((UmoAds) this.f52174e).mo24508a(aVar, str2, aVar);
                if (a != null) {
                    ((FrameLayout) view.findViewById(R.id.container)).addView(a, new FrameLayout.LayoutParams(-1, -2, 17));
                    return;
                }
                return;
        }
    }
}
