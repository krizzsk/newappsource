package p169m6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.io.IOException;
import java.util.List;
import p025b6.C1492e;
import p025b6.C1493f;
import p060d6.C4397l;

/* renamed from: m6.f */
public final class C5712f implements C1493f<Uri, Drawable> {

    /* renamed from: a */
    public final Context f18516a;

    public C5712f(Context context) {
        this.f18516a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final boolean mo5850a(Object obj, C1492e eVar) throws IOException {
        return ((Uri) obj).getScheme().equals("android.resource");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C4397l mo5851b(Object obj, int i, int i2, C1492e eVar) throws IOException {
        return mo21545c((Uri) obj);
    }

    /* renamed from: c */
    public final C4397l mo21545c(Uri uri) {
        Context context;
        int i;
        String authority = uri.getAuthority();
        if (authority.equals(this.f18516a.getPackageName())) {
            context = this.f18516a;
        } else {
            try {
                context = this.f18516a.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (authority.contains(this.f18516a.getPackageName())) {
                    context = this.f18516a;
                } else {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
                }
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            i = context.getResources().getIdentifier(str2, str, authority2);
            if (i == 0) {
                i = Resources.getSystem().getIdentifier(str2, str, MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            }
            if (i == 0) {
                throw new IllegalArgumentException("Failed to find resource id for: " + uri);
            }
        } else if (pathSegments.size() == 1) {
            try {
                i = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e2);
            }
        } else {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
        }
        Drawable a = C5708b.m14020a(this.f18516a, context, i, (Resources.Theme) null);
        if (a != null) {
            return new C5711e(a);
        }
        return null;
    }
}
