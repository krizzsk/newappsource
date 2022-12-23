package ka0;

import android.annotation.TargetApi;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.activity.result.C0207b;
import androidx.appcompat.app.AppCompatActivity;
import ce0.C21100e;
import java.util.concurrent.atomic.AtomicReference;
import p019b0.C1436m;
import p054d0.C4291k0;
import p065e.C4412b;
import p065e.C4413c;

/* renamed from: ka0.a */
public final class C12822a extends WebChromeClient {

    /* renamed from: e */
    public static final /* synthetic */ int f31697e = 0;

    /* renamed from: a */
    public final C0207b<String[]> f31698a;

    /* renamed from: b */
    public final AtomicReference<PermissionRequest> f31699b = new AtomicReference<>();

    /* renamed from: c */
    public final C0207b<Intent> f31700c;

    /* renamed from: d */
    public final AtomicReference<ValueCallback<Uri[]>> f31701d = new AtomicReference<>();

    public C12822a(AppCompatActivity appCompatActivity) {
        C21100e.m49373x(appCompatActivity, "activity");
        this.f31698a = appCompatActivity.registerForActivityResult(new C4412b(), new C1436m(this, 13));
        this.f31700c = appCompatActivity.registerForActivityResult(new C4413c(), new C4291k0(this, 21));
    }

    @TargetApi(21)
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        this.f31699b.set(permissionRequest);
        this.f31698a.mo772a(permissionRequest.getResources());
    }

    @TargetApi(21)
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Intent createIntent = fileChooserParams.createIntent();
        if (createIntent == null) {
            return false;
        }
        try {
            this.f31701d.set(valueCallback);
            this.f31700c.mo772a(createIntent);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }
}
