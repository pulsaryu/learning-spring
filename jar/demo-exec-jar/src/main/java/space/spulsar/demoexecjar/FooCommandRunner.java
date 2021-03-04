package space.spulsar.demoexecjar;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Order(1)
public class FooCommandRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("Foo");
    }
}
