package com.moovit.map.items;

import android.util.SparseArray;
import c70.C13746a;
import c70.C13780t;
import com.google.android.gms.common.ConnectionResult;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.image.C16028g;
import com.moovit.image.model.Image;
import com.moovit.image.model.ImageRefWithPartialParams;
import com.moovit.image.model.RemoteImage;
import com.moovit.image.model.ResourceImage;
import com.moovit.image.model.ResourceImageRef;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.mapitems.MVMapItemsResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.apache.thrift.TBase;
import p824tp.C19745w;

/* renamed from: com.moovit.map.items.b */
public final class C16284b extends C13780t<C16283a, C16284b, MVMapItemsResponse> {

    /* renamed from: m */
    public List<MapItem> f42557m = Collections.emptyList();

    public C16284b() {
        super(MVMapItemsResponse.class);
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0155 A[Catch:{ IOException -> 0x0273 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0255 A[SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.moovit.map.items.MapItem> m41531q(com.moovit.map.items.MapItem.Type r18, com.tranzmate.moovit.protocol.mapitems.MVMapItemsResponse r19) {
        /*
            r0 = r19
            java.util.List<com.tranzmate.moovit.protocol.mapitems.MVImageSetMapItems> r1 = r0.mapItems
            if (r1 != 0) goto L_0x000b
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L_0x000b:
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = 0
        L_0x0011:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0029
            java.lang.Object r4 = r1.next()
            com.tranzmate.moovit.protocol.mapitems.MVImageSetMapItems r4 = (com.tranzmate.moovit.protocol.mapitems.MVImageSetMapItems) r4
            java.util.List<com.tranzmate.moovit.protocol.mapitems.MVMapItem> r4 = r4.mapItems
            if (r4 != 0) goto L_0x0023
            r4 = 0
            goto L_0x0027
        L_0x0023:
            int r4 = r4.size()
        L_0x0027:
            int r3 = r3 + r4
            goto L_0x0011
        L_0x0029:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            java.util.List<com.tranzmate.moovit.protocol.mapitems.MVImageSetMapItems> r3 = r0.mapItems
            java.util.Iterator r3 = r3.iterator()
        L_0x0034:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x027b
            java.lang.Object r4 = r3.next()
            com.tranzmate.moovit.protocol.mapitems.MVImageSetMapItems r4 = (com.tranzmate.moovit.protocol.mapitems.MVImageSetMapItems) r4
            com.tranzmate.moovit.protocol.common.MVImageReferenceSet r5 = r4.imageRefSet
            a20.b r5 = com.moovit.image.C16028g.m40827e(r5)
            android.util.SparseArray<com.moovit.image.model.ImageRef> r6 = r5.f33226a
            int r6 = r6.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r6)
            r8 = 0
        L_0x0052:
            if (r8 >= r6) goto L_0x0064
            android.util.SparseArray<com.moovit.image.model.ImageRef> r9 = r5.f33226a
            int r9 = r9.keyAt(r8)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r7.add(r9)
            int r8 = r8 + 1
            goto L_0x0052
        L_0x0064:
            java.lang.Object r6 = java.util.Collections.max(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            android.util.SparseArray<com.moovit.image.model.ImageRef> r8 = r5.f33226a
            java.lang.Object r8 = r8.get(r6)
            com.moovit.image.model.ImageRef r8 = (com.moovit.image.model.ImageRef) r8
            boolean r9 = r8 instanceof com.moovit.image.model.RemoteImageRef
            r10 = 2
            if (r9 == 0) goto L_0x0085
            r9 = r8
            com.moovit.image.model.RemoteImageRef r9 = (com.moovit.image.model.RemoteImageRef) r9
            com.moovit.network.model.ServerId r9 = r9.f41819b
            java.lang.String r9 = r9.mo19751c()
            goto L_0x0096
        L_0x0085:
            boolean r9 = r8 instanceof com.moovit.image.model.ResourceImageRef
            if (r9 == 0) goto L_0x012f
            r9 = r8
            com.moovit.image.model.ResourceImageRef r9 = (com.moovit.image.model.ResourceImageRef) r9
            int r9 = r9.f41821b
            int r9 = com.moovit.image.C16028g.m40831i(r9)
            java.lang.String r9 = java.lang.Integer.toString(r9)
        L_0x0096:
            r11 = 1700(0x6a4, float:2.382E-42)
            java.lang.String r12 = "0.75"
            r13 = 1
            if (r6 < r11) goto L_0x00e4
            android.util.SparseArray r6 = new android.util.SparseArray
            int r8 = r7.size()
            int r8 = r8 + r13
            r6.<init>(r8)
            java.util.Iterator r7 = r7.iterator()
        L_0x00ab:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00c7
            java.lang.Object r8 = r7.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            android.util.SparseArray<com.moovit.image.model.ImageRef> r11 = r5.f33226a
            java.lang.Object r11 = r11.get(r8)
            com.moovit.image.model.ImageRef r11 = (com.moovit.image.model.ImageRef) r11
            r6.put(r8, r11)
            goto L_0x00ab
        L_0x00c7:
            com.moovit.image.model.ImageRefWithPartialParams r5 = new com.moovit.image.model.ImageRefWithPartialParams
            com.moovit.image.model.ResourceImageRef r7 = new com.moovit.image.model.ResourceImageRef
            int r8 = p824tp.C19745w.scaled_bus_stop
            r7.<init>(r8)
            java.lang.String[] r8 = new java.lang.String[r10]
            r8[r2] = r9
            r8[r13] = r12
            r5.<init>(r7, r8)
            r7 = 1675(0x68b, float:2.347E-42)
            r6.put(r7, r5)
            a20.b r5 = new a20.b
            r5.<init>(r6, r2)
            goto L_0x012f
        L_0x00e4:
            android.util.SparseArray r6 = new android.util.SparseArray
            int r11 = r7.size()
            int r11 = r11 + r13
            r6.<init>(r11)
            java.util.Iterator r7 = r7.iterator()
        L_0x00f2:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x010e
            java.lang.Object r11 = r7.next()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            android.util.SparseArray<com.moovit.image.model.ImageRef> r14 = r5.f33226a
            java.lang.Object r14 = r14.get(r11)
            com.moovit.image.model.ImageRef r14 = (com.moovit.image.model.ImageRef) r14
            r6.put(r11, r14)
            goto L_0x00f2
        L_0x010e:
            com.moovit.image.model.ImageRefWithPartialParams r5 = new com.moovit.image.model.ImageRefWithPartialParams
            com.moovit.image.model.ResourceImageRef r7 = new com.moovit.image.model.ResourceImageRef
            int r11 = p824tp.C19745w.scaled_bus_stop
            r7.<init>(r11)
            java.lang.String[] r11 = new java.lang.String[r10]
            r11[r2] = r9
            r11[r13] = r12
            r5.<init>(r7, r11)
            r7 = 1500(0x5dc, float:2.102E-42)
            r6.put(r7, r5)
            r5 = 1600(0x640, float:2.242E-42)
            r6.put(r5, r8)
            a20.b r5 = new a20.b
            r5.<init>(r6, r2)
        L_0x012f:
            java.util.List<com.tranzmate.moovit.protocol.mapitems.MVMapItem> r2 = r4.mapItems
            int r6 = r0.tileX
            int r7 = r0.tileY
            java.nio.ByteBuffer r4 = r4.itemLocations
            byte[] r4 = r4.array()
            int r6 = r6 * 10000
            int r7 = r7 * 10000
            java.io.DataInputStream r8 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0273 }
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0273 }
            r9.<init>(r4)     // Catch:{ IOException -> 0x0273 }
            r8.<init>(r9)     // Catch:{ IOException -> 0x0273 }
            int r4 = r8.readUnsignedShort()     // Catch:{ IOException -> 0x0273 }
            com.moovit.commons.geo.LatLonE6[] r9 = new com.moovit.commons.geo.LatLonE6[r4]     // Catch:{ IOException -> 0x0273 }
            r11 = 0
        L_0x0150:
            int r12 = r4 + 1
            int r12 = r12 / r10
            if (r11 >= r12) goto L_0x01aa
            int r12 = r8.readUnsignedByte()     // Catch:{ IOException -> 0x0273 }
            int r12 = r12 << r10
            int r13 = r8.readUnsignedByte()     // Catch:{ IOException -> 0x0273 }
            int r13 = r13 << r10
            int r14 = r8.readUnsignedByte()     // Catch:{ IOException -> 0x0273 }
            int r10 = r14 << r10
            int r14 = r8.readUnsignedByte()     // Catch:{ IOException -> 0x0273 }
            int r14 = r14 << 2
            byte r15 = r8.readByte()     // Catch:{ IOException -> 0x0273 }
            r16 = r15 & 3
            r12 = r12 | r16
            int r16 = r15 >> 2
            r16 = r16 & 3
            r13 = r13 | r16
            int r16 = r15 >> 4
            r16 = r16 & 3
            r10 = r10 | r16
            int r15 = r15 >> 6
            r15 = r15 & 3
            r14 = r14 | r15
            int r12 = r12 * 10
            int r12 = r12 + r6
            int r13 = r13 * 10
            int r13 = r13 + r7
            int r10 = r10 * 10
            int r10 = r10 + r6
            int r14 = r14 * 10
            int r14 = r14 + r7
            int r15 = r11 * 2
            com.moovit.commons.geo.LatLonE6 r0 = new com.moovit.commons.geo.LatLonE6     // Catch:{ IOException -> 0x0273 }
            r0.<init>(r13, r12)     // Catch:{ IOException -> 0x0273 }
            r9[r15] = r0     // Catch:{ IOException -> 0x0273 }
            int r15 = r15 + 1
            if (r15 >= r4) goto L_0x01a4
            com.moovit.commons.geo.LatLonE6 r0 = new com.moovit.commons.geo.LatLonE6     // Catch:{ IOException -> 0x0273 }
            r0.<init>(r14, r10)     // Catch:{ IOException -> 0x0273 }
            r9[r15] = r0     // Catch:{ IOException -> 0x0273 }
        L_0x01a4:
            int r11 = r11 + 1
            r10 = 2
            r0 = r19
            goto L_0x0150
        L_0x01aa:
            int r0 = r2.size()
            if (r0 != r4) goto L_0x0255
            r4 = 0
        L_0x01b1:
            if (r4 >= r0) goto L_0x024c
            java.lang.Object r6 = r2.get(r4)
            com.tranzmate.moovit.protocol.mapitems.MVMapItem r6 = (com.tranzmate.moovit.protocol.mapitems.MVMapItem) r6
            int r7 = r6.itemId
            com.moovit.network.model.ServerId r8 = new com.moovit.network.model.ServerId
            r8.<init>(r7)
            r7 = r9[r4]
            java.util.List<java.lang.String> r6 = r6.itemParams
            if (r6 != 0) goto L_0x01ca
            java.util.List r6 = java.util.Collections.emptyList()
        L_0x01ca:
            java.lang.String[] r6 = mf0.C24361g.m61182q0(r6)
            com.moovit.image.d r10 = com.moovit.image.C16019d.m40803a()
            zz.m0<java.lang.String> r10 = r10.f41717c
            java.lang.String r11 = "scaled_bus_stop_wo_params"
            int r10 = r10.mo53030d(r11)
            android.util.SparseArray r11 = new android.util.SparseArray
            r11.<init>()
            android.util.SparseArray<com.moovit.image.model.ImageRef> r12 = r5.f33226a
            int r12 = r12.size()
            r13 = 0
        L_0x01e6:
            if (r13 >= r12) goto L_0x0230
            android.util.SparseArray<com.moovit.image.model.ImageRef> r14 = r5.f33226a
            int r14 = r14.keyAt(r13)
            android.util.SparseArray<com.moovit.image.model.ImageRef> r15 = r5.f33226a
            java.lang.Object r15 = r15.valueAt(r13)
            com.moovit.image.model.ImageRef r15 = (com.moovit.image.model.ImageRef) r15
            r16 = r0
            boolean r0 = r15 instanceof com.moovit.image.model.ImageRefWithPartialParams
            if (r0 == 0) goto L_0x021a
            r0 = r15
            com.moovit.image.model.ImageRefWithPartialParams r0 = (com.moovit.image.model.ImageRefWithPartialParams) r0
            com.moovit.image.model.ImageRef r0 = r0.f41810b
            r17 = r3
            boolean r3 = r0 instanceof com.moovit.image.model.ResourceImageRef
            if (r3 == 0) goto L_0x021c
            com.moovit.image.model.ResourceImageRef r0 = (com.moovit.image.model.ResourceImageRef) r0
            int r0 = r0.f41821b
            if (r0 != r10) goto L_0x021c
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            com.moovit.image.model.Image r0 = r15.mo48235p(r0)
            int r14 = r14 * 1
            r11.append(r14, r0)
            goto L_0x0229
        L_0x021a:
            r17 = r3
        L_0x021c:
            if (r15 != 0) goto L_0x0220
            r0 = 0
            goto L_0x0224
        L_0x0220:
            com.moovit.image.model.Image r0 = r15.mo48235p(r6)
        L_0x0224:
            int r14 = r14 * 1
            r11.append(r14, r0)
        L_0x0229:
            int r13 = r13 + 1
            r0 = r16
            r3 = r17
            goto L_0x01e6
        L_0x0230:
            r16 = r0
            r17 = r3
            com.moovit.image.model.ImageSet r0 = new com.moovit.image.model.ImageSet
            r3 = 0
            r0.<init>(r11, r3)
            com.moovit.map.items.MapItem r3 = new com.moovit.map.items.MapItem
            r6 = r18
            r3.<init>(r6, r8, r7, r0)
            r1.add(r3)
            int r4 = r4 + 1
            r0 = r16
            r3 = r17
            goto L_0x01b1
        L_0x024c:
            r6 = r18
            r17 = r3
            r2 = 0
            r0 = r19
            goto L_0x0034
        L_0x0255:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Number of points ("
            java.lang.String r3 = ") does not match the number of map items ("
            java.lang.StringBuilder r1 = p379.C25541a.m63887r(r1, r4, r3)
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0273:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "data too short"
            r0.<init>(r1)
            throw r0
        L_0x027b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.map.items.C16284b.m41531q(com.moovit.map.items.MapItem$Type, com.tranzmate.moovit.protocol.mapitems.MVMapItemsResponse):java.util.List");
    }

    /* renamed from: r */
    public static void m41532r(SparseArray<Image> sparseArray) {
        String str;
        Image image;
        Image image2;
        int size = sparseArray.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            if (keyAt > i) {
                i = keyAt;
            }
        }
        Image image3 = sparseArray.get(i);
        if (image3 instanceof RemoteImage) {
            str = ((ServerId) image3.f41804c).mo19751c();
        } else if (image3 instanceof ResourceImage) {
            str = Integer.toString(C16028g.m40831i(((ResourceImage) image3).mo48250c()));
        } else {
            return;
        }
        String[] b = image3.mo48223b();
        if (i >= 1700) {
            ImageRefWithPartialParams imageRefWithPartialParams = new ImageRefWithPartialParams(new ResourceImageRef(C19745w.scaled_bus_stop), new String[]{str, "0.75"});
            if (b == null) {
                image2 = imageRefWithPartialParams.mo48235p(new String[0]);
            } else {
                image2 = imageRefWithPartialParams.mo48235p(b);
            }
            sparseArray.put(1675, image2);
            return;
        }
        ImageRefWithPartialParams imageRefWithPartialParams2 = new ImageRefWithPartialParams(new ResourceImageRef(C19745w.scaled_bus_stop), new String[]{str, "0.75"});
        if (b == null) {
            image = imageRefWithPartialParams2.mo48235p(new String[0]);
        } else {
            image = imageRefWithPartialParams2.mo48235p(b);
        }
        sparseArray.put(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, image);
        sparseArray.put(1600, image3);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C16283a aVar2 = (C16283a) aVar;
        List<MapItem> q = m41531q(aVar2.f42554v, (MVMapItemsResponse) tBase);
        this.f42557m = q;
        aVar2.f42556x.mo52128i(aVar2.f51759b, aVar2.f42554v, aVar2.f42555w, q);
    }

    public C16284b(Collection<MapItem> collection) {
        super(MVMapItemsResponse.class);
        this.f42557m = new ArrayList(collection);
    }
}
