package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.List;

public class UninitializedMessageException extends RuntimeException {
    private final List<String> missingFields = null;

    public UninitializedMessageException() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
