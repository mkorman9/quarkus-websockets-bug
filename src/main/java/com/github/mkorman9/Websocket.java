package com.github.mkorman9;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;

@ServerEndpoint("/ws")
@ApplicationScoped
public class Websocket {
    @OnOpen
    void onOpen(Session session) {
    }
}
