package com.facebook.login;

import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.login.DeviceAuthDialog;
import java.util.Arrays;
import java.util.Locale;
import mf0.C24362h;
import org.json.JSONException;
import org.json.JSONObject;
import p009a8.C0124u;

/* renamed from: com.facebook.login.b */
public final /* synthetic */ class C2470b implements GraphRequest.C2280b {

    /* renamed from: a */
    public final /* synthetic */ DeviceAuthDialog f8844a;

    public /* synthetic */ C2470b(DeviceAuthDialog deviceAuthDialog) {
        this.f8844a = deviceAuthDialog;
    }

    /* renamed from: b */
    public final void mo200b(C0124u uVar) {
        DeviceAuthDialog deviceAuthDialog = this.f8844a;
        int i = DeviceAuthDialog.f8757m;
        C24362h.m61211f(deviceAuthDialog, "this$0");
        if (!deviceAuthDialog.f8766j) {
            FacebookRequestError facebookRequestError = uVar.f366c;
            if (facebookRequestError != null) {
                FacebookException facebookException = facebookRequestError.f8424j;
                if (facebookException == null) {
                    facebookException = new FacebookException();
                }
                deviceAuthDialog.mo12621M1(facebookException);
                return;
            }
            JSONObject jSONObject = uVar.f365b;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            DeviceAuthDialog.RequestState requestState = new DeviceAuthDialog.RequestState();
            try {
                String string = jSONObject.getString("user_code");
                requestState.f8770c = string;
                String format = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{string}, 1));
                C24362h.m61210e(format, "java.lang.String.format(locale, format, *args)");
                requestState.f8769b = format;
                requestState.f8771d = jSONObject.getString("code");
                requestState.f8772e = jSONObject.getLong("interval");
                deviceAuthDialog.mo12625Q1(requestState);
            } catch (JSONException e) {
                deviceAuthDialog.mo12621M1(new FacebookException((Throwable) e));
            }
        }
    }
}
