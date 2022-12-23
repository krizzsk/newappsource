package com.google.android.gms.awareness.fence;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.contextmanager.zzbm;
import java.util.Collection;

public abstract class FenceQueryRequest extends AbstractSafeParcelable {
    public static FenceQueryRequest all() {
        return new zzbm();
    }

    public static FenceQueryRequest forFences(Collection<String> collection) {
        Preconditions.checkNotNull(collection);
        for (String checkNotEmpty : collection) {
            Preconditions.checkNotEmpty(checkNotEmpty);
        }
        return new zzbm(collection);
    }

    public static FenceQueryRequest forFences(String... strArr) {
        Preconditions.checkNotNull(strArr);
        for (String checkNotEmpty : strArr) {
            Preconditions.checkNotEmpty(checkNotEmpty);
        }
        return new zzbm(strArr);
    }
}
