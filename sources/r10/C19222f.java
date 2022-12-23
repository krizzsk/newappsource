package r10;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import p060d6.C4385f;

/* renamed from: r10.f */
public final class C19222f extends C4385f {
    /* renamed from: a */
    public final boolean mo19902a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo19903b() {
        return true;
    }

    /* renamed from: c */
    public final boolean mo19904c(DataSource dataSource) {
        return dataSource == DataSource.REMOTE;
    }

    /* renamed from: d */
    public final boolean mo19905d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
        return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE || encodeStrategy != EncodeStrategy.TRANSFORMED) ? false : true;
    }
}
