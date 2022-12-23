package p278v;

import android.content.Context;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.Set;
import p066e0.C4437k;
import p304x.C7083o0;

/* renamed from: v.b */
public final /* synthetic */ class C6815b implements C4437k.C4438a {
    public final C7083o0 newInstance(Context context, Object obj, Set set) {
        try {
            return new C7083o0(context, obj, set);
        } catch (CameraUnavailableException e) {
            throw new InitializationException(e);
        }
    }
}
