package flavia.dev.chatbot.service;

import flavia.dev.chatbot.response.ApiResponse;

public interface ChatbotService {

    ApiResponse getCoinDetails(String prompt) throws Exception;

    String simpleChat(String prompt);
}