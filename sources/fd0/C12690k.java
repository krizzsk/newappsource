package fd0;

import com.veriff.sdk.camera.core.impl.Config;
import com.veriff.sdk.camera.core.impl.ReadableConfig;
import java.util.Set;

/* renamed from: fd0.k */
public final /* synthetic */ class C12690k {
    /* renamed from: a */
    public static boolean m32418a(ReadableConfig readableConfig, Config.Option option) {
        return readableConfig.getConfig().containsOption(option);
    }

    /* renamed from: b */
    public static void m32419b(ReadableConfig readableConfig, String str, Config.OptionMatcher optionMatcher) {
        readableConfig.getConfig().findOptions(str, optionMatcher);
    }

    /* renamed from: c */
    public static Config.OptionPriority m32420c(ReadableConfig readableConfig, Config.Option option) {
        return readableConfig.getConfig().getOptionPriority(option);
    }

    /* renamed from: d */
    public static Set m32421d(ReadableConfig readableConfig, Config.Option option) {
        return readableConfig.getConfig().getPriorities(option);
    }

    /* renamed from: e */
    public static Set m32422e(ReadableConfig readableConfig) {
        return readableConfig.getConfig().listOptions();
    }

    /* renamed from: f */
    public static Object m32423f(ReadableConfig readableConfig, Config.Option option) {
        return readableConfig.getConfig().retrieveOption(option);
    }

    /* renamed from: g */
    public static Object m32424g(ReadableConfig readableConfig, Config.Option option, Object obj) {
        return readableConfig.getConfig().retrieveOption(option, obj);
    }

    /* renamed from: h */
    public static Object m32425h(ReadableConfig readableConfig, Config.Option option, Config.OptionPriority optionPriority) {
        return readableConfig.getConfig().retrieveOptionWithPriority(option, optionPriority);
    }
}
