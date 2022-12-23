package com.moovit.app.stoparrivals;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import bf0.C21050d;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.util.time.TimeVehicleLocation;
import com.tranzmate.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C24179b;
import lf0.C24236l;
import mf0.C24362h;
import p001a0.C0016g;
import p172m9.C5720b;
import p429cw.C16515e;
import p543hq.C17474b;
import p977zz.C20941h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"Lcom/moovit/app/stoparrivals/TripsSelectionUpdate;", "kotlin.jvm.PlatformType", "tripSelection", "Lbf0/d;", "invoke", "(Lcom/moovit/app/stoparrivals/TripsSelectionUpdate;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class StopArrivalsActivity$onReady$4 extends Lambda implements C24236l<TripsSelectionUpdate, C21050d> {
    public final /* synthetic */ StopArrivalsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StopArrivalsActivity$onReady$4(StopArrivalsActivity stopArrivalsActivity) {
        super(1);
        this.this$0 = stopArrivalsActivity;
    }

    public final Object invoke(Object obj) {
        Integer num;
        int i;
        List<StopArrival> list;
        Integer num2;
        String str;
        Integer num3;
        TimeVehicleLocation.VehicleProgress vehicleProgress;
        TripsSelectionUpdate tripsSelectionUpdate = (TripsSelectionUpdate) obj;
        StopArrivalsActivity stopArrivalsActivity = this.this$0;
        StopArrival stopArrival = tripsSelectionUpdate.f39625d;
        String str2 = tripsSelectionUpdate.f39626e;
        int i2 = StopArrivalsActivity.f39603q0;
        stopArrivalsActivity.getClass();
        if (str2 != null) {
            TimeVehicleLocation timeVehicleLocation = stopArrival.f39600c.f23912m;
            if (timeVehicleLocation == null || (vehicleProgress = timeVehicleLocation.f23927e) == null) {
                num2 = null;
            } else {
                num2 = Integer.valueOf(vehicleProgress.f23929b);
            }
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.LINE_SELECTED);
            aVar.mo49939g(AnalyticsAttributeKey.SOURCE, str2);
            aVar.mo49937e(AnalyticsAttributeKey.LINE_ID, stopArrival.f39599b.f23687c);
            aVar.mo49938f(AnalyticsAttributeKey.TRIP_ID, stopArrival.f39600c.f23904e);
            aVar.mo49941i(AnalyticsAttributeKey.IS_REAL_TIME, stopArrival.f39600c.mo24633j());
            AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.ITEM_ID;
            TimeVehicleLocation timeVehicleLocation2 = stopArrival.f39600c.f23912m;
            if (timeVehicleLocation2 != null) {
                str = timeVehicleLocation2.f23924b;
            } else {
                str = null;
            }
            aVar.mo49945m(analyticsAttributeKey, str);
            AnalyticsAttributeKey analyticsAttributeKey2 = AnalyticsAttributeKey.STOPS_COUNT;
            if (num2 != null) {
                num3 = Integer.valueOf(stopArrival.f39600c.f23906g - num2.intValue());
            } else {
                num3 = null;
            }
            aVar.mo49944l(analyticsAttributeKey2, num3);
            aVar.mo49945m(AnalyticsAttributeKey.SERVICE_ALERT_TYPE, C0016g.m12B(stopArrival.f39602e));
            stopArrivalsActivity.mo44545v2(aVar.mo49933a());
        }
        C16515e eVar = (C16515e) this.this$0.f39606Y.getValue();
        StopArrival stopArrival2 = tripsSelectionUpdate.f39624c;
        StopArrival stopArrival3 = tripsSelectionUpdate.f39625d;
        eVar.getClass();
        C24362h.m61211f(stopArrival3, "selectedArrival");
        C5720b.m14038F(eVar.f43116b, new StopArrivalsMapHelper$updateMapSelectedArrival$1(stopArrival3, stopArrival2, eVar));
        TripsUpdateResult tripsUpdateResult = (TripsUpdateResult) this.this$0.mo45868y2().f39636h.getValue();
        if (tripsUpdateResult == null || (list = tripsUpdateResult.f39628c) == null) {
            num = null;
        } else {
            num = Integer.valueOf(list.size());
        }
        StopArrivalsActivity stopArrivalsActivity2 = this.this$0;
        boolean z = true;
        int i3 = tripsSelectionUpdate.f39623b + 1;
        stopArrivalsActivity2.getClass();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i3);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        objArr[1] = Integer.valueOf(i);
        SpannableString spannableString = new SpannableString(stopArrivalsActivity2.getString(R.string.format_forward_slash, objArr));
        String valueOf = String.valueOf(i3);
        int M = C24179b.m60565M(spannableString, valueOf, 0, false, 6);
        if (M != -1) {
            spannableString.setSpan(new ForegroundColorSpan(C20941h.m49043f(R.attr.colorOnSurface, stopArrivalsActivity2)), M, valueOf.length() + M, 33);
        }
        TextView textView = stopArrivalsActivity2.f39611o0;
        if (textView != null) {
            textView.setText(spannableString);
            TextView textView2 = stopArrivalsActivity2.f39611o0;
            if (textView2 != null) {
                textView2.setVisibility(0);
                View view = stopArrivalsActivity2.f39612p0;
                if (view != null) {
                    view.setVisibility(8);
                    Button button = this.this$0.f39610n0;
                    if (button != null) {
                        if (tripsSelectionUpdate.f39623b == 0) {
                            z = false;
                        }
                        button.setEnabled(z);
                        ViewPager2 viewPager2 = this.this$0.f39609m0;
                        if (viewPager2 != null) {
                            int currentItem = viewPager2.getCurrentItem();
                            int i4 = tripsSelectionUpdate.f39623b;
                            if (currentItem != i4) {
                                ViewPager2 viewPager22 = this.this$0.f39609m0;
                                if (viewPager22 != null) {
                                    viewPager22.setCurrentItem(i4);
                                } else {
                                    C24362h.m61217l("viewPager");
                                    throw null;
                                }
                            }
                            return C21050d.f52856a;
                        }
                        C24362h.m61217l("viewPager");
                        throw null;
                    }
                    C24362h.m61217l("resetButton");
                    throw null;
                }
                C24362h.m61217l("slidesProgress");
                throw null;
            }
            C24362h.m61217l("slidesIndicator");
            throw null;
        }
        C24362h.m61217l("slidesIndicator");
        throw null;
    }
}
