package cpm.web.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ExecuteWebController {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    public ExecuteWebController() {
        super();
    }

    protected String convertData() {
        LOGGER.info(this.getClass().getName());
        return this.getClass().getName();
    }
}
