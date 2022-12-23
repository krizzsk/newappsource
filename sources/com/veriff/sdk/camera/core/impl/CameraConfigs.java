package com.veriff.sdk.camera.core.impl;

import com.veriff.sdk.camera.core.impl.Config;
import com.veriff.sdk.camera.core.impl.UseCaseConfigFactory;
import fd0.C12681b;
import fd0.C12690k;
import java.util.Set;

public class CameraConfigs {
    private static final CameraConfig EMPTY_CONFIG = new EmptyCameraConfig();

    public static final class EmptyCameraConfig implements CameraConfig {
        private final Identifier mIdentifier = Identifier.create(new Object());
        private final UseCaseConfigFactory mUseCaseConfigFactory = new UseCaseConfigFactory(this) {
            public Config getConfig(UseCaseConfigFactory.CaptureType captureType) {
                return null;
            }
        };

        public final /* synthetic */ boolean containsOption(Config.Option option) {
            return C12690k.m32418a(this, option);
        }

        public final /* synthetic */ void findOptions(String str, Config.OptionMatcher optionMatcher) {
            C12690k.m32419b(this, str, optionMatcher);
        }

        public Identifier getCompatibilityId() {
            return this.mIdentifier;
        }

        public Config getConfig() {
            return OptionsBundle.emptyBundle();
        }

        public final /* synthetic */ Config.OptionPriority getOptionPriority(Config.Option option) {
            return C12690k.m32420c(this, option);
        }

        public final /* synthetic */ Set getPriorities(Config.Option option) {
            return C12690k.m32421d(this, option);
        }

        public final /* synthetic */ int getUseCaseCombinationRequiredRule() {
            return C12681b.m32404a(this);
        }

        public UseCaseConfigFactory getUseCaseConfigFactory() {
            return this.mUseCaseConfigFactory;
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

    public static CameraConfig emptyConfig() {
        return EMPTY_CONFIG;
    }
}
