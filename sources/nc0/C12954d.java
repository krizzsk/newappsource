package nc0;

import ac0.C7557a;
import android.content.Context;
import com.google.android.play.core.appupdate.C14226d;
import com.umo.ads.p343d.zzb;
import java.io.EOFException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import kotlin.collections.C23825c;
import kotlin.text.C24179b;
import lf0.C24236l;
import mf0.C24362h;
import p026b7.C1502g;
import p584jl.C17885a;
import uh0.C25080g;

/* renamed from: nc0.d */
public final class C12954d {

    /* renamed from: nc0.d$a */
    public /* synthetic */ class C12955a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32093a;

        static {
            int[] iArr = new int[C17885a.m44417O0(4).length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[3] = 4;
            f32093a = iArr;
        }
    }

    /* renamed from: a */
    public static String m32798a(ArrayList arrayList) {
        boolean z = true;
        if (arrayList == null || !(!arrayList.isEmpty())) {
            z = false;
        }
        if (!z) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(" (SpotId(s): [");
        C24362h.m61208c(arrayList);
        return C14226d.m35344K0(sb, C23825c.m58520q0(arrayList, ", ", (String) null, (String) null, (C24236l) null, 62));
    }

    /* renamed from: b */
    public static void m32799b(Context context, int i, Throwable th) {
        String str;
        if (th == null) {
            str = null;
        } else {
            str = th.getMessage();
        }
        if (!(th instanceof zzb)) {
            int i2 = -1;
            if (th instanceof ConnectException) {
                if (i != 0) {
                    int[] iArr = C12955a.f32093a;
                    if (i != 0) {
                        i2 = iArr[i - 1];
                    } else {
                        throw null;
                    }
                }
                if (i2 == 1) {
                    str = context.getString(C1502g.umoak_hosted_config_connection_failed);
                    C24362h.m61210e(str, "context.getString(\n     …tion_failed\n            )");
                } else if (i2 == 2) {
                    str = context.getString(C1502g.umoak_ad_server_connection_failed);
                    C24362h.m61210e(str, "context.getString(R.stri…server_connection_failed)");
                } else if (i2 == 3) {
                    str = context.getString(C1502g.umoak_beacon_server_connection_failed);
                    C24362h.m61210e(str, "context.getString(R.stri…server_connection_failed)");
                } else if (i2 == 4) {
                    str = context.getString(C1502g.umoak_placeholder_server_connection_failed);
                    C24362h.m61210e(str, "context.getString(R.stri…server_connection_failed)");
                }
            } else if (th instanceof SocketTimeoutException) {
                if (i != 0) {
                    int[] iArr2 = C12955a.f32093a;
                    if (i != 0) {
                        i2 = iArr2[i - 1];
                    } else {
                        throw null;
                    }
                }
                if (i2 == 1) {
                    str = context.getString(C1502g.umoak_hosted_config_connection_timed_out);
                    C24362h.m61210e(str, "context.getString(R.stri…fig_connection_timed_out)");
                } else if (i2 == 2) {
                    str = context.getString(C1502g.umoak_ad_server_connection_timed_out);
                    C24362h.m61210e(str, "context.getString(R.stri…ver_connection_timed_out)");
                } else if (i2 == 3) {
                    str = context.getString(C1502g.umoak_beacon_server_connection_timed_out);
                    C24362h.m61210e(str, "context.getString(R.stri…ver_connection_timed_out)");
                } else if (i2 == 4) {
                    str = context.getString(C1502g.umoak_placeholder_server_connection_timed_out);
                    C24362h.m61210e(str, "context.getString(R.stri…ver_connection_timed_out)");
                }
            } else if (th instanceof ProtocolException) {
                if (str != null) {
                    String string = context.getString(C1502g.umoak_http_error_too_many_follow_ups);
                    C24362h.m61210e(string, "context.getString(R.stri…rror_too_many_follow_ups)");
                    if (C24179b.m60559G(str, string, false)) {
                        str = context.getString(C1502g.umoak_unauthorized_service_access);
                    }
                }
            } else if ((th instanceof EOFException) && m32800c("-1") && !C24362h.m61206a("-1", "-1")) {
                str = "-1";
            }
            str = "";
        }
        C7557a.f23040a.mo6667d(str);
    }

    /* renamed from: c */
    public static final boolean m32800c(String str) {
        String obj = str == null ? null : C24179b.m60585g0(str).toString();
        return !(obj == null || obj.length() == 0);
    }

    /* renamed from: d */
    public static int m32801d(String str) {
        C24362h.m61211f(str, "<this>");
        Integer y = C25080g.m62829y(str);
        if (y != null) {
            return y.intValue();
        }
        Float x = C25080g.m62828x(str);
        if (x == null) {
            return -1;
        }
        return (int) x.floatValue();
    }
}
