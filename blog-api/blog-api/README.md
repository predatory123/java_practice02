# 框架说明
blog系统采用了：  
SpringBoot + Mysql + Mybatis Plus + React 框架  
采用了通用的前后端分离方案，由于是一个练手项目，后续继续完善

## 环境配置要求
1. Idea + Maven 安装和配置
2. Mysql 和 MysqlWorkBranch 本地数据库安装和图形化界面安装
3. Mybatis 安装
4. VsCode 安装
  （加速下载）https://www.cnblogs.com/xiao1314/p/14551009.html

## 系统配置
### 1. maven中setting.xml 文件配置
（集团通用设置）
```xml
<?xml version="1.0"?>

<settings>
	<localRepository>/Users/${xxxx}/.m2/repository</localRepository>
    <servers>
        <server>
            <id>snapshots</id>
            <username>snapshotsAdmin</username>
            <password>123456</password>
        </server>
        <server>
            <id>releases</id>
            <username>admin</username>
            <password>screct</password>
        </server>
    </servers>

    <!-- ======================================================================== -->
    <!--  mirror settings                                                         -->
    <!-- ======================================================================== -->
    <mirrors>
        <mirror>
            <id>tbmirror-all</id>
            <mirrorOf>*</mirrorOf>
            <name>taobao mirror</name>
            <url>http://mvnrepo.alibaba-inc.com/mvn/repository</url>
        </mirror>
    </mirrors>

        <profiles>
                <profile>
                        <id>nexus</id>
                        <repositories>
                                <repository>
                                        <id>central</id>
                                        <url>http://mvnrepo.alibaba-inc.com/mvn/repository</url>
                                </repository>
                        </repositories>
                        <pluginRepositories>
                                <pluginRepository>
                                        <id>central</id>
                                        <url>http://mvnrepo.alibaba-inc.com/mvn/repository</url>
                                </pluginRepository>
                        </pluginRepositories>
                </profile>
        </profiles>

        <pluginGroups>
                         <pluginGroup>com.alibaba.org.apache.maven.plugins</pluginGroup>
                         <pluginGroup>com.alibaba.maven.plugins</pluginGroup>
        </pluginGroups>

    <activeProfiles>
        <activeProfile>nexus</activeProfile>
    </activeProfiles>
</settings>
```
### 2.数据库配置
  详见 resources 中 test.sql

### 3.前端项目启动
#### step1: git clone 前端代码
http://gitlab.alibaba-inc.com/wb-wyj741335/h5-blog.git

#### step2: 项目基础配置
安装 npm 和 vscode插件并下载依赖文件  
npm install

#### step3: 项目启动
npm start