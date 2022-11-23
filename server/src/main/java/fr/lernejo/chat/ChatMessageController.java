package fr.lernejo.chat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChatMessageController {
    private ChatMessageRepository chatMessageRepository;

    // Constructor
    public ChatMessageController(ChatMessageRepository chatMessageRepository) {
        this.chatMessageRepository = chatMessageRepository;
    }

    @GetMapping("/api/message")
    public List<String> getLastTenMessages() {
        return chatMessageRepository.getLastTenMessages();
    }
}
