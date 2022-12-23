package p20;

import c00.C13717b;
import c70.C13749c;
import c70.C13772m;
import c70.C13779s;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.image.C16028g;
import com.moovit.image.model.ImageRefWithPartialParams;
import com.tranzmate.moovit.protocol.mapitems.MVCategory;
import com.tranzmate.moovit.protocol.mapitems.MVCategoryItem;
import com.tranzmate.moovit.protocol.mapitems.MVMapItemsFile;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.thrift.TBase;
import p20.C18879f;
import p20.C18880g;
import q20.C19075a;

/* renamed from: p20.f */
public abstract class C18879f<RS extends C18879f<RS, MI>, MI extends C18880g> extends C13779s<RS, MVMapItemsFile, Collection<C18877d<MI>>> {

    /* renamed from: h */
    public long f48053h = 0;

    public C18879f() {
        super(MVMapItemsFile.class);
    }

    /* renamed from: d */
    public final void mo40052c(C13772m<RS> mVar, HttpURLConnection httpURLConnection, BufferedInputStream bufferedInputStream) throws IOException, BadResponseException, ServerException {
        long j;
        super.mo40052c(mVar, httpURLConnection, bufferedInputStream);
        String headerField = httpURLConnection.getHeaderField("x-amz-meta-x-refresh-after");
        if (headerField == null) {
            j = -1;
        } else {
            j = TimeUnit.SECONDS.toMillis(Long.parseLong(headerField));
        }
        this.f48053h = j;
    }

    /* renamed from: e */
    public final Object mo23773e(TBase tBase) throws BadResponseException {
        int i;
        int i2;
        ImageRefWithPartialParams imageRefWithPartialParams;
        List<MVCategory> list = ((MVMapItemsFile) tBase).categories;
        if (C13717b.m34258e(list)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (MVCategory next : list) {
            if (next.mo28193l()) {
                i = next.minZoom;
            } else {
                i = 0;
            }
            if (next.mo28192k()) {
                i2 = next.maxZoom;
            } else {
                i2 = 256;
            }
            ImageRefWithPartialParams h = C16028g.m40830h(next.clusteringImage);
            ImageRefWithPartialParams h2 = C16028g.m40830h(next.mapImage);
            if (next.mo28195o()) {
                imageRefWithPartialParams = C16028g.m40830h(next.selectedMapImage);
            } else {
                imageRefWithPartialParams = null;
            }
            ImageRefWithPartialParams imageRefWithPartialParams2 = imageRefWithPartialParams;
            List<MVCategoryItem> list2 = next.items;
            if (!C13717b.m34258e(list2)) {
                ArrayList arrayList2 = new ArrayList(list2.size());
                for (MVCategoryItem next2 : list2) {
                    C19075a f = mo44755f(C13749c.m34322h(next2.location), h2, imageRefWithPartialParams2, next, next2);
                    if (f != null) {
                        arrayList2.add(f);
                    }
                }
                arrayList.add(new C18877d(arrayList2, h, i, i2));
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public abstract C19075a mo44755f(LatLonE6 latLonE6, ImageRefWithPartialParams imageRefWithPartialParams, ImageRefWithPartialParams imageRefWithPartialParams2, MVCategory mVCategory, MVCategoryItem mVCategoryItem);
}
