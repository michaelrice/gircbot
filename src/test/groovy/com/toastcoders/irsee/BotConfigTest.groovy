package com.toastcoders.irsee

/**
 * Created with IntelliJ IDEA.
 * User: Michael Rice
 * Twitter: @errr_
 * Website: http://www.errr-online.com/
 * Github: https://github.com/michaelrice
 * Date: 2/22/14
 * Time: 1:48 PM
 * Licenses: MIT http://opensource.org/licenses/MIT
 */

class BotConfigTest extends GroovyTestCase {

    def botConfig

    @Override
    void setUp() {
        botConfig = new BotConfig().config
    }

    void testMissingConfig() {
        shouldFail {
            new BotConfig("this should fail")
        }
    }

    void testConfigRoomTypeForList() {
        if(botConfig?.irc?.server?.rooms) {
            assertEquals(ArrayList, botConfig.irc.server.rooms.getClass())
        }
        else {
            assertNull(botConfig.irc.server.rooms)
        }
    }

    void testConfig() {
        assertNotNull(botConfig)
    }

    void testBotNameNotNull() {
        assertNotNull(botConfig.irc.server.bot_name)
    }

    void testBotName() {
        assert "mybot" == botConfig.irc.server.bot_name
    }
}