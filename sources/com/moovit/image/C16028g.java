package com.moovit.image;

import a20.C13388b;
import android.graphics.PointF;
import android.util.SparseArray;
import com.moovit.image.glide.data.ImageData;
import com.moovit.image.model.Image;
import com.moovit.image.model.ImageRef;
import com.moovit.image.model.ImageRefWithPartialParams;
import com.moovit.image.model.ImageSet;
import com.moovit.image.model.RemoteImageRef;
import com.moovit.image.model.ResourceImageRef;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.common.MVImage;
import com.tranzmate.moovit.protocol.common.MVImageReferenceSet;
import com.tranzmate.moovit.protocol.common.MVImageReferenceSetEntry;
import com.tranzmate.moovit.protocol.common.MVImageReferenceSetWithParams;
import com.tranzmate.moovit.protocol.common.MVImageReferenceSetWithParamsEntry;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithPartialParams;
import com.tranzmate.moovit.protocol.common.MVImageType;
import com.tranzmate.moovit.protocol.common.MVPointDouble;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import mf0.C24361g;
import ui0.C25082a;

/* renamed from: com.moovit.image.g */
public final class C16028g {

    /* renamed from: com.moovit.image.g$a */
    public static /* synthetic */ class C16029a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41737a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tranzmate.moovit.protocol.common.MVImageType[] r0 = com.tranzmate.moovit.protocol.common.MVImageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f41737a = r0
                com.tranzmate.moovit.protocol.common.MVImageType r1 = com.tranzmate.moovit.protocol.common.MVImageType.PNG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f41737a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.common.MVImageType r1 = com.tranzmate.moovit.protocol.common.MVImageType.MVF     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f41737a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.common.MVImageType r1 = com.tranzmate.moovit.protocol.common.MVImageType.NINE_PATCH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.image.C16028g.C16029a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static Image m40823a(Integer num) {
        if (num.intValue() == 0) {
            return null;
        }
        return m40826d(num).mo48235p(new String[0]);
    }

    /* renamed from: b */
    public static ImageData m40824b(MVImage mVImage) {
        byte[] bArr;
        PointF pointF = null;
        if (mVImage == null) {
            return null;
        }
        ServerId serverId = new ServerId(mVImage.imageId);
        ImageData.Format c = m40825c(mVImage.imageType);
        ByteBuffer n = C25082a.m62850n(mVImage.imageData);
        mVImage.imageData = n;
        if (n == null) {
            bArr = null;
        } else {
            bArr = n.array();
        }
        MVPointDouble mVPointDouble = mVImage.anchor;
        if (mVPointDouble != null) {
            pointF = new PointF((float) mVPointDouble.f25107x, (float) mVPointDouble.f25108y);
        }
        return new ImageData(serverId, c, bArr, pointF);
    }

    /* renamed from: c */
    public static ImageData.Format m40825c(MVImageType mVImageType) {
        int i = C16029a.f41737a[mVImageType.ordinal()];
        if (i == 1) {
            return ImageData.Format.BUILT_IN;
        }
        if (i == 2) {
            return ImageData.Format.MVF;
        }
        if (i == 3) {
            return ImageData.Format.NINE_PATCH;
        }
        throw new IllegalArgumentException("Unknown image type: " + mVImageType);
    }

    /* renamed from: d */
    public static ImageRef m40826d(Integer num) {
        boolean z;
        if (num.intValue() == 0) {
            return null;
        }
        if (num.intValue() < 0) {
            z = true;
        } else {
            z = false;
        }
        int intValue = num.intValue();
        if (z) {
            return new ResourceImageRef(C16019d.m40803a().f41722h.mo53030d(Integer.valueOf(intValue)));
        }
        return new RemoteImageRef(new ServerId(intValue));
    }

    /* renamed from: e */
    public static C13388b m40827e(MVImageReferenceSet mVImageReferenceSet) {
        List<MVImageReferenceSetEntry> list = mVImageReferenceSet.images;
        SparseArray sparseArray = new SparseArray(list.size());
        for (MVImageReferenceSetEntry next : list) {
            sparseArray.append(next.index, m40826d(Integer.valueOf(next.imageRef)));
        }
        return new C13388b(sparseArray, true);
    }

    /* renamed from: f */
    public static ImageSet m40828f(MVImageReferenceSetWithParams mVImageReferenceSetWithParams) {
        List<MVImageReferenceSetWithParamsEntry> list = mVImageReferenceSetWithParams.images;
        SparseArray sparseArray = new SparseArray(list.size());
        for (MVImageReferenceSetWithParamsEntry next : list) {
            sparseArray.append(next.index * 1, m40829g(next.imageRef));
        }
        return new ImageSet(sparseArray, true);
    }

    /* renamed from: g */
    public static Image m40829g(MVImageReferenceWithParams mVImageReferenceWithParams) {
        if (mVImageReferenceWithParams == null) {
            return null;
        }
        List<String> list = mVImageReferenceWithParams.parameters;
        if (list == null) {
            list = Collections.emptyList();
        }
        return m40832j(mVImageReferenceWithParams.imageId, C24361g.m61182q0(list));
    }

    /* renamed from: h */
    public static ImageRefWithPartialParams m40830h(MVImageReferenceWithPartialParams mVImageReferenceWithPartialParams) {
        if (mVImageReferenceWithPartialParams == null) {
            return null;
        }
        List<String> list = mVImageReferenceWithPartialParams.params;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new ImageRefWithPartialParams(m40826d(Integer.valueOf(mVImageReferenceWithPartialParams.imageId)), C24361g.m61182q0(list));
    }

    /* renamed from: i */
    public static int m40831i(int i) {
        return C16019d.m40803a().f41722h.mo53029c(i).intValue();
    }

    /* renamed from: j */
    public static Image m40832j(int i, String... strArr) {
        ImageRef d = m40826d(Integer.valueOf(i));
        if (d != null) {
            return d.mo48235p(strArr);
        }
        return null;
    }
}
