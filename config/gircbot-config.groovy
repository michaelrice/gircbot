irc {
    server {
        host = ""
        port = ""
        use_ssl = true
        bot_name = "mybot"
        bot_pass = "bot_password"
        rooms = ['#room1','#room2']
        auto_rejoin = true
    }
}

log4j {
    appender.stdout = "org.apache.log4j.ConsoleAppender"
    appender."stdout.layout"="org.apache.log4j.PatternLayout"
    rootLogger="error,stdout"
    logger.org.springframework="info,stdout"
    additivity.org.springframework=false
}