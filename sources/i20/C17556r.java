package i20;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Handler;
import ce0.C21100e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.location.C16202a;
import com.usebutton.sdk.internal.api.AppActionRequest;
import p858uz.C20048a;
import p858uz.C20059f;
import p858uz.C20061g;
import p977zz.C20934d0;

/* renamed from: i20.r */
public final class C17556r extends C20048a {

    /* renamed from: g */
    public final C17557a f45158g = new C17557a();

    /* renamed from: h */
    public final C17558b f45159h = new C17558b();

    /* renamed from: i */
    public final Context f45160i;

    /* renamed from: j */
    public final C20061g f45161j;

    /* renamed from: k */
    public boolean f45162k = false;

    /* renamed from: i20.r$a */
    public class C17557a implements C20059f {
        public C17557a() {
        }

        public final void onLocationChanged(Location location) {
            C17556r.this.mo51338f(location);
        }
    }

    /* renamed from: i20.r$b */
    public class C17558b extends BroadcastReceiver {
        public C17558b() {
        }

        public final void onReceive(Context context, Intent intent) {
            C17556r rVar = C17556r.this;
            if (!rVar.f45162k && C20934d0.m49032c(rVar.f45160i)) {
                rVar.f45162k = true;
                rVar.f45161j.mo50903a(rVar.f45158g);
            }
        }
    }

    public C17556r(Context context, C20061g gVar) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f45160i = context;
        C21100e.m49373x(gVar, "locationSource");
        this.f45161j = gVar;
    }

    /* renamed from: d */
    public final void mo50011d() {
        if (!this.f45162k && C20934d0.m49032c(this.f45160i)) {
            this.f45162k = true;
            this.f45161j.mo50903a(this.f45158g);
        }
        C16202a.registerPassiveBroadcastReceiver(this.f45160i, this.f45159h, (Handler) null);
    }

    /* renamed from: e */
    public final void mo50012e() {
        C16202a.unregisterPassiveBroadcastReceiver(this.f45160i, this.f45159h);
        if (this.f45162k) {
            this.f45161j.mo50904b(this.f45158g);
            this.f45162k = false;
        }
    }

    /* renamed from: h */
    public final Location mo50014i() {
        if (C20934d0.m49032c(this.f45160i)) {
            return this.f45161j.mo50014i();
        }
        return super.mo50014i();
    }

    /* renamed from: m */
    public final void mo50015m(C20059f fVar) {
        if (C20934d0.m49032c(this.f45160i)) {
            this.f45161j.mo50015m(fVar);
        } else {
            fVar.onLocationChanged((Location) null);
        }
    }

    /* renamed from: n */
    public final Task<Location> mo50016n() {
        if (C20934d0.m49032c(this.f45160i)) {
            return this.f45161j.mo50016n();
        }
        return Tasks.forException(new SecurityException("Missing location permissions!"));
    }
}
