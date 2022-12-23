package com.google.android.gms.awareness.state;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.contextmanager.zzo;
import java.util.List;

public interface BeaconState {

    public interface BeaconInfo {
        byte[] getContent();

        String getNamespace();

        String getType();
    }

    public static abstract class TypeFilter extends AbstractSafeParcelable {
        public static TypeFilter with(String str, String str2) {
            return new zzo(str, str2);
        }

        public static TypeFilter with(String str, String str2, byte[] bArr) {
            return new zzo(str, str2, bArr);
        }
    }

    List<BeaconInfo> getBeaconInfo();
}
