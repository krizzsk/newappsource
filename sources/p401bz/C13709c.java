package p401bz;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.play.core.assetpacks.C14343z0;
import com.moovit.aws.kinesis.KinesisStreamRecorder;
import f00.C16919g;
import p824tp.C19722a0;
import p824tp.C19731i;
import p977zz.C20975x0;

/* renamed from: bz.c */
public final class C13709c {

    /* renamed from: a */
    public static final C16919g.C16928i f33784a = new C16919g.C16928i("partition_key", (String) null);

    /* renamed from: b */
    public static final C16919g.C16925f f33785b = new C16919g.C16925f("conf_version", -1);

    /* renamed from: a */
    public static void m34225a(Context context, C19722a0 a0Var) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("kinesis_constants", 0);
        C16919g.C16928i iVar = f33784a;
        String e = iVar.mo19759a(sharedPreferences);
        String str = a0Var.f50160a.f32925a;
        if (!C20975x0.m49118e(e, str)) {
            iVar.mo49545d(sharedPreferences, str);
            C14343z0 z0Var = C19731i.m47197a(context).f50172b;
            synchronized (z0Var) {
                Object obj = z0Var.f36141c;
                if (((KinesisStreamRecorder) obj) != null) {
                    KinesisStreamRecorder kinesisStreamRecorder = (KinesisStreamRecorder) obj;
                    kinesisStreamRecorder.mo46744b();
                    z0Var.f36141c = z0Var.mo42912a(kinesisStreamRecorder);
                }
            }
        }
    }

    /* renamed from: b */
    public static String m34226b(Context context) {
        return f33784a.mo19759a(context.getSharedPreferences("kinesis_constants", 0));
    }
}
