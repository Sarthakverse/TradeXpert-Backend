package com.sarthak.service;


import com.sarthak.model.CoinDTO;
import com.sarthak.response.ApiResponse;

public interface ChatBotService {
    ApiResponse getCoinDetails(String coinName);

    CoinDTO getCoinByName(String coinName);

    String simpleChat(String prompt);
}
