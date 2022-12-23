package p060d6;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* renamed from: d6.f */
public abstract class C4385f {

    /* renamed from: a */
    public static final C4386a f15420a = new C4386a();

    /* renamed from: b */
    public static final C4387b f15421b = new C4387b();

    /* renamed from: c */
    public static final C4388c f15422c = new C4388c();

    /* renamed from: d */
    public static final C4389d f15423d = new C4389d();

    /* renamed from: e */
    public static final C4390e f15424e = new C4390e();

    /* renamed from: d6.f$a */
    public class C4386a extends C4385f {
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
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: d6.f$b */
    public class C4387b extends C4385f {
        /* renamed from: a */
        public final boolean mo19902a() {
            return false;
        }

        /* renamed from: b */
        public final boolean mo19903b() {
            return false;
        }

        /* renamed from: c */
        public final boolean mo19904c(DataSource dataSource) {
            return false;
        }

        /* renamed from: d */
        public final boolean mo19905d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* renamed from: d6.f$c */
    public class C4388c extends C4385f {
        /* renamed from: a */
        public final boolean mo19902a() {
            return true;
        }

        /* renamed from: b */
        public final boolean mo19903b() {
            return false;
        }

        /* renamed from: c */
        public final boolean mo19904c(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        /* renamed from: d */
        public final boolean mo19905d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* renamed from: d6.f$d */
    public class C4389d extends C4385f {
        /* renamed from: a */
        public final boolean mo19902a() {
            return false;
        }

        /* renamed from: b */
        public final boolean mo19903b() {
            return true;
        }

        /* renamed from: c */
        public final boolean mo19904c(DataSource dataSource) {
            return false;
        }

        /* renamed from: d */
        public final boolean mo19905d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: d6.f$e */
    public class C4390e extends C4385f {
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
            return ((z && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo19902a();

    /* renamed from: b */
    public abstract boolean mo19903b();

    /* renamed from: c */
    public abstract boolean mo19904c(DataSource dataSource);

    /* renamed from: d */
    public abstract boolean mo19905d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);
}
