package p627lg;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Map;

@KeepForSdk
/* renamed from: lg.e */
public abstract class C18206e<K, V> {
    private final Map zza = new HashMap();

    @KeepForSdk
    public abstract V create(K k);

    @KeepForSdk
    public V get(K k) {
        synchronized (this.zza) {
            if (this.zza.containsKey(k)) {
                V v = this.zza.get(k);
                return v;
            }
            V create = create(k);
            this.zza.put(k, create);
            return create;
        }
    }
}
