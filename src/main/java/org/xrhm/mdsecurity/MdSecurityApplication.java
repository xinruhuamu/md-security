package org.xrhm.mdsecurity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MdSecurityApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(MdSecurityApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MdSecurityApplication.class, args);
        LOGGER.info("========================================启动成功～======================================");
    }

}
