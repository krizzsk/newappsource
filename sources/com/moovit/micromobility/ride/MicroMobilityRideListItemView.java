package com.moovit.micromobility.ride;

import android.content.Context;
import android.util.AttributeSet;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.util.time.C7925b;
import l30.C5570c0;
import l30.C5595x;
import l30.C5596y;
import p977zz.C20964s0;

public class MicroMobilityRideListItemView extends ListItemView {

    /* renamed from: com.moovit.micromobility.ride.MicroMobilityRideListItemView$a */
    public static /* synthetic */ class C4188a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14993a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.micromobility.ride.MicroMobilityRide$Status[] r0 = com.moovit.micromobility.ride.MicroMobilityRide.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14993a = r0
                com.moovit.micromobility.ride.MicroMobilityRide$Status r1 = com.moovit.micromobility.ride.MicroMobilityRide.Status.ACTIVE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14993a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.micromobility.ride.MicroMobilityRide$Status r1 = com.moovit.micromobility.ride.MicroMobilityRide.Status.PAUSED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14993a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.micromobility.ride.MicroMobilityRide$Status r1 = com.moovit.micromobility.ride.MicroMobilityRide.Status.RESERVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f14993a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.micromobility.ride.MicroMobilityRide$Status r1 = com.moovit.micromobility.ride.MicroMobilityRide.Status.PENDING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f14993a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.micromobility.ride.MicroMobilityRide$Status r1 = com.moovit.micromobility.ride.MicroMobilityRide.Status.COMPLETED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f14993a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.moovit.micromobility.ride.MicroMobilityRide$Status r1 = com.moovit.micromobility.ride.MicroMobilityRide.Status.CANCELLED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f14993a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.moovit.micromobility.ride.MicroMobilityRide$Status r1 = com.moovit.micromobility.ride.MicroMobilityRide.Status.EXPIRED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.micromobility.ride.MicroMobilityRideListItemView.C4188a.<clinit>():void");
        }
    }

    public MicroMobilityRideListItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5595x.listItemStyle);
    }

    public void setRide(MicroMobilityRide microMobilityRide) {
        String str;
        setIcon(microMobilityRide.f14992j.f196a);
        Context context = getContext();
        switch (C4188a.f14993a[microMobilityRide.f14991i.f15007b.ordinal()]) {
            case 1:
            case 2:
                setIcon(microMobilityRide.f14992j.f196a);
                setIconTopStartDecorationDrawable(0);
                setTitle((CharSequence) context.getString(C5570c0.wallet_active_ride_title, new Object[]{microMobilityRide.f14988f}));
                String k = C7925b.m18023k(context, microMobilityRide.f14992j.f200e);
                setSubtitle((CharSequence) context.getString(C5570c0.wallet_ride_start_time, new Object[]{k}));
                return;
            case 3:
                setIcon(microMobilityRide.f14992j.f196a);
                setIconTopStartDecorationDrawable(0);
                setTitle((CharSequence) context.getString(C5570c0.wallet_reserved_ride_title, new Object[]{microMobilityRide.f14988f}));
                long j = microMobilityRide.f14992j.f203h;
                if (j != -1) {
                    str = context.getString(C5570c0.wallet_ride_expires_on, new Object[]{C7925b.m18023k(context, j)});
                } else {
                    str = null;
                }
                setSubtitle((CharSequence) str);
                return;
            case 4:
                setIcon(microMobilityRide.f14992j.f196a);
                setIconTopStartDecorationDrawable(0);
                setTitle((CharSequence) context.getString(C5570c0.wallet_pending_ride_title));
                setSubtitle((CharSequence) context.getString(C5570c0.wallet_pending_ride_subtitle));
                return;
            case 5:
                setIcon(microMobilityRide.f14992j.f196a);
                setIconTopStartDecorationDrawable(0);
                setTitle((CharSequence) context.getString(C5570c0.wallet_history_ride_title, new Object[]{C20964s0.m49083a(microMobilityRide.f14988f)}));
                setSubtitle((CharSequence) C7925b.m18023k(context, microMobilityRide.f14992j.f200e) + context.getString(C5570c0.string_list_delimiter_dot) + context.getString(C5570c0.micro_mobility_ride_status_completed));
                return;
            case 6:
                setIcon(microMobilityRide.f14992j.f196a);
                setIconTopStartDecorationDrawable(C5596y.ic_alert_cancelled_16_critical);
                setTitle((CharSequence) context.getString(C5570c0.wallet_history_ride_title, new Object[]{C20964s0.m49083a(microMobilityRide.f14988f)}));
                setSubtitle((CharSequence) C7925b.m18023k(context, microMobilityRide.f14990h) + context.getString(C5570c0.string_list_delimiter_dot) + context.getString(C5570c0.micro_mobility_ride_status_canceled));
                return;
            case 7:
                setIcon(microMobilityRide.f14992j.f196a);
                setIconTopStartDecorationDrawable(C5596y.ic_alert_warning_16_problem);
                setTitle((CharSequence) context.getString(C5570c0.wallet_history_ride_title, new Object[]{C20964s0.m49083a(microMobilityRide.f14988f)}));
                setSubtitle((CharSequence) C7925b.m18023k(context, microMobilityRide.f14990h) + context.getString(C5570c0.string_list_delimiter_dot) + context.getString(C5570c0.micro_mobility_ride_status_expired));
                return;
            default:
                return;
        }
    }

    public MicroMobilityRideListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setMinimumHeight(UiUtils.m40249h(context.getResources(), 69.0f));
    }
}
