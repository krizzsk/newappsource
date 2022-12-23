package com.facebook.login;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.facebook.login.LoginClient;
import mf0.C24362h;

/* renamed from: com.facebook.login.e */
public final /* synthetic */ class C2473e implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ DeviceAuthDialog f8855b;

    public /* synthetic */ C2473e(DeviceAuthDialog deviceAuthDialog) {
        this.f8855b = deviceAuthDialog;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DeviceAuthDialog deviceAuthDialog = this.f8855b;
        int i2 = DeviceAuthDialog.f8757m;
        C24362h.m61211f(deviceAuthDialog, "this$0");
        View K1 = deviceAuthDialog.mo12619K1(false);
        Dialog dialog = deviceAuthDialog.getDialog();
        if (dialog != null) {
            dialog.setContentView(K1);
        }
        LoginClient.Request request = deviceAuthDialog.f8768l;
        if (request != null) {
            deviceAuthDialog.mo12626R1(request);
        }
    }
}
