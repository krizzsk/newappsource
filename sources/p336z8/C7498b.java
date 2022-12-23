package p336z8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import com.appboy.support.AppboyFileUtils;
import com.facebook.FacebookException;
import com.facebook.internal.C2397f0;
import com.facebook.internal.C2400g0;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import mf0.C24362h;
import p009a8.C0115o;
import uh0.C25081h;

/* renamed from: z8.b */
public final class C7498b {

    /* renamed from: a */
    public static final C7502d f22975a = new C7502d();

    /* renamed from: b */
    public static final C7501c f22976b = new C7501c();

    /* renamed from: c */
    public static final C7500b f22977c = new C7500b();

    /* renamed from: z8.b$a */
    public static final class C7499a extends C7501c {
        /* renamed from: a */
        public final void mo23763a(ShareLinkContent shareLinkContent) {
            C24362h.m61211f(shareLinkContent, "linkContent");
            C2397f0 f0Var = C2397f0.f8630a;
            if (!C2397f0.m6292A(shareLinkContent.f8933h)) {
                throw new FacebookException("Cannot share link content with quote using the share api");
            }
        }

        /* renamed from: c */
        public final void mo23764c(ShareMediaContent shareMediaContent) {
            C24362h.m61211f(shareMediaContent, "mediaContent");
            throw new FacebookException("Cannot share ShareMediaContent using the share api");
        }

        /* renamed from: d */
        public final void mo23765d(SharePhoto sharePhoto) {
            C24362h.m61211f(sharePhoto, "photo");
            C7502d dVar = C7498b.f22975a;
            Bitmap bitmap = sharePhoto.f8942c;
            Uri uri = sharePhoto.f8943d;
            if (bitmap == null && uri == null) {
                throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
            } else if (bitmap == null && C2397f0.m6293B(uri)) {
                throw new FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
            }
        }

        /* renamed from: g */
        public final void mo23766g(ShareVideoContent shareVideoContent) {
            boolean z;
            C24362h.m61211f(shareVideoContent, "videoContent");
            C2397f0 f0Var = C2397f0.f8630a;
            if (C2397f0.m6292A(shareVideoContent.f8921d)) {
                List<String> list = shareVideoContent.f8920c;
                if (list == null || list.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw new FacebookException("Cannot share video content with people IDs using the share api");
                } else if (!C2397f0.m6292A(shareVideoContent.f8923f)) {
                    throw new FacebookException("Cannot share video content with referrer URL using the share api");
                }
            } else {
                throw new FacebookException("Cannot share video content with place IDs using the share api");
            }
        }
    }

    /* renamed from: z8.b$b */
    public static final class C7500b extends C7501c {
        /* renamed from: e */
        public final void mo23767e(ShareStoryContent shareStoryContent) {
            C7498b.m17201a(shareStoryContent, this);
        }
    }

    /* renamed from: z8.b$c */
    public static class C7501c {
        /* renamed from: f */
        public static void m17208f(ShareVideo shareVideo) {
            C7502d dVar = C7498b.f22975a;
            if (shareVideo != null) {
                Uri uri = shareVideo.f8957c;
                if (uri != null) {
                    C2397f0 f0Var = C2397f0.f8630a;
                    if (!C25081h.m62830A("content", uri.getScheme(), true) && !C25081h.m62830A(AppboyFileUtils.FILE_SCHEME, uri.getScheme(), true)) {
                        throw new FacebookException("ShareVideo must reference a video that is on the device");
                    }
                    return;
                }
                throw new FacebookException("ShareVideo does not have a LocalUrl specified");
            }
            throw new FacebookException("Cannot share a null ShareVideo");
        }

        /* renamed from: a */
        public void mo23763a(ShareLinkContent shareLinkContent) {
            C24362h.m61211f(shareLinkContent, "linkContent");
            C7502d dVar = C7498b.f22975a;
            Uri uri = shareLinkContent.f8919b;
            if (uri != null && !C2397f0.m6293B(uri)) {
                throw new FacebookException("Content Url must be an http:// or https:// url");
            }
        }

        /* renamed from: b */
        public final void mo23768b(ShareMedia<?, ?> shareMedia) {
            C24362h.m61211f(shareMedia, "medium");
            C7502d dVar = C7498b.f22975a;
            if (shareMedia instanceof SharePhoto) {
                mo23765d((SharePhoto) shareMedia);
            } else if (shareMedia instanceof ShareVideo) {
                m17208f((ShareVideo) shareMedia);
            } else {
                String format = String.format(Locale.ROOT, "Invalid media type: %s", Arrays.copyOf(new Object[]{shareMedia.getClass().getSimpleName()}, 1));
                C24362h.m61210e(format, "java.lang.String.format(locale, format, *args)");
                throw new FacebookException(format);
            }
        }

        /* renamed from: c */
        public void mo23764c(ShareMediaContent shareMediaContent) {
            C24362h.m61211f(shareMediaContent, "mediaContent");
            C7502d dVar = C7498b.f22975a;
            List<ShareMedia<?, ?>> list = shareMediaContent.f8936h;
            if (list == null || list.isEmpty()) {
                throw new FacebookException("Must specify at least one medium in ShareMediaContent.");
            } else if (list.size() <= 6) {
                for (ShareMedia<?, ?> b : list) {
                    mo23768b(b);
                }
            } else {
                String format = String.format(Locale.ROOT, "Cannot add more than %d media.", Arrays.copyOf(new Object[]{6}, 1));
                C24362h.m61210e(format, "java.lang.String.format(locale, format, *args)");
                throw new FacebookException(format);
            }
        }

        /* renamed from: d */
        public void mo23765d(SharePhoto sharePhoto) {
            C24362h.m61211f(sharePhoto, "photo");
            C7502d dVar = C7498b.f22975a;
            Bitmap bitmap = sharePhoto.f8942c;
            Uri uri = sharePhoto.f8943d;
            if (bitmap == null && uri == null) {
                throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
            } else if (bitmap != null || !C2397f0.m6293B(uri)) {
                if (sharePhoto.f8942c == null) {
                    C2397f0 f0Var = C2397f0.f8630a;
                    if (C2397f0.m6293B(sharePhoto.f8943d)) {
                        return;
                    }
                }
                int i = C2400g0.f8641a;
                Context a = C0115o.m210a();
                String b = C0115o.m211b();
                PackageManager packageManager = a.getPackageManager();
                if (packageManager != null) {
                    String k = C24362h.m61216k(b, "com.facebook.app.FacebookContentProvider");
                    if (packageManager.resolveContentProvider(k, 0) == null) {
                        throw new IllegalStateException(C13555b.m33971j(new Object[]{k}, 1, "A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", "java.lang.String.format(format, *args)").toString());
                    }
                }
            } else {
                throw new FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
            }
        }

        /* renamed from: e */
        public void mo23767e(ShareStoryContent shareStoryContent) {
            C7498b.m17201a(shareStoryContent, this);
        }

        /* renamed from: g */
        public void mo23766g(ShareVideoContent shareVideoContent) {
            C24362h.m61211f(shareVideoContent, "videoContent");
            C7502d dVar = C7498b.f22975a;
            m17208f(shareVideoContent.f8963k);
            SharePhoto sharePhoto = shareVideoContent.f8962j;
            if (sharePhoto != null) {
                mo23765d(sharePhoto);
            }
        }
    }

    /* renamed from: z8.b$d */
    public static final class C7502d extends C7501c {
        /* renamed from: c */
        public final void mo23764c(ShareMediaContent shareMediaContent) {
            C24362h.m61211f(shareMediaContent, "mediaContent");
            throw new FacebookException("Cannot share ShareMediaContent via web sharing dialogs");
        }

        /* renamed from: d */
        public final void mo23765d(SharePhoto sharePhoto) {
            C24362h.m61211f(sharePhoto, "photo");
            C7502d dVar = C7498b.f22975a;
            Bitmap bitmap = sharePhoto.f8942c;
            Uri uri = sharePhoto.f8943d;
            if (bitmap == null && uri == null) {
                throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
            }
        }

        /* renamed from: g */
        public final void mo23766g(ShareVideoContent shareVideoContent) {
            C24362h.m61211f(shareVideoContent, "videoContent");
            throw new FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
        }
    }

    static {
        new C7499a();
    }

    /* renamed from: a */
    public static final void m17201a(ShareStoryContent shareStoryContent, C7501c cVar) {
        ShareMedia<?, ?> shareMedia;
        if (shareStoryContent == null || ((shareMedia = shareStoryContent.f8953h) == null && shareStoryContent.f8954i == null)) {
            throw new FacebookException("Must pass the Facebook app a background asset, a sticker asset, or both");
        }
        if (shareMedia != null) {
            cVar.mo23768b(shareMedia);
        }
        SharePhoto sharePhoto = shareStoryContent.f8954i;
        if (sharePhoto != null) {
            cVar.mo23765d(sharePhoto);
        }
    }

    /* renamed from: b */
    public static void m17202b(ShareContent shareContent, C7501c cVar) throws FacebookException {
        if (shareContent == null) {
            throw new FacebookException("Must provide non-null content to share");
        } else if (shareContent instanceof ShareLinkContent) {
            cVar.mo23763a((ShareLinkContent) shareContent);
        } else if (shareContent instanceof SharePhotoContent) {
            cVar.getClass();
            List<SharePhoto> list = ((SharePhotoContent) shareContent).f8951h;
            if (list == null || list.isEmpty()) {
                throw new FacebookException("Must specify at least one Photo in SharePhotoContent.");
            } else if (list.size() <= 6) {
                for (SharePhoto d : list) {
                    cVar.mo23765d(d);
                }
            } else {
                String format = String.format(Locale.ROOT, "Cannot add more than %d photos.", Arrays.copyOf(new Object[]{6}, 1));
                C24362h.m61210e(format, "java.lang.String.format(locale, format, *args)");
                throw new FacebookException(format);
            }
        } else if (shareContent instanceof ShareVideoContent) {
            cVar.mo23766g((ShareVideoContent) shareContent);
        } else if (shareContent instanceof ShareMediaContent) {
            cVar.mo23764c((ShareMediaContent) shareContent);
        } else if (shareContent instanceof ShareCameraEffectContent) {
            cVar.getClass();
            if (C2397f0.m6292A(((ShareCameraEffectContent) shareContent).f8916h)) {
                throw new FacebookException("Must specify a non-empty effectId");
            }
        } else if (shareContent instanceof ShareStoryContent) {
            cVar.mo23767e((ShareStoryContent) shareContent);
        }
    }
}
