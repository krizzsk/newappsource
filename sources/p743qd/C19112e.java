package p743qd;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.FirebaseException;

@KeepForSdk
/* renamed from: qd.e */
public final class C19112e implements StatusExceptionMapper {
    public final Exception getException(Status status) {
        if (status.getStatusCode() == 8) {
            return new FirebaseException(status.zza());
        }
        return new FirebaseApiNotAvailableException(status.zza());
    }
}
