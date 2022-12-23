package p589jq;

import android.content.Context;
import android.content.SharedPreferences;
import android.webkit.URLUtil;
import c00.C13717b;
import c00.C13720d;
import c00.C13723g;
import com.moovit.accessibility.AccessibilityPersonalPrefs;
import com.moovit.accessibility.UserProfileAccessibilityPrefType;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import com.moovit.tripplanner.TripPlannerTransportType;
import f00.C16918f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Objects;
import p054d0.C4303q;
import p646lz.C18299a;
import p874vr.C20199a;
import p929xy.C20663f;
import p977zz.C20964s0;
import q00.C19047a;
import v90.C13187a;

/* renamed from: jq.d */
public final class C17912d extends C20663f<C17909a> {

    /* renamed from: c */
    public static final EnumSet<TripPlannerTransportType> f45960c = EnumSet.of(TripPlannerTransportType.BICYCLE, TripPlannerTransportType.MOPED, TripPlannerTransportType.SCOOTER);

    /* renamed from: d */
    public static final EnumSet f45961d = EnumSet.of(UserProfileAccessibilityPrefType.TRIP_PLAN_ACCESSIBILITY_ROUTES, UserProfileAccessibilityPrefType.TRIP_PLAN_HIDE_MICRO_MOBILITY, UserProfileAccessibilityPrefType.TRIP_PLAN_TRAIN_ASSISTANCE, UserProfileAccessibilityPrefType.SERVICES_NOTIFY_DRIVER);

    /* renamed from: b */
    public final HashSet mo20294b(Context context) {
        HashSet b = super.mo20294b(context);
        b.add("CONFIGURATION");
        b.add("TRIP_PLANNER_CONFIGURATION");
        return b;
    }

    /* renamed from: d */
    public final Object mo22058d(Context context, C18299a aVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        boolean z;
        String str;
        String str2;
        C19047a aVar2 = (C19047a) aVar.mo50690c("CONFIGURATION");
        SharedPreferences sharedPreferences = context.getSharedPreferences("accessibility_configuration", 0);
        ArrayList<O> c = C13720d.m34273c(((C13187a) aVar.mo50690c("TRIP_PLANNER_CONFIGURATION")).f32742c, new C17910b(0), new C4303q(0));
        int intValue = ((Integer) aVar2.mo51505b(C20199a.f51304v0)).intValue() & 496;
        ArrayList arrayList = new ArrayList((Collection) aVar2.mo51505b(C20199a.f51265a1));
        if (!C13717b.m34258e(c) || intValue != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            arrayList.remove(UserProfileAccessibilityPrefType.TRIP_PLAN_HIDE_MICRO_MOBILITY);
        }
        EnumSet enumSet = f45961d;
        Objects.requireNonNull(enumSet);
        ArrayList c2 = C13723g.m34282c(arrayList, new C17911c(enumSet, 0));
        C16918f fVar = new C16918f(sharedPreferences, new AccessibilityPersonalPrefs.C14693c(new AccessibilityPersonalPrefs()));
        String str3 = (String) aVar2.mo51505b(C20199a.f51281i1);
        if (!URLUtil.isValidUrl(str3)) {
            str = null;
        } else {
            str = str3;
        }
        String str4 = (String) aVar2.mo51505b(C20199a.f51267b1);
        if (C20964s0.m49092j(str4)) {
            str2 = null;
        } else {
            str2 = str4;
        }
        return new C17909a(arrayList, c2, c, intValue, fVar, str, str2);
    }
}
