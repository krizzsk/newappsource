package javax.xml.stream;

public class FactoryConfigurationError extends Error {
    public Exception nested;

    public FactoryConfigurationError(String str, Exception exc) {
        super(str);
        this.nested = exc;
    }

    public final String getMessage() {
        Exception exc;
        String message = super.getMessage();
        if (message != null || (exc = this.nested) == null) {
            return message;
        }
        String message2 = exc.getMessage();
        if (message2 == null) {
            return this.nested.getClass().toString();
        }
        return message2;
    }
}
