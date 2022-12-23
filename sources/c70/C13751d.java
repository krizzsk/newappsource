package c70;

import android.content.Context;
import ce0.C21100e;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.request.UserRequestError;
import com.usebutton.sdk.internal.api.AppActionRequest;
import k00.C17988b;
import p824tp.C19739q;
import p824tp.C19746x;
import p906wz.C20434f;
import z00.C20795a;

/* renamed from: c70.d */
public final class C13751d extends C20434f {

    /* renamed from: b */
    public static final /* synthetic */ int f33851b = 0;

    /* renamed from: a */
    public static C20795a m34340a(Exception exc, Context context) {
        String str;
        String str2;
        if (exc instanceof UserRequestError) {
            UserRequestError userRequestError = (UserRequestError) exc;
            str2 = userRequestError.mo49162d();
            str = userRequestError.mo49161c();
        } else {
            str2 = context.getString(C19746x.general_error_title);
            str = context.getString(C19746x.general_error_description);
        }
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        return new C20795a(C17988b.m44611b(C19739q.img_empty_warning, context), str2, str);
    }

    /* renamed from: b */
    public static AlertDialogFragment m34341b(Context context, String str, Exception exc) {
        return m34342c(context, str, exc).mo47673b();
    }

    /* renamed from: c */
    public static AlertDialogFragment.C15856a m34342c(Context context, String str, Exception exc) {
        int i;
        String str2;
        String str3;
        if (exc instanceof UserRequestError) {
            UserRequestError userRequestError = (UserRequestError) exc;
            str3 = userRequestError.mo49162d();
            str2 = userRequestError.mo49161c();
            i = userRequestError.mo49160b();
        } else {
            str3 = context.getString(C19746x.general_error_title);
            str2 = context.getString(C19746x.general_error_description);
            i = -1;
        }
        AlertDialogFragment.C15856a k = new AlertDialogFragment.C15856a(context).mo47682k(str);
        k.mo47676e(C19739q.img_empty_warning, false);
        AlertDialogFragment.C15856a j = k.mo47684m(str3).mo47679h(str2).mo47681j(C19746x.std_positive_button);
        j.f41328b.putInt("errorCode", i);
        j.mo47674c(true);
        return j;
    }

    /* renamed from: d */
    public static int m34343d(Exception exc) {
        if (exc instanceof UserRequestError) {
            return ((UserRequestError) exc).mo49160b();
        }
        return -1;
    }
}
