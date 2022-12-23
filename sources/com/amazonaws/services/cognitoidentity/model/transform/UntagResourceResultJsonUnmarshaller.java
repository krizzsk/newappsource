package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.UntagResourceResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

public class UntagResourceResultJsonUnmarshaller implements Unmarshaller<UntagResourceResult, JsonUnmarshallerContext> {
    private static UntagResourceResultJsonUnmarshaller instance;

    public static UntagResourceResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new UntagResourceResultJsonUnmarshaller();
        }
        return instance;
    }

    public UntagResourceResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        return new UntagResourceResult();
    }
}
