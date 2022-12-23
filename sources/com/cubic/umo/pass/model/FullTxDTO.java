package com.cubic.umo.pass.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.models.outgoing.TwitterUser;
import kotlin.Metadata;
import kotlin.text.C24179b;
import mf0.C24362h;
import nb0.C12943g;
import nb0.C12944h;
import p001a0.C0016g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B·\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b*\u0010+Jú\u0002\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)¨\u0006,"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/FullTxDTO;", "", "", "txId", "when", "description", "Lcom/cubic/umo/pass/model/TransactionType;", "type", "_location", "Lcom/cubic/umo/pass/model/Money;", "balance", "fare", "adjustment", "readerName", "gps", "routeName", "routeType", "stopName", "Lcom/cubic/umo/pass/model/PassDTO;", "passUsed", "fareType", "", "transferCount", "passbackCount", "transferCredits", "Lcom/cubic/umo/pass/model/AccountStatus;", "accountStatus", "Lcom/cubic/umo/pass/model/MediaStatus;", "mediaStatus", "agencyName", "agencyPublicId", "vehicle", "comment", "fundingSourceType", "truncatedSourceId", "authorization", "salesChannel", "tvmId", "retailer", "referenceTxId", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cubic/umo/pass/model/TransactionType;Ljava/lang/String;Lcom/cubic/umo/pass/model/Money;Lcom/cubic/umo/pass/model/Money;Lcom/cubic/umo/pass/model/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cubic/umo/pass/model/PassDTO;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/cubic/umo/pass/model/AccountStatus;Lcom/cubic/umo/pass/model/MediaStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/cubic/umo/pass/model/FullTxDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cubic/umo/pass/model/TransactionType;Ljava/lang/String;Lcom/cubic/umo/pass/model/Money;Lcom/cubic/umo/pass/model/Money;Lcom/cubic/umo/pass/model/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cubic/umo/pass/model/PassDTO;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/cubic/umo/pass/model/AccountStatus;Lcom/cubic/umo/pass/model/MediaStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class FullTxDTO {

    /* renamed from: A */
    public final String f8052A;

    /* renamed from: B */
    public final String f8053B;

    /* renamed from: C */
    public final String f8054C;

    /* renamed from: D */
    public final String f8055D;

    /* renamed from: E */
    public final String f8056E;

    /* renamed from: a */
    public final String f8057a;

    /* renamed from: b */
    public final String f8058b;

    /* renamed from: c */
    public final String f8059c;

    /* renamed from: d */
    public final TransactionType f8060d;

    /* renamed from: e */
    public final String f8061e;

    /* renamed from: f */
    public final Money f8062f;

    /* renamed from: g */
    public final Money f8063g;

    /* renamed from: h */
    public final Money f8064h;

    /* renamed from: i */
    public final String f8065i;

    /* renamed from: j */
    public final String f8066j;

    /* renamed from: k */
    public final String f8067k;

    /* renamed from: l */
    public final String f8068l;

    /* renamed from: m */
    public final String f8069m;

    /* renamed from: n */
    public final PassDTO f8070n;

    /* renamed from: o */
    public final String f8071o;

    /* renamed from: p */
    public final Integer f8072p;

    /* renamed from: q */
    public final Integer f8073q;

    /* renamed from: r */
    public final Integer f8074r;

    /* renamed from: s */
    public final AccountStatus f8075s;

    /* renamed from: t */
    public final MediaStatus f8076t;

    /* renamed from: u */
    public final String f8077u;

    /* renamed from: v */
    public final String f8078v;

    /* renamed from: w */
    public final String f8079w;

    /* renamed from: x */
    public final String f8080x;

    /* renamed from: y */
    public final String f8081y;

    /* renamed from: z */
    public final String f8082z;

    public FullTxDTO(String str, String str2, String str3, TransactionType transactionType, @C12943g(name = "location") String str4, Money money, Money money2, Money money3, String str5, String str6, String str7, String str8, String str9, PassDTO passDTO, String str10, Integer num, Integer num2, Integer num3, AccountStatus accountStatus, MediaStatus mediaStatus, @C12943g(name = "agency") String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21) {
        C24362h.m61211f(str, "txId");
        C24362h.m61211f(str2, "when");
        C24362h.m61211f(str3, TwitterUser.DESCRIPTION_KEY);
        C24362h.m61211f(transactionType, "type");
        C24362h.m61211f(str4, "_location");
        this.f8057a = str;
        this.f8058b = str2;
        this.f8059c = str3;
        this.f8060d = transactionType;
        this.f8061e = str4;
        this.f8062f = money;
        this.f8063g = money2;
        this.f8064h = money3;
        this.f8065i = str5;
        this.f8066j = str6;
        this.f8067k = str7;
        this.f8068l = str8;
        this.f8069m = str9;
        this.f8070n = passDTO;
        this.f8071o = str10;
        this.f8072p = num;
        this.f8073q = num2;
        this.f8074r = num3;
        this.f8075s = accountStatus;
        this.f8076t = mediaStatus;
        this.f8077u = str11;
        this.f8078v = str12;
        this.f8079w = str13;
        this.f8080x = str14;
        this.f8081y = str15;
        this.f8082z = str16;
        this.f8052A = str17;
        this.f8053B = str18;
        this.f8054C = str19;
        this.f8055D = str20;
        this.f8056E = str21;
        try {
            Double.parseDouble(C24179b.m60583e0(str4, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR));
            Double.parseDouble(C24179b.m60579a0(str4, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, str4));
        } catch (NumberFormatException unused) {
        }
    }

    public final FullTxDTO copy(String str, String str2, String str3, TransactionType transactionType, @C12943g(name = "location") String str4, Money money, Money money2, Money money3, String str5, String str6, String str7, String str8, String str9, PassDTO passDTO, String str10, Integer num, Integer num2, Integer num3, AccountStatus accountStatus, MediaStatus mediaStatus, @C12943g(name = "agency") String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21) {
        String str22 = str;
        C24362h.m61211f(str22, "txId");
        C24362h.m61211f(str2, "when");
        C24362h.m61211f(str3, TwitterUser.DESCRIPTION_KEY);
        C24362h.m61211f(transactionType, "type");
        C24362h.m61211f(str4, "_location");
        return new FullTxDTO(str22, str2, str3, transactionType, str4, money, money2, money3, str5, str6, str7, str8, str9, passDTO, str10, num, num2, num3, accountStatus, mediaStatus, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FullTxDTO)) {
            return false;
        }
        FullTxDTO fullTxDTO = (FullTxDTO) obj;
        return C24362h.m61206a(this.f8057a, fullTxDTO.f8057a) && C24362h.m61206a(this.f8058b, fullTxDTO.f8058b) && C24362h.m61206a(this.f8059c, fullTxDTO.f8059c) && this.f8060d == fullTxDTO.f8060d && C24362h.m61206a(this.f8061e, fullTxDTO.f8061e) && C24362h.m61206a(this.f8062f, fullTxDTO.f8062f) && C24362h.m61206a(this.f8063g, fullTxDTO.f8063g) && C24362h.m61206a(this.f8064h, fullTxDTO.f8064h) && C24362h.m61206a(this.f8065i, fullTxDTO.f8065i) && C24362h.m61206a(this.f8066j, fullTxDTO.f8066j) && C24362h.m61206a(this.f8067k, fullTxDTO.f8067k) && C24362h.m61206a(this.f8068l, fullTxDTO.f8068l) && C24362h.m61206a(this.f8069m, fullTxDTO.f8069m) && C24362h.m61206a(this.f8070n, fullTxDTO.f8070n) && C24362h.m61206a(this.f8071o, fullTxDTO.f8071o) && C24362h.m61206a(this.f8072p, fullTxDTO.f8072p) && C24362h.m61206a(this.f8073q, fullTxDTO.f8073q) && C24362h.m61206a(this.f8074r, fullTxDTO.f8074r) && this.f8075s == fullTxDTO.f8075s && this.f8076t == fullTxDTO.f8076t && C24362h.m61206a(this.f8077u, fullTxDTO.f8077u) && C24362h.m61206a(this.f8078v, fullTxDTO.f8078v) && C24362h.m61206a(this.f8079w, fullTxDTO.f8079w) && C24362h.m61206a(this.f8080x, fullTxDTO.f8080x) && C24362h.m61206a(this.f8081y, fullTxDTO.f8081y) && C24362h.m61206a(this.f8082z, fullTxDTO.f8082z) && C24362h.m61206a(this.f8052A, fullTxDTO.f8052A) && C24362h.m61206a(this.f8053B, fullTxDTO.f8053B) && C24362h.m61206a(this.f8054C, fullTxDTO.f8054C) && C24362h.m61206a(this.f8055D, fullTxDTO.f8055D) && C24362h.m61206a(this.f8056E, fullTxDTO.f8056E);
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
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int d = C13715c.m34238d(this.f8059c, C13715c.m34238d(this.f8058b, this.f8057a.hashCode() * 31, 31), 31);
        int d2 = C13715c.m34238d(this.f8061e, (this.f8060d.hashCode() + d) * 31, 31);
        Money money = this.f8062f;
        int i28 = 0;
        if (money == null) {
            i = 0;
        } else {
            i = money.hashCode();
        }
        int i29 = (d2 + i) * 31;
        Money money2 = this.f8063g;
        if (money2 == null) {
            i2 = 0;
        } else {
            i2 = money2.hashCode();
        }
        int i31 = (i29 + i2) * 31;
        Money money3 = this.f8064h;
        if (money3 == null) {
            i3 = 0;
        } else {
            i3 = money3.hashCode();
        }
        int i32 = (i31 + i3) * 31;
        String str = this.f8065i;
        if (str == null) {
            i4 = 0;
        } else {
            i4 = str.hashCode();
        }
        int i33 = (i32 + i4) * 31;
        String str2 = this.f8066j;
        if (str2 == null) {
            i5 = 0;
        } else {
            i5 = str2.hashCode();
        }
        int i34 = (i33 + i5) * 31;
        String str3 = this.f8067k;
        if (str3 == null) {
            i6 = 0;
        } else {
            i6 = str3.hashCode();
        }
        int i35 = (i34 + i6) * 31;
        String str4 = this.f8068l;
        if (str4 == null) {
            i7 = 0;
        } else {
            i7 = str4.hashCode();
        }
        int i36 = (i35 + i7) * 31;
        String str5 = this.f8069m;
        if (str5 == null) {
            i8 = 0;
        } else {
            i8 = str5.hashCode();
        }
        int i37 = (i36 + i8) * 31;
        PassDTO passDTO = this.f8070n;
        if (passDTO == null) {
            i9 = 0;
        } else {
            i9 = passDTO.hashCode();
        }
        int i38 = (i37 + i9) * 31;
        String str6 = this.f8071o;
        if (str6 == null) {
            i11 = 0;
        } else {
            i11 = str6.hashCode();
        }
        int i39 = (i38 + i11) * 31;
        Integer num = this.f8072p;
        if (num == null) {
            i12 = 0;
        } else {
            i12 = num.hashCode();
        }
        int i41 = (i39 + i12) * 31;
        Integer num2 = this.f8073q;
        if (num2 == null) {
            i13 = 0;
        } else {
            i13 = num2.hashCode();
        }
        int i42 = (i41 + i13) * 31;
        Integer num3 = this.f8074r;
        if (num3 == null) {
            i14 = 0;
        } else {
            i14 = num3.hashCode();
        }
        int i43 = (i42 + i14) * 31;
        AccountStatus accountStatus = this.f8075s;
        if (accountStatus == null) {
            i15 = 0;
        } else {
            i15 = accountStatus.hashCode();
        }
        int i44 = (i43 + i15) * 31;
        MediaStatus mediaStatus = this.f8076t;
        if (mediaStatus == null) {
            i16 = 0;
        } else {
            i16 = mediaStatus.hashCode();
        }
        int i45 = (i44 + i16) * 31;
        String str7 = this.f8077u;
        if (str7 == null) {
            i17 = 0;
        } else {
            i17 = str7.hashCode();
        }
        int i46 = (i45 + i17) * 31;
        String str8 = this.f8078v;
        if (str8 == null) {
            i18 = 0;
        } else {
            i18 = str8.hashCode();
        }
        int i47 = (i46 + i18) * 31;
        String str9 = this.f8079w;
        if (str9 == null) {
            i19 = 0;
        } else {
            i19 = str9.hashCode();
        }
        int i48 = (i47 + i19) * 31;
        String str10 = this.f8080x;
        if (str10 == null) {
            i21 = 0;
        } else {
            i21 = str10.hashCode();
        }
        int i49 = (i48 + i21) * 31;
        String str11 = this.f8081y;
        if (str11 == null) {
            i22 = 0;
        } else {
            i22 = str11.hashCode();
        }
        int i51 = (i49 + i22) * 31;
        String str12 = this.f8082z;
        if (str12 == null) {
            i23 = 0;
        } else {
            i23 = str12.hashCode();
        }
        int i52 = (i51 + i23) * 31;
        String str13 = this.f8052A;
        if (str13 == null) {
            i24 = 0;
        } else {
            i24 = str13.hashCode();
        }
        int i53 = (i52 + i24) * 31;
        String str14 = this.f8053B;
        if (str14 == null) {
            i25 = 0;
        } else {
            i25 = str14.hashCode();
        }
        int i54 = (i53 + i25) * 31;
        String str15 = this.f8054C;
        if (str15 == null) {
            i26 = 0;
        } else {
            i26 = str15.hashCode();
        }
        int i55 = (i54 + i26) * 31;
        String str16 = this.f8055D;
        if (str16 == null) {
            i27 = 0;
        } else {
            i27 = str16.hashCode();
        }
        int i56 = (i55 + i27) * 31;
        String str17 = this.f8056E;
        if (str17 != null) {
            i28 = str17.hashCode();
        }
        return i56 + i28;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("FullTxDTO(txId=");
        k.append(this.f8057a);
        k.append(", when=");
        k.append(this.f8058b);
        k.append(", description=");
        k.append(this.f8059c);
        k.append(", type=");
        k.append(this.f8060d);
        k.append(", _location=");
        k.append(this.f8061e);
        k.append(", balance=");
        k.append(this.f8062f);
        k.append(", fare=");
        k.append(this.f8063g);
        k.append(", adjustment=");
        k.append(this.f8064h);
        k.append(", readerName=");
        k.append(this.f8065i);
        k.append(", gps=");
        k.append(this.f8066j);
        k.append(", routeName=");
        k.append(this.f8067k);
        k.append(", routeType=");
        k.append(this.f8068l);
        k.append(", stopName=");
        k.append(this.f8069m);
        k.append(", passUsed=");
        k.append(this.f8070n);
        k.append(", fareType=");
        k.append(this.f8071o);
        k.append(", transferCount=");
        k.append(this.f8072p);
        k.append(", passbackCount=");
        k.append(this.f8073q);
        k.append(", transferCredits=");
        k.append(this.f8074r);
        k.append(", accountStatus=");
        k.append(this.f8075s);
        k.append(", mediaStatus=");
        k.append(this.f8076t);
        k.append(", agencyName=");
        k.append(this.f8077u);
        k.append(", agencyPublicId=");
        k.append(this.f8078v);
        k.append(", vehicle=");
        k.append(this.f8079w);
        k.append(", comment=");
        k.append(this.f8080x);
        k.append(", fundingSourceType=");
        k.append(this.f8081y);
        k.append(", truncatedSourceId=");
        k.append(this.f8082z);
        k.append(", authorization=");
        k.append(this.f8052A);
        k.append(", salesChannel=");
        k.append(this.f8053B);
        k.append(", tvmId=");
        k.append(this.f8054C);
        k.append(", retailer=");
        k.append(this.f8055D);
        k.append(", referenceTxId=");
        return C0016g.m30n(k, this.f8056E, ')');
    }
}
