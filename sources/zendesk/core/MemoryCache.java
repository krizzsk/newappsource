package zendesk.core;

public interface MemoryCache {
    void clear();

    <T> T getOrDefault(String str, T t);

    void put(String str, Object obj);
}
