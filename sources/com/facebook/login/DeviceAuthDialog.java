package com.facebook.login;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.C0942l;
import androidx.fragment.app.FragmentActivity;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appsflyer.ServerParameters;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.common.C2360c;
import com.facebook.common.C2361d;
import com.facebook.common.C2362e;
import com.facebook.common.C2363f;
import com.facebook.internal.C2397f0;
import com.facebook.internal.C2400g0;
import com.facebook.login.LoginClient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import mf0.C24362h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p009a8.C0115o;
import p009a8.C0117p;
import p009a8.C0120s;
import p009a8.C0124u;
import p197o8.C6010a;
import p262t8.C6606a;
import p297w5.C6996c;
import p304x.C7082o;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, mo59060d2 = {"Lcom/facebook/login/DeviceAuthDialog;", "Landroidx/fragment/app/l;", "<init>", "()V", "a", "b", "RequestState", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public class DeviceAuthDialog extends C0942l {

    /* renamed from: m */
    public static final /* synthetic */ int f8757m = 0;

    /* renamed from: b */
    public View f8758b;

    /* renamed from: c */
    public TextView f8759c;

    /* renamed from: d */
    public TextView f8760d;

    /* renamed from: e */
    public DeviceAuthMethodHandler f8761e;

    /* renamed from: f */
    public final AtomicBoolean f8762f = new AtomicBoolean();

    /* renamed from: g */
    public volatile C0120s f8763g;

    /* renamed from: h */
    public volatile ScheduledFuture<?> f8764h;

    /* renamed from: i */
    public volatile RequestState f8765i;

    /* renamed from: j */
    public boolean f8766j;

    /* renamed from: k */
    public boolean f8767k;

    /* renamed from: l */
    public LoginClient.Request f8768l;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0010¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/facebook/login/DeviceAuthDialog$RequestState;", "Landroid/os/Parcelable;", "<init>", "()V", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
    public static final class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new C2449a();

        /* renamed from: b */
        public String f8769b;

        /* renamed from: c */
        public String f8770c;

        /* renamed from: d */
        public String f8771d;

        /* renamed from: e */
        public long f8772e;

        /* renamed from: f */
        public long f8773f;

        /* renamed from: com.facebook.login.DeviceAuthDialog$RequestState$a */
        public static final class C2449a implements Parcelable.Creator<RequestState> {
            public final Object createFromParcel(Parcel parcel) {
                C24362h.m61211f(parcel, "parcel");
                return new RequestState(parcel);
            }

            public final Object[] newArray(int i) {
                return new RequestState[i];
            }
        }

        public RequestState() {
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C24362h.m61211f(parcel, "dest");
            parcel.writeString(this.f8769b);
            parcel.writeString(this.f8770c);
            parcel.writeString(this.f8771d);
            parcel.writeLong(this.f8772e);
            parcel.writeLong(this.f8773f);
        }

        public RequestState(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            this.f8769b = parcel.readString();
            this.f8770c = parcel.readString();
            this.f8771d = parcel.readString();
            this.f8772e = parcel.readLong();
            this.f8773f = parcel.readLong();
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$a */
    public static final class C2450a {
        /* renamed from: a */
        public static final C2451b m6451a(JSONObject jSONObject) {
            boolean z;
            String optString;
            int i = DeviceAuthDialog.f8757m;
            JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                    String optString2 = optJSONObject.optString("permission");
                    C24362h.m61210e(optString2, "permission");
                    if (optString2.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z && !C24362h.m61206a(optString2, "installed") && (optString = optJSONObject.optString(ServerParameters.STATUS)) != null) {
                        int hashCode = optString.hashCode();
                        if (hashCode != -1309235419) {
                            if (hashCode != 280295099) {
                                if (hashCode == 568196142 && optString.equals("declined")) {
                                    arrayList2.add(optString2);
                                }
                            } else if (optString.equals("granted")) {
                                arrayList.add(optString2);
                            }
                        } else if (optString.equals("expired")) {
                            arrayList3.add(optString2);
                        }
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return new C2451b(arrayList, arrayList2, arrayList3);
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$b */
    public static final class C2451b {

        /* renamed from: a */
        public List<String> f8774a;

        /* renamed from: b */
        public List<String> f8775b;

        /* renamed from: c */
        public List<String> f8776c;

        public C2451b(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
            this.f8774a = arrayList;
            this.f8775b = arrayList2;
            this.f8776c = arrayList3;
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$c */
    public static final class C2452c extends Dialog {

        /* renamed from: b */
        public final /* synthetic */ DeviceAuthDialog f8777b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2452c(DeviceAuthDialog deviceAuthDialog, FragmentActivity fragmentActivity, int i) {
            super(fragmentActivity, i);
            this.f8777b = deviceAuthDialog;
        }

        public final void onBackPressed() {
            this.f8777b.getClass();
            super.onBackPressed();
        }
    }

    static {
        new C2450a();
    }

    /* renamed from: H1 */
    public static void m6440H1(DeviceAuthDialog deviceAuthDialog, C0124u uVar) {
        C24362h.m61211f(deviceAuthDialog, "this$0");
        if (!deviceAuthDialog.f8762f.get()) {
            FacebookRequestError facebookRequestError = uVar.f366c;
            if (facebookRequestError != null) {
                int i = facebookRequestError.f8418d;
                boolean z = true;
                if (!(i == 1349174 || i == 1349172)) {
                    z = false;
                }
                if (z) {
                    deviceAuthDialog.mo12624P1();
                } else if (i == 1349152) {
                    RequestState requestState = deviceAuthDialog.f8765i;
                    if (requestState != null) {
                        C6010a aVar = C6010a.f19206a;
                        C6010a.m14494a(requestState.f8770c);
                    }
                    LoginClient.Request request = deviceAuthDialog.f8768l;
                    if (request != null) {
                        deviceAuthDialog.mo12626R1(request);
                    } else {
                        deviceAuthDialog.mo12620L1();
                    }
                } else if (i == 1349173) {
                    deviceAuthDialog.mo12620L1();
                } else {
                    FacebookException facebookException = facebookRequestError.f8424j;
                    if (facebookException == null) {
                        facebookException = new FacebookException();
                    }
                    deviceAuthDialog.mo12621M1(facebookException);
                }
            } else {
                try {
                    JSONObject jSONObject = uVar.f365b;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    String string = jSONObject.getString("access_token");
                    C24362h.m61210e(string, "resultObject.getString(\"access_token\")");
                    deviceAuthDialog.mo12622N1(string, jSONObject.getLong("expires_in"), Long.valueOf(jSONObject.optLong("data_access_expiration_time")));
                } catch (JSONException e) {
                    deviceAuthDialog.mo12621M1(new FacebookException((Throwable) e));
                }
            }
        }
    }

    /* renamed from: J1 */
    public static String m6441J1() {
        StringBuilder sb = new StringBuilder();
        int i = C2400g0.f8641a;
        sb.append(C0115o.m211b());
        sb.append('|');
        C2400g0.m6342g();
        String str = C0115o.f336f;
        if (str != null) {
            sb.append(str);
            return sb.toString();
        }
        throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    /* renamed from: I1 */
    public final void mo12618I1(String str, C2451b bVar, String str2, Date date, Date date2) {
        C2451b bVar2 = bVar;
        DeviceAuthMethodHandler deviceAuthMethodHandler = this.f8761e;
        if (deviceAuthMethodHandler != null) {
            deviceAuthMethodHandler.mo12682f().mo12658f(new LoginClient.Result(deviceAuthMethodHandler.mo12682f().f8792h, LoginClient.Result.Code.SUCCESS, new AccessToken(str2, C0115o.m211b(), str, bVar2.f8774a, bVar2.f8775b, bVar2.f8776c, AccessTokenSource.DEVICE_AUTH, date, (Date) null, date2), (String) null, (String) null));
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* renamed from: K1 */
    public final View mo12619K1(boolean z) {
        int i;
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        C24362h.m61210e(layoutInflater, "requireActivity().layoutInflater");
        if (z) {
            i = C2361d.com_facebook_smart_device_dialog_fragment;
        } else {
            i = C2361d.com_facebook_device_auth_dialog_fragment;
        }
        View inflate = layoutInflater.inflate(i, (ViewGroup) null);
        C24362h.m61210e(inflate, "inflater.inflate(getLayoutResId(isSmartLogin), null)");
        View findViewById = inflate.findViewById(C2360c.progress_bar);
        C24362h.m61210e(findViewById, "view.findViewById(R.id.progress_bar)");
        this.f8758b = findViewById;
        View findViewById2 = inflate.findViewById(C2360c.confirmation_code);
        if (findViewById2 != null) {
            this.f8759c = (TextView) findViewById2;
            View findViewById3 = inflate.findViewById(C2360c.cancel_button);
            if (findViewById3 != null) {
                ((Button) findViewById3).setOnClickListener(new C6996c(this, 2));
                View findViewById4 = inflate.findViewById(C2360c.com_facebook_device_auth_instructions);
                if (findViewById4 != null) {
                    TextView textView = (TextView) findViewById4;
                    this.f8760d = textView;
                    textView.setText(Html.fromHtml(getString(C2362e.com_facebook_device_auth_instructions)));
                    return inflate;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* renamed from: L1 */
    public final void mo12620L1() {
        if (this.f8762f.compareAndSet(false, true)) {
            RequestState requestState = this.f8765i;
            if (requestState != null) {
                C6010a aVar = C6010a.f19206a;
                C6010a.m14494a(requestState.f8770c);
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.f8761e;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.mo12682f().mo12658f(new LoginClient.Result(deviceAuthMethodHandler.mo12682f().f8792h, LoginClient.Result.Code.CANCEL, (AccessToken) null, "User canceled log in.", (String) null));
            }
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    /* renamed from: M1 */
    public final void mo12621M1(FacebookException facebookException) {
        if (this.f8762f.compareAndSet(false, true)) {
            RequestState requestState = this.f8765i;
            if (requestState != null) {
                C6010a aVar = C6010a.f19206a;
                C6010a.m14494a(requestState.f8770c);
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.f8761e;
            if (deviceAuthMethodHandler != null) {
                LoginClient.Request request = deviceAuthMethodHandler.mo12682f().f8792h;
                String message = facebookException.getMessage();
                ArrayList arrayList = new ArrayList();
                if (message != null) {
                    arrayList.add(message);
                }
                deviceAuthMethodHandler.mo12682f().mo12658f(new LoginClient.Result(request, LoginClient.Result.Code.ERROR, (AccessToken) null, TextUtils.join(": ", arrayList), (String) null));
            }
            Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    /* renamed from: N1 */
    public final void mo12622N1(String str, long j, Long l) {
        Date date;
        Bundle b = C25541a.m63872b("fields", "id,permissions,name");
        Date date2 = null;
        if (j != 0) {
            date = new Date((j * 1000) + new Date().getTime());
        } else {
            date = null;
        }
        if ((l == null || l.longValue() != 0) && l != null) {
            date2 = new Date(l.longValue() * 1000);
        }
        AccessToken accessToken = new AccessToken(str, C0115o.m211b(), "0", (Collection) null, (Collection) null, (Collection) null, (AccessTokenSource) null, date, (Date) null, date2);
        String str2 = GraphRequest.f8425j;
        GraphRequest g = GraphRequest.C2281c.m6137g(accessToken, "me", new C2471c(this, str, date, date2));
        g.mo11910k(HttpMethod.GET);
        g.f8431d = b;
        g.mo11904d();
    }

    /* renamed from: O1 */
    public final void mo12623O1() {
        RequestState requestState = this.f8765i;
        if (requestState != null) {
            requestState.f8773f = new Date().getTime();
        }
        Bundle bundle = new Bundle();
        RequestState requestState2 = this.f8765i;
        String str = null;
        if (requestState2 != null) {
            str = requestState2.f8771d;
        }
        bundle.putString("code", str);
        bundle.putString("access_token", m6441J1());
        String str2 = GraphRequest.f8425j;
        this.f8763g = GraphRequest.C2281c.m6139i("device/login_status", bundle, new C0117p(this)).mo11904d();
    }

    /* renamed from: P1 */
    public final void mo12624P1() {
        Long l;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        RequestState requestState = this.f8765i;
        if (requestState == null) {
            l = null;
        } else {
            l = Long.valueOf(requestState.f8772e);
        }
        if (l != null) {
            synchronized (DeviceAuthMethodHandler.f8778e) {
                if (DeviceAuthMethodHandler.f8779f == null) {
                    DeviceAuthMethodHandler.f8779f = new ScheduledThreadPoolExecutor(1);
                }
                scheduledThreadPoolExecutor = DeviceAuthMethodHandler.f8779f;
                if (scheduledThreadPoolExecutor == null) {
                    C24362h.m61217l("backgroundExecutor");
                    throw null;
                }
            }
            this.f8764h = scheduledThreadPoolExecutor.schedule(new C7082o(this, 5), l.longValue(), TimeUnit.SECONDS);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x011a  */
    /* renamed from: Q1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12625Q1(com.facebook.login.DeviceAuthDialog.RequestState r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            java.lang.Class<o8.a> r3 = p197o8.C6010a.class
            r1.f8765i = r2
            android.widget.TextView r0 = r1.f8759c
            r4 = 0
            java.lang.String r5 = "confirmationCode"
            if (r0 == 0) goto L_0x0120
            java.lang.String r6 = r2.f8770c
            r0.setText(r6)
            o8.a r0 = p197o8.C6010a.f19206a
            java.lang.String r7 = r2.f8769b
            boolean r0 = p262t8.C6606a.m15601b(r3)
            r12 = 0
            if (r0 == 0) goto L_0x0021
            goto L_0x008b
        L_0x0021:
            java.util.EnumMap r11 = new java.util.EnumMap     // Catch:{ all -> 0x0087 }
            java.lang.Class<com.google.zxing.EncodeHintType> r0 = com.google.zxing.EncodeHintType.class
            r11.<init>(r0)     // Catch:{ all -> 0x0087 }
            com.google.zxing.EncodeHintType r0 = com.google.zxing.EncodeHintType.MARGIN     // Catch:{ all -> 0x0087 }
            r6 = 2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0087 }
            r11.put(r0, r6)     // Catch:{ all -> 0x0087 }
            yg.d r6 = new yg.d     // Catch:{ WriterException -> 0x0085 }
            r6.<init>()     // Catch:{ WriterException -> 0x0085 }
            com.google.zxing.BarcodeFormat r8 = com.google.zxing.BarcodeFormat.QR_CODE     // Catch:{ WriterException -> 0x0085 }
            r9 = 200(0xc8, float:2.8E-43)
            r10 = 200(0xc8, float:2.8E-43)
            ch.b r0 = r6.mo22696i(r7, r8, r9, r10, r11)     // Catch:{ WriterException -> 0x0085 }
            int r6 = r0.f34028c     // Catch:{ WriterException -> 0x0085 }
            int r7 = r0.f34027b     // Catch:{ WriterException -> 0x0085 }
            int r8 = r6 * r7
            int[] r14 = new int[r8]     // Catch:{ WriterException -> 0x0085 }
            if (r6 <= 0) goto L_0x006d
            r8 = 0
        L_0x004c:
            int r9 = r8 + 1
            int r10 = r8 * r7
            if (r7 <= 0) goto L_0x0068
            r11 = 0
        L_0x0053:
            int r13 = r11 + 1
            int r15 = r10 + r11
            boolean r11 = r0.mo40764b(r11, r8)     // Catch:{ WriterException -> 0x0085 }
            if (r11 == 0) goto L_0x0060
            r11 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x0061
        L_0x0060:
            r11 = -1
        L_0x0061:
            r14[r15] = r11     // Catch:{ WriterException -> 0x0085 }
            if (r13 < r7) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r11 = r13
            goto L_0x0053
        L_0x0068:
            if (r9 < r6) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            r8 = r9
            goto L_0x004c
        L_0x006d:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ WriterException -> 0x0085 }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r7, r6, r0)     // Catch:{ WriterException -> 0x0085 }
            r15 = 0
            r17 = 0
            r18 = 0
            r13 = r0
            r16 = r7
            r19 = r7
            r20 = r6
            r13.setPixels(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ WriterException -> 0x0083 }
            goto L_0x008c
        L_0x0083:
            goto L_0x008c
        L_0x0085:
            goto L_0x008b
        L_0x0087:
            r0 = move-exception
            p262t8.C6606a.m15600a(r3, r0)
        L_0x008b:
            r0 = r4
        L_0x008c:
            android.graphics.drawable.BitmapDrawable r6 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r7 = r21.getResources()
            r6.<init>(r7, r0)
            android.widget.TextView r0 = r1.f8760d
            if (r0 == 0) goto L_0x011a
            r0.setCompoundDrawablesWithIntrinsicBounds(r4, r6, r4, r4)
            android.widget.TextView r0 = r1.f8759c
            if (r0 == 0) goto L_0x0116
            r0.setVisibility(r12)
            android.view.View r0 = r1.f8758b
            if (r0 == 0) goto L_0x0110
            r5 = 8
            r0.setVisibility(r5)
            boolean r0 = r1.f8767k
            if (r0 != 0) goto L_0x00e5
            o8.a r0 = p197o8.C6010a.f19206a
            java.lang.String r0 = r2.f8770c
            boolean r5 = p262t8.C6606a.m15601b(r3)
            if (r5 == 0) goto L_0x00bb
            goto L_0x00cc
        L_0x00bb:
            boolean r5 = p197o8.C6010a.m14495c()     // Catch:{ all -> 0x00c8 }
            if (r5 == 0) goto L_0x00cc
            o8.a r5 = p197o8.C6010a.f19206a     // Catch:{ all -> 0x00c8 }
            boolean r0 = r5.mo22011d(r0)     // Catch:{ all -> 0x00c8 }
            goto L_0x00cd
        L_0x00c8:
            r0 = move-exception
            p262t8.C6606a.m15600a(r3, r0)
        L_0x00cc:
            r0 = 0
        L_0x00cd:
            if (r0 == 0) goto L_0x00e5
            android.content.Context r0 = r21.getContext()
            com.facebook.appevents.j r3 = new com.facebook.appevents.j
            r3.<init>((android.content.Context) r0, (java.lang.String) r4)
            a8.o r0 = p009a8.C0115o.f331a
            boolean r0 = p009a8.C0098d0.m169b()
            if (r0 == 0) goto L_0x00e5
            java.lang.String r0 = "fb_smart_login_service"
            r3.mo12486f(r0, r4)
        L_0x00e5:
            long r3 = r2.f8773f
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x00ee
            goto L_0x0106
        L_0x00ee:
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r3 = r0.getTime()
            long r7 = r2.f8773f
            long r3 = r3 - r7
            long r7 = r2.f8772e
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r9
            long r3 = r3 - r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0106
            r12 = 1
        L_0x0106:
            if (r12 == 0) goto L_0x010c
            r21.mo12624P1()
            goto L_0x010f
        L_0x010c:
            r21.mo12623O1()
        L_0x010f:
            return
        L_0x0110:
            java.lang.String r0 = "progressBar"
            mf0.C24362h.m61217l(r0)
            throw r4
        L_0x0116:
            mf0.C24362h.m61217l(r5)
            throw r4
        L_0x011a:
            java.lang.String r0 = "instructions"
            mf0.C24362h.m61217l(r0)
            throw r4
        L_0x0120:
            mf0.C24362h.m61217l(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.DeviceAuthDialog.mo12625Q1(com.facebook.login.DeviceAuthDialog$RequestState):void");
    }

    /* renamed from: R1 */
    public final void mo12626R1(LoginClient.Request request) {
        String str;
        this.f8768l = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, request.f8799c));
        C2397f0 f0Var = C2397f0.f8630a;
        C2397f0.m6300I(bundle, "redirect_uri", request.f8804h);
        C2397f0.m6300I(bundle, "target_user_id", request.f8806j);
        bundle.putString("access_token", m6441J1());
        C6010a aVar = C6010a.f19206a;
        Class<C6010a> cls = C6010a.class;
        if (!C6606a.m15601b(cls)) {
            try {
                HashMap hashMap = new HashMap();
                String str2 = Build.DEVICE;
                C24362h.m61210e(str2, "DEVICE");
                hashMap.put(ServerParameters.DEVICE_KEY, str2);
                String str3 = Build.MODEL;
                C24362h.m61210e(str3, "MODEL");
                hashMap.put(ServerParameters.MODEL, str3);
                str = new JSONObject(hashMap).toString();
                C24362h.m61210e(str, "JSONObject(deviceInfo as Map<*, *>).toString()");
            } catch (Throwable th) {
                C6606a.m15600a(cls, th);
            }
            bundle.putString("device_info", str);
            String str4 = GraphRequest.f8425j;
            GraphRequest.C2281c.m6139i("device/login", bundle, new C2470b(this)).mo11904d();
        }
        str = null;
        bundle.putString("device_info", str);
        String str42 = GraphRequest.f8425j;
        GraphRequest.C2281c.m6139i("device/login", bundle, new C2470b(this)).mo11904d();
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        boolean z;
        C2452c cVar = new C2452c(this, requireActivity(), C2363f.com_facebook_auth_dialog);
        if (!C6010a.m14495c() || this.f8767k) {
            z = false;
        } else {
            z = true;
        }
        cVar.setContentView(mo12619K1(z));
        return cVar;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LoginMethodHandler loginMethodHandler;
        RequestState requestState;
        C24362h.m61211f(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C2477i iVar = (C2477i) ((FacebookActivity) requireActivity()).f8412x;
        if (iVar == null) {
            loginMethodHandler = null;
        } else {
            loginMethodHandler = iVar.mo12700H1().mo12660j();
        }
        this.f8761e = (DeviceAuthMethodHandler) loginMethodHandler;
        if (!(bundle == null || (requestState = (RequestState) bundle.getParcelable("request_state")) == null)) {
            mo12625Q1(requestState);
        }
        return onCreateView;
    }

    public final void onDestroyView() {
        this.f8766j = true;
        this.f8762f.set(true);
        super.onDestroyView();
        C0120s sVar = this.f8763g;
        if (sVar != null) {
            sVar.cancel(true);
        }
        ScheduledFuture<?> scheduledFuture = this.f8764h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C24362h.m61211f(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        if (!this.f8766j) {
            mo12620L1();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C24362h.m61211f(bundle, "outState");
        super.onSaveInstanceState(bundle);
        if (this.f8765i != null) {
            bundle.putParcelable("request_state", this.f8765i);
        }
    }
}
