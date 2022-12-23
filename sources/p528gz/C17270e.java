package p528gz;

import android.content.SharedPreferences;
import com.google.android.gms.tasks.OnSuccessListener;
import p528gz.C17272g;

/* renamed from: gz.e */
public final /* synthetic */ class C17270e implements OnSuccessListener {
    public final void onSuccess(Object obj) {
        SharedPreferences.Editor editor = ((C17272g.C17277e) obj).f44664c;
        if (editor != null) {
            editor.apply();
        }
    }
}
