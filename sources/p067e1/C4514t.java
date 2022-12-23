package p067e1;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: e1.t */
public final class C4514t {

    /* renamed from: a */
    public final Bundle f15605a;

    /* renamed from: b */
    public IconCompat f15606b;

    /* renamed from: c */
    public final C4495j0[] f15607c;

    /* renamed from: d */
    public boolean f15608d;

    /* renamed from: e */
    public boolean f15609e = true;

    /* renamed from: f */
    public final int f15610f;

    /* renamed from: g */
    public final boolean f15611g;
    @Deprecated

    /* renamed from: h */
    public int f15612h;

    /* renamed from: i */
    public CharSequence f15613i;

    /* renamed from: j */
    public PendingIntent f15614j;

    /* renamed from: k */
    public boolean f15615k;

    public C4514t(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C4495j0[] j0VarArr, C4495j0[] j0VarArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
        this.f15606b = iconCompat;
        if (iconCompat != null && iconCompat.mo3430g() == 2) {
            this.f15612h = iconCompat.mo3428d();
        }
        this.f15613i = C4522y.m11766b(charSequence);
        this.f15614j = pendingIntent;
        this.f15605a = bundle == null ? new Bundle() : bundle;
        this.f15607c = j0VarArr;
        this.f15608d = z;
        this.f15610f = i;
        this.f15609e = z2;
        this.f15611g = z3;
        this.f15615k = z4;
    }

    /* renamed from: a */
    public final IconCompat mo20029a() {
        int i;
        if (this.f15606b == null && (i = this.f15612h) != 0) {
            this.f15606b = IconCompat.m2335b((Resources) null, "", i);
        }
        return this.f15606b;
    }
}
