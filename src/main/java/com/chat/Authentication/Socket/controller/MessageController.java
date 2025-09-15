package com.chat.Authentication.Socket.controller;

import com.chat.Authentication.Socket.entity.Message;
import com.chat.Authentication.Socket.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
@RequiredArgsConstructor
public class MessageController {
    private final MessageService messageService;

    @GetMapping("/{room}")
    public ResponseEntity<List<Message>> getMesssage(@PathVariable String room) {
        return ResponseEntity.ok(messageService.getMessage(room));
    }
}
