package android.app.usage;

import android.annotation.Nullable;

public final /* synthetic */ class NetworkStats implements AutoCloseable {

    public /* synthetic */ class Bucket {
        static {
            throw new NoClassDefFoundError();
        }

        public native /* synthetic */ long getRxBytes();

        public native /* synthetic */ int getState();

        public native /* synthetic */ long getTxBytes();
    }

    static {
        throw new NoClassDefFoundError();
    }

    public native /* synthetic */ boolean getNextBucket(@Nullable Bucket bucket);

    public native /* synthetic */ boolean hasNextBucket();
}
