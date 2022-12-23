package com.moovit.app.ads.mapitem;

import com.appboy.models.outgoing.FacebookUser;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.image.model.ImageRefWithPartialParams;
import com.moovit.map.collections.category.types.DirectAdMetadata;
import com.tranzmate.moovit.protocol.mapitems.MVCategory;
import com.tranzmate.moovit.protocol.mapitems.MVCategoryItem;
import ff0.C23349c;
import mf0.C24362h;
import p20.C18879f;
import q20.C19075a;
import wh0.C25177g;

/* renamed from: com.moovit.app.ads.mapitem.a */
public final class C14751a extends C18879f<C14751a, C19075a<DirectAdMetadata>> {

    /* renamed from: com.moovit.app.ads.mapitem.a$a */
    public /* synthetic */ class C14752a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37558a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.tranzmate.moovit.protocol.mapitems.MVDirectAdOperator[] r0 = com.tranzmate.moovit.protocol.mapitems.MVDirectAdOperator.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.tranzmate.moovit.protocol.mapitems.MVDirectAdOperator r1 = com.tranzmate.moovit.protocol.mapitems.MVDirectAdOperator.IS_ANY_OF     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.tranzmate.moovit.protocol.mapitems.MVDirectAdOperator r1 = com.tranzmate.moovit.protocol.mapitems.MVDirectAdOperator.IS_NONE_OF     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f37558a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.ads.mapitem.C14751a.C14752a.<clinit>():void");
        }
    }

    /* renamed from: f */
    public final C19075a mo44755f(LatLonE6 latLonE6, ImageRefWithPartialParams imageRefWithPartialParams, ImageRefWithPartialParams imageRefWithPartialParams2, MVCategory mVCategory, MVCategoryItem mVCategoryItem) {
        C24362h.m61211f(latLonE6, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        C24362h.m61211f(imageRefWithPartialParams, "imageRef");
        return (C19075a) C25177g.m63220d(new AdMapItemResponse$createMapItem$1(mVCategoryItem, this, mVCategory, latLonE6, imageRefWithPartialParams, imageRefWithPartialParams2, (C23349c<? super AdMapItemResponse$createMapItem$1>) null));
    }
}
