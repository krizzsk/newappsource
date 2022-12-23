package com.cubic.umo.pass.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.appboy.models.outgoing.TwitterUser;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12943g;
import nb0.C12944h;
import p001a0.C0017h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001:\u0001'Bé\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u001d\u001a\u00020\u000f\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b%\u0010&J¢\u0002\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0003\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u001d\u001a\u00020\u000f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010 \u001a\u00020\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b#\u0010$¨\u0006("}, mo59060d2 = {"Lcom/cubic/umo/pass/model/PassDTO;", "Landroid/os/Parcelable;", "Lcom/cubic/umo/pass/model/TimeUnit;", "durationUnits", "", "name", "description", "shortDescription", "agency", "passTypeDescription", "Lcom/cubic/umo/pass/model/TxDTO;", "passPurchaseTx", "startExpDescription", "", "tripsLeft", "", "start", "duration", "expiration", "", "autoRenew", "renewable", "created", "price", "Lcom/cubic/umo/pass/model/Money;", "cost", "Lcom/cubic/umo/pass/model/PassDTO$PassType;", "passType", "maxQuantity", "passId", "originalTrips", "stablePassProductId", "passProductId", "lowTrips", "passExpiring", "copy", "(Lcom/cubic/umo/pass/model/TimeUnit;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cubic/umo/pass/model/TxDTO;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;ZLjava/lang/Boolean;JILcom/cubic/umo/pass/model/Money;Lcom/cubic/umo/pass/model/PassDTO$PassType;Ljava/lang/Integer;JLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/cubic/umo/pass/model/PassDTO;", "<init>", "(Lcom/cubic/umo/pass/model/TimeUnit;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cubic/umo/pass/model/TxDTO;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;ZLjava/lang/Boolean;JILcom/cubic/umo/pass/model/Money;Lcom/cubic/umo/pass/model/PassDTO$PassType;Ljava/lang/Integer;JLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "PassType", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class PassDTO implements Parcelable {
    public static final Parcelable.Creator<PassDTO> CREATOR = new C2255a();

    /* renamed from: b */
    public final TimeUnit f8145b;

    /* renamed from: c */
    public final String f8146c;

    /* renamed from: d */
    public final String f8147d;

    /* renamed from: e */
    public final String f8148e;

    /* renamed from: f */
    public final String f8149f;

    /* renamed from: g */
    public final String f8150g;

    /* renamed from: h */
    public final TxDTO f8151h;

    /* renamed from: i */
    public final String f8152i;

    /* renamed from: j */
    public final Integer f8153j;

    /* renamed from: k */
    public final Long f8154k;

    /* renamed from: l */
    public final Integer f8155l;

    /* renamed from: m */
    public final Long f8156m;

    /* renamed from: n */
    public final boolean f8157n;

    /* renamed from: o */
    public final Boolean f8158o;

    /* renamed from: p */
    public final long f8159p;

    /* renamed from: q */
    public final int f8160q;

    /* renamed from: r */
    public final Money f8161r;

    /* renamed from: s */
    public final PassType f8162s;

    /* renamed from: t */
    public final Integer f8163t;

    /* renamed from: u */
    public final long f8164u;

    /* renamed from: v */
    public final Integer f8165v;

    /* renamed from: w */
    public final String f8166w;

    /* renamed from: x */
    public final String f8167x;

    /* renamed from: y */
    public final Boolean f8168y;

    /* renamed from: z */
    public final Boolean f8169z;

    @Metadata(mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/PassDTO$PassType;", "", "(Ljava/lang/String;I)V", "CALENDAR", "TIME", "TRIP", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
    public enum PassType {
        CALENDAR,
        TIME,
        TRIP
    }

    /* renamed from: com.cubic.umo.pass.model.PassDTO$a */
    public static final class C2255a implements Parcelable.Creator<PassDTO> {
        public final Object createFromParcel(Parcel parcel) {
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Parcel parcel2 = parcel;
            C24362h.m61211f(parcel2, "parcel");
            TimeUnit valueOf = parcel.readInt() == 0 ? null : TimeUnit.valueOf(parcel.readString());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            TxDTO createFromParcel = TxDTO.CREATOR.createFromParcel(parcel2);
            String readString6 = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long valueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long valueOf5 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            long readLong = parcel.readLong();
            int readInt = parcel.readInt();
            Money createFromParcel2 = Money.CREATOR.createFromParcel(parcel2);
            PassType valueOf6 = PassType.valueOf(parcel.readString());
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            long readLong2 = parcel.readLong();
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            if (parcel.readInt() == 0) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool3 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                bool3 = Boolean.valueOf(z);
            }
            return new PassDTO(valueOf, readString, readString2, readString3, readString4, readString5, createFromParcel, readString6, valueOf2, valueOf3, valueOf4, valueOf5, z2, bool, readLong, readInt, createFromParcel2, valueOf6, valueOf7, readLong2, valueOf8, readString7, readString8, bool2, bool3);
        }

        public final Object[] newArray(int i) {
            return new PassDTO[i];
        }
    }

    public PassDTO(TimeUnit timeUnit, String str, String str2, String str3, String str4, String str5, TxDTO txDTO, String str6, Integer num, Long l, Integer num2, Long l2, boolean z, Boolean bool, long j, int i, Money money, @C12943g(name = "passTypeName") PassType passType, Integer num3, long j2, Integer num4, String str7, String str8, Boolean bool2, Boolean bool3) {
        String str9 = str4;
        String str10 = str5;
        TxDTO txDTO2 = txDTO;
        Money money2 = money;
        PassType passType2 = passType;
        String str11 = str8;
        C24362h.m61211f(str, "name");
        C24362h.m61211f(str2, TwitterUser.DESCRIPTION_KEY);
        C24362h.m61211f(str3, "shortDescription");
        C24362h.m61211f(str9, "agency");
        C24362h.m61211f(str10, "passTypeDescription");
        C24362h.m61211f(txDTO2, "passPurchaseTx");
        C24362h.m61211f(money2, "cost");
        C24362h.m61211f(passType2, "passType");
        C24362h.m61211f(str11, "passProductId");
        this.f8145b = timeUnit;
        this.f8146c = str;
        this.f8147d = str2;
        this.f8148e = str3;
        this.f8149f = str9;
        this.f8150g = str10;
        this.f8151h = txDTO2;
        this.f8152i = str6;
        this.f8153j = num;
        this.f8154k = l;
        this.f8155l = num2;
        this.f8156m = l2;
        this.f8157n = z;
        this.f8158o = bool;
        this.f8159p = j;
        this.f8160q = i;
        this.f8161r = money2;
        this.f8162s = passType2;
        this.f8163t = num3;
        this.f8164u = j2;
        this.f8165v = num4;
        this.f8166w = str7;
        this.f8167x = str11;
        this.f8168y = bool2;
        this.f8169z = bool3;
    }

    public final PassDTO copy(TimeUnit timeUnit, String str, String str2, String str3, String str4, String str5, TxDTO txDTO, String str6, Integer num, Long l, Integer num2, Long l2, boolean z, Boolean bool, long j, int i, Money money, @C12943g(name = "passTypeName") PassType passType, Integer num3, long j2, Integer num4, String str7, String str8, Boolean bool2, Boolean bool3) {
        TimeUnit timeUnit2 = timeUnit;
        C24362h.m61211f(str, "name");
        C24362h.m61211f(str2, TwitterUser.DESCRIPTION_KEY);
        C24362h.m61211f(str3, "shortDescription");
        C24362h.m61211f(str4, "agency");
        C24362h.m61211f(str5, "passTypeDescription");
        C24362h.m61211f(txDTO, "passPurchaseTx");
        C24362h.m61211f(money, "cost");
        C24362h.m61211f(passType, "passType");
        C24362h.m61211f(str8, "passProductId");
        return new PassDTO(timeUnit, str, str2, str3, str4, str5, txDTO, str6, num, l, num2, l2, z, bool, j, i, money, passType, num3, j2, num4, str7, str8, bool2, bool3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassDTO)) {
            return false;
        }
        PassDTO passDTO = (PassDTO) obj;
        return this.f8145b == passDTO.f8145b && C24362h.m61206a(this.f8146c, passDTO.f8146c) && C24362h.m61206a(this.f8147d, passDTO.f8147d) && C24362h.m61206a(this.f8148e, passDTO.f8148e) && C24362h.m61206a(this.f8149f, passDTO.f8149f) && C24362h.m61206a(this.f8150g, passDTO.f8150g) && C24362h.m61206a(this.f8151h, passDTO.f8151h) && C24362h.m61206a(this.f8152i, passDTO.f8152i) && C24362h.m61206a(this.f8153j, passDTO.f8153j) && C24362h.m61206a(this.f8154k, passDTO.f8154k) && C24362h.m61206a(this.f8155l, passDTO.f8155l) && C24362h.m61206a(this.f8156m, passDTO.f8156m) && this.f8157n == passDTO.f8157n && C24362h.m61206a(this.f8158o, passDTO.f8158o) && this.f8159p == passDTO.f8159p && this.f8160q == passDTO.f8160q && C24362h.m61206a(this.f8161r, passDTO.f8161r) && this.f8162s == passDTO.f8162s && C24362h.m61206a(this.f8163t, passDTO.f8163t) && this.f8164u == passDTO.f8164u && C24362h.m61206a(this.f8165v, passDTO.f8165v) && C24362h.m61206a(this.f8166w, passDTO.f8166w) && C24362h.m61206a(this.f8167x, passDTO.f8167x) && C24362h.m61206a(this.f8168y, passDTO.f8168y) && C24362h.m61206a(this.f8169z, passDTO.f8169z);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i11;
        int i12;
        TimeUnit timeUnit = this.f8145b;
        int i13 = 0;
        if (timeUnit == null) {
            i = 0;
        } else {
            i = timeUnit.hashCode();
        }
        int hashCode = (this.f8151h.hashCode() + C13715c.m34238d(this.f8150g, C13715c.m34238d(this.f8149f, C13715c.m34238d(this.f8148e, C13715c.m34238d(this.f8147d, C13715c.m34238d(this.f8146c, i * 31, 31), 31), 31), 31), 31)) * 31;
        String str = this.f8152i;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i14 = (hashCode + i2) * 31;
        Integer num = this.f8153j;
        if (num == null) {
            i3 = 0;
        } else {
            i3 = num.hashCode();
        }
        int i15 = (i14 + i3) * 31;
        Long l = this.f8154k;
        if (l == null) {
            i4 = 0;
        } else {
            i4 = l.hashCode();
        }
        int i16 = (i15 + i4) * 31;
        Integer num2 = this.f8155l;
        if (num2 == null) {
            i5 = 0;
        } else {
            i5 = num2.hashCode();
        }
        int i17 = (i16 + i5) * 31;
        Long l2 = this.f8156m;
        if (l2 == null) {
            i6 = 0;
        } else {
            i6 = l2.hashCode();
        }
        int i18 = (i17 + i6) * 31;
        boolean z = this.f8157n;
        if (z) {
            z = true;
        }
        int i19 = (i18 + (z ? 1 : 0)) * 31;
        Boolean bool = this.f8158o;
        if (bool == null) {
            i7 = 0;
        } else {
            i7 = bool.hashCode();
        }
        long j = this.f8159p;
        int hashCode2 = this.f8161r.hashCode();
        int hashCode3 = (this.f8162s.hashCode() + ((hashCode2 + ((((((i19 + i7) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f8160q) * 31)) * 31)) * 31;
        Integer num3 = this.f8163t;
        if (num3 == null) {
            i8 = 0;
        } else {
            i8 = num3.hashCode();
        }
        long j2 = this.f8164u;
        int i21 = (((hashCode3 + i8) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Integer num4 = this.f8165v;
        if (num4 == null) {
            i9 = 0;
        } else {
            i9 = num4.hashCode();
        }
        int i22 = (i21 + i9) * 31;
        String str2 = this.f8166w;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.hashCode();
        }
        int d = C13715c.m34238d(this.f8167x, (i22 + i11) * 31, 31);
        Boolean bool2 = this.f8168y;
        if (bool2 == null) {
            i12 = 0;
        } else {
            i12 = bool2.hashCode();
        }
        int i23 = (d + i12) * 31;
        Boolean bool3 = this.f8169z;
        if (bool3 != null) {
            i13 = bool3.hashCode();
        }
        return i23 + i13;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("PassDTO(durationUnits=");
        k.append(this.f8145b);
        k.append(", name=");
        k.append(this.f8146c);
        k.append(", description=");
        k.append(this.f8147d);
        k.append(", shortDescription=");
        k.append(this.f8148e);
        k.append(", agency=");
        k.append(this.f8149f);
        k.append(", passTypeDescription=");
        k.append(this.f8150g);
        k.append(", passPurchaseTx=");
        k.append(this.f8151h);
        k.append(", startExpDescription=");
        k.append(this.f8152i);
        k.append(", tripsLeft=");
        k.append(this.f8153j);
        k.append(", start=");
        k.append(this.f8154k);
        k.append(", duration=");
        k.append(this.f8155l);
        k.append(", expiration=");
        k.append(this.f8156m);
        k.append(", autoRenew=");
        k.append(this.f8157n);
        k.append(", renewable=");
        k.append(this.f8158o);
        k.append(", created=");
        k.append(this.f8159p);
        k.append(", price=");
        k.append(this.f8160q);
        k.append(", cost=");
        k.append(this.f8161r);
        k.append(", passType=");
        k.append(this.f8162s);
        k.append(", maxQuantity=");
        k.append(this.f8163t);
        k.append(", passId=");
        k.append(this.f8164u);
        k.append(", originalTrips=");
        k.append(this.f8165v);
        k.append(", stablePassProductId=");
        k.append(this.f8166w);
        k.append(", passProductId=");
        k.append(this.f8167x);
        k.append(", lowTrips=");
        k.append(this.f8168y);
        k.append(", passExpiring=");
        k.append(this.f8169z);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        TimeUnit timeUnit = this.f8145b;
        if (timeUnit == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(timeUnit.name());
        }
        parcel.writeString(this.f8146c);
        parcel.writeString(this.f8147d);
        parcel.writeString(this.f8148e);
        parcel.writeString(this.f8149f);
        parcel.writeString(this.f8150g);
        this.f8151h.writeToParcel(parcel, i);
        parcel.writeString(this.f8152i);
        Integer num = this.f8153j;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            C0017h.m59P(parcel, 1, num);
        }
        Long l = this.f8154k;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num2 = this.f8155l;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            C0017h.m59P(parcel, 1, num2);
        }
        Long l2 = this.f8156m;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeInt(this.f8157n ? 1 : 0);
        Boolean bool = this.f8158o;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeLong(this.f8159p);
        parcel.writeInt(this.f8160q);
        this.f8161r.writeToParcel(parcel, i);
        parcel.writeString(this.f8162s.name());
        Integer num3 = this.f8163t;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            C0017h.m59P(parcel, 1, num3);
        }
        parcel.writeLong(this.f8164u);
        Integer num4 = this.f8165v;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            C0017h.m59P(parcel, 1, num4);
        }
        parcel.writeString(this.f8166w);
        parcel.writeString(this.f8167x);
        Boolean bool2 = this.f8168y;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.f8169z;
        if (bool3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(bool3.booleanValue() ? 1 : 0);
    }
}
