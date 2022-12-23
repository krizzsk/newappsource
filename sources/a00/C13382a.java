package a00;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.util.WeakHashMap;
import mf0.C24361g;
import p242s1.C6315a;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p255t1.C6531g;
import p304x.C7109v;
import p977zz.C20964s0;

/* renamed from: a00.a */
public class C13382a {

    /* renamed from: a */
    public static final C13383a f33219a = new C13383a();

    /* renamed from: a00.a$a */
    public class C13383a extends ThreadLocal<StringBuilder> {
        public final Object initialValue() {
            return new StringBuilder();
        }
    }

    /* renamed from: a00.a$b */
    public class C13384b extends C6315a {

        /* renamed from: a */
        public final /* synthetic */ boolean f33220a;

        public C13384b(boolean z) {
            this.f33220a = z;
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6531g gVar) {
            CharSequence charSequence;
            super.onInitializeAccessibilityNodeInfo(view, gVar);
            if (!gVar.mo22640f()) {
                charSequence = null;
            } else if (Build.VERSION.SDK_INT >= 26) {
                charSequence = gVar.f20334a.getHintText();
            } else {
                charSequence = gVar.f20334a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY");
            }
            gVar.mo22647l(charSequence);
            gVar.mo22649n(C13382a.m33667c(view.getContentDescription(), charSequence));
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (this.f33220a && accessibilityEvent.getEventType() == 32768) {
                view.requestFocus();
            }
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    /* renamed from: a */
    public static void m33665a(View view, CharSequence... charSequenceArr) {
        view.post(new C7109v(12, view, charSequenceArr));
    }

    /* renamed from: b */
    public static void m33666b(StringBuilder sb, CharSequence charSequence) {
        if (!C20964s0.m49090h(charSequence)) {
            if (sb.length() > 0) {
                sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            }
            sb.append(charSequence);
        }
    }

    /* renamed from: c */
    public static String m33667c(CharSequence... charSequenceArr) {
        if (C24361g.m61154X(charSequenceArr)) {
            return "";
        }
        boolean z = true;
        if (charSequenceArr.length == 1) {
            return C20964s0.m49106x(charSequenceArr[0]);
        }
        StringBuilder e = m33669e();
        for (CharSequence charSequence : charSequenceArr) {
            if (!C20964s0.m49090h(charSequence)) {
                if (z) {
                    z = false;
                } else {
                    e.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                }
                e.append(charSequence);
            }
        }
        return e.toString();
    }

    /* renamed from: d */
    public static void m33668d(EditText editText, boolean z) {
        C6333d0.m15029q(editText, new C13384b(z));
    }

    /* renamed from: e */
    public static StringBuilder m33669e() {
        StringBuilder sb = (StringBuilder) f33219a.get();
        sb.setLength(0);
        return sb;
    }

    /* renamed from: f */
    public static String m33670f(String str) {
        StringBuilder e = m33669e();
        for (int i = 0; i < str.length(); i++) {
            if (e.length() > 0) {
                e.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            }
            e.append(str.charAt(i));
        }
        return e.toString();
    }

    /* renamed from: g */
    public static boolean m33671g(Context context) {
        AccessibilityManager accessibilityManager;
        try {
            accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        } catch (Throwable unused) {
            accessibilityManager = null;
        }
        if (accessibilityManager == null) {
            return true;
        }
        boolean isEnabled = accessibilityManager.isEnabled();
        boolean isTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
        if (!isEnabled || !isTouchExplorationEnabled) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static void m33672h(View view) {
        if (view != null) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15059s(view, 2);
        }
    }

    /* renamed from: i */
    public static void m33673i(View view) {
        if (view != null) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15059s(view, 4);
        }
    }

    /* renamed from: j */
    public static void m33674j(View view, CharSequence... charSequenceArr) {
        if (view != null) {
            view.setContentDescription(m33667c(charSequenceArr));
        }
    }
}
