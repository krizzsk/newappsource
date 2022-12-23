package androidx.paging;

import androidx.paging.DataSource;
import androidx.paging.PagingSource;
import bf0.C21050d;
import ff0.C23349c;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.C24199d;
import kotlinx.coroutines.CoroutineDispatcher;
import lf0.C24225a;
import mf0.C24362h;
import p178n2.C5820d;
import p178n2.C5822f;
import p178n2.C5823g;
import wh0.C25177g;

public final class LegacyPagingSource<Key, Value> extends PagingSource<Key, Value> {

    /* renamed from: b */
    public final CoroutineDispatcher f4115b;

    /* renamed from: c */
    public final DataSource<Key, Value> f4116c;

    /* renamed from: d */
    public int f4117d = Integer.MIN_VALUE;

    public LegacyPagingSource(C24199d dVar, DataSource dataSource) {
        C24362h.m61211f(dVar, "fetchDispatcher");
        this.f4115b = dVar;
        this.f4116c = dataSource;
        dataSource.f4103a.mo21691b(new C5822f(this));
        this.f4148a.mo21691b(new C24225a<C21050d>(this) {
            public final /* synthetic */ LegacyPagingSource<Object, Object> this$0;

            {
                this.this$0 = r1;
            }

            /* JADX INFO: finally extract failed */
            public final Object invoke() {
                LegacyPagingSource<Object, Object> legacyPagingSource = this.this$0;
                DataSource<Key, Value> dataSource = legacyPagingSource.f4116c;
                C5823g gVar = new C5823g(legacyPagingSource);
                dataSource.getClass();
                C5820d<DataSource.C1085b> dVar = dataSource.f4103a;
                ReentrantLock reentrantLock = dVar.f18782c;
                reentrantLock.lock();
                try {
                    dVar.f18783d.remove(gVar);
                    reentrantLock.unlock();
                    this.this$0.f4116c.f4103a.mo21690a();
                    return C21050d.f52856a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
        });
    }

    /* renamed from: a */
    public final Object mo4402a(PagingSource.C1096a<Key> aVar, C23349c<? super PagingSource.C1100b<Key, Value>> cVar) {
        LoadType loadType;
        int i;
        boolean z = aVar instanceof PagingSource.C1096a.C1099c;
        if (z) {
            loadType = LoadType.REFRESH;
        } else if (aVar instanceof PagingSource.C1096a.C1097a) {
            loadType = LoadType.APPEND;
        } else if (aVar instanceof PagingSource.C1096a.C1098b) {
            loadType = LoadType.PREPEND;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        LoadType loadType2 = loadType;
        if (this.f4117d == Integer.MIN_VALUE) {
            System.out.println("WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106");
            if (z) {
                int i2 = aVar.f4149a;
                if (i2 % 3 == 0) {
                    i = i2 / 3;
                    this.f4117d = i;
                }
            }
            i = aVar.f4149a;
            this.f4117d = i;
        }
        return C25177g.m63221e(this.f4115b, new LegacyPagingSource$load$2(this, new DataSource.C1086c(loadType2, aVar.mo4420a(), aVar.f4149a, aVar.f4150b, this.f4117d), aVar, (C23349c<? super LegacyPagingSource$load$2>) null), cVar);
    }
}
