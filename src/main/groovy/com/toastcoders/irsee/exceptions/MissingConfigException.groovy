package com.toastcoders.irsee.exceptions

/**
 * Created with IntelliJ IDEA.
 * User: Michael Rice
 * Twitter: @errr_
 * Website: http://www.errr-online.com/
 * Github: https://github.com/michaelrice
 * Date: 2/22/14
 * Time: 2:12 PM
 * Licenses: MIT http://opensource.org/licenses/MIT
 */
class MissingConfigException extends Exception {
    MissingConfigException(String reason) {
        super(reason)
    }
}