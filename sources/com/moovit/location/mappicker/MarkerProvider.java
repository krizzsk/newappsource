package com.moovit.location.mappicker;

import android.os.Parcelable;
import android.util.SparseArray;
import c70.C13752e;
import com.moovit.commons.request.ServerException;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.transit.LocationDescriptor;
import java.io.IOException;
import java.util.Collection;
import p646lz.C18299a;

public interface MarkerProvider extends Parcelable {
    /* renamed from: x1 */
    Collection<C16214a> mo23914x1(C18299a aVar, C13752e eVar) throws IOException, ServerException;

    /* renamed from: com.moovit.location.mappicker.MarkerProvider$a */
    public static final class C16214a {

        /* renamed from: a */
        public final LocationDescriptor f42305a;

        /* renamed from: b */
        public final SparseArray<MarkerZoomStyle> f42306b;

        /* renamed from: c */
        public final SparseArray<MarkerZoomStyle> f42307c;

        /* renamed from: d */
        public final String f42308d;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C16214a(com.moovit.transit.LocationDescriptor r6, com.moovit.map.MarkerZoomStyle r7, com.moovit.map.MarkerZoomStyle r8, java.lang.String r9) {
            /*
                r5 = this;
                r0 = 1
                zz.i0[] r1 = new p977zz.C20944i0[r0]
                r2 = 0
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                zz.i0 r4 = new zz.i0
                r4.<init>(r3, r7)
                r1[r2] = r4
                android.util.SparseArray r7 = c00.C13717b.m34268o(r1)
                if (r8 == 0) goto L_0x0023
                zz.i0[] r0 = new p977zz.C20944i0[r0]
                zz.i0 r1 = new zz.i0
                r1.<init>(r3, r8)
                r0[r2] = r1
                android.util.SparseArray r8 = c00.C13717b.m34268o(r0)
                goto L_0x0024
            L_0x0023:
                r8 = 0
            L_0x0024:
                r5.<init>((com.moovit.transit.LocationDescriptor) r6, (android.util.SparseArray<com.moovit.map.MarkerZoomStyle>) r7, (android.util.SparseArray<com.moovit.map.MarkerZoomStyle>) r8, (java.lang.String) r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.location.mappicker.MarkerProvider.C16214a.<init>(com.moovit.transit.LocationDescriptor, com.moovit.map.MarkerZoomStyle, com.moovit.map.MarkerZoomStyle, java.lang.String):void");
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C16214a)) {
                return false;
            }
            return this.f42305a.equals(((C16214a) obj).f42305a);
        }

        public final int hashCode() {
            return this.f42305a.hashCode();
        }

        public C16214a(LocationDescriptor locationDescriptor, SparseArray<MarkerZoomStyle> sparseArray, SparseArray<MarkerZoomStyle> sparseArray2, String str) {
            this.f42305a = locationDescriptor;
            this.f42306b = sparseArray;
            this.f42307c = sparseArray2 != null ? sparseArray2 : sparseArray;
            this.f42308d = str;
        }
    }
}
