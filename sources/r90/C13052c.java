package r90;

import aa0.C7540l;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import b70.C13576c;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import m80.C12869e;
import m80.C12870f;
import m90.C12889a;
import m90.C12890b;
import p555ie.C17589h;
import p613kq.C18114a;
import p801sq.C19519h;
import p977zz.C20932c0;
import r90.C13049a;

/* renamed from: r90.c */
public class C13052c extends C12889a<C13049a> {

    /* renamed from: u */
    public static final /* synthetic */ int f32280u = 0;

    /* renamed from: p */
    public final C13053a f32281p = new C13053a();

    /* renamed from: q */
    public final ExecutorService f32282q = Executors.newSingleThreadExecutor(C20932c0.m49025a("qr_code"));

    /* renamed from: r */
    public final C13576c f32283r = new C13576c();

    /* renamed from: s */
    public C13049a f32284s;

    /* renamed from: t */
    public ImageView f32285t;

    /* renamed from: r90.c$a */
    public class C13053a extends C7540l {
        public C13053a() {
            super(500);
        }

        /* renamed from: a */
        public final void mo19433a() {
            C13052c cVar = C13052c.this;
            int i = C13052c.f32280u;
            cVar.mo39934o2();
        }
    }

    public C13052c() {
        super(C13049a.class);
    }

    /* renamed from: n2 */
    public final void mo24271n2(View view, C12890b bVar) {
        C13049a aVar = (C13049a) bVar;
        if (this.f32285t != null) {
            this.f32284s = aVar;
            mo39934o2();
        }
    }

    /* renamed from: o2 */
    public final void mo39934o2() {
        ImageView imageView;
        if (isResumed() && this.f32284s != null && (imageView = this.f32285t) != null) {
            int width = imageView.getWidth();
            int height = this.f32285t.getHeight();
            if (width <= 0 || height <= 0) {
                this.f32281p.mo23802c();
            } else {
                Tasks.call(this.f32282q, new C17589h(this, 8)).onSuccessTask(this.f32282q, new C13051b(this, width, height)).addOnSuccessListener((Activity) requireActivity(), new C18114a(this, 15)).addOnCompleteListener((Activity) requireActivity(), new C19519h(this, 8));
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C13049a.C13050a aVar = C13049a.f32274f;
        View inflate = layoutInflater.inflate(C12870f.ticket_receipt_vdv_content_unsupported, viewGroup, false);
        this.f32285t = (ImageView) inflate.findViewById(C12869e.qr_view);
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        if (this.f32285t != null) {
            this.f32281p.mo23804e();
        }
    }
}
