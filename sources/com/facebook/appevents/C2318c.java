package com.facebook.appevents;

import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import mf0.C24362h;

/* renamed from: com.facebook.appevents.c */
public final class C2318c {

    /* renamed from: com.facebook.appevents.c$a */
    public static final class C2319a extends ObjectInputStream {
        public C2319a(BufferedInputStream bufferedInputStream) {
            super(bufferedInputStream);
        }

        public final ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException {
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            if (C24362h.m61206a(readClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                readClassDescriptor = ObjectStreamClass.lookup(AccessTokenAppIdPair.SerializationProxyV1.class);
            } else if (C24362h.m61206a(readClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
                readClassDescriptor = ObjectStreamClass.lookup(AppEvent.SerializationProxyV2.class);
            }
            C24362h.m61210e(readClassDescriptor, "resultClassDescriptor");
            return readClassDescriptor;
        }
    }

    static {
        new C2318c();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.facebook.appevents.PersistedEvents} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.facebook.appevents.PersistedEvents} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: com.facebook.appevents.c$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.facebook.appevents.PersistedEvents} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:21|22|24|25|26|27|28|29|30) */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0050 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x005d */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x006a A[SYNTHETIC, Splitter:B:47:0x006a] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:29:0x0050=Splitter:B:29:0x0050, B:24:0x0044=Splitter:B:24:0x0044, B:40:0x005d=Splitter:B:40:0x005d} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized com.facebook.appevents.PersistedEvents m6188a() {
        /*
            java.lang.Class<com.facebook.appevents.c> r0 = com.facebook.appevents.C2318c.class
            monitor-enter(r0)
            int r1 = p135j8.C5398d.f17731a     // Catch:{ all -> 0x0071 }
            android.content.Context r1 = p009a8.C0115o.m210a()     // Catch:{ all -> 0x0071 }
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch:{ FileNotFoundException -> 0x005c, Exception -> 0x0051, all -> 0x0043 }
            java.lang.String r4 = "context.openFileInput(PERSISTED_EVENTS_FILENAME)"
            mf0.C24362h.m61210e(r3, r4)     // Catch:{ FileNotFoundException -> 0x005c, Exception -> 0x0051, all -> 0x0043 }
            com.facebook.appevents.c$a r4 = new com.facebook.appevents.c$a     // Catch:{ FileNotFoundException -> 0x005c, Exception -> 0x0051, all -> 0x0043 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x005c, Exception -> 0x0051, all -> 0x0043 }
            r5.<init>(r3)     // Catch:{ FileNotFoundException -> 0x005c, Exception -> 0x0051, all -> 0x0043 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x005c, Exception -> 0x0051, all -> 0x0043 }
            java.lang.Object r3 = r4.readObject()     // Catch:{ FileNotFoundException -> 0x005d, Exception -> 0x0052, all -> 0x003f }
            if (r3 == 0) goto L_0x0037
            com.facebook.appevents.PersistedEvents r3 = (com.facebook.appevents.PersistedEvents) r3     // Catch:{ FileNotFoundException -> 0x005d, Exception -> 0x0052, all -> 0x003f }
            com.facebook.internal.C2397f0.m6311e(r4)     // Catch:{ all -> 0x0071 }
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch:{ Exception -> 0x0034 }
            r1.delete()     // Catch:{ Exception -> 0x0034 }
            goto L_0x0035
        L_0x0034:
        L_0x0035:
            r2 = r3
            goto L_0x0068
        L_0x0037:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch:{ FileNotFoundException -> 0x005d, Exception -> 0x0052, all -> 0x003f }
            java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents"
            r3.<init>(r5)     // Catch:{ FileNotFoundException -> 0x005d, Exception -> 0x0052, all -> 0x003f }
            throw r3     // Catch:{ FileNotFoundException -> 0x005d, Exception -> 0x0052, all -> 0x003f }
        L_0x003f:
            r2 = move-exception
            r3 = r2
            r2 = r4
            goto L_0x0044
        L_0x0043:
            r3 = move-exception
        L_0x0044:
            com.facebook.internal.C2397f0.m6311e(r2)     // Catch:{ all -> 0x0071 }
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch:{ Exception -> 0x0050 }
            r1.delete()     // Catch:{ Exception -> 0x0050 }
        L_0x0050:
            throw r3     // Catch:{ all -> 0x0071 }
        L_0x0051:
            r4 = r2
        L_0x0052:
            com.facebook.internal.C2397f0.m6311e(r4)     // Catch:{ all -> 0x0071 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
        L_0x0057:
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x0067 }
            goto L_0x0063
        L_0x005c:
            r4 = r2
        L_0x005d:
            com.facebook.internal.C2397f0.m6311e(r4)     // Catch:{ all -> 0x0071 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            goto L_0x0057
        L_0x0063:
            r1.delete()     // Catch:{ Exception -> 0x0067 }
            goto L_0x0068
        L_0x0067:
        L_0x0068:
            if (r2 != 0) goto L_0x006f
            com.facebook.appevents.PersistedEvents r2 = new com.facebook.appevents.PersistedEvents     // Catch:{ all -> 0x0071 }
            r2.<init>()     // Catch:{ all -> 0x0071 }
        L_0x006f:
            monitor-exit(r0)
            return r2
        L_0x0071:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.C2318c.m6188a():com.facebook.appevents.PersistedEvents");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|7|8|12|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        com.facebook.internal.C2397f0.m6311e(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001a */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m6189b(com.facebook.appevents.PersistedEvents r5) {
        /*
            java.lang.String r0 = "AppEventsLogger.persistedevents"
            android.content.Context r1 = p009a8.C0115o.m210a()
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0019 }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0019 }
            r4 = 0
            java.io.FileOutputStream r4 = r1.openFileOutput(r0, r4)     // Catch:{ all -> 0x0019 }
            r3.<init>(r4)     // Catch:{ all -> 0x0019 }
            r2.<init>(r3)     // Catch:{ all -> 0x0019 }
            r2.writeObject(r5)     // Catch:{ all -> 0x001a }
            goto L_0x0027
        L_0x0019:
            r2 = 0
        L_0x001a:
            java.io.File r5 = r1.getFileStreamPath(r0)     // Catch:{ Exception -> 0x0027, all -> 0x0022 }
            r5.delete()     // Catch:{ Exception -> 0x0027, all -> 0x0022 }
            goto L_0x0027
        L_0x0022:
            r5 = move-exception
            com.facebook.internal.C2397f0.m6311e(r2)
            throw r5
        L_0x0027:
            com.facebook.internal.C2397f0.m6311e(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.C2318c.m6189b(com.facebook.appevents.PersistedEvents):void");
    }
}
