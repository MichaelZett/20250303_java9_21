package de.zettsystems.virtualboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/httpbin")
public class HttpBinController {

    private static final Logger log = LoggerFactory.getLogger(HttpBinController.class);

    @GetMapping("/block/{seconds}")
    public String delay(@PathVariable int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        log.info("Slept {} on {}", seconds, Thread.currentThread());

        return Thread.currentThread().toString();
    }

}
