package com.fyber.inneractive.sdk.bidder;

import android.content.BroadcastReceiver;

/* renamed from: com.fyber.inneractive.sdk.bidder.e */
public class C2589e extends BroadcastReceiver {

    /* renamed from: a */
    public final C2588d f9154a;

    public C2589e(C2588d dVar) {
        this.f9154a = dVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r7, android.content.Intent r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x015e
            java.lang.String r7 = r8.getAction()
            if (r7 == 0) goto L_0x015e
            java.lang.String r7 = r8.getAction()
            r7.getClass()
            int r0 = r7.hashCode()
            r1 = 4
            r2 = -1
            r3 = 2
            r4 = 0
            r5 = 1
            switch(r0) {
                case -1538406691: goto L_0x005f;
                case -1530327060: goto L_0x0054;
                case -1076576821: goto L_0x0049;
                case 1123270207: goto L_0x003e;
                case 1779291251: goto L_0x0033;
                case 2070024785: goto L_0x0028;
                case 2106958107: goto L_0x001d;
                default: goto L_0x001b;
            }
        L_0x001b:
            r7 = -1
            goto L_0x0069
        L_0x001d:
            java.lang.String r0 = "android.app.action.INTERRUPTION_FILTER_CHANGED"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0026
            goto L_0x001b
        L_0x0026:
            r7 = 6
            goto L_0x0069
        L_0x0028:
            java.lang.String r0 = "android.media.RINGER_MODE_CHANGED"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0031
            goto L_0x001b
        L_0x0031:
            r7 = 5
            goto L_0x0069
        L_0x0033:
            java.lang.String r0 = "android.os.action.POWER_SAVE_MODE_CHANGED"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x003c
            goto L_0x001b
        L_0x003c:
            r7 = 4
            goto L_0x0069
        L_0x003e:
            java.lang.String r0 = "android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0047
            goto L_0x001b
        L_0x0047:
            r7 = 3
            goto L_0x0069
        L_0x0049:
            java.lang.String r0 = "android.intent.action.AIRPLANE_MODE"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0052
            goto L_0x001b
        L_0x0052:
            r7 = 2
            goto L_0x0069
        L_0x0054:
            java.lang.String r0 = "android.bluetooth.adapter.action.STATE_CHANGED"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x005d
            goto L_0x001b
        L_0x005d:
            r7 = 1
            goto L_0x0069
        L_0x005f:
            java.lang.String r0 = "android.intent.action.BATTERY_CHANGED"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0068
            goto L_0x001b
        L_0x0068:
            r7 = 0
        L_0x0069:
            switch(r7) {
                case 0: goto L_0x0114;
                case 1: goto L_0x00f3;
                case 2: goto L_0x00dd;
                case 3: goto L_0x00f3;
                case 4: goto L_0x00cc;
                case 5: goto L_0x00a1;
                case 6: goto L_0x006e;
                default: goto L_0x006c;
            }
        L_0x006c:
            goto L_0x015e
        L_0x006e:
            com.fyber.inneractive.sdk.bidder.d r7 = r6.f9154a
            com.fyber.inneractive.sdk.bidder.a r7 = (com.fyber.inneractive.sdk.bidder.C2566a) r7
            r7.getClass()
            android.app.Application r8 = com.fyber.inneractive.sdk.util.C3707l.f12893a
            java.lang.String r0 = "notification"
            java.lang.Object r8 = r8.getSystemService(r0)
            android.app.NotificationManager r8 = (android.app.NotificationManager) r8
            int r8 = r8.getCurrentInterruptionFilter()
            if (r8 < r3) goto L_0x0088
            if (r8 > r1) goto L_0x0088
            r4 = 1
        L_0x0088:
            com.fyber.inneractive.sdk.bidder.c r8 = r7.f9069c
            java.lang.Boolean r8 = r8.f9151y
            if (r8 == 0) goto L_0x0094
            boolean r8 = r8.booleanValue()
            if (r8 == r4) goto L_0x015e
        L_0x0094:
            com.fyber.inneractive.sdk.bidder.c r8 = r7.f9069c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r8.f9151y = r0
            r7.mo13017b()
            goto L_0x015e
        L_0x00a1:
            com.fyber.inneractive.sdk.bidder.d r7 = r6.f9154a
            com.fyber.inneractive.sdk.bidder.a r7 = (com.fyber.inneractive.sdk.bidder.C2566a) r7
            r7.getClass()
            java.lang.String r0 = "android.media.EXTRA_RINGER_MODE"
            int r8 = r8.getIntExtra(r0, r2)
            if (r8 == 0) goto L_0x00b2
            if (r8 != r5) goto L_0x00b3
        L_0x00b2:
            r4 = 1
        L_0x00b3:
            com.fyber.inneractive.sdk.bidder.c r8 = r7.f9069c
            java.lang.Boolean r8 = r8.f9152z
            if (r8 == 0) goto L_0x00bf
            boolean r8 = r8.booleanValue()
            if (r8 == r4) goto L_0x015e
        L_0x00bf:
            com.fyber.inneractive.sdk.bidder.c r8 = r7.f9069c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r8.f9152z = r0
            r7.mo13017b()
            goto L_0x015e
        L_0x00cc:
            com.fyber.inneractive.sdk.bidder.d r7 = r6.f9154a
            com.fyber.inneractive.sdk.bidder.a r7 = (com.fyber.inneractive.sdk.bidder.C2566a) r7
            com.fyber.inneractive.sdk.bidder.c r8 = r7.f9069c
            java.lang.Boolean r0 = com.fyber.inneractive.sdk.serverapi.C3655a.m9868n()
            r8.f9148v = r0
            r7.mo13017b()
            goto L_0x015e
        L_0x00dd:
            com.fyber.inneractive.sdk.bidder.d r7 = r6.f9154a
            com.fyber.inneractive.sdk.bidder.a r7 = (com.fyber.inneractive.sdk.bidder.C2566a) r7
            com.fyber.inneractive.sdk.bidder.c r0 = r7.f9069c
            java.lang.String r1 = "state"
            boolean r8 = r8.getBooleanExtra(r1, r4)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r0.f9150x = r8
            r7.mo13017b()
            goto L_0x015e
        L_0x00f3:
            com.fyber.inneractive.sdk.bidder.d r7 = r6.f9154a
            com.fyber.inneractive.sdk.bidder.a r7 = (com.fyber.inneractive.sdk.bidder.C2566a) r7
            r7.getClass()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r1 = "android.bluetooth.adapter.extra.CONNECTION_STATE"
            int r8 = r8.getIntExtra(r1, r0)
            if (r8 != r3) goto L_0x0107
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            goto L_0x0108
        L_0x0107:
            r8 = 0
        L_0x0108:
            com.fyber.inneractive.sdk.bidder.c r0 = r7.f9069c
            java.lang.Boolean r1 = r0.f9147u
            if (r1 == r8) goto L_0x015e
            r0.f9147u = r8
            r7.mo13017b()
            goto L_0x015e
        L_0x0114:
            com.fyber.inneractive.sdk.bidder.d r7 = r6.f9154a
            com.fyber.inneractive.sdk.bidder.a r7 = (com.fyber.inneractive.sdk.bidder.C2566a) r7
            com.fyber.inneractive.sdk.serverapi.b r0 = r7.f9068b
            r0.getClass()
            java.lang.String r0 = "plugged"
            int r0 = r8.getIntExtra(r0, r2)
            if (r0 == r5) goto L_0x0129
            if (r0 == r3) goto L_0x0129
            if (r0 != r1) goto L_0x012a
        L_0x0129:
            r4 = 1
        L_0x012a:
            com.fyber.inneractive.sdk.bidder.c r0 = r7.f9069c
            java.lang.Boolean r0 = r0.f9119E
            if (r0 == 0) goto L_0x0136
            boolean r0 = r0.booleanValue()
            if (r0 == r4) goto L_0x0141
        L_0x0136:
            com.fyber.inneractive.sdk.bidder.c r0 = r7.f9069c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r0.f9119E = r1
            r7.mo13017b()
        L_0x0141:
            com.fyber.inneractive.sdk.serverapi.b r0 = r7.f9068b
            java.lang.String r0 = r0.mo15302a((android.content.Intent) r8)
            com.fyber.inneractive.sdk.bidder.c r1 = r7.f9069c
            java.lang.String r1 = r1.f9120F
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x015e
            com.fyber.inneractive.sdk.bidder.c r0 = r7.f9069c
            com.fyber.inneractive.sdk.serverapi.b r1 = r7.f9068b
            java.lang.String r8 = r1.mo15302a((android.content.Intent) r8)
            r0.f9120F = r8
            r7.mo13017b()
        L_0x015e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.bidder.C2589e.onReceive(android.content.Context, android.content.Intent):void");
    }
}
