
# **TradeXpert - CryptoTradingPlatform**

A cryptocurrency trading platform allows users to buy, sell, and trade digital currencies like Bitcoin and Ethereum. Cryptocurrencies are decentralized digital assets that use blockchain technology for secure and transparent transactions without the need for banks or intermediaries.

So, I developed a full-stack crypto trading platform that allows users to trade cryptocurrencies seamlessly with `**real-time market data**`. I integrated the`**CoinGecko API**` to provide live price updates and market trends, while `**Razorpay**` and `**Stripe**`payment gateways are used for secure and efficient payment processing. The platform includes `**JWT-based authentication**` for enhanced security, allowing users to manage their accounts safely. I also integrated the `**Gemini API to build a chatbot**` that assists users with quick information and trading queries. The backend is built using `**Spring Boot**`, and the frontend with `**React.js**`, providing a smooth, responsive experience for executing trades, managing portfolios, and handling payments.

# *Technology*

- SpringBoot
- Java 17
- React js
- javascript
- Tailwind css

# *Features*

- `AI chatbot`
- `RazorPay`
- `Stripe`
- `Real time data ( Coingecko API )`
- `Spring security ( JWT )`
- `wishlist`
- `wallet`
- `portfolio`
- `profile`
- `2 step verification`
- `money transfer`
- `transaction history`
- `Activity`
- `withdrawal`
- `logout`
- `Otp service`
- `real time graph`
- `Buy and sell`

# *Screenshots*

![image](https://github.com/user-attachments/assets/5184d299-2b5b-4917-b28f-189ba5ec34c5)
![image](https://github.com/user-attachments/assets/35c3c859-03ef-46e8-892f-11433cd79031)
![image](https://github.com/user-attachments/assets/980bf1f9-34fe-4c15-8bf6-ac3b6c1068cd)
![image](https://github.com/user-attachments/assets/d7c8b567-b8aa-4a25-b6c7-cdc6e3242610)
![image](https://github.com/user-attachments/assets/315957b5-fa7c-4136-9499-545a32b42b18)
![image](https://github.com/user-attachments/assets/2b2e8160-a867-4286-8bf4-4e4779716b26)
![image](https://github.com/user-attachments/assets/c687c9eb-3194-4e27-9255-d9758f80d2bd)
![image](https://github.com/user-attachments/assets/f80cb8a1-d7ad-41b5-88a5-53718b14bd8e)
![image](https://github.com/user-attachments/assets/889bcdde-5741-4e30-8231-4ea5ef39b4a2)
![image](https://github.com/user-attachments/assets/92a5400a-ae6c-4df8-9aa9-72b81a91c5af)
![image](https://github.com/user-attachments/assets/d8aa246d-971a-429f-8e3f-cd893f383aa6)
![image](https://github.com/user-attachments/assets/e77699f0-8e1f-4a4e-bebd-2126b670209a)
![image](https://github.com/user-attachments/assets/6f07875b-770d-4f06-99d6-3573792fd9c5)
![image](https://github.com/user-attachments/assets/78a68a37-b8e5-4a65-b0ac-1a686d964c51)













# *Entities*

```
+---------------------+           +-----------------+
|       Users         |<--------->|    Wallets      |
|---------------------|           +-----------------+
| id                  |               ^            
| fullName            |               |
| email               |               |         
| ...                 |               |
+---------------------+               |
                                      |
+--------------------+            +-----------------+
|      Assets        |<---------->| WalletTransactions |
|--------------------|            +-----------------+
| id                 |
| quantity           |
| buy_price          |<---------->+-----------------+
| coin_id            |            |  Coins         |
| user_id            |            +-----------------+
+--------------------+            | id              |
                                  | symbol          |
+--------------------+            | ...             |
| Withdrawals        |<---------->+-----------------+
|--------------------|
| id                 |
| status             |
| amount             |
| user_id            |
| date               |
+--------------------+

+--------------------+
| Watchlists         |
|--------------------+
| id                 |
| user_id            |
+--------------------+
          |
          |
          v
+--------------------+
| Watchlist_Coins    |
|--------------------+
| watchlist_id       |
| coin_id            |
+--------------------+

+---------------------+           +---------------------+
|   VerificationCodes |<--------->|        Users        |
|---------------------|           +---------------------+
| id                  |
| otp                 |
| user_id             |
| email               |
| mobile              |
| verification_type   |
+---------------------+

+---------------------+           +---------------------+
|  TradingHistories   |<--------->|        Users        |
|---------------------|           +---------------------+
| id                  |
| selling_price       |
| buying_price        |
| coin_id             |
| user_id             |
+---------------------+

+---------------------+           +---------------------+
|    PaymentOrders    |<--------->|        Users        |
|---------------------|           +---------------------+
| id                  |
| amount              |
| status              |
| payment_method      |
| user_id             |
+---------------------+

+---------------------+           +---------------------+
|   PaymentDetails    |<--------->|        Users        |
|---------------------|           +---------------------+
| id                  |
| account_number      |
| account_holder_name |
| ifsc                |
| bank_name           |
| user_id             |
+---------------------+

+---------------------+           +---------------------+
|        Orders       |<--------->|        Users        |
|---------------------|           +---------------------+
| id                  |
| user_id             |
| order_type          |
| price               |
| timestamp           |
| status              |
| order_item_id       |
+---------------------+
          |
          |
          v
+---------------------+           +---------------------+
|      OrderItems     |<--------->|        Coins        |
|---------------------|           +---------------------+
| id                  |
| quantity            |
| coin_id             |
| buy_price           |
| sell_price          |
| order_id            |
+---------------------+

+---------------------+             +---------------------+
|    Notifications    | <---------> |        Users        |
|---------------------|             +---------------------+
| id                  |
| from_user_id        |
| to_user_id          |
| amount              |
| message             |
+---------------------+

+---------------------+           
|   MarketChartData   |
|---------------------|
| id                  |
| timestamp           |
| price               |
+---------------------+

+---------------------+           +---------------------+
| ForgotPasswordTokens|<--------->|        Users        |
|---------------------|           +---------------------+
| id                  |
| user_id             |
| otp                 |
| verification_type   |
| send_to             |
+---------------------+

```

# Database Tables

## Users Table

| Field                   | Type    |
|-------------------------|---------|
| id                      | bigint  |
| fullName                | varchar |
| email                   | varchar |
| mobile                  | varchar |
| password                | varchar |
| status                  | varchar |
| isVerified              | boolean |
| twoFactorAuth_enabled   | boolean |
| twoFactorAuth_sendTo    | varchar |
| picture                 | varchar |
| role                    | varchar |

## Coins Table

| Field                   | Type    |
|-------------------------|---------|
| id                      | varchar |
| symbol                  | varchar |
| name                    | varchar |
| image                   | varchar |
| current_price           | double  |
| market_cap              | bigint  |
| market_cap_rank         | int     |
| fully_diluted_valuation | bigint  |
| total_volume            | bigint  |
| high_24h                | double  |
| low_24h                 | double  |
| price_change_24h        | double  |
| price_change_percentage_24h | double  |
| market_cap_change_24h   | bigint  |
| market_cap_change_percentage_24h | double  |
| circulating_supply      | bigint  |
| total_supply            | bigint  |
| max_supply              | bigint  |
| ath                     | double  |
| ath_change_percentage   | double  |
| ath_date                | datetime|
| atl                     | double  |
| atl_change_percentage   | double  |
| atl_date                | datetime|
| roi                     | varchar |
| last_updated            | datetime|

## Assets Table

| Field     | Type    |
|-----------|---------|
| id        | bigint  |
| quantity  | double  |
| buy_price | double  |
| coin_id   | varchar |
| user_id   | bigint  |

## Withdrawals Table

| Field  | Type    |
|--------|---------|
| id     | bigint  |
| status | varchar |
| amount | bigint  |
| user_id| bigint  |
| date   | datetime|

## Watchlists Table

| Field   | Type    |
|---------|---------|
| id      | bigint  |
| user_id | bigint  |

## Watchlist_Coins Table

| Field         | Type    |
|---------------|---------|
| watchlist_id  | bigint  |
| coin_id       | varchar |

## WalletTransactions Table

| Field       | Type    |
|-------------|---------|
| id          | bigint  |
| wallet_id   | bigint  |
| type        | varchar |
| date        | datetime|
| transfer_id | varchar |
| purpose     | varchar |
| amount      | bigint  |

## Wallets Table

| Field   | Type      |
|---------|-----------|
| id      | bigint    |
| user_id | bigint    |
| balance | decimal   |

## VerificationCodes Table

| Field             | Type    |
|-------------------|---------|
| id                | bigint  |
| otp               | varchar |
| user_id           | bigint  |
| email             | varchar |
| mobile            | varchar |
| verification_type | varchar |

## TradingHistories Table

| Field         | Type    |
|---------------|---------|
| id            | bigint  |
| selling_price | double  |
| buying_price  | double  |
| coin_id       | varchar |
| user_id       | bigint  |

## PaymentOrders Table

| Field         | Type    |
|---------------|---------|
| id            | bigint  |
| amount        | bigint  |
| status        | varchar |
| payment_method| varchar |
| user_id       | bigint  |

## PaymentDetails Table

| Field               | Type    |
|---------------------|---------|
| id                  | bigint  |
| account_number      | varchar |
| account_holder_name | varchar |
| ifsc                | varchar |
| bank_name           | varchar |
| user_id             | bigint  |

## Orders Table

| Field        | Type      |
|--------------|-----------|
| id           | bigint    |
| user_id      | bigint    |
| order_type   | varchar   |
| price        | decimal   |
| timestamp    | datetime  |
| status       | varchar   |
| order_item_id| bigint    |

## OrderItems Table

| Field        | Type    |
|--------------|---------|
| id           | bigint  |
| quantity     | double  |
| coin_id      | varchar |
| buy_price    | double  |
| sell_price   | double  |
| order_id     | bigint  |

## Notifications Table

| Field        | Type    |
|--------------|---------|
| id           | bigint  |
| from_user_id | bigint  |
| to_user_id   | bigint  |
| amount       | bigint  |
| message      | varchar |

## MarketChartData Table

| Field        | Type    |
|--------------|---------|
| id           | bigint  |
| timestamp    | datetime|
| price        | double  |

## ForgotPasswordTokens Table

| Field             | Type    |
|-------------------|---------|
| id                | varchar |
| user_id           | bigint  |
| otp               | varchar |
| verification_type | varchar |
| send_to           | varchar |


 

