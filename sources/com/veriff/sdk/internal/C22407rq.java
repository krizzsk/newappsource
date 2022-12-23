package com.veriff.sdk.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import bf0.C21050d;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.widgets.DropdownButton;
import com.veriff.sdk.views.C22932d;
import com.veriff.views.VeriffTextView;
import kotlin.Metadata;
import lf0.C24225a;
import lf0.C24236l;
import mf0.C24362h;
import mobi.lab.veriff.layouts.VeriffButton;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002'(BG\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00008\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006)"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/MrzInfoView;", "Landroid/widget/ScrollView;", "Lcom/veriff/sdk/views/Screen;", "Lcom/veriff/sdk/views/nfc/PendingMrzInfo;", "createMrzInfo", "Lbf0/d;", "updateButtonState", "Lmobi/lab/veriff/databinding/VrffViewMrzInfoBinding;", "binding", "Lmobi/lab/veriff/databinding/VrffViewMrzInfoBinding;", "Lcom/veriff/sdk/views/nfc/DatePicker;", "dateOfBirth", "Lcom/veriff/sdk/views/nfc/DatePicker;", "dateOfExpiry", "Lcom/veriff/sdk/internal/analytics/Page;", "page", "Lcom/veriff/sdk/internal/analytics/Page;", "getPage", "()Lcom/veriff/sdk/internal/analytics/Page;", "view", "Lcom/veriff/sdk/views/nfc/MrzInfoView;", "getView", "()Lcom/veriff/sdk/views/nfc/MrzInfoView;", "Landroid/content/Context;", "context", "windowContext", "Lcom/veriff/sdk/Strings;", "strings", "Lcom/veriff/sdk/views/nfc/MrzInfoView$Mode;", "mode", "pendingMrzInfo", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "veriffResourcesProvider", "", "showSkip", "Lcom/veriff/sdk/views/nfc/MrzInfoView$Listener;", "listener", "<init>", "(Landroid/content/Context;Landroid/content/Context;Lcom/veriff/sdk/Strings;Lcom/veriff/sdk/views/nfc/MrzInfoView$Mode;Lcom/veriff/sdk/views/nfc/PendingMrzInfo;Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;ZLcom/veriff/sdk/views/nfc/MrzInfoView$Listener;)V", "Listener", "Mode", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
@SuppressLint({"ViewConstructor"})
/* renamed from: com.veriff.sdk.internal.rq */
public final class C22407rq extends ScrollView implements C22932d {

    /* renamed from: a */
    private final C22407rq f56568a = this;

    /* renamed from: b */
    private final C21783is f56569b = C21783is.mrz_manual_input;

    /* renamed from: c */
    private final C22651wf f56570c;

    /* renamed from: d */
    private final C22404rp f56571d;

    /* renamed from: e */
    private final C22404rp f56572e;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo59060d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lbf0/d;", "onClick", "(Landroid/view/View;)V", "com/veriff/sdk/views/nfc/MrzInfoView$1$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rq$a */
    public static final class C22412a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C21616ex f56578a;

        /* renamed from: b */
        public final /* synthetic */ C22414c f56579b;

        public C22412a(C21616ex exVar, C22414c cVar) {
            this.f56578a = exVar;
            this.f56579b = cVar;
        }

        public final void onClick(View view) {
            this.f56579b.mo56491b();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, mo59060d2 = {"Lbf0/d;", "onClick", "()V", "com/veriff/sdk/views/nfc/MrzInfoView$2$1", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rq$b */
    public static final class C22413b implements VeriffButton.C24432a {

        /* renamed from: a */
        public final /* synthetic */ C21616ex f56580a;

        /* renamed from: b */
        public final /* synthetic */ C22414c f56581b;

        public C22413b(C21616ex exVar, C22414c cVar, boolean z) {
            this.f56580a = exVar;
            this.f56581b = cVar;
        }

        public final void onClick() {
            this.f56581b.mo56489a();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0002H&¨\u0006\b"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/MrzInfoView$Listener;", "", "Lbf0/d;", "onCloseClicked", "Lcom/veriff/sdk/views/nfc/PendingMrzInfo;", "info", "onMrzConfirmed", "onSkipClicked", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rq$c */
    public interface C22414c {
        /* renamed from: a */
        void mo56489a();

        /* renamed from: a */
        void mo56490a(C22466rz rzVar);

        /* renamed from: b */
        void mo56491b();
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B3\b\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u000b\u0010\fR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, mo59060d2 = {"Lcom/veriff/sdk/views/nfc/MrzInfoView$Mode;", "", "Lkotlin/Function1;", "Lcom/veriff/sdk/Strings;", "", "description", "Llf0/l;", "getDescription", "()Llf0/l;", "title", "getTitle", "<init>", "(Ljava/lang/String;ILlf0/l;Llf0/l;)V", "ENTRY", "REVIEW", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.rq$d */
    public enum C22415d {
        ENTRY(C224161.f56587a, C224172.f56588a),
        REVIEW(C224183.f56589a, C224194.f56590a);
        

        /* renamed from: d */
        private final C24236l<C21616ex, CharSequence> f56585d;

        /* renamed from: e */
        private final C24236l<C21616ex, CharSequence> f56586e;

        private C22415d(C24236l<? super C21616ex, ? extends CharSequence> lVar, C24236l<? super C21616ex, ? extends CharSequence> lVar2) {
            this.f56585d = lVar;
            this.f56586e = lVar2;
        }

        /* renamed from: a */
        public final C24236l<C21616ex, CharSequence> mo56492a() {
            return this.f56585d;
        }

        /* renamed from: b */
        public final C24236l<C21616ex, CharSequence> mo56493b() {
            return this.f56586e;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22407rq(Context context, Context context2, C21616ex exVar, C22415d dVar, C22466rz rzVar, C22700xq xqVar, boolean z, final C22414c cVar) {
        super(context);
        int i;
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(context2, "windowContext");
        C24362h.m61211f(exVar, "strings");
        C24362h.m61211f(dVar, "mode");
        C24362h.m61211f(rzVar, "pendingMrzInfo");
        C24362h.m61211f(xqVar, "veriffResourcesProvider");
        C24362h.m61211f(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C22651wf a = C22651wf.m55214a(LayoutInflater.from(context), this);
        C24362h.m61210e(a, "VrffViewMrzInfoBinding.i…ater.from(context), this)");
        this.f56570c = a;
        setBackgroundColor(xqVar.mo57135v().mo57096k());
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setFillViewport(true);
        ImageView imageView = a.f57243b;
        imageView.setContentDescription(exVar.mo54719bI());
        imageView.setOnClickListener(new C22412a(exVar, cVar));
        VeriffButton veriffButton = a.f57252k;
        veriffButton.setText(exVar.mo54711bA());
        veriffButton.setOnClick(new C22413b(exVar, cVar, z));
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        veriffButton.setVisibility(i);
        VeriffTextView veriffTextView = a.f57244c;
        C24362h.m61210e(veriffTextView, "binding.instructionTitle");
        veriffTextView.setText(dVar.mo56492a().invoke(exVar));
        VeriffTextView veriffTextView2 = a.f57248g;
        C24362h.m61210e(veriffTextView2, "binding.mrzDocumentNumberLabel");
        veriffTextView2.setText(exVar.mo54819dA());
        EditText editText = a.f57247f;
        C24362h.m61210e(editText, "binding.mrzDocumentNumber");
        editText.setBackground(xqVar.mo57126m());
        a.f57247f.setTextColor(xqVar.mo57135v().mo57098m());
        a.f57247f.setHintTextColor(xqVar.mo57135v().mo57099n());
        EditText editText2 = a.f57247f;
        C24362h.m61210e(editText2, "binding.mrzDocumentNumber");
        editText2.setHint(exVar.mo54819dA());
        VeriffTextView veriffTextView3 = a.f57246e;
        C24362h.m61210e(veriffTextView3, "binding.mrzDobLabel");
        veriffTextView3.setText(exVar.mo54821dC());
        VeriffTextView veriffTextView4 = a.f57250i;
        C24362h.m61210e(veriffTextView4, "binding.mrzDoeLabel");
        veriffTextView4.setText(exVar.mo54820dB());
        a.f57251j.setText(exVar.mo54712bB());
        CharSequence invoke = dVar.mo56493b().invoke(exVar);
        if (invoke != null) {
            VeriffTextView veriffTextView5 = a.f57253l;
            C24362h.m61210e(veriffTextView5, "binding.mrzModeDescription");
            veriffTextView5.setVisibility(0);
            VeriffTextView veriffTextView6 = a.f57253l;
            C24362h.m61210e(veriffTextView6, "binding.mrzModeDescription");
            veriffTextView6.setText(invoke);
        } else {
            VeriffTextView veriffTextView7 = a.f57253l;
            C24362h.m61210e(veriffTextView7, "binding.mrzModeDescription");
            veriffTextView7.setVisibility(8);
        }
        String c = rzVar.mo56561c();
        if (c != null) {
            a.f57247f.setText(c);
        }
        a.f57247f.addTextChangedListener(new TextWatcher(this) {

            /* renamed from: a */
            public final /* synthetic */ C22407rq f56573a;

            {
                this.f56573a = r1;
            }

            public void afterTextChanged(Editable editable) {
                this.f56573a.mo56482a();
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        DropdownButton dropdownButton = a.f57245d;
        C24362h.m61210e(dropdownButton, "binding.mrzDob");
        C22404rp rpVar = new C22404rp(context2, dropdownButton, exVar.mo54821dC());
        this.f56571d = rpVar;
        rpVar.mo56477a(rzVar.mo56562d());
        DropdownButton dropdownButton2 = a.f57249h;
        C24362h.m61210e(dropdownButton2, "binding.mrzDoe");
        C22404rp rpVar2 = new C22404rp(context2, dropdownButton2, exVar.mo54820dB());
        this.f56572e = rpVar2;
        rpVar2.mo56477a(rzVar.mo56564e());
        rpVar.mo56478a((C24225a<C21050d>) new C24225a<C21050d>(this) {

            /* renamed from: a */
            public final /* synthetic */ C22407rq f56574a;

            {
                this.f56574a = r1;
            }

            /* renamed from: a */
            public final void mo56486a() {
                this.f56574a.mo56482a();
            }

            public /* synthetic */ Object invoke() {
                mo56486a();
                return C21050d.f52856a;
            }
        });
        rpVar2.mo56478a((C24225a<C21050d>) new C24225a<C21050d>(this) {

            /* renamed from: a */
            public final /* synthetic */ C22407rq f56575a;

            {
                this.f56575a = r1;
            }

            /* renamed from: a */
            public final void mo56487a() {
                this.f56575a.mo56482a();
            }

            public /* synthetic */ Object invoke() {
                mo56487a();
                return C21050d.f52856a;
            }
        });
        a.f57251j.setOnClick(new VeriffButton.C24432a(this) {

            /* renamed from: a */
            public final /* synthetic */ C22407rq f56576a;

            {
                this.f56576a = r1;
            }

            public final void onClick() {
                cVar.mo56490a(this.f56576a.m54670b());
            }
        });
        mo56482a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C22466rz m54670b() {
        boolean z;
        EditText editText = this.f56570c.f57247f;
        C24362h.m61210e(editText, "binding.mrzDocumentNumber");
        String obj = editText.getText().toString();
        if (obj.length() >= 5) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            obj = null;
        }
        return new C22466rz(obj, this.f56571d.mo56476a(), this.f56572e.mo56476a(), true);
    }

    public void create() {
        C22932d.C22933a.m56592b(this);
    }

    public void destroy() {
        C22932d.C22933a.m56597g(this);
    }

    /* renamed from: f */
    public boolean mo56147f() {
        return C22932d.C22933a.m56598h(this);
    }

    public C21783is getPage() {
        return this.f56569b;
    }

    public Integer getStatusBarColor() {
        return C22932d.C22933a.m56591a(this);
    }

    public void pause() {
        C22932d.C22933a.m56595e(this);
    }

    public void resume() {
        C22932d.C22933a.m56594d(this);
    }

    public void start() {
        C22932d.C22933a.m56593c(this);
    }

    public void stop() {
        C22932d.C22933a.m56596f(this);
    }

    /* renamed from: a */
    public final void mo56482a() {
        this.f56570c.f57251j.mo60627a(m54670b().mo56559a() != null);
    }

    public C22407rq getView() {
        return this.f56568a;
    }
}
