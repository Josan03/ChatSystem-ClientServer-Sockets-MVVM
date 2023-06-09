module com.example.assignment3_chatsystem {
  requires javafx.controls;
  requires javafx.fxml;
  requires java.desktop;
  requires com.google.gson;

  opens chat.view to javafx.fxml;
  opens chat.model to com.google.gson;
  opens chat.client to com.google.gson;
  opens chat.server to com.google.gson;

  exports chat.model;
  exports chat.viewmodel;
  exports chat.view;
  exports chat.server;
  exports chat.client;
  exports chat.server.model;
  opens chat.server.model to com.google.gson;
  exports chat;
  opens chat to com.google.gson, javafx.fxml;
}