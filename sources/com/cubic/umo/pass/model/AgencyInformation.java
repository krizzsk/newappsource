package com.cubic.umo.pass.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.ServerParameters;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12943g;
import nb0.C12944h;
import p001a0.C0017h;
import p209p7.C6098a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001BÉ\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001c\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010)\u001a\u0004\u0018\u00010\f\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010+\u001a\u0004\u0018\u00010\f\u0012\b\u0010,\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u00010-\u0012\b\u00100\u001a\u0004\u0018\u00010\f\u0012\b\u00101\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u000102\u0012\b\u00104\u001a\u0004\u0018\u00010\u0016\u0012\b\u00105\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b8\u00109J¢\u0004\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001c2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0003\u0010/\u001a\u0004\u0018\u00010-2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u00103\u001a\u0004\u0018\u0001022\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00105\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b6\u00107¨\u0006:"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/AgencyInformation;", "Landroid/os/Parcelable;", "", "name", "shortName", "serviceName", "region", "poolId", "state", "city", "country", "publicId", "", "id", "", "media", "colors", "minPurchaseAmount", "Lcom/cubic/umo/pass/model/Money;", "minPurchaseAmountMoney", "maxPurchaseAmount", "maxPurchaseAmountMoney", "", "allowStoredValue", "storedValueTransactionMin", "storedValueTransactionMinMoney", "storedValueTransactionMax", "storedValueTransactionMaxMoney", "", "storedValueButtonValues", "storedValueButtonMoneys", "Lcom/cubic/umo/pass/model/MobilePages;", "mobilePages", "mobileLogoTargetUrl", "amexAccepted", "mcAccepted", "visaAccepted", "discAccepted", "jcbAccepted", "googlePayAccepted", "storedValuePayAccepted", "minimumAutoloadAmount", "minimumAutoloadAmountMoney", "minimumTripAutoload", "minimumHoursAutoload", "", "longitude", "latitude", "lowBalanceLevel", "lowBalanceLevelMoney", "Lcom/cubic/umo/pass/model/LanguageSettings;", "languageSettings", "scanRideSupported", "maxConsecutiveOfflineScanRides", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/util/Map;Ljava/lang/Integer;Lcom/cubic/umo/pass/model/Money;Ljava/lang/Integer;Lcom/cubic/umo/pass/model/Money;ZLjava/lang/Integer;Lcom/cubic/umo/pass/model/Money;Ljava/lang/Integer;Lcom/cubic/umo/pass/model/Money;Ljava/util/List;Ljava/util/List;Lcom/cubic/umo/pass/model/MobilePages;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/cubic/umo/pass/model/Money;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Lcom/cubic/umo/pass/model/Money;Lcom/cubic/umo/pass/model/LanguageSettings;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/cubic/umo/pass/model/AgencyInformation;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/util/Map;Ljava/lang/Integer;Lcom/cubic/umo/pass/model/Money;Ljava/lang/Integer;Lcom/cubic/umo/pass/model/Money;ZLjava/lang/Integer;Lcom/cubic/umo/pass/model/Money;Ljava/lang/Integer;Lcom/cubic/umo/pass/model/Money;Ljava/util/List;Ljava/util/List;Lcom/cubic/umo/pass/model/MobilePages;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/cubic/umo/pass/model/Money;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Lcom/cubic/umo/pass/model/Money;Lcom/cubic/umo/pass/model/LanguageSettings;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class AgencyInformation implements Parcelable {
    public static final Parcelable.Creator<AgencyInformation> CREATOR = new C2248a();

    /* renamed from: A */
    public final Boolean f7920A;

    /* renamed from: B */
    public final Boolean f7921B;

    /* renamed from: C */
    public final Boolean f7922C;

    /* renamed from: D */
    public final Boolean f7923D;

    /* renamed from: E */
    public final Boolean f7924E;

    /* renamed from: F */
    public final Boolean f7925F;

    /* renamed from: G */
    public final Boolean f7926G;

    /* renamed from: H */
    public final Integer f7927H;

    /* renamed from: I */
    public final Money f7928I;

    /* renamed from: J */
    public final Integer f7929J;

    /* renamed from: K */
    public final Integer f7930K;

    /* renamed from: L */
    public final Double f7931L;

    /* renamed from: M */
    public final Double f7932M;

    /* renamed from: N */
    public final Integer f7933N;

    /* renamed from: O */
    public final Money f7934O;

    /* renamed from: P */
    public final LanguageSettings f7935P;

    /* renamed from: Q */
    public final Boolean f7936Q;

    /* renamed from: R */
    public final Integer f7937R;

    /* renamed from: b */
    public final String f7938b;

    /* renamed from: c */
    public final String f7939c;

    /* renamed from: d */
    public final String f7940d;

    /* renamed from: e */
    public final String f7941e;

    /* renamed from: f */
    public final String f7942f;

    /* renamed from: g */
    public final String f7943g;

    /* renamed from: h */
    public final String f7944h;

    /* renamed from: i */
    public final String f7945i;

    /* renamed from: j */
    public final String f7946j;

    /* renamed from: k */
    public final int f7947k;

    /* renamed from: l */
    public final Map<String, String> f7948l;

    /* renamed from: m */
    public final Map<String, String> f7949m;

    /* renamed from: n */
    public final Integer f7950n;

    /* renamed from: o */
    public final Money f7951o;

    /* renamed from: p */
    public final Integer f7952p;

    /* renamed from: q */
    public final Money f7953q;

    /* renamed from: r */
    public final boolean f7954r;

    /* renamed from: s */
    public final Integer f7955s;

    /* renamed from: t */
    public final Money f7956t;

    /* renamed from: u */
    public final Integer f7957u;

    /* renamed from: v */
    public final Money f7958v;

    /* renamed from: w */
    public final List<String> f7959w;

    /* renamed from: x */
    public final List<Money> f7960x;

    /* renamed from: y */
    public final MobilePages f7961y;

    /* renamed from: z */
    public final String f7962z;

    /* renamed from: com.cubic.umo.pass.model.AgencyInformation$a */
    public static final class C2248a implements Parcelable.Creator<AgencyInformation> {
        public final Object createFromParcel(Parcel parcel) {
            Integer num;
            Money money;
            ArrayList arrayList;
            Boolean bool;
            Boolean bool2;
            Boolean bool3;
            Boolean bool4;
            Boolean bool5;
            Boolean bool6;
            Boolean bool7;
            Boolean bool8;
            Parcel parcel2 = parcel;
            C24362h.m61211f(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
            for (int i = 0; i != readInt2; i++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            int readInt3 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt3);
            int i2 = 0;
            while (i2 != readInt3) {
                linkedHashMap2.put(parcel.readString(), parcel.readString());
                i2++;
                readInt3 = readInt3;
            }
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Money createFromParcel = parcel.readInt() == 0 ? null : Money.CREATOR.createFromParcel(parcel2);
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Money createFromParcel2 = parcel.readInt() == 0 ? null : Money.CREATOR.createFromParcel(parcel2);
            boolean z = parcel.readInt() != 0;
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Money createFromParcel3 = parcel.readInt() == 0 ? null : Money.CREATOR.createFromParcel(parcel2);
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Money createFromParcel4 = parcel.readInt() == 0 ? null : Money.CREATOR.createFromParcel(parcel2);
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                money = createFromParcel;
                num = valueOf;
                arrayList = null;
            } else {
                int readInt4 = parcel.readInt();
                money = createFromParcel;
                arrayList = new ArrayList(readInt4);
                num = valueOf;
                int i3 = 0;
                while (i3 != readInt4) {
                    arrayList.add(Money.CREATOR.createFromParcel(parcel2));
                    i3++;
                    readInt4 = readInt4;
                }
            }
            MobilePages createFromParcel5 = parcel.readInt() == 0 ? null : MobilePages.CREATOR.createFromParcel(parcel2);
            String readString10 = parcel.readString();
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool3 = null;
            } else {
                bool3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool4 = null;
            } else {
                bool4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool5 = null;
            } else {
                bool5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool6 = null;
            } else {
                bool6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool7 = null;
            } else {
                bool7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Money createFromParcel6 = parcel.readInt() == 0 ? null : Money.CREATOR.createFromParcel(parcel2);
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Double valueOf8 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double valueOf9 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Integer valueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Money createFromParcel7 = parcel.readInt() == 0 ? null : Money.CREATOR.createFromParcel(parcel2);
            LanguageSettings createFromParcel8 = parcel.readInt() == 0 ? null : LanguageSettings.CREATOR.createFromParcel(parcel2);
            if (parcel.readInt() == 0) {
                bool8 = null;
            } else {
                bool8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AgencyInformation(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readInt, linkedHashMap, linkedHashMap2, num, money, valueOf2, createFromParcel2, z, valueOf3, createFromParcel3, valueOf4, createFromParcel4, createStringArrayList, arrayList, createFromParcel5, readString10, bool, bool2, bool3, bool4, bool5, bool6, bool7, valueOf5, createFromParcel6, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, createFromParcel7, createFromParcel8, bool8, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        public final Object[] newArray(int i) {
            return new AgencyInformation[i];
        }
    }

    public AgencyInformation(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Map<String, String> map, Map<String, String> map2, Integer num, Money money, Integer num2, Money money2, boolean z, Integer num3, Money money3, Integer num4, Money money4, List<String> list, List<Money> list2, MobilePages mobilePages, String str10, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Integer num5, Money money5, Integer num6, Integer num7, @C12943g(name = "centerLongitude") Double d, @C12943g(name = "centerLatitude") Double d2, Integer num8, Money money6, @C12943g(name = "i18n") LanguageSettings languageSettings, Boolean bool8, Integer num9) {
        String str11 = str5;
        String str12 = str6;
        String str13 = str7;
        String str14 = str8;
        String str15 = str9;
        Map<String, String> map3 = map;
        Map<String, String> map4 = map2;
        C24362h.m61211f(str, "name");
        C24362h.m61211f(str2, "shortName");
        C24362h.m61211f(str11, "poolId");
        C24362h.m61211f(str12, "state");
        C24362h.m61211f(str13, "city");
        C24362h.m61211f(str14, ServerParameters.COUNTRY);
        C24362h.m61211f(str15, "publicId");
        C24362h.m61211f(map3, "media");
        C24362h.m61211f(map4, "colors");
        this.f7938b = str;
        this.f7939c = str2;
        this.f7940d = str3;
        this.f7941e = str4;
        this.f7942f = str11;
        this.f7943g = str12;
        this.f7944h = str13;
        this.f7945i = str14;
        this.f7946j = str15;
        this.f7947k = i;
        this.f7948l = map3;
        this.f7949m = map4;
        this.f7950n = num;
        this.f7951o = money;
        this.f7952p = num2;
        this.f7953q = money2;
        this.f7954r = z;
        this.f7955s = num3;
        this.f7956t = money3;
        this.f7957u = num4;
        this.f7958v = money4;
        this.f7959w = list;
        this.f7960x = list2;
        this.f7961y = mobilePages;
        this.f7962z = str10;
        this.f7920A = bool;
        this.f7921B = bool2;
        this.f7922C = bool3;
        this.f7923D = bool4;
        this.f7924E = bool5;
        this.f7925F = bool6;
        this.f7926G = bool7;
        this.f7927H = num5;
        this.f7928I = money5;
        this.f7929J = num6;
        this.f7930K = num7;
        this.f7931L = d;
        this.f7932M = d2;
        this.f7933N = num8;
        this.f7934O = money6;
        this.f7935P = languageSettings;
        this.f7936Q = bool8;
        this.f7937R = num9;
        String str16 = map3.get("image.mobile.logo");
        if (str16 != null) {
            if (C6098a.f19362c != null) {
                C24362h.m61216k(str16, (String) C6098a.C6099a.m14634a().f19363a.f5107d);
            }
        }
    }

    public final AgencyInformation copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Map<String, String> map, Map<String, String> map2, Integer num, Money money, Integer num2, Money money2, boolean z, Integer num3, Money money3, Integer num4, Money money4, List<String> list, List<Money> list2, MobilePages mobilePages, String str10, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Integer num5, Money money5, Integer num6, Integer num7, @C12943g(name = "centerLongitude") Double d, @C12943g(name = "centerLatitude") Double d2, Integer num8, Money money6, @C12943g(name = "i18n") LanguageSettings languageSettings, Boolean bool8, Integer num9) {
        String str11 = str;
        C24362h.m61211f(str11, "name");
        C24362h.m61211f(str2, "shortName");
        C24362h.m61211f(str5, "poolId");
        C24362h.m61211f(str6, "state");
        C24362h.m61211f(str7, "city");
        C24362h.m61211f(str8, ServerParameters.COUNTRY);
        C24362h.m61211f(str9, "publicId");
        C24362h.m61211f(map, "media");
        C24362h.m61211f(map2, "colors");
        return new AgencyInformation(str11, str2, str3, str4, str5, str6, str7, str8, str9, i, map, map2, num, money, num2, money2, z, num3, money3, num4, money4, list, list2, mobilePages, str10, bool, bool2, bool3, bool4, bool5, bool6, bool7, num5, money5, num6, num7, d, d2, num8, money6, languageSettings, bool8, num9);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgencyInformation)) {
            return false;
        }
        AgencyInformation agencyInformation = (AgencyInformation) obj;
        return C24362h.m61206a(this.f7938b, agencyInformation.f7938b) && C24362h.m61206a(this.f7939c, agencyInformation.f7939c) && C24362h.m61206a(this.f7940d, agencyInformation.f7940d) && C24362h.m61206a(this.f7941e, agencyInformation.f7941e) && C24362h.m61206a(this.f7942f, agencyInformation.f7942f) && C24362h.m61206a(this.f7943g, agencyInformation.f7943g) && C24362h.m61206a(this.f7944h, agencyInformation.f7944h) && C24362h.m61206a(this.f7945i, agencyInformation.f7945i) && C24362h.m61206a(this.f7946j, agencyInformation.f7946j) && this.f7947k == agencyInformation.f7947k && C24362h.m61206a(this.f7948l, agencyInformation.f7948l) && C24362h.m61206a(this.f7949m, agencyInformation.f7949m) && C24362h.m61206a(this.f7950n, agencyInformation.f7950n) && C24362h.m61206a(this.f7951o, agencyInformation.f7951o) && C24362h.m61206a(this.f7952p, agencyInformation.f7952p) && C24362h.m61206a(this.f7953q, agencyInformation.f7953q) && this.f7954r == agencyInformation.f7954r && C24362h.m61206a(this.f7955s, agencyInformation.f7955s) && C24362h.m61206a(this.f7956t, agencyInformation.f7956t) && C24362h.m61206a(this.f7957u, agencyInformation.f7957u) && C24362h.m61206a(this.f7958v, agencyInformation.f7958v) && C24362h.m61206a(this.f7959w, agencyInformation.f7959w) && C24362h.m61206a(this.f7960x, agencyInformation.f7960x) && C24362h.m61206a(this.f7961y, agencyInformation.f7961y) && C24362h.m61206a(this.f7962z, agencyInformation.f7962z) && C24362h.m61206a(this.f7920A, agencyInformation.f7920A) && C24362h.m61206a(this.f7921B, agencyInformation.f7921B) && C24362h.m61206a(this.f7922C, agencyInformation.f7922C) && C24362h.m61206a(this.f7923D, agencyInformation.f7923D) && C24362h.m61206a(this.f7924E, agencyInformation.f7924E) && C24362h.m61206a(this.f7925F, agencyInformation.f7925F) && C24362h.m61206a(this.f7926G, agencyInformation.f7926G) && C24362h.m61206a(this.f7927H, agencyInformation.f7927H) && C24362h.m61206a(this.f7928I, agencyInformation.f7928I) && C24362h.m61206a(this.f7929J, agencyInformation.f7929J) && C24362h.m61206a(this.f7930K, agencyInformation.f7930K) && C24362h.m61206a(this.f7931L, agencyInformation.f7931L) && C24362h.m61206a(this.f7932M, agencyInformation.f7932M) && C24362h.m61206a(this.f7933N, agencyInformation.f7933N) && C24362h.m61206a(this.f7934O, agencyInformation.f7934O) && C24362h.m61206a(this.f7935P, agencyInformation.f7935P) && C24362h.m61206a(this.f7936Q, agencyInformation.f7936Q) && C24362h.m61206a(this.f7937R, agencyInformation.f7937R);
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
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        int i34;
        int d = C13715c.m34238d(this.f7939c, this.f7938b.hashCode() * 31, 31);
        String str = this.f7940d;
        int i35 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i36 = (d + i) * 31;
        String str2 = this.f7941e;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int d2 = C13715c.m34238d(this.f7945i, C13715c.m34238d(this.f7944h, C13715c.m34238d(this.f7943g, C13715c.m34238d(this.f7942f, (i36 + i2) * 31, 31), 31), 31), 31);
        int hashCode = this.f7948l.hashCode();
        int hashCode2 = (this.f7949m.hashCode() + ((hashCode + ((C13715c.m34238d(this.f7946j, d2, 31) + this.f7947k) * 31)) * 31)) * 31;
        Integer num = this.f7950n;
        if (num == null) {
            i3 = 0;
        } else {
            i3 = num.hashCode();
        }
        int i37 = (hashCode2 + i3) * 31;
        Money money = this.f7951o;
        if (money == null) {
            i4 = 0;
        } else {
            i4 = money.hashCode();
        }
        int i38 = (i37 + i4) * 31;
        Integer num2 = this.f7952p;
        if (num2 == null) {
            i5 = 0;
        } else {
            i5 = num2.hashCode();
        }
        int i39 = (i38 + i5) * 31;
        Money money2 = this.f7953q;
        if (money2 == null) {
            i6 = 0;
        } else {
            i6 = money2.hashCode();
        }
        int i41 = (i39 + i6) * 31;
        boolean z = this.f7954r;
        if (z) {
            z = true;
        }
        int i42 = (i41 + (z ? 1 : 0)) * 31;
        Integer num3 = this.f7955s;
        if (num3 == null) {
            i7 = 0;
        } else {
            i7 = num3.hashCode();
        }
        int i43 = (i42 + i7) * 31;
        Money money3 = this.f7956t;
        if (money3 == null) {
            i8 = 0;
        } else {
            i8 = money3.hashCode();
        }
        int i44 = (i43 + i8) * 31;
        Integer num4 = this.f7957u;
        if (num4 == null) {
            i9 = 0;
        } else {
            i9 = num4.hashCode();
        }
        int i45 = (i44 + i9) * 31;
        Money money4 = this.f7958v;
        if (money4 == null) {
            i11 = 0;
        } else {
            i11 = money4.hashCode();
        }
        int i46 = (i45 + i11) * 31;
        List<String> list = this.f7959w;
        if (list == null) {
            i12 = 0;
        } else {
            i12 = list.hashCode();
        }
        int i47 = (i46 + i12) * 31;
        List<Money> list2 = this.f7960x;
        if (list2 == null) {
            i13 = 0;
        } else {
            i13 = list2.hashCode();
        }
        int i48 = (i47 + i13) * 31;
        MobilePages mobilePages = this.f7961y;
        if (mobilePages == null) {
            i14 = 0;
        } else {
            i14 = mobilePages.hashCode();
        }
        int i49 = (i48 + i14) * 31;
        String str3 = this.f7962z;
        if (str3 == null) {
            i15 = 0;
        } else {
            i15 = str3.hashCode();
        }
        int i51 = (i49 + i15) * 31;
        Boolean bool = this.f7920A;
        if (bool == null) {
            i16 = 0;
        } else {
            i16 = bool.hashCode();
        }
        int i52 = (i51 + i16) * 31;
        Boolean bool2 = this.f7921B;
        if (bool2 == null) {
            i17 = 0;
        } else {
            i17 = bool2.hashCode();
        }
        int i53 = (i52 + i17) * 31;
        Boolean bool3 = this.f7922C;
        if (bool3 == null) {
            i18 = 0;
        } else {
            i18 = bool3.hashCode();
        }
        int i54 = (i53 + i18) * 31;
        Boolean bool4 = this.f7923D;
        if (bool4 == null) {
            i19 = 0;
        } else {
            i19 = bool4.hashCode();
        }
        int i55 = (i54 + i19) * 31;
        Boolean bool5 = this.f7924E;
        if (bool5 == null) {
            i21 = 0;
        } else {
            i21 = bool5.hashCode();
        }
        int i56 = (i55 + i21) * 31;
        Boolean bool6 = this.f7925F;
        if (bool6 == null) {
            i22 = 0;
        } else {
            i22 = bool6.hashCode();
        }
        int i57 = (i56 + i22) * 31;
        Boolean bool7 = this.f7926G;
        if (bool7 == null) {
            i23 = 0;
        } else {
            i23 = bool7.hashCode();
        }
        int i58 = (i57 + i23) * 31;
        Integer num5 = this.f7927H;
        if (num5 == null) {
            i24 = 0;
        } else {
            i24 = num5.hashCode();
        }
        int i59 = (i58 + i24) * 31;
        Money money5 = this.f7928I;
        if (money5 == null) {
            i25 = 0;
        } else {
            i25 = money5.hashCode();
        }
        int i61 = (i59 + i25) * 31;
        Integer num6 = this.f7929J;
        if (num6 == null) {
            i26 = 0;
        } else {
            i26 = num6.hashCode();
        }
        int i62 = (i61 + i26) * 31;
        Integer num7 = this.f7930K;
        if (num7 == null) {
            i27 = 0;
        } else {
            i27 = num7.hashCode();
        }
        int i63 = (i62 + i27) * 31;
        Double d3 = this.f7931L;
        if (d3 == null) {
            i28 = 0;
        } else {
            i28 = d3.hashCode();
        }
        int i64 = (i63 + i28) * 31;
        Double d4 = this.f7932M;
        if (d4 == null) {
            i29 = 0;
        } else {
            i29 = d4.hashCode();
        }
        int i65 = (i64 + i29) * 31;
        Integer num8 = this.f7933N;
        if (num8 == null) {
            i31 = 0;
        } else {
            i31 = num8.hashCode();
        }
        int i66 = (i65 + i31) * 31;
        Money money6 = this.f7934O;
        if (money6 == null) {
            i32 = 0;
        } else {
            i32 = money6.hashCode();
        }
        int i67 = (i66 + i32) * 31;
        LanguageSettings languageSettings = this.f7935P;
        if (languageSettings == null) {
            i33 = 0;
        } else {
            i33 = languageSettings.hashCode();
        }
        int i68 = (i67 + i33) * 31;
        Boolean bool8 = this.f7936Q;
        if (bool8 == null) {
            i34 = 0;
        } else {
            i34 = bool8.hashCode();
        }
        int i69 = (i68 + i34) * 31;
        Integer num9 = this.f7937R;
        if (num9 != null) {
            i35 = num9.hashCode();
        }
        return i69 + i35;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("AgencyInformation(name=");
        k.append(this.f7938b);
        k.append(", shortName=");
        k.append(this.f7939c);
        k.append(", serviceName=");
        k.append(this.f7940d);
        k.append(", region=");
        k.append(this.f7941e);
        k.append(", poolId=");
        k.append(this.f7942f);
        k.append(", state=");
        k.append(this.f7943g);
        k.append(", city=");
        k.append(this.f7944h);
        k.append(", country=");
        k.append(this.f7945i);
        k.append(", publicId=");
        k.append(this.f7946j);
        k.append(", id=");
        k.append(this.f7947k);
        k.append(", media=");
        k.append(this.f7948l);
        k.append(", colors=");
        k.append(this.f7949m);
        k.append(", minPurchaseAmount=");
        k.append(this.f7950n);
        k.append(", minPurchaseAmountMoney=");
        k.append(this.f7951o);
        k.append(", maxPurchaseAmount=");
        k.append(this.f7952p);
        k.append(", maxPurchaseAmountMoney=");
        k.append(this.f7953q);
        k.append(", allowStoredValue=");
        k.append(this.f7954r);
        k.append(", storedValueTransactionMin=");
        k.append(this.f7955s);
        k.append(", storedValueTransactionMinMoney=");
        k.append(this.f7956t);
        k.append(", storedValueTransactionMax=");
        k.append(this.f7957u);
        k.append(", storedValueTransactionMaxMoney=");
        k.append(this.f7958v);
        k.append(", storedValueButtonValues=");
        k.append(this.f7959w);
        k.append(", storedValueButtonMoneys=");
        k.append(this.f7960x);
        k.append(", mobilePages=");
        k.append(this.f7961y);
        k.append(", mobileLogoTargetUrl=");
        k.append(this.f7962z);
        k.append(", amexAccepted=");
        k.append(this.f7920A);
        k.append(", mcAccepted=");
        k.append(this.f7921B);
        k.append(", visaAccepted=");
        k.append(this.f7922C);
        k.append(", discAccepted=");
        k.append(this.f7923D);
        k.append(", jcbAccepted=");
        k.append(this.f7924E);
        k.append(", googlePayAccepted=");
        k.append(this.f7925F);
        k.append(", storedValuePayAccepted=");
        k.append(this.f7926G);
        k.append(", minimumAutoloadAmount=");
        k.append(this.f7927H);
        k.append(", minimumAutoloadAmountMoney=");
        k.append(this.f7928I);
        k.append(", minimumTripAutoload=");
        k.append(this.f7929J);
        k.append(", minimumHoursAutoload=");
        k.append(this.f7930K);
        k.append(", longitude=");
        k.append(this.f7931L);
        k.append(", latitude=");
        k.append(this.f7932M);
        k.append(", lowBalanceLevel=");
        k.append(this.f7933N);
        k.append(", lowBalanceLevelMoney=");
        k.append(this.f7934O);
        k.append(", languageSettings=");
        k.append(this.f7935P);
        k.append(", scanRideSupported=");
        k.append(this.f7936Q);
        k.append(", maxConsecutiveOfflineScanRides=");
        k.append(this.f7937R);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f7938b);
        parcel.writeString(this.f7939c);
        parcel.writeString(this.f7940d);
        parcel.writeString(this.f7941e);
        parcel.writeString(this.f7942f);
        parcel.writeString(this.f7943g);
        parcel.writeString(this.f7944h);
        parcel.writeString(this.f7945i);
        parcel.writeString(this.f7946j);
        parcel.writeInt(this.f7947k);
        Map<String, String> map = this.f7948l;
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
        Map<String, String> map2 = this.f7949m;
        parcel.writeInt(map2.size());
        for (Map.Entry next2 : map2.entrySet()) {
            parcel.writeString((String) next2.getKey());
            parcel.writeString((String) next2.getValue());
        }
        Integer num = this.f7950n;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            C0017h.m59P(parcel, 1, num);
        }
        Money money = this.f7951o;
        if (money == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            money.writeToParcel(parcel, i);
        }
        Integer num2 = this.f7952p;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            C0017h.m59P(parcel, 1, num2);
        }
        Money money2 = this.f7953q;
        if (money2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            money2.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f7954r ? 1 : 0);
        Integer num3 = this.f7955s;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            C0017h.m59P(parcel, 1, num3);
        }
        Money money3 = this.f7956t;
        if (money3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            money3.writeToParcel(parcel, i);
        }
        Integer num4 = this.f7957u;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            C0017h.m59P(parcel, 1, num4);
        }
        Money money4 = this.f7958v;
        if (money4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            money4.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.f7959w);
        List<Money> list = this.f7960x;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Money writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        MobilePages mobilePages = this.f7961y;
        if (mobilePages == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mobilePages.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f7962z);
        Boolean bool = this.f7920A;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.f7921B;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.f7922C;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.f7923D;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.f7924E;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        Boolean bool6 = this.f7925F;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool6.booleanValue() ? 1 : 0);
        }
        Boolean bool7 = this.f7926G;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool7.booleanValue() ? 1 : 0);
        }
        Integer num5 = this.f7927H;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            C0017h.m59P(parcel, 1, num5);
        }
        Money money5 = this.f7928I;
        if (money5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            money5.writeToParcel(parcel, i);
        }
        Integer num6 = this.f7929J;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            C0017h.m59P(parcel, 1, num6);
        }
        Integer num7 = this.f7930K;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            C0017h.m59P(parcel, 1, num7);
        }
        Double d = this.f7931L;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Double d2 = this.f7932M;
        if (d2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        }
        Integer num8 = this.f7933N;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            C0017h.m59P(parcel, 1, num8);
        }
        Money money6 = this.f7934O;
        if (money6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            money6.writeToParcel(parcel, i);
        }
        LanguageSettings languageSettings = this.f7935P;
        if (languageSettings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            languageSettings.writeToParcel(parcel, i);
        }
        Boolean bool8 = this.f7936Q;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool8.booleanValue() ? 1 : 0);
        }
        Integer num9 = this.f7937R;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            C0017h.m59P(parcel, 1, num9);
        }
    }
}
