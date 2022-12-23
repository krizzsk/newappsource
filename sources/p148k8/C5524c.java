package p148k8;

import b50.C25552i;
import c00.C13717b;
import c00.C13723g;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitApplication;
import com.moovit.app.subscription.C15363a;
import com.moovit.app.subscription.C15364b;
import com.moovit.app.subscription.MoovitSubscriptionsManager;
import com.moovit.app.subscription.SubscriptionsActivity;
import com.moovit.commons.utils.ApplicationBugException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import m80.C12887v;
import p135j8.C5401f;
import p501fw.C17115l;
import p669mz.C18490f;
import p977zz.C20949l;
import p977zz.C20963s;
import s90.C13076d;

/* renamed from: k8.c */
public final /* synthetic */ class C5524c implements C5401f.C5402a, C20949l, SuccessContinuation {

    /* renamed from: b */
    public final /* synthetic */ List f18102b;

    public /* synthetic */ C5524c(ArrayList arrayList) {
        this.f18102b = arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012f A[EDGE_INSN: B:75:0x012f->B:58:0x012f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19838a(java.io.File r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            java.util.List r2 = r1.f18102b
            java.lang.String r3 = "$slaves"
            mf0.C24362h.m61211f(r2, r3)
            java.lang.String r3 = "file"
            mf0.C24362h.m61211f(r0, r3)
            java.util.HashMap r3 = p148k8.C5523b.f18089m
            k8.e r3 = p148k8.C5526e.f18104a
            java.lang.Class<k8.e> r3 = p148k8.C5526e.class
            boolean r4 = p262t8.C6606a.m15601b(r3)
            if (r4 == 0) goto L_0x001e
            goto L_0x00db
        L_0x001e:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            int r0 = r4.available()     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            byte[] r4 = new byte[r0]     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            r5.readFully(r4)     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            r5.close()     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            r5 = 4
            if (r0 >= r5) goto L_0x0039
            goto L_0x00db
        L_0x0039:
            r6 = 0
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r4, r6, r5)     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            java.nio.ByteOrder r8 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            r7.order(r8)     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            int r7 = r7.getInt()     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            int r8 = r7 + 4
            if (r0 >= r8) goto L_0x004d
            goto L_0x00db
        L_0x004d:
            java.lang.String r9 = new java.lang.String     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            java.nio.charset.Charset r10 = uh0.C25072a.f63272a     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            r9.<init>(r4, r5, r7, r10)     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            r5.<init>(r9)     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            org.json.JSONArray r7 = r5.names()     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            int r9 = r7.length()     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            java.lang.String[] r10 = new java.lang.String[r9]     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            int r11 = r9 + -1
            if (r11 < 0) goto L_0x0075
            r12 = 0
        L_0x0068:
            int r13 = r12 + 1
            java.lang.String r14 = r7.getString(r12)     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            r10[r12] = r14     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            if (r13 <= r11) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r12 = r13
            goto L_0x0068
        L_0x0075:
            r7 = 1
            if (r9 <= r7) goto L_0x007b
            java.util.Arrays.sort(r10)     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
        L_0x007b:
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            r7.<init>()     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            r11 = 0
        L_0x0081:
            if (r11 >= r9) goto L_0x00dc
            r12 = r10[r11]     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            int r11 = r11 + 1
            if (r12 != 0) goto L_0x008a
            goto L_0x0081
        L_0x008a:
            org.json.JSONArray r13 = r5.getJSONArray(r12)     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            int r14 = r13.length()     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            int[] r15 = new int[r14]     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            int r14 = r14 + -1
            if (r14 < 0) goto L_0x00ad
            r16 = 1
        L_0x009a:
            int r1 = r6 + 1
            int r17 = r13.getInt(r6)     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            r15[r6] = r17     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            int r16 = r16 * r17
            if (r1 <= r14) goto L_0x00a9
            r1 = r16
            goto L_0x00b0
        L_0x00a9:
            r6 = r1
            r1 = r18
            goto L_0x009a
        L_0x00ad:
            r16 = 1
            r1 = 1
        L_0x00b0:
            int r6 = r1 * 4
            int r13 = r8 + r6
            if (r13 <= r0) goto L_0x00b7
            goto L_0x00db
        L_0x00b7:
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r4, r8, r6)     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            java.nio.ByteOrder r8 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            r6.order(r8)     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            k8.a r8 = new k8.a     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            r8.<init>(r15)     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            java.nio.FloatBuffer r6 = r6.asFloatBuffer()     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            float[] r14 = r8.f18088c     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            r15 = 0
            r6.get(r14, r15, r1)     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            r7.put(r12, r8)     // Catch:{ Exception -> 0x00db, all -> 0x00d7 }
            r6 = 0
            r1 = r18
            r8 = r13
            goto L_0x0081
        L_0x00d7:
            r0 = move-exception
            p262t8.C6606a.m15600a(r3, r0)
        L_0x00db:
            r7 = 0
        L_0x00dc:
            if (r7 == 0) goto L_0x012e
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Class<k8.b> r3 = p148k8.C5523b.class
            boolean r0 = p262t8.C6606a.m15601b(r3)
            if (r0 == 0) goto L_0x00ec
            goto L_0x00f4
        L_0x00ec:
            java.util.HashMap r0 = p148k8.C5523b.f18089m     // Catch:{ all -> 0x00ef }
            goto L_0x00f5
        L_0x00ef:
            r0 = move-exception
            r4 = r0
            p262t8.C6606a.m15600a(r3, r4)
        L_0x00f4:
            r0 = 0
        L_0x00f5:
            java.util.Set r3 = r7.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x00fd:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x012f
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r4.getKey()
            boolean r6 = r0.containsKey(r6)
            if (r6 == 0) goto L_0x0126
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r5 = r0.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L_0x0126
            goto L_0x012e
        L_0x0126:
            java.lang.Object r4 = r4.getValue()
            r1.put(r5, r4)
            goto L_0x00fd
        L_0x012e:
            r1 = 0
        L_0x012f:
            if (r1 != 0) goto L_0x0132
            goto L_0x0138
        L_0x0132:
            k8.b r0 = new k8.b     // Catch:{ Exception -> 0x0138 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0138 }
            goto L_0x0139
        L_0x0138:
            r0 = 0
        L_0x0139:
            if (r0 == 0) goto L_0x016e
            java.util.Iterator r1 = r2.iterator()
        L_0x013f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x016e
            java.lang.Object r2 = r1.next()
            com.facebook.appevents.ml.ModelManager$a r2 = (com.facebook.appevents.p047ml.ModelManager.C2345a) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r2.f8551a
            r3.append(r4)
            r4 = 95
            r3.append(r4)
            int r4 = r2.f8554d
            java.lang.String r5 = "_rule"
            java.lang.String r3 = p358af.C13437d.m33707l(r3, r4, r5)
            java.lang.String r4 = r2.f8553c
            d0.x0 r5 = new d0.x0
            r6 = 2
            r5.<init>(r6, r2, r0)
            com.facebook.appevents.p047ml.ModelManager.C2345a.C2346a.m6235b(r4, r3, r5)
            goto L_0x013f
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p148k8.C5524c.mo19838a(java.io.File):void");
    }

    public final boolean invoke(Object obj) {
        List list = this.f18102b;
        SubscriptionsActivity subscriptionsActivity = (SubscriptionsActivity) obj;
        int i = C17115l.f44295h;
        subscriptionsActivity.f39777U.setVisibility(0);
        C15364b bVar = subscriptionsActivity.f39778X;
        bVar.getClass();
        C18490f fVar = new C18490f();
        MoovitSubscriptionsManager.m39315c((MoovitApplication) bVar.f3907b).mo45939i(list).addOnCompleteListener(new C20963s(fVar));
        fVar.observe(subscriptionsActivity, new C15363a(subscriptionsActivity, fVar));
        return true;
    }

    public final Task then(Object obj) {
        List list = this.f18102b;
        ThreadPoolExecutor threadPoolExecutor = C12887v.f31893d;
        ArrayList<T> c = C13723g.m34282c(((C13076d) obj).f32346a, new C25552i(list, 1));
        if (!C13717b.m34258e(c)) {
            return Tasks.forResult(c);
        }
        StringBuilder k = C13555b.m33972k("Couldn't find any user wallet tickets with ids: ");
        k.append(C13717b.m34269p(list));
        return Tasks.forException(new ApplicationBugException(k.toString()));
    }
}
