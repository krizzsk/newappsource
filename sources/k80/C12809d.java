package k80;

import android.content.Context;
import c00.C13717b;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.database.DbEntityRef;
import com.moovit.home.lines.search.SearchLineItem;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitAgency;
import com.tranzmate.moovit.protocol.twitterservicealerts.MVGetMetroTwitterFeedsResponse;
import com.tranzmate.moovit.protocol.twitterservicealerts.MVTwitterFeed;
import com.tranzmate.moovit.protocol.twitterservicealerts.MVTwitterFeedType;
import j80.C12786g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import org.apache.thrift.TBase;
import p824tp.C19728f;
import p824tp.C19731i;

/* renamed from: k80.d */
public final class C12809d extends C13780t<C12808c, C12809d, MVGetMetroTwitterFeedsResponse> {

    /* renamed from: m */
    public C12786g f31674m;

    /* renamed from: k80.d$a */
    public static /* synthetic */ class C12810a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31675a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tranzmate.moovit.protocol.twitterservicealerts.MVTwitterFeedType[] r0 = com.tranzmate.moovit.protocol.twitterservicealerts.MVTwitterFeedType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31675a = r0
                com.tranzmate.moovit.protocol.twitterservicealerts.MVTwitterFeedType r1 = com.tranzmate.moovit.protocol.twitterservicealerts.MVTwitterFeedType.AGENCY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31675a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.twitterservicealerts.MVTwitterFeedType r1 = com.tranzmate.moovit.protocol.twitterservicealerts.MVTwitterFeedType.LINE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k80.C12809d.C12810a.<clinit>():void");
        }
    }

    public C12809d() {
        super(MVGetMetroTwitterFeedsResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        SearchLineItem searchLineItem;
        C12808c cVar = (C12808c) aVar;
        List<MVTwitterFeed> list = ((MVGetMetroTwitterFeedsResponse) tBase).feeds;
        if (C13717b.m34258e(list)) {
            this.f31674m = C12786g.m32590a();
            return;
        }
        Context context = cVar.f51759b;
        C19728f fVar = cVar.f31673v;
        HashSet hashSet = new HashSet();
        for (MVTwitterFeed next : list) {
            if (next.feedType == MVTwitterFeedType.LINE) {
                hashSet.add(new ServerId(next.refId));
            }
        }
        C19731i a = C19731i.m47197a(context);
        a.getClass();
        HashMap j = a.mo52085c(fVar.f50165a).mo51805g().mo52130j(context, hashSet);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashMap hashMap = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        CollectionHashMap.ArrayListHashMap arrayListHashMap = new CollectionHashMap.ArrayListHashMap();
        HashMap hashMap2 = new HashMap();
        for (MVTwitterFeed next2 : list) {
            ServerId serverId = new ServerId(next2.refId);
            String str = next2.handle;
            int i = C12810a.f31675a[next2.feedType.ordinal()];
            if (i == 1) {
                linkedHashSet.add(serverId);
                hashMap.put(serverId, str);
            } else if (i == 2 && (searchLineItem = (SearchLineItem) j.get(serverId)) != null) {
                DbEntityRef<TransitAgency> dbEntityRef = searchLineItem.f41640e;
                if (dbEntityRef != null) {
                    linkedHashSet2.add(dbEntityRef.getServerId());
                    arrayListHashMap.mo47001a(dbEntityRef.getServerId(), serverId);
                }
                hashMap2.put(serverId, str);
            }
        }
        this.f31674m = new C12786g(new ArrayList(linkedHashSet), hashMap, new ArrayList(linkedHashSet2), arrayListHashMap, hashMap2, j);
    }
}
