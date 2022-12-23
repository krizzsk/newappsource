package zendesk.core;

public interface SessionStorage {
    void clear();

    BaseStorage getAdditionalSdkStorage();
}
