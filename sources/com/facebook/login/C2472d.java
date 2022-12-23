package com.facebook.login;

import android.content.DialogInterface;
import com.facebook.login.DeviceAuthDialog;
import java.util.Date;
import mf0.C24362h;

/* renamed from: com.facebook.login.d */
public final /* synthetic */ class C2472d implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ DeviceAuthDialog f8849b;

    /* renamed from: c */
    public final /* synthetic */ String f8850c;

    /* renamed from: d */
    public final /* synthetic */ DeviceAuthDialog.C2451b f8851d;

    /* renamed from: e */
    public final /* synthetic */ String f8852e;

    /* renamed from: f */
    public final /* synthetic */ Date f8853f;

    /* renamed from: g */
    public final /* synthetic */ Date f8854g;

    public /* synthetic */ C2472d(DeviceAuthDialog deviceAuthDialog, String str, DeviceAuthDialog.C2451b bVar, String str2, Date date, Date date2) {
        this.f8849b = deviceAuthDialog;
        this.f8850c = str;
        this.f8851d = bVar;
        this.f8852e = str2;
        this.f8853f = date;
        this.f8854g = date2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DeviceAuthDialog deviceAuthDialog = this.f8849b;
        String str = this.f8850c;
        DeviceAuthDialog.C2451b bVar = this.f8851d;
        String str2 = this.f8852e;
        Date date = this.f8853f;
        Date date2 = this.f8854g;
        int i2 = DeviceAuthDialog.f8757m;
        C24362h.m61211f(deviceAuthDialog, "this$0");
        C24362h.m61211f(str, "$userId");
        C24362h.m61211f(bVar, "$permissions");
        C24362h.m61211f(str2, "$accessToken");
        deviceAuthDialog.mo12618I1(str, bVar, str2, date, date2);
    }
}
