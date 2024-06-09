package com.github.mkorman9;

import io.quarkus.websockets.next.OnOpen;
import io.quarkus.websockets.next.WebSocketClient;

@WebSocketClient(path = "/ws")
public class WebsocketClient {
    @OnOpen
    public void onOpen() {}
}
