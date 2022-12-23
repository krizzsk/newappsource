package com.moovit.app.mot.purchase;

import a00.C13382a;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Vibrator;
import android.p014os.VibrationEffect;
import android.widget.TextView;
import com.google.android.exoplayer2.p052ui.C4054t;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.barcode.Barcode;
import com.moovit.barcode.scan.BarcodeScannerFragment;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.location.C16202a;
import com.moovit.location.LocationSettingsFixer;
import com.tranzmate.R;
import java.util.HashSet;
import java.util.Set;
import p067e1.C4464a;
import p543hq.C17474b;
import p858uz.C20061g;
import p977zz.C20934d0;
import p977zz.C20943i;
import p977zz.C20948k0;
import z20.C20806a;

public class MotQrCodeScanActivity extends MoovitAppActivity implements BarcodeScannerFragment.C15681a {

    /* renamed from: U */
    public static final /* synthetic */ int f39030U = 0;

    /* renamed from: com.moovit.app.mot.purchase.MotQrCodeScanActivity$a */
    public class C15157a extends LocationSettingsFixer.C16200b {
        public C15157a(Context context) {
            super(context);
        }

        /* renamed from: a */
        public final void mo45589a(Exception exc) {
            super.mo45589a(exc);
            MotQrCodeScanActivity.this.finish();
        }

        /* renamed from: b */
        public final void mo23896b(Location location) {
            MotQrCodeScanActivity motQrCodeScanActivity = MotQrCodeScanActivity.this;
            int i = MotQrCodeScanActivity.f39030U;
            motQrCodeScanActivity.mo45588z2(location);
        }
    }

    /* renamed from: A2 */
    public final void mo45586A2() {
        if (!C20948k0.m49058a(this, "android.permission.CAMERA")) {
            C4464a.m11673a(this, new String[]{"android.permission.CAMERA"}, 1001);
            return;
        }
        if (!C20934d0.m49032c(this)) {
            LocationSettingsFixer.C16198a aVar = new LocationSettingsFixer.C16198a((MoovitActivity) this);
            aVar.f42259f = true;
            aVar.mo48528a(new C15157a(this));
        }
        mo45588z2(mo44542u1());
    }

    /* renamed from: V0 */
    public final void mo19423V0(Bundle bundle, String str) {
        if ("no_location_dialog_tag".equals(str)) {
            Location u1 = mo44542u1();
            if (u1 == null || u1.isFromMockProvider()) {
                finish();
            } else {
                mo45588z2(u1);
            }
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.mot_qr_ride_activation_activity);
        findViewById(R.id.cta_view).setOnClickListener(new C4054t(7, this, getString(R.string.payment_mot_qr_support_number)));
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        mo45586A2();
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareRealTimeAccuracyFrequentUpdates();
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 1001) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        } else if (iArr.length <= 0 || iArr[0] != 0) {
            finish();
        } else {
            mo45586A2();
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("MOT_SUPPORT_VALIDATOR");
        return s1;
    }

    /* renamed from: w */
    public final void mo23711w(Barcode barcode) {
        if (!isFinishing()) {
            Location u1 = mo44542u1();
            if (u1 == null || u1.isFromMockProvider()) {
                mo45587y2();
                return;
            }
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_on_qr_code_scanned");
            mo44545v2(aVar.mo49933a());
            new C20806a.C20807a("QR_scan_tap").mo52935c();
            Vibrator vibrator = (Vibrator) getSystemService("vibrator");
            if (C20943i.m49051d(26)) {
                vibrator.vibrate(VibrationEffect.createOneShot(300, -1));
            } else {
                vibrator.vibrate(300);
            }
            String str = barcode.f40798b;
            long currentTimeMillis = System.currentTimeMillis();
            LatLonE6 j = LatLonE6.m40177j(u1);
            Intent intent = new Intent(this, MotQrCodeActivationActivity.class);
            intent.putExtra("qrCode", str);
            intent.putExtra("scanTime", currentTimeMillis);
            intent.putExtra("scanLocation", j);
            startActivity(intent);
            finish();
        }
    }

    /* renamed from: y2 */
    public final void mo45587y2() {
        if (this.f37313z && mo44534p1("no_location_dialog_tag") == null) {
            new AlertDialogFragment.C15856a((Context) this).mo47682k("no_location_dialog_tag").mo47676e(R.drawable.img_empty_warning, false).mo47683l(R.string.location_inaccurate_message).mo47678g(R.string.payment_mot_location_error_sub).mo47681j(R.string.std_positive_button).mo47673b().show(getSupportFragmentManager(), "no_location_dialog_tag");
        }
    }

    /* renamed from: z2 */
    public final void mo45588z2(Location location) {
        if (location == null || location.isFromMockProvider()) {
            mo45587y2();
            return;
        }
        TextView textView = (TextView) findViewById(R.id.message);
        C13382a.m33665a(textView, textView.getText());
    }
}
