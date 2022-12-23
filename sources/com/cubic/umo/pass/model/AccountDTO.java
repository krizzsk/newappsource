package com.cubic.umo.pass.model;

import com.appboy.support.ValidationUtils;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/AccountDTO;", "", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class AccountDTO {

    /* renamed from: A */
    public final String f7863A;

    /* renamed from: B */
    public final Boolean f7864B;

    /* renamed from: C */
    public final Integer f7865C;

    /* renamed from: D */
    public final String f7866D;

    /* renamed from: E */
    public final CappingState f7867E;

    /* renamed from: F */
    public final CappingInfo f7868F;

    /* renamed from: a */
    public final String f7869a;

    /* renamed from: b */
    public final String f7870b;

    /* renamed from: c */
    public final String f7871c;

    /* renamed from: d */
    public final int f7872d;

    /* renamed from: e */
    public final Money f7873e;

    /* renamed from: f */
    public final Long f7874f;

    /* renamed from: g */
    public final String f7875g;

    /* renamed from: h */
    public final String f7876h;

    /* renamed from: i */
    public final String f7877i;

    /* renamed from: j */
    public final int f7878j;

    /* renamed from: k */
    public final long f7879k;

    /* renamed from: l */
    public final String f7880l;

    /* renamed from: m */
    public final List<PassDTO> f7881m;

    /* renamed from: n */
    public final List<TxDTO> f7882n;

    /* renamed from: o */
    public final int f7883o;

    /* renamed from: p */
    public final long f7884p;

    /* renamed from: q */
    public final String f7885q;

    /* renamed from: r */
    public final String f7886r;

    /* renamed from: s */
    public final Boolean f7887s;

    /* renamed from: t */
    public final Integer f7888t;

    /* renamed from: u */
    public final Money f7889u;

    /* renamed from: v */
    public final String f7890v;

    /* renamed from: w */
    public final String f7891w;

    /* renamed from: x */
    public final String f7892x;

    /* renamed from: y */
    public final String f7893y;

    /* renamed from: z */
    public final String f7894z;

    public AccountDTO(String str, String str2, String str3, int i, Money money, Long l, String str4, String str5, String str6, int i2, long j, String str7, List<PassDTO> list, List<TxDTO> list2, int i3, long j2, String str8, String str9, Boolean bool, Integer num, Money money2, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool2, Integer num2, String str16, CappingState cappingState, CappingInfo cappingInfo) {
        String str17 = str7;
        this.f7869a = str;
        this.f7870b = str2;
        this.f7871c = str3;
        this.f7872d = i;
        this.f7873e = money;
        this.f7874f = l;
        this.f7875g = str4;
        this.f7876h = str5;
        this.f7877i = str6;
        this.f7878j = i2;
        this.f7879k = j;
        this.f7880l = str17;
        this.f7881m = list;
        this.f7882n = list2;
        this.f7883o = i3;
        this.f7884p = j2;
        this.f7885q = str8;
        this.f7886r = str9;
        this.f7887s = bool;
        this.f7888t = num;
        this.f7889u = money2;
        this.f7890v = str10;
        this.f7891w = str11;
        this.f7892x = str12;
        this.f7893y = str13;
        this.f7894z = str14;
        this.f7863A = str15;
        this.f7864B = bool2;
        this.f7865C = num2;
        this.f7866D = str16;
        this.f7867E = cappingState;
        this.f7868F = cappingInfo;
        if (str17 != null) {
            char[] charArray = str7.toCharArray();
            C24362h.m61210e(charArray, "this as java.lang.String).toCharArray()");
            int length = charArray.length;
            byte[] bArr = new byte[(length >> 1)];
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                char c = charArray[i4];
                int digit = Character.digit(c, 16);
                if (digit >= 0) {
                    int i6 = digit << 4;
                    int i7 = i4 + 1;
                    if (i7 < length) {
                        char c2 = charArray[i7];
                        int digit2 = Character.digit(c2, 16);
                        if (digit2 >= 0) {
                            i4 = i7 + 1;
                            bArr[i5] = (byte) ((i6 | digit2) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
                            i5++;
                        } else {
                            throw new NumberFormatException(C24362h.m61216k(Character.valueOf(c2), "Not a hex digit: "));
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new NumberFormatException(C24362h.m61216k(Character.valueOf(c), "Not a hex digit: "));
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountDTO)) {
            return false;
        }
        AccountDTO accountDTO = (AccountDTO) obj;
        return C24362h.m61206a(this.f7869a, accountDTO.f7869a) && C24362h.m61206a(this.f7870b, accountDTO.f7870b) && C24362h.m61206a(this.f7871c, accountDTO.f7871c) && this.f7872d == accountDTO.f7872d && C24362h.m61206a(this.f7873e, accountDTO.f7873e) && C24362h.m61206a(this.f7874f, accountDTO.f7874f) && C24362h.m61206a(this.f7875g, accountDTO.f7875g) && C24362h.m61206a(this.f7876h, accountDTO.f7876h) && C24362h.m61206a(this.f7877i, accountDTO.f7877i) && this.f7878j == accountDTO.f7878j && this.f7879k == accountDTO.f7879k && C24362h.m61206a(this.f7880l, accountDTO.f7880l) && C24362h.m61206a(this.f7881m, accountDTO.f7881m) && C24362h.m61206a(this.f7882n, accountDTO.f7882n) && this.f7883o == accountDTO.f7883o && this.f7884p == accountDTO.f7884p && C24362h.m61206a(this.f7885q, accountDTO.f7885q) && C24362h.m61206a(this.f7886r, accountDTO.f7886r) && C24362h.m61206a(this.f7887s, accountDTO.f7887s) && C24362h.m61206a(this.f7888t, accountDTO.f7888t) && C24362h.m61206a(this.f7889u, accountDTO.f7889u) && C24362h.m61206a(this.f7890v, accountDTO.f7890v) && C24362h.m61206a(this.f7891w, accountDTO.f7891w) && C24362h.m61206a(this.f7892x, accountDTO.f7892x) && C24362h.m61206a(this.f7893y, accountDTO.f7893y) && C24362h.m61206a(this.f7894z, accountDTO.f7894z) && C24362h.m61206a(this.f7863A, accountDTO.f7863A) && C24362h.m61206a(this.f7864B, accountDTO.f7864B) && C24362h.m61206a(this.f7865C, accountDTO.f7865C) && C24362h.m61206a(this.f7866D, accountDTO.f7866D) && C24362h.m61206a(this.f7867E, accountDTO.f7867E) && C24362h.m61206a(this.f7868F, accountDTO.f7868F);
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
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int d = (C13715c.m34238d(this.f7871c, C13715c.m34238d(this.f7870b, this.f7869a.hashCode() * 31, 31), 31) + this.f7872d) * 31;
        Money money = this.f7873e;
        int i21 = 0;
        if (money == null) {
            i = 0;
        } else {
            i = money.hashCode();
        }
        int i22 = (d + i) * 31;
        Long l = this.f7874f;
        if (l == null) {
            i2 = 0;
        } else {
            i2 = l.hashCode();
        }
        int d2 = C13715c.m34238d(this.f7876h, C13715c.m34238d(this.f7875g, (i22 + i2) * 31, 31), 31);
        long j = this.f7879k;
        int d3 = (((C13715c.m34238d(this.f7877i, d2, 31) + this.f7878j) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.f7880l;
        if (str == null) {
            i3 = 0;
        } else {
            i3 = str.hashCode();
        }
        int hashCode = this.f7881m.hashCode();
        int hashCode2 = this.f7882n.hashCode();
        long j2 = this.f7884p;
        int i23 = (((((hashCode2 + ((hashCode + ((d3 + i3) * 31)) * 31)) * 31) + this.f7883o) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.f7885q;
        if (str2 == null) {
            i4 = 0;
        } else {
            i4 = str2.hashCode();
        }
        int i24 = (i23 + i4) * 31;
        String str3 = this.f7886r;
        if (str3 == null) {
            i5 = 0;
        } else {
            i5 = str3.hashCode();
        }
        int i25 = (i24 + i5) * 31;
        Boolean bool = this.f7887s;
        if (bool == null) {
            i6 = 0;
        } else {
            i6 = bool.hashCode();
        }
        int i26 = (i25 + i6) * 31;
        Integer num = this.f7888t;
        if (num == null) {
            i7 = 0;
        } else {
            i7 = num.hashCode();
        }
        int i27 = (i26 + i7) * 31;
        Money money2 = this.f7889u;
        if (money2 == null) {
            i8 = 0;
        } else {
            i8 = money2.hashCode();
        }
        int i28 = (i27 + i8) * 31;
        String str4 = this.f7890v;
        if (str4 == null) {
            i9 = 0;
        } else {
            i9 = str4.hashCode();
        }
        int i29 = (i28 + i9) * 31;
        String str5 = this.f7891w;
        if (str5 == null) {
            i11 = 0;
        } else {
            i11 = str5.hashCode();
        }
        int i31 = (i29 + i11) * 31;
        String str6 = this.f7892x;
        if (str6 == null) {
            i12 = 0;
        } else {
            i12 = str6.hashCode();
        }
        int i32 = (i31 + i12) * 31;
        String str7 = this.f7893y;
        if (str7 == null) {
            i13 = 0;
        } else {
            i13 = str7.hashCode();
        }
        int i33 = (i32 + i13) * 31;
        String str8 = this.f7894z;
        if (str8 == null) {
            i14 = 0;
        } else {
            i14 = str8.hashCode();
        }
        int i34 = (i33 + i14) * 31;
        String str9 = this.f7863A;
        if (str9 == null) {
            i15 = 0;
        } else {
            i15 = str9.hashCode();
        }
        int i35 = (i34 + i15) * 31;
        Boolean bool2 = this.f7864B;
        if (bool2 == null) {
            i16 = 0;
        } else {
            i16 = bool2.hashCode();
        }
        int i36 = (i35 + i16) * 31;
        Integer num2 = this.f7865C;
        if (num2 == null) {
            i17 = 0;
        } else {
            i17 = num2.hashCode();
        }
        int i37 = (i36 + i17) * 31;
        String str10 = this.f7866D;
        if (str10 == null) {
            i18 = 0;
        } else {
            i18 = str10.hashCode();
        }
        int i38 = (i37 + i18) * 31;
        CappingState cappingState = this.f7867E;
        if (cappingState == null) {
            i19 = 0;
        } else {
            i19 = cappingState.hashCode();
        }
        int i39 = (i38 + i19) * 31;
        CappingInfo cappingInfo = this.f7868F;
        if (cappingInfo != null) {
            i21 = cappingInfo.hashCode();
        }
        return i39 + i21;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("AccountDTO(agencyShortName=");
        k.append(this.f7869a);
        k.append(", agencyName=");
        k.append(this.f7870b);
        k.append(", agencyPublicId=");
        k.append(this.f7871c);
        k.append(", balance=");
        k.append(this.f7872d);
        k.append(", balanceMoney=");
        k.append(this.f7873e);
        k.append(", mediaId=");
        k.append(this.f7874f);
        k.append(", cardNumber=");
        k.append(this.f7875g);
        k.append(", mediaStatus=");
        k.append(this.f7876h);
        k.append(", accountStatus=");
        k.append(this.f7877i);
        k.append(", fareCode=");
        k.append(this.f7878j);
        k.append(", expires=");
        k.append(this.f7879k);
        k.append(", key=");
        k.append(this.f7880l);
        k.append(", passes=");
        k.append(this.f7881m);
        k.append(", txHistory=");
        k.append(this.f7882n);
        k.append(", transferMinutesRemaining=");
        k.append(this.f7883o);
        k.append(", transferTimeEnd=");
        k.append(this.f7884p);
        k.append(", textAlert=");
        k.append(this.f7885q);
        k.append(", homeAgencyId=");
        k.append(this.f7886r);
        k.append(", autoloadEnabled=");
        k.append(this.f7887s);
        k.append(", autoloadAmount=");
        k.append(this.f7888t);
        k.append(", autoloadAmountMoney=");
        k.append(this.f7889u);
        k.append(", accountType=");
        k.append(this.f7890v);
        k.append(", created=");
        k.append(this.f7891w);
        k.append(", fareType=");
        k.append(this.f7892x);
        k.append(", fareCodeString=");
        k.append(this.f7893y);
        k.append(", mediaStatusString=");
        k.append(this.f7894z);
        k.append(", accountStatusString=");
        k.append(this.f7863A);
        k.append(", lowBalance=");
        k.append(this.f7864B);
        k.append(", fareCapTimeRemaining=");
        k.append(this.f7865C);
        k.append(", fareCapTimeEnd=");
        k.append(this.f7866D);
        k.append(", cappingState=");
        k.append(this.f7867E);
        k.append(", cappingInformation=");
        k.append(this.f7868F);
        k.append(')');
        return k.toString();
    }
}
