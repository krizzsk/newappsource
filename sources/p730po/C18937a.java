package p730po;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.masabi.justride.sdk.exception.MissingSDKException;
import com.masabi.justride.sdk.p415ui.configuration.screens.ticket.BarcodeFormat;
import kotlin.Metadata;
import mf0.C24362h;
import p389bl.C13641g;
import p469eo.C16846b;
import p541ho.C17466c;
import p565io.C17624a;
import p583jk.C17873f;
import p584jl.C17885a;
import p605ki.C18061o;
import p605ki.C18063q;
import p605ki.C18066t;
import p701oj.C18762f;
import p750ql.C19135b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lpo/a;", "Lio/a;", "<init>", "()V", "Android_release"}, mo59061k = 1, mo59062mv = {1, 4, 1})
/* renamed from: po.a */
public final class C18937a extends C17624a {

    /* renamed from: c */
    public C18762f f48231c;

    /* renamed from: d */
    public int f48232d;

    /* renamed from: e */
    public int f48233e;

    /* renamed from: f */
    public boolean f48234f = true;

    /* renamed from: g */
    public final C19135b f48235g = new C19135b(new C17873f());

    /* renamed from: h */
    public C17466c f48236h;

    /* renamed from: i */
    public final ColorMatrixColorFilter f48237i = new ColorMatrixColorFilter(new float[]{-1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 255.0f, BitmapDescriptorFactory.HUE_RED, -1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 255.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -1.0f, BitmapDescriptorFactory.HUE_RED, 255.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED});

    /* renamed from: J1 */
    public final void mo51454J1() {
        View view = getView();
        if (view != null) {
            int i = this.f48232d;
            view.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        }
        C18762f fVar = this.f48231c;
        C24362h.m61208c(fVar);
        ProgressBar progressBar = fVar.f47741d;
        C24362h.m61210e(progressBar, "binding.barcodeProgressSpinner");
        progressBar.setVisibility(0);
        mo51455K1((Bitmap) null);
        C18762f fVar2 = this.f48231c;
        C24362h.m61208c(fVar2);
        ImageView imageView = fVar2.f47740c;
        C24362h.m61210e(imageView, "binding.barcodeImageView");
        imageView.setVisibility(8);
        C18762f fVar3 = this.f48231c;
        C24362h.m61208c(fVar3);
        TextView textView = fVar3.f47739b;
        C24362h.m61210e(textView, "binding.barcodeErrorTextView");
        textView.setVisibility(8);
    }

    /* renamed from: K1 */
    public final void mo51455K1(Bitmap bitmap) {
        Context context;
        ContentResolver contentResolver;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmap);
        bitmapDrawable.setAntiAlias(false);
        if (!(!this.f48234f || (context = getContext()) == null || (contentResolver = context.getContentResolver()) == null)) {
            try {
                int i = Settings.Secure.getInt(contentResolver, "accessibility_display_inversion_enabled");
                if (this.f48233e != i) {
                    if (i == 1) {
                        C18762f fVar = this.f48231c;
                        C24362h.m61208c(fVar);
                        ImageView imageView = fVar.f47740c;
                        C24362h.m61210e(imageView, "binding.barcodeImageView");
                        imageView.setColorFilter(this.f48237i);
                        View view = getView();
                        if (view != null) {
                            view.setBackgroundColor(-16777216);
                        }
                    } else {
                        C18762f fVar2 = this.f48231c;
                        C24362h.m61208c(fVar2);
                        fVar2.f47740c.clearColorFilter();
                        View view2 = getView();
                        if (view2 != null) {
                            view2.setBackgroundColor(0);
                        }
                    }
                    this.f48233e = i;
                }
            } catch (Settings.SettingNotFoundException unused) {
                this.f48234f = false;
            }
        }
        C18762f fVar3 = this.f48231c;
        C24362h.m61208c(fVar3);
        fVar3.f47740c.setImageDrawable(bitmapDrawable);
    }

    /* renamed from: L1 */
    public final void mo51456L1(int i) {
        View view = getView();
        if (view != null) {
            int i2 = this.f48232d;
            view.setLayoutParams(new FrameLayout.LayoutParams(i2, i2));
        }
        String string = getString(C18066t.com_masabi_justride_sdk_failed_loading_barcode_message_format, Integer.valueOf(i));
        C24362h.m61210e(string, "getString(\n            R…      errorCode\n        )");
        String string2 = getString(C18066t.com_masabi_justride_sdk_failed_loading_barcode_hint_format, Integer.valueOf(i));
        C24362h.m61210e(string2, "getString(\n            R…      errorCode\n        )");
        C18762f fVar = this.f48231c;
        C24362h.m61208c(fVar);
        TextView textView = fVar.f47739b;
        C24362h.m61210e(textView, "binding.barcodeErrorTextView");
        textView.setText(string);
        C18762f fVar2 = this.f48231c;
        C24362h.m61208c(fVar2);
        TextView textView2 = fVar2.f47739b;
        C24362h.m61210e(textView2, "binding.barcodeErrorTextView");
        textView2.setContentDescription(string2);
        C18762f fVar3 = this.f48231c;
        C24362h.m61208c(fVar3);
        TextView textView3 = fVar3.f47739b;
        C24362h.m61210e(textView3, "binding.barcodeErrorTextView");
        textView3.setVisibility(0);
        mo51455K1((Bitmap) null);
        C18762f fVar4 = this.f48231c;
        C24362h.m61208c(fVar4);
        ImageView imageView = fVar4.f47740c;
        C24362h.m61210e(imageView, "binding.barcodeImageView");
        imageView.setVisibility(8);
        C18762f fVar5 = this.f48231c;
        C24362h.m61208c(fVar5);
        ProgressBar progressBar = fVar5.f47741d;
        C24362h.m61210e(progressBar, "binding.barcodeProgressSpinner");
        progressBar.setVisibility(8);
    }

    /* renamed from: M1 */
    public final void mo51457M1(String str, BarcodeFormat barcodeFormat, Integer num) {
        C24362h.m61211f(barcodeFormat, "barcodeFormat");
        if (num != null) {
            mo51456L1(num.intValue());
        } else if (str == null) {
            mo51454J1();
        } else {
            View view = getView();
            if (view != null) {
                view.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            }
            mo51455K1((Bitmap) this.f48235g.mo51574a(str, barcodeFormat, this.f48232d).f33365a);
            C18762f fVar = this.f48231c;
            C24362h.m61208c(fVar);
            ImageView imageView = fVar.f47740c;
            C24362h.m61210e(imageView, "binding.barcodeImageView");
            imageView.setVisibility(0);
            C18762f fVar2 = this.f48231c;
            C24362h.m61208c(fVar2);
            TextView textView = fVar2.f47739b;
            C24362h.m61210e(textView, "binding.barcodeErrorTextView");
            textView.setVisibility(8);
            C18762f fVar3 = this.f48231c;
            C24362h.m61208c(fVar3);
            ProgressBar progressBar = fVar3.f47741d;
            C24362h.m61210e(progressBar, "binding.barcodeProgressSpinner");
            progressBar.setVisibility(8);
        }
    }

    public final void onCreate(Bundle bundle) {
        float f;
        try {
            super.onCreate(bundle);
            Object a = ((C16846b) this.f45307b.f46180j.f20215b).mo49505a(C17466c.class, (String) null);
            C24362h.m61210e(a, "serviceLocator.get(Scree…urePreventer::class.java)");
            this.f48236h = (C17466c) a;
        } catch (MissingSDKException unused) {
        }
        if (Build.VERSION.SDK_INT >= 24 && DisplayMetrics.DENSITY_DEVICE_STABLE == C13641g.m34124l(this).densityDpi) {
            double d = (double) (C13641g.m34124l(this).xdpi / ((float) C13641g.m34124l(this).densityDpi));
            if (d < 0.8d || d > 1.2d) {
                DisplayMetrics l = C13641g.m34124l(this);
                C24362h.m61210e(l, "displayMetrics");
                f = C17885a.m44410L(l, ((float) 160) * 1.2992126f * 0.925f);
                this.f48232d = (int) f;
            }
        }
        DisplayMetrics l2 = C13641g.m34124l(this);
        C24362h.m61210e(l2, "displayMetrics");
        f = TypedValue.applyDimension(5, 33.0f, l2);
        this.f48232d = (int) f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C18063q.fragment_barcode, viewGroup, false);
        int i = C18061o.barcodeErrorTextView;
        TextView textView = (TextView) inflate.findViewById(i);
        if (textView != null) {
            i = C18061o.barcodeImageView;
            ImageView imageView = (ImageView) inflate.findViewById(i);
            if (imageView != null) {
                i = C18061o.barcodeProgressSpinner;
                ProgressBar progressBar = (ProgressBar) inflate.findViewById(i);
                if (progressBar != null) {
                    FrameLayout frameLayout = (FrameLayout) inflate;
                    this.f48231c = new C18762f(frameLayout, textView, imageView, progressBar);
                    return frameLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f48231c = null;
    }

    public final void onPause() {
        Window window;
        super.onPause();
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = -1.0f;
            window.setAttributes(attributes);
        }
    }

    public final void onResume() {
        Window window;
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = 1.0f;
            window.setAttributes(attributes);
        }
    }

    public final void onStart() {
        super.onStart();
        C17466c cVar = this.f48236h;
        if (cVar != null) {
            FragmentActivity requireActivity = requireActivity();
            C24362h.m61210e(requireActivity, "requireActivity()");
            cVar.mo49923a(requireActivity);
        }
    }

    public final void onStop() {
        super.onStop();
        C17466c cVar = this.f48236h;
        if (cVar != null) {
            FragmentActivity requireActivity = requireActivity();
            C24362h.m61210e(requireActivity, "requireActivity()");
            cVar.mo49924b(requireActivity);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        mo51454J1();
        if (this.f48236h == null) {
            mo51456L1(9);
        }
    }
}
