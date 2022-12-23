package p336z8;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import cf0.C21136j;
import com.appboy.support.AppboyFileUtils;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.appevents.C2338j;
import com.facebook.internal.C2397f0;
import com.facebook.internal.C2418k0;
import com.facebook.internal.C2438y;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.text.C24179b;
import mf0.C24362h;
import p009a8.C0098d0;
import p009a8.C0115o;
import uh0.C25081h;

/* renamed from: z8.e */
public final class C7505e {
    /* renamed from: a */
    public static final ArrayList m17222a(SharePhotoContent sharePhotoContent, UUID uuid) {
        List<SharePhoto> list;
        Bitmap bitmap;
        Uri uri;
        C2438y.C2439a aVar;
        C24362h.m61211f(uuid, "appCallId");
        if (sharePhotoContent == null) {
            list = null;
        } else {
            list = sharePhotoContent.f8951h;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (SharePhoto sharePhoto : list) {
            if (sharePhoto instanceof SharePhoto) {
                bitmap = sharePhoto.f8942c;
                uri = sharePhoto.f8943d;
            } else if (sharePhoto instanceof ShareVideo) {
                uri = ((ShareVideo) sharePhoto).f8957c;
                bitmap = null;
            } else {
                uri = null;
                bitmap = null;
            }
            if (bitmap != null) {
                aVar = C2438y.m6394b(uuid, bitmap);
            } else if (uri != null) {
                aVar = C2438y.m6395c(uuid, uri);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(C21136j.m49436X(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C2438y.C2439a) it.next()).f8739d);
        }
        C2438y.m6393a(arrayList);
        return arrayList2;
    }

    /* renamed from: b */
    public static final String m17223b(Uri uri) {
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        C24362h.m61210e(uri2, "uri.toString()");
        int O = C24179b.m60567O(uri2, '.');
        if (O == -1) {
            return null;
        }
        String substring = uri2.substring(O);
        C24362h.m61210e(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: c */
    public static void m17224c(String str, String str2) {
        C2338j jVar = new C2338j(C0115o.m210a(), (String) null);
        Bundle b = C25541a.m63872b("fb_share_dialog_outcome", str);
        if (str2 != null) {
            b.putString("error_message", str2);
        }
        if (C0098d0.m169b()) {
            jVar.mo12486f("fb_share_dialog_result", b);
        }
    }

    /* renamed from: d */
    public static final GraphRequest m17225d(AccessToken accessToken, Uri uri, C2418k0 k0Var) throws FileNotFoundException {
        String path = uri.getPath();
        C2397f0 f0Var = C2397f0.f8630a;
        if (C25081h.m62830A(AppboyFileUtils.FILE_SCHEME, uri.getScheme(), true) && path != null) {
            GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType((Parcelable) ParcelFileDescriptor.open(new File(path), 268435456));
            Bundle bundle = new Bundle(1);
            bundle.putParcelable(AppboyFileUtils.FILE_SCHEME, parcelableResourceWithMimeType);
            return new GraphRequest(accessToken, "me/staging_resources", bundle, HttpMethod.POST, k0Var, 32);
        } else if (C25081h.m62830A("content", uri.getScheme(), true)) {
            GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType2 = new GraphRequest.ParcelableResourceWithMimeType((Parcelable) uri);
            Bundle bundle2 = new Bundle(1);
            bundle2.putParcelable(AppboyFileUtils.FILE_SCHEME, parcelableResourceWithMimeType2);
            return new GraphRequest(accessToken, "me/staging_resources", bundle2, HttpMethod.POST, k0Var, 32);
        } else {
            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
        }
    }
}
