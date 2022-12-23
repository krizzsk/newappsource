package p532hf;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.activity.C0199g;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import p237r9.C6273f;
import p358af.C13436c;
import p578jf.C17823a;
import p583jk.C17884p;
import p626lf.C18200a;
import p743qd.C19107d;
import p766rf.C19260d;
import p790sf.C19453a;
import p790sf.C19458e;
import p862vf.C20122f;
import p956ze.C20839b;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: hf.b */
public final class C17427b {

    /* renamed from: g */
    public static final C18200a f44885g = C18200a.m44901d();

    /* renamed from: a */
    public final ConcurrentHashMap f44886a = new ConcurrentHashMap();

    /* renamed from: b */
    public final C17823a f44887b;

    /* renamed from: c */
    public Boolean f44888c;

    /* renamed from: d */
    public final C20839b<C20122f> f44889d;

    /* renamed from: e */
    public final C13436c f44890e;

    /* renamed from: f */
    public final C20839b<C6273f> f44891f;

    public C17427b(C19107d dVar, C20839b<C20122f> bVar, C13436c cVar, C20839b<C6273f> bVar2, RemoteConfigManager remoteConfigManager, C17823a aVar, SessionManager sessionManager) {
        C19453a aVar2;
        boolean z;
        Bundle bundle = null;
        this.f44888c = null;
        this.f44889d = bVar;
        this.f44890e = cVar;
        this.f44891f = bVar2;
        if (dVar == null) {
            this.f44888c = Boolean.FALSE;
            this.f44887b = aVar;
            new C19453a(new Bundle());
            return;
        }
        C19260d dVar2 = C19260d.f48934t;
        dVar2.f48938e = dVar;
        dVar.mo51535a();
        dVar2.f48950q = dVar.f48570c.f48587g;
        dVar2.f48940g = cVar;
        dVar2.f48941h = bVar2;
        dVar2.f48943j.execute(new C0199g(dVar2, 10));
        dVar.mo51535a();
        Context context = dVar.f48568a;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), RecyclerView.C1119a0.FLAG_IGNORE).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            e.getMessage();
        }
        if (bundle == null) {
            aVar2 = new C19453a();
        }
        remoteConfigManager.setFirebaseRemoteConfigProvider(bVar);
        this.f44887b = aVar;
        aVar.f45791b = aVar2;
        C17823a.f45788d.f46452b = C19458e.m46855a(context);
        aVar.f45792c.mo50417b(context);
        sessionManager.setApplicationContext(context);
        Boolean g = aVar.mo50409g();
        this.f44888c = g;
        C18200a aVar3 = f44885g;
        if (aVar3.f46452b) {
            if (g != null) {
                z = g.booleanValue();
            } else {
                z = C19107d.m46265d().mo51541j();
            }
            if (z) {
                dVar.mo51535a();
                String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", new Object[]{String.format("%s/trends?utm_source=%s&utm_medium=%s", new Object[]{C17884p.m44331B(dVar.f48570c.f48587g, context.getPackageName()), "perf-android-sdk", "android-ide"})});
                if (aVar3.f46452b) {
                    aVar3.f46451a.getClass();
                }
            }
        }
    }

    /* renamed from: a */
    public static C17427b m43467a() {
        return (C17427b) C19107d.m46265d().mo51536b(C17427b.class);
    }
}
