package com.moovit.image.model;

import java.io.IOException;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20952m0;

public class ResourceImage extends Image {

    /* renamed from: com.moovit.image.model.ResourceImage$a */
    public static class C16058a extends C19619s<ResourceImage> {

        /* renamed from: w */
        public final C20952m0<String> f41820w;

        public C16058a(C20952m0<String> m0Var) {
            super(0, ResourceImage.class);
            this.f41820w = m0Var;
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new ResourceImage(this.f41820w.mo53030d(pVar.mo51947p()), pVar.mo51949u());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            ResourceImage resourceImage = (ResourceImage) obj;
            qVar.mo51954p(this.f41820w.mo53029c(((Integer) resourceImage.f41804c).intValue()));
            qVar.mo51956u(resourceImage.f41805d);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ResourceImage(int r3, java.lang.String... r4) {
        /*
            r2 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r1 = mf0.C24361g.m61154X(r4)
            if (r1 == 0) goto L_0x000c
            r3 = 0
            goto L_0x0022
        L_0x000c:
            com.moovit.image.d r1 = com.moovit.image.C16019d.m40803a()
            android.content.Context r1 = r1.f41715a
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r3 = r1.getResourceTypeName(r3)
            java.lang.String r1 = "drawable"
            boolean r3 = r1.equals(r3)
            r3 = r3 ^ 1
        L_0x0022:
            java.lang.String r1 = "DrawableResourceImage"
            r2.<init>(r1, r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.image.model.ResourceImage.<init>(int, java.lang.String[]):void");
    }

    /* renamed from: c */
    public final int mo48250c() {
        return ((Integer) this.f41804c).intValue();
    }
}
