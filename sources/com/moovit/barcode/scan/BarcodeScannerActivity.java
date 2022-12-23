package com.moovit.barcode.scan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import c00.C13717b;
import c20.C13744a;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.barcode.Barcode;
import com.moovit.barcode.scan.BarcodeScannerFragment;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0017h;
import p067e1.C4464a;
import p432cz.C16527b;
import p432cz.C16528c;
import p543hq.C17474b;
import p977zz.C20948k0;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo59060d2 = {"Lcom/moovit/barcode/scan/BarcodeScannerActivity;", "Lcom/moovit/MoovitActivity;", "Lcom/moovit/barcode/scan/BarcodeScannerFragment$a;", "<init>", "()V", "Barcode_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class BarcodeScannerActivity extends MoovitActivity implements BarcodeScannerFragment.C15681a {

    /* renamed from: U */
    public static final /* synthetic */ int f40810U = 0;

    /* renamed from: y2 */
    public static final Intent m40033y2(Context context, Set set, String str, String str2, Image image, String str3) {
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        Intent intent = new Intent(context, BarcodeScannerActivity.class);
        intent.putExtra("formats", C13717b.m34264k(set));
        intent.putExtra("title", str);
        intent.putExtra("actionId", str2);
        intent.putExtra("icon", image);
        intent.putExtra("instructions", str3);
        return intent;
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C16528c.barcode_scanner_activity);
        setTitle(getIntent().getStringExtra("title"));
        View findViewById = findViewById(C16527b.instructions);
        C24362h.m61210e(findViewById, "findViewById(R.id.instructions)");
        TextView textView = (TextView) findViewById;
        UiUtils.m40236D(textView, getIntent().getStringExtra("instructions"), 8);
        C13744a.m34299a(textView, UiUtils.Edge.TOP, (Image) getIntent().getParcelableExtra("icon"));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        String str = BarcodeScannerFragment.f40811n;
        if (supportFragmentManager.mo3923A(str) == null) {
            ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("formats");
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            C0909a K = C0017h.m54K(supportFragmentManager2, supportFragmentManager2);
            int i = C16527b.container;
            BarcodeScannerFragment barcodeScannerFragment = new BarcodeScannerFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelableArrayList("formats", C13717b.m34264k(parcelableArrayListExtra));
            barcodeScannerFragment.setArguments(bundle2);
            K.mo4111f(i, barcodeScannerFragment, str);
            K.mo4040d();
        }
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        if (!C20948k0.m49058a(this, "android.permission.CAMERA")) {
            C4464a.m11673a(this, new String[]{"android.permission.CAMERA"}, 1001);
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        boolean z;
        C24362h.m61211f(strArr, "permissions");
        C24362h.m61211f(iArr, "grantResults");
        if (i == 1001) {
            if (iArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!(!z) || iArr[0] != 0) {
                finish();
            } else if (!C20948k0.m49058a(this, "android.permission.CAMERA")) {
                C4464a.m11673a(this, new String[]{"android.permission.CAMERA"}, 1001);
            }
        } else {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).clear();
        return s1;
    }

    /* renamed from: w */
    public final void mo23711w(Barcode barcode) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.QR_READ);
        aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, true);
        mo44545v2(aVar.mo49933a());
        Intent intent = new Intent();
        intent.putExtra("barcode", barcode);
        intent.putExtra("actionId", getIntent().getStringExtra("actionId"));
        setResult(-1, intent);
        finish();
    }
}
