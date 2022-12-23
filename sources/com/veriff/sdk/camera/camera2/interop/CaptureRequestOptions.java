package com.veriff.sdk.camera.camera2.interop;

import com.veriff.sdk.camera.core.ExtendableBuilder;
import com.veriff.sdk.camera.core.impl.Config;
import com.veriff.sdk.camera.core.impl.MutableConfig;
import com.veriff.sdk.camera.core.impl.MutableOptionsBundle;
import com.veriff.sdk.camera.core.impl.OptionsBundle;
import com.veriff.sdk.camera.core.impl.ReadableConfig;
import fd0.C12690k;
import java.util.Set;
import p783rw.C19372d;

public class CaptureRequestOptions implements ReadableConfig {
    private final Config mConfig;

    public static final class Builder implements ExtendableBuilder<CaptureRequestOptions> {
        private final MutableOptionsBundle mMutableOptionsBundle = MutableOptionsBundle.create();

        public static Builder from(Config config) {
            Builder builder = new Builder();
            config.findOptions("camera2.captureRequest.option.", new C19372d(5, builder, config));
            return builder;
        }

        public CaptureRequestOptions build() {
            return new CaptureRequestOptions(OptionsBundle.from(this.mMutableOptionsBundle));
        }

        public MutableConfig getMutableConfig() {
            return this.mMutableOptionsBundle;
        }
    }

    public CaptureRequestOptions(Config config) {
        this.mConfig = config;
    }

    public final /* synthetic */ boolean containsOption(Config.Option option) {
        return C12690k.m32418a(this, option);
    }

    public final /* synthetic */ void findOptions(String str, Config.OptionMatcher optionMatcher) {
        C12690k.m32419b(this, str, optionMatcher);
    }

    public Config getConfig() {
        return this.mConfig;
    }

    public final /* synthetic */ Config.OptionPriority getOptionPriority(Config.Option option) {
        return C12690k.m32420c(this, option);
    }

    public final /* synthetic */ Set getPriorities(Config.Option option) {
        return C12690k.m32421d(this, option);
    }

    public final /* synthetic */ Set listOptions() {
        return C12690k.m32422e(this);
    }

    public final /* synthetic */ Object retrieveOption(Config.Option option) {
        return C12690k.m32423f(this, option);
    }

    public final /* synthetic */ Object retrieveOption(Config.Option option, Object obj) {
        return C12690k.m32424g(this, option, obj);
    }

    public final /* synthetic */ Object retrieveOptionWithPriority(Config.Option option, Config.OptionPriority optionPriority) {
        return C12690k.m32425h(this, option, optionPriority);
    }
}
