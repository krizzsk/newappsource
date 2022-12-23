package p067e1;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

/* renamed from: e1.b */
public class C4472b {

    /* renamed from: e1.b$a */
    public static class C4473a extends C4472b {

        /* renamed from: a */
        public final ActivityOptions f15535a;

        public C4473a(ActivityOptions activityOptions) {
            this.f15535a = activityOptions;
        }

        /* renamed from: a */
        public final Bundle mo20005a() {
            return this.f15535a.toBundle();
        }
    }

    /* renamed from: e1.b$b */
    public static class C4474b {
        /* renamed from: a */
        public static ActivityOptions m11687a(Context context, int i, int i2) {
            return ActivityOptions.makeCustomAnimation(context, i, i2);
        }

        /* renamed from: b */
        public static ActivityOptions m11688b(View view, int i, int i2, int i3, int i4) {
            return ActivityOptions.makeScaleUpAnimation(view, i, i2, i3, i4);
        }

        /* renamed from: c */
        public static ActivityOptions m11689c(View view, Bitmap bitmap, int i, int i2) {
            return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, i2);
        }
    }

    /* renamed from: e1.b$c */
    public static class C4475c {
        /* renamed from: a */
        public static ActivityOptions m11690a(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @SafeVarargs
        /* renamed from: b */
        public static ActivityOptions m11691b(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        /* renamed from: c */
        public static ActivityOptions m11692c() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }
}
