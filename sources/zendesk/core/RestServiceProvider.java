package zendesk.core;

import hi0.C23566v;

public interface RestServiceProvider {
    <E> E createRestService(Class<E> cls, String str, String str2);

    <E> E createRestService(Class<E> cls, String str, String str2, CustomNetworkConfig customNetworkConfig);

    C23566v getMediaOkHttpClient();
}
