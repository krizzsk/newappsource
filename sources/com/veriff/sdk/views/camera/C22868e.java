package com.veriff.sdk.views.camera;

import android.util.DisplayMetrics;
import android.util.Size;
import com.veriff.sdk.views.camera.C22863d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\n*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0015\u0010\r\u001a\u00020\u000e*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, mo59060d2 = {"displaySize", "Landroid/util/Size;", "Landroid/util/DisplayMetrics;", "getDisplaySize", "(Landroid/util/DisplayMetrics;)Landroid/util/Size;", "flipped", "Lcom/veriff/sdk/views/camera/Camera$Type;", "getFlipped", "(Lcom/veriff/sdk/views/camera/Camera$Type;)Lcom/veriff/sdk/views/camera/Camera$Type;", "lensFacingDirection", "", "getLensFacingDirection", "(Lcom/veriff/sdk/views/camera/Camera$Type;)I", "rotation", "Lcom/veriff/sdk/views/camera/Rotation;", "getRotation", "(Lcom/veriff/sdk/views/camera/Camera$Type;)Lcom/veriff/sdk/views/camera/Rotation;", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.e */
public final class C22868e {
    /* renamed from: a */
    public static final C22830ae m56290a(C22863d.C22866c cVar) {
        C24362h.m61211f(cVar, "$this$rotation");
        int i = C22869f.f58038a[cVar.ordinal()];
        if (i == 1) {
            return C22830ae.COUNTER_CLOCKWISE;
        }
        if (i == 2) {
            return C22830ae.CLOCKWISE;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public static final C22863d.C22866c m56291b(C22863d.C22866c cVar) {
        C24362h.m61211f(cVar, "$this$flipped");
        int i = C22869f.f58039b[cVar.ordinal()];
        if (i == 1) {
            return C22863d.C22866c.BACK;
        }
        if (i == 2) {
            return C22863d.C22866c.FRONT;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: c */
    public static final int m56292c(C22863d.C22866c cVar) {
        C24362h.m61211f(cVar, "$this$lensFacingDirection");
        int i = C22869f.f58040c[cVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public static final Size m56289a(DisplayMetrics displayMetrics) {
        C24362h.m61211f(displayMetrics, "$this$displaySize");
        return new Size(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
