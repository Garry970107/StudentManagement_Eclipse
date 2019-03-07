# StudentManagement_Eclipse
a simple Student management system using MVC model with development ducumentation
## 项目介绍
* 添加：添加学生信息，包括姓名，性别，手机号，生日，爱好，其他信息。
* 查询：查询数据库中所有的学生，查询结果将客户信息以列表形式展示，可以对列表中的客户信息进行更新及删除。
* 删除：对删除的学生对象从数据库中删除，并更新页面显示。
* 更新：对选中的学生对象信息更新，并更新页面显示。
* 模糊查询：对名字中带有关键字或性别的查询，检索出相关学生对象。
* 分页功能：分页显示所有学生对象的信息。

## 运用知识

* 数据库的就基本查询
* 数据库连接池c3p0
* JavaWeb三层架构&MVC模式

## 准备

1.导入第三方jar包以及c3p0配置文件

* c3p0-0.9.1.2.jar
* commons-dbutils-1.4.jar
* jstl.jar
* mysql-connector-java-5.1.7-bin.jar
* standard.jar


2.建包

* Dao
* Dao.impl
* Service
* Service.impl
* Domain
* Servlet
* Util

## 搭建环境
eclipse + Mysql

## 使用方法
1.git clone https://github.com/Garry970107/StudentManagement_Eclipse.git

2.使用IntelliJ IDEA导入打开 或者 使用eclipse打开StudentManagement_Eclipse项目

3.使用StudentManagement_Eclipse/stus.sql文件中的sql语句创建相应的数据库及表

4.修改StudentManagement/src下c3p0-config.xml中数据库相关信息

5.部署Tomcat并启动
