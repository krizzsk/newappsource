package com.veriff.sdk.internal;

import android.os.Bundle;
import androidx.lifecycle.C1019k0;
import androidx.lifecycle.C1026n0;
import com.veriff.sdk.views.base.verification.C22814a;
import com.veriff.sdk.views.base.verification.C22821g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import mobi.lab.veriff.data.C24424c;
import mobi.lab.veriff.data.C24426d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\f\u001a\u00020\u000b*\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\n\u0010\r\u001a\u00020\u000b*\u00020\bJ\u0014\u0010\r\u001a\u00020\u000b*\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u0011"}, mo59060d2 = {"Lcom/veriff/di/Injector;", "", "Landroid/os/Bundle;", "savedInstanceState", "Lcom/veriff/sdk/internal/data/VerificationState;", "state", "Lbf0/d;", "eject", "Lcom/veriff/sdk/views/base/BaseActivity;", "Lmobi/lab/veriff/data/SessionArguments;", "sessionArguments", "", "ensureSessionArguments", "inject", "Lcom/veriff/sdk/views/base/verification/BaseVerificationActivity;", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.di */
public final class C21566di {

    /* renamed from: a */
    public static final C21566di f54308a = new C21566di();

    private C21566di() {
    }

    /* renamed from: a */
    public final boolean mo54583a(C22233ot otVar) {
        C24362h.m61211f(otVar, "$this$inject");
        C24426d dVar = (C24426d) otVar.getIntent().getParcelableExtra("com.veriff.sdk.EXTRA_SESSION_ARGUMENTS");
        if (m51588a(otVar, dVar)) {
            return false;
        }
        C22663wn c = C21593eg.f54334a.mo54610a().mo54566c();
        C24362h.m61208c(dVar);
        c.mo57035a(otVar, dVar).mo54570a(otVar);
        return true;
    }

    /* renamed from: a */
    public final boolean mo54584a(C22814a aVar, Bundle bundle) {
        C21900jz jzVar;
        C24362h.m61211f(aVar, "$this$inject");
        C21895jw jwVar = (C21895jw) aVar.getIntent().getParcelableExtra("com.veriff.sdk.EXTRA_START_SESSION_DATA");
        if (m51588a((C22233ot) aVar, (C24426d) aVar.getIntent().getParcelableExtra("com.veriff.sdk.EXTRA_SESSION_ARGUMENTS"))) {
            return false;
        }
        if (jwVar == null) {
            aVar.mo56159j().mo54910d().mo55690a(new IllegalArgumentException("sessionData null"), "baseVerificationActivity", C21720gj.session_start);
            aVar.finish();
            return false;
        }
        if (bundle == null || (jzVar = (C21900jz) bundle.getParcelable("com.veriff.sdk.EXTRA_VERIFICATION_STATE")) == null) {
            jzVar = new C21900jz((C24424c) null, (String) null, 3, (DefaultConstructorMarker) null);
        }
        C1019k0 a = new C1026n0(aVar).mo4313a(C22821g.class);
        C24362h.m61210e(a, "ViewModelProvider(this).…ionViewModel::class.java)");
        ((C22821g) a).mo57589a(jwVar, jzVar, aVar.mo56160k()).mo54573a(aVar);
        return true;
    }

    /* renamed from: a */
    public final void mo54582a(Bundle bundle, C21900jz jzVar) {
        C24362h.m61211f(bundle, "savedInstanceState");
        C24362h.m61211f(jzVar, "state");
        bundle.putParcelable("com.veriff.sdk.EXTRA_VERIFICATION_STATE", jzVar);
    }

    /* renamed from: a */
    private final boolean m51588a(C22233ot otVar, C24426d dVar) {
        if (dVar != null) {
            return false;
        }
        C21567dj.f54309a.mo60711w("Activity launched without any session arguments");
        otVar.finish();
        return true;
    }
}
