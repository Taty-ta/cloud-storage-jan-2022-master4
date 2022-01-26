package com.geekbrains.cloud.client;

import java.io.IOException;

import com.geekbrains.cloud.model.AbstractMessage;

public interface Callback {

    void onMessageReceived(AbstractMessage message) throws IOException;

}
