package com.moovit.app.carpool.ridedetails;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.camera.camera2.internal.C0508b;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import b00.C13556a;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.carpool.CarpoolRidePriceView;
import com.moovit.app.carpool.CarpoolRidesProvider;
import com.moovit.app.carpool.ridedetails.CarpoolRideDetailsFragment;
import com.moovit.carpool.ActiveCarpoolRide;
import com.moovit.carpool.CarpoolDriver;
import com.moovit.carpool.CarpoolRide;
import com.moovit.carpool.CarpoolRideDetour;
import com.moovit.carpool.FutureCarpoolRide;
import com.moovit.carpool.HistoricalCarpoolRide;
import com.tranzmate.R;
import java.util.concurrent.TimeUnit;
import p001a0.C0017h;
import p543hq.C17474b;
import p544hr.C17480a;
import p638lr.C18260g;
import p754qr.C19161a;
import p977zz.C20964s0;

/* renamed from: com.moovit.app.carpool.ridedetails.a */
public final class C14835a implements CarpoolRidesProvider.C14792c {

    /* renamed from: a */
    public final /* synthetic */ CarpoolRideDetailsActivity f37885a;

    public C14835a(CarpoolRideDetailsActivity carpoolRideDetailsActivity) {
        this.f37885a = carpoolRideDetailsActivity;
    }

    /* renamed from: a */
    public final void mo44839a(FutureCarpoolRide futureCarpoolRide, ActiveCarpoolRide activeCarpoolRide, HistoricalCarpoolRide historicalCarpoolRide) {
        String str;
        String str2;
        CarpoolRideDetailsActivity carpoolRideDetailsActivity = this.f37885a;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.RIDE_DETAILS_SHOWN);
        aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, true);
        carpoolRideDetailsActivity.mo44545v2(aVar.mo49933a());
        CarpoolRideDetailsActivity carpoolRideDetailsActivity2 = this.f37885a;
        carpoolRideDetailsActivity2.f37837o0 = null;
        carpoolRideDetailsActivity2.f37838p0 = null;
        carpoolRideDetailsActivity2.f37839q0 = null;
        if (futureCarpoolRide != null) {
            carpoolRideDetailsActivity2.f37837o0 = futureCarpoolRide;
            CarpoolRide carpoolRide = futureCarpoolRide.f40937b;
            carpoolRideDetailsActivity2.f37836n0 = carpoolRide;
            CarpoolRideDetailsFragment carpoolRideDetailsFragment = carpoolRideDetailsActivity2.f37832Y;
            boolean z = carpoolRideDetailsActivity2.f37835m0;
            carpoolRideDetailsFragment.f37862F = futureCarpoolRide;
            carpoolRideDetailsFragment.mo44912q2(carpoolRide);
            carpoolRideDetailsFragment.f37872t.mo44828d(futureCarpoolRide, (CarpoolRideDetour) null);
            if (futureCarpoolRide.f40939d) {
                carpoolRideDetailsFragment.mo44913r2(CarpoolRideDetailsFragment.RideAlertType.CANCELED, new Object[0]);
            } else {
                int i = CarpoolRideDetailsFragment.C14833e.f37883a[futureCarpoolRide.f40938c.ordinal()];
                if (i == 1) {
                    carpoolRideDetailsFragment.mo44913r2(CarpoolRideDetailsFragment.RideAlertType.PENDING, new Object[0]);
                } else if (i == 2) {
                    carpoolRideDetailsFragment.mo44913r2(CarpoolRideDetailsFragment.RideAlertType.REJECTED_BY_DRIVER, new Object[0]);
                } else if (i == 3) {
                    if (futureCarpoolRide.f40937b.f40912d - System.currentTimeMillis() > TimeUnit.MINUTES.toMillis(30)) {
                        carpoolRideDetailsFragment.mo44913r2(CarpoolRideDetailsFragment.RideAlertType.REMINDER, 30);
                    } else {
                        carpoolRideDetailsFragment.mo44913r2(CarpoolRideDetailsFragment.RideAlertType.APPROVED, new Object[0]);
                    }
                }
            }
            CarpoolRideDetailsFragment.RideActionViewConfiguration orDefault = CarpoolRideDetailsFragment.f37856J.getOrDefault(futureCarpoolRide.f40938c, null);
            if (!futureCarpoolRide.f40939d && orDefault != null) {
                carpoolRideDetailsFragment.mo44911p2(orDefault);
            }
            FutureCarpoolRide.InvitationState invitationState = FutureCarpoolRide.InvitationState.INVITED;
            if (invitationState.equals(futureCarpoolRide.f40938c)) {
                carpoolRideDetailsFragment.f37858B.setVisibility(0);
                carpoolRideDetailsFragment.f37857A.setVisibility(0);
                Resources resources = carpoolRideDetailsFragment.getContext().getResources();
                if (z) {
                    carpoolRideDetailsFragment.mo46797j2(new C17474b(AnalyticsEventKey.SUGGESTION_SURVEY_SHOWN));
                    str2 = resources.getString(R.string.carpool_reject_ride_button);
                    str = str2;
                } else {
                    str = resources.getString(R.string.carpool_booking_survey_reason);
                    str2 = resources.getString(R.string.carpool_booking_survey_title, new Object[]{str});
                }
                carpoolRideDetailsFragment.f37858B.setText(str2);
                C20964s0.m49105w(carpoolRideDetailsFragment.f37858B, str, false, new C0508b(1, carpoolRideDetailsFragment, z));
            } else {
                carpoolRideDetailsFragment.f37858B.setVisibility(8);
                if (carpoolRideDetailsFragment.f37875w.getVisibility() == 8) {
                    carpoolRideDetailsFragment.f37857A.setVisibility(8);
                }
            }
            if (futureCarpoolRide.f40939d) {
                CarpoolRide carpoolRide2 = futureCarpoolRide.f40937b;
                String str3 = C19161a.f48741h;
                Bundle bundle = new Bundle();
                bundle.putParcelable("ride", carpoolRide2);
                C19161a aVar2 = new C19161a();
                aVar2.setArguments(bundle);
                aVar2.show(carpoolRideDetailsFragment.getChildFragmentManager(), C19161a.f48741h);
            } else if (futureCarpoolRide.f40938c.equals(FutureCarpoolRide.InvitationState.APPROVED_WITH_TIME_CHANGE_BY_DRIVER)) {
                String str4 = C14838d.f37890i;
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("futureRide", futureCarpoolRide);
                C14838d dVar = new C14838d();
                dVar.setArguments(bundle2);
                dVar.show(carpoolRideDetailsFragment.getChildFragmentManager(), C14838d.f37890i);
            }
            carpoolRideDetailsFragment.mo44907m2();
            C13556a aVar3 = carpoolRideDetailsFragment.f37865I;
            if (aVar3 != null) {
                aVar3.cancel(true);
                carpoolRideDetailsFragment.f37865I = null;
            }
            if (carpoolRideDetailsFragment.f37864H != null && !futureCarpoolRide.f40939d && invitationState.equals(futureCarpoolRide.f40938c) && futureCarpoolRide.f40937b.f40911c.f40890q) {
                C18260g gVar = new C18260g(carpoolRideDetailsFragment.mo46783R1(), futureCarpoolRide, carpoolRideDetailsFragment.f37864H.f23786b);
                StringBuilder sb = new StringBuilder();
                C13715c.m34249o(C18260g.class, sb, "#");
                sb.append(gVar.f46583w);
                sb.append("#");
                sb.append(gVar.f46584x);
                carpoolRideDetailsFragment.f37865I = carpoolRideDetailsFragment.mo46794g2(sb.toString(), gVar, carpoolRideDetailsFragment.f37866n);
            }
            carpoolRideDetailsActivity2.mo44899K2(0);
            if (carpoolRideDetailsActivity2.f37840r0) {
                carpoolRideDetailsActivity2.f37840r0 = false;
                carpoolRideDetailsActivity2.mo44903y2();
            }
        } else {
            int i2 = R.attr.colorOnSurfaceEmphasisHigh;
            if (activeCarpoolRide != null) {
                carpoolRideDetailsActivity2.f37838p0 = activeCarpoolRide;
                CarpoolRide carpoolRide3 = activeCarpoolRide.f40854b;
                carpoolRideDetailsActivity2.f37836n0 = carpoolRide3;
                CarpoolRideDetailsFragment carpoolRideDetailsFragment2 = carpoolRideDetailsActivity2.f37832Y;
                carpoolRideDetailsFragment2.f37862F = activeCarpoolRide;
                carpoolRideDetailsFragment2.mo44912q2(carpoolRide3);
                carpoolRideDetailsFragment2.mo44913r2(CarpoolRideDetailsFragment.RideAlertType.ACTIVE, new Object[0]);
                if (activeCarpoolRide.f40855c) {
                    carpoolRideDetailsFragment2.mo44911p2(CarpoolRideDetailsFragment.RideActionViewConfiguration.NO_SHOW);
                }
                CarpoolRidePriceView carpoolRidePriceView = carpoolRideDetailsFragment2.f37872t;
                carpoolRidePriceView.setPriceTextThemeColor(R.attr.colorOnSurfaceEmphasisHigh);
                CarpoolRide carpoolRide4 = activeCarpoolRide.f40854b;
                carpoolRidePriceView.mo24682a(carpoolRide4.f40917i, carpoolRide4.f40918j, (String) null);
                carpoolRideDetailsFragment2.mo44907m2();
                carpoolRideDetailsActivity2.mo44899K2(0);
                if (activeCarpoolRide.f40856d) {
                    carpoolRideDetailsActivity2.mo44898J2(carpoolRideDetailsActivity2.f37836n0, activeCarpoolRide.f40855c);
                }
                if (carpoolRideDetailsActivity2.f37842t0) {
                    carpoolRideDetailsActivity2.f37842t0 = false;
                    carpoolRideDetailsActivity2.mo44896H2(false);
                }
            } else if (historicalCarpoolRide != null) {
                carpoolRideDetailsActivity2.f37839q0 = historicalCarpoolRide;
                CarpoolRide carpoolRide5 = historicalCarpoolRide.f40942b;
                carpoolRideDetailsActivity2.f37836n0 = carpoolRide5;
                CarpoolRideDetailsFragment carpoolRideDetailsFragment3 = carpoolRideDetailsActivity2.f37832Y;
                carpoolRideDetailsFragment3.f37862F = historicalCarpoolRide;
                carpoolRideDetailsFragment3.mo44912q2(carpoolRide5);
                CarpoolRidePriceView carpoolRidePriceView2 = carpoolRideDetailsFragment3.f37872t;
                carpoolRidePriceView2.getClass();
                if (historicalCarpoolRide.f40943c) {
                    i2 = R.attr.colorOnSurfaceEmphasisLow;
                }
                carpoolRidePriceView2.setPriceTextThemeColor(i2);
                CarpoolRide carpoolRide6 = historicalCarpoolRide.f40942b;
                carpoolRidePriceView2.mo24682a(carpoolRide6.f40917i, carpoolRide6.f40918j, (String) null);
                if (!historicalCarpoolRide.f40943c && historicalCarpoolRide.f40944d) {
                    carpoolRideDetailsFragment3.mo44911p2(CarpoolRideDetailsFragment.RideActionViewConfiguration.NO_SHOW);
                }
                if (historicalCarpoolRide.f40943c) {
                    carpoolRideDetailsFragment3.mo44913r2(CarpoolRideDetailsFragment.RideAlertType.CANCELED, new Object[0]);
                } else {
                    carpoolRideDetailsFragment3.mo44913r2(CarpoolRideDetailsFragment.RideAlertType.HISTORY, new Object[0]);
                }
                carpoolRideDetailsFragment3.mo44907m2();
                carpoolRideDetailsActivity2.mo44899K2(0);
                if (historicalCarpoolRide.f40945e) {
                    carpoolRideDetailsActivity2.mo44898J2(carpoolRideDetailsActivity2.f37836n0, historicalCarpoolRide.f40944d);
                }
            }
        }
        CarpoolRideDetailsActivity carpoolRideDetailsActivity3 = this.f37885a;
        CarpoolRide carpoolRide7 = carpoolRideDetailsActivity3.f37836n0;
        if (carpoolRide7 != null) {
            CarpoolDriver carpoolDriver = carpoolRide7.f40911c;
            FragmentManager supportFragmentManager = carpoolRideDetailsActivity3.getSupportFragmentManager();
            C0909a K = C0017h.m54K(supportFragmentManager, supportFragmentManager);
            String str5 = C17480a.f45011t;
            C17480a aVar4 = (C17480a) supportFragmentManager.mo3923A(str5);
            if (aVar4 != null) {
                K.mo4050p(aVar4);
            }
            if (carpoolDriver != null) {
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("driver", carpoolDriver);
                C17480a aVar5 = new C17480a();
                aVar5.setArguments(bundle3);
                K.mo4041e(0, aVar5, str5, 1);
            }
            K.mo4046l();
        }
    }

    /* renamed from: b */
    public final void mo44840b() {
        CarpoolRideDetailsActivity carpoolRideDetailsActivity = this.f37885a;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.RIDE_DETAILS_SHOWN);
        aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, false);
        carpoolRideDetailsActivity.mo44545v2(aVar.mo49933a());
        this.f37885a.mo44899K2(R.string.carpool_status_error_loading_ride_details);
    }
}
