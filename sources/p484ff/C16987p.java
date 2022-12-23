package p484ff;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import p358af.C13436c;
import p358af.C13440g;
import p743qd.C19107d;
import p838uf.C19906g;
import p956ze.C20839b;

/* renamed from: ff.p */
public final class C16987p {

    /* renamed from: a */
    public final C19107d f44092a;

    /* renamed from: b */
    public final C16990s f44093b;

    /* renamed from: c */
    public final Rpc f44094c;

    /* renamed from: d */
    public final C20839b<C19906g> f44095d;

    /* renamed from: e */
    public final C20839b<HeartBeatInfo> f44096e;

    /* renamed from: f */
    public final C13436c f44097f;

    public C16987p(C19107d dVar, C16990s sVar, C20839b<C19906g> bVar, C20839b<HeartBeatInfo> bVar2, C13436c cVar) {
        dVar.mo51535a();
        Rpc rpc = new Rpc(dVar.f48568a);
        this.f44092a = dVar;
        this.f44093b = sVar;
        this.f44094c = rpc;
        this.f44095d = bVar;
        this.f44096e = bVar2;
        this.f44097f = cVar;
    }

    /* renamed from: a */
    public final Task<String> mo49619a(Task<Bundle> task) {
        return task.continueWith(new C16974h(1), new C16986o(this));
    }

    /* renamed from: b */
    public final void mo49620b(Bundle bundle, String str, String str2) throws ExecutionException, InterruptedException {
        int i;
        String str3;
        String str4;
        String str5;
        HeartBeatInfo.HeartBeat b;
        PackageInfo packageInfo;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        C19107d dVar = this.f44092a;
        dVar.mo51535a();
        bundle.putString("gmp_app_id", dVar.f48570c.f48582b);
        C16990s sVar = this.f44093b;
        synchronized (sVar) {
            if (sVar.f44104d == 0) {
                try {
                    packageInfo = sVar.f44101a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                } catch (PackageManager.NameNotFoundException e) {
                    e.toString();
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    sVar.f44104d = packageInfo.versionCode;
                }
            }
            i = sVar.f44104d;
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        C16990s sVar2 = this.f44093b;
        synchronized (sVar2) {
            if (sVar2.f44102b == null) {
                sVar2.mo49625c();
            }
            str3 = sVar2.f44102b;
        }
        bundle.putString("app_ver", str3);
        C16990s sVar3 = this.f44093b;
        synchronized (sVar3) {
            if (sVar3.f44103c == null) {
                sVar3.mo49625c();
            }
            str4 = sVar3.f44103c;
        }
        bundle.putString("app_ver_name", str4);
        C19107d dVar2 = this.f44092a;
        dVar2.mo51535a();
        try {
            str5 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(dVar2.f48569b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str5 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str5);
        try {
            String a = ((C13440g) Tasks.await(this.f44097f.getToken())).mo40308a();
            if (!TextUtils.isEmpty(a)) {
                bundle.putString("Goog-Firebase-Installations-Auth", a);
            }
        } catch (InterruptedException | ExecutionException unused2) {
        }
        bundle.putString("appid", (String) Tasks.await(this.f44097f.getId()));
        bundle.putString("cliv", "fcm-23.0.8");
        HeartBeatInfo heartBeatInfo = this.f44096e.get();
        C19906g gVar = this.f44095d.get();
        if (heartBeatInfo != null && gVar != null && (b = heartBeatInfo.mo43359b()) != HeartBeatInfo.HeartBeat.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(b.getCode()));
            bundle.putString("Firebase-Client", gVar.mo52184a());
        }
    }

    /* renamed from: c */
    public final Task mo49621c(Bundle bundle, String str, String str2) {
        try {
            mo49620b(bundle, str, str2);
            return this.f44094c.send(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.forException(e);
        }
    }
}
