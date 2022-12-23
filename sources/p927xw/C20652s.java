package p927xw;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.Button;
import android.widget.TextView;
import c70.C13751d;
import com.moovit.app.tod.model.TodJourneyStatus;
import com.moovit.app.tod.model.TodRide;
import com.moovit.app.tod.model.TodRideJourney;
import com.moovit.app.tod.model.TodRideStatus;
import com.moovit.app.tod.model.TodRideVehicle;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.image.model.Image;
import com.moovit.request.UserRequestError;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import java.util.Collections;
import java.util.Locale;
import p502fx.C17117b;
import p502fx.C17120e;
import p502fx.C17122g;
import p583jk.C17884p;
import p584jl.C17885a;
import p977zz.C20930c;
import p977zz.C20941h;
import p977zz.C20958p0;
import p977zz.C20964s0;
import y10.C20687b;

/* renamed from: xw.s */
public final class C20652s {

    /* renamed from: xw.s$a */
    public static /* synthetic */ class C20653a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52225a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f52226b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|5|6|7|8|9|10|11|12|13|14|15|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|5|6|7|8|9|10|11|12|13|14|15|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0028 */
        static {
            /*
                com.moovit.app.tod.model.TodRideStatus[] r0 = com.moovit.app.tod.model.TodRideStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f52226b = r0
                r1 = 1
                com.moovit.app.tod.model.TodRideStatus r2 = com.moovit.app.tod.model.TodRideStatus.ACTIVE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f52226b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.tod.model.TodRideStatus r3 = com.moovit.app.tod.model.TodRideStatus.FUTURE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f52226b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.tod.model.TodRideStatus r3 = com.moovit.app.tod.model.TodRideStatus.PASSENGER_NOT_SHOWN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r2 = f52226b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.app.tod.model.TodRideStatus r3 = com.moovit.app.tod.model.TodRideStatus.DECLINED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4 = 4
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r2 = f52226b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.app.tod.model.TodRideStatus r3 = com.moovit.app.tod.model.TodRideStatus.CANCELLED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r4 = 5
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r2 = f52226b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.moovit.app.tod.model.TodRideStatus r3 = com.moovit.app.tod.model.TodRideStatus.COMPLETED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r4 = 6
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                com.moovit.app.tod.model.TodJourneyStatus[] r2 = com.moovit.app.tod.model.TodJourneyStatus.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f52225a = r2
                com.moovit.app.tod.model.TodJourneyStatus r3 = com.moovit.app.tod.model.TodJourneyStatus.HEADING_PICKUP     // Catch:{ NoSuchFieldError -> 0x005a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r1 = f52225a     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.moovit.app.tod.model.TodJourneyStatus r2 = com.moovit.app.tod.model.TodJourneyStatus.HEADING_DROP_OFF     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p927xw.C20652s.C20653a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m48546a(Button button, TextView textView, C17117b bVar) {
        C17120e eVar = bVar.f44299b;
        button.setText(eVar.f44307a);
        Image image = eVar.f44308b;
        if (image != null) {
            C17884p.m44354Y(button).mo51642v(image).mo51628o0(image).mo10848R(new C20687b(button));
        } else {
            C17884p.m44354Y(button).mo10872n(button);
            C17885a.m44465u0(button, (Drawable) null, 2);
        }
        button.setEnabled(!eVar.f44309c);
        button.setVisibility(0);
        button.setTag(bVar);
        UiUtils.m40236D(textView, bVar.f44302e, 8);
    }

    /* renamed from: b */
    public static AlertDialogFragment m48547b(Exception exc, Context context) {
        int i = C13751d.f33851b;
        if (exc instanceof UserRequestError) {
            return C13751d.m34342c(context, (String) null, exc).mo47676e(R.drawable.img_empty_warning, false).mo47673b();
        }
        return new AlertDialogFragment.C15856a(context).mo47676e(R.drawable.img_empty_warning, false).mo47683l(R.string.tod_passenger_ride_change_destination_error_popup_title).mo47678g(R.string.tod_passenger_ride_change_destination_error_popup_unable_message).mo47681j(R.string.tod_passenger_ride_change_destination_error_popup_close_action).mo47673b();
    }

    /* renamed from: c */
    public static String m48548c(Context context, long j) {
        String j2 = C7925b.m18022j(context, j);
        String l = C7925b.m18024l(context, j);
        return String.format(C20930c.m49020b(context), context.getString(R.string.tod_passenger_order_future_pickup_details), new Object[]{j2, l});
    }

    /* renamed from: d */
    public static CharSequence m48549d(Context context, long j) {
        if (j < 0) {
            return context.getString(R.string.units_time_na);
        }
        SpannableStringBuilder g = C7925b.f23935b.mo24607g(context, j, Collections.emptyList());
        if (g == null) {
            return context.getString(R.string.units_time_na);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(C20964s0.m49085c(context, R.drawable.ic_real_time_16_live));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(g);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C20941h.m49043f(R.attr.colorLive, context)), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* renamed from: e */
    public static String m48550e(TodRide todRide, C17122g gVar) {
        LocationDescriptor locationDescriptor;
        if (gVar == null) {
            return null;
        }
        TodJourneyStatus todJourneyStatus = gVar.f44315c;
        TodRideJourney todRideJourney = todRide.f40267e;
        if (!todJourneyStatus.isPickedUp()) {
            locationDescriptor = todRideJourney.f40285c;
        } else {
            locationDescriptor = todRideJourney.f40286d;
        }
        if (locationDescriptor != null) {
            return locationDescriptor.mo24313f();
        }
        return todRideJourney.f40287e.mo24313f();
    }

    /* renamed from: f */
    public static CharSequence m48551f(Context context, C17122g gVar) {
        Object obj;
        Context context2 = context;
        C17122g gVar2 = gVar;
        if (gVar2 == null) {
            return context2.getString(R.string.tod_passenger_real_time_status_unknown);
        }
        TodJourneyStatus todJourneyStatus = gVar2.f44315c;
        int i = C20653a.f52225a[todJourneyStatus.ordinal()];
        if (i == 1) {
            long j = gVar2.f44317e;
            if (j < 0) {
                return context2.getString(R.string.units_time_na);
            }
            SpannableStringBuilder g = C7925b.f23935b.mo24607g(context2, j, Collections.emptyList());
            if (g == null) {
                return context2.getString(R.string.units_time_na);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(C20964s0.m49085c(context2, R.drawable.ic_real_time_12_live));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(g);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C20941h.m49043f(R.attr.colorLive, context2)), length, spannableStringBuilder.length(), 33);
            return C20958p0.m49078b(C20930c.m49020b(context), context2.getString(TodJourneyStatus.HEADING_PICKUP.titleResId), spannableStringBuilder);
        } else if (i != 2) {
            return context2.getString(todJourneyStatus.titleResId);
        } else {
            Locale b = C20930c.m49020b(context);
            String string = context2.getString(todJourneyStatus.titleResId);
            Object[] objArr = new Object[1];
            long j2 = gVar2.f44318f;
            if (j2 < 0) {
                obj = context2.getString(R.string.units_time_na);
            } else {
                SpannableString spannableString = new SpannableString(C7925b.f23936c.mo24606f(context, System.currentTimeMillis(), j2, Long.MAX_VALUE, Collections.emptySet()));
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                obj = spannableString;
            }
            objArr[0] = obj;
            return C20958p0.m49078b(b, string, objArr);
        }
    }

    /* renamed from: g */
    public static CharSequence m48552g(TodRideVehicle todRideVehicle) {
        String str;
        String str2;
        if (todRideVehicle != null) {
            str = todRideVehicle.f40302b;
        } else {
            str = null;
        }
        if (todRideVehicle != null) {
            str2 = todRideVehicle.f40306f;
        } else {
            str2 = null;
        }
        CharSequence q = C20964s0.m49099q(" · ", str2, str);
        if (!C20964s0.m49090h(q)) {
            return q;
        }
        return null;
    }

    /* renamed from: h */
    public static CharSequence m48553h(Context context, TodRide todRide, C17122g gVar) {
        TodRideStatus todRideStatus = todRide.f40266d;
        switch (C20653a.f52226b[todRideStatus.ordinal()]) {
            case 1:
                if (gVar == null) {
                    return context.getString(R.string.tod_passenger_ride_status_active_title);
                }
                TodJourneyStatus todJourneyStatus = gVar.f44315c;
                int i = C20653a.f52225a[todJourneyStatus.ordinal()];
                if (i == 1) {
                    return C20958p0.m49077a(context.getString(todJourneyStatus.titleResId), m48549d(context, gVar.f44317e));
                } else if (i != 2) {
                    return context.getString(todJourneyStatus.titleResId);
                } else {
                    return C20958p0.m49077a(context.getString(todJourneyStatus.titleResId), m48549d(context, gVar.f44318f));
                }
            case 2:
                return context.getString(R.string.tod_passenger_ride_eta_future_time, new Object[]{C7925b.m18024l(context, todRide.f40265c)});
            case 3:
                return context.getString(R.string.tod_passenger_ride_status_passenger_not_shown_message_new);
            case 4:
            case 5:
                return context.getString(R.string.tod_passenger_ride_status_cancelled_title);
            case 6:
                return context.getString(R.string.tod_passenger_ride_real_time_arrived_drop_off);
            default:
                throw new IllegalStateException("Unhandled state: " + todRideStatus);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m48554i(p502fx.C17122g r6, android.widget.ImageView... r7) {
        /*
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L_0x001b
            z2.r r2 = r6.f44321i
            com.moovit.app.tod.model.TodRideVehicleAction r3 = com.moovit.app.tod.model.TodRideVehicleAction.COLOR_BAR
            if (r2 == 0) goto L_0x000f
            java.lang.Object r2 = r2.f22858b
            java.util.List r2 = (java.util.List) r2
            goto L_0x0013
        L_0x000f:
            java.util.List r2 = java.util.Collections.emptyList()
        L_0x0013:
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x001b
            r2 = 1
            goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            if (r2 != 0) goto L_0x002b
            r6 = 8
            com.moovit.commons.utils.UiUtils.m40238F(r6, r7)
            java.util.List r6 = java.util.Arrays.asList(r7)
            com.moovit.commons.utils.UiUtils.m40262u(r6, r0)
            return
        L_0x002b:
            z2.r r6 = r6.f44321i
            if (r6 == 0) goto L_0x0037
            java.lang.Object r2 = r6.f22859c
            com.moovit.app.tod.model.TodRideVehicleColorBar r2 = (com.moovit.app.tod.model.TodRideVehicleColorBar) r2
            if (r2 == 0) goto L_0x0037
            r2 = 1
            goto L_0x0038
        L_0x0037:
            r2 = 0
        L_0x0038:
            if (r2 == 0) goto L_0x0058
            java.lang.Object r6 = r6.f22859c
            com.moovit.app.tod.model.TodRideVehicleColorBar r6 = (com.moovit.app.tod.model.TodRideVehicleColorBar) r6
            com.moovit.commons.utils.Color r6 = r6.f40314b
            int r6 = r6.f41007b
            int r2 = r7.length
            r3 = 0
        L_0x0044:
            if (r3 >= r2) goto L_0x0058
            r4 = r7[r3]
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r6)
            r4.setBackgroundTintList(r5)
            r4.setVisibility(r0)
            r4.setEnabled(r1)
            int r3 = r3 + 1
            goto L_0x0044
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p927xw.C20652s.m48554i(fx.g, android.widget.ImageView[]):void");
    }
}
