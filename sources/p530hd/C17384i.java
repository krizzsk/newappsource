package p530hd;

import android.content.Context;
import android.os.Process;

/* renamed from: hd.i */
public final class C17384i {

    /* renamed from: a */
    public static final /* synthetic */ int f44775a = 0;

    static {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String sb2 = sb.toString();
        if ("SplitInstallInfoProvider".length() != 0) {
            sb2.concat("SplitInstallInfoProvider");
        } else {
            new String(sb2);
        }
    }

    public C17384i(Context context) {
        context.getPackageName();
    }
}
