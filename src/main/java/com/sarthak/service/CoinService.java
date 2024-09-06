package com.sarthak.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sarthak.model.Coin;

import java.io.IOException;
import java.util.List;


public interface CoinService {
    List<Coin> getCoinList(int page) throws Exception;

    String getMarketChart(String coinId,int days) throws Exception;

    String getCoinDetails(String coinId) throws IOException;

    Coin findById(String coinId) throws Exception;

    String searchCoin(String keyword);

    String getTop50CoinsByMarketCapRank();

    String getTreadingCoins();

}
