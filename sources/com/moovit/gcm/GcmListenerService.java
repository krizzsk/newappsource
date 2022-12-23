package com.moovit.gcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.appboy.AppboyFirebaseMessagingService;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.gcm.payload.GcmPayload;
import com.tranzmate.moovit.protocol.kinesis.MVPushType;
import f10.C16930a;
import f10.C16936g;
import f10.C16937h;
import i10.C17537a;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import k10.C17993a;
import l10.C18167a;
import p130j2.C5367a;
import p241s0.C6313h;
import p269u2.C6677a;
import p435de.C16596f;
import p528gz.C17269d;
import p543hq.C17474b;
import p824tp.C19731i;

public class GcmListenerService extends FirebaseMessagingService {

    /* renamed from: b */
    public static final Uri f41490b = Uri.parse("moovit://payload");

    /* renamed from: c */
    public static final List<String> f41491c = Arrays.asList(new String[]{"ping", "metro_update", "upload_logs", "payment_account_invalidate", "tod_rides_invalidate", "invalidate_firebase_config"});

    /* renamed from: c */
    public static String m40501c(RemoteMessage remoteMessage) {
        String string = remoteMessage.f36585b.getString("collapse_key");
        if (f41491c.contains(string)) {
            return string;
        }
        return remoteMessage.getData().get("command");
    }

    /* renamed from: d */
    public static void m40502d(Context context, RemoteMessage remoteMessage) {
        MVPushType mVPushType;
        String string = remoteMessage.f36585b.getString("from");
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.PUSH_RECEIVED);
        aVar.mo49939g(AnalyticsAttributeKey.PUSH_ID, (String) ((C6313h) remoteMessage.getData()).getOrDefault("id", null));
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.PUSH_TYPE;
        String c = m40501c(remoteMessage);
        String str = (String) ((C6313h) remoteMessage.getData()).getOrDefault("presentation_type", null);
        if (c != null) {
            mVPushType = MVPushType.COMMAND;
        } else if ("pop-up".equals(str)) {
            mVPushType = MVPushType.POPUP;
        } else if ("message-bar".equals(str)) {
            mVPushType = MVPushType.MESSAGE_BAR;
        } else {
            mVPushType = MVPushType.NOTIFICATION;
        }
        aVar.mo49939g(analyticsAttributeKey, String.valueOf(mVPushType.getValue()));
        boolean a = C18167a.m44869a(string);
        if (a) {
            aVar.mo49939g(AnalyticsAttributeKey.PUSH_TOPIC, string);
        }
        C6677a aVar2 = C19731i.m47197a(context).f50173c;
        C17474b[] bVarArr = {aVar.mo49933a()};
        aVar2.getClass();
        C6677a.m15759j(context, AnalyticsFlowKey.PUSH, !a, bVarArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m40503e(android.content.Context r5, com.google.firebase.messaging.RemoteMessage r6) {
        /*
            android.os.Bundle r0 = r6.f36585b
            java.lang.String r1 = "from"
            java.lang.String r0 = r0.getString(r1)
            java.util.Map r6 = r6.getData()
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r2 = com.moovit.analytics.AnalyticsEventKey.PUSH_PARSE_ERROR
            r1.<init>(r2)
            r2 = 0
            if (r6 != 0) goto L_0x0017
            goto L_0x0022
        L_0x0017:
            s0.h r6 = (p241s0.C6313h) r6
            java.lang.String r3 = "id"
            java.lang.Object r6 = r6.getOrDefault(r3, r2)
            r2 = r6
            java.lang.String r2 = (java.lang.String) r2
        L_0x0022:
            if (r2 == 0) goto L_0x0029
            com.moovit.analytics.AnalyticsAttributeKey r6 = com.moovit.analytics.AnalyticsAttributeKey.PUSH_ID
            r1.mo49939g(r6, r2)
        L_0x0029:
            boolean r6 = l10.C18167a.m44869a(r0)
            if (r6 == 0) goto L_0x0034
            com.moovit.analytics.AnalyticsAttributeKey r2 = com.moovit.analytics.AnalyticsAttributeKey.PUSH_TOPIC
            r1.mo49939g(r2, r0)
        L_0x0034:
            tp.i r0 = p824tp.C19731i.m47197a(r5)
            u2.a r0 = r0.f50173c
            com.moovit.analytics.AnalyticsFlowKey r2 = com.moovit.analytics.AnalyticsFlowKey.PUSH
            r3 = 1
            r6 = r6 ^ r3
            hq.b[] r3 = new p543hq.C17474b[r3]
            r4 = 0
            hq.b r1 = r1.mo49933a()
            r3[r4] = r1
            r0.getClass()
            p269u2.C6677a.m15759j(r5, r2, r6, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.gcm.GcmListenerService.m40503e(android.content.Context, com.google.firebase.messaging.RemoteMessage):void");
    }

    /* renamed from: g */
    public static void m40504g(BroadcastReceiver broadcastReceiver, Context context, String str) {
        Uri uri;
        if (str == null) {
            uri = f41490b;
        } else {
            uri = f41490b.buildUpon().appendEncodedPath(str).build();
        }
        IntentFilter intentFilter = new IntentFilter("com.moovit.PAYLOAD_BROADCAST_ACTION");
        intentFilter.addDataScheme(uri.getScheme());
        intentFilter.addDataAuthority(uri.getHost(), (String) null);
        intentFilter.addDataPath(uri.getPath(), 1);
        C5367a.m13473a(context).mo21146b(broadcastReceiver, intentFilter);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.moovit.image.model.Image] */
    /* JADX WARNING: type inference failed for: r2v3, types: [com.moovit.image.model.Image] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47937f(com.google.firebase.messaging.RemoteMessage r11, com.moovit.gcm.payload.GcmPayload r12) {
        /*
            r10 = this;
            java.util.Map r11 = r11.getData()
            sz.r r0 = f10.C16936g.f43954a
            java.lang.String r0 = "screen"
            r1 = r11
            s0.h r1 = (p241s0.C6313h) r1
            r2 = 0
            java.lang.Object r0 = r1.getOrDefault(r0, r2)
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            java.lang.String r1 = "dashboard"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0026
            java.lang.String r1 = "near_me"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            java.lang.String r0 = "home"
        L_0x0028:
            com.moovit.gcm.condition.GcmCompoundCondition r5 = f10.C16936g.m42765a(r11)
            java.lang.String r1 = "text"
            s0.h r11 = (p241s0.C6313h) r11
            java.lang.Object r1 = r11.getOrDefault(r1, r2)
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r1 = "color"
            java.lang.Object r1 = r11.getOrDefault(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            int r8 = java.lang.Integer.parseInt(r1)
            java.lang.String r1 = "image_id"
            java.lang.Object r1 = r11.getOrDefault(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0065
            int r1 = java.lang.Integer.parseInt(r1)
            java.lang.String r3 = "image_params"
            java.lang.Object r11 = r11.getOrDefault(r3, r2)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x0061
            r2 = 44
            java.lang.String[] r2 = p977zz.C20964s0.m49080A(r11, r2)
        L_0x0061:
            com.moovit.image.model.Image r2 = com.moovit.image.C16028g.m40832j(r1, r2)
        L_0x0065:
            r7 = r2
            com.moovit.gcm.messagebar.GcmMessageBar r11 = new com.moovit.gcm.messagebar.GcmMessageBar
            r3 = r11
            r4 = r0
            r9 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            h10.b r12 = h10.C17295b.f44674a
            monitor-enter(r12)
            ce0.C21100e.m49355o()     // Catch:{ all -> 0x0083 }
            s0.b r1 = h10.C17295b.m43339a(r10)     // Catch:{ all -> 0x0083 }
            r1.put(r0, r11)     // Catch:{ all -> 0x0083 }
            h10.C17295b.m43340c(r10, r1)     // Catch:{ all -> 0x0083 }
            r12.mo49827b(r10, r0)     // Catch:{ all -> 0x0083 }
            monitor-exit(r12)
            return
        L_0x0083:
            r11 = move-exception
            monitor-exit(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.gcm.GcmListenerService.mo47937f(com.google.firebase.messaging.RemoteMessage, com.moovit.gcm.payload.GcmPayload):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017 A[Catch:{ Exception -> 0x002b }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47938h(com.moovit.gcm.payload.GcmPayload r5) {
        /*
            r4 = this;
            boolean r0 = com.moovit.appdata.UserContextLoader.m40004l(r4)     // Catch:{ Exception -> 0x002b }
            r1 = 0
            if (r0 != 0) goto L_0x0008
            goto L_0x000e
        L_0x0008:
            y90.f r0 = com.moovit.appdata.UserContextLoader.m40005m(r4)     // Catch:{ Exception -> 0x002b }
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r2 = r1
            goto L_0x0015
        L_0x0010:
            tp.a0 r2 = new tp.a0     // Catch:{ Exception -> 0x002b }
            r2.<init>(r0)     // Catch:{ Exception -> 0x002b }
        L_0x0015:
            if (r2 == 0) goto L_0x0041
            c70.e r0 = new c70.e     // Catch:{ Exception -> 0x002b }
            android.content.Context r3 = r4.getApplicationContext()     // Catch:{ Exception -> 0x002b }
            r0.<init>(r3, r2, r1)     // Catch:{ Exception -> 0x002b }
            f10.i r1 = new f10.i     // Catch:{ Exception -> 0x002b }
            java.lang.String r2 = r5.f41546b     // Catch:{ Exception -> 0x002b }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x002b }
            r1.mo52626J()     // Catch:{ Exception -> 0x002b }
            goto L_0x0041
        L_0x002b:
            de.f r0 = p435de.C16596f.m42113a()
            java.lang.String r1 = "Failed update sever with push received request for push id = "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            java.lang.String r5 = r5.f41546b
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.mo49363b(r5)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.gcm.GcmListenerService.mo47938h(com.moovit.gcm.payload.GcmPayload):void");
    }

    public final void onMessageReceived(RemoteMessage remoteMessage) {
        String str;
        Uri uri;
        C17269d.m43283a();
        if (!AppboyFirebaseMessagingService.handleBrazeRemoteMessage(this, remoteMessage)) {
            String string = remoteMessage.f36585b.getString("from");
            Map<String, String> data = remoteMessage.getData();
            boolean z = true;
            try {
                String c = m40501c(remoteMessage);
                if (c != null) {
                    C16930a.m42749a().mo49555f(this, c, remoteMessage.getData());
                } else {
                    GcmPayload b = C16936g.m42766b(data);
                    String str2 = (String) ((C6313h) remoteMessage.getData()).getOrDefault("presentation_type", null);
                    if ("pop-up".equals(str2)) {
                        C17993a.f46075a.mo50494j(this, C16936g.m42769e(b, remoteMessage.getData()));
                    } else if ("message-bar".equals(str2)) {
                        mo47937f(remoteMessage, b);
                    } else {
                        C17537a.f45127a.mo50003b(this, C16936g.m42768d(b, remoteMessage.getData()));
                    }
                    String c2 = b.mo47977c();
                    if (c2 == null) {
                        uri = f41490b;
                    } else {
                        uri = f41490b.buildUpon().appendEncodedPath(c2).build();
                    }
                    Intent intent = new Intent("com.moovit.PAYLOAD_BROADCAST_ACTION", uri);
                    intent.putExtra("payload", b);
                    C5367a.m13473a(this).mo21147c(intent);
                    if (InneractiveMediationDefs.SHOW_HOUSE_AD_YES.equalsIgnoreCase((String) ((C6313h) data).getOrDefault("notify_push_received", null))) {
                        mo47938h(b);
                    }
                }
            } catch (Exception e) {
                C16596f a = C16596f.m42113a();
                StringBuilder l = C13555b.m33973l("From: ", string, ", Push id: ");
                if (data == null) {
                    str = "none";
                } else {
                    str = (String) ((C6313h) remoteMessage.getData()).getOrDefault("id", null);
                }
                l.append(str);
                a.mo49363b(l.toString());
                a.mo49364c(new ApplicationBugException("Error reading a GCM message", e));
                z = false;
            }
            if (z) {
                try {
                    m40502d(this, remoteMessage);
                } catch (Exception e2) {
                    C16596f a2 = C16596f.m42113a();
                    a2.mo49363b("From: " + string + ", successfully: " + z);
                    a2.mo49364c(new ApplicationBugException("Error sending GCM receive analytics", e2));
                }
            } else {
                m40503e(this, remoteMessage);
            }
        }
    }

    public final void onNewToken(String str) {
        super.onNewToken(str);
        C16937h.m42772a(this, str);
    }
}
