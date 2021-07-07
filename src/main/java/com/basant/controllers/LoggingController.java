package com.basant.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LoggingController {
    private Log log = LogFactory.getLog(LoggingController.class);

    @GetMapping
    public String log() {
	if (log.isDebugEnabled()) {
	    log.debug("This is a DEBUG level message");
	}
	if (log.isErrorEnabled()) {
	    log.error("This is an ERROR level message");
	}
	if(log.isInfoEnabled()) {
	    log.info("This is an INFO level messaeg");
	}
	return "Updated log levels";
    }

}
