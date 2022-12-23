package com.cubic.umo.pass.model;

import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12943g;
import nb0.C12944h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0001\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0017\u0010\u0018J°\u0001\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/VisualValidationResponse;", "", "", "eventId", "transactionType", "", "lowBalanceWarning", "doubleDenied", "languageCode", "transactionId", "Lcom/cubic/umo/pass/model/PassDTO;", "passUsed", "", "transferCredits", "specialFaresUsed", "numberOfTripsLeft", "transferTimeRemaining", "passExpireMinutes", "Lcom/cubic/umo/pass/model/Money;", "fare", "balance", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Lcom/cubic/umo/pass/model/PassDTO;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/cubic/umo/pass/model/Money;Lcom/cubic/umo/pass/model/Money;)Lcom/cubic/umo/pass/model/VisualValidationResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Lcom/cubic/umo/pass/model/PassDTO;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/cubic/umo/pass/model/Money;Lcom/cubic/umo/pass/model/Money;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class VisualValidationResponse {

    /* renamed from: a */
    public final String f8304a;

    /* renamed from: b */
    public final String f8305b;

    /* renamed from: c */
    public final boolean f8306c;

    /* renamed from: d */
    public final boolean f8307d;

    /* renamed from: e */
    public final String f8308e;

    /* renamed from: f */
    public final String f8309f;

    /* renamed from: g */
    public final PassDTO f8310g;

    /* renamed from: h */
    public final Integer f8311h;

    /* renamed from: i */
    public final Boolean f8312i;

    /* renamed from: j */
    public final Integer f8313j;

    /* renamed from: k */
    public final Integer f8314k;

    /* renamed from: l */
    public final Integer f8315l;

    /* renamed from: m */
    public final Money f8316m;

    /* renamed from: n */
    public final Money f8317n;

    public VisualValidationResponse(String str, String str2, boolean z, boolean z2, String str3, @C12943g(name = "txId") String str4, PassDTO passDTO, Integer num, Boolean bool, Integer num2, Integer num3, Integer num4, Money money, Money money2) {
        C24362h.m61211f(str2, "transactionType");
        C24362h.m61211f(str3, "languageCode");
        this.f8304a = str;
        this.f8305b = str2;
        this.f8306c = z;
        this.f8307d = z2;
        this.f8308e = str3;
        this.f8309f = str4;
        this.f8310g = passDTO;
        this.f8311h = num;
        this.f8312i = bool;
        this.f8313j = num2;
        this.f8314k = num3;
        this.f8315l = num4;
        this.f8316m = money;
        this.f8317n = money2;
    }

    public final VisualValidationResponse copy(String str, String str2, boolean z, boolean z2, String str3, @C12943g(name = "txId") String str4, PassDTO passDTO, Integer num, Boolean bool, Integer num2, Integer num3, Integer num4, Money money, Money money2) {
        String str5 = str2;
        C24362h.m61211f(str5, "transactionType");
        String str6 = str3;
        C24362h.m61211f(str6, "languageCode");
        return new VisualValidationResponse(str, str5, z, z2, str6, str4, passDTO, num, bool, num2, num3, num4, money, money2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisualValidationResponse)) {
            return false;
        }
        VisualValidationResponse visualValidationResponse = (VisualValidationResponse) obj;
        return C24362h.m61206a(this.f8304a, visualValidationResponse.f8304a) && C24362h.m61206a(this.f8305b, visualValidationResponse.f8305b) && this.f8306c == visualValidationResponse.f8306c && this.f8307d == visualValidationResponse.f8307d && C24362h.m61206a(this.f8308e, visualValidationResponse.f8308e) && C24362h.m61206a(this.f8309f, visualValidationResponse.f8309f) && C24362h.m61206a(this.f8310g, visualValidationResponse.f8310g) && C24362h.m61206a(this.f8311h, visualValidationResponse.f8311h) && C24362h.m61206a(this.f8312i, visualValidationResponse.f8312i) && C24362h.m61206a(this.f8313j, visualValidationResponse.f8313j) && C24362h.m61206a(this.f8314k, visualValidationResponse.f8314k) && C24362h.m61206a(this.f8315l, visualValidationResponse.f8315l) && C24362h.m61206a(this.f8316m, visualValidationResponse.f8316m) && C24362h.m61206a(this.f8317n, visualValidationResponse.f8317n);
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
        String str = this.f8304a;
        int i11 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int d = C13715c.m34238d(this.f8305b, i * 31, 31);
        boolean z = this.f8306c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i12 = (d + (z ? 1 : 0)) * 31;
        boolean z3 = this.f8307d;
        if (!z3) {
            z2 = z3;
        }
        int d2 = C13715c.m34238d(this.f8308e, (i12 + (z2 ? 1 : 0)) * 31, 31);
        String str2 = this.f8309f;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i13 = (d2 + i2) * 31;
        PassDTO passDTO = this.f8310g;
        if (passDTO == null) {
            i3 = 0;
        } else {
            i3 = passDTO.hashCode();
        }
        int i14 = (i13 + i3) * 31;
        Integer num = this.f8311h;
        if (num == null) {
            i4 = 0;
        } else {
            i4 = num.hashCode();
        }
        int i15 = (i14 + i4) * 31;
        Boolean bool = this.f8312i;
        if (bool == null) {
            i5 = 0;
        } else {
            i5 = bool.hashCode();
        }
        int i16 = (i15 + i5) * 31;
        Integer num2 = this.f8313j;
        if (num2 == null) {
            i6 = 0;
        } else {
            i6 = num2.hashCode();
        }
        int i17 = (i16 + i6) * 31;
        Integer num3 = this.f8314k;
        if (num3 == null) {
            i7 = 0;
        } else {
            i7 = num3.hashCode();
        }
        int i18 = (i17 + i7) * 31;
        Integer num4 = this.f8315l;
        if (num4 == null) {
            i8 = 0;
        } else {
            i8 = num4.hashCode();
        }
        int i19 = (i18 + i8) * 31;
        Money money = this.f8316m;
        if (money == null) {
            i9 = 0;
        } else {
            i9 = money.hashCode();
        }
        int i21 = (i19 + i9) * 31;
        Money money2 = this.f8317n;
        if (money2 != null) {
            i11 = money2.hashCode();
        }
        return i21 + i11;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("VisualValidationResponse(eventId=");
        k.append(this.f8304a);
        k.append(", transactionType=");
        k.append(this.f8305b);
        k.append(", lowBalanceWarning=");
        k.append(this.f8306c);
        k.append(", doubleDenied=");
        k.append(this.f8307d);
        k.append(", languageCode=");
        k.append(this.f8308e);
        k.append(", transactionId=");
        k.append(this.f8309f);
        k.append(", passUsed=");
        k.append(this.f8310g);
        k.append(", transferCredits=");
        k.append(this.f8311h);
        k.append(", specialFaresUsed=");
        k.append(this.f8312i);
        k.append(", numberOfTripsLeft=");
        k.append(this.f8313j);
        k.append(", transferTimeRemaining=");
        k.append(this.f8314k);
        k.append(", passExpireMinutes=");
        k.append(this.f8315l);
        k.append(", fare=");
        k.append(this.f8316m);
        k.append(", balance=");
        k.append(this.f8317n);
        k.append(')');
        return k.toString();
    }
}
