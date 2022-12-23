package p686ns;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.location.Location;
import android.view.View;
import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.app.general.settings.SettingsActivity;
import com.moovit.image.ImageProviderFragment;
import com.moovit.payment.account.model.PaymentAccount;
import com.tranzmate.R;
import f10.C16935f;
import f10.C16937h;
import p858uz.C20048a;

/* renamed from: ns.a */
public final /* synthetic */ class C18587a implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f47318b;

    /* renamed from: c */
    public final /* synthetic */ Object f47319c;

    public /* synthetic */ C18587a(Object obj, int i) {
        this.f47318b = i;
        this.f47319c = obj;
    }

    public final void onSuccess(Object obj) {
        boolean z;
        switch (this.f47318b) {
            case 0:
                SettingsActivity settingsActivity = (SettingsActivity) this.f47319c;
                PaymentAccount paymentAccount = (PaymentAccount) obj;
                int i = SettingsActivity.f38055U;
                View findViewById = settingsActivity.findViewById(R.id.payment_account_settings);
                if (paymentAccount == null || paymentAccount.f64020i.f64113b == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    findViewById.setOnClickListener(settingsActivity);
                    findViewById.setVisibility(0);
                    return;
                }
                return;
            case 1:
                C20048a aVar = (C20048a) this.f47319c;
                D d = (Location) obj;
                if (d != null) {
                    aVar.f48035e = d;
                    C20048a.f50880f = d;
                    return;
                }
                aVar.getClass();
                return;
            case 2:
                Context context = (Context) this.f47319c;
                C16935f.m42763f(context, false);
                C16937h.m42772a(context, (String) obj);
                return;
            default:
                ImageProviderFragment imageProviderFragment = (ImageProviderFragment) this.f47319c;
                Intent intent = (Intent) obj;
                Bitmap.CompressFormat compressFormat = ImageProviderFragment.f41701o;
                if (imageProviderFragment.f40824e) {
                    imageProviderFragment.startActivityForResult(intent, 6849);
                    return;
                }
                return;
        }
    }
}
