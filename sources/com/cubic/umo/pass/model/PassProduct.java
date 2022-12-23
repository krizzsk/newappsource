package com.cubic.umo.pass.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.appboy.models.outgoing.TwitterUser;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;
import p001a0.C0017h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/PassProduct;", "Landroid/os/Parcelable;", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class PassProduct implements Parcelable {
    public static final Parcelable.Creator<PassProduct> CREATOR = new C2256a();

    /* renamed from: b */
    public final int f8183b;

    /* renamed from: c */
    public final String f8184c;

    /* renamed from: d */
    public final String f8185d;

    /* renamed from: e */
    public final String f8186e;

    /* renamed from: f */
    public final String f8187f;

    /* renamed from: g */
    public final PassType f8188g;

    /* renamed from: h */
    public final int f8189h;

    /* renamed from: i */
    public final Money f8190i;

    /* renamed from: j */
    public final Integer f8191j;

    /* renamed from: k */
    public final boolean f8192k;

    /* renamed from: l */
    public final String f8193l;

    /* renamed from: m */
    public final Integer f8194m;

    /* renamed from: n */
    public final boolean f8195n;

    /* renamed from: o */
    public final boolean f8196o;

    /* renamed from: p */
    public final TimeUnit f8197p;

    /* renamed from: q */
    public final String f8198q;

    /* renamed from: r */
    public final Integer f8199r;

    /* renamed from: s */
    public final Integer f8200s;

    /* renamed from: com.cubic.umo.pass.model.PassProduct$a */
    public static final class C2256a implements Parcelable.Creator<PassProduct> {
        public final Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C24362h.m61211f(parcel2, "parcel");
            return new PassProduct(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), PassType.valueOf(parcel.readString()), parcel.readInt(), Money.CREATOR.createFromParcel(parcel2), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : TimeUnit.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        public final Object[] newArray(int i) {
            return new PassProduct[i];
        }
    }

    public PassProduct(int i, String str, String str2, String str3, String str4, PassType passType, int i2, Money money, Integer num, boolean z, String str5, Integer num2, boolean z2, boolean z3, TimeUnit timeUnit, String str6, Integer num3, Integer num4) {
        Money money2 = money;
        String str7 = str6;
        C24362h.m61211f(str2, "name");
        C24362h.m61211f(str3, "shortDescription");
        C24362h.m61211f(str4, TwitterUser.DESCRIPTION_KEY);
        C24362h.m61211f(passType, "passType");
        C24362h.m61211f(money2, "costMoney");
        C24362h.m61211f(str7, "agencyName");
        this.f8183b = i;
        this.f8184c = str;
        this.f8185d = str2;
        this.f8186e = str3;
        this.f8187f = str4;
        this.f8188g = passType;
        this.f8189h = i2;
        this.f8190i = money2;
        this.f8191j = num;
        this.f8192k = z;
        this.f8193l = str5;
        this.f8194m = num2;
        this.f8195n = z2;
        this.f8196o = z3;
        this.f8197p = timeUnit;
        this.f8198q = str7;
        this.f8199r = num3;
        this.f8200s = num4;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeInt(this.f8183b);
        parcel.writeString(this.f8184c);
        parcel.writeString(this.f8185d);
        parcel.writeString(this.f8186e);
        parcel.writeString(this.f8187f);
        parcel.writeString(this.f8188g.name());
        parcel.writeInt(this.f8189h);
        this.f8190i.writeToParcel(parcel, i);
        Integer num = this.f8191j;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            C0017h.m59P(parcel, 1, num);
        }
        parcel.writeInt(this.f8192k ? 1 : 0);
        parcel.writeString(this.f8193l);
        Integer num2 = this.f8194m;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            C0017h.m59P(parcel, 1, num2);
        }
        parcel.writeInt(this.f8195n ? 1 : 0);
        parcel.writeInt(this.f8196o ? 1 : 0);
        TimeUnit timeUnit = this.f8197p;
        if (timeUnit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(timeUnit.name());
        }
        parcel.writeString(this.f8198q);
        Integer num3 = this.f8199r;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            C0017h.m59P(parcel, 1, num3);
        }
        Integer num4 = this.f8200s;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            C0017h.m59P(parcel, 1, num4);
        }
    }
}
