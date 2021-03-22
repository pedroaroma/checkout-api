package com.hatanaka.ecommerce.checkout.resource.checkout;

import com.hatanaka.ecommerce.checkout.service.CheckoutService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/checkout")
@RequiredArgsConstructor
public class CheckoutResource {

    private final CheckoutService checkoutService;

    @PostMapping("/")
    public ResponseEntity<Void> create(@RequestBody CheckoutRequest checkoutRequest) {


        checkoutService.create(checkoutRequest);

        return ResponseEntity.ok().build();
    }

    @GetMapping("/")
    public ResponseEntity<Void> hello(CheckoutRequest checkoutRequest) {
        System.out.println("Bati no get");
        return ResponseEntity.ok().build();
    }

}
