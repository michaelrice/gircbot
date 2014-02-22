package com.toastcoders.irsee

import com.toastcoders.irsee.exceptions.MissingConfigException
import groovy.util.logging.*

/**
 * Created with IntelliJ IDEA.
 * User: Michael Rice
 * Twitter: @errr_
 * Website: http://www.errr-online.com/
 * Github: https://github.com/michaelrice
 * Date: 2/22/14
 * Time: 12:46 PM
 * Licenses: MIT http://opensource.org/licenses/MIT
 */
@Log4j
class BotConfig {

    private configFile = "config/gircbot-config.groovy"
    def config
    private List requiredKeys = [
            "bot_name",
            "host",

    ]

    public BotConfig() {
        parse()
    }

    public BotConfig(String file) {
        configFile = file
        parse()
    }

    private void parse() {
        try{
            config = new ConfigSlurper().parse(new File(configFile).toURI().toURL())
        }
        catch (FileNotFoundException fnfe) {
            throw new MissingConfigException("Missing configuration file")
        }
    }
}