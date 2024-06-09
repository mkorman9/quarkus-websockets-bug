package com.github.mkorman9;

import io.quarkus.test.common.http.TestHTTPResource;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.websockets.next.WebSocketConnector;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.URI;

@QuarkusTest
public class WebsocketTest {
    @TestHTTPResource("/")
    URI uri;

    @Inject
    WebSocketConnector<WebsocketClient> connector;

    @Test
    void test() {
        var connection = connector.baseUri(uri).connectAndAwait();
        Assertions.assertTrue(connection.isOpen());
    }
}
