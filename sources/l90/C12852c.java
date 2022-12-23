package l90;

import aa0.C7540l;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import b70.C13576c;
import com.google.android.gms.tasks.Tasks;
import com.moovit.location.C16202a;
import j90.C12788a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import l30.C5581l;
import m80.C12869e;
import m80.C12870f;
import p484ff.C16982k0;
import p858uz.C20061g;
import p946ys.C20763d;
import p977zz.C20932c0;
import w90.C13222b;

/* renamed from: l90.c */
public class C12852c extends C12788a<C12850a> {

    /* renamed from: u */
    public static final /* synthetic */ int f31778u = 0;

    /* renamed from: o */
    public final C12853a f31779o = new C12853a();

    /* renamed from: p */
    public final ExecutorService f31780p = Executors.newSingleThreadExecutor(C20932c0.m49025a("qr_code"));

    /* renamed from: q */
    public final C13576c f31781q = new C13576c();

    /* renamed from: r */
    public C13222b f31782r;

    /* renamed from: s */
    public C12850a f31783s;

    /* renamed from: t */
    public ImageView f31784t;

    /* renamed from: l90.c$a */
    public class C12853a extends C7540l {
        public C12853a() {
            super(300);
        }

        /* renamed from: a */
        public final void mo19433a() {
            ImageView imageView;
            C12852c cVar = C12852c.this;
            int i = C12852c.f31778u;
            if (cVar.isResumed() && cVar.f31783s != null && (imageView = cVar.f31784t) != null) {
                int width = imageView.getWidth();
                int height = cVar.f31784t.getHeight();
                if (width <= 0 || height <= 0) {
                    cVar.f31779o.mo23802c();
                    return;
                }
                Tasks.call(cVar.f31780p, new C5581l(cVar, cVar.mo46780O1(), 1)).onSuccessTask(cVar.f31780p, new C12851b(cVar, width, height)).addOnSuccessListener((Activity) cVar.requireActivity(), new C20763d(cVar, 7)).addOnCompleteListener((Activity) cVar.requireActivity(), new C16982k0(cVar, 4));
            }
        }
    }

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(requireContext()).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f31782r = C13222b.m33316a(requireContext());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C12870f.touch_pass_validation_info_content, viewGroup, false);
        this.f31784t = (ImageView) inflate.findViewById(C12869e.image_view);
        return inflate;
    }

    public final void onPause() {
        super.onPause();
        this.f31779o.mo23803d();
    }

    public final void onResume() {
        super.onResume();
        this.f31779o.mo23804e();
    }
}
