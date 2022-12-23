package p927xw;

import android.content.Context;
import com.airbnb.lottie.C1868g;
import com.moovit.app.animation.Animation;
import com.moovit.app.animation.AnimationPlayer;
import com.moovit.app.animation.LocalAnimation;
import com.moovit.app.taxi.providers.TaxiAnimationConfig;
import com.moovit.app.taxi.providers.TaxiProvider;
import com.moovit.app.taxi.providers.TaxiProvidersManager;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import java.io.IOException;
import java.util.HashSet;
import p646lz.C18299a;
import p929xy.C20664g;
import q00.C19047a;
import q00.C19053d;

/* renamed from: xw.b */
public final class C20633b extends C20664g<Boolean> {
    /* renamed from: b */
    public final HashSet mo20294b(Context context) {
        HashSet b = super.mo20294b(context);
        b.add("CONFIGURATION");
        b.add("TAXI_PROVIDERS_MANAGER");
        return b;
    }

    /* renamed from: f */
    public final Object mo6591f(Context context, C18299a aVar, String str) throws IOException, AppDataPartLoadFailedException, ServerException {
        C19047a aVar2 = (C19047a) aVar.mo50690c("CONFIGURATION");
        if (aVar2 == null || !((Boolean) aVar2.mo51505b(C19053d.f48449A)).booleanValue()) {
            return Boolean.FALSE;
        }
        AnimationPlayer animationPlayer = AnimationPlayer.f37589d;
        for (LocalAnimation animation : LocalAnimation.values()) {
            C1868g.m5248f(context, animationPlayer.mo44767b(animation.getAnimation()));
        }
        for (TaxiProvider taxiProvider : ((TaxiProvidersManager) aVar.mo50690c("TAXI_PROVIDERS_MANAGER")).f39985b) {
            TaxiAnimationConfig taxiAnimationConfig = taxiProvider.f39981p;
            if (taxiAnimationConfig != null) {
                AnimationPlayer animationPlayer2 = taxiAnimationConfig.f39921d;
                for (LocalAnimation animation2 : LocalAnimation.values()) {
                    C1868g.m5248f(context, animationPlayer2.mo44767b(animation2.getAnimation()));
                }
                for (Animation b : taxiAnimationConfig.f39920c) {
                    C1868g.m5248f(context, animationPlayer2.mo44767b(b));
                }
            }
        }
        return Boolean.TRUE;
    }
}
