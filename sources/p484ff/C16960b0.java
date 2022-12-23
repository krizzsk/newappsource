package p484ff;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: ff.b0 */
public final class C16960b0 {

    /* renamed from: a */
    public final SharedPreferences f44021a;

    /* renamed from: b */
    public final String f44022b;

    /* renamed from: c */
    public final String f44023c;

    /* renamed from: d */
    public final ArrayDeque<String> f44024d = new ArrayDeque<>();

    /* renamed from: e */
    public final Executor f44025e;

    public C16960b0(SharedPreferences sharedPreferences, Executor executor) {
        this.f44021a = sharedPreferences;
        this.f44022b = "topic_operation_queue";
        this.f44023c = AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR;
        this.f44025e = executor;
    }

    /* renamed from: a */
    public static C16960b0 m42798a(SharedPreferences sharedPreferences, Executor executor) {
        C16960b0 b0Var = new C16960b0(sharedPreferences, executor);
        synchronized (b0Var.f44024d) {
            b0Var.f44024d.clear();
            String string = b0Var.f44021a.getString(b0Var.f44022b, "");
            if (!TextUtils.isEmpty(string)) {
                if (string.contains(b0Var.f44023c)) {
                    String[] split = string.split(b0Var.f44023c, -1);
                    int length = split.length;
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            b0Var.f44024d.add(str);
                        }
                    }
                }
            }
        }
        return b0Var;
    }
}
