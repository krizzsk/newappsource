package com.fyber.inneractive.sdk.network;

import android.os.Handler;
import android.os.HandlerThread;
import com.fyber.inneractive.sdk.util.C3719o0;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.network.c */
public class C2891c implements C3719o0 {

    /* renamed from: a */
    public final BlockingQueue<JSONObject> f9876a = new LinkedBlockingQueue();

    /* renamed from: b */
    public JSONArray f9877b = new JSONArray();

    /* renamed from: c */
    public final HandlerThread f9878c = new HandlerThread("EventCollectorHandlerThread", 0);

    /* renamed from: d */
    public Handler f9879d;

    /* renamed from: e */
    public int f9880e;

    /* renamed from: f */
    public boolean f9881f = false;

    /* renamed from: g */
    public boolean f9882g = false;

    /* renamed from: com.fyber.inneractive.sdk.network.c$a */
    public class C2892a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f9883a;

        /* renamed from: b */
        public final /* synthetic */ long f9884b;

        public C2892a(int i, long j) {
            this.f9883a = i;
            this.f9884b = j;
        }

        public void run() {
            C2891c.this.f9879d.sendEmptyMessageDelayed(this.f9883a, this.f9884b);
        }
    }

    /* renamed from: a */
    public final void mo13682a(int i, long j) {
        Handler handler = this.f9879d;
        if (handler != null) {
            handler.post(new C2892a(i, j));
        }
    }

    /* JADX WARNING: type inference failed for: r11v21, types: [org.json.JSONObject] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r11) {
        /*
            r10 = this;
            int r11 = r11.what
            r0 = 12312329(0xbbdf09, float:1.7253248E-38)
            if (r11 == r0) goto L_0x000c
            r1 = 20150330(0x133783a, float:3.2963366E-38)
            if (r11 != r1) goto L_0x0087
        L_0x000c:
            boolean r11 = r10.f9881f
            if (r11 == 0) goto L_0x0078
            java.util.concurrent.BlockingQueue<org.json.JSONObject> r11 = r10.f9876a
            int r11 = r11.size()
            if (r11 <= 0) goto L_0x0078
        L_0x0018:
            java.util.concurrent.BlockingQueue<org.json.JSONObject> r11 = r10.f9876a
            int r11 = r11.size()
            r1 = 0
            if (r11 <= 0) goto L_0x0034
            java.util.concurrent.BlockingQueue<org.json.JSONObject> r11 = r10.f9876a     // Catch:{ all -> 0x002b }
            java.lang.Object r11 = r11.poll()     // Catch:{ all -> 0x002b }
            org.json.JSONObject r11 = (org.json.JSONObject) r11     // Catch:{ all -> 0x002b }
            r1 = r11
            goto L_0x002c
        L_0x002b:
        L_0x002c:
            if (r1 == 0) goto L_0x0018
            org.json.JSONArray r11 = r10.f9877b
            r11.put(r1)
            goto L_0x0018
        L_0x0034:
            org.json.JSONArray r11 = r10.f9877b
            int r11 = r11.length()
            if (r11 <= 0) goto L_0x0078
            org.json.JSONArray r5 = r10.f9877b
            java.lang.String r11 = com.fyber.inneractive.sdk.config.C2618a.m6643b()
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x004b }
            goto L_0x004c
        L_0x004b:
        L_0x004c:
            if (r1 == 0) goto L_0x0071
            com.fyber.inneractive.sdk.network.g0 r8 = new com.fyber.inneractive.sdk.network.g0
            com.fyber.inneractive.sdk.network.e r9 = new com.fyber.inneractive.sdk.network.e
            r2 = r9
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4, r5, r6)
            com.fyber.inneractive.sdk.network.v r2 = com.fyber.inneractive.sdk.network.C2937v.m7259b()
            com.fyber.inneractive.sdk.network.g r2 = r2.mo13722a()
            r8.<init>(r9, r11, r1, r2)
            com.fyber.inneractive.sdk.config.IAConfigManager r11 = com.fyber.inneractive.sdk.config.IAConfigManager.f9202J
            com.fyber.inneractive.sdk.network.w r11 = r11.f9232t
            java.util.concurrent.BlockingQueue<com.fyber.inneractive.sdk.network.b0<?>> r11 = r11.f10064a
            r11.offer(r8)
            com.fyber.inneractive.sdk.network.m0 r11 = com.fyber.inneractive.sdk.network.C2916m0.QUEUED
            r8.mo13666a((com.fyber.inneractive.sdk.network.C2916m0) r11)
        L_0x0071:
            org.json.JSONArray r11 = new org.json.JSONArray
            r11.<init>()
            r10.f9877b = r11
        L_0x0078:
            android.os.Handler r11 = r10.f9879d
            if (r11 == 0) goto L_0x0087
            r11.removeMessages(r0)
            int r11 = r10.f9880e
            int r11 = r11 * 1000
            long r1 = (long) r11
            r10.mo13682a(r0, r1)
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.C2891c.handleMessage(android.os.Message):void");
    }
}
