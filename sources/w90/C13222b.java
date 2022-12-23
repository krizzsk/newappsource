package w90;

import android.content.Context;
import android.content.IntentFilter;
import androidx.viewpager2.widget.C1373d;
import bf0.C21049c;
import ce0.C21100e;
import com.cubic.umo.Environment;
import com.cubic.umo.auth.CubicAuth;
import com.cubic.umo.auth.api.AuthManager;
import com.cubic.umo.pass.content.AccountsBroadcastReceiver;
import com.cubic.umo.pass.internal.AccountController;
import com.cubic.umo.pass.repo.C2260a;
import com.cubic.umo.pass.repo.RepoFactory;
import com.google.android.material.internal.C14080o;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.concurrent.atomic.AtomicReference;
import mf0.C24362h;
import p008a7.C0088a;
import p196o7.C6009a;
import p209p7.C6098a;

/* renamed from: w90.b */
public final class C13222b {

    /* renamed from: d */
    public static volatile C13222b f32795d;

    /* renamed from: a */
    public final Context f32796a;

    /* renamed from: b */
    public final long f32797b;

    /* renamed from: c */
    public volatile C2260a f32798c;

    /* renamed from: w90.b$a */
    public class C13223a extends ThreadLocal<byte[]> {
        public final Object initialValue() {
            return new byte[32];
        }
    }

    /* renamed from: w90.b$b */
    public class C13224b extends ThreadLocal<byte[]> {
        public final Object initialValue() {
            return new byte[41];
        }
    }

    static {
        new C13223a();
        new C13224b();
        new AtomicReference();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Long} */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r0v15 */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        if (r1 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        if (r1 != null) goto L_0x0045;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d A[SYNTHETIC, Splitter:B:17:0x003d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C13222b(android.content.Context r8) {
        /*
            r7 = this;
            r7.<init>()
            java.lang.String r0 = "context"
            ce0.C21100e.m49373x(r8, r0)
            android.content.Context r8 = r8.getApplicationContext()
            r7.f32796a = r8
            android.net.Uri r0 = p286v7.C6872a.f21226a     // Catch:{ Exception -> 0x0057 }
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ SecurityException -> 0x0041, all -> 0x003a }
            android.net.Uri r2 = p286v7.C6872a.f21226a     // Catch:{ SecurityException -> 0x0041, all -> 0x003a }
            java.lang.String[] r3 = p286v7.C6872a.f21227b     // Catch:{ SecurityException -> 0x0041, all -> 0x003a }
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ SecurityException -> 0x0041, all -> 0x003a }
            if (r1 == 0) goto L_0x0037
            boolean r2 = r1.moveToFirst()     // Catch:{ SecurityException -> 0x0035, all -> 0x0032 }
            if (r2 == 0) goto L_0x0037
            r2 = 0
            long r2 = r1.getLong(r2)     // Catch:{ SecurityException -> 0x0035, all -> 0x0032 }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ SecurityException -> 0x0035, all -> 0x0032 }
            goto L_0x0045
        L_0x0032:
            r8 = move-exception
            r0 = r1
            goto L_0x003b
        L_0x0035:
            goto L_0x0043
        L_0x0037:
            if (r1 == 0) goto L_0x0048
            goto L_0x0045
        L_0x003a:
            r8 = move-exception
        L_0x003b:
            if (r0 == 0) goto L_0x0040
            r0.close()     // Catch:{ Exception -> 0x0057 }
        L_0x0040:
            throw r8     // Catch:{ Exception -> 0x0057 }
        L_0x0041:
            r1 = r0
        L_0x0043:
            if (r1 == 0) goto L_0x0048
        L_0x0045:
            r1.close()     // Catch:{ Exception -> 0x0057 }
        L_0x0048:
            if (r0 != 0) goto L_0x0052
            long r0 = p323y7.C7344b.m16970a(r8)     // Catch:{ Exception -> 0x0057 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0057 }
        L_0x0052:
            long r0 = r0.longValue()     // Catch:{ Exception -> 0x0057 }
            goto L_0x0059
        L_0x0057:
            r0 = -1
        L_0x0059:
            r7.f32797b = r0
            java.util.Random r8 = new java.util.Random
            r8.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w90.C13222b.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public static C13222b m33316a(Context context) {
        if (f32795d == null) {
            synchronized (C13222b.class) {
                if (f32795d == null) {
                    f32795d = new C13222b(context);
                }
            }
        }
        return f32795d;
    }

    /* renamed from: b */
    public final void mo40092b(String str, String str2, String str3, C14080o oVar) {
        boolean z;
        Environment O = C21100e.m49320O(str);
        C6009a aVar = new C6009a(str2, str3);
        Context context = this.f32796a;
        Object obj = C6098a.f19361b;
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(O, "environment");
        synchronized (C6098a.f19361b) {
            if (C6098a.f19362c == null) {
                Context applicationContext = context.getApplicationContext();
                C24362h.m61210e(applicationContext, "context.applicationContext");
                if (C0088a.f265d != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    C24362h.m61210e(applicationContext2, "context.applicationContext");
                    C0088a.f265d = new C0088a(applicationContext2, O, aVar);
                }
                if (C0088a.f265d != null) {
                    C6098a.f19362c = new C6098a(new C1373d(O));
                    AccountController.f7854c.getValue().mo11665b();
                    context.registerReceiver(new AccountsBroadcastReceiver(), new IntentFilter("com.cubic.auth.ACCOUNTS_CHANGE"));
                } else {
                    C24362h.m61217l("instance");
                    throw null;
                }
            }
            C24362h.m61208c(C6098a.f19362c);
        }
        C21049c cVar = CubicAuth.f7726a;
        AuthManager.f7742h.getValue().f7743a = oVar;
        this.f32798c = (C2260a) RepoFactory.f8332a.getValue();
    }
}
