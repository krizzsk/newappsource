package p359ag;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.StringReader;
import p406cg.C13822k;

/* renamed from: ag.j */
public final class C13453j {
    /* renamed from: a */
    public static C13450g m33761a(JsonReader jsonReader) throws JsonIOException, JsonSyntaxException {
        boolean isLenient = jsonReader.isLenient();
        jsonReader.setLenient(true);
        try {
            C13450g a = C13822k.m34498a(jsonReader);
            jsonReader.setLenient(isLenient);
            return a;
        } catch (StackOverflowError e) {
            throw new JsonParseException("Failed parsing JSON source: " + jsonReader + " to Json", e);
        } catch (OutOfMemoryError e2) {
            throw new JsonParseException("Failed parsing JSON source: " + jsonReader + " to Json", e2);
        } catch (Throwable th) {
            jsonReader.setLenient(isLenient);
            throw th;
        }
    }

    /* renamed from: b */
    public static C13450g m33762b(String str) throws JsonSyntaxException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            C13450g a = m33761a(jsonReader);
            a.getClass();
            if (!(a instanceof C13451h)) {
                if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                    throw new JsonSyntaxException("Did not consume the entire document.");
                }
            }
            return a;
        } catch (MalformedJsonException e) {
            throw new JsonSyntaxException((Exception) e);
        } catch (IOException e2) {
            throw new JsonIOException((Exception) e2);
        } catch (NumberFormatException e3) {
            throw new JsonSyntaxException((Exception) e3);
        }
    }
}
