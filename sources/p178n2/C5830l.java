package p178n2;

import androidx.paging.DiffingChangePayload;
import androidx.recyclerview.widget.C1241u;

/* renamed from: n2.l */
public final class C5830l<T> implements C1241u {

    /* renamed from: a */
    public final C5828j<T> f18799a;

    /* renamed from: b */
    public final C1241u f18800b;

    /* renamed from: c */
    public int f18801c;

    /* renamed from: d */
    public int f18802d;

    /* renamed from: e */
    public int f18803e;

    /* renamed from: f */
    public int f18804f = 1;

    /* renamed from: g */
    public int f18805g = 1;

    public C5830l(C5831m mVar, C5831m mVar2, C1241u uVar) {
        this.f18799a = mVar2;
        this.f18800b = uVar;
        this.f18801c = mVar.f18807c;
        this.f18802d = mVar.f18808d;
        this.f18803e = mVar.f18811g;
    }

    /* renamed from: a */
    public final void mo5011a(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= this.f18803e && this.f18805g != 2) {
            int min = Math.min(i2, this.f18802d);
            if (min > 0) {
                this.f18805g = 3;
                this.f18800b.mo5013c(this.f18801c + i, min, DiffingChangePayload.PLACEHOLDER_TO_ITEM);
                this.f18802d -= min;
            }
            int i3 = i2 - min;
            if (i3 > 0) {
                this.f18800b.mo5011a(min + i + this.f18801c, i3);
            }
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (i <= 0 && this.f18804f != 2) {
                int min2 = Math.min(i2, this.f18801c);
                if (min2 > 0) {
                    this.f18804f = 3;
                    this.f18800b.mo5013c((0 - min2) + this.f18801c, min2, DiffingChangePayload.PLACEHOLDER_TO_ITEM);
                    this.f18801c -= min2;
                }
                int i4 = i2 - min2;
                if (i4 > 0) {
                    this.f18800b.mo5011a(this.f18801c + 0, i4);
                }
            } else {
                z2 = false;
            }
            if (!z2) {
                this.f18800b.mo5011a(i + this.f18801c, i2);
            }
        }
        this.f18803e += i2;
    }

    /* renamed from: b */
    public final void mo5012b(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i + i2 >= this.f18803e && this.f18805g != 3) {
            int min = Math.min(this.f18799a.mo21705p() - this.f18802d, i2);
            if (min < 0) {
                min = 0;
            }
            int i3 = i2 - min;
            if (min > 0) {
                this.f18805g = 2;
                this.f18800b.mo5013c(this.f18801c + i, min, DiffingChangePayload.ITEM_TO_PLACEHOLDER);
                this.f18802d += min;
            }
            if (i3 > 0) {
                this.f18800b.mo5012b(min + i + this.f18801c, i3);
            }
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (i <= 0 && this.f18804f != 3) {
                int min2 = Math.min(this.f18799a.mo21704m() - this.f18801c, i2);
                if (min2 < 0) {
                    min2 = 0;
                }
                int i4 = i2 - min2;
                if (i4 > 0) {
                    this.f18800b.mo5012b(this.f18801c + 0, i4);
                }
                if (min2 > 0) {
                    this.f18804f = 2;
                    this.f18800b.mo5013c(this.f18801c + 0, min2, DiffingChangePayload.ITEM_TO_PLACEHOLDER);
                    this.f18801c += min2;
                }
            } else {
                z2 = false;
            }
            if (!z2) {
                this.f18800b.mo5012b(i + this.f18801c, i2);
            }
        }
        this.f18803e -= i2;
    }

    /* renamed from: c */
    public final void mo5013c(int i, int i2, Object obj) {
        this.f18800b.mo5013c(i + this.f18801c, i2, obj);
    }

    /* renamed from: d */
    public final void mo5014d(int i, int i2) {
        C1241u uVar = this.f18800b;
        int i3 = this.f18801c;
        uVar.mo5014d(i + i3, i2 + i3);
    }
}
