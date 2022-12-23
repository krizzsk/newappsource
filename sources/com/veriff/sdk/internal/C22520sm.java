package com.veriff.sdk.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C22517sk;
import com.veriff.sdk.views.upload.C23029b;
import com.veriff.sdk.views.upload.C23032e;
import com.veriff.views.VeriffTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf0.C24236l;
import mf0.C24362h;
import mobi.lab.veriff.R$drawable;
import mobi.lab.veriff.layouts.VeriffButton;
import mobi.lab.veriff.layouts.VeriffToolbar;
import p583jk.C17875h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BS\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0018\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 0\u001f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b0\u00101J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR&\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 0\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0015R\u0014\u0010$\u001a\u00020!8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u00062"}, mo59060d2 = {"Lcom/veriff/sdk/views/upload/ui/UploadWithDecisionView;", "Landroid/widget/RelativeLayout;", "Lcom/veriff/sdk/views/upload/ui/UploadUI;", "Landroid/view/View;", "getView", "", "currentStep", "Lbf0/d;", "setCurrentStep", "gotDecision", "showUploadFailedScreen", "showUploadProgress", "Lcom/veriff/sdk/internal/analytics/Analytics;", "analytics", "Lcom/veriff/sdk/internal/analytics/Analytics;", "Lmobi/lab/veriff/databinding/VrffContainerDecisionBinding;", "decision", "Lmobi/lab/veriff/databinding/VrffContainerDecisionBinding;", "", "Lcom/veriff/sdk/views/upload/UploadDecision;", "decisionSteps", "Ljava/util/List;", "Lcom/veriff/sdk/views/upload/ui/UploadDecisionRecyclerAdapter;", "decisionStepsAdapter", "Lcom/veriff/sdk/views/upload/ui/UploadDecisionRecyclerAdapter;", "", "isShortAddressFlow", "Z", "Lcom/veriff/sdk/views/upload/ui/UploadUI$Listener;", "listener", "Lcom/veriff/sdk/views/upload/ui/UploadUI$Listener;", "", "Lkotlin/Function1;", "Lcom/veriff/sdk/Strings;", "", "steps", "strings", "Lcom/veriff/sdk/Strings;", "", "timeStartedMillis", "J", "Lmobi/lab/veriff/databinding/VrffContainerRetryUploadBinding;", "uploadFailed", "Lmobi/lab/veriff/databinding/VrffContainerRetryUploadBinding;", "Landroid/content/Context;", "context", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "veriffResourcesProvider", "<init>", "(Landroid/content/Context;Lcom/veriff/sdk/Strings;Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;Lcom/veriff/sdk/views/upload/ui/UploadUI$Listener;Lcom/veriff/sdk/internal/analytics/Analytics;Ljava/util/List;Z)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
@SuppressLint({"ViewConstructor"})
/* renamed from: com.veriff.sdk.internal.sm */
public final class C22520sm extends RelativeLayout implements C22517sk {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C22513sh f56818a;

    /* renamed from: b */
    private final List<C23032e> f56819b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final long f56820c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C22628vj f56821d;

    /* renamed from: e */
    private final C22630vl f56822e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C21616ex f56823f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C22517sk.C22518a f56824g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C21645fu f56825h;

    /* renamed from: i */
    private final List<C24236l<C21616ex, CharSequence>> f56826i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final boolean f56827j;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.sm$a */
    public static final class C22525a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C22520sm f56832a;

        public C22525a(C22520sm smVar) {
            this.f56832a = smVar;
        }

        public final void run() {
            this.f56832a.f56818a.notifyDataSetChanged();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.sm$b */
    public static final class C22526b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C22520sm f56833a;

        public C22526b(C22520sm smVar) {
            this.f56833a = smVar;
        }

        public final void run() {
            VeriffTextView veriffTextView = this.f56833a.f56821d.f57081c;
            C24362h.m61210e(veriffTextView, "decision.decisionText");
            veriffTextView.setVisibility(0);
            if (this.f56833a.f56827j) {
                VeriffTextView veriffTextView2 = this.f56833a.f56821d.f57081c;
                C24362h.m61210e(veriffTextView2, "decision.decisionText");
                veriffTextView2.setText(this.f56833a.f56823f.mo54839dU());
                VeriffTextView veriffTextView3 = this.f56833a.f56821d.f57083e;
                C24362h.m61210e(veriffTextView3, "decision.decisionTitle");
                veriffTextView3.setText(this.f56833a.f56823f.mo54838dT());
                VeriffButton veriffButton = this.f56833a.f56821d.f57080b;
                C24362h.m61210e(veriffButton, "decision.decisionCompleteBtn");
                veriffButton.setVisibility(0);
                return;
            }
            VeriffTextView veriffTextView4 = this.f56833a.f56821d.f57081c;
            C24362h.m61210e(veriffTextView4, "decision.decisionText");
            veriffTextView4.setText(this.f56833a.f56823f.mo54842dc());
            VeriffButton veriffButton2 = this.f56833a.f56821d.f57082d;
            C24362h.m61210e(veriffButton2, "decision.decisionTimeoutBtn");
            veriffButton2.setVisibility(0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22520sm(Context context, C21616ex exVar, C22700xq xqVar, C22517sk.C22518a aVar, C21645fu fuVar, List<? extends C24236l<? super C21616ex, ? extends CharSequence>> list, boolean z) {
        super(context);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(exVar, "strings");
        C24362h.m61211f(xqVar, "veriffResourcesProvider");
        C24362h.m61211f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C24362h.m61211f(fuVar, "analytics");
        C24362h.m61211f(list, "steps");
        this.f56823f = exVar;
        this.f56824g = aVar;
        this.f56825h = fuVar;
        this.f56826i = list;
        this.f56827j = z;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C23032e((CharSequence) this.f56826i.get(i).invoke(this.f56823f), (C23029b) null, 2, (DefaultConstructorMarker) null));
        }
        this.f56819b = arrayList;
        this.f56820c = System.currentTimeMillis();
        C22659wk a = C22659wk.m55229a(LayoutInflater.from(context), this, true);
        C24362h.m61210e(a, "VrffViewUploadWithDecisi…rom(context), this, true)");
        a.mo57005a().setBackgroundColor(xqVar.mo57135v().mo57096k());
        C22628vj vjVar = a.f57309a;
        C24362h.m61210e(vjVar, "binding.uploadDecisionContainer");
        this.f56821d = vjVar;
        C22630vl vlVar = a.f57310b;
        C24362h.m61210e(vlVar, "binding.uploadFailedContainer");
        this.f56822e = vlVar;
        VeriffTextView veriffTextView = vjVar.f57083e;
        C24362h.m61210e(veriffTextView, "decision.decisionTitle");
        veriffTextView.setText(this.f56823f.mo54788cX());
        vjVar.f57080b.setText(this.f56823f.mo54704av());
        vjVar.f57082d.setText(this.f56823f.mo54704av());
        VeriffTextView veriffTextView2 = vlVar.f57095e;
        C24362h.m61210e(veriffTextView2, "uploadFailed.uploadRetryTitle");
        veriffTextView2.setText(this.f56823f.mo54698ap());
        VeriffTextView veriffTextView3 = vlVar.f57092b;
        C24362h.m61210e(veriffTextView3, "uploadFailed.uploadFailedTextBig");
        veriffTextView3.setText(this.f56823f.mo54666aJ());
        VeriffTextView veriffTextView4 = vlVar.f57093c;
        C24362h.m61210e(veriffTextView4, "uploadFailed.uploadRetryDescription");
        veriffTextView4.setText(this.f56823f.mo54667aK());
        vlVar.f57091a.setText(this.f56823f.mo54715bE());
        vjVar.f57080b.setOnClick(new VeriffButton.C24432a(this) {

            /* renamed from: a */
            public final /* synthetic */ C22520sm f56828a;

            {
                this.f56828a = r1;
            }

            public final void onClick() {
                this.f56828a.f56824g.mo56649a();
            }
        });
        vjVar.f57082d.setOnClick(new VeriffButton.C24432a(this) {

            /* renamed from: a */
            public final /* synthetic */ C22520sm f56829a;

            {
                this.f56829a = r1;
            }

            public final void onClick() {
                C21645fu f = this.f56829a.f56825h;
                C21667gf b = C21716gg.m52915b(System.currentTimeMillis() - this.f56829a.f56820c);
                C24362h.m61210e(b, "EventFactory.leaveUserWa…dMillis\n                )");
                f.mo54921a(b);
                this.f56829a.f56824g.mo56649a();
            }
        });
        VeriffToolbar veriffToolbar = vjVar.f57084f;
        C24362h.m61210e(veriffToolbar, "decision.decisionToolbar");
        veriffToolbar.mo60641a((VeriffToolbar.C24438b) new VeriffToolbar.C24438b(this) {

            /* renamed from: a */
            public final /* synthetic */ C22520sm f56830a;

            {
                this.f56830a = r1;
            }

            /* renamed from: a */
            public final void mo55837a() {
                this.f56830a.f56824g.mo56651c();
            }
        });
        C22513sh shVar = new C22513sh(xqVar.mo57135v(), this.f56823f, arrayList);
        this.f56818a = shVar;
        RecyclerView recyclerView = vjVar.f57085g;
        C24362h.m61210e(recyclerView, "decision.layoutDecisionItems");
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        RecyclerView recyclerView2 = vjVar.f57085g;
        C24362h.m61210e(recyclerView2, "decision.layoutDecisionItems");
        recyclerView2.setAdapter(shVar);
        VeriffTextView veriffTextView5 = vjVar.f57081c;
        C24362h.m61210e(veriffTextView5, "decision.decisionText");
        veriffTextView5.setVisibility(8);
        VeriffButton veriffButton = vjVar.f57080b;
        C24362h.m61210e(veriffButton, "decision.decisionCompleteBtn");
        veriffButton.setVisibility(8);
        VeriffButton veriffButton2 = vjVar.f57082d;
        C24362h.m61210e(veriffButton2, "decision.decisionTimeoutBtn");
        veriffButton2.setVisibility(8);
        vlVar.f57094d.setImageDrawable(xqVar.mo57112a(R$drawable.vrff_ic_error_network));
        vlVar.f57091a.mo60628a(false, (VeriffButton.C24432a) new VeriffButton.C24432a(this) {

            /* renamed from: a */
            public final /* synthetic */ C22520sm f56831a;

            {
                this.f56831a = r1;
            }

            public final void onClick() {
                this.f56831a.f56824g.mo56650b();
            }
        });
        if (this.f56827j) {
            VeriffTextView veriffTextView6 = vjVar.f57081c;
            C24362h.m61210e(veriffTextView6, "decision.decisionText");
            veriffTextView6.setVisibility(4);
        }
        C21645fu fuVar2 = this.f56825h;
        C21667gf T = C21716gg.m52872T();
        C24362h.m61210e(T, "EventFactory.leaveUserWaitingShownEvent()");
        fuVar2.mo54921a(T);
    }

    public View getView() {
        return this;
    }

    public void setCurrentStep(int i) {
        C23029b bVar;
        int i2 = 0;
        for (T next : this.f56819b) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C23032e eVar = (C23032e) next;
                if (i2 < i) {
                    bVar = C23029b.DONE;
                } else {
                    int size = this.f56819b.size() - 1;
                    if (i <= size) {
                        size = i;
                    }
                    if (i2 == size) {
                        bVar = C23029b.STARTED;
                    } else {
                        bVar = C23029b.NOT_STARTED;
                    }
                }
                this.f56819b.set(i2, C23032e.m56897a(eVar, (CharSequence) null, bVar, 1, (Object) null));
                i2 = i3;
            } else {
                C17875h.m44294U();
                throw null;
            }
        }
        this.f56818a.notifyDataSetChanged();
        if (i >= this.f56819b.size()) {
            this.f56821d.mo56985a().post(new C22526b(this));
        }
    }

    /* renamed from: a */
    public void mo56644a() {
        ScrollView a = this.f56821d.mo56985a();
        C24362h.m61210e(a, "decision.root");
        int i = 0;
        a.setVisibility(0);
        RelativeLayout a2 = this.f56822e.mo56986a();
        C24362h.m61210e(a2, "uploadFailed.root");
        a2.setVisibility(8);
        for (T next : this.f56819b) {
            int i2 = i + 1;
            if (i >= 0) {
                this.f56819b.set(i, C23032e.m56897a((C23032e) next, (CharSequence) null, i == 0 ? C23029b.STARTED : C23029b.NOT_STARTED, 1, (Object) null));
                i = i2;
            } else {
                C17875h.m44294U();
                throw null;
            }
        }
        this.f56818a.notifyDataSetChanged();
    }

    /* renamed from: b */
    public void mo56645b() {
        RelativeLayout a = this.f56822e.mo56986a();
        C24362h.m61210e(a, "uploadFailed.root");
        a.setVisibility(0);
        ScrollView a2 = this.f56821d.mo56985a();
        C24362h.m61210e(a2, "decision.root");
        a2.setVisibility(8);
    }

    /* renamed from: c */
    public void mo56646c() {
        int i = 0;
        for (T next : this.f56819b) {
            int i2 = i + 1;
            if (i >= 0) {
                this.f56819b.set(i, C23032e.m56897a((C23032e) next, (CharSequence) null, C23029b.DONE, 1, (Object) null));
                i = i2;
            } else {
                C17875h.m44294U();
                throw null;
            }
        }
        this.f56821d.f57085g.post(new C22525a(this));
        VeriffButton veriffButton = this.f56821d.f57082d;
        C24362h.m61210e(veriffButton, "decision.decisionTimeoutBtn");
        veriffButton.setVisibility(8);
        VeriffButton veriffButton2 = this.f56821d.f57080b;
        C24362h.m61210e(veriffButton2, "decision.decisionCompleteBtn");
        veriffButton2.setVisibility(0);
        VeriffTextView veriffTextView = this.f56821d.f57081c;
        C24362h.m61210e(veriffTextView, "decision.decisionText");
        veriffTextView.setVisibility(0);
        VeriffTextView veriffTextView2 = this.f56821d.f57081c;
        C24362h.m61210e(veriffTextView2, "decision.decisionText");
        veriffTextView2.setText(this.f56823f.mo54703au());
    }
}
