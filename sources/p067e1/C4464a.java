package p067e1;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.app.SharedElementCallback$OnSharedElementsReadyListener;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import p001a0.C0016g;
import p090g1.C4732a;
import p177n1.C5799a;

/* renamed from: e1.a */
public final class C4464a extends C4732a {

    /* renamed from: a */
    public static final /* synthetic */ int f15531a = 0;

    /* renamed from: e1.a$a */
    public class C4465a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String[] f15532b;

        /* renamed from: c */
        public final /* synthetic */ Activity f15533c;

        /* renamed from: d */
        public final /* synthetic */ int f15534d;

        public C4465a(Activity activity, String[] strArr, int i) {
            this.f15532b = strArr;
            this.f15533c = activity;
            this.f15534d = i;
        }

        public final void run() {
            int[] iArr = new int[this.f15532b.length];
            PackageManager packageManager = this.f15533c.getPackageManager();
            String packageName = this.f15533c.getPackageName();
            int length = this.f15532b.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f15532b[i], packageName);
            }
            ((C4469e) this.f15533c).onRequestPermissionsResult(this.f15534d, this.f15532b, iArr);
        }
    }

    /* renamed from: e1.a$b */
    public static class C4466b {
        /* renamed from: a */
        public static void m11675a(Activity activity) {
            activity.finishAffinity();
        }

        /* renamed from: b */
        public static void m11676b(Activity activity, Intent intent, int i, Bundle bundle) {
            activity.startActivityForResult(intent, i, bundle);
        }

        /* renamed from: c */
        public static void m11677c(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    /* renamed from: e1.a$c */
    public static class C4467c {
        /* renamed from: a */
        public static void m11678a(Activity activity) {
            activity.finishAfterTransition();
        }

        /* renamed from: b */
        public static void m11679b(Activity activity) {
            activity.postponeEnterTransition();
        }

        /* renamed from: c */
        public static void m11680c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        /* renamed from: d */
        public static void m11681d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        /* renamed from: e */
        public static void m11682e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* renamed from: e1.a$d */
    public static class C4468d {
        /* renamed from: a */
        public static void m11683a(Object obj) {
            ((SharedElementCallback$OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        /* renamed from: b */
        public static void m11684b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        /* renamed from: c */
        public static boolean m11685c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: e1.a$e */
    public interface C4469e {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: e1.a$f */
    public interface C4470f {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* renamed from: a */
    public static void m11673a(Activity activity, String[] strArr, int i) {
        String[] strArr2;
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (i2 < strArr.length) {
            if (!TextUtils.isEmpty(strArr[i2])) {
                if (!C5799a.m14229c() && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i2));
                }
                i2++;
            } else {
                throw new IllegalArgumentException(C0016g.m31o(C13555b.m33972k("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            strArr2 = new String[(strArr.length - size)];
        } else {
            strArr2 = strArr;
        }
        if (size > 0) {
            if (size != strArr.length) {
                int i3 = 0;
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    if (!hashSet.contains(Integer.valueOf(i4))) {
                        strArr2[i3] = strArr[i4];
                        i3++;
                    }
                }
            } else {
                return;
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof C4470f) {
                ((C4470f) activity).validateRequestPermissionsRequestCode(i);
            }
            C4468d.m11684b(activity, strArr, i);
        } else if (activity instanceof C4469e) {
            new Handler(Looper.getMainLooper()).post(new C4465a(activity, strArr2, i));
        }
    }

    /* renamed from: b */
    public static boolean m11674b(Activity activity, String str) {
        if ((C5799a.m14229c() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) && Build.VERSION.SDK_INT >= 23) {
            return C4468d.m11685c(activity, str);
        }
        return false;
    }
}
