package com.facebook.appevents.cloudbridge;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C23826d;
import mf0.C24362h;

public final class AppEventsConversionsAPITransformer {

    /* renamed from: a */
    public static final Map<AppEventUserAndAppDataField, C2325b> f8491a;

    /* renamed from: b */
    public static final Map<CustomEventField, C2324a> f8492b;

    /* renamed from: c */
    public static final Map<String, ConversionsAPIEventName> f8493c = C23826d.m58533X(new Pair("fb_mobile_achievement_unlocked", ConversionsAPIEventName.UNLOCKED_ACHIEVEMENT), new Pair("fb_mobile_activate_app", ConversionsAPIEventName.ACTIVATED_APP), new Pair("fb_mobile_add_payment_info", ConversionsAPIEventName.ADDED_PAYMENT_INFO), new Pair("fb_mobile_add_to_cart", ConversionsAPIEventName.ADDED_TO_CART), new Pair("fb_mobile_add_to_wishlist", ConversionsAPIEventName.ADDED_TO_WISHLIST), new Pair("fb_mobile_complete_registration", ConversionsAPIEventName.COMPLETED_REGISTRATION), new Pair("fb_mobile_content_view", ConversionsAPIEventName.VIEWED_CONTENT), new Pair("fb_mobile_initiated_checkout", ConversionsAPIEventName.INITIATED_CHECKOUT), new Pair("fb_mobile_level_achieved", ConversionsAPIEventName.ACHIEVED_LEVEL), new Pair("fb_mobile_purchase", ConversionsAPIEventName.PURCHASED), new Pair("fb_mobile_rate", ConversionsAPIEventName.RATED), new Pair("fb_mobile_search", ConversionsAPIEventName.SEARCHED), new Pair("fb_mobile_spent_credits", ConversionsAPIEventName.SPENT_CREDITS), new Pair("fb_mobile_tutorial_completion", ConversionsAPIEventName.COMPLETED_TUTORIAL));

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, mo59060d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$DataProcessingParameterName;", "", "", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "OPTIONS", "COUNTRY", "STATE", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
    public enum DataProcessingParameterName {
        OPTIONS("data_processing_options"),
        COUNTRY("data_processing_options_country"),
        STATE("data_processing_options_state");
        
        public static final C2322a Companion = null;
        private final String rawValue;

        /* renamed from: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$DataProcessingParameterName$a */
        public static final class C2322a {
        }

        /* access modifiers changed from: public */
        static {
            Companion = new C2322a();
        }

        private DataProcessingParameterName(String str) {
            this.rawValue = str;
        }

        public final String getRawValue() {
            return this.rawValue;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, mo59060d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformer$ValueTransformationType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "ARRAY", "BOOL", "INT", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
    public enum ValueTransformationType {
        ARRAY,
        BOOL,
        INT;
        
        public static final C2323a Companion = null;

        /* renamed from: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$ValueTransformationType$a */
        public static final class C2323a {
        }

        /* access modifiers changed from: public */
        static {
            Companion = new C2323a();
        }
    }

    /* renamed from: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$a */
    public static final class C2324a {

        /* renamed from: a */
        public ConversionsAPISection f8494a;

        /* renamed from: b */
        public ConversionsAPICustomEventField f8495b;

        public C2324a(ConversionsAPISection conversionsAPISection, ConversionsAPICustomEventField conversionsAPICustomEventField) {
            C24362h.m61211f(conversionsAPICustomEventField, "field");
            this.f8494a = conversionsAPISection;
            this.f8495b = conversionsAPICustomEventField;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2324a)) {
                return false;
            }
            C2324a aVar = (C2324a) obj;
            return this.f8494a == aVar.f8494a && this.f8495b == aVar.f8495b;
        }

        public final int hashCode() {
            ConversionsAPISection conversionsAPISection = this.f8494a;
            return this.f8495b.hashCode() + ((conversionsAPISection == null ? 0 : conversionsAPISection.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("SectionCustomEventFieldMapping(section=");
            k.append(this.f8494a);
            k.append(", field=");
            k.append(this.f8495b);
            k.append(')');
            return k.toString();
        }
    }

    /* renamed from: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$b */
    public static final class C2325b {

        /* renamed from: a */
        public ConversionsAPISection f8496a;

        /* renamed from: b */
        public ConversionsAPIUserAndAppDataField f8497b;

        public C2325b(ConversionsAPISection conversionsAPISection, ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField) {
            C24362h.m61211f(conversionsAPISection, "section");
            this.f8496a = conversionsAPISection;
            this.f8497b = conversionsAPIUserAndAppDataField;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2325b)) {
                return false;
            }
            C2325b bVar = (C2325b) obj;
            return this.f8496a == bVar.f8496a && this.f8497b == bVar.f8497b;
        }

        public final int hashCode() {
            int hashCode = this.f8496a.hashCode() * 31;
            ConversionsAPIUserAndAppDataField conversionsAPIUserAndAppDataField = this.f8497b;
            return hashCode + (conversionsAPIUserAndAppDataField == null ? 0 : conversionsAPIUserAndAppDataField.hashCode());
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("SectionFieldMapping(section=");
            k.append(this.f8496a);
            k.append(", field=");
            k.append(this.f8497b);
            k.append(')');
            return k.toString();
        }
    }

    /* renamed from: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$c */
    public /* synthetic */ class C2326c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8498a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f8499b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f8500c;

        static {
            int[] iArr = new int[ValueTransformationType.values().length];
            iArr[ValueTransformationType.ARRAY.ordinal()] = 1;
            iArr[ValueTransformationType.BOOL.ordinal()] = 2;
            iArr[ValueTransformationType.INT.ordinal()] = 3;
            f8498a = iArr;
            int[] iArr2 = new int[ConversionsAPISection.values().length];
            iArr2[ConversionsAPISection.APP_DATA.ordinal()] = 1;
            iArr2[ConversionsAPISection.USER_DATA.ordinal()] = 2;
            f8499b = iArr2;
            int[] iArr3 = new int[AppEventType.values().length];
            iArr3[AppEventType.MOBILE_APP_INSTALL.ordinal()] = 1;
            iArr3[AppEventType.CUSTOM.ordinal()] = 2;
            f8500c = iArr3;
        }
    }

    static {
        AppEventUserAndAppDataField appEventUserAndAppDataField = AppEventUserAndAppDataField.ANON_ID;
        ConversionsAPISection conversionsAPISection = ConversionsAPISection.USER_DATA;
        AppEventUserAndAppDataField appEventUserAndAppDataField2 = AppEventUserAndAppDataField.ADV_TE;
        ConversionsAPISection conversionsAPISection2 = ConversionsAPISection.APP_DATA;
        f8491a = C23826d.m58533X(new Pair(appEventUserAndAppDataField, new C2325b(conversionsAPISection, ConversionsAPIUserAndAppDataField.ANON_ID)), new Pair(AppEventUserAndAppDataField.APP_USER_ID, new C2325b(conversionsAPISection, ConversionsAPIUserAndAppDataField.FB_LOGIN_ID)), new Pair(AppEventUserAndAppDataField.ADVERTISER_ID, new C2325b(conversionsAPISection, ConversionsAPIUserAndAppDataField.MAD_ID)), new Pair(AppEventUserAndAppDataField.PAGE_ID, new C2325b(conversionsAPISection, ConversionsAPIUserAndAppDataField.PAGE_ID)), new Pair(AppEventUserAndAppDataField.PAGE_SCOPED_USER_ID, new C2325b(conversionsAPISection, ConversionsAPIUserAndAppDataField.PAGE_SCOPED_USER_ID)), new Pair(appEventUserAndAppDataField2, new C2325b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.ADV_TE)), new Pair(AppEventUserAndAppDataField.APP_TE, new C2325b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.APP_TE)), new Pair(AppEventUserAndAppDataField.CONSIDER_VIEWS, new C2325b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.CONSIDER_VIEWS)), new Pair(AppEventUserAndAppDataField.DEVICE_TOKEN, new C2325b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.DEVICE_TOKEN)), new Pair(AppEventUserAndAppDataField.EXT_INFO, new C2325b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.EXT_INFO)), new Pair(AppEventUserAndAppDataField.INCLUDE_DWELL_DATA, new C2325b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INCLUDE_DWELL_DATA)), new Pair(AppEventUserAndAppDataField.INCLUDE_VIDEO_DATA, new C2325b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INCLUDE_VIDEO_DATA)), new Pair(AppEventUserAndAppDataField.INSTALL_REFERRER, new C2325b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INSTALL_REFERRER)), new Pair(AppEventUserAndAppDataField.INSTALLER_PACKAGE, new C2325b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.INSTALLER_PACKAGE)), new Pair(AppEventUserAndAppDataField.RECEIPT_DATA, new C2325b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.RECEIPT_DATA)), new Pair(AppEventUserAndAppDataField.URL_SCHEMES, new C2325b(conversionsAPISection2, ConversionsAPIUserAndAppDataField.URL_SCHEMES)), new Pair(AppEventUserAndAppDataField.USER_DATA, new C2325b(conversionsAPISection, (ConversionsAPIUserAndAppDataField) null)));
        CustomEventField customEventField = CustomEventField.VALUE_TO_SUM;
        ConversionsAPISection conversionsAPISection3 = ConversionsAPISection.CUSTOM_DATA;
        f8492b = C23826d.m58533X(new Pair(CustomEventField.EVENT_TIME, new C2324a((ConversionsAPISection) null, ConversionsAPICustomEventField.EVENT_TIME)), new Pair(CustomEventField.EVENT_NAME, new C2324a((ConversionsAPISection) null, ConversionsAPICustomEventField.EVENT_NAME)), new Pair(customEventField, new C2324a(conversionsAPISection3, ConversionsAPICustomEventField.VALUE_TO_SUM)), new Pair(CustomEventField.CONTENT_IDS, new C2324a(conversionsAPISection3, ConversionsAPICustomEventField.CONTENT_IDS)), new Pair(CustomEventField.CONTENTS, new C2324a(conversionsAPISection3, ConversionsAPICustomEventField.CONTENTS)), new Pair(CustomEventField.CONTENT_TYPE, new C2324a(conversionsAPISection3, ConversionsAPICustomEventField.CONTENT_TYPE)), new Pair(CustomEventField.CURRENCY, new C2324a(conversionsAPISection3, ConversionsAPICustomEventField.CURRENCY)), new Pair(CustomEventField.DESCRIPTION, new C2324a(conversionsAPISection3, ConversionsAPICustomEventField.DESCRIPTION)), new Pair(CustomEventField.LEVEL, new C2324a(conversionsAPISection3, ConversionsAPICustomEventField.LEVEL)), new Pair(CustomEventField.MAX_RATING_VALUE, new C2324a(conversionsAPISection3, ConversionsAPICustomEventField.MAX_RATING_VALUE)), new Pair(CustomEventField.NUM_ITEMS, new C2324a(conversionsAPISection3, ConversionsAPICustomEventField.NUM_ITEMS)), new Pair(CustomEventField.PAYMENT_INFO_AVAILABLE, new C2324a(conversionsAPISection3, ConversionsAPICustomEventField.PAYMENT_INFO_AVAILABLE)), new Pair(CustomEventField.REGISTRATION_METHOD, new C2324a(conversionsAPISection3, ConversionsAPICustomEventField.REGISTRATION_METHOD)), new Pair(CustomEventField.SEARCH_STRING, new C2324a(conversionsAPISection3, ConversionsAPICustomEventField.SEARCH_STRING)), new Pair(CustomEventField.SUCCESS, new C2324a(conversionsAPISection3, ConversionsAPICustomEventField.SUCCESS)), new Pair(CustomEventField.ORDER_ID, new C2324a(conversionsAPISection3, ConversionsAPICustomEventField.ORDER_ID)), new Pair(CustomEventField.AD_TYPE, new C2324a(conversionsAPISection3, ConversionsAPICustomEventField.AD_TYPE)));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:53|54) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:50|51|52|55|56|48) */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ee, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r5 = com.facebook.internal.C2397f0.f8630a;
        r1 = com.facebook.internal.C2397f0.m6313g(new org.json.JSONArray(r1));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00ee */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00f9 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m6190a(java.lang.Object r6, java.lang.String r7) {
        /*
            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$ValueTransformationType$a r0 = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.ValueTransformationType.Companion
            r0.getClass()
            com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField r0 = com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.EXT_INFO
            java.lang.String r0 = r0.getRawValue()
            boolean r0 = mf0.C24362h.m61206a(r7, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0016
            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$ValueTransformationType r7 = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.ValueTransformationType.ARRAY
            goto L_0x0080
        L_0x0016:
            com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField r0 = com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.URL_SCHEMES
            java.lang.String r0 = r0.getRawValue()
            boolean r0 = mf0.C24362h.m61206a(r7, r0)
            if (r0 == 0) goto L_0x0025
            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$ValueTransformationType r7 = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.ValueTransformationType.ARRAY
            goto L_0x0080
        L_0x0025:
            com.facebook.appevents.cloudbridge.CustomEventField r0 = com.facebook.appevents.cloudbridge.CustomEventField.CONTENT_IDS
            java.lang.String r0 = r0.getRawValue()
            boolean r0 = mf0.C24362h.m61206a(r7, r0)
            if (r0 == 0) goto L_0x0034
            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$ValueTransformationType r7 = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.ValueTransformationType.ARRAY
            goto L_0x0080
        L_0x0034:
            com.facebook.appevents.cloudbridge.CustomEventField r0 = com.facebook.appevents.cloudbridge.CustomEventField.CONTENTS
            java.lang.String r0 = r0.getRawValue()
            boolean r0 = mf0.C24362h.m61206a(r7, r0)
            if (r0 == 0) goto L_0x0043
            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$ValueTransformationType r7 = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.ValueTransformationType.ARRAY
            goto L_0x0080
        L_0x0043:
            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$DataProcessingParameterName r0 = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.DataProcessingParameterName.OPTIONS
            java.lang.String r0 = r0.getRawValue()
            boolean r0 = mf0.C24362h.m61206a(r7, r0)
            if (r0 == 0) goto L_0x0052
            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$ValueTransformationType r7 = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.ValueTransformationType.ARRAY
            goto L_0x0080
        L_0x0052:
            com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField r0 = com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.ADV_TE
            java.lang.String r0 = r0.getRawValue()
            boolean r0 = mf0.C24362h.m61206a(r7, r0)
            if (r0 == 0) goto L_0x0061
            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$ValueTransformationType r7 = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.ValueTransformationType.BOOL
            goto L_0x0080
        L_0x0061:
            com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField r0 = com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.APP_TE
            java.lang.String r0 = r0.getRawValue()
            boolean r0 = mf0.C24362h.m61206a(r7, r0)
            if (r0 == 0) goto L_0x0070
            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$ValueTransformationType r7 = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.ValueTransformationType.BOOL
            goto L_0x0080
        L_0x0070:
            com.facebook.appevents.cloudbridge.CustomEventField r0 = com.facebook.appevents.cloudbridge.CustomEventField.EVENT_TIME
            java.lang.String r0 = r0.getRawValue()
            boolean r7 = mf0.C24362h.m61206a(r7, r0)
            if (r7 == 0) goto L_0x007f
            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$ValueTransformationType r7 = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.ValueTransformationType.INT
            goto L_0x0080
        L_0x007f:
            r7 = r1
        L_0x0080:
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L_0x0088
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0089
        L_0x0088:
            r0 = r1
        L_0x0089:
            if (r7 == 0) goto L_0x0112
            if (r0 != 0) goto L_0x008f
            goto L_0x0112
        L_0x008f:
            int[] r2 = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.C2326c.f8498a
            int r7 = r7.ordinal()
            r7 = r2[r7]
            r2 = 0
            r3 = 2
            r4 = 1
            if (r7 == r4) goto L_0x00c2
            if (r7 == r3) goto L_0x00b0
            r0 = 3
            if (r7 != r0) goto L_0x00aa
            java.lang.String r6 = r6.toString()
            java.lang.Integer r6 = uh0.C25080g.m62829y(r6)
            return r6
        L_0x00aa:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L_0x00b0:
            java.lang.Integer r6 = uh0.C25080g.m62829y(r0)
            if (r6 == 0) goto L_0x00c1
            int r6 = r6.intValue()
            if (r6 == 0) goto L_0x00bd
            r2 = 1
        L_0x00bd:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
        L_0x00c1:
            return r1
        L_0x00c2:
            com.facebook.internal.f0 r7 = com.facebook.internal.C2397f0.f8630a     // Catch:{ JSONException -> 0x00fe }
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00fe }
            r7.<init>(r0)     // Catch:{ JSONException -> 0x00fe }
            java.util.ArrayList r7 = com.facebook.internal.C2397f0.m6313g(r7)     // Catch:{ JSONException -> 0x00fe }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ JSONException -> 0x00fe }
            r0.<init>()     // Catch:{ JSONException -> 0x00fe }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ JSONException -> 0x00fe }
        L_0x00d6:
            boolean r1 = r7.hasNext()     // Catch:{ JSONException -> 0x00fe }
            if (r1 == 0) goto L_0x00fd
            java.lang.Object r1 = r7.next()     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x00fe }
            com.facebook.internal.f0 r5 = com.facebook.internal.C2397f0.f8630a     // Catch:{ JSONException -> 0x00ee }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00ee }
            r5.<init>(r1)     // Catch:{ JSONException -> 0x00ee }
            java.util.HashMap r1 = com.facebook.internal.C2397f0.m6314h(r5)     // Catch:{ JSONException -> 0x00ee }
            goto L_0x00f9
        L_0x00ee:
            com.facebook.internal.f0 r5 = com.facebook.internal.C2397f0.f8630a     // Catch:{ JSONException -> 0x00f9 }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00f9 }
            r5.<init>(r1)     // Catch:{ JSONException -> 0x00f9 }
            java.util.ArrayList r1 = com.facebook.internal.C2397f0.m6313g(r5)     // Catch:{ JSONException -> 0x00f9 }
        L_0x00f9:
            r0.add(r1)     // Catch:{ JSONException -> 0x00fe }
            goto L_0x00d6
        L_0x00fd:
            return r0
        L_0x00fe:
            r7 = move-exception
            com.facebook.internal.x$a r0 = com.facebook.internal.C2436x.f8729d
            com.facebook.LoggingBehavior r0 = com.facebook.LoggingBehavior.APP_EVENTS
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r6
            r1[r4] = r7
            java.lang.String r6 = "AppEventsConversionsAPITransformer"
            java.lang.String r7 = "\n transformEvents JSONException: \n%s\n%s"
            com.facebook.internal.C2436x.C2437a.m6390b(r0, r6, r7, r1)
            bf0.d r6 = bf0.C21050d.f52856a
        L_0x0112:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.m6190a(java.lang.Object, java.lang.String):java.lang.Object");
    }
}
