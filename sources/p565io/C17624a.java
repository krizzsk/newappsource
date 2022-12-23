package p565io;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.masabi.justride.sdk.exception.MissingArgumentException;
import p605ki.C18047b;

/* renamed from: io.a */
public abstract class C17624a extends Fragment {

    /* renamed from: b */
    public C18047b f45307b;

    /* renamed from: H1 */
    public static Bundle m43768H1(C18047b bVar) {
        Bundle bundle = new Bundle();
        bundle.putString("KEY_SDK_INSTANCE_IDENTIFIER", bVar.mo50524c());
        return bundle;
    }

    /* renamed from: I1 */
    public final <T extends View> T mo50081I1(int i) {
        return getView().findViewById(i);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            String string = getArguments().getString("KEY_SDK_INSTANCE_IDENTIFIER");
            if (string != null) {
                C18047b.f46173p.getClass();
                this.f45307b = C18047b.C18048a.m44717a(string);
                return;
            }
            throw new MissingArgumentException("Cannot load Fragment without a Justride SDK instance identifier");
        }
        throw new MissingArgumentException("Cannot load Fragment with null arguments");
    }
}
