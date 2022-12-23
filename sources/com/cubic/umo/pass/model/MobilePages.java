package com.cubic.umo.pass.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12943g;
import nb0.C12944h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJY\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u0002HÆ\u0001¨\u0006\u000e"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/MobilePages;", "Landroid/os/Parcelable;", "", "showTransactionHistoryMenu", "showAutoLoadMenu", "showContactInfoMenu", "showPaymentAccountMenu", "showAlertsMenu", "showFAQMenu", "showTOSMenu", "showPrivacyMenu", "copy", "<init>", "(ZZZZZZZZ)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class MobilePages implements Parcelable {
    public static final Parcelable.Creator<MobilePages> CREATOR = new C2253a();

    /* renamed from: b */
    public final boolean f8129b;

    /* renamed from: c */
    public final boolean f8130c;

    /* renamed from: d */
    public final boolean f8131d;

    /* renamed from: e */
    public final boolean f8132e;

    /* renamed from: f */
    public final boolean f8133f;

    /* renamed from: g */
    public final boolean f8134g;

    /* renamed from: h */
    public final boolean f8135h;

    /* renamed from: i */
    public final boolean f8136i;

    /* renamed from: com.cubic.umo.pass.model.MobilePages$a */
    public static final class C2253a implements Parcelable.Creator<MobilePages> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new MobilePages(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        public final Object[] newArray(int i) {
            return new MobilePages[i];
        }
    }

    public MobilePages(@C12943g(name = "txHistory") boolean z, @C12943g(name = "autoload") boolean z2, @C12943g(name = "contactInfo") boolean z3, @C12943g(name = "paymentAccount") boolean z4, @C12943g(name = "alerts") boolean z5, @C12943g(name = "faq") boolean z6, @C12943g(name = "terms") boolean z7, @C12943g(name = "privacy") boolean z8) {
        this.f8129b = z;
        this.f8130c = z2;
        this.f8131d = z3;
        this.f8132e = z4;
        this.f8133f = z5;
        this.f8134g = z6;
        this.f8135h = z7;
        this.f8136i = z8;
    }

    public final MobilePages copy(@C12943g(name = "txHistory") boolean z, @C12943g(name = "autoload") boolean z2, @C12943g(name = "contactInfo") boolean z3, @C12943g(name = "paymentAccount") boolean z4, @C12943g(name = "alerts") boolean z5, @C12943g(name = "faq") boolean z6, @C12943g(name = "terms") boolean z7, @C12943g(name = "privacy") boolean z8) {
        return new MobilePages(z, z2, z3, z4, z5, z6, z7, z8);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobilePages)) {
            return false;
        }
        MobilePages mobilePages = (MobilePages) obj;
        return this.f8129b == mobilePages.f8129b && this.f8130c == mobilePages.f8130c && this.f8131d == mobilePages.f8131d && this.f8132e == mobilePages.f8132e && this.f8133f == mobilePages.f8133f && this.f8134g == mobilePages.f8134g && this.f8135h == mobilePages.f8135h && this.f8136i == mobilePages.f8136i;
    }

    public final int hashCode() {
        boolean z = this.f8129b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f8130c;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f8131d;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f8132e;
        if (z5) {
            z5 = true;
        }
        int i4 = (i3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f8133f;
        if (z6) {
            z6 = true;
        }
        int i5 = (i4 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.f8134g;
        if (z7) {
            z7 = true;
        }
        int i6 = (i5 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.f8135h;
        if (z8) {
            z8 = true;
        }
        int i7 = (i6 + (z8 ? 1 : 0)) * 31;
        boolean z9 = this.f8136i;
        if (!z9) {
            z2 = z9;
        }
        return i7 + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("MobilePages(showTransactionHistoryMenu=");
        k.append(this.f8129b);
        k.append(", showAutoLoadMenu=");
        k.append(this.f8130c);
        k.append(", showContactInfoMenu=");
        k.append(this.f8131d);
        k.append(", showPaymentAccountMenu=");
        k.append(this.f8132e);
        k.append(", showAlertsMenu=");
        k.append(this.f8133f);
        k.append(", showFAQMenu=");
        k.append(this.f8134g);
        k.append(", showTOSMenu=");
        k.append(this.f8135h);
        k.append(", showPrivacyMenu=");
        return C13715c.m34247m(k, this.f8136i, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeInt(this.f8129b ? 1 : 0);
        parcel.writeInt(this.f8130c ? 1 : 0);
        parcel.writeInt(this.f8131d ? 1 : 0);
        parcel.writeInt(this.f8132e ? 1 : 0);
        parcel.writeInt(this.f8133f ? 1 : 0);
        parcel.writeInt(this.f8134g ? 1 : 0);
        parcel.writeInt(this.f8135h ? 1 : 0);
        parcel.writeInt(this.f8136i ? 1 : 0);
    }
}
