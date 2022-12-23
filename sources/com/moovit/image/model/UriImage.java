package com.moovit.image.model;

import android.net.Uri;
import java.io.IOException;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p834tz.C19794a;

public class UriImage extends Image {

    /* renamed from: f */
    public static C16061a f41823f = new C16061a(UriImage.class);

    /* renamed from: com.moovit.image.model.UriImage$a */
    public class C16061a extends C19619s<UriImage> {
        public C16061a(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            C19794a.C19799e eVar = C19794a.f50326d;
            pVar.getClass();
            eVar.getClass();
            return new UriImage(Uri.parse(pVar.mo51947p()), pVar.mo51949u());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            UriImage uriImage = (UriImage) obj;
            C19794a.C19799e eVar = C19794a.f50326d;
            qVar.getClass();
            eVar.write((Uri) uriImage.f41804c, qVar);
            qVar.mo51956u(uriImage.f41805d);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UriImage(android.net.Uri r5, java.lang.String... r6) {
        /*
            r4 = this;
            java.lang.String r0 = "android.resource"
            boolean r0 = p977zz.C20969u0.m49111b(r5, r0)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            goto L_0x0022
        L_0x000a:
            java.util.List r0 = r5.getPathSegments()
            int r2 = r0.size()
            r3 = 2
            if (r2 != r3) goto L_0x0022
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "drawable"
            boolean r0 = r2.equals(r0)
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            r2 = 1
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = "http"
            boolean r0 = p977zz.C20969u0.m49111b(r5, r0)
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "https"
            boolean r0 = p977zz.C20969u0.m49111b(r5, r0)
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            if (r0 != 0) goto L_0x003d
            r1 = 1
        L_0x003d:
            java.lang.String r0 = "UrlImage"
            r4.<init>(r0, r5, r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.image.model.UriImage.<init>(android.net.Uri, java.lang.String[]):void");
    }

    /* renamed from: c */
    public static UriImage m40912c(String str, String... strArr) {
        return new UriImage(Uri.parse(str), strArr);
    }
}
