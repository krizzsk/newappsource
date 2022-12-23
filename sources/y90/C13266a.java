package y90;

import android.content.Context;
import android.content.pm.PackageInfo;
import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import c00.C13733n;
import com.tranzmate.moovit.protocol.datacollection.MVApplicationInfo;
import com.tranzmate.moovit.protocol.datacollection.MVApplicationInfos;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import f00.C16919g;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.apache.thrift.TBase;
import p401bz.C13709c;
import p401bz.C13712f;
import p824tp.C19731i;

/* renamed from: y90.a */
public final class C13266a extends C13712f {

    /* renamed from: c */
    public static final long f32918c = TimeUnit.DAYS.toMillis(7);

    /* renamed from: d */
    public static final C16919g.C16925f f32919d = new C16919g.C16925f("last_updated", -1);

    /* renamed from: e */
    public static final C13267a f32920e = new C13267a();

    /* renamed from: y90.a$a */
    public class C13267a implements C13733n<PackageInfo, MVApplicationInfo> {
        public final Object convert(Object obj) throws Exception {
            PackageInfo packageInfo = (PackageInfo) obj;
            String str = packageInfo.packageName;
            String str2 = packageInfo.versionName;
            boolean z = true;
            if ((packageInfo.applicationInfo.flags & 1) == 0) {
                z = false;
            }
            MVApplicationInfo mVApplicationInfo = new MVApplicationInfo();
            mVApplicationInfo.packageName = str;
            mVApplicationInfo.versionName = str2;
            mVApplicationInfo.isSystemApp = z;
            mVApplicationInfo.mo26984i();
            return mVApplicationInfo;
        }
    }

    public C13266a(Context context) {
        super(context);
    }

    /* renamed from: e */
    public static void m33390e(Context context) {
        if (C13709c.m34226b(context) != null) {
            C19731i.m47197a(context).f50172b.mo42913b(new C13266a(context), false);
            f32919d.mo49545d(context.getSharedPreferences("app_infos", 0), Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* renamed from: a */
    public final TBase mo21426a() {
        Context context = this.f33791b;
        ArrayList<O> c = C13720d.m34273c(C13723g.m34282c(context.getPackageManager().getInstalledPackages(0), new C13268b(context.getPackageName())), (C13722f) null, f32920e);
        MVApplicationInfos mVApplicationInfos = new MVApplicationInfos();
        mVApplicationInfos.applicationInfos = c;
        mVApplicationInfos.timestamp = System.currentTimeMillis();
        mVApplicationInfos.mo26991h();
        MVServerMessage mVServerMessage = new MVServerMessage();
        mVServerMessage.setField_ = MVServerMessage._Fields.APPLICATION_INFOS;
        mVServerMessage.value_ = mVApplicationInfos;
        return mVServerMessage;
    }
}
