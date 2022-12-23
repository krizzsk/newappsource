package p130j2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import p001a0.C0016g;

@Deprecated
/* renamed from: j2.a */
public final class C5367a {

    /* renamed from: f */
    public static final Object f17672f = new Object();

    /* renamed from: g */
    public static C5367a f17673g;

    /* renamed from: a */
    public final Context f17674a;

    /* renamed from: b */
    public final HashMap<BroadcastReceiver, ArrayList<C5370c>> f17675b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, ArrayList<C5370c>> f17676c = new HashMap<>();

    /* renamed from: d */
    public final ArrayList<C5369b> f17677d = new ArrayList<>();

    /* renamed from: e */
    public final C5368a f17678e;

    /* renamed from: j2.a$a */
    public class C5368a extends Handler {
        public C5368a(Looper looper) {
            super(looper);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            r3 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r3 >= r1) goto L_0x000b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            r4 = r2[r3];
            r5 = r4.f17681b.size();
            r6 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
            if (r6 >= r5) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
            r7 = r4.f17681b.get(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
            if (r7.f17685d != false) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
            r7.f17683b.onReceive(r11.f17674a, r4.f17680a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
            r6 = r6 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
            r3 = r3 + 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r11) {
            /*
                r10 = this;
                int r0 = r11.what
                r1 = 1
                if (r0 == r1) goto L_0x0009
                super.handleMessage(r11)
                goto L_0x0017
            L_0x0009:
                j2.a r11 = p130j2.C5367a.this
            L_0x000b:
                java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<j2.a$c>> r0 = r11.f17675b
                monitor-enter(r0)
                java.util.ArrayList<j2.a$b> r1 = r11.f17677d     // Catch:{ all -> 0x004f }
                int r1 = r1.size()     // Catch:{ all -> 0x004f }
                if (r1 > 0) goto L_0x0018
                monitor-exit(r0)     // Catch:{ all -> 0x004f }
            L_0x0017:
                return
            L_0x0018:
                j2.a$b[] r2 = new p130j2.C5367a.C5369b[r1]     // Catch:{ all -> 0x004f }
                java.util.ArrayList<j2.a$b> r3 = r11.f17677d     // Catch:{ all -> 0x004f }
                r3.toArray(r2)     // Catch:{ all -> 0x004f }
                java.util.ArrayList<j2.a$b> r3 = r11.f17677d     // Catch:{ all -> 0x004f }
                r3.clear()     // Catch:{ all -> 0x004f }
                monitor-exit(r0)     // Catch:{ all -> 0x004f }
                r0 = 0
                r3 = 0
            L_0x0027:
                if (r3 >= r1) goto L_0x000b
                r4 = r2[r3]
                java.util.ArrayList<j2.a$c> r5 = r4.f17681b
                int r5 = r5.size()
                r6 = 0
            L_0x0032:
                if (r6 >= r5) goto L_0x004c
                java.util.ArrayList<j2.a$c> r7 = r4.f17681b
                java.lang.Object r7 = r7.get(r6)
                j2.a$c r7 = (p130j2.C5367a.C5370c) r7
                boolean r8 = r7.f17685d
                if (r8 != 0) goto L_0x0049
                android.content.BroadcastReceiver r7 = r7.f17683b
                android.content.Context r8 = r11.f17674a
                android.content.Intent r9 = r4.f17680a
                r7.onReceive(r8, r9)
            L_0x0049:
                int r6 = r6 + 1
                goto L_0x0032
            L_0x004c:
                int r3 = r3 + 1
                goto L_0x0027
            L_0x004f:
                r11 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004f }
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p130j2.C5367a.C5368a.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: j2.a$b */
    public static final class C5369b {

        /* renamed from: a */
        public final Intent f17680a;

        /* renamed from: b */
        public final ArrayList<C5370c> f17681b;

        public C5369b(Intent intent, ArrayList<C5370c> arrayList) {
            this.f17680a = intent;
            this.f17681b = arrayList;
        }
    }

    /* renamed from: j2.a$c */
    public static final class C5370c {

        /* renamed from: a */
        public final IntentFilter f17682a;

        /* renamed from: b */
        public final BroadcastReceiver f17683b;

        /* renamed from: c */
        public boolean f17684c;

        /* renamed from: d */
        public boolean f17685d;

        public C5370c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            this.f17682a = intentFilter;
            this.f17683b = broadcastReceiver;
        }

        public final String toString() {
            StringBuilder r = C0016g.m34r(RecyclerView.C1119a0.FLAG_IGNORE, "Receiver{");
            r.append(this.f17683b);
            r.append(" filter=");
            r.append(this.f17682a);
            if (this.f17685d) {
                r.append(" DEAD");
            }
            r.append("}");
            return r.toString();
        }
    }

    public C5367a(Context context) {
        this.f17674a = context;
        this.f17678e = new C5368a(context.getMainLooper());
    }

    /* renamed from: a */
    public static C5367a m13473a(Context context) {
        C5367a aVar;
        synchronized (f17672f) {
            if (f17673g == null) {
                f17673g = new C5367a(context.getApplicationContext());
            }
            aVar = f17673g;
        }
        return aVar;
    }

    /* renamed from: b */
    public final void mo21146b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f17675b) {
            C5370c cVar = new C5370c(broadcastReceiver, intentFilter);
            ArrayList arrayList = this.f17675b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f17675b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = this.f17676c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f17676c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d9, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dc, code lost:
        return r11;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo21147c(android.content.Intent r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<j2.a$c>> r2 = r1.f17675b
            monitor-enter(r2)
            java.lang.String r10 = r23.getAction()     // Catch:{ all -> 0x00dd }
            android.content.Context r3 = r1.f17674a     // Catch:{ all -> 0x00dd }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x00dd }
            java.lang.String r11 = r0.resolveTypeIfNeeded(r3)     // Catch:{ all -> 0x00dd }
            android.net.Uri r12 = r23.getData()     // Catch:{ all -> 0x00dd }
            java.lang.String r13 = r23.getScheme()     // Catch:{ all -> 0x00dd }
            java.util.Set r14 = r23.getCategories()     // Catch:{ all -> 0x00dd }
            int r3 = r23.getFlags()     // Catch:{ all -> 0x00dd }
            r3 = r3 & 8
            r9 = 0
            if (r3 == 0) goto L_0x002d
            r16 = 1
            goto L_0x002f
        L_0x002d:
            r16 = 0
        L_0x002f:
            if (r16 == 0) goto L_0x0034
            r23.toString()     // Catch:{ all -> 0x00dd }
        L_0x0034:
            java.util.HashMap<java.lang.String, java.util.ArrayList<j2.a$c>> r3 = r1.f17676c     // Catch:{ all -> 0x00dd }
            java.lang.String r4 = r23.getAction()     // Catch:{ all -> 0x00dd }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x00dd }
            r8 = r3
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x00da
            if (r16 == 0) goto L_0x0048
            r8.toString()     // Catch:{ all -> 0x00dd }
        L_0x0048:
            r3 = 0
            r7 = r3
            r6 = 0
        L_0x004b:
            int r3 = r8.size()     // Catch:{ all -> 0x00dd }
            if (r6 >= r3) goto L_0x00aa
            java.lang.Object r3 = r8.get(r6)     // Catch:{ all -> 0x00dd }
            r5 = r3
            j2.a$c r5 = (p130j2.C5367a.C5370c) r5     // Catch:{ all -> 0x00dd }
            if (r16 == 0) goto L_0x005f
            android.content.IntentFilter r3 = r5.f17682a     // Catch:{ all -> 0x00dd }
            java.util.Objects.toString(r3)     // Catch:{ all -> 0x00dd }
        L_0x005f:
            boolean r3 = r5.f17684c     // Catch:{ all -> 0x00dd }
            if (r3 == 0) goto L_0x006e
            r18 = r6
            r20 = r8
            r19 = r10
            r21 = r11
            r11 = 0
            r10 = r7
            goto L_0x009f
        L_0x006e:
            android.content.IntentFilter r3 = r5.f17682a     // Catch:{ all -> 0x00dd }
            java.lang.String r17 = "LocalBroadcastManager"
            r4 = r10
            r15 = r5
            r5 = r11
            r18 = r6
            r6 = r13
            r19 = r10
            r10 = r7
            r7 = r12
            r20 = r8
            r8 = r14
            r21 = r11
            r11 = 0
            r9 = r17
            int r3 = r3.match(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00dd }
            if (r3 < 0) goto L_0x009f
            if (r16 == 0) goto L_0x008f
            java.lang.Integer.toHexString(r3)     // Catch:{ all -> 0x00dd }
        L_0x008f:
            if (r10 != 0) goto L_0x0097
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x00dd }
            r7.<init>()     // Catch:{ all -> 0x00dd }
            goto L_0x0098
        L_0x0097:
            r7 = r10
        L_0x0098:
            r7.add(r15)     // Catch:{ all -> 0x00dd }
            r3 = 1
            r15.f17684c = r3     // Catch:{ all -> 0x00dd }
            goto L_0x00a0
        L_0x009f:
            r7 = r10
        L_0x00a0:
            int r6 = r18 + 1
            r10 = r19
            r8 = r20
            r11 = r21
            r9 = 0
            goto L_0x004b
        L_0x00aa:
            r10 = r7
            r11 = 0
            if (r10 == 0) goto L_0x00db
            r9 = 0
        L_0x00af:
            int r3 = r10.size()     // Catch:{ all -> 0x00dd }
            if (r9 >= r3) goto L_0x00c0
            java.lang.Object r3 = r10.get(r9)     // Catch:{ all -> 0x00dd }
            j2.a$c r3 = (p130j2.C5367a.C5370c) r3     // Catch:{ all -> 0x00dd }
            r3.f17684c = r11     // Catch:{ all -> 0x00dd }
            int r9 = r9 + 1
            goto L_0x00af
        L_0x00c0:
            java.util.ArrayList<j2.a$b> r3 = r1.f17677d     // Catch:{ all -> 0x00dd }
            j2.a$b r4 = new j2.a$b     // Catch:{ all -> 0x00dd }
            r4.<init>(r0, r10)     // Catch:{ all -> 0x00dd }
            r3.add(r4)     // Catch:{ all -> 0x00dd }
            j2.a$a r0 = r1.f17678e     // Catch:{ all -> 0x00dd }
            r3 = 1
            boolean r0 = r0.hasMessages(r3)     // Catch:{ all -> 0x00dd }
            if (r0 != 0) goto L_0x00d8
            j2.a$a r0 = r1.f17678e     // Catch:{ all -> 0x00dd }
            r0.sendEmptyMessage(r3)     // Catch:{ all -> 0x00dd }
        L_0x00d8:
            monitor-exit(r2)     // Catch:{ all -> 0x00dd }
            return r3
        L_0x00da:
            r11 = 0
        L_0x00db:
            monitor-exit(r2)     // Catch:{ all -> 0x00dd }
            return r11
        L_0x00dd:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00dd }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p130j2.C5367a.mo21147c(android.content.Intent):boolean");
    }

    /* renamed from: d */
    public final void mo21148d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f17675b) {
            ArrayList remove = this.f17675b.remove(broadcastReceiver);
            if (remove != null) {
                for (int size = remove.size() - 1; size >= 0; size--) {
                    C5370c cVar = (C5370c) remove.get(size);
                    cVar.f17685d = true;
                    for (int i = 0; i < cVar.f17682a.countActions(); i++) {
                        String action = cVar.f17682a.getAction(i);
                        ArrayList arrayList = this.f17676c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                C5370c cVar2 = (C5370c) arrayList.get(size2);
                                if (cVar2.f17683b == broadcastReceiver) {
                                    cVar2.f17685d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f17676c.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }
}
