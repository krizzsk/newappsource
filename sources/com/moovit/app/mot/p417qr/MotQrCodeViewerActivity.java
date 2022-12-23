package com.moovit.app.mot.p417qr;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.app.MoovitAppActivity;
import com.moovit.design.view.AlertMessageView;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import java.util.HashSet;
import java.util.Set;
import p259t5.C6593c;
import p664mu.C18443f;
import p853uu.C19992b;
import p853uu.C19993c;

/* renamed from: com.moovit.app.mot.qr.MotQrCodeViewerActivity */
public class MotQrCodeViewerActivity extends MoovitAppActivity {

    /* renamed from: X */
    public static final /* synthetic */ int f39075X = 0;

    /* renamed from: U */
    public AlertMessageView f39076U;

    /* renamed from: com.moovit.app.mot.qr.MotQrCodeViewerActivity$a */
    public static /* synthetic */ class C15171a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39077a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.moovit.app.mot.model.MotActivation$ActivationType[] r0 = com.moovit.app.mot.model.MotActivation.ActivationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39077a = r0
                com.moovit.app.mot.model.MotActivation$ActivationType r1 = com.moovit.app.mot.model.MotActivation.ActivationType.DEPARTURE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f39077a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.mot.model.MotActivation$ActivationType r1 = com.moovit.app.mot.model.MotActivation.ActivationType.ENTRANCE_ONLY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f39077a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.mot.model.MotActivation$ActivationType r1 = com.moovit.app.mot.model.MotActivation.ActivationType.ENTRANCE_AND_EXIT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.mot.p417qr.MotQrCodeViewerActivity.C15171a.<clinit>():void");
        }
    }

    /* renamed from: y2 */
    public static Intent m38705y2(Context context, ServerId serverId, String str) {
        Intent intent = new Intent(context, MotQrCodeViewerActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("priceReference", str);
        intent.putExtra("activationId", serverId);
        return intent;
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        setIntent(intent);
        Fragment n1 = mo44529n1(R.id.fragments_container);
        if (n1 != null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C0909a aVar = new C0909a(supportFragmentManager);
            aVar.mo4050p(n1);
            aVar.mo4046l();
        }
        mo45624z2();
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.mot_qr_viewer_activity);
        getWindow().setFlags(8192, 8192);
        AlertMessageView alertMessageView = (AlertMessageView) findViewById(R.id.failure_view);
        this.f39076U = alertMessageView;
        alertMessageView.setNegativeButtonClickListener(new C6593c(this, 21));
        if (mo44529n1(R.id.fragments_container) == null) {
            mo45624z2();
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("MOT_SUPPORT_VALIDATOR");
        return s1;
    }

    /* renamed from: z2 */
    public final void mo45624z2() {
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("priceReference");
        ServerId serverId = (ServerId) intent.getParcelableExtra("activationId");
        if (stringExtra != null) {
            this.f39076U.setVisibility(8);
            C18443f.m45298d().mo50887a(stringExtra).addOnSuccessListener((Activity) this, new C19992b(0, this, stringExtra, serverId)).addOnFailureListener((Activity) this, (OnFailureListener) new C19993c(this, stringExtra, serverId));
            return;
        }
        throw new IllegalStateException("Did you use MotQrCodeViewerActivity.newInstance(...)?");
    }
}
