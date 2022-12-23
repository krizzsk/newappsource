package p280v1;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* renamed from: v1.e */
public final class C6842e {

    /* renamed from: a */
    public final C6845c f21184a;

    /* renamed from: v1.e$b */
    public static final class C6844b implements C6845c {

        /* renamed from: a */
        public final Uri f21186a;

        /* renamed from: b */
        public final ClipDescription f21187b;

        /* renamed from: c */
        public final Uri f21188c;

        public C6844b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f21186a = uri;
            this.f21187b = clipDescription;
            this.f21188c = uri2;
        }

        /* renamed from: a */
        public final Object mo23080a() {
            return null;
        }

        /* renamed from: b */
        public final Uri mo23081b() {
            return this.f21186a;
        }

        /* renamed from: c */
        public final void mo23082c() {
        }

        /* renamed from: d */
        public final Uri mo23083d() {
            return this.f21188c;
        }

        public final ClipDescription getDescription() {
            return this.f21187b;
        }
    }

    /* renamed from: v1.e$c */
    public interface C6845c {
        /* renamed from: a */
        Object mo23080a();

        /* renamed from: b */
        Uri mo23081b();

        /* renamed from: c */
        void mo23082c();

        /* renamed from: d */
        Uri mo23083d();

        ClipDescription getDescription();
    }

    public C6842e(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f21184a = new C6843a(uri, clipDescription, uri2);
        } else {
            this.f21184a = new C6844b(uri, clipDescription, uri2);
        }
    }

    /* renamed from: v1.e$a */
    public static final class C6843a implements C6845c {

        /* renamed from: a */
        public final InputContentInfo f21185a;

        public C6843a(Object obj) {
            this.f21185a = (InputContentInfo) obj;
        }

        /* renamed from: a */
        public final Object mo23080a() {
            return this.f21185a;
        }

        /* renamed from: b */
        public final Uri mo23081b() {
            return this.f21185a.getContentUri();
        }

        /* renamed from: c */
        public final void mo23082c() {
            this.f21185a.requestPermission();
        }

        /* renamed from: d */
        public final Uri mo23083d() {
            return this.f21185a.getLinkUri();
        }

        public final ClipDescription getDescription() {
            return this.f21185a.getDescription();
        }

        public C6843a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f21185a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public C6842e(C6843a aVar) {
        this.f21184a = aVar;
    }
}
