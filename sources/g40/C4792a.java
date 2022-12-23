package g40;

import android.app.Notification;
import android.content.Context;
import android.widget.RemoteViews;
import com.moovit.MoovitApplication;
import com.moovit.MoovitNotificationChannel;
import com.moovit.commons.utils.UiUtils;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import d40.C4351g;
import h40.C5050a;
import h40.C5051b;
import p067e1.C4522y;
import p175n.C5768c;
import p824tp.C19735m;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19747y;
import p977zz.C20941h;
import p977zz.C20943i;

/* renamed from: g40.a */
public final class C4792a {

    /* renamed from: a */
    public final C5768c f16174a;

    /* renamed from: b */
    public final C4522y f16175b;

    /* renamed from: c */
    public RemoteViews f16176c;

    /* renamed from: d */
    public RemoteViews f16177d;

    /* renamed from: e */
    public final RemoteViews[] f16178e;

    /* renamed from: f */
    public boolean f16179f;

    /* renamed from: g */
    public boolean f16180g;

    /* renamed from: h */
    public boolean f16181h;

    /* renamed from: i */
    public boolean f16182i;

    /* renamed from: j */
    public Integer f16183j;

    /* renamed from: k */
    public boolean f16184k;

    public C4792a(C4351g gVar) {
        int i;
        RemoteViews[] remoteViewsArr = new RemoteViews[2];
        this.f16178e = remoteViewsArr;
        if (UiUtils.m40253l(gVar)) {
            i = C19747y.MoovitDarkTheme;
        } else {
            i = C19747y.MoovitTheme;
        }
        C5768c cVar = new C5768c((Context) gVar, i);
        this.f16174a = cVar;
        this.f16175b = MoovitNotificationChannel.NAVIGATION.build(cVar);
        this.f16176c = new RemoteViews(cVar.getPackageName(), C19742t.navigation_notification_expanded);
        RemoteViews remoteViews = new RemoteViews(cVar.getPackageName(), C19742t.navigation_notification_collapsed);
        this.f16177d = remoteViews;
        remoteViewsArr[0] = this.f16176c;
        remoteViewsArr[1] = remoteViews;
    }

    /* renamed from: e */
    public static void m12126e(int i, int i2, RemoteViews... remoteViewsArr) {
        int i3 = 0;
        if (C20943i.m49051d(17)) {
            int length = remoteViewsArr.length;
            while (i3 < length) {
                remoteViewsArr[i3].setTextViewCompoundDrawablesRelative(i, i2, 0, 0, 0);
                i3++;
            }
        } else if (C20943i.m49051d(16)) {
            int length2 = remoteViewsArr.length;
            while (i3 < length2) {
                remoteViewsArr[i3].setTextViewCompoundDrawables(i, i2, 0, 0, 0);
                i3++;
            }
        }
    }

    /* renamed from: f */
    public static void m12127f(int i, CharSequence charSequence, RemoteViews... remoteViewsArr) {
        for (RemoteViews remoteViews : remoteViewsArr) {
            if (charSequence != null) {
                remoteViews.setTextViewText(i, charSequence);
            }
        }
    }

    /* renamed from: g */
    public static void m12128g(int i, int i2, RemoteViews... remoteViewsArr) {
        for (RemoteViews viewVisibility : remoteViewsArr) {
            viewVisibility.setViewVisibility(i, i2);
        }
    }

    /* renamed from: a */
    public final Notification mo20310a() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6 = 8;
        if (this.f16179f) {
            i = 0;
        } else {
            i = 8;
        }
        int i7 = C19740r.notification_subtitle_divider;
        Integer num = this.f16183j;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = i;
        }
        m12128g(i7, i2, this.f16178e);
        Integer num2 = this.f16183j;
        if (num2 == null || num2.intValue() != 4) {
            i3 = UiUtils.m40248g(MoovitApplication.f37317k, 4.0f);
        } else {
            i3 = UiUtils.m40248g(MoovitApplication.f37317k, 1.0f);
        }
        int i8 = i3;
        RemoteViews[] remoteViewsArr = this.f16178e;
        if (C20943i.m49051d(16)) {
            for (RemoteViews viewPadding : remoteViewsArr) {
                viewPadding.setViewPadding(i7, i8, 0, i8, 0);
            }
        }
        m12128g(C19740r.notification_subtitle_2, i, this.f16178e);
        if (this.f16181h || this.f16180g) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        int i9 = C19740r.notification_action_next;
        m12128g(i9, i4, this.f16178e);
        int i11 = C19740r.notification_action_prev;
        m12128g(i11, i4, this.f16178e);
        if (this.f16182i) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        this.f16176c.setViewVisibility(C19740r.notification_action_stop, i5);
        boolean z2 = this.f16181h;
        for (RemoteViews remoteViews : this.f16178e) {
            remoteViews.setBoolean(i9, "setEnabled", z2);
        }
        boolean z3 = this.f16180g;
        for (RemoteViews remoteViews2 : this.f16178e) {
            remoteViews2.setBoolean(i11, "setEnabled", z3);
        }
        C4522y yVar = this.f16175b;
        yVar.f15639t = this.f16177d;
        if (this.f16181h || this.f16180g || this.f16182i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            yVar.f15640u = this.f16176c;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f16184k) {
            i6 = 0;
        }
        int i12 = C19740r.notification_time;
        m12128g(i12, i6, this.f16177d);
        if (i6 == 0) {
            m12127f(i12, C7925b.m18024l(this.f16174a, currentTimeMillis), this.f16177d);
        }
        C4522y yVar2 = this.f16175b;
        yVar2.f15644y.when = currentTimeMillis;
        return yVar2.mo20030a();
    }

    /* renamed from: b */
    public final void mo20311b(C5050a aVar) {
        int i;
        int icon = aVar.getIcon();
        int i2 = C19740r.notification_icon;
        boolean z = false;
        for (RemoteViews imageViewResource : this.f16178e) {
            imageViewResource.setImageViewResource(i2, icon);
        }
        m12127f(C19740r.notification_title, aVar.getTitle(), this.f16178e);
        aVar.mo20774c();
        int e = aVar.mo20776e();
        int i3 = C19740r.notification_subtitle_1;
        m12126e(i3, 0, this.f16178e);
        int i4 = C19740r.notification_subtitle_2;
        m12126e(i4, e, this.f16178e);
        CharSequence i5 = aVar.mo20780i();
        CharSequence f = aVar.mo20777f();
        m12127f(i3, i5, this.f16178e);
        m12127f(i4, f, this.f16178e);
        if (f != null) {
            z = true;
        }
        this.f16179f = z;
        this.f16183j = aVar.mo20773b();
        Integer d = aVar.mo20775d();
        if (d != null) {
            mo20313d(d.intValue());
            return;
        }
        C5768c cVar = this.f16174a;
        if (C20943i.m49051d(21)) {
            i = C19735m.colorOnSurface;
        } else {
            i = C19735m.colorOnSurfaceEmphasisHigh;
        }
        mo20313d(C20941h.m49043f(i, cVar));
    }

    /* renamed from: c */
    public final void mo20312c(C5051b bVar) {
        int i;
        mo20311b(bVar);
        int h = bVar.mo20782h();
        int i2 = C19740r.notification_badge;
        RemoteViews[] remoteViewsArr = {this.f16177d};
        for (int i3 = 0; i3 < 1; i3++) {
            remoteViewsArr[i3].setImageViewResource(i2, h);
        }
        int i4 = 8;
        if (h == 0) {
            i = 8;
        } else {
            i = 0;
        }
        m12128g(i2, i, this.f16177d);
        String g = bVar.mo20781g();
        int i5 = C19740r.notification_footer;
        m12127f(i5, g, this.f16176c);
        if (g != null) {
            i4 = 0;
        }
        m12128g(i5, i4, this.f16176c);
        bVar.mo20783j();
        m12126e(i5, R.drawable.ic_battery_16_green, this.f16176c);
    }

    /* renamed from: d */
    public final void mo20313d(int i) {
        int i2 = C19740r.notification_subtitle_1;
        RemoteViews[] remoteViewsArr = {this.f16176c, this.f16177d};
        for (int i3 = 0; i3 < 2; i3++) {
            remoteViewsArr[i3].setTextColor(i2, i);
        }
        int i4 = C19740r.notification_subtitle_2;
        RemoteViews[] remoteViewsArr2 = {this.f16176c, this.f16177d};
        for (int i5 = 0; i5 < 2; i5++) {
            remoteViewsArr2[i5].setTextColor(i4, i);
        }
        int i6 = C19740r.notification_subtitle_divider;
        for (RemoteViews textColor : this.f16178e) {
            textColor.setTextColor(i6, i);
        }
    }
}
