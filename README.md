# SGS Revolt Server
========================

## Project structure

> SmartFoxServer2X - `Smarfox server files, lib...`

>> src - `Souce code`

>>> main/java/com/sgs/game/sgsr/server - `Core source code`

>>>> dto - `Data transfer object folder`

>>>> dao - `Data access object folder`

>>>> extensions - `Extension folder`

>>>> handlers - `All handlers`

>>>>> evt - `Server event handlers`

>>>>> req - `Client request handlers`

>>>> utils - `Utilities helper functions`

>>>>> config - `Config helper`

>>>>> handlers - `Handler helper`

>>> test/java/com/sgs/game/sgsr/server - `Unit test`

> pom.xml - `POM file for maven config`

> README.md - `Readme file`

## Prerequisite

1. Install Java
2. 1. Install Maven
3. Install IDE (Eclipse, Netbean, Intellij...)

## Getting start

1. Clone this repository
2. Open terminal in the clone folder
3. Run `mvn clean install`
4. Import project into IDE

## Smartfox server local configuration

1. Install [smartfoxserver](http://docs2x.smartfoxserver.com/GettingStarted/installation)
2. Config zone database manager
 + Database driver class: `com.mysql.jdbc.Driver`
 + Database connection string: `jdbc:mysql://sgsr-dev-cluster.cluster-cjlftihtzlhd.ap-northeast-2.rds.amazonaws.com:3306/sgs_revolt_prototype?useSSL=false`
 + Username: `sgsrevolt`
 + Password: `Sgsr2306`
 + Test SQL: `SELECT version();`
