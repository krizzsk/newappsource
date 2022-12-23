package com.facebook.appevents.cloudbridge;

import com.facebook.LoggingBehavior;
import com.facebook.internal.C2436x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import mf0.C24362h;
import p001a0.C0017h;
import p583jk.C17884p;

/* renamed from: com.facebook.appevents.cloudbridge.a */
public final class C2329a {

    /* renamed from: a */
    public static final HashSet<Integer> f8501a = C17884p.m44336G(200, 202);

    /* renamed from: b */
    public static final HashSet<Integer> f8502b = C17884p.m44336G(503, 504, 429);

    /* renamed from: c */
    public static C2330a f8503c;

    /* renamed from: d */
    public static List<Map<String, Object>> f8504d;

    /* renamed from: e */
    public static int f8505e;

    /* renamed from: com.facebook.appevents.cloudbridge.a$a */
    public static final class C2330a {

        /* renamed from: a */
        public final String f8506a;

        /* renamed from: b */
        public final String f8507b;

        /* renamed from: c */
        public final String f8508c;

        public C2330a(String str, String str2, String str3) {
            C24362h.m61211f(str2, "cloudBridgeURL");
            this.f8506a = str;
            this.f8507b = str2;
            this.f8508c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2330a)) {
                return false;
            }
            C2330a aVar = (C2330a) obj;
            return C24362h.m61206a(this.f8506a, aVar.f8506a) && C24362h.m61206a(this.f8507b, aVar.f8507b) && C24362h.m61206a(this.f8508c, aVar.f8508c);
        }

        public final int hashCode() {
            return this.f8508c.hashCode() + C13715c.m34238d(this.f8507b, this.f8506a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("CloudBridgeCredentials(datasetID=");
            k.append(this.f8506a);
            k.append(", cloudBridgeURL=");
            k.append(this.f8507b);
            k.append(", accessKey=");
            return C0017h.m57N(k, this.f8508c, ')');
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:158:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x05bc A[Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x03a2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:290:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m6191a(com.facebook.GraphRequest r29) {
        /*
            r1 = r29
            java.lang.String r2 = "POST"
            java.lang.String r0 = "$request"
            mf0.C24362h.m61211f(r1, r0)
            java.lang.String r0 = r1.f8429b
            r4 = 0
            if (r0 != 0) goto L_0x0010
            r0 = 0
            goto L_0x001b
        L_0x0010:
            java.lang.String r5 = "/"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            r6 = 6
            java.util.List r0 = kotlin.text.C24179b.m60577Y(r0, r5, r4, r6)
        L_0x001b:
            java.lang.String r5 = "CAPITransformerWebRequests"
            r6 = 1
            if (r0 == 0) goto L_0x0674
            int r0 = r0.size()
            r7 = 2
            if (r0 == r7) goto L_0x0029
            goto L_0x0674
        L_0x0029:
            com.facebook.appevents.cloudbridge.a$a r0 = f8503c     // Catch:{ UninitializedPropertyAccessException -> 0x065b }
            java.lang.String r8 = "credentials"
            if (r0 == 0) goto L_0x065d
            java.lang.String r9 = r0.f8507b     // Catch:{ UninitializedPropertyAccessException -> 0x065b }
            if (r0 == 0) goto L_0x0654
            java.lang.String r0 = r0.f8506a     // Catch:{ UninitializedPropertyAccessException -> 0x065b }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ UninitializedPropertyAccessException -> 0x065b }
            r10.<init>()     // Catch:{ UninitializedPropertyAccessException -> 0x065b }
            r10.append(r9)     // Catch:{ UninitializedPropertyAccessException -> 0x065b }
            java.lang.String r9 = "/capi/"
            r10.append(r9)     // Catch:{ UninitializedPropertyAccessException -> 0x065b }
            r10.append(r0)     // Catch:{ UninitializedPropertyAccessException -> 0x065b }
            java.lang.String r0 = "/events"
            r10.append(r0)     // Catch:{ UninitializedPropertyAccessException -> 0x065b }
            java.lang.String r9 = r10.toString()     // Catch:{ UninitializedPropertyAccessException -> 0x065b }
            org.json.JSONObject r0 = r1.f8430c
            if (r0 == 0) goto L_0x0460
            java.util.HashMap r0 = com.facebook.internal.C2397f0.m6314h(r0)
            java.util.LinkedHashMap r10 = kotlin.collections.C23826d.m58538c0(r0)
            java.lang.Object r0 = r1.f8432e
            java.lang.String r11 = "null cannot be cast to non-null type kotlin.Any"
            if (r0 == 0) goto L_0x045a
            java.lang.String r12 = "custom_events"
            r10.put(r12, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r12 = r10.keySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x0072:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0097
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            r0.append(r13)
            java.lang.String r14 = " : "
            r0.append(r14)
            java.lang.Object r13 = r10.get(r13)
            r0.append(r13)
            java.lang.String r13 = "line.separator"
            java.lang.String r13 = java.lang.System.getProperty(r13)
            r0.append(r13)
            goto L_0x0072
        L_0x0097:
            com.facebook.internal.x$a r12 = com.facebook.internal.C2436x.f8729d
            com.facebook.LoggingBehavior r12 = com.facebook.LoggingBehavior.APP_EVENTS
            java.lang.Object[] r13 = new java.lang.Object[r6]
            r13[r4] = r0
            java.lang.String r0 = "\nGraph Request data: \n\n%s \n\n"
            com.facebook.internal.C2436x.C2437a.m6390b(r12, r5, r0, r13)
            java.util.Map<com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField, com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$b> r0 = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.f8491a
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>()
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>()
            com.facebook.appevents.cloudbridge.OtherEventConstants r0 = com.facebook.appevents.cloudbridge.OtherEventConstants.EVENT
            java.lang.String r0 = r0.getRawValue()
            java.lang.Object r0 = r10.get(r0)
            com.facebook.appevents.cloudbridge.AppEventType$a r16 = com.facebook.appevents.cloudbridge.AppEventType.Companion
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.String"
            if (r0 == 0) goto L_0x0454
            java.lang.String r0 = (java.lang.String) r0
            r16.getClass()
            java.lang.String r4 = "MOBILE_APP_INSTALL"
            boolean r4 = mf0.C24362h.m61206a(r0, r4)
            if (r4 == 0) goto L_0x00db
            com.facebook.appevents.cloudbridge.AppEventType r0 = com.facebook.appevents.cloudbridge.AppEventType.MOBILE_APP_INSTALL
        L_0x00d9:
            r4 = r0
            goto L_0x00e9
        L_0x00db:
            java.lang.String r4 = "CUSTOM_APP_EVENTS"
            boolean r0 = mf0.C24362h.m61206a(r0, r4)
            if (r0 == 0) goto L_0x00e6
            com.facebook.appevents.cloudbridge.AppEventType r0 = com.facebook.appevents.cloudbridge.AppEventType.CUSTOM
            goto L_0x00d9
        L_0x00e6:
            com.facebook.appevents.cloudbridge.AppEventType r0 = com.facebook.appevents.cloudbridge.AppEventType.OTHER
            goto L_0x00d9
        L_0x00e9:
            com.facebook.appevents.cloudbridge.AppEventType r0 = com.facebook.appevents.cloudbridge.AppEventType.OTHER
            if (r4 != r0) goto L_0x00f9
        L_0x00ed:
            r20 = r2
            r21 = r5
            r19 = r8
            r22 = r9
            r26 = r13
            goto L_0x03b2
        L_0x00f9:
            java.util.Set r0 = r10.entrySet()
            java.util.Iterator r17 = r0.iterator()
        L_0x0101:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x00ed
            java.lang.Object r0 = r17.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r18 = r0.getKey()
            r7 = r18
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.getValue()
            com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField$a r0 = com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.Companion
            r0.getClass()
            r19 = r8
            java.lang.String r8 = "rawValue"
            mf0.C24362h.m61211f(r7, r8)
            com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField[] r0 = com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.values()
            r20 = r2
            int r2 = r0.length
            r21 = r5
            r5 = 0
        L_0x012f:
            if (r5 >= r2) goto L_0x0147
            r22 = r0[r5]
            r23 = r0
            java.lang.String r0 = r22.getRawValue()
            boolean r0 = mf0.C24362h.m61206a(r0, r7)
            if (r0 == 0) goto L_0x0142
            r0 = r22
            goto L_0x0148
        L_0x0142:
            int r5 = r5 + 1
            r0 = r23
            goto L_0x012f
        L_0x0147:
            r0 = 0
        L_0x0148:
            java.lang.String r2 = "\n transformEvents JSONException: \n%s\n%s"
            java.lang.String r5 = "AppEventsConversionsAPITransformer"
            if (r0 == 0) goto L_0x01cc
            java.lang.String r7 = "value"
            mf0.C24362h.m61211f(r6, r7)
            java.util.Map<com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField, com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$b> r7 = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.f8491a
            java.lang.Object r8 = r7.get(r0)
            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$b r8 = (com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.C2325b) r8
            if (r8 != 0) goto L_0x0160
            goto L_0x01c6
        L_0x0160:
            com.facebook.appevents.cloudbridge.ConversionsAPISection r8 = r8.f8496a
            int[] r22 = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.C2326c.f8499b
            int r8 = r8.ordinal()
            r8 = r22[r8]
            r1 = 1
            if (r8 == r1) goto L_0x01b0
            r1 = 2
            if (r8 == r1) goto L_0x0171
            goto L_0x01c6
        L_0x0171:
            com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField r1 = com.facebook.appevents.cloudbridge.AppEventUserAndAppDataField.USER_DATA
            if (r0 != r1) goto L_0x0199
            com.facebook.internal.f0 r0 = com.facebook.internal.C2397f0.f8630a     // Catch:{ JSONException -> 0x0187 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0187 }
            r1 = r6
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x0187 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0187 }
            java.util.HashMap r0 = com.facebook.internal.C2397f0.m6314h(r0)     // Catch:{ JSONException -> 0x0187 }
            r12.putAll(r0)     // Catch:{ JSONException -> 0x0187 }
            goto L_0x01c6
        L_0x0187:
            r0 = move-exception
            com.facebook.internal.x$a r1 = com.facebook.internal.C2436x.f8729d
            com.facebook.LoggingBehavior r1 = com.facebook.LoggingBehavior.APP_EVENTS
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r7 = 0
            r8[r7] = r6
            r6 = 1
            r8[r6] = r0
            com.facebook.internal.C2436x.C2437a.m6390b(r1, r5, r2, r8)
            goto L_0x01c6
        L_0x0199:
            java.lang.Object r0 = r7.get(r0)
            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$b r0 = (com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.C2325b) r0
            if (r0 != 0) goto L_0x01a3
            r0 = 0
            goto L_0x01a5
        L_0x01a3:
            com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField r0 = r0.f8497b
        L_0x01a5:
            if (r0 != 0) goto L_0x01a8
            goto L_0x01c6
        L_0x01a8:
            java.lang.String r0 = r0.getRawValue()
            r12.put(r0, r6)
            goto L_0x01c6
        L_0x01b0:
            java.lang.Object r0 = r7.get(r0)
            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$b r0 = (com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.C2325b) r0
            if (r0 != 0) goto L_0x01ba
            r0 = 0
            goto L_0x01bc
        L_0x01ba:
            com.facebook.appevents.cloudbridge.ConversionsAPIUserAndAppDataField r0 = r0.f8497b
        L_0x01bc:
            if (r0 != 0) goto L_0x01bf
            goto L_0x01c6
        L_0x01bf:
            java.lang.String r0 = r0.getRawValue()
            r13.put(r0, r6)
        L_0x01c6:
            r22 = r9
            r26 = r13
            goto L_0x03a2
        L_0x01cc:
            com.facebook.appevents.cloudbridge.ConversionsAPISection r0 = com.facebook.appevents.cloudbridge.ConversionsAPISection.CUSTOM_EVENTS
            java.lang.String r0 = r0.getRawValue()
            boolean r0 = mf0.C24362h.m61206a(r7, r0)
            boolean r1 = r6 instanceof java.lang.String
            r22 = r9
            com.facebook.appevents.cloudbridge.AppEventType r9 = com.facebook.appevents.cloudbridge.AppEventType.CUSTOM
            if (r4 != r9) goto L_0x037d
            if (r0 == 0) goto L_0x037d
            if (r1 == 0) goto L_0x037d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = "appEvents"
            mf0.C24362h.m61211f(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.facebook.internal.f0 r1 = com.facebook.internal.C2397f0.f8630a     // Catch:{ JSONException -> 0x0363 }
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0363 }
            r1.<init>(r6)     // Catch:{ JSONException -> 0x0363 }
            java.util.ArrayList r1 = com.facebook.internal.C2397f0.m6313g(r1)     // Catch:{ JSONException -> 0x0363 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ JSONException -> 0x0363 }
        L_0x01fd:
            boolean r7 = r1.hasNext()     // Catch:{ JSONException -> 0x0363 }
            if (r7 == 0) goto L_0x0218
            java.lang.Object r7 = r1.next()     // Catch:{ JSONException -> 0x0363 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ JSONException -> 0x0363 }
            com.facebook.internal.f0 r9 = com.facebook.internal.C2397f0.f8630a     // Catch:{ JSONException -> 0x0363 }
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0363 }
            r9.<init>(r7)     // Catch:{ JSONException -> 0x0363 }
            java.util.HashMap r7 = com.facebook.internal.C2397f0.m6314h(r9)     // Catch:{ JSONException -> 0x0363 }
            r0.add(r7)     // Catch:{ JSONException -> 0x0363 }
            goto L_0x01fd
        L_0x0218:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0222
            r26 = r13
            goto L_0x0376
        L_0x0222:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x022b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0360
            java.lang.Object r0 = r2.next()
            r6 = r0
            java.util.Map r6 = (java.util.Map) r6
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r23 = r0.iterator()
        L_0x024a:
            boolean r0 = r23.hasNext()
            if (r0 == 0) goto L_0x033e
            java.lang.Object r0 = r23.next()
            java.lang.String r0 = (java.lang.String) r0
            com.facebook.appevents.cloudbridge.CustomEventField$a r24 = com.facebook.appevents.cloudbridge.CustomEventField.Companion
            r24.getClass()
            mf0.C24362h.m61211f(r0, r8)
            r24 = r2
            com.facebook.appevents.cloudbridge.CustomEventField[] r2 = com.facebook.appevents.cloudbridge.CustomEventField.values()
            r25 = r8
            int r8 = r2.length
            r26 = r13
            r13 = 0
        L_0x026a:
            if (r13 >= r8) goto L_0x0282
            r27 = r2[r13]
            r28 = r2
            java.lang.String r2 = r27.getRawValue()
            boolean r2 = mf0.C24362h.m61206a(r2, r0)
            if (r2 == 0) goto L_0x027d
            r2 = r27
            goto L_0x0283
        L_0x027d:
            int r13 = r13 + 1
            r2 = r28
            goto L_0x026a
        L_0x0282:
            r2 = 0
        L_0x0283:
            java.util.Map<com.facebook.appevents.cloudbridge.CustomEventField, com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$a> r8 = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.f8492b
            java.lang.Object r8 = r8.get(r2)
            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$a r8 = (com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.C2324a) r8
            if (r2 == 0) goto L_0x0335
            if (r8 != 0) goto L_0x0291
            goto L_0x0335
        L_0x0291:
            com.facebook.appevents.cloudbridge.ConversionsAPISection r13 = r8.f8494a
            if (r13 == 0) goto L_0x02bc
            com.facebook.appevents.cloudbridge.ConversionsAPISection r2 = com.facebook.appevents.cloudbridge.ConversionsAPISection.CUSTOM_DATA
            if (r13 != r2) goto L_0x0335
            com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField r2 = r8.f8495b
            java.lang.String r2 = r2.getRawValue()
            java.lang.Object r8 = r6.get(r0)
            if (r8 == 0) goto L_0x02b6
            java.lang.Object r0 = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.m6190a(r8, r0)
            if (r0 == 0) goto L_0x02b0
            r7.put(r2, r0)
            goto L_0x0335
        L_0x02b0:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r11)
            throw r0
        L_0x02b6:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r11)
            throw r0
        L_0x02bc:
            com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField r8 = r8.f8495b     // Catch:{ ClassCastException -> 0x031f }
            java.lang.String r8 = r8.getRawValue()     // Catch:{ ClassCastException -> 0x031f }
            com.facebook.appevents.cloudbridge.CustomEventField r13 = com.facebook.appevents.cloudbridge.CustomEventField.EVENT_NAME     // Catch:{ ClassCastException -> 0x031f }
            if (r2 != r13) goto L_0x02f7
            java.lang.Object r13 = r6.get(r0)     // Catch:{ ClassCastException -> 0x031f }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ ClassCastException -> 0x031f }
            if (r13 == 0) goto L_0x02f7
            java.lang.Object r0 = r6.get(r0)     // Catch:{ ClassCastException -> 0x031f }
            if (r0 == 0) goto L_0x02f1
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassCastException -> 0x031f }
            java.util.Map<java.lang.String, com.facebook.appevents.cloudbridge.ConversionsAPIEventName> r2 = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.f8493c     // Catch:{ ClassCastException -> 0x031f }
            boolean r13 = r2.containsKey(r0)     // Catch:{ ClassCastException -> 0x031f }
            if (r13 == 0) goto L_0x02ed
            java.lang.Object r0 = r2.get(r0)     // Catch:{ ClassCastException -> 0x031f }
            com.facebook.appevents.cloudbridge.ConversionsAPIEventName r0 = (com.facebook.appevents.cloudbridge.ConversionsAPIEventName) r0     // Catch:{ ClassCastException -> 0x031f }
            if (r0 != 0) goto L_0x02e9
            java.lang.String r0 = ""
            goto L_0x02ed
        L_0x02e9:
            java.lang.String r0 = r0.getRawValue()     // Catch:{ ClassCastException -> 0x031f }
        L_0x02ed:
            r9.put(r8, r0)     // Catch:{ ClassCastException -> 0x031f }
            goto L_0x0335
        L_0x02f1:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ ClassCastException -> 0x031f }
            r0.<init>(r3)     // Catch:{ ClassCastException -> 0x031f }
            throw r0     // Catch:{ ClassCastException -> 0x031f }
        L_0x02f7:
            com.facebook.appevents.cloudbridge.CustomEventField r13 = com.facebook.appevents.cloudbridge.CustomEventField.EVENT_TIME     // Catch:{ ClassCastException -> 0x031f }
            if (r2 != r13) goto L_0x0335
            java.lang.Object r2 = r6.get(r0)     // Catch:{ ClassCastException -> 0x031f }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ ClassCastException -> 0x031f }
            if (r2 == 0) goto L_0x0335
            java.lang.Object r2 = r6.get(r0)     // Catch:{ ClassCastException -> 0x031f }
            if (r2 == 0) goto L_0x0319
            java.lang.Object r0 = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.m6190a(r2, r0)     // Catch:{ ClassCastException -> 0x031f }
            if (r0 == 0) goto L_0x0313
            r9.put(r8, r0)     // Catch:{ ClassCastException -> 0x031f }
            goto L_0x0335
        L_0x0313:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ ClassCastException -> 0x031f }
            r0.<init>(r11)     // Catch:{ ClassCastException -> 0x031f }
            throw r0     // Catch:{ ClassCastException -> 0x031f }
        L_0x0319:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ ClassCastException -> 0x031f }
            r0.<init>(r11)     // Catch:{ ClassCastException -> 0x031f }
            throw r0     // Catch:{ ClassCastException -> 0x031f }
        L_0x031f:
            r0 = move-exception
            com.facebook.internal.x$a r2 = com.facebook.internal.C2436x.f8729d
            com.facebook.LoggingBehavior r2 = com.facebook.LoggingBehavior.APP_EVENTS
            r8 = 1
            java.lang.Object[] r13 = new java.lang.Object[r8]
            java.lang.String r0 = p626lf.C18201b.m44927y(r0)
            r16 = 0
            r13[r16] = r0
            java.lang.String r0 = "\n transformEvents ClassCastException: \n %s "
            com.facebook.internal.C2436x.C2437a.m6390b(r2, r5, r0, r13)
            goto L_0x0336
        L_0x0335:
            r8 = 1
        L_0x0336:
            r2 = r24
            r8 = r25
            r13 = r26
            goto L_0x024a
        L_0x033e:
            r24 = r2
            r25 = r8
            r26 = r13
            r8 = 1
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x0355
            com.facebook.appevents.cloudbridge.ConversionsAPISection r0 = com.facebook.appevents.cloudbridge.ConversionsAPISection.CUSTOM_DATA
            java.lang.String r0 = r0.getRawValue()
            r9.put(r0, r7)
        L_0x0355:
            r1.add(r9)
            r2 = r24
            r8 = r25
            r13 = r26
            goto L_0x022b
        L_0x0360:
            r26 = r13
            goto L_0x0377
        L_0x0363:
            r0 = move-exception
            r26 = r13
            com.facebook.internal.x$a r1 = com.facebook.internal.C2436x.f8729d
            com.facebook.LoggingBehavior r1 = com.facebook.LoggingBehavior.APP_EVENTS
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r7 = 0
            r8[r7] = r6
            r6 = 1
            r8[r6] = r0
            com.facebook.internal.C2436x.C2437a.m6390b(r1, r5, r2, r8)
        L_0x0376:
            r1 = 0
        L_0x0377:
            if (r1 == 0) goto L_0x03a2
            r14.addAll(r1)
            goto L_0x03a2
        L_0x037d:
            r26 = r13
            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$DataProcessingParameterName$a r0 = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.DataProcessingParameterName.Companion
            r0.getClass()
            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer$DataProcessingParameterName[] r0 = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.DataProcessingParameterName.values()
            int r1 = r0.length
            r2 = 0
        L_0x038a:
            if (r2 >= r1) goto L_0x039c
            r5 = r0[r2]
            java.lang.String r8 = r5.getRawValue()
            boolean r8 = mf0.C24362h.m61206a(r8, r7)
            if (r8 == 0) goto L_0x0399
            goto L_0x039d
        L_0x0399:
            int r2 = r2 + 1
            goto L_0x038a
        L_0x039c:
            r5 = 0
        L_0x039d:
            if (r5 == 0) goto L_0x03a2
            r15.put(r7, r6)
        L_0x03a2:
            r1 = r29
            r8 = r19
            r2 = r20
            r5 = r21
            r9 = r22
            r13 = r26
            r6 = 1
            r7 = 2
            goto L_0x0101
        L_0x03b2:
            com.facebook.appevents.cloudbridge.AppEventType r0 = com.facebook.appevents.cloudbridge.AppEventType.OTHER
            if (r4 != r0) goto L_0x03b8
            goto L_0x0468
        L_0x03b8:
            com.facebook.appevents.cloudbridge.OtherEventConstants r0 = com.facebook.appevents.cloudbridge.OtherEventConstants.INSTALL_EVENT_TIME
            java.lang.String r0 = r0.getRawValue()
            java.lang.Object r0 = r10.get(r0)
            java.lang.String r1 = "eventType"
            mf0.C24362h.m61211f(r4, r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            com.facebook.appevents.cloudbridge.OtherEventConstants r2 = com.facebook.appevents.cloudbridge.OtherEventConstants.ACTION_SOURCE
            java.lang.String r2 = r2.getRawValue()
            com.facebook.appevents.cloudbridge.OtherEventConstants r3 = com.facebook.appevents.cloudbridge.OtherEventConstants.APP
            java.lang.String r3 = r3.getRawValue()
            r1.put(r2, r3)
            com.facebook.appevents.cloudbridge.ConversionsAPISection r2 = com.facebook.appevents.cloudbridge.ConversionsAPISection.USER_DATA
            java.lang.String r2 = r2.getRawValue()
            r1.put(r2, r12)
            com.facebook.appevents.cloudbridge.ConversionsAPISection r2 = com.facebook.appevents.cloudbridge.ConversionsAPISection.APP_DATA
            java.lang.String r2 = r2.getRawValue()
            r3 = r26
            r1.put(r2, r3)
            r1.putAll(r15)
            int[] r2 = com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.C2326c.f8500c
            int r3 = r4.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto L_0x042c
            r3 = 2
            if (r2 == r3) goto L_0x0401
            goto L_0x0468
        L_0x0401:
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x0408
            goto L_0x0468
        L_0x0408:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r14.iterator()
        L_0x0411:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0469
            java.lang.Object r3 = r2.next()
            java.util.Map r3 = (java.util.Map) r3
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            r4.putAll(r1)
            r4.putAll(r3)
            r0.add(r4)
            goto L_0x0411
        L_0x042c:
            if (r0 != 0) goto L_0x042f
            goto L_0x0468
        L_0x042f:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r2.putAll(r1)
            com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField r1 = com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField.EVENT_NAME
            java.lang.String r1 = r1.getRawValue()
            com.facebook.appevents.cloudbridge.OtherEventConstants r3 = com.facebook.appevents.cloudbridge.OtherEventConstants.MOBILE_APP_INSTALL
            java.lang.String r3 = r3.getRawValue()
            r2.put(r1, r3)
            com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField r1 = com.facebook.appevents.cloudbridge.ConversionsAPICustomEventField.EVENT_TIME
            java.lang.String r1 = r1.getRawValue()
            r2.put(r1, r0)
            java.util.List r0 = p583jk.C17875h.m44280D(r2)
            goto L_0x0469
        L_0x0454:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r3)
            throw r0
        L_0x045a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r11)
            throw r0
        L_0x0460:
            r20 = r2
            r21 = r5
            r19 = r8
            r22 = r9
        L_0x0468:
            r0 = 0
        L_0x0469:
            if (r0 != 0) goto L_0x046d
            goto L_0x0683
        L_0x046d:
            java.util.List r1 = m6193c()
            r1.addAll(r0)
            java.util.List r0 = m6193c()
            int r0 = r0.size()
            int r0 = r0 + -1000
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            if (r0 <= 0) goto L_0x04a4
            java.util.List r1 = m6193c()
            java.util.List r0 = kotlin.collections.C23825c.m58508e0(r1, r0)
            boolean r1 = r0 instanceof nf0.C24497a
            if (r1 == 0) goto L_0x049d
            boolean r1 = r0 instanceof nf0.C24499c
            if (r1 == 0) goto L_0x0496
            goto L_0x049d
        L_0x0496:
            java.lang.String r1 = "kotlin.collections.MutableList"
            mf0.C24369n.m61247c(r0, r1)
            r1 = 0
            throw r1
        L_0x049d:
            java.lang.String r1 = "<set-?>"
            mf0.C24362h.m61211f(r0, r1)
            f8504d = r0
        L_0x04a4:
            java.util.List r0 = m6193c()
            int r0 = r0.size()
            r1 = 10
            int r0 = java.lang.Math.min(r0, r1)
            java.util.List r1 = m6193c()
            rf0.h r2 = new rf0.h
            int r3 = r0 + -1
            r4 = 0
            r2.<init>(r4, r3)
            java.util.List r1 = kotlin.collections.C23825c.m58494F0(r1, r2)
            java.util.List r2 = m6193c()
            java.util.List r0 = r2.subList(r4, r0)
            r0.clear()
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r1)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.String r3 = "data"
            r2.put(r3, r0)
            com.facebook.appevents.cloudbridge.a$a r0 = f8503c
            if (r0 == 0) goto L_0x064f
            java.lang.String r0 = r0.f8508c
            java.lang.String r3 = "accessKey"
            r2.put(r3, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r2)
            com.facebook.internal.x$a r2 = com.facebook.internal.C2436x.f8729d
            com.facebook.LoggingBehavior r2 = com.facebook.LoggingBehavior.APP_EVENTS
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r22
            r4 = 1
            r3[r4] = r29
            r4 = 2
            java.lang.String r5 = r0.toString(r4)
            java.lang.String r6 = "jsonBodyStr.toString(2)"
            mf0.C24362h.m61210e(r5, r6)
            r3[r4] = r5
            java.lang.String r4 = "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n"
            r5 = r21
            com.facebook.internal.C2436x.C2437a.m6390b(r2, r5, r4, r3)
            java.lang.String r0 = r0.toString()
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/json"
            r2.<init>(r3, r4)
            java.util.Map r2 = p389bl.C13637c.m34046A(r2)
            r3 = 60000(0xea60, float:8.4078E-41)
            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1 r4 = new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1
            r4.<init>(r1)
            java.lang.String r1 = "UTF-8"
            java.lang.String r6 = "urlStr"
            r7 = r22
            mf0.C24362h.m61211f(r7, r6)
            java.net.URL r6 = new java.net.URL     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            r6.<init>(r7)     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            java.net.URLConnection r6 = r6.openConnection()     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            java.lang.Object r6 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r6)     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            java.net.URLConnection r6 = (java.net.URLConnection) r6     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            if (r6 == 0) goto L_0x0613
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            r7 = r20
            r6.setRequestMethod(r7)     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            java.util.Set r8 = r2.keySet()     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            if (r8 != 0) goto L_0x054e
            goto L_0x0568
        L_0x054e:
            java.util.Iterator r8 = r8.iterator()     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
        L_0x0552:
            boolean r9 = r8.hasNext()     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            if (r9 == 0) goto L_0x0568
            java.lang.Object r9 = r8.next()     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            java.lang.Object r10 = r2.get(r9)     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            r6.setRequestProperty(r9, r10)     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            goto L_0x0552
        L_0x0568:
            java.lang.String r2 = r6.getRequestMethod()     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            boolean r2 = r2.equals(r7)     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            if (r2 != 0) goto L_0x0581
            java.lang.String r2 = r6.getRequestMethod()     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            java.lang.String r7 = "PUT"
            boolean r2 = r2.equals(r7)     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            if (r2 == 0) goto L_0x057f
            goto L_0x0581
        L_0x057f:
            r2 = 0
            goto L_0x0582
        L_0x0581:
            r2 = 1
        L_0x0582:
            r6.setDoOutput(r2)     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            r6.setConnectTimeout(r3)     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            java.io.OutputStream r3 = r6.getOutputStream()     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            r2.<init>(r3)     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            java.io.OutputStreamWriter r7 = new java.io.OutputStreamWriter     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            r7.<init>(r2, r1)     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            r3.<init>(r7)     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            r3.write(r0)     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            r3.flush()     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            r3.close()     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            r2.close()     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            r0.<init>()     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            java.util.HashSet<java.lang.Integer> r2 = f8501a     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            int r3 = r6.getResponseCode()     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            boolean r2 = r2.contains(r3)     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            if (r2 == 0) goto L_0x05e4
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            java.io.InputStream r7 = r6.getInputStream()     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            r3.<init>(r7, r1)     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            r2.<init>(r3)     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
        L_0x05ca:
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x05db }
            if (r1 == 0) goto L_0x05d4
            r0.append(r1)     // Catch:{ all -> 0x05db }
            goto L_0x05ca
        L_0x05d4:
            bf0.d r1 = bf0.C21050d.f52856a     // Catch:{ all -> 0x05db }
            r1 = 0
            p584jl.C17885a.m44462t(r2, r1)     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            goto L_0x05e4
        L_0x05db:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x05de }
        L_0x05de:
            r0 = move-exception
            r3 = r0
            p584jl.C17885a.m44462t(r2, r1)     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            throw r3     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
        L_0x05e4:
            java.lang.String r0 = r0.toString()     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            java.lang.String r1 = "connResponseSB.toString()"
            mf0.C24362h.m61210e(r0, r1)     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            com.facebook.internal.x$a r1 = com.facebook.internal.C2436x.f8729d     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            com.facebook.LoggingBehavior r1 = com.facebook.LoggingBehavior.APP_EVENTS     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            java.lang.String r2 = "\nResponse Received: \n%s\n%s"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            r7 = 0
            r3[r7] = r0     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            int r7 = r6.getResponseCode()     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            r8 = 1
            r3[r8] = r7     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            com.facebook.internal.C2436x.C2437a.m6390b(r1, r5, r2, r3)     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            int r1 = r6.getResponseCode()     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            r4.invoke(r0, r1)     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            goto L_0x0683
        L_0x0613:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            java.lang.String r1 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            r0.<init>(r1)     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
            throw r0     // Catch:{ UnknownHostException -> 0x0630, IOException -> 0x061b }
        L_0x061b:
            r0 = move-exception
            com.facebook.internal.x$a r1 = com.facebook.internal.C2436x.f8729d
            com.facebook.LoggingBehavior r1 = com.facebook.LoggingBehavior.DEVELOPER_ERRORS
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r0.toString()
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "Send to server failed: \n%s"
            com.facebook.internal.C2436x.C2437a.m6390b(r1, r5, r0, r2)
            goto L_0x0683
        L_0x0630:
            r0 = move-exception
            r2 = 1
            r3 = 0
            com.facebook.internal.x$a r1 = com.facebook.internal.C2436x.f8729d
            com.facebook.LoggingBehavior r1 = com.facebook.LoggingBehavior.APP_EVENTS
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r0.toString()
            r2[r3] = r0
            java.lang.String r0 = "Connection failed, retrying: \n%s"
            com.facebook.internal.C2436x.C2437a.m6390b(r1, r5, r0, r2)
            r0 = 503(0x1f7, float:7.05E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 0
            r4.invoke(r1, r0)
            goto L_0x0683
        L_0x064f:
            r1 = 0
            mf0.C24362h.m61217l(r19)
            throw r1
        L_0x0654:
            r19 = r8
            mf0.C24362h.m61217l(r19)     // Catch:{ UninitializedPropertyAccessException -> 0x065b }
            r1 = 0
            throw r1     // Catch:{ UninitializedPropertyAccessException -> 0x065b }
        L_0x065b:
            r0 = move-exception
            goto L_0x0664
        L_0x065d:
            r19 = r8
            mf0.C24362h.m61217l(r19)     // Catch:{ UninitializedPropertyAccessException -> 0x065b }
            r1 = 0
            throw r1     // Catch:{ UninitializedPropertyAccessException -> 0x065b }
        L_0x0664:
            com.facebook.internal.x$a r1 = com.facebook.internal.C2436x.f8729d
            com.facebook.LoggingBehavior r1 = com.facebook.LoggingBehavior.DEVELOPER_ERRORS
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "\n Credentials not initialized Error when logging: \n%s"
            com.facebook.internal.C2436x.C2437a.m6390b(r1, r5, r0, r2)
            goto L_0x0683
        L_0x0674:
            r2 = 1
            r3 = 0
            com.facebook.internal.x$a r0 = com.facebook.internal.C2436x.f8729d
            com.facebook.LoggingBehavior r0 = com.facebook.LoggingBehavior.DEVELOPER_ERRORS
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r29
            java.lang.String r2 = "\n GraphPathComponents Error when logging: \n%s"
            com.facebook.internal.C2436x.C2437a.m6390b(r0, r5, r2, r1)
        L_0x0683:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.cloudbridge.C2329a.m6191a(com.facebook.GraphRequest):void");
    }

    /* renamed from: b */
    public static final void m6192b(String str, String str2, String str3) {
        C24362h.m61211f(str2, "url");
        C2436x.C2437a aVar = C2436x.f8729d;
        C2436x.C2437a.m6390b(LoggingBehavior.APP_EVENTS, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", str, str2, str3);
        f8503c = new C2330a(str, str2, str3);
        f8504d = new ArrayList();
    }

    /* renamed from: c */
    public static List m6193c() {
        List<Map<String, Object>> list = f8504d;
        if (list != null) {
            return list;
        }
        C24362h.m61217l("transformedEvents");
        throw null;
    }
}
