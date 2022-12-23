package p684nq;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import c00.C13717b;
import com.facebook.appevents.C2341k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.p417qr.MotQrCodeViewerActivity;
import com.moovit.app.mot.purchase.MotStationExitActivationActivity;
import com.moovit.genies.Genie;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.view.dialogs.BottomSheetMenuDialogFragment;
import com.tranzmate.R;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import m10.C18316a;
import p009a8.C0112l;
import p009a8.C0114n;
import p543hq.C17474b;
import p584jl.C17885a;
import p613kq.C18116c;
import p664mu.C18443f;
import p664mu.C18462q;
import p977zz.C20930c;
import w40.C25761d;

/* renamed from: nq.e */
public abstract class C18584e extends C18116c<MoovitActivity> implements BottomSheetMenuDialogFragment.C7965a {

    /* renamed from: w */
    public static final /* synthetic */ int f47313w = 0;

    /* renamed from: s */
    public List<MotActivation> f47314s;

    /* renamed from: t */
    public Runnable f47315t = null;

    /* renamed from: u */
    public int f47316u;

    /* renamed from: v */
    public final AtomicBoolean f47317v = new AtomicBoolean(false);

    public C18584e() {
        super(MoovitActivity.class);
    }

    /* renamed from: A2 */
    public Genie mo50976A2() {
        return null;
    }

    /* renamed from: B2 */
    public final void mo50977B2() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_activation_details_show_qr_clicked");
        mo46797j2(aVar.mo49933a());
        if (!C13717b.m34258e(this.f47314s)) {
            MotActivation motActivation = this.f47314s.get(0);
            startActivity(MotQrCodeViewerActivity.m38705y2(requireActivity(), motActivation.f38985b, motActivation.f38989f));
        }
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("MOT_SUPPORT_VALIDATOR");
    }

    /* renamed from: l0 */
    public final void mo24850l0(BottomSheetMenuDialogFragment.MenuItem menuItem) {
        String str = menuItem.f24112b;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 49:
                if (str.equals(DiskLruCache.VERSION_1)) {
                    c = 0;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    c = 1;
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                mo50978z2();
                return;
            case 1:
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_end_ride_clicked");
                mo46797j2(aVar.mo49933a());
                if (!C13717b.m34258e(this.f47314s)) {
                    startActivity(MotStationExitActivationActivity.m38689y2(requireContext(), this.f47314s));
                    return;
                }
                return;
            case 2:
                mo50977B2();
                return;
            default:
                return;
        }
    }

    /* renamed from: p2 */
    public final void mo50554p2(Button button) {
        C17885a.m44441i(button, 0, R.attr.roundedButtonMediumStyle, 2131953355);
        button.setText((CharSequence) null);
        C17885a.m44465u0(button, (Drawable) null, 2);
    }

    /* renamed from: q2 */
    public final Task<Boolean> mo50555q2() {
        if (!Boolean.TRUE.equals(mo46776J1("MOT_SUPPORT_VALIDATOR"))) {
            return Tasks.forResult(Boolean.FALSE);
        }
        return C25761d.m64299a().mo83587b(false).onSuccessTask(MoovitExecutors.COMPUTATION, new C0112l(11));
    }

    /* renamed from: r2 */
    public final void mo50556r2(View view) {
        Runnable runnable = this.f47315t;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: s2 */
    public final void mo50557s2(Button button) {
        String str;
        mo50553o2();
        if (!button.isActivated()) {
            str = getString(R.string.quick_action_validate);
        } else if (this.f47316u <= 0) {
            str = getString(R.string.quick_action_validations);
        } else {
            str = String.format(C20930c.m49020b(button.getContext()), "%s (%d)", new Object[]{getString(R.string.quick_action_validations), Integer.valueOf(this.f47316u)});
        }
        button.setText(str);
        C17885a.m44467v0(button, R.drawable.ic_qr_16);
        A a = this.f40822c;
        Genie A2 = mo50976A2();
        if (a != null && A2 != null) {
            C18316a.f46708c.mo50767a(A2, button, a);
        }
    }

    /* renamed from: u2 */
    public final void mo50559u2() {
        super.mo50559u2();
        this.f47315t = null;
    }

    /* renamed from: y2 */
    public final void mo50563y2(Button button) {
        if (this.f47317v.compareAndSet(false, true)) {
            mo50561w2(true);
            Task<PaymentAccount> b = C25761d.m64299a().mo83587b(false);
            Task<List<MotActivation>> c = C18443f.m45298d().mo50889c();
            ExecutorService executorService = MoovitExecutors.COMPUTATION;
            Task<TContinuationResult> onSuccessTask = c.onSuccessTask(executorService, new C2341k(5)).onSuccessTask(executorService, new C0114n(10));
            Tasks.whenAllComplete((Task<?>[]) new Task[]{b, onSuccessTask}).addOnCompleteListener((Activity) requireActivity(), new C18582c(this, b, onSuccessTask));
        }
    }

    /* renamed from: z2 */
    public final void mo50978z2() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_buy_ticket_clicked");
        mo46797j2(aVar.mo49933a());
        C18462q.m45321a(this.f40822c);
    }
}
