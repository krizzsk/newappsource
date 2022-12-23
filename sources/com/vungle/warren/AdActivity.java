package com.vungle.warren;

import ae0.C20979a;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import be0.C21012c;
import com.vungle.warren.C23157i0;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.p979ui.state.BundleOptionsState;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p130j2.C5367a;
import xd0.C25242a;
import xd0.C25246d;
import yd0.C25286a;
import yd0.C25287b;

public abstract class AdActivity extends Activity {

    /* renamed from: k */
    public static C25287b.C25288a f58486k;

    /* renamed from: b */
    public C25287b f58487b;

    /* renamed from: c */
    public C23089a f58488c;

    /* renamed from: d */
    public AdRequest f58489d;

    /* renamed from: e */
    public C23157i0 f58490e;

    /* renamed from: f */
    public C20979a f58491f;

    /* renamed from: g */
    public AtomicBoolean f58492g = new AtomicBoolean(false);

    /* renamed from: h */
    public boolean f58493h = false;

    /* renamed from: i */
    public boolean f58494i = false;

    /* renamed from: j */
    public C23064c f58495j = new C23064c();

    /* renamed from: com.vungle.warren.AdActivity$a */
    public class C23062a implements C25242a {
        public C23062a() {
        }

        public final void close() {
            AdActivity.this.finish();
        }
    }

    /* renamed from: com.vungle.warren.AdActivity$b */
    public class C23063b implements C25246d {
        public C23063b() {
        }
    }

    /* renamed from: com.vungle.warren.AdActivity$c */
    public class C23064c implements C23157i0.C23158a {
        public C23064c() {
        }

        /* renamed from: a */
        public final void mo58027a(Pair<C25286a, C25287b> pair, VungleException vungleException) {
            if (vungleException != null) {
                AdActivity.this.f58490e = null;
                AdActivity.m56986b(vungleException.mo58207a(), AdActivity.this.f58489d);
                AdActivity.this.finish();
                return;
            }
            AdActivity adActivity = AdActivity.this;
            C25287b bVar = (C25287b) pair.second;
            adActivity.f58487b = bVar;
            bVar.mo61891n(AdActivity.f58486k);
            AdActivity adActivity2 = AdActivity.this;
            adActivity2.f58487b.mo61884b((C25286a) pair.first, adActivity2.f58491f);
            if (AdActivity.this.f58492g.getAndSet(false)) {
                AdActivity.this.mo58013d();
            }
        }
    }

    /* renamed from: b */
    public static void m56986b(int i, AdRequest adRequest) {
        VungleException vungleException = new VungleException(i);
        C25287b.C25288a aVar = f58486k;
        if (aVar != null) {
            ((C23094b) aVar).mo58094b(adRequest.mo58041f(), vungleException);
        }
        VungleLogger.m57029b("AdActivity#deliverError", vungleException.getLocalizedMessage());
    }

    /* renamed from: c */
    public static AdRequest m56987c(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return (AdRequest) extras.getSerializable("request");
        }
        return null;
    }

    /* renamed from: a */
    public abstract void mo58012a();

    /* renamed from: d */
    public final void mo58013d() {
        if (this.f58487b == null) {
            this.f58492g.set(true);
        } else if (!this.f58493h && this.f58494i && hasWindowFocus()) {
            this.f58487b.start();
            this.f58493h = true;
        }
    }

    /* renamed from: e */
    public final void mo58014e() {
        char c;
        if (this.f58487b != null && this.f58493h) {
            boolean isChangingConfigurations = isChangingConfigurations();
            if (isFinishing()) {
                c = 2;
            } else {
                c = 0;
            }
            this.f58487b.mo61888g(isChangingConfigurations | c ? 1 : 0);
            this.f58493h = false;
        }
        this.f58492g.set(false);
    }

    @SuppressLint({"ResourceType"})
    public final void onBackPressed() {
        C25287b bVar = this.f58487b;
        if (bVar != null) {
            bVar.mo61885d();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        C25287b bVar = this.f58487b;
        if (bVar != null) {
            bVar.mo61887f();
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void onCreate(Bundle bundle) {
        AdRequest adRequest;
        C20979a aVar;
        Bundle bundle2 = bundle;
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(16777216, 16777216);
        this.f58489d = m56987c(getIntent());
        C23236v0 a = C23236v0.m57280a(this);
        if (!((C23252x1) a.mo58350c(C23252x1.class)).isInitialized() || f58486k == null || (adRequest = this.f58489d) == null || TextUtils.isEmpty(adRequest.mo58041f())) {
            finish();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        VungleLogger.m57031d("ttDownloadContext", String.format("Creating ad, request = %1$s, at: %2$d", new Object[]{this.f58489d, Long.valueOf(currentTimeMillis)}));
        try {
            C21012c cVar = new C21012c(this, getWindow());
            this.f58490e = (C23157i0) a.mo58350c(C23157i0.class);
            if (bundle2 == null) {
                aVar = null;
            } else {
                aVar = (C20979a) bundle2.getParcelable("presenter_state");
            }
            C20979a aVar2 = aVar;
            this.f58491f = aVar2;
            Bundle bundle3 = bundle;
            C21012c cVar2 = cVar;
            this.f58490e.mo58227a(this, this.f58489d, cVar, aVar2, new C23062a(), new C23063b(), bundle3, this.f58495j);
            setContentView(cVar2, cVar2.getLayoutParams());
            this.f58488c = new C23089a(this);
            C5367a.m13473a(getApplicationContext()).mo21146b(this.f58488c, new IntentFilter("AdvertisementBus"));
            VungleLogger.m57031d("ttDownloadContext", String.format("Ad created, request = %1$s, elapsed time: %2$dms", new Object[]{this.f58489d, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)}));
        } catch (InstantiationException unused) {
            m56986b(10, this.f58489d);
            finish();
        }
    }

    public final void onDestroy() {
        C5367a.m13473a(getApplicationContext()).mo21148d(this.f58488c);
        C25287b bVar = this.f58487b;
        if (bVar != null) {
            bVar.mo61889i(isChangingConfigurations() | true ? 1 : 0);
        } else {
            C23157i0 i0Var = this.f58490e;
            if (i0Var != null) {
                i0Var.destroy();
                this.f58490e = null;
                m56986b(25, this.f58489d);
            }
        }
        super.onDestroy();
    }

    public final void onNewIntent(Intent intent) {
        String str;
        super.onNewIntent(intent);
        AdRequest c = m56987c(getIntent());
        AdRequest c2 = m56987c(intent);
        String str2 = null;
        if (c != null) {
            str = c.mo58041f();
        } else {
            str = null;
        }
        if (c2 != null) {
            str2 = c2.mo58041f();
        }
        if (str != null && str2 != null && !str.equals(str2)) {
            m56986b(15, c2);
            VungleLogger.m57032e("AdActivity#onNewIntent", String.format("Tried to play another placement %1$s while playing %2$s", new Object[]{str2, str}));
        }
    }

    public final void onPause() {
        super.onPause();
        this.f58494i = false;
        mo58014e();
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        C25287b bVar;
        super.onRestoreInstanceState(bundle);
        Objects.toString(bundle);
        if (bundle != null && (bVar = this.f58487b) != null) {
            bVar.mo61890k((C20979a) bundle.getParcelable("presenter_state"));
        }
    }

    public final void onResume() {
        super.onResume();
        this.f58494i = true;
        mo58013d();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        BundleOptionsState bundleOptionsState = new BundleOptionsState();
        C25287b bVar = this.f58487b;
        if (bVar != null) {
            bVar.mo61886e(bundleOptionsState);
            bundle.putParcelable("presenter_state", bundleOptionsState);
        }
        C23157i0 i0Var = this.f58490e;
        if (i0Var != null) {
            i0Var.mo58229c(bundle);
        }
        super.onSaveInstanceState(bundle);
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            mo58013d();
        } else {
            mo58014e();
        }
    }

    public final void setRequestedOrientation(int i) {
        mo58012a();
        super.setRequestedOrientation(i);
    }
}
