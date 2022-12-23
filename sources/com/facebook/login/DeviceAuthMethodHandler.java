package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.login.LoginClient;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/facebook/login/DeviceAuthMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "b", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public class DeviceAuthMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new C2453a();

    /* renamed from: e */
    public static final C2454b f8778e = new C2454b();

    /* renamed from: f */
    public static ScheduledThreadPoolExecutor f8779f;

    /* renamed from: d */
    public final String f8780d = "device_auth";

    /* renamed from: com.facebook.login.DeviceAuthMethodHandler$a */
    public static final class C2453a implements Parcelable.Creator<DeviceAuthMethodHandler> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "source");
            return new DeviceAuthMethodHandler(parcel);
        }

        public final Object[] newArray(int i) {
            return new DeviceAuthMethodHandler[i];
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthMethodHandler$b */
    public static final class C2454b {
    }

    public DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public final String mo12608g() {
        return this.f8780d;
    }

    /* renamed from: o */
    public final int mo12612o(LoginClient.Request request) {
        FragmentActivity g = mo12682f().mo12659g();
        if (g == null || g.isFinishing()) {
            return 1;
        }
        DeviceAuthDialog deviceAuthDialog = new DeviceAuthDialog();
        deviceAuthDialog.show(g.getSupportFragmentManager(), "login_with_facebook");
        deviceAuthDialog.mo12626R1(request);
        return 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
        C24362h.m61211f(parcel, "parcel");
    }
}
