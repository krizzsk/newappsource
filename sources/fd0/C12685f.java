package fd0;

import com.veriff.sdk.camera.core.impl.Config;
import com.veriff.sdk.camera.core.impl.MutableOptionsBundle;
import com.veriff.sdk.camera.core.impl.OptionsBundle;

/* renamed from: fd0.f */
public final /* synthetic */ class C12685f {
    /* renamed from: a */
    public static boolean m32408a(Config.OptionPriority optionPriority, Config.OptionPriority optionPriority2) {
        Config.OptionPriority optionPriority3 = Config.OptionPriority.ALWAYS_OVERRIDE;
        if (optionPriority == optionPriority3 && optionPriority2 == optionPriority3) {
            return true;
        }
        Config.OptionPriority optionPriority4 = Config.OptionPriority.REQUIRED;
        if (optionPriority == optionPriority4 && optionPriority2 == optionPriority4) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static Config m32409b(Config config, Config config2) {
        MutableOptionsBundle mutableOptionsBundle;
        if (config == null && config2 == null) {
            return OptionsBundle.emptyBundle();
        }
        if (config2 != null) {
            mutableOptionsBundle = MutableOptionsBundle.from(config2);
        } else {
            mutableOptionsBundle = MutableOptionsBundle.create();
        }
        if (config != null) {
            for (Config.Option next : config.listOptions()) {
                mutableOptionsBundle.insertOption(next, config.getOptionPriority(next), config.retrieveOption(next));
            }
        }
        return OptionsBundle.from(mutableOptionsBundle);
    }
}
