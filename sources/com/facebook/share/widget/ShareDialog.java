package com.facebook.share.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.widget.C0411h;
import cf0.C21136j;
import com.appboy.models.outgoing.TwitterUser;
import com.appsflyer.ServerParameters;
import com.facebook.AccessToken;
import com.facebook.appevents.C2338j;
import com.facebook.internal.C2373a;
import com.facebook.internal.C2396f;
import com.facebook.internal.C2397f0;
import com.facebook.internal.C2401h;
import com.facebook.internal.C2408j;
import com.facebook.internal.C2438y;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.share.internal.CameraEffectFeature;
import com.facebook.share.internal.ShareDialogFeature;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.internal.ShareStoryFeature;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import com.usebutton.sdk.internal.WebViewActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import mf0.C24362h;
import p009a8.C0098d0;
import p009a8.C0115o;
import p019b0.C1426c;
import p336z8.C7498b;
import p336z8.C7503c;
import p583jk.C17875h;
import p584jl.C17885a;
import p626lf.C18201b;

public class ShareDialog extends C2408j<ShareContent<?, ?>, C1426c> {

    /* renamed from: i */
    public static final int f8964i = CallbackManagerImpl.RequestCodeOffset.Share.toRequestCode();

    /* renamed from: g */
    public boolean f8965g = true;

    /* renamed from: h */
    public final ArrayList f8966h = C17875h.m44299h(new C2518d(this), new C2517c(this), new C2522f(this), new C2514a(this), new C2520e(this));

    @Metadata(mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/facebook/share/widget/ShareDialog$Mode;", "", "(Ljava/lang/String;I)V", "AUTOMATIC", "NATIVE", "WEB", "FEED", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1}, mo59064xi = 48)
    public enum Mode {
        AUTOMATIC,
        NATIVE,
        WEB,
        FEED
    }

    /* renamed from: com.facebook.share.widget.ShareDialog$a */
    public final class C2514a extends C2408j<ShareContent<?, ?>, C1426c>.C25541a {

        /* renamed from: b */
        public Mode f8967b = Mode.NATIVE;

        /* renamed from: c */
        public final /* synthetic */ ShareDialog f8968c;

        /* renamed from: com.facebook.share.widget.ShareDialog$a$a */
        public static final class C2515a implements C2401h.C2402a {

            /* renamed from: a */
            public final /* synthetic */ C2373a f8969a;

            /* renamed from: b */
            public final /* synthetic */ ShareContent<?, ?> f8970b;

            /* renamed from: c */
            public final /* synthetic */ boolean f8971c;

            public C2515a(C2373a aVar, ShareContent<?, ?> shareContent, boolean z) {
                this.f8969a = aVar;
                this.f8970b = shareContent;
                this.f8971c = z;
            }

            /* renamed from: a */
            public final Bundle mo299a() {
                return C17885a.m44396E(this.f8969a.mo12536a(), this.f8970b, this.f8971c);
            }

            public final Bundle getParameters() {
                return C18201b.m44915l(this.f8969a.mo12536a(), this.f8970b, this.f8971c);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2514a(ShareDialog shareDialog) {
            super(shareDialog);
            C24362h.m61211f(shareDialog, "this$0");
            this.f8968c = shareDialog;
        }

        /* renamed from: a */
        public final boolean mo297a(ShareContent shareContent, boolean z) {
            C24362h.m61211f(shareContent, "content");
            if (shareContent instanceof ShareCameraEffectContent) {
                int i = ShareDialog.f8964i;
                if (C2516b.m6538a(shareContent.getClass())) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final C2373a mo298b(ShareContent shareContent) {
            C24362h.m61211f(shareContent, "content");
            C7498b.m17202b(shareContent, C7498b.f22976b);
            C2373a a = this.f8968c.mo294a();
            boolean f = this.f8968c.mo296f();
            int i = ShareDialog.f8964i;
            C2396f c = C2516b.m6540c(shareContent.getClass());
            if (c == null) {
                return null;
            }
            C2401h.m6345c(a, new C2515a(a, shareContent, f), c);
            return a;
        }

        /* renamed from: c */
        public final Object mo12565c() {
            return this.f8967b;
        }
    }

    /* renamed from: com.facebook.share.widget.ShareDialog$b */
    public static final class C2516b {
        /* renamed from: a */
        public static boolean m6538a(Class cls) {
            C2396f c = m6540c(cls);
            if (c == null || !C2401h.m6343a(c)) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public static boolean m6539b(Class cls) {
            if (!ShareLinkContent.class.isAssignableFrom(cls)) {
                if (SharePhotoContent.class.isAssignableFrom(cls)) {
                    Date date = AccessToken.f8348m;
                    if (AccessToken.C2266c.m6111c()) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public static C2396f m6540c(Class cls) {
            if (ShareLinkContent.class.isAssignableFrom(cls)) {
                return ShareDialogFeature.SHARE_DIALOG;
            }
            if (SharePhotoContent.class.isAssignableFrom(cls)) {
                return ShareDialogFeature.PHOTOS;
            }
            if (ShareVideoContent.class.isAssignableFrom(cls)) {
                return ShareDialogFeature.VIDEO;
            }
            if (ShareMediaContent.class.isAssignableFrom(cls)) {
                return ShareDialogFeature.MULTIMEDIA;
            }
            if (ShareCameraEffectContent.class.isAssignableFrom(cls)) {
                return CameraEffectFeature.SHARE_CAMERA_EFFECT;
            }
            if (ShareStoryContent.class.isAssignableFrom(cls)) {
                return ShareStoryFeature.SHARE_STORY_ASSET;
            }
            return null;
        }
    }

    /* renamed from: com.facebook.share.widget.ShareDialog$c */
    public final class C2517c extends C2408j<ShareContent<?, ?>, C1426c>.C25541a {

        /* renamed from: b */
        public Mode f8972b = Mode.FEED;

        /* renamed from: c */
        public final /* synthetic */ ShareDialog f8973c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2517c(ShareDialog shareDialog) {
            super(shareDialog);
            C24362h.m61211f(shareDialog, "this$0");
            this.f8973c = shareDialog;
        }

        /* renamed from: a */
        public final boolean mo297a(ShareContent shareContent, boolean z) {
            C24362h.m61211f(shareContent, "content");
            if ((shareContent instanceof ShareLinkContent) || (shareContent instanceof ShareFeedContent)) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final C2373a mo298b(ShareContent shareContent) {
            Bundle bundle;
            String str;
            C24362h.m61211f(shareContent, "content");
            ShareDialog shareDialog = this.f8973c;
            ShareDialog.m6530e(shareDialog, shareDialog.mo12563b(), shareContent, Mode.FEED);
            C2373a a = this.f8973c.mo294a();
            String str2 = null;
            if (shareContent instanceof ShareLinkContent) {
                C7498b.m17202b(shareContent, C7498b.f22975a);
                ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
                bundle = new Bundle();
                C2397f0 f0Var = C2397f0.f8630a;
                Uri uri = shareLinkContent.f8919b;
                if (uri == null) {
                    str = null;
                } else {
                    str = uri.toString();
                }
                C2397f0.m6300I(bundle, WebViewActivity.EXTRA_LINK, str);
                C2397f0.m6300I(bundle, "quote", shareLinkContent.f8933h);
                ShareHashtag shareHashtag = shareLinkContent.f8924g;
                if (shareHashtag != null) {
                    str2 = shareHashtag.f8931b;
                }
                C2397f0.m6300I(bundle, "hashtag", str2);
            } else if (!(shareContent instanceof ShareFeedContent)) {
                return null;
            } else {
                ShareFeedContent shareFeedContent = (ShareFeedContent) shareContent;
                bundle = new Bundle();
                C2397f0 f0Var2 = C2397f0.f8630a;
                C2397f0.m6300I(bundle, "to", shareFeedContent.f8893h);
                C2397f0.m6300I(bundle, WebViewActivity.EXTRA_LINK, shareFeedContent.f8894i);
                C2397f0.m6300I(bundle, "picture", shareFeedContent.f8898m);
                C2397f0.m6300I(bundle, "source", shareFeedContent.f8899n);
                C2397f0.m6300I(bundle, "name", shareFeedContent.f8895j);
                C2397f0.m6300I(bundle, "caption", shareFeedContent.f8896k);
                C2397f0.m6300I(bundle, TwitterUser.DESCRIPTION_KEY, shareFeedContent.f8897l);
            }
            C2401h.m6347e(a, "feed", bundle);
            return a;
        }

        /* renamed from: c */
        public final Object mo12565c() {
            return this.f8972b;
        }
    }

    /* renamed from: com.facebook.share.widget.ShareDialog$d */
    public final class C2518d extends C2408j<ShareContent<?, ?>, C1426c>.C25541a {

        /* renamed from: b */
        public Mode f8974b = Mode.NATIVE;

        /* renamed from: c */
        public final /* synthetic */ ShareDialog f8975c;

        /* renamed from: com.facebook.share.widget.ShareDialog$d$a */
        public static final class C2519a implements C2401h.C2402a {

            /* renamed from: a */
            public final /* synthetic */ C2373a f8976a;

            /* renamed from: b */
            public final /* synthetic */ ShareContent<?, ?> f8977b;

            /* renamed from: c */
            public final /* synthetic */ boolean f8978c;

            public C2519a(C2373a aVar, ShareContent<?, ?> shareContent, boolean z) {
                this.f8976a = aVar;
                this.f8977b = shareContent;
                this.f8978c = z;
            }

            /* renamed from: a */
            public final Bundle mo299a() {
                return C17885a.m44396E(this.f8976a.mo12536a(), this.f8977b, this.f8978c);
            }

            public final Bundle getParameters() {
                return C18201b.m44915l(this.f8976a.mo12536a(), this.f8977b, this.f8978c);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2518d(ShareDialog shareDialog) {
            super(shareDialog);
            C24362h.m61211f(shareDialog, "this$0");
            this.f8975c = shareDialog;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo297a(com.facebook.share.model.ShareContent r4, boolean r5) {
            /*
                r3 = this;
                java.lang.String r0 = "content"
                mf0.C24362h.m61211f(r4, r0)
                boolean r0 = r4 instanceof com.facebook.share.model.ShareCameraEffectContent
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x0052
                boolean r0 = r4 instanceof com.facebook.share.model.ShareStoryContent
                if (r0 == 0) goto L_0x0010
                goto L_0x0052
            L_0x0010:
                if (r5 != 0) goto L_0x0042
                com.facebook.share.model.ShareHashtag r5 = r4.f8924g
                if (r5 == 0) goto L_0x001d
                com.facebook.share.internal.ShareDialogFeature r5 = com.facebook.share.internal.ShareDialogFeature.HASHTAG
                boolean r5 = com.facebook.internal.C2401h.m6343a(r5)
                goto L_0x001e
            L_0x001d:
                r5 = 1
            L_0x001e:
                boolean r0 = r4 instanceof com.facebook.share.model.ShareLinkContent
                if (r0 == 0) goto L_0x0043
                r0 = r4
                com.facebook.share.model.ShareLinkContent r0 = (com.facebook.share.model.ShareLinkContent) r0
                java.lang.String r0 = r0.f8933h
                if (r0 == 0) goto L_0x0032
                int r0 = r0.length()
                if (r0 != 0) goto L_0x0030
                goto L_0x0032
            L_0x0030:
                r0 = 0
                goto L_0x0033
            L_0x0032:
                r0 = 1
            L_0x0033:
                if (r0 != 0) goto L_0x0043
                if (r5 == 0) goto L_0x0040
                com.facebook.share.internal.ShareDialogFeature r5 = com.facebook.share.internal.ShareDialogFeature.LINK_SHARE_QUOTES
                boolean r5 = com.facebook.internal.C2401h.m6343a(r5)
                if (r5 == 0) goto L_0x0040
                goto L_0x0042
            L_0x0040:
                r5 = 0
                goto L_0x0043
            L_0x0042:
                r5 = 1
            L_0x0043:
                if (r5 == 0) goto L_0x0052
                int r5 = com.facebook.share.widget.ShareDialog.f8964i
                java.lang.Class r4 = r4.getClass()
                boolean r4 = com.facebook.share.widget.ShareDialog.C2516b.m6538a(r4)
                if (r4 == 0) goto L_0x0052
                r1 = 1
            L_0x0052:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.widget.ShareDialog.C2518d.mo297a(com.facebook.share.model.ShareContent, boolean):boolean");
        }

        /* renamed from: b */
        public final C2373a mo298b(ShareContent shareContent) {
            C24362h.m61211f(shareContent, "content");
            ShareDialog shareDialog = this.f8975c;
            ShareDialog.m6530e(shareDialog, shareDialog.mo12563b(), shareContent, Mode.NATIVE);
            C7498b.m17202b(shareContent, C7498b.f22976b);
            C2373a a = this.f8975c.mo294a();
            boolean f = this.f8975c.mo296f();
            C2396f c = C2516b.m6540c(shareContent.getClass());
            if (c == null) {
                return null;
            }
            C2401h.m6345c(a, new C2519a(a, shareContent, f), c);
            return a;
        }

        /* renamed from: c */
        public final Object mo12565c() {
            return this.f8974b;
        }
    }

    /* renamed from: com.facebook.share.widget.ShareDialog$e */
    public final class C2520e extends C2408j<ShareContent<?, ?>, C1426c>.C25541a {

        /* renamed from: b */
        public Mode f8979b = Mode.NATIVE;

        /* renamed from: c */
        public final /* synthetic */ ShareDialog f8980c;

        /* renamed from: com.facebook.share.widget.ShareDialog$e$a */
        public static final class C2521a implements C2401h.C2402a {

            /* renamed from: a */
            public final /* synthetic */ C2373a f8981a;

            /* renamed from: b */
            public final /* synthetic */ ShareContent<?, ?> f8982b;

            /* renamed from: c */
            public final /* synthetic */ boolean f8983c;

            public C2521a(C2373a aVar, ShareContent<?, ?> shareContent, boolean z) {
                this.f8981a = aVar;
                this.f8982b = shareContent;
                this.f8983c = z;
            }

            /* renamed from: a */
            public final Bundle mo299a() {
                return C17885a.m44396E(this.f8981a.mo12536a(), this.f8982b, this.f8983c);
            }

            public final Bundle getParameters() {
                return C18201b.m44915l(this.f8981a.mo12536a(), this.f8982b, this.f8983c);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2520e(ShareDialog shareDialog) {
            super(shareDialog);
            C24362h.m61211f(shareDialog, "this$0");
            this.f8980c = shareDialog;
        }

        /* renamed from: a */
        public final boolean mo297a(ShareContent shareContent, boolean z) {
            C24362h.m61211f(shareContent, "content");
            if (shareContent instanceof ShareStoryContent) {
                int i = ShareDialog.f8964i;
                if (C2516b.m6538a(shareContent.getClass())) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final C2373a mo298b(ShareContent shareContent) {
            C24362h.m61211f(shareContent, "content");
            C7498b.C7502d dVar = C7498b.f22975a;
            C7498b.m17202b(shareContent, C7498b.f22977c);
            C2373a a = this.f8980c.mo294a();
            boolean f = this.f8980c.mo296f();
            int i = ShareDialog.f8964i;
            C2396f c = C2516b.m6540c(shareContent.getClass());
            if (c == null) {
                return null;
            }
            C2401h.m6345c(a, new C2521a(a, shareContent, f), c);
            return a;
        }

        /* renamed from: c */
        public final Object mo12565c() {
            return this.f8979b;
        }
    }

    /* renamed from: com.facebook.share.widget.ShareDialog$f */
    public final class C2522f extends C2408j<ShareContent<?, ?>, C1426c>.C25541a {

        /* renamed from: b */
        public Mode f8984b = Mode.WEB;

        /* renamed from: c */
        public final /* synthetic */ ShareDialog f8985c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2522f(ShareDialog shareDialog) {
            super(shareDialog);
            C24362h.m61211f(shareDialog, "this$0");
            this.f8985c = shareDialog;
        }

        /* renamed from: a */
        public final boolean mo297a(ShareContent shareContent, boolean z) {
            C24362h.m61211f(shareContent, "content");
            int i = ShareDialog.f8964i;
            return C2516b.m6539b(shareContent.getClass());
        }

        /* renamed from: b */
        public final C2373a mo298b(ShareContent shareContent) {
            Bundle bundle;
            List<String> list;
            String str;
            String str2;
            ShareContent shareContent2 = shareContent;
            C24362h.m61211f(shareContent2, "content");
            ShareDialog shareDialog = this.f8985c;
            ShareDialog.m6530e(shareDialog, shareDialog.mo12563b(), shareContent2, Mode.WEB);
            C2373a a = this.f8985c.mo294a();
            C7498b.m17202b(shareContent2, C7498b.f22975a);
            boolean z = shareContent2 instanceof ShareLinkContent;
            String str3 = null;
            if (z) {
                ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent2;
                bundle = new Bundle();
                C2397f0 f0Var = C2397f0.f8630a;
                ShareHashtag shareHashtag = shareLinkContent.f8924g;
                if (shareHashtag == null) {
                    str2 = null;
                } else {
                    str2 = shareHashtag.f8931b;
                }
                C2397f0.m6300I(bundle, "hashtag", str2);
                C2397f0.m6301J(bundle, "href", shareLinkContent.f8919b);
                C2397f0.m6300I(bundle, "quote", shareLinkContent.f8933h);
            } else if (!(shareContent2 instanceof SharePhotoContent)) {
                return null;
            } else {
                SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent2;
                UUID a2 = a.mo12536a();
                SharePhotoContent.C2508a aVar = new SharePhotoContent.C2508a();
                aVar.f8925a = sharePhotoContent.f8919b;
                List<String> list2 = sharePhotoContent.f8920c;
                if (list2 == null) {
                    list = null;
                } else {
                    list = Collections.unmodifiableList(list2);
                }
                aVar.f8926b = list;
                aVar.f8927c = sharePhotoContent.f8921d;
                aVar.f8928d = sharePhotoContent.f8922e;
                aVar.f8929e = sharePhotoContent.f8923f;
                aVar.f8930f = sharePhotoContent.f8924g;
                aVar.mo12748a(sharePhotoContent.f8951h);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int size = sharePhotoContent.f8951h.size() - 1;
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        SharePhoto sharePhoto = sharePhotoContent.f8951h.get(i);
                        Bitmap bitmap = sharePhoto.f8942c;
                        if (bitmap != null) {
                            C2438y.C2439a b = C2438y.m6394b(a2, bitmap);
                            SharePhoto.C2506a a3 = new SharePhoto.C2506a().mo12745a(sharePhoto);
                            a3.f8948c = Uri.parse(b.f8739d);
                            a3.f8947b = null;
                            sharePhoto = new SharePhoto(a3);
                            arrayList2.add(b);
                        }
                        arrayList.add(sharePhoto);
                        if (i2 > size) {
                            break;
                        }
                        i = i2;
                    }
                }
                aVar.f8952g.clear();
                aVar.mo12748a(arrayList);
                C2438y.m6393a(arrayList2);
                SharePhotoContent sharePhotoContent2 = new SharePhotoContent(aVar);
                bundle = new Bundle();
                C2397f0 f0Var2 = C2397f0.f8630a;
                ShareHashtag shareHashtag2 = sharePhotoContent2.f8924g;
                if (shareHashtag2 == null) {
                    str = null;
                } else {
                    str = shareHashtag2.f8931b;
                }
                C2397f0.m6300I(bundle, "hashtag", str);
                Iterable<SharePhoto> iterable = sharePhotoContent2.f8951h;
                if (iterable == null) {
                    iterable = EmptyList.f60173b;
                }
                ArrayList arrayList3 = new ArrayList(C21136j.m49436X(iterable, 10));
                for (SharePhoto sharePhoto2 : iterable) {
                    arrayList3.add(String.valueOf(sharePhoto2.f8943d));
                }
                Object[] array = arrayList3.toArray(new String[0]);
                if (array != null) {
                    bundle.putStringArray("media", (String[]) array);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            if (z || (shareContent2 instanceof SharePhotoContent)) {
                str3 = "share";
            }
            C2401h.m6347e(a, str3, bundle);
            return a;
        }

        /* renamed from: c */
        public final Object mo12565c() {
            return this.f8984b;
        }
    }

    /* renamed from: com.facebook.share.widget.ShareDialog$g */
    public /* synthetic */ class C2523g {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8986a;

        static {
            int[] iArr = new int[Mode.values().length];
            iArr[Mode.AUTOMATIC.ordinal()] = 1;
            iArr[Mode.WEB.ordinal()] = 2;
            iArr[Mode.NATIVE.ordinal()] = 3;
            f8986a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareDialog(Activity activity, int i) {
        super(activity, i);
        C24362h.m61211f(activity, "activity");
        CallbackManagerImpl.f8585b.mo12523a(i, new C7503c(i));
    }

    /* renamed from: e */
    public static final void m6530e(ShareDialog shareDialog, Activity activity, ShareContent shareContent, Mode mode) {
        String str;
        if (shareDialog.f8965g) {
            mode = Mode.AUTOMATIC;
        }
        int i = C2523g.f8986a[mode.ordinal()];
        String str2 = "unknown";
        if (i == 1) {
            str = "automatic";
        } else if (i == 2) {
            str = "web";
        } else if (i != 3) {
            str = str2;
        } else {
            str = "native";
        }
        C2396f c = C2516b.m6540c(shareContent.getClass());
        if (c == ShareDialogFeature.SHARE_DIALOG) {
            str2 = ServerParameters.STATUS;
        } else if (c == ShareDialogFeature.PHOTOS) {
            str2 = "photo";
        } else if (c == ShareDialogFeature.VIDEO) {
            str2 = "video";
        }
        C2338j jVar = new C2338j((Context) activity, C0115o.m211b());
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", str);
        bundle.putString("fb_share_dialog_content_type", str2);
        if (C0098d0.m169b()) {
            jVar.mo12486f("fb_share_dialog_show", bundle);
        }
    }

    /* renamed from: a */
    public C2373a mo294a() {
        return new C2373a(this.f8656d);
    }

    /* renamed from: c */
    public List<C2408j<ShareContent<?, ?>, C1426c>.C25541a> mo295c() {
        return this.f8966h;
    }

    /* renamed from: f */
    public boolean mo296f() {
        return false;
    }

    public ShareDialog(C0411h hVar, int i) {
        super(hVar, i);
        CallbackManagerImpl.f8585b.mo12523a(i, new C7503c(i));
    }
}
