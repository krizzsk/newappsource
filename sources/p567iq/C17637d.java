package p567iq;

import ce0.C21100e;
import com.moovit.app.home.dashboard.DashboardSection;
import com.moovit.app.home.tab.HomeTabSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: iq.d */
public final class C17637d {

    /* renamed from: a */
    public final List<HomeTabSpec> f45344a;

    /* renamed from: b */
    public final List<DashboardSection> f45345b;

    /* renamed from: c */
    public final boolean f45346c;

    /* renamed from: d */
    public final boolean f45347d;

    /* renamed from: e */
    public final boolean f45348e;

    /* renamed from: f */
    public final int f45349f;

    /* renamed from: g */
    public final boolean f45350g;

    /* renamed from: h */
    public final boolean f45351h;

    /* renamed from: i */
    public final boolean f45352i = true;

    public C17637d(ArrayList arrayList, List list, boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5) {
        this.f45344a = Collections.unmodifiableList(arrayList);
        C21100e.m49373x(list, "dashboardSections");
        this.f45345b = Collections.unmodifiableList(list);
        this.f45346c = z;
        this.f45347d = z2;
        this.f45348e = z3;
        this.f45349f = i;
        this.f45350g = z4;
        this.f45351h = z5;
    }
}
