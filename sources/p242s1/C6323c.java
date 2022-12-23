package p242s1;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import mf0.C24361g;
import p001a0.C0016g;

/* renamed from: s1.c */
public final class C6323c {

    /* renamed from: a */
    public final C6328e f19976a;

    /* renamed from: s1.c$a */
    public static final class C6324a implements C6325b {

        /* renamed from: a */
        public final ContentInfo.Builder f19977a;

        public C6324a(ClipData clipData, int i) {
            this.f19977a = new ContentInfo.Builder(clipData, i);
        }

        /* renamed from: a */
        public final void mo22452a(Uri uri) {
            this.f19977a.setLinkUri(uri);
        }

        /* renamed from: b */
        public final void mo22453b(int i) {
            this.f19977a.setFlags(i);
        }

        public final C6323c build() {
            return new C6323c(new C6327d(this.f19977a.build()));
        }

        public final void setExtras(Bundle bundle) {
            this.f19977a.setExtras(bundle);
        }
    }

    /* renamed from: s1.c$b */
    public interface C6325b {
        /* renamed from: a */
        void mo22452a(Uri uri);

        /* renamed from: b */
        void mo22453b(int i);

        C6323c build();

        void setExtras(Bundle bundle);
    }

    /* renamed from: s1.c$c */
    public static final class C6326c implements C6325b {

        /* renamed from: a */
        public ClipData f19978a;

        /* renamed from: b */
        public int f19979b;

        /* renamed from: c */
        public int f19980c;

        /* renamed from: d */
        public Uri f19981d;

        /* renamed from: e */
        public Bundle f19982e;

        public C6326c(ClipData clipData, int i) {
            this.f19978a = clipData;
            this.f19979b = i;
        }

        /* renamed from: a */
        public final void mo22452a(Uri uri) {
            this.f19981d = uri;
        }

        /* renamed from: b */
        public final void mo22453b(int i) {
            this.f19980c = i;
        }

        public final C6323c build() {
            return new C6323c(new C6329f(this));
        }

        public final void setExtras(Bundle bundle) {
            this.f19982e = bundle;
        }
    }

    /* renamed from: s1.c$d */
    public static final class C6327d implements C6328e {

        /* renamed from: a */
        public final ContentInfo f19983a;

        public C6327d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f19983a = contentInfo;
        }

        /* renamed from: a */
        public final ContentInfo mo22456a() {
            return this.f19983a;
        }

        /* renamed from: b */
        public final ClipData mo22457b() {
            return this.f19983a.getClip();
        }

        /* renamed from: c */
        public final int mo22458c() {
            return this.f19983a.getFlags();
        }

        /* renamed from: e */
        public final int mo22459e() {
            return this.f19983a.getSource();
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("ContentInfoCompat{");
            k.append(this.f19983a);
            k.append("}");
            return k.toString();
        }
    }

    /* renamed from: s1.c$e */
    public interface C6328e {
        /* renamed from: a */
        ContentInfo mo22456a();

        /* renamed from: b */
        ClipData mo22457b();

        /* renamed from: c */
        int mo22458c();

        /* renamed from: e */
        int mo22459e();
    }

    /* renamed from: s1.c$f */
    public static final class C6329f implements C6328e {

        /* renamed from: a */
        public final ClipData f19984a;

        /* renamed from: b */
        public final int f19985b;

        /* renamed from: c */
        public final int f19986c;

        /* renamed from: d */
        public final Uri f19987d;

        /* renamed from: e */
        public final Bundle f19988e;

        public C6329f(C6326c cVar) {
            ClipData clipData = cVar.f19978a;
            clipData.getClass();
            this.f19984a = clipData;
            int i = cVar.f19979b;
            C24361g.m61179p(i, 0, "source", 5);
            this.f19985b = i;
            int i2 = cVar.f19980c;
            if ((i2 & 1) == i2) {
                this.f19986c = i2;
                this.f19987d = cVar.f19981d;
                this.f19988e = cVar.f19982e;
                return;
            }
            StringBuilder k = C13555b.m33972k("Requested flags 0x");
            k.append(Integer.toHexString(i2));
            k.append(", but only 0x");
            k.append(Integer.toHexString(1));
            k.append(" are allowed");
            throw new IllegalArgumentException(k.toString());
        }

        /* renamed from: a */
        public final ContentInfo mo22456a() {
            return null;
        }

        /* renamed from: b */
        public final ClipData mo22457b() {
            return this.f19984a;
        }

        /* renamed from: c */
        public final int mo22458c() {
            return this.f19986c;
        }

        /* renamed from: e */
        public final int mo22459e() {
            return this.f19985b;
        }

        public final String toString() {
            String str;
            String str2;
            String str3;
            StringBuilder k = C13555b.m33972k("ContentInfoCompat{clip=");
            k.append(this.f19984a.getDescription());
            k.append(", source=");
            int i = this.f19985b;
            if (i == 0) {
                str = "SOURCE_APP";
            } else if (i == 1) {
                str = "SOURCE_CLIPBOARD";
            } else if (i == 2) {
                str = "SOURCE_INPUT_METHOD";
            } else if (i == 3) {
                str = "SOURCE_DRAG_AND_DROP";
            } else if (i == 4) {
                str = "SOURCE_AUTOFILL";
            } else if (i != 5) {
                str = String.valueOf(i);
            } else {
                str = "SOURCE_PROCESS_TEXT";
            }
            k.append(str);
            k.append(", flags=");
            int i2 = this.f19986c;
            if ((i2 & 1) != 0) {
                str2 = "FLAG_CONVERT_TO_PLAIN_TEXT";
            } else {
                str2 = String.valueOf(i2);
            }
            k.append(str2);
            String str4 = "";
            if (this.f19987d == null) {
                str3 = str4;
            } else {
                StringBuilder k2 = C13555b.m33972k(", hasLinkUri(");
                k2.append(this.f19987d.toString().length());
                k2.append(")");
                str3 = k2.toString();
            }
            k.append(str3);
            if (this.f19988e != null) {
                str4 = ", hasExtras";
            }
            return C0016g.m31o(k, str4, "}");
        }
    }

    public C6323c(C6328e eVar) {
        this.f19976a = eVar;
    }

    public final String toString() {
        return this.f19976a.toString();
    }
}
