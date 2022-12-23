package zendesk.core;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.zendesk.logger.Logger;
import ge0.C23410c;
import p359ag.C13450g;

class GsonSerializer implements Serializer {
    private final Gson gson;

    public GsonSerializer(Gson gson2) {
        this.gson = gson2;
    }

    public <E> E deserialize(Object obj, Class<E> cls) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (!C23410c.m57533a(str)) {
                return null;
            }
            try {
                return this.gson.fromJson(str, cls);
            } catch (JsonSyntaxException unused) {
                Logger.m57302a("Unable to deserialize String into object of type %s", cls.getSimpleName());
                return null;
            }
        } else if (obj instanceof C13450g) {
            try {
                return this.gson.fromJson((C13450g) obj, cls);
            } catch (JsonSyntaxException e) {
                Logger.m57302a("Unable to deserialize JsonElement into object of type %s", cls.getSimpleName(), e);
                return null;
            }
        } else {
            Logger.m57302a("Unable to deserialize the provided object into %s", cls.getSimpleName());
            return null;
        }
    }

    public String serialize(Object obj) {
        return this.gson.toJson(obj);
    }
}
