package androidx.camera.camera2.internal;

import android.os.Bundle;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.carpool.ridedetails.CarpoolRideDetailsFragment;
import com.moovit.carpool.CarpoolRide;
import com.moovit.carpool.HasCarpoolRide;
import com.moovit.network.model.ServerId;
import p543hq.C17474b;
import p778rr.C19316a;
import p778rr.C19318b;

/* renamed from: androidx.camera.camera2.internal.b */
public final /* synthetic */ class C0508b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f1768b;

    /* renamed from: c */
    public final /* synthetic */ boolean f1769c;

    /* renamed from: d */
    public final /* synthetic */ Object f1770d;

    public /* synthetic */ C0508b(int i, Object obj, boolean z) {
        this.f1768b = i;
        this.f1770d = obj;
        this.f1769c = z;
    }

    public final void run() {
        CarpoolRide carpoolRide;
        switch (this.f1768b) {
            case 0:
                Camera2CameraImpl camera2CameraImpl = (Camera2CameraImpl) this.f1770d;
                boolean z = this.f1769c;
                camera2CameraImpl.f1708y = z;
                if (z && camera2CameraImpl.f1689f == Camera2CameraImpl.InternalState.PENDING_OPEN) {
                    camera2CameraImpl.mo2264y(false);
                    return;
                }
                return;
            default:
                CarpoolRideDetailsFragment carpoolRideDetailsFragment = (CarpoolRideDetailsFragment) this.f1770d;
                boolean z2 = this.f1769c;
                HasCarpoolRide hasCarpoolRide = carpoolRideDetailsFragment.f37862F;
                if (hasCarpoolRide == null) {
                    carpoolRide = null;
                } else {
                    carpoolRide = hasCarpoolRide.mo46811a0();
                }
                if (carpoolRide != null) {
                    if (z2) {
                        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "dismiss_ride");
                        carpoolRideDetailsFragment.mo46797j2(aVar.mo49933a());
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("ride", carpoolRide);
                        C19318b bVar = new C19318b();
                        bVar.setArguments(bundle);
                        bVar.show(carpoolRideDetailsFragment.getChildFragmentManager(), "survey");
                        return;
                    }
                    ServerId serverId = carpoolRide.f40910b;
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("rideId", serverId);
                    C19316a aVar2 = new C19316a();
                    aVar2.setArguments(bundle2);
                    aVar2.show(carpoolRideDetailsFragment.getChildFragmentManager(), "survey");
                    return;
                }
                return;
        }
    }
}
