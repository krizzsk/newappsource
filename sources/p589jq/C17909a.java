package p589jq;

import ce0.C21100e;
import com.moovit.accessibility.AccessibilityPersonalPrefs;
import com.moovit.accessibility.UserProfileAccessibilityPrefType;
import com.moovit.tripplanner.TripPlannerTransportType;
import f00.C16918f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: jq.a */
public final class C17909a {

    /* renamed from: a */
    public final List<UserProfileAccessibilityPrefType> f45950a;

    /* renamed from: b */
    public final List<UserProfileAccessibilityPrefType> f45951b;

    /* renamed from: c */
    public final List<TripPlannerTransportType> f45952c;

    /* renamed from: d */
    public final int f45953d;

    /* renamed from: e */
    public final C16918f<AccessibilityPersonalPrefs> f45954e;

    /* renamed from: f */
    public final String f45955f;

    /* renamed from: g */
    public final String f45956g;

    public C17909a(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i, C16918f fVar, String str, String str2) {
        this.f45950a = Collections.unmodifiableList(arrayList);
        C21100e.m49373x(arrayList2, "tripPlanAccessibilityPrefTypes");
        this.f45951b = Collections.unmodifiableList(arrayList2);
        this.f45952c = Collections.unmodifiableList(arrayList3);
        this.f45953d = i;
        this.f45954e = fVar;
        this.f45955f = str;
        this.f45956g = str2;
    }

    /* renamed from: a */
    public final AccessibilityPersonalPrefs mo50463a() {
        return this.f45954e.mo49542a();
    }
}
