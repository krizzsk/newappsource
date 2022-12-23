package com.facebook.login;

import android.app.AlertDialog;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.common.C2362e;
import com.facebook.internal.C2429s;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.facebook.login.DeviceAuthDialog;
import java.util.Date;
import java.util.EnumSet;
import mf0.C24362h;
import org.json.JSONException;
import org.json.JSONObject;
import p009a8.C0115o;
import p009a8.C0124u;
import p197o8.C6010a;

/* renamed from: com.facebook.login.c */
public final /* synthetic */ class C2471c implements GraphRequest.C2280b {

    /* renamed from: a */
    public final /* synthetic */ DeviceAuthDialog f8845a;

    /* renamed from: b */
    public final /* synthetic */ String f8846b;

    /* renamed from: c */
    public final /* synthetic */ Date f8847c;

    /* renamed from: d */
    public final /* synthetic */ Date f8848d;

    public /* synthetic */ C2471c(DeviceAuthDialog deviceAuthDialog, String str, Date date, Date date2) {
        this.f8845a = deviceAuthDialog;
        this.f8846b = str;
        this.f8847c = date;
        this.f8848d = date2;
    }

    /* renamed from: b */
    public final void mo200b(C0124u uVar) {
        EnumSet<SmartLoginOption> enumSet;
        DeviceAuthDialog deviceAuthDialog = this.f8845a;
        String str = this.f8846b;
        Date date = this.f8847c;
        Date date2 = this.f8848d;
        int i = DeviceAuthDialog.f8757m;
        C24362h.m61211f(deviceAuthDialog, "this$0");
        C24362h.m61211f(str, "$accessToken");
        if (!deviceAuthDialog.f8762f.get()) {
            FacebookRequestError facebookRequestError = uVar.f366c;
            if (facebookRequestError != null) {
                FacebookException facebookException = facebookRequestError.f8424j;
                if (facebookException == null) {
                    facebookException = new FacebookException();
                }
                deviceAuthDialog.mo12621M1(facebookException);
                return;
            }
            try {
                JSONObject jSONObject = uVar.f365b;
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                String string = jSONObject.getString("id");
                C24362h.m61210e(string, "jsonObject.getString(\"id\")");
                DeviceAuthDialog.C2451b a = DeviceAuthDialog.C2450a.m6451a(jSONObject);
                String string2 = jSONObject.getString("name");
                C24362h.m61210e(string2, "jsonObject.getString(\"name\")");
                DeviceAuthDialog.RequestState requestState = deviceAuthDialog.f8765i;
                if (requestState != null) {
                    C6010a aVar = C6010a.f19206a;
                    C6010a.m14494a(requestState.f8770c);
                }
                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f8592a;
                C2429s b = FetchedAppSettingsManager.m6261b(C0115o.m211b());
                Boolean bool = null;
                if (!(b == null || (enumSet = b.f8710c) == null)) {
                    bool = Boolean.valueOf(enumSet.contains(SmartLoginOption.RequireConfirm));
                }
                if (!C24362h.m61206a(bool, Boolean.TRUE) || deviceAuthDialog.f8767k) {
                    deviceAuthDialog.mo12618I1(string, a, str, date, date2);
                    return;
                }
                deviceAuthDialog.f8767k = true;
                String string3 = deviceAuthDialog.getResources().getString(C2362e.com_facebook_smart_login_confirmation_title);
                C24362h.m61210e(string3, "resources.getString(R.string.com_facebook_smart_login_confirmation_title)");
                String string4 = deviceAuthDialog.getResources().getString(C2362e.com_facebook_smart_login_confirmation_continue_as);
                C24362h.m61210e(string4, "resources.getString(R.string.com_facebook_smart_login_confirmation_continue_as)");
                String string5 = deviceAuthDialog.getResources().getString(C2362e.com_facebook_smart_login_confirmation_cancel);
                C24362h.m61210e(string5, "resources.getString(R.string.com_facebook_smart_login_confirmation_cancel)");
                String j = C13555b.m33971j(new Object[]{string2}, 1, string4, "java.lang.String.format(format, *args)");
                AlertDialog.Builder builder = new AlertDialog.Builder(deviceAuthDialog.getContext());
                builder.setMessage(string3).setCancelable(true).setNegativeButton(j, new C2472d(deviceAuthDialog, string, a, str, date, date2)).setPositiveButton(string5, new C2473e(deviceAuthDialog));
                builder.create().show();
            } catch (JSONException e) {
                deviceAuthDialog.mo12621M1(new FacebookException((Throwable) e));
            }
        }
    }
}
