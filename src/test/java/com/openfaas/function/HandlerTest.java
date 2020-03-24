package com.openfaas.function;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HandlerTest extends Assertions {

    @Test
    void handlerIsNotNull() {
        Handler handler = new Handler();
        assertNotNull(handler, "Expected handler not to be null");
    }
}
