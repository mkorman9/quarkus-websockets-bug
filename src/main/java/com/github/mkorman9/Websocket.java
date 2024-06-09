package com.github.mkorman9;

import io.quarkus.websockets.next.OnOpen;
import io.quarkus.websockets.next.WebSocket;
import io.quarkus.websockets.next.WebSocketConnection;
import jakarta.inject.Inject;

@WebSocket(path = "/ws")
public class Websocket {
    @Inject
    WebSocketConnection connection;

    @OnOpen
    void onOpen() {
    }
}
