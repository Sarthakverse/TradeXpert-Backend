package com.sarthak.repository;


import com.sarthak.model.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssetsRepository extends JpaRepository<Asset,Long> {
   public List<Asset> findByUserId(Long userId);

   Asset findByUserIdAndCoinId(Long userId, String coinId);

   Asset findByIdAndUserId(Long assetId, Long userId);

//   Optional<Assets> findByUserIdAndSymbolAndPortfolioId(Long userId,String symbol, Long portfolioId);
}
