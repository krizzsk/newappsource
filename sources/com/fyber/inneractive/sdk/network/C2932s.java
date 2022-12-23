package com.fyber.inneractive.sdk.network;

import android.content.SharedPreferences;

/* renamed from: com.fyber.inneractive.sdk.network.s */
public class C2932s {

    /* renamed from: a */
    public SharedPreferences f10056a = null;

    /* renamed from: com.fyber.inneractive.sdk.network.s$a */
    public static final class C2933a {

        /* renamed from: a */
        public static C2932s f10057a = new C2932s();
    }

    /* JADX WARNING: type inference failed for: r20v0, types: [com.fyber.inneractive.sdk.flow.j<? extends com.fyber.inneractive.sdk.response.e>, com.fyber.inneractive.sdk.flow.j] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m7255a(android.content.Context r17, java.lang.String r18, java.lang.String r19, com.fyber.inneractive.sdk.flow.C2776j<? extends com.fyber.inneractive.sdk.response.C3648e> r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.String r4 = "Got exception adding param to json object: %s, %s"
            r5 = 0
            if (r0 == 0) goto L_0x0125
            if (r1 == 0) goto L_0x0125
            com.fyber.inneractive.sdk.response.e r6 = r20.mo13293c()
            if (r6 != 0) goto L_0x0017
            goto L_0x0125
        L_0x0017:
            com.fyber.inneractive.sdk.network.s r6 = com.fyber.inneractive.sdk.network.C2932s.C2933a.f10057a
            android.content.SharedPreferences r7 = r6.f10056a
            if (r7 == 0) goto L_0x001e
            goto L_0x0026
        L_0x001e:
            java.lang.String r7 = "AutoWebActionPrefs"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r7, r5)
            r6.f10056a = r0
        L_0x0026:
            r0 = 1
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r7[r5] = r1
            java.lang.String r8 = "IAautoWebActionReporter: reporting action: %s"
            com.fyber.inneractive.sdk.util.IAlog.m9905d(r8, r7)
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r7[r5] = r2
            java.lang.String r8 = "IAautoWebActionReporter: url: %s"
            com.fyber.inneractive.sdk.util.IAlog.m9905d(r8, r7)
            com.fyber.inneractive.sdk.config.IAConfigManager r7 = com.fyber.inneractive.sdk.config.IAConfigManager.f9202J
            com.fyber.inneractive.sdk.config.q r8 = r7.f9221i
            boolean r8 = r8.f9361d
            if (r8 != 0) goto L_0x004a
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r1 = "IAautoWebActionReporter: Report of Non user web actions disabled!"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r1, r0)
            goto L_0x0124
        L_0x004a:
            com.fyber.inneractive.sdk.network.q$a r8 = new com.fyber.inneractive.sdk.network.q$a
            com.fyber.inneractive.sdk.network.o r9 = com.fyber.inneractive.sdk.network.C2922o.MRAID_AUTO_ACTION_DETECTED
            com.fyber.inneractive.sdk.external.InneractiveAdRequest r10 = r3.f9590a
            com.fyber.inneractive.sdk.response.e r11 = r20.mo13293c()
            com.fyber.inneractive.sdk.config.global.s r3 = r3.f9592c
            org.json.JSONArray r3 = r3.mo13268c()
            r8.<init>(r11)
            r8.f10041b = r9
            r8.f10040a = r10
            r8.f10043d = r3
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r9 = "action"
            r10 = 2
            r3.put(r9, r1)     // Catch:{ Exception -> 0x006f }
            goto L_0x0078
        L_0x006f:
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r5] = r9
            r11[r0] = r1
            com.fyber.inneractive.sdk.util.IAlog.m9906e(r4, r11)
        L_0x0078:
            boolean r1 = android.text.TextUtils.isEmpty(r19)
            if (r1 != 0) goto L_0x008e
            java.lang.String r1 = "url"
            r3.put(r1, r2)     // Catch:{ Exception -> 0x0085 }
            goto L_0x008e
        L_0x0085:
            java.lang.Object[] r9 = new java.lang.Object[r10]
            r9[r5] = r1
            r9[r0] = r2
            com.fyber.inneractive.sdk.util.IAlog.m9906e(r4, r9)
        L_0x008e:
            android.content.SharedPreferences r1 = r6.f10056a
            java.lang.String r2 = "lastReportTS"
            r11 = 0
            long r13 = r1.getLong(r2, r11)
            java.lang.String r1 = "UTC"
            java.util.TimeZone r1 = p988j$.util.DesugarTimeZone.getTimeZone(r1)
            java.util.Calendar r9 = java.util.Calendar.getInstance(r1)
            java.util.Calendar r1 = java.util.Calendar.getInstance(r1)
            r1.setTimeInMillis(r13)
            java.lang.String r15 = "numReportsToday"
            int r16 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r16 <= 0) goto L_0x00c8
            r11 = 6
            int r12 = r9.get(r11)
            int r1 = r1.get(r11)
            if (r12 != r1) goto L_0x00c8
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r11 = "IAautoWebActionReporter: encountered same date"
            com.fyber.inneractive.sdk.util.IAlog.m9905d(r11, r1)
            android.content.SharedPreferences r1 = r6.f10056a
            int r1 = r1.getInt(r15, r5)
            goto L_0x00c9
        L_0x00c8:
            r1 = 0
        L_0x00c9:
            com.fyber.inneractive.sdk.config.q r7 = r7.f9221i
            int r7 = r7.f9362e
            java.lang.Object[] r11 = new java.lang.Object[r10]
            int r12 = r1 + 1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r11[r5] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            r11[r0] = r13
            java.lang.String r13 = "IAautoWebActionReporter: day counter: %d max: %d"
            com.fyber.inneractive.sdk.util.IAlog.m9905d(r13, r11)
            if (r1 >= r7) goto L_0x00ee
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r7 = "IAautoWebActionReporter: adding ad data"
            com.fyber.inneractive.sdk.util.IAlog.m9905d(r7, r1)
            r8.f10046g = r0
            goto L_0x00f5
        L_0x00ee:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r7 = "IAautoWebActionReporter: not adding ad data"
            com.fyber.inneractive.sdk.util.IAlog.m9905d(r7, r1)
        L_0x00f5:
            java.lang.String r1 = "daily_count"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r3.put(r1, r7)     // Catch:{ Exception -> 0x00ff }
            goto L_0x0108
        L_0x00ff:
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r5] = r1
            r10[r0] = r7
            com.fyber.inneractive.sdk.util.IAlog.m9906e(r4, r10)
        L_0x0108:
            org.json.JSONArray r0 = r8.f10045f
            r0.put(r3)
            r0 = 0
            r8.mo13717a((java.lang.String) r0)
            android.content.SharedPreferences r0 = r6.f10056a
            android.content.SharedPreferences$Editor r0 = r0.edit()
            long r3 = r9.getTimeInMillis()
            r0.putLong(r2, r3)
            r0.putInt(r15, r12)
            r0.apply()
        L_0x0124:
            return
        L_0x0125:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r1 = "Invalid report request parameters!"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.C2932s.m7255a(android.content.Context, java.lang.String, java.lang.String, com.fyber.inneractive.sdk.flow.j):void");
    }
}
