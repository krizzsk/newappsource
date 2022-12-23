package t10;

import android.content.Context;
import com.moovit.image.C16063o;
import com.moovit.network.model.ServerId;
import p622kz.C18163e;
import p906wz.C20431c;

/* renamed from: t10.a */
public final class C19625a extends C20431c<C19625a, C19626b> {
    public C19625a(Context context, ServerId serverId) {
        super(context, C16063o.server_path_cdn_server_url, C16063o.api_path_remote_image_request_path, false, C19626b.class);
        mo52627p(1, "protocolVersionId");
        mo52627p(serverId.f15142b, "imageId");
        mo52627p(context.getResources().getInteger(C18163e.screen_density_bucket), "densityStr");
    }
}
