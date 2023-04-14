package com.dozo.mymicroservice;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {

    @Autowired
    RestTemplate restTemplate;

//    @Autowired
//    private EurekaClient eurekaClient;

    @Value("${api.walletURL}")
    private String walletURL;

    @Value("${api.cryptoCurrencyURL}")
    private String cryptoCurrencyURL;

    @GetMapping("/users/{walletId}")
    public ResponseEntity<UserDTO> getUser(@PathVariable int walletId) {
        try {
//            walletURL = eurekaClient.getNextServerFromEureka("wallet", false).getHomePageUrl();

//            cryptoCurrencyURL = eurekaClient.getNextServerFromEureka("cryptocurrencies", false).getHomePageUrl();

            WalletDTO wallet = restTemplate.getForObject(walletURL + "/wallets/" + walletId, WalletDTO.class);

            CryptoValueDTO cryptoValue = restTemplate.getForObject(cryptoCurrencyURL + "/crypto/" + wallet.getCoinId(), CryptoValueDTO.class);

            UserDTO user = new UserDTO(wallet.getId(), wallet.getUsername(), cryptoValue.getName(), wallet.getAmount(), wallet.getAmount() * cryptoValue.getValue());

            return ResponseEntity.ok(user);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(null);
        }
    }


}
