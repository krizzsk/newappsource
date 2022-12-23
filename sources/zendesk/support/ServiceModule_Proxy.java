package zendesk.support;

public final class ServiceModule_Proxy {
    private ServiceModule_Proxy() {
    }

    public static ServiceModule newInstance() {
        return new ServiceModule();
    }
}
