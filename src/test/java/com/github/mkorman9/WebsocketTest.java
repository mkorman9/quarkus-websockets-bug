package com.github.mkorman9;

import io.quarkus.test.common.http.TestHTTPResource;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.websocket.ClientEndpoint;
import jakarta.websocket.ContainerProvider;
import jakarta.websocket.DeploymentException;
import jakarta.websocket.Session;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;

@QuarkusTest
public class WebsocketTest {
    @TestHTTPResource("/ws")
    URI uri;

    @Test
    void test() {
        try (Session session =  ContainerProvider.getWebSocketContainer().connectToServer(Client.class, uri)) {
            // skip
        } catch (DeploymentException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    @ClientEndpoint
    private static class Client {
    }
}
