package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p484ff.C16958a0;
import p484ff.C16972g;
import p484ff.C16989r;
import p484ff.C16991t;

public class FirebaseMessagingService extends EnhancedIntentService {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    public static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    public static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    public static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);

    private boolean alreadyReceivedMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (queue.contains(str)) {
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    private void dispatchMessage(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (C16991t.m42834f(extras)) {
            C16991t tVar = new C16991t(extras);
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io"));
            try {
                if (!new C16972g(this, tVar, newSingleThreadExecutor).mo49598a()) {
                    newSingleThreadExecutor.shutdown();
                    if (C16989r.m42830c(intent)) {
                        C16989r.m42829b(intent.getExtras(), "_nf");
                    }
                } else {
                    return;
                }
            } finally {
                newSingleThreadExecutor.shutdown();
            }
        }
        onMessageReceived(new RemoteMessage(extras));
    }

    private String getMessageId(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            return intent.getStringExtra("message_id");
        }
        return stringExtra;
    }

    private void handleMessageIntent(Intent intent) {
        if (!alreadyReceivedMessage(intent.getStringExtra("google.message_id"))) {
            passMessageIntentToSdk(intent);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00df A[SYNTHETIC, Splitter:B:53:0x00df] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0173 A[SYNTHETIC, Splitter:B:87:0x0173] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x018a A[SYNTHETIC, Splitter:B:92:0x018a] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x019f A[SYNTHETIC, Splitter:B:97:0x019f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void passMessageIntentToSdk(android.content.Intent r25) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            java.lang.String r2 = "message_type"
            java.lang.String r2 = r0.getStringExtra(r2)
            java.lang.String r3 = "gcm"
            if (r2 != 0) goto L_0x000f
            r2 = r3
        L_0x000f:
            r4 = -1
            int r5 = r2.hashCode()
            r6 = 3
            r7 = 0
            r8 = 2
            r9 = 1
            switch(r5) {
                case -2062414158: goto L_0x003b;
                case 102161: goto L_0x0032;
                case 814694033: goto L_0x0027;
                case 814800675: goto L_0x001c;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x0045
        L_0x001c:
            java.lang.String r3 = "send_event"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0025
            goto L_0x0045
        L_0x0025:
            r4 = 3
            goto L_0x0045
        L_0x0027:
            java.lang.String r3 = "send_error"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0030
            goto L_0x0045
        L_0x0030:
            r4 = 2
            goto L_0x0045
        L_0x0032:
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0039
            goto L_0x0045
        L_0x0039:
            r4 = 1
            goto L_0x0045
        L_0x003b:
            java.lang.String r3 = "deleted_messages"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r4 = 0
        L_0x0045:
            java.lang.String r2 = "google.message_id"
            if (r4 == 0) goto L_0x01fc
            if (r4 == r9) goto L_0x006e
            if (r4 == r8) goto L_0x005a
            if (r4 == r6) goto L_0x0051
            goto L_0x01ff
        L_0x0051:
            java.lang.String r0 = r0.getStringExtra(r2)
            r1.onMessageSent(r0)
            goto L_0x01ff
        L_0x005a:
            java.lang.String r2 = r24.getMessageId(r25)
            com.google.firebase.messaging.SendException r3 = new com.google.firebase.messaging.SendException
            java.lang.String r4 = "error"
            java.lang.String r0 = r0.getStringExtra(r4)
            r3.<init>(r0)
            r1.onSendError(r2, r3)
            goto L_0x01ff
        L_0x006e:
            boolean r3 = p484ff.C16989r.m42830c(r25)
            if (r3 == 0) goto L_0x007d
            android.os.Bundle r3 = r25.getExtras()
            java.lang.String r4 = "_nr"
            p484ff.C16989r.m42829b(r3, r4)
        L_0x007d:
            java.lang.String r3 = r25.getAction()
            java.lang.String r4 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x008b
            r3 = 0
            goto L_0x008f
        L_0x008b:
            boolean r3 = p484ff.C16989r.m42828a()
        L_0x008f:
            if (r3 == 0) goto L_0x01f8
            com.google.firebase.messaging.reporting.MessagingClientEvent$Event r21 = com.google.firebase.messaging.reporting.MessagingClientEvent.Event.MESSAGE_DELIVERED
            r9.f r3 = com.google.firebase.messaging.FirebaseMessaging.getTransportFactory()
            if (r3 != 0) goto L_0x009b
            goto L_0x01f8
        L_0x009b:
            android.os.Bundle r4 = r25.getExtras()
            if (r4 != 0) goto L_0x00a3
            android.os.Bundle r4 = android.os.Bundle.EMPTY
        L_0x00a3:
            int r5 = com.google.firebase.messaging.reporting.MessagingClientEvent.f36602p
            java.lang.String r5 = ""
            com.google.firebase.messaging.reporting.MessagingClientEvent$MessageType r6 = com.google.firebase.messaging.reporting.MessagingClientEvent.MessageType.UNKNOWN
            com.google.firebase.messaging.reporting.MessagingClientEvent$SDKPlatform r6 = com.google.firebase.messaging.reporting.MessagingClientEvent.SDKPlatform.UNKNOWN_OS
            java.lang.String r6 = "google.ttl"
            java.lang.Object r6 = r4.get(r6)
            boolean r10 = r6 instanceof java.lang.Integer
            if (r10 == 0) goto L_0x00bd
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
        L_0x00bb:
            r7 = r6
            goto L_0x00c9
        L_0x00bd:
            boolean r10 = r6 instanceof java.lang.String
            if (r10 == 0) goto L_0x00cf
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NumberFormatException -> 0x00cc }
            int r6 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x00cc }
            goto L_0x00bb
        L_0x00c9:
            r19 = r7
            goto L_0x00d1
        L_0x00cc:
            java.util.Objects.toString(r6)
        L_0x00cf:
            r19 = 0
        L_0x00d1:
            java.lang.String r6 = "google.to"
            java.lang.String r6 = r4.getString(r6)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x00df
        L_0x00dd:
            r14 = r6
            goto L_0x00fd
        L_0x00df:
            qd.d r6 = p743qd.C19107d.m46265d()     // Catch:{ ExecutionException -> 0x01f1, InterruptedException -> 0x01ef }
            java.lang.Object r7 = com.google.firebase.installations.C14459a.f36530m     // Catch:{ ExecutionException -> 0x01f1, InterruptedException -> 0x01ef }
            java.lang.String r7 = "Null is not a valid value of FirebaseApp."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r9, r7)     // Catch:{ ExecutionException -> 0x01f1, InterruptedException -> 0x01ef }
            java.lang.Class<af.c> r7 = p358af.C13436c.class
            java.lang.Object r6 = r6.mo51536b(r7)     // Catch:{ ExecutionException -> 0x01f1, InterruptedException -> 0x01ef }
            com.google.firebase.installations.a r6 = (com.google.firebase.installations.C14459a) r6     // Catch:{ ExecutionException -> 0x01f1, InterruptedException -> 0x01ef }
            com.google.android.gms.tasks.Task r6 = r6.getId()     // Catch:{ ExecutionException -> 0x01f1, InterruptedException -> 0x01ef }
            java.lang.Object r6 = com.google.android.gms.tasks.Tasks.await(r6)     // Catch:{ ExecutionException -> 0x01f1, InterruptedException -> 0x01ef }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ ExecutionException -> 0x01f1, InterruptedException -> 0x01ef }
            goto L_0x00dd
        L_0x00fd:
            qd.d r6 = p743qd.C19107d.m46265d()
            r6.mo51535a()
            android.content.Context r6 = r6.f48568a
            java.lang.String r17 = r6.getPackageName()
            com.google.firebase.messaging.reporting.MessagingClientEvent$SDKPlatform r16 = com.google.firebase.messaging.reporting.MessagingClientEvent.SDKPlatform.ANDROID
            boolean r6 = p484ff.C16991t.m42834f(r4)
            if (r6 == 0) goto L_0x0115
            com.google.firebase.messaging.reporting.MessagingClientEvent$MessageType r6 = com.google.firebase.messaging.reporting.MessagingClientEvent.MessageType.DISPLAY_NOTIFICATION
            goto L_0x0117
        L_0x0115:
            com.google.firebase.messaging.reporting.MessagingClientEvent$MessageType r6 = com.google.firebase.messaging.reporting.MessagingClientEvent.MessageType.DATA_MESSAGE
        L_0x0117:
            r15 = r6
            java.lang.String r2 = r4.getString(r2)
            if (r2 != 0) goto L_0x0124
            java.lang.String r2 = "message_id"
            java.lang.String r2 = r4.getString(r2)
        L_0x0124:
            if (r2 == 0) goto L_0x0128
            r13 = r2
            goto L_0x0129
        L_0x0128:
            r13 = r5
        L_0x0129:
            java.lang.String r2 = "from"
            java.lang.String r2 = r4.getString(r2)
            if (r2 == 0) goto L_0x013a
            java.lang.String r6 = "/topics/"
            boolean r6 = r2.startsWith(r6)
            if (r6 == 0) goto L_0x013a
            goto L_0x013b
        L_0x013a:
            r2 = 0
        L_0x013b:
            if (r2 == 0) goto L_0x0140
            r20 = r2
            goto L_0x0142
        L_0x0140:
            r20 = r5
        L_0x0142:
            java.lang.String r2 = "collapse_key"
            java.lang.String r2 = r4.getString(r2)
            if (r2 == 0) goto L_0x014d
            r18 = r2
            goto L_0x014f
        L_0x014d:
            r18 = r5
        L_0x014f:
            java.lang.String r2 = "google.c.a.m_l"
            java.lang.String r2 = r4.getString(r2)
            if (r2 == 0) goto L_0x015a
            r22 = r2
            goto L_0x015c
        L_0x015a:
            r22 = r5
        L_0x015c:
            java.lang.String r2 = "google.c.a.c_l"
            java.lang.String r2 = r4.getString(r2)
            if (r2 == 0) goto L_0x0167
            r23 = r2
            goto L_0x0169
        L_0x0167:
            r23 = r5
        L_0x0169:
            java.lang.String r2 = "google.c.sender.id"
            boolean r5 = r4.containsKey(r2)
            r6 = 0
            if (r5 == 0) goto L_0x017d
            java.lang.String r2 = r4.getString(r2)     // Catch:{ NumberFormatException -> 0x017c }
            long r4 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x017c }
            goto L_0x01bf
        L_0x017c:
        L_0x017d:
            qd.d r2 = p743qd.C19107d.m46265d()
            r2.mo51535a()
            qd.f r4 = r2.f48570c
            java.lang.String r4 = r4.f48585e
            if (r4 == 0) goto L_0x0190
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x018f }
            goto L_0x01bf
        L_0x018f:
        L_0x0190:
            r2.mo51535a()
            qd.f r2 = r2.f48570c
            java.lang.String r2 = r2.f48582b
            java.lang.String r4 = "1:"
            boolean r4 = r2.startsWith(r4)
            if (r4 != 0) goto L_0x01a6
            long r4 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x01a4 }
            goto L_0x01bf
        L_0x01a4:
            goto L_0x01be
        L_0x01a6:
            java.lang.String r4 = ":"
            java.lang.String[] r2 = r2.split(r4)
            int r4 = r2.length
            if (r4 >= r8) goto L_0x01b0
            goto L_0x01be
        L_0x01b0:
            r2 = r2[r9]
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L_0x01b9
            goto L_0x01be
        L_0x01b9:
            long r4 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x01a4 }
            goto L_0x01bf
        L_0x01be:
            r4 = r6
        L_0x01bf:
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x01c5
            r11 = r4
            goto L_0x01c6
        L_0x01c5:
            r11 = r6
        L_0x01c6:
            com.google.firebase.messaging.reporting.MessagingClientEvent r2 = new com.google.firebase.messaging.reporting.MessagingClientEvent
            r10 = r2
            r10.<init>(r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.String r4 = "FCM_CLIENT_EVENT_LOGGING"
            java.lang.String r5 = "proto"
            r9.b r6 = new r9.b     // Catch:{ RuntimeException -> 0x01f8 }
            r6.<init>(r5)     // Catch:{ RuntimeException -> 0x01f8 }
            ca.r r5 = new ca.r     // Catch:{ RuntimeException -> 0x01f8 }
            r7 = 6
            r5.<init>(r7)     // Catch:{ RuntimeException -> 0x01f8 }
            u9.u r3 = r3.mo22261a(r4, r6, r5)     // Catch:{ RuntimeException -> 0x01f8 }
            gf.a r4 = new gf.a     // Catch:{ RuntimeException -> 0x01f8 }
            r4.<init>(r2)     // Catch:{ RuntimeException -> 0x01f8 }
            r9.a r2 = new r9.a     // Catch:{ RuntimeException -> 0x01f8 }
            com.google.android.datatransport.Priority r5 = com.google.android.datatransport.Priority.DEFAULT     // Catch:{ RuntimeException -> 0x01f8 }
            r2.<init>(r4, r5)     // Catch:{ RuntimeException -> 0x01f8 }
            r3.mo22259a(r2)     // Catch:{ RuntimeException -> 0x01f8 }
            goto L_0x01f8
        L_0x01ef:
            r0 = move-exception
            goto L_0x01f2
        L_0x01f1:
            r0 = move-exception
        L_0x01f2:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        L_0x01f8:
            r24.dispatchMessage(r25)
            goto L_0x01ff
        L_0x01fc:
            r24.onDeletedMessages()
        L_0x01ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.passMessageIntentToSdk(android.content.Intent):void");
    }

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) C16958a0.m42795a().f44018d.poll();
    }

    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (ACTION_REMOTE_INTENT.equals(action) || ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            handleMessageIntent(intent);
        } else if (ACTION_NEW_TOKEN.equals(action)) {
            onNewToken(intent.getStringExtra(EXTRA_TOKEN));
        } else {
            intent.getAction();
        }
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(String str, Exception exc) {
    }
}
