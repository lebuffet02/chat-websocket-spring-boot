package api.websocket.controller;

import api.websocket.domain.ChatInput;
import api.websocket.domain.ChatOutput;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class ChatController {

    @MessageMapping("/chat")
    @SendTo("/topics")
    public ChatOutput messages(ChatInput input) {
        return dadosUser(input);
    }

    private ChatOutput dadosUser(ChatInput input) {
        String usuario = input.user().isEmpty() ? "Desconhecido" : input.user().substring(0,1).toUpperCase().concat( input.user().substring(1).toLowerCase());
        return new ChatOutput(HtmlUtils.htmlEscape(usuario.concat(" : ").concat(input.message())));
    }
}