package com.veriff.sdk.internal;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.views.VeriffTextView;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.layouts.VeriffButton;
import mobi.lab.veriff.layouts.VeriffToolbar;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo59060d2 = {"Lcom/veriff/sdk/internal/ui/barcode/BarcodeTipsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "branding", "Lmobi/lab/veriff/util/resourcesHelper/Branding;", "strings", "Lcom/veriff/sdk/Strings;", "listener", "Lcom/veriff/sdk/internal/ui/barcode/BarcodeTipsView$Listener;", "(Landroid/content/Context;Lmobi/lab/veriff/util/resourcesHelper/Branding;Lcom/veriff/sdk/Strings;Lcom/veriff/sdk/internal/ui/barcode/BarcodeTipsView$Listener;)V", "binding", "Lmobi/lab/veriff/databinding/VrffViewScanTipsBinding;", "Listener", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.mi */
public final class C22016mi extends LinearLayout {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C22019c f55556b;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lbf0/d;", "onClick", "()V", "com/veriff/sdk/internal/ui/barcode/BarcodeTipsView$1$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.mi$a */
    public static final class C22017a implements VeriffButton.C24432a {

        /* renamed from: a */
        public final /* synthetic */ C22016mi f55557a;

        /* renamed from: b */
        public final /* synthetic */ C21616ex f55558b;

        public C22017a(C22016mi miVar, C21616ex exVar) {
            this.f55557a = miVar;
            this.f55558b = exVar;
        }

        public final void onClick() {
            this.f55557a.f55556b.mo55839b();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lbf0/d;", "onCloseButtonClicked", "()V", "com/veriff/sdk/internal/ui/barcode/BarcodeTipsView$2$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.mi$b */
    public static final class C22018b implements VeriffToolbar.C24438b {

        /* renamed from: a */
        public final /* synthetic */ C22016mi f55559a;

        public C22018b(C22016mi miVar) {
            this.f55559a = miVar;
        }

        /* renamed from: a */
        public final void mo55837a() {
            this.f55559a.f55556b.mo55838a();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, mo59060d2 = {"Lcom/veriff/sdk/internal/ui/barcode/BarcodeTipsView$Listener;", "", "Lbf0/d;", "onCloseClicked", "onTryAgainClicked", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.mi$c */
    public interface C22019c {
        /* renamed from: a */
        void mo55838a();

        /* renamed from: b */
        void mo55839b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22016mi(Context context, C22696xo xoVar, C21616ex exVar, C22019c cVar) {
        super(context);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(xoVar, "branding");
        C24362h.m61211f(exVar, "strings");
        C24362h.m61211f(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f55556b = cVar;
        C22654wi a = C22654wi.m55220a(LayoutInflater.from(context), this);
        C24362h.m61210e(a, "VrffViewScanTipsBinding.…ater.from(context), this)");
        setBackground(new ColorDrawable(xoVar.mo57096k()));
        setClipToPadding(false);
        setOrientation(1);
        VeriffTextView veriffTextView = a.f57285i;
        C24362h.m61210e(veriffTextView, "binding.tipsTitle");
        veriffTextView.setText(exVar.mo54724bN());
        VeriffTextView veriffTextView2 = a.f57284g;
        C24362h.m61210e(veriffTextView2, "binding.tipsInstruction");
        veriffTextView2.setText(exVar.mo54862dw());
        a.f57278a.setText(exVar.mo54751bo());
        a.f57279b.setText(exVar.mo54752bp());
        a.f57280c.setText(exVar.mo54753bq());
        a.f57281d.setText(exVar.mo54754br());
        VeriffButton veriffButton = a.f57286k;
        veriffButton.setText(exVar.mo54715bE());
        veriffButton.mo60628a(false, (VeriffButton.C24432a) new C22017a(this, exVar));
        VeriffToolbar veriffToolbar = a.f57287l;
        veriffToolbar.mo60638a();
        veriffToolbar.mo60641a((VeriffToolbar.C24438b) new C22018b(this));
        VeriffTextView veriffTextView3 = a.f57283f;
        C24362h.m61210e(veriffTextView3, "binding.tipsErrorSkipStepTitle");
        veriffTextView3.setVisibility(8);
        VeriffTextView veriffTextView4 = a.f57282e;
        C24362h.m61210e(veriffTextView4, "binding.tipsErrorSkipStep");
        veriffTextView4.setVisibility(8);
    }
}
