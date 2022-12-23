package p858uz;

import android.location.Location;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import p686ns.C18587a;
import p717oz.C18861a;
import p977zz.C20975x0;

/* renamed from: uz.a */
public abstract class C20048a extends C18861a<Location, C20059f> implements C20061g {

    /* renamed from: f */
    public static volatile Location f50880f;

    /* renamed from: c */
    public final void mo51337c(Object obj, Object obj2) {
        ((C20059f) obj).onLocationChanged((Location) obj2);
    }

    /* renamed from: g */
    public final void mo51339g(Object obj) {
        D d = (Location) obj;
        this.f48035e = d;
        if (d != null) {
            f50880f = d;
        }
    }

    /* renamed from: h */
    public Location mo50014i() {
        D d = f50880f;
        if (!C20975x0.m49118e((Location) this.f48035e, d)) {
            this.f48035e = d;
            if (d != null) {
                f50880f = d;
            }
        }
        return (Location) this.f48035e;
    }

    /* renamed from: n */
    public abstract Task<Location> mo50016n();

    /* renamed from: p */
    public void mo52308p() {
        mo50016n().addOnSuccessListener(TaskExecutors.MAIN_THREAD, new C18587a(this, 1));
    }
}
