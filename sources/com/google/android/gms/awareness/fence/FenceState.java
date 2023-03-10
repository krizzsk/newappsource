package com.google.android.gms.awareness.fence;

import android.content.Intent;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.internal.contextmanager.zzaw;
import com.google.android.gms.internal.contextmanager.zzbo;

public abstract class FenceState extends AbstractSafeParcelable {
    public static final int FALSE = 1;
    public static final int TRUE = 2;
    public static final int UNKNOWN = 0;

    public static FenceState extract(Intent intent) {
        return new zzbo(intent.getIntExtra("context_fence_current_state", 0), intent.getLongExtra("context_fence_last_updated_time", 0), intent.getStringExtra("context_fence_key"), intent.getIntExtra("context_fence_previous_state", 0), SafeParcelableSerializer.deserializeIterableFromIntentExtra(intent, "context_data_list", zzaw.CREATOR));
    }

    public abstract int getCurrentState();

    public abstract String getFenceKey();

    public abstract long getLastFenceUpdateTimeMillis();

    public abstract int getPreviousState();
}
