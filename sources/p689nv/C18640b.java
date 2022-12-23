package p689nv;

import android.app.TaskStackBuilder;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import c70.C13751d;
import ce0.C21100e;
import com.appboy.models.InAppMessageBase;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.app.ridesharing.booking.EventBookingActivity;
import com.moovit.commons.request.ServerException;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.request.UserRequestError;
import com.tranzmate.R;
import java.io.IOException;
import k10.C17993a;
import p713ov.C18831a;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20437h;

/* renamed from: nv.b */
public abstract class C18640b<RQ extends C20431c<RQ, RS>, RS extends C20436g<RQ, RS>> implements C20437h<RQ, RS> {

    /* renamed from: b */
    public final C18831a f47501b;

    /* renamed from: c */
    public final EventBookingActivity f47502c;

    public C18640b(C18831a aVar) {
        C21100e.m49373x(aVar, "fragment");
        this.f47501b = aVar;
        this.f47502c = null;
    }

    /* renamed from: b */
    public Bundle mo45759b(C20431c cVar) {
        return null;
    }

    /* renamed from: c */
    public final boolean mo315c(C20431c cVar, ServerException serverException) {
        if (mo51023h(cVar, serverException)) {
            return true;
        }
        mo51026n(cVar, serverException);
        return true;
    }

    /* renamed from: d */
    public final boolean mo316d(RQ rq, IOException iOException) {
        if (mo51023h(rq, iOException)) {
            return true;
        }
        mo51026n(rq, iOException);
        return true;
    }

    /* renamed from: e */
    public final void mo51020e() {
        EventBookingActivity f = mo51021f();
        if (f != null) {
            TaskStackBuilder.create(f).addNextIntent(C14226d.m35335A0(f).putExtra(C17993a.f46076b, "suppress_popups")).startActivities();
            f.finish();
        }
    }

    /* renamed from: f */
    public final EventBookingActivity mo51021f() {
        C18831a aVar = this.f47501b;
        if (aVar != null) {
            return (EventBookingActivity) aVar.f40822c;
        }
        return this.f47502c;
    }

    /* renamed from: g */
    public final boolean mo51022g(String str, int i, Bundle bundle) {
        EventBookingActivity f = mo51021f();
        if (f == null || ((AlertDialogFragment) f.getSupportFragmentManager().mo3923A("ALERT_DIALOG_FRAGMENT")) == null) {
            return true;
        }
        int i2 = bundle.getInt("error_code", -1);
        Bundle bundle2 = bundle.getBundle(InAppMessageBase.EXTRAS);
        if ("generic_error_alert_dialog_fragment".equals(str)) {
            if (i == -1) {
                mo45760l(bundle2);
            } else {
                f.finish();
            }
            return true;
        } else if (!"user_error_alert_dialog_fragment".equals(str)) {
            return false;
        } else {
            if (i == -1) {
                mo51025m(i2);
            }
            return true;
        }
    }

    /* renamed from: h */
    public boolean mo51023h(RQ rq, Exception exc) {
        return false;
    }

    /* renamed from: i */
    public final boolean mo319i(C20431c cVar, IOException iOException) {
        if (mo51023h(cVar, iOException)) {
            return true;
        }
        mo51026n(cVar, iOException);
        return true;
    }

    /* renamed from: j */
    public final void mo51024j() {
        AlertDialogFragment alertDialogFragment;
        EventBookingActivity f = mo51021f();
        if (f != null && (alertDialogFragment = (AlertDialogFragment) f.getSupportFragmentManager().mo3923A("ALERT_DIALOG_FRAGMENT")) != null) {
            alertDialogFragment.dismissAllowingStateLoss();
        }
    }

    /* renamed from: l */
    public abstract void mo45760l(Bundle bundle);

    /* renamed from: m */
    public void mo51025m(int i) {
        if (i == 30003 || i == 30006) {
            mo51020e();
            return;
        }
        EventBookingActivity f = mo51021f();
        if (f != null) {
            FragmentManager supportFragmentManager = f.getSupportFragmentManager();
            if (supportFragmentManager.mo3926D() > 0) {
                supportFragmentManager.mo3975s(new FragmentManager.C0899o(supportFragmentManager.mo3925C(0).getName(), -1, 1), false);
            }
        }
    }

    /* renamed from: n */
    public final void mo51026n(RQ rq, Exception exc) {
        AlertDialogFragment alertDialogFragment;
        EventBookingActivity f = mo51021f();
        if (f != null) {
            Bundle b = mo45759b(rq);
            int i = C13751d.f33851b;
            if (exc instanceof UserRequestError) {
                UserRequestError userRequestError = (UserRequestError) exc;
                AlertDialogFragment.C15856a h = new AlertDialogFragment.C15856a((Context) f).mo47684m(userRequestError.mo49162d()).mo47679h(userRequestError.mo49161c());
                h.mo47676e(R.drawable.img_empty_warning, false);
                AlertDialogFragment.C15856a j = h.mo47682k("user_error_alert_dialog_fragment").mo47681j(R.string.std_positive_button);
                j.f41328b.putInt("error_code", userRequestError.mo49160b());
                j.f41328b.putBundle(InAppMessageBase.EXTRAS, b);
                j.mo47674c(false);
                j.mo47675d(false);
                alertDialogFragment = j.mo47673b();
            } else {
                AlertDialogFragment.C15856a k = new AlertDialogFragment.C15856a((Context) f).mo47682k("generic_error_alert_dialog_fragment");
                k.mo47676e(R.drawable.img_empty_warning, false);
                AlertDialogFragment.C15856a g = k.mo47681j(R.string.retry_connect).mo47680i(R.string.cancel).mo47678g(R.string.network_unavailable_error);
                g.f41328b.putBundle(InAppMessageBase.EXTRAS, b);
                g.mo47674c(false);
                g.mo47675d(false);
                alertDialogFragment = g.mo47673b();
            }
            C18831a aVar = this.f47501b;
            if (aVar != null) {
                alertDialogFragment.setTargetFragment(aVar, 0);
            }
            f.mo44530n2(alertDialogFragment);
        }
    }

    public C18640b(EventBookingActivity eventBookingActivity) {
        this.f47501b = null;
        C21100e.m49373x(eventBookingActivity, "activity");
        this.f47502c = eventBookingActivity;
    }
}
